package webservices;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;

import buisness.ProductServiceImpl;
import model.Product;
//this should be only annotation we should be placed in the impl class. everything else could be in interface
@WebService(endpointInterface="webservices.ProductCatalogInterface", portName="OnlineTestMartPort",
serviceName="OnlineMartCatalogService")
public class ProductCatalog implements ProductCatalogInterface 
{

	ProductServiceImpl productService=new ProductServiceImpl();
	public List<String> getProductCategories(){
		return productService.getProductCategories();

	}

	public List<String> getProducts(String category){
		return productService.getProducts(category);
	}
	public boolean addProduct(String category,String product){
		productService.addProduct(category, product);
		return true;
	}
	@WebMethod
	@XmlElement(name="ProductV2")
	public List<Product> getProductsV2(String category){
		return productService.getProductsV2(category);
	}



}