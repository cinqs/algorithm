package algorithm;

public class IsPrime {
	public static void main(String args[]){
		System.out.println(isPrime(657));
	}
	
	public static int isPrime(int n){
		if(n < 0)
			return -1;
		else if(n < 2)
			return 1;
		else{
			for(int i = 2; i*i <= n; i++)
				if(n % i == 0)
					return i;
			return 1;
		}
	}
}
