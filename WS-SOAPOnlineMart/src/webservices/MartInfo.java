package webservices;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import buisness.InvalidInputException;

@WebService
@SOAPBinding(style=Style.RPC)
//When RPC is used, No separate schema generates for types
//changes the style from document which is default to RPC(This eliminates the type element completely from the wsdl
public class MartInfo {
	@WebMethod()
	@WebResult(partName="lookUpOutput")
	public String getMartInfo(@WebParam(partName="lookUpInput") String requestInfo) throws InvalidInputException{
		String response="invalid request";
		if("shopName".equals("requestInfo"))
			response="Online mart";
		else if("since".equals(requestInfo))
			response="since 2011";
		else
		{
			//			This thing is going to be displayed as a fault message tag in wsdl
			throw new InvalidInputException("Invalid Inout",requestInfo+"is not valid input");
		}
		return response;

	}
}
/*to increase the readability
WebResult is for changing the input <part name="lookUpOutput" and 
WebParam is for changing the output <partname="lookUpInput"	
Style.DOCUMENT is the recommended style type because it gives us a separate XSD document which can be validated
As the SOAP req and SOAP res will be validated against this schema
 */ 