/*
Permutation p is an ordered set of integers p 1,  p 2,  ...,  p n, consisting of n distinct positive integers, each of them doesn't exceed n.
We'll denote the i-th element of permutation p as p i. We'll call number n the size or the length of permutation p 1,  p 2,  ...,  p n.
You have a sequence of integers a 1, a 2, ..., a n. In one move, you are allowed to decrease or increase any number by one.
Count the minimum number of moves, needed to build a permutation from this sequence.
*/

import java.io.PrintWriter;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		PrintWriter out1=new PrintWriter(System.out);
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        Collections.sort(a);
        long ans=0;
        int j=1;
        for(int i=0;i<n;i++){
            if(a.get(i)<0){
                ans+=Math.abs(a.get(i))+j;
            }else if(a.get(i)!=j){
                ans+=Math.abs(a.get(i)-j);
            }
            j++;
        }
        out1.println(ans);
        out1.flush();
		out1.close();
	}
}
