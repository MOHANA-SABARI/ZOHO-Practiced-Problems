package zoho;
import java.util.*;
public class Letterprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String x = sc.next();int u=1;
		List<Character> y = new LinkedList<>();
		List<Integer> z = new LinkedList<>();
		
		for(int i=0;i<x.length();i++) {
			if(x.charAt(i)>='a' && x.charAt(i)<='z') {
				y.add(x.charAt(i));
			}
			if(x.charAt(i)>='1' && x.charAt(i)<='9') {
				String ch = ""+x.charAt(i);
				z.add(Integer.parseInt(String.valueOf(ch)));
			}
			
			if(i==x.length()-1) {
				if(x.charAt(i)=='0') {
					//x.charAt(i-1)=='1';
					u=(int) x.charAt(i-1) * 10;
					z.add(u);
				}
				u=1;
			}
		}
		
		for(int t : z) {
			System.out.println(t);
		}
	}

}
