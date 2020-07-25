package com.cts.models;



public class MenuItem {

private String id;
private String type;
private String name;
private String price;



public MenuItem(String id, String type, String name, String price) {
	super();
	this.id = id;
	this.type = type;
	this.name = name;
	this.price = price;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
@Override
public String toString() {
	return "MenuItem [id=" + id + ", type=" + type + ", name=" + name + ", price=" + price + "]";
}
}
