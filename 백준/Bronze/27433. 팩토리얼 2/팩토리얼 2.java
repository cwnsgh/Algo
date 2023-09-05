import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println(fac(1,sc.nextInt()));
	}


	public static long fac(int a,int b) {
		if(b<=1)	
		return a;
		
		else {
			return fac(a, b-1)* b ;
		}
	}
}