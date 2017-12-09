package com.example.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Products;



@RestController

@RequestMapping("api/products/")
public class ProductController {

	@CrossOrigin(origins = "http://localhost:8808")
	@RequestMapping(value="list", method=RequestMethod.GET)
	List<Products> getProducts(){
		List<Products> productList =new ArrayList<Products>();
		Products p =new Products();
		p.setProductId(1);
		p.setProductName("Hammer");
		p.setProductCode("TBX-0048");
		p.setReleaseDate("May 21, 2016");
		p.setDescription("Curved claw steel hammer");
	    p.setPrice(9);
	    p.setStarRating(4.8);
	    productList.add(p);
	    
	    Products p1 =new Products();
		p1.setProductId(5);
		p1.setProductName("Crompton");
		p1.setProductCode("TBX-00234");
		p1.setReleaseDate("May 11, 2013");
		p1.setDescription("Claw steel hammer");
	    p1.setPrice(9);
	    p1.setStarRating(4.8);
	    productList.add(p1);
	    
		return productList;
	}
	
}
