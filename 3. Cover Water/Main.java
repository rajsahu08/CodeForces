import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
			int n = sc.nextInt();
			String str = sc.next();
			int result = 0;
			
			for(int i = 0; i < str.length(); i++){
				if(str.charAt(i)=='.'){
					result+=1;
				}
				if(i > 0 && i < str.length()-1){
					if(str.charAt(i-1) == '.' && str.charAt(i)=='.' && str.charAt(i+1)=='.'){
						result = 2;
						break;
					}
				}
			}
			
			System.out.println(result);
		}
	}
}