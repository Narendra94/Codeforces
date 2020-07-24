/*
The end of the school year is near and Ms. Manana, the teacher, will soon have to say goodbye to a yet another class. 
She decided to prepare a goodbye present for her n students and give each of them a jigsaw puzzle 
(which, as wikipedia states, is a tiling puzzle that requires the assembly of numerous small, often oddly shaped, interlocking and tessellating pieces).
The shop assistant told the teacher that there are m puzzles in the shop, but they might differ in difficulty and size. 
Specifically, the first jigsaw puzzle consists of f 1 pieces, the second one consists of f 2 pieces and so on.
Ms. Manana doesn't want to upset the children, so she decided that the difference between the numbers of pieces in her presents must be as small as possible. 
Let A be the number of pieces in the largest puzzle that the teacher buys and B be the number of pieces in the smallest such puzzle. 
She wants to choose such n puzzles that A - B is minimum possible. Help the teacher and find the least possible value of A - B.
*/
import java.io.PrintWriter;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		PrintWriter out1=new PrintWriter(System.out);
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		ArrayList<Integer> a=new ArrayList<>();
		for(int i=0;i<m;i++){
		    a.add(sc.nextInt());
		}
		
    Collections.sort(a);
		int min=a.get(n-1)-a.get(0);
		
    for(int i=0;i<=m-n;i++){
		    if(a.get(i+n-1)-a.get(i) <min)
		        min=a.get(i+n-1)-a.get(i);
		}
    
		out1.println(min);
		out1.flush();
		out1.close();
	}
}
