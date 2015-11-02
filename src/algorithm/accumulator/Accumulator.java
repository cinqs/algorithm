package algorithm.accumulator;

public class Accumulator {
	private double sum;
	private int cnt;
	
	public void addDataValue(double value){
		sum += value;
		cnt++;
	}
	
	public double mean(){
		return sum / cnt;
	}
	
	public String toString(){
		return cnt + "values: " + mean();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
