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
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Process payments using Braintree Payments.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface BraintreeEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Braintree component.
     */
    public interface BraintreeEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedBraintreeEndpointBuilder advanced() {
            return (AdvancedBraintreeEndpointBuilder) this;
        }
        /**
         * The environment Either SANDBOX or PRODUCTION.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default BraintreeEndpointBuilder environment(String environment) {
            doSetProperty("environment", environment);
            return this;
        }
        /**
         * Sets the name of a parameter to be passed in the exchange In Body.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default BraintreeEndpointBuilder inBody(String inBody) {
            doSetProperty("inBody", inBody);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default BraintreeEndpointBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default BraintreeEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The merchant id provided by Braintree.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default BraintreeEndpointBuilder merchantId(String merchantId) {
            doSetProperty("merchantId", merchantId);
            return this;
        }
        /**
         * Set logging level for http calls, see java.util.logging.Level.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: logging
         */
        default BraintreeEndpointBuilder httpLogLevel(String httpLogLevel) {
            doSetProperty("httpLogLevel", httpLogLevel);
            return this;
        }
        /**
         * Set log category to use to log http calls.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: Braintree
         * Group: logging
         */
        default BraintreeEndpointBuilder httpLogName(String httpLogName) {
            doSetProperty("httpLogName", httpLogName);
            return this;
        }
        /**
         * Sets whether to enable the BraintreeLogHandler. It may be desirable
         * to set this to 'false' where an existing JUL - SLF4J logger bridge is
         * on the classpath. This option can also be configured globally on the
         * BraintreeComponent.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: logging
         */
        default BraintreeEndpointBuilder logHandlerEnabled(
                boolean logHandlerEnabled) {
            doSetProperty("logHandlerEnabled", logHandlerEnabled);
            return this;
        }
        /**
         * Sets whether to enable the BraintreeLogHandler. It may be desirable
         * to set this to 'false' where an existing JUL - SLF4J logger bridge is
         * on the classpath. This option can also be configured globally on the
         * BraintreeComponent.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: true
         * Group: logging
         */
        default BraintreeEndpointBuilder logHandlerEnabled(
                String logHandlerEnabled) {
            doSetProperty("logHandlerEnabled", logHandlerEnabled);
            return this;
        }
        /**
         * The proxy host.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: proxy
         */
        default BraintreeEndpointBuilder proxyHost(String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * The proxy port.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: proxy
         */
        default BraintreeEndpointBuilder proxyPort(Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * The proxy port.
         * 
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * 
         * Group: proxy
         */
        default BraintreeEndpointBuilder proxyPort(String proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * The access token granted by a merchant to another in order to process
         * transactions on their behalf. Used in place of environment, merchant
         * id, public key and private key fields.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default BraintreeEndpointBuilder accessToken(String accessToken) {
            doSetProperty("accessToken", accessToken);
            return this;
        }
        /**
         * The private key provided by Braintree.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default BraintreeEndpointBuilder privateKey(String privateKey) {
            doSetProperty("privateKey", privateKey);
            return this;
        }
        /**
         * The public key provided by Braintree.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default BraintreeEndpointBuilder publicKey(String publicKey) {
            doSetProperty("publicKey", publicKey);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Braintree component.
     */
    public interface AdvancedBraintreeEndpointBuilder
            extends
                EndpointProducerBuilder {
        default BraintreeEndpointBuilder basic() {
            return (BraintreeEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedBraintreeEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedBraintreeEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Set read timeout for http calls.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: advanced
         */
        default AdvancedBraintreeEndpointBuilder httpReadTimeout(
                Integer httpReadTimeout) {
            doSetProperty("httpReadTimeout", httpReadTimeout);
            return this;
        }
        /**
         * Set read timeout for http calls.
         * 
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * 
         * Group: advanced
         */
        default AdvancedBraintreeEndpointBuilder httpReadTimeout(
                String httpReadTimeout) {
            doSetProperty("httpReadTimeout", httpReadTimeout);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedBraintreeEndpointBuilder synchronous(boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedBraintreeEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    public interface BraintreeBuilders {
        /**
         * Braintree (camel-braintree)
         * Process payments using Braintree Payments.
         * 
         * Category: cloud,payment
         * Since: 2.17
         * Maven coordinates: org.apache.camel:camel-braintree
         * 
         * Syntax: <code>braintree:apiName/methodName</code>
         * 
         * Path parameter: apiName (required)
         * What kind of operation to perform
         * There are 17 enums and the value can be one of: ADD_ON, ADDRESS,
         * CLIENT_TOKEN, CREDIT_CARD_VERIFICATION, CUSTOMER, DISCOUNT, DISPUTE,
         * DOCUMENT_UPLOAD, MERCHANT_ACCOUNT, PAYMENT_METHOD,
         * PAYMENT_METHOD_NONCE, PLAN, REPORT, SETTLEMENT_BATCH_SUMMARY,
         * SUBSCRIPTION, TRANSACTION, WEBHOOK_NOTIFICATION
         * 
         * Path parameter: methodName
         * What sub operation to use for the selected operation
         * 
         * @param path apiName/methodName
         */
        default BraintreeEndpointBuilder braintree(String path) {
            return BraintreeEndpointBuilderFactory.endpointBuilder("braintree", path);
        }
        /**
         * Braintree (camel-braintree)
         * Process payments using Braintree Payments.
         * 
         * Category: cloud,payment
         * Since: 2.17
         * Maven coordinates: org.apache.camel:camel-braintree
         * 
         * Syntax: <code>braintree:apiName/methodName</code>
         * 
         * Path parameter: apiName (required)
         * What kind of operation to perform
         * There are 17 enums and the value can be one of: ADD_ON, ADDRESS,
         * CLIENT_TOKEN, CREDIT_CARD_VERIFICATION, CUSTOMER, DISCOUNT, DISPUTE,
         * DOCUMENT_UPLOAD, MERCHANT_ACCOUNT, PAYMENT_METHOD,
         * PAYMENT_METHOD_NONCE, PLAN, REPORT, SETTLEMENT_BATCH_SUMMARY,
         * SUBSCRIPTION, TRANSACTION, WEBHOOK_NOTIFICATION
         * 
         * Path parameter: methodName
         * What sub operation to use for the selected operation
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path apiName/methodName
         */
        default BraintreeEndpointBuilder braintree(
                String componentName,
                String path) {
            return BraintreeEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static BraintreeEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class BraintreeEndpointBuilderImpl extends AbstractEndpointBuilder implements BraintreeEndpointBuilder, AdvancedBraintreeEndpointBuilder {
            public BraintreeEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new BraintreeEndpointBuilderImpl(path);
    }
}