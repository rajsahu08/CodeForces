import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
			int n = sc.nextInt();
			int arr[] = new int[n];
			Map<Integer, Integer> frequency = new HashMap<>();
			for(int i = 0; i < n; i++){
				arr[i] = sc.nextInt();
				frequency.put(arr[i], frequency.getOrDefault(arr[i],0)+1);
			}
			if(frequency.size()==1){
				System.out.println("Yes");
			}
			else if(frequency.size() == 2){
				Iterator<Integer> it = frequency.values().iterator();
				int freq1 = it.next();
				int freq2 = it.next();
				if(freq1 == freq2){
					System.out.println("Yes");
				}
				else if (Math.abs(freq1 - freq2) == 1) { 
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			}else{
				System.out.println("No");
			}
		}
	}
}