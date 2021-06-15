package com.miguel.model;

public class Simulator {
	 public static void main(String[] args){
	        CustomObject obj = new CustomObject("Miguel");
	        System.out.println(obj.getName());
	        
	        Object objRef = obj;
	        System.out.println(objRef);

	        Object objRef2 = (Object)obj;
	        System.out.println(objRef2);
	    }
}
