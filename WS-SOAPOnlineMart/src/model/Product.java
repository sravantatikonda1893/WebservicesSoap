 package model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
//Only in Tester xml file these are gonna change
//All these are having custom names
@XmlRootElement(name="Product")
//I want the xml to have this order the xml elements are created
@XmlType(propOrder={"price","sku","name"})
public class Product {

	private String name;
	private String sku;
	private int price;
//	Changing the variable names which gonna display in xml
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public Product(String name, String sku, int price) {
		super();
		this.name = name;
		this.sku = sku;
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Product() {
	}
}
