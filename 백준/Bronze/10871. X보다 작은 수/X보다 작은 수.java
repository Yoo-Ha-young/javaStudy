import java.util.Scanner;


public class Main {		

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// 수열 갯수
		int n = sc.nextInt();
		int x = sc.nextInt();
			
		int[] a = new int[n];
		
		for(int i= 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
			
		for(int i= 0; i < n; i++) {
			if(x > a[i]) {
				System.out.print(a[i] + " ");
			}
		}
	}
		
}
