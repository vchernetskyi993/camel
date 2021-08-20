/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.huaweicloud.dms;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class DMSEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        DMSEndpoint target = (DMSEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "authenticationkey":
        case "authenticationKey": target.setAuthenticationKey(property(camelContext, java.lang.String.class, value)); return true;
        case "endpoint": target.setEndpoint(property(camelContext, java.lang.String.class, value)); return true;
        case "engine": target.setEngine(property(camelContext, java.lang.String.class, value)); return true;
        case "ignoresslverification":
        case "ignoreSslVerification": target.setIgnoreSslVerification(property(camelContext, boolean.class, value)); return true;
        case "instanceid":
        case "instanceId": target.setInstanceId(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "projectid":
        case "projectId": target.setProjectId(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyhost":
        case "proxyHost": target.setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxypassword":
        case "proxyPassword": target.setProxyPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport":
        case "proxyPort": target.setProxyPort(property(camelContext, int.class, value)); return true;
        case "proxyuser":
        case "proxyUser": target.setProxyUser(property(camelContext, java.lang.String.class, value)); return true;
        case "region": target.setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "secretkey":
        case "secretKey": target.setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        case "servicekeys":
        case "serviceKeys": target.setServiceKeys(property(camelContext, org.apache.camel.component.huaweicloud.common.models.ServiceKeys.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "authenticationkey":
        case "authenticationKey": return java.lang.String.class;
        case "endpoint": return java.lang.String.class;
        case "engine": return java.lang.String.class;
        case "ignoresslverification":
        case "ignoreSslVerification": return boolean.class;
        case "instanceid":
        case "instanceId": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "projectid":
        case "projectId": return java.lang.String.class;
        case "proxyhost":
        case "proxyHost": return java.lang.String.class;
        case "proxypassword":
        case "proxyPassword": return java.lang.String.class;
        case "proxyport":
        case "proxyPort": return int.class;
        case "proxyuser":
        case "proxyUser": return java.lang.String.class;
        case "region": return java.lang.String.class;
        case "secretkey":
        case "secretKey": return java.lang.String.class;
        case "servicekeys":
        case "serviceKeys": return org.apache.camel.component.huaweicloud.common.models.ServiceKeys.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        DMSEndpoint target = (DMSEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "authenticationkey":
        case "authenticationKey": return target.getAuthenticationKey();
        case "endpoint": return target.getEndpoint();
        case "engine": return target.getEngine();
        case "ignoresslverification":
        case "ignoreSslVerification": return target.isIgnoreSslVerification();
        case "instanceid":
        case "instanceId": return target.getInstanceId();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "projectid":
        case "projectId": return target.getProjectId();
        case "proxyhost":
        case "proxyHost": return target.getProxyHost();
        case "proxypassword":
        case "proxyPassword": return target.getProxyPassword();
        case "proxyport":
        case "proxyPort": return target.getProxyPort();
        case "proxyuser":
        case "proxyUser": return target.getProxyUser();
        case "region": return target.getRegion();
        case "secretkey":
        case "secretKey": return target.getSecretKey();
        case "servicekeys":
        case "serviceKeys": return target.getServiceKeys();
        default: return null;
        }
    }
}

