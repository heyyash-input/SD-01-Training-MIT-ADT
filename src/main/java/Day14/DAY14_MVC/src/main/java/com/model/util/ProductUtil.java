package com.model.util;

import java.util.ArrayList;
import java.util.List;

import com.pojo.Product;

public class ProductUtil {

//------------------------------------------------------------------------------------------------		
	private List<Product> prdList;
	
	//Loose coupling:-
	public ProductUtil() {
		System.out.println("------constructor ProductUtil-------");
		prdList = new ArrayList<Product> (); // instance of arrayList
	}
//-----------------------------------------------------------------------------------------------	
	public List<Product> getAllPrds(){
		
		prdList.add(new Product("van", 890,1));
		prdList.add(new Product( "van", 890,1)) ;
		prdList.add(new Product( "sofa", 560,50)) ;
		prdList.add(new Product( "Fridge", 6700,89 )) ;
		return prdList; 
		
	}
//-----------------------------------------------------------------------------------------------
	public void addNewPrds(Product newPrd){
		 prdList.add(newPrd);
		 System.out.println("----new Product added");
	}
	
}
