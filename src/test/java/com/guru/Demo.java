package com.guru;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
    String str="Java selenium java cucumber selenium testing cucumber java selenium";
    LinkedHashMap<String,Integer>lh=new LinkedHashMap<String,Integer>();
    String []a=str.split(" ");
    for(int i=0;i<a.length;i++) {
    	if(lh.containsKey(a[i])) {
    		lh.put(a[i],lh.get(a[i])+1);
         }else {
        	 lh.put(a[i],1);
         }
    	
    	Set<Map.Entry<String,Integer>>hmap=lh.entrySet();
    	for(Entry<String,Integer> h:hmap) {
    		if(h.getValue()>1) {
        		System.out.println(h);

    		}
    	}
    }
    		}

}
