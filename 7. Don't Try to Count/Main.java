import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
			int n = sc.nextInt();
			int m = sc.nextInt();
			String x = sc.next();
			String s = sc.next();
			int result = 0;
			while(x.length() < s.length()){
				x=x+x;
				result = result + 1;
			}
			if(x.contains(s)){
				System.out.println(result);
			}
			else{
				x=x+x;
				result+=1;
				if(x.contains(s)){
					System.out.println(result);
				}
				else{
					System.out.println("-1");
				}
			}
		}
	}
}