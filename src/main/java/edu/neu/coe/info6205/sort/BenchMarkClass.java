package edu.neu.coe.info6205.sort;

import java.io.IOException;

import edu.neu.coe.info6205.sort.elementary.HeapSort;
import edu.neu.coe.info6205.sort.linearithmic.MergeSort;
import edu.neu.coe.info6205.sort.linearithmic.QuickSort_DualPivot;
import edu.neu.coe.info6205.util.Config;
import edu.neu.coe.info6205.util.SorterBenchmark;
import edu.neu.coe.info6205.util.StatPack;
import edu.neu.coe.info6205.util.TimeLogger;

public class BenchMarkClass {
	private static Config config;
	
	public final static TimeLogger[] timeLoggers = {
            new TimeLogger("Raw time per run (mSec): ", (time, n) -> time)
    };

	public static void main(String[] args) {
		
		try {
            config = Config.load(BenchMarkClass.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
		
		System.out.println("Merge Sort with Instrument");
		//Helper<Integer> helper =null;
		//SortWithHelper<Integer> sort =null;
		//SorterBenchmark sorterBenchmark =null;
		for(int i=10000;i<320000;i=i*2)
		{
			Helper<Integer> helper  = HelperFactory.create("merge sort",i,true,config);
			SortWithHelper<Integer> sort  = new MergeSort<Integer>(helper);
			Integer[] ints = helper.random(Integer.class, r -> r.nextInt());
			SorterBenchmark<Integer> sorterBenchmark = new SorterBenchmark<Integer>(Integer.class, sort, ints, 20, timeLoggers);
	        sorterBenchmark.run(i);
	        System.out.println(((SortWithHelper<Integer>) sort).getHelper().showStats());
			
		}
		
		System.out.println("Merge Sort without Instrument");
		for(int i=10000;i<320000;i=i*2)
		{
			Helper<Integer> helper  = HelperFactory.create("merge sort",i,false,config);
			SortWithHelper<Integer> sort  = new MergeSort<Integer>(helper);
			Integer[] ints = helper.random(Integer.class, r -> r.nextInt());
			SorterBenchmark<Integer> sorterBenchmark = new SorterBenchmark<Integer>(Integer.class, sort, ints, 20, timeLoggers);
	        sorterBenchmark.run(i);
	        System.out.println(((SortWithHelper<Integer>) sort).getHelper().showStats());
			
		}
		
		System.out.println("Quick_sort Dual Pivot Sort with Instrument");
		//Helper<Integer> helper =null;
		//SortWithHelper<Integer> sort =null;
		//SorterBenchmark sorterBenchmark =null;
		for(int i=10000;i<320000;i=i*2)
		{
			Helper<Integer> helper  = HelperFactory.create("quick sort dual pivot ",i,true,config);
			SortWithHelper<Integer> sort  = new QuickSort_DualPivot<Integer>(helper);
			Integer[] ints = helper.random(Integer.class, r -> r.nextInt());
			SorterBenchmark<Integer> sorterBenchmark = new SorterBenchmark<Integer>(Integer.class, sort, ints, 20, timeLoggers);
	        sorterBenchmark.run(i);
	        System.out.println(((SortWithHelper<Integer>) sort).getHelper().showStats());
			
		}
		
		System.out.println("Merge Sort without Instrument");
		for(int i=10000;i<320000;i=i*2)
		{
			Helper<Integer> helper  = HelperFactory.create("quick sort dual pivot",i,false,config);
			SortWithHelper<Integer> sort  = new QuickSort_DualPivot<Integer>(helper);
			Integer[] ints = helper.random(Integer.class, r -> r.nextInt());
			SorterBenchmark<Integer> sorterBenchmark = new SorterBenchmark<Integer>(Integer.class, sort, ints, 20, timeLoggers);
	        sorterBenchmark.run(i);
	        System.out.println(((SortWithHelper<Integer>) sort).getHelper().showStats());
			
		}
		
		System.out.println("Heap Sort with Instrument");
		//Helper<Integer> helper =null;
		//SortWithHelper<Integer> sort =null;
		//SorterBenchmark sorterBenchmark =null;
		for(int i=10000;i<320000;i=i*2)
		{
			Helper<Integer> helper  = HelperFactory.create("heap sort",i,true,config);
			SortWithHelper<Integer> sort  = new HeapSort<Integer>(helper);
			Integer[] ints = helper.random(Integer.class, r -> r.nextInt());
			SorterBenchmark<Integer> sorterBenchmark = new SorterBenchmark<Integer>(Integer.class, sort, ints, 20, timeLoggers);
	        sorterBenchmark.run(i);
	        System.out.println(((SortWithHelper<Integer>) sort).getHelper().showStats());
			
		}
		
		System.out.println("Heap Sortwithout Instrument");
		for(int i=10000;i<320000;i=i*2)
		{
			Helper<Integer> helper  = HelperFactory.create("heap sort",i,false,config);
			SortWithHelper<Integer> sort  = new HeapSort<Integer>(helper);
			Integer[] ints = helper.random(Integer.class, r -> r.nextInt());
			SorterBenchmark<Integer> sorterBenchmark = new SorterBenchmark<Integer>(Integer.class, sort, ints, 20, timeLoggers);
	        sorterBenchmark.run(i);
	        System.out.println(((SortWithHelper<Integer>) sort).getHelper().showStats());
			
		}
			
	}
	
}
