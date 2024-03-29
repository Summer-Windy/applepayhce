
package com.content.hce;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "unionPay_response", targetNamespace = "http://www.artery.org/projects/NBUnionPayHce/unionPay_response_unit", wsdlLocation = "file:/C:/applepay/simulate/applePaySimulate/service/src/main/java/com/content/hce/hce.wsdl")
public class UnionPayResponse
    extends Service
{

    private final static URL UNIONPAYRESPONSE_WSDL_LOCATION;
    private final static WebServiceException UNIONPAYRESPONSE_EXCEPTION;
    private final static QName UNIONPAYRESPONSE_QNAME = new QName("http://www.artery.org/projects/NBUnionPayHce/unionPay_response_unit", "unionPay_response");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/applepay/simulate/applePaySimulate/service/src/main/java/com/content/hce/hce.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        UNIONPAYRESPONSE_WSDL_LOCATION = url;
        UNIONPAYRESPONSE_EXCEPTION = e;
    }

    public UnionPayResponse() {
        super(__getWsdlLocation(), UNIONPAYRESPONSE_QNAME);
    }

    public UnionPayResponse(WebServiceFeature... features) {
        super(__getWsdlLocation(), UNIONPAYRESPONSE_QNAME, features);
    }

    public UnionPayResponse(URL wsdlLocation) {
        super(wsdlLocation, UNIONPAYRESPONSE_QNAME);
    }

    public UnionPayResponse(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, UNIONPAYRESPONSE_QNAME, features);
    }

    public UnionPayResponse(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UnionPayResponse(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns UnionPayHce
     */
    @WebEndpoint(name = "unionPay")
    public UnionPayHce getUnionPay() {
        return super.getPort(new QName("http://www.artery.org/projects/NBUnionPayHce/unionPay_response_unit", "unionPay"), UnionPayHce.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UnionPayHce
     */
    @WebEndpoint(name = "unionPay")
    public UnionPayHce getUnionPay(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.artery.org/projects/NBUnionPayHce/unionPay_response_unit", "unionPay"), UnionPayHce.class, features);
    }

    private static URL __getWsdlLocation() {
        if (UNIONPAYRESPONSE_EXCEPTION!= null) {
            throw UNIONPAYRESPONSE_EXCEPTION;
        }
        return UNIONPAYRESPONSE_WSDL_LOCATION;
    }

}
