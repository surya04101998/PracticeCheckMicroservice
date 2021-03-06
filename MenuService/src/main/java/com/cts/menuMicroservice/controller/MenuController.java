package com.cts.menuMicroservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cts.menuMicroservice.models.MenuItem;
import com.cts.menuMicroservice.services.MenuService;

import lombok.extern.log4j.Log4j2;

@Log4j2(topic = "Controller")
@RestController
public class MenuController {

	@Autowired
	MenuService menuServ;

	
	@GetMapping("/getAllItems")
	public List<MenuItem> getAllItems() {
	log.trace("getAllItems Triggered");
		return menuServ.getAllItems();	
	}
	
	@GetMapping("/getItemByName/{name}")
	public MenuItem getItemByName(@PathVariable String name) {
		log.trace("item with name: "+name+" is requested");
		return menuServ.getByName(name);
	}
	@GetMapping("/getItemById/{id}")
	public MenuItem getItemById(@PathVariable String id) {
		log.trace("item with id: "+id+"is requested");
		return menuServ.getById(id);
	}
	
}
