package edu.neu.coe.info6205.sort.elementary;

import edu.neu.coe.info6205.sort.elementary.InsertionSort;
import java.util.random.*;
import edu.neu.coe.info6205.util.*;
import scala.util.Random;

public class BenchMark_InsertionSort {
	
	public static void main(String args[])
	{
		Random md=new Random();
		
		for(int i=200;i<170000;i=i*2)
		{
			Integer arr[]=new Integer[i];
			InsertionSort ins=new InsertionSort();
			Stopwatch wa=null;
			
			//Random number 
			for(int k=0;k<i;k++)
				arr[k]=md.nextInt();

			//Random Sort
			wa=new Stopwatch();	
			ins.sort(arr, 0, arr.length-1);
			System.out.println("Random Sort :  "+ wa.lap());
			wa.close();
			
			
			//PartialSort
			for(int k=0;k<i/2;k++)
				arr[k]=k;
			for(int k=i/2;k<i;k++)
				arr[k]=md.nextInt();
			
			
			
			wa=new Stopwatch();	
			ins.sort(arr, 0, arr.length-1);
			System.out.println("Partial Sort :  "+ wa.lap());
			wa.close();
			
			
			
			//Ordered Array
			for(int k=0;k<i;k++)
				arr[k]=k;
			
			
			
			wa=new Stopwatch();	
			ins.sort(arr, 0, arr.length-1);
			System.out.println("Ordered Sort :  "+ wa.lap());
			wa.close();
			
			
			
			
			//Reversed Order
			for(int k=0;k<i;k++)
				arr[k]=i-k;
			
			
			wa=new Stopwatch();	
			ins.sort(arr, 0, arr.length-1);
			System.out.println("Reversed Sort :  "+ wa.lap());
			wa.close();
			
					
		}
		
	}

}
