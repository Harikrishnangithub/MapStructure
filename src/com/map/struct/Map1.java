package com.map.struct;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Map1 {
	public static void main(String[] args) {
		TreeMap<String, String> map = new TreeMap<>();
		map.put("!", "Java");
		map.put("@", "sql");
		map.put("#", "oops");
		map.put("$", "sql");
		map.put("%", "Oracle");
		map.put("^", "DB");
		map.put("&", "Selenium");
		map.put("*", "psql");
		map.put("(", "Hadoop");
		
		 String s = map.get("$"); 
		 System.out.println(s);
		  
		 Collection<String> values = map.values(); 
		 for (String v : values) {
			 System.out.println(v);
		}
		 
		 Set<String> set = map.keySet();
		 for (String s1 : set) {
			 System.out.println(s1);
		}
		 
		 
		/*
		 * Set<Entry<String, String>> entryset = map.entrySet(); for (Entry<String,
		 * String> entry : entryset) { System.out.println(entry); }
		 */
	}

}
