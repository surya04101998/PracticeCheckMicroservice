package com.cts.menuMicroservice.models;

public class MenuItem {
private String id;
private String type;
private String name;
private String price;



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
