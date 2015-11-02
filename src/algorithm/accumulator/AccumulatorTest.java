package algorithm.accumulator;

import java.util.Random;

public class AccumulatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accumulator accumulator = new Accumulator();
		for(int i = 0; i < Integer.parseInt(args[0]); i++){
			accumulator.addDataValue(new Random().nextFloat());
		}
		
		System.out.println(accumulator);
	}

}
