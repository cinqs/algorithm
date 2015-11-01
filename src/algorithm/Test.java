package algorithm;

import edu.princeton.cs.algs4.*;

public class Test {
	public static void test1(){
		int f = 0;
		int g = 1;
		
		for(int i = 0; i <=0; i++){
			f = f + g;
			g = f - g;
		}
		
		StdOut.println(f);
		StdOut.println(g);
		
		//因为 f, g都是int类型的变量，这个函数最终导致的结果就是，不存在负数
	}

}
