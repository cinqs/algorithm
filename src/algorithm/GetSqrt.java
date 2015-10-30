package algorithm;

public class GetSqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(getSqrt(257));
	}
	
	public static double getSqrt(double d){
		if(d < 0)
			return Double.NaN;
		else{
			double err = 1e-15;
			double t = d;
			while(Math.abs(t - d/t) > err * t)
				t = (t + d / t) / 2.0;
			return t;
		}
	}

}
