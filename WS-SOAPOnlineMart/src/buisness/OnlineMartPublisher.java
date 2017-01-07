package buisness;

import javax.xml.ws.Endpoint;

import webservices.ProductCatalog;

public class OnlineMartPublisher {
public static void main(String args[]){
//	Address:A URl where I want to publish my web service
//Implementor: Instance of a class in which the web services are implemented	
	Endpoint.publish("http://localhost:1234/productcatalog", new ProductCatalog());
}
}


/*After publishing it, Any one can use this service by using wsdl which is provided when the user clicks on it.
Internally in Java JDK, the publishing is done by reference implementation--Metro which is bundled in it.
Published by JAX-WS RI at http://jax-ws.dev.java.net RI. 
RI version is Metro/2.3 
Its a single threaded model when running using jdk. But, its multithreaded model when publishing using glassfish app server
*/ 