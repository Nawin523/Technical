package com.rngs.Sample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.rngs.Car;

public class App {
	public static void main(String[] args) {
		int i, j, k;

		@SuppressWarnings("resource")
		Scanner sn = new Scanner(System.in);
		System.out.print("Enter the value of i :");
		i = sn.nextInt();
		System.out.print("Enter the value of j :");
		j = sn.nextInt();
		k = i + j;
		System.out.println("addition of i and j is :" + k);

		System.out.println("Hello Vasudha Meesala!");

		List<Integer> list = new ArrayList<Integer>();
		list.add(81);
		list.add(52);
		list.add(0, 58);

		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		for (Iterator<Integer> iter = list.iterator(); itr.hasNext();) {
			System.out.println(iter.next());
		}

		for (Integer it : list) {
			System.out.println(it);
		}

		System.out.println(list.get(0));

		List<String> list1 = new ArrayList<>();
		list1.add("one");
		list1.add("two");
		list1.add("three");
		
		Collections.sort(list1);

		for (String string : list1) {
			System.out.println(string);
		}

		int index = Collections.binarySearch(list1, "one");
		System.out.println(index);

		// Here is the code that sorts a Java List of the above Car objects:
		// Start
		List<Car> list3 = new ArrayList<>();

		list3.add(new Car("Volvo V40", "XYZ 201845", 5));
		list3.add(new Car("Citroen C1", "ABC 164521", 4));
		list3.add(new Car("Dodge Ram", "KLM 845990", 2));

		Comparator<Car> carBrandComparator = new Comparator<Car>() {
			@Override
			public int compare(Car car1, Car car2) {
				return car1.brand.compareTo(car2.brand);
			}
		};

		Collections.sort(list3, carBrandComparator);
		for(Car car : list3) {
			System.out.println(car.brand);
		}
		// End of Sorting of Object

		// Note too, that it is possible to implement a Comparator using a Java Lambda.
		// Start
		List<Car> lis4 = new ArrayList<>();

		lis4.add(new Car("Volvo V40", "XYZ 201845", 5));
		lis4.add(new Car("Citroen C1", "ABC 164521", 4));
		lis4.add(new Car("Dodge Ram", "KLM 845990", 2));

		Comparator<Car> carBrandComparatorLambda = (car1, car2) -> car1.brand.compareTo(car2.brand);

		Comparator<Car> carNumberPlatComparatorLambda = (car1, car2) -> car1.numberPlate.compareTo(car2.numberPlate);

		Comparator<Car> carNoOfDoorsComparatorLambda = (car1, car2) -> car1.noOfDoors - car2.noOfDoors;

		Collections.sort(lis4, carBrandComparatorLambda);
		List<String> brandListOrder = lis4.stream().map(b -> b.brand) .collect(Collectors.toList());
		System.out.println(brandListOrder);
		Collections.sort(lis4, carNumberPlatComparatorLambda);
		List<String> nuberPlateOrder = lis4.stream().map(n -> n.numberPlate).collect(Collectors.toList());
		System.out.println(nuberPlateOrder);
		Collections.sort(lis4, carNoOfDoorsComparatorLambda);
		List<Integer> carDoors = lis4.stream().map(n -> n.noOfDoors).collect(Collectors.toList());
		System.out.println(carDoors);
		// End
	}
}
