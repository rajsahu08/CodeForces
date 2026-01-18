import java.util.Scanner;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		int n = sc.nextInt();
		int x = sc.nextInt();
		int arr[] = new int[n];
		
		int d2=0;
		for(int i = 0; i < arr.length; i++){
				arr[i] = sc.nextInt();
				if(i != 0){
					d2 = Math.max(arr[i]-arr[i-1],d2);
				}
		}
		int d1 = arr[0];
		int d3 = 2 * (x-arr[n-1]);
		System.out.println(Math.max(d1,Math.max(d2,d3)));
		}
	}
}