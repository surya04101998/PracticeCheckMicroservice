package com.cts.menuMicroservice.services;


import java.util.List;

import org.springframework.stereotype.Service;

import com.cts.menuMicroservice.models.MenuItem;


@Service
public class MenuService {
	
	
	
	public static List<MenuItem> generateList() {
		
			List<MenuItem> list=CSVparsingService.parseCSVtoBeanList();
			return list;
		
	}
	
	static List<MenuItem> list=generateList();
	public List<MenuItem> getAllItems(){
		return list;
	}
	
	public MenuItem getByName(String name) {
	 for(MenuItem item:list) {
	 if(item.getName().equals(name))
		 return item;
	}
			return null;
	}
    
	public MenuItem getById(String id) {
		for(MenuItem item:list) {
			 if(item.getId().equals(id))
				 return item;
			}
					return null;
	}
	
	

}
