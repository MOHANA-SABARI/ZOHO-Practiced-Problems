package zoho;
import java.util.*;
public class Sortelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int [] arr = new int[size];
//		int y = size/2;
//		int [] even = new int [y];
//		
		List<Integer> x = new LinkedList<>();
		List<Integer> y = new LinkedList<>();
		
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			if(i%2==0) {
				x.add(arr[i]);
			}else {
				y.add(arr[i]);
			}
		}
		int [] odd = new int [y.size()];
		
		int jj =0;
		for(int h : y) {
			odd[jj]=h;
			System.out.println(h);
			jj++;
		}
		int [] even = new int [x.size()];
		
		int j =0;
		for(int h : x) {
			even[j]=h;
			System.out.println(h);
			j++;
		}
		Arrays.sort(even);
		int [] even1= new int [x.size()];
		int v =0;
		for(int i=x.size()-1;i>=0;i--) {
			even1[v]=even[i];
			v++;
		}
		
		int [] arr1 = new int[size];
		int o=0;int b =0;
//		for(int i=0;i<size;i++) {
//			if(i%2==0) {
//				arr1[i]=odd[o];
//				o++;
//			}
//			if(i%2==1){
//				arr1[i]=even[b];
//				b++;
//			}
//		}
		
		for(int i: odd) {
			System.out.print(i+",");
		}
		for(int i: even) {
			System.out.print(i+",");
		}
		
	}

}
