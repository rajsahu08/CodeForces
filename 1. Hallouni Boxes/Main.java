import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
			int n = sc.nextInt();
			int k = sc.nextInt();
			long arr[] = new long[n];
			for(int i = 0; i < n; i++){
				arr[i] = sc.nextLong();
			}
			if(k>=2){
				System.out.println("YES");
			}
			if(k==1){
				boolean isSorted = true;
				for(int i = 0; i < n-1; i++){
					if(arr[i+1]<arr[i]){
						isSorted = false;
						break;
					}
				}
			
			if(isSorted){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
			}
		}
		sc.close();
	}
}