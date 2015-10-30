package algorithm;

import java.util.Arrays;

public class Main {
	
	static HarmonicSeries harmonicSeries = new HarmonicSeries();
	public static void main(String args []){
		double hs = harmonicSeries.h(2);
		System.out.println(hs);
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
