package algorithm;

public class GetMin {
	public int getMin(double[] arr){
		int index = 0;
		for(int i = 0; i < arr.length - 1; i++)
			index = arr[index] < arr[i+1] ? index : (i + 1);
		return index;
	}
}
