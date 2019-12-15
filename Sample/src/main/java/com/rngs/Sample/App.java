package com.rngs.Sample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int i,j,k;
    	
    	@SuppressWarnings("resource")
		Scanner sn = new Scanner(System.in);
    	System.out.print("Enter the value of i :");
    	i= sn.nextInt();
    	System.out.print("Enter the value of j :");
    	j=sn.nextInt();
    	//i=20;j=25;
    	k=i+j;
    	
    	System.out.println("addition of i and j is :" +k);
    	
        System.out.println( "Hello Vasudha Meesala!" );
        
        List list = new ArrayList<Integer>();
        list.add(81);
        list.add(52);
        list.add(75);
        list.add(2,58);
        
       Iterator itr = list.iterator();
       while(itr.hasNext()) {
       System.out.println(itr.next());
    	   
       }
       
       System.out.println(list.get(3));
        
    }
}
