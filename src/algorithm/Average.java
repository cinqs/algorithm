package algorithm;

import edu.princeton.cs.algs4.*;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double sum = 0.0;
		
		int cnt = 0;
		
		while(!StdIn.isEmpty()){
			sum += StdIn.readDouble();
			cnt++;
		}
		
		double avg = sum / cnt;
		StdOut.printf("the average is %.5f", avg);

	}
	
	public static void example1(){
		StdOut.println("hello, word");
	}

}
