/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.huaweicloud.iam;

import com.huaweicloud.sdk.iam.v3.model.UpdateUserOption;
import org.apache.camel.BindToRegistry;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UpdateUserTest extends CamelTestSupport {
    private static final Logger LOG = LoggerFactory.getLogger(UpdateUserTest.class.getName());

    TestConfiguration testConfiguration = new TestConfiguration();

    @BindToRegistry("iamClient")
    IAMMockClient mockClient = new IAMMockClient(null);

    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("direct:update_user")
                        .to("hwcloud-iam:updateUser?" +
                            "authenticationKey=" + testConfiguration.getProperty("authenticationKey") +
                            "&secretKey=" + testConfiguration.getProperty("secretKey") +
                            "&region=" + testConfiguration.getProperty("region") +
                            "&userId=" + testConfiguration.getProperty("userId") +
                            "&ignoreSslVerification=true" +
                            "&iamClient=#iamClient")
                        .log("update user successful")
                        .to("mock:update_user_result");
            }
        };
    }

    @Test
    public void testUpdateUser() throws Exception {
        MockEndpoint mock = getMockEndpoint("mock:update_user_result");
        mock.expectedMinimumMessageCount(1);
        UpdateUserOption userOption = new UpdateUserOption()
                .withName("User 19")
                .withDescription("First");
        template.sendBody("direct:update_user", userOption);
        Exchange responseExchange = mock.getExchanges().get(0);

        mock.assertIsSatisfied();

        assertEquals("{\"description\":\"First\",\"name\":\"User 19\"}",
                responseExchange.getIn().getBody(String.class));
    }
}