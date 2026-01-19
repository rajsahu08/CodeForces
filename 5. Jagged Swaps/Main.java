import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int min = Integer.MAX_VALUE;
		while(t-- > 0){
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i = 0; i < n; i++){
				arr[i] = sc.nextInt();
				min = Math.min(min,arr[i]);
			}
			if(min == arr[0]){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
}