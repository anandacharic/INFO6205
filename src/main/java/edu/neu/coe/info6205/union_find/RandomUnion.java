package edu.neu.coe.info6205.union_find;

import java.util.*;
import edu.neu.coe.info6205.union_find.*;

public class RandomUnion {

	public static void main(String[] args) {
		
		
		Random rd=new Random();
		
		for(int i=250;i<=5000000;i=i*2)
		{
			
			UF_HWQUPC obj =new UF_HWQUPC (i,true);
			int pairs=0;
			
			while(obj.components()!=1)
			{
				int first = rd.nextInt(i);
				int second =rd.nextInt(i);
				pairs++;
				obj.connect(first, second);
			}
			System.out.println(i+"    "+ pairs);
		}
		
		
		
		
		

	}

}
