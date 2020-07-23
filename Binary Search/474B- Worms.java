/*
It is lunch time for Mole. His friend, Marmot, prepared him a nice game for lunch.

Marmot brought Mole n ordered piles of worms such that i-th pile contains a i worms.
He labeled all these worms with consecutive integers: worms in first pile are labeled with numbers 1 to a 1,
worms in second pile are labeled with numbers a 1 + 1 to a 1 + a 2 and so on. See the example for a better understanding.
Mole can't eat all the worms (Marmot brought a lot) and, as we all know, Mole is blind,
so Marmot tells him the labels of the best juicy worms. Marmot will only give Mole a worm if Mole says correctly in which pile this worm is contained.

Poor Mole asks for your help. For all juicy worms said by Marmot, tell Mole the correct answers.
*/

import java.util.Scanner;
import java.io.PrintWriter;
public class Mail{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    PrintWriter out1=new PrintWriter(System.out);
    int n=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    int m=sc.nextInt();
    int[] b=new int[n];
    b[0]=a[0];
    for(int i=1;i<n;i++){
      b[i]=b[i-1]+a[i];
    }
    while(m-->0){
    int key=sc.nextInt();
    if(key<b[0]){
      out1.println(1);
      continue;
    }
    int low=0;
    int high=n-1;
    boolean in=true;
    while(low<=high){
      int mid=low+(high-low)/2;
      if(b[mid]<key)
        low=mid+1;
      else if(b[mid]>key)
             high=mid-1;
           else {
             out1.println(mid+1);
             in=false;
             break;
             }          
    }
    if(in){
      out1.println(low+1);
    }
   }
   out1.flush();
   out1.close();
  }
}
