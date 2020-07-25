package com.cts.feigns;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cts.models.MenuItem;


@FeignClient(name="menu-service",url = "http://localhost:8080")
public interface menuFeign {
	@GetMapping("/getAllItems")
	public List<MenuItem> getAllItems();
	
	@GetMapping("/getItemByName/{name}")
	public MenuItem getItemByName(@PathVariable String name);
	
	@GetMapping("/getItemById/{id}")
	public MenuItem getItemById(@PathVariable String id);
}
