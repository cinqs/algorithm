package algorithm.candidateCounter;

import java.util.Random;

public class Flips {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		
		int T = Integer.parseInt(args[0]);
		
		Counter jia = new Counter("jia");
		Counter yi 	= new Counter("yi");
		
		for(int i = 0; i < T; i++){
			if(random.nextDouble()<0.5){
				jia.increment();
			}else{
				yi.increment();
			}
		}
		
		System.out.println(jia.tally());
		System.out.printf("total for Yi is %d", yi.tally());
	}

}
