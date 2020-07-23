/*
After the lessons n groups of schoolchildren went outside and decided to visit Polycarpus to celebrate his birthday. 
We know that the i-th group consists of s i friends (1 ≤ s i ≤ 4), and they want to go to Polycarpus together.
They decided to get there by taxi. Each car can carry at most four passengers. 
What minimum number of cars will the children need if all members of each group should ride in the same taxi (but one taxi can take more than one group)?
*/

import java.io.PrintWriter;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		PrintWriter out1=new PrintWriter(System.out);
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		HashMap<Integer,Integer> h=new HashMap<>();
		h.put(1,0);
		h.put(2,0);
		h.put(3,0);
		h.put(4,0);
		for(int i=0;i<n;i++){
		    int p=sc.nextInt();
		    h.put(p,h.getOrDefault(p,0)+1);
		}
		int count=0;
    
    //Grouping 1 and 3
    
		if(h.get(1)>0 && h.get(3)>0){
		    int min=Math.min(h.get(1),h.get(3));
		    count+=min;
		    h.put(1,h.get(1)-min);
		    h.put(3,h.get(3)-min);
		}
    //We don't group 1 and 2, because we waste 1 seat of taxi by considering it.
		if(h.get(2)>0){
		    count+=h.get(2)/2;
		    h.put(2,(h.get(2)%2));
		}
		if(h.get(1)>=2 && h.get(2)==1){
		   count++;
		   h.put(2,0);
		   h.put(1,h.get(1)-2);
		}
		if(h.get(1)>0){
		    count+=h.get(1)/4;
		    h.put(1,h.get(1)%4);
		}
		if(h.get(2)>0 || h.get(1)>0){
		    count++;
		}
		count+=h.get(3);
		count+=h.get(4);
		out1.println(count);
		out1.flush();
		out1.close();
	}
}
