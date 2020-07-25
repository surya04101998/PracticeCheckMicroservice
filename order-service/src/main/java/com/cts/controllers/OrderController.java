package com.cts.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cts.models.MenuItem;
import com.cts.services.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	OrderService orderServ;
	
	@GetMapping("/menuCard")
	public List<MenuItem> menuCard(){
		return orderServ.getMenuCard();
	}
	
	@GetMapping("/orderByName/{name}")
public String placeOrderByName(@PathVariable String name) {
	return orderServ.orderByName(name);
}
	
	@GetMapping("/orderById/{id}")
	public String placeOrderById(@PathVariable String id) {
		return orderServ.orderById(id);
	}
}
