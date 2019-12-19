package com.rngs.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Stream;

public class MapExamples {

	public static void main(String args[]) {

		Map<Integer, String> map = new HashMap<>();

		map.put(1, "Meesala");
		map.put(2, "Naveen");
		map.put(3, "Vasudha");
		map.put(4, "Raoji");

		// EntrySet while fetch both key and value pair from map
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		Iterator<Entry<Integer, String>> itr = entrySet.iterator();
		// This is the single step of above two lines
		Iterator<Entry<Integer, String>> eset = map.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<Integer, String> entryMap = (Map.Entry<Integer, String>) itr.next();
			System.out.println(entryMap.getKey() + ":" + entryMap.getValue());
		}

		System.out.println();

		// keySet fetches only values from map
		Set<Integer> set1 = map.keySet();
		Iterator<Integer> iterator = set1.iterator();
		// This is the single step of above two lines
		Iterator<Integer> keyset = map.keySet().iterator();
		while (iterator.hasNext()) {
			Integer key = iterator.next();
			String value = map.get(key);
			System.out.println(key + "::" + value);
		}

		System.out.println();
		for(Integer key : map.keySet()) {
			System.out.println("key :" +key +"Value : "+map.get(key));
		}
		
		System.out.println();
		
		System.out.println(map.entrySet().toString());
		
		System.out.println(map.toString());

		for (Map.Entry<Integer,String > m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		System.out.println();
		 
		map.forEach((id, name) -> {
			System.out.println("Key : " + id + " value : " + name);
		});
		
		System.out.println();
		
		map.entrySet().stream().forEach(e ->
		System.out.println("Key : " + e.getKey() + " value : " + e.getValue())
		);
		
		System.out.println();

		Stream<Entry<Integer, String>> stream = map.entrySet().stream();
		stream.forEach((value) -> {
			System.out.println(value);
		});

		Stream<String> strea = map.values().stream();
		strea.forEach((value) -> {
			System.out.println(value);
		});

		Stream<Integer> key = map.keySet().stream();
		key.forEach((value1) -> {
			System.out.println(value1);
		});
		
		
		 Map<String,ArrayList<String>> map1 = new HashMap<String, ArrayList<String>>();
		 Map<Integer, ArrayList<Map<Integer,String>>> map2 = new HashMap<Integer, ArrayList<Map<Integer,String>>>();
		 
		 Map<Integer, String> map3 = new HashMap<Integer, String>();
		 Map<Integer, String> map4 = new HashMap<Integer, String>();
		 Map<Integer, String> map5 = new HashMap<Integer, String>();
		 Map<Integer, String> map6 = new HashMap<Integer, String>();
		 
		 ArrayList<Map<Integer, String>> arrayMap = new ArrayList<Map<Integer, String>>();
		 
		 arrayMap.add(map3);
		 arrayMap.add(map4);
		 arrayMap.add(map5);
		 arrayMap.add(map6);
		 
		 
		 map2.put(1, arrayMap);

	}

}
