import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
	
	 Scanner sc = new Scanner(System.in);
	 
	 int N =sc.nextInt();
	 int asw=0;
	 for(int i = 0 ; i<N ; i++) {
		 int a =sc.nextInt();
		 int count = 0;
		 if(a>=2) {
			 for(int j =2; j<=a; j++) {
				 if(a%j==0) {
					 count++;
				 }
			 }
		 }
		 if(count==1) {
			 asw++;
		 }
	 }
	 System.out.println(asw);
 }
}