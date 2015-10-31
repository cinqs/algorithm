package algorithm;

public class RecursiveSearch {
	public int getIndex(int key, double[] arr){
		GetMax gMax = new GetMax();
		GetMin gMin = new GetMin();
		
		int loIndex = gMin.getMin(arr);
		int hiIndex = gMax.getMax(arr);
		
		if(key <= arr[hiIndex] && key >= arr[loIndex])
			return getIndex(key, arr, 0, arr.length - 1);
		else
			return -1;
	}
	
	public int getIndex(int key, double[] arr, int lo, int hi){
		int mid = lo + (hi - lo) / 2;
		if(key > arr[mid])
			return getIndex(key, arr, mid + 1, hi);
		else if(key < arr[mid])
			return getIndex(key, arr, lo, mid - 1);
		else
			return mid;
	}
}
