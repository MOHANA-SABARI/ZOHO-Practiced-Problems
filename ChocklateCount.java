package zoho;

import java.util.*;
public class ChocklateCount{
	public static void main(String[] args) {
// 		System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int toCount = 0;
        int res =0;int val =0;

        while(num>0){
            if(num%3==0){
                res+=num;
            }else {
                val=num/3;
                res+=num;
                toCount = num+val;
               
                if(toCount%3==0){
                    res+=1;    
                }

            }
            num/=3;
            
        }
        System.out.println("The Number of chocalates he can Eat---> "+res);
	}
}
