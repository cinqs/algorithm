package algorithm;

import java.lang.reflect.Array;
import java.util.Arrays;
import edu.princeton.cs.algs4.*;

public class Main {
	
	//static HarmonicSeries harmonicSeries = new HarmonicSeries();
	
	public static void main(String args []){
		System.out.println(Double.compare(0.5, 0.4));
		
		Test.test1();
	}
	
	public static boolean test1(double x, double y){
		return (x < 1 && x > 0 && y < 1 && y > 0);
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
