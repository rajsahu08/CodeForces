import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
			int n = sc.nextInt();
			int k = sc.nextInt();
			boolean ans = false;
			int arr[] = new int[n];
			for(int i = 0; i < n; i++){
				arr[i]=sc.nextInt();
				if(arr[i] == k){
					ans = true;
				}
			}
			if(ans){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}
		}
	}
}