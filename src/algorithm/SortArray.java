package algorithm;

public class SortArray {
	public double[] sortArray(double[] arr){
		int arrLength = arr.length;
		//double[] result = new double[arrLength];
		
		double temp;
		
		for(int i = 0; i < arrLength; i++){
			for(int j = i + 1; j < arrLength; j++){
				if(arr[i] > arr[j]){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					//arr[i], arr[j] = arr[j], temp;
				}
			}
		}
		//GetMin gMin = new GetMin();
		//System.out.println(gMin.getMin(arr));
			
		
		return arr;
		
	}
}
