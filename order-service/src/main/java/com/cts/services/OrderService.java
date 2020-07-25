package com.cts.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.feigns.menuFeign;
import com.cts.models.MenuItem;
import com.cts.models.Order;
import com.cts.repos.OrderRepo;

@Service
public class OrderService {

	
	@Autowired
	OrderRepo repo;
	
	@Autowired
	menuFeign menuRepo;
	public List<MenuItem> getMenuCard(){
		return menuRepo.getAllItems();
	}
	
	public String orderByName(String name) {
		MenuItem menu=menuRepo.getItemByName(name);
		if(menu==null) {
			return "Sorry Dish with such name doesnt exist";
		}
		else
		{	String username="user"; //temporary userId till security has been implemented
			Order req=new Order(menu.getId(),username);
			Order placedOrder=repo.save(req);
		    return "your request of "+menu+" is successfully placed, order id is "+placedOrder.getOrderId();
		}
		
	}
	
	public String orderById(String id) {
		MenuItem menu=menuRepo.getItemById(id);
		if(menu==null) {
			return "Sorry Dish with such name doesnt exist";
		}
		else
		{	String username="user";//temporary username till security has been implemented
			Order req=new Order(menu.getId(),username);
			Order placedOrder=repo.save(req);
		    return "your request of "+menu+" is successfully placed, order id is "+placedOrder.getOrderId();
		}
		
	}
	
	
}
