package webservices;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import model.Product;
/*name:Changing the name of the service name
namespace is the package
service name: it is the url for requesting 
 */
@WebService(name="OnlineMartCatalog",targetNamespace="http://www.onlinemart.com")
public interface ProductCatalogInterface {

	//we can exclude a web method from being published as a web service
	//@WebMethod(exclude=true)
	List<String> getProductCategories();

	//	We can change the operation names to be displayed in wsdl by operationName
	@WebMethod(action="fetchingcategories",operationName="fetchCategories")
	List<String> getProducts(String category);

	/*	This annotation is optional. As @WebService assumes that every public method in that class needs to be an operation.
	And exposes them as web services
	 */

	boolean addProduct(String category, String product);
	@WebMethod
	List<Product> getProductsV2(String category);

}
//As all these annotations in the class is messy. hence, i have refractored those methods to an external interface and annotated them here
//which is same before