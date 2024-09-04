package secure.com;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import javax.xml.namespace.QName;

import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceFeature;

/**
 * Manage hosts
 *
 * This class was generated by Apache CXF 4.0.5
 * 2024-09-04T15:09:06.639+01:00
 * Generated source version: 4.0.5
 *
 */
@WebServiceClient(name = "FulfillmentService",
                  wsdlLocation = "file:sample.wsdl",
                  targetNamespace = "urn:com.flexnet.lfs.webservice")
public class FulfillmentService extends Service {

    public static final URL WSDL_LOCATION;

    public static final QName SERVICE = new QName("urn:com.flexnet.lfs.webservice", "FulfillmentService");
    public static final QName FulfillmentService = new QName("urn:com.flexnet.lfs.webservice", "FulfillmentService");
    static {
        URL url = null;
        try {
            url = URI.create("file:sample.wsdl").toURL();
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(FulfillmentService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:sample.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public FulfillmentService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public FulfillmentService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public FulfillmentService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public FulfillmentService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public FulfillmentService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public FulfillmentService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns FulfillmentServiceInterface
     */
    @WebEndpoint(name = "FulfillmentService")
    public FulfillmentServiceInterface getFulfillmentService() {
        return super.getPort(FulfillmentService, FulfillmentServiceInterface.class);
    }

    /**
     *
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns FulfillmentServiceInterface
     */
    @WebEndpoint(name = "FulfillmentService")
    public FulfillmentServiceInterface getFulfillmentService(WebServiceFeature... features) {
        return super.getPort(FulfillmentService, FulfillmentServiceInterface.class, features);
    }

}
