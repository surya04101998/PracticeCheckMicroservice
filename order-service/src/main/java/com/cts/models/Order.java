package com.cts.models;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "orders")
public class Order {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long orderId;

private String menuItemId;

private String userName;

public long getOrderId() {
	return orderId;
}

public void setOrderId(long orderId) {
	this.orderId = orderId;
}

public String getMenuItemId() {
	return menuItemId;
}

public void setMenuItemId(String menuItemId) {
	this.menuItemId = menuItemId;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

@Override
public String toString() {
	return "Order [orderId=" + orderId + ", menuItemId=" + menuItemId + ", userName=" + userName + "]";
}

public Order(String menuItemId, String userName) {
	super();
	this.menuItemId = menuItemId;
	this.userName = userName;
}

public Order(long orderId, String menuItemId, String userName) {
	super();
	this.orderId = orderId;
	this.menuItemId = menuItemId;
	this.userName = userName;
}



}
