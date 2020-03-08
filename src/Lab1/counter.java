package Lab1;
import java.util.Scanner;

public class counter {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		System.out.println("Input an number:");
		int x = sc.nextInt();
		System.out.println(count(x));
	}
	public static boolean count(int n) {
		int[] coins = new int[] {50,20,10,5,5,1,1,1};
		for(int i = 0;i < coins.length;i++) {
			if(n >= coins[i]) {
				n = n - coins[i];
			}
			if( n == 0 ) return true;
		}
		return false;
	}
	
}