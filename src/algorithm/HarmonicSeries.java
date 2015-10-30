package algorithm;

public class HarmonicSeries {
	
	public static double h(double d){
		double dResult = 0;
		for(int i = 1; i <= d; i++)
			dResult += 1.0 / i;
		return dResult;
	}

}
