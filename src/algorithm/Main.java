package algorithm;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
	
	//static HarmonicSeries harmonicSeries = new HarmonicSeries();
	
	public static void main(String args []){
		
		double[] getMax = {12, 34, 45, 89, 7, 564};
		
		//double hs = harmonicSeries.h(2);
		
		//GetMax gMax = new GetMax();
		
		//System.out.println(gMax.getMax(getMax));
		
		//GetMin gMin = new GetMin();
		
		//System.out.println(gMin.getMin(getMax));
		
		RecursiveSearch rSearch = new RecursiveSearch();
		
		//System.out.println(rSearch.getIndex(45, getMax));
		
		SortArray sArray = new SortArray();
		
		double[] showArr = sArray.sortArray(getMax);
		
		System.out.println(rSearch.getIndex(7, getMax));
		//this is actully not solve the problem, however, this problem is valueless, though
	}
	
	
	
	
	public static int rank(int key, int[] a){
		int lo = 0;
		int hi = a.length - 1;
		
		while(lo <= hi){
			int mid = lo + (hi - lo) / 2;
			
			if(key < a[mid])
				hi = mid - 1;
			else if(key > a[mid])
				lo = mid + 1;
			else
				return mid;
		}
		
		return -1;
	}
	
	
	
	public static int isPrime(int varNumber){
		if(varNumber < 2)
			return varNumber;
		else{
			for(int i = 2; i < varNumber; i++){
				if(varNumber % i == 0)
					return i;
			}
			return varNumber;
		}
	}
	
	public static int getAbs(int c){
		if(c<0)
			return -c;
		else
			return c;
	}

}
