package buisness;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebResult;

import model.Product;

public class ProductServiceImpl {
	List<String> booksList=new ArrayList<String>();
	List<String> moviesList=new ArrayList<String>();
	List<String> mobilesList=new ArrayList<String>();

	public ProductServiceImpl(){
		booksList.add("java");
		booksList.add("C++");
		booksList.add("C");

		moviesList.add("ranam");
		moviesList.add("Saw");
		moviesList.add("PK");

		mobilesList.add("Samsung");
		mobilesList.add("Nokia");
		mobilesList.add("Apple");
	}

	public List<String> getProductCategories(){
		List<String> categories=new ArrayList<String>();
		categories.add("Books");
		categories.add("mobiles");
		categories.add("movies");
		return categories;

	}

	public List<String> getProducts(String category)
	{
		switch(category.toLowerCase()){
		case "books":
			return booksList;
		case "movies":
			return moviesList;
		case "mobiles":
			return mobilesList;
		}
		return null;
	}
	public boolean addProduct(String category,String product){
		switch(category.toLowerCase()){
		case "books":
			return booksList.add(product);
		case "movies":
			return moviesList.add(product);
		case "mobiles":
			return mobilesList.add(product);
		default: return false;
		}
	}
@WebResult(name="Product")
	public List<Product> getProductsV2(String category) 
	{
		List<Product> pList=new ArrayList<>();
		pList.add(new Product("Scjp Book", "1234", 299));
		pList.add(new Product("Sravan Book", "12367", 499));
		return pList;
		
	}

	}



