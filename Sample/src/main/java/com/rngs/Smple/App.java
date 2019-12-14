package com.rngs.Smple;

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
    }
}
