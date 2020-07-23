/*
On his trip to Luxor and Aswan, Sagheer went to a Nubian market to buy some souvenirs for his friends and relatives.
The market has some strange rules. It contains n different items numbered from 1 to n. The i-th item has base cost a i Egyptian pounds.
If Sagheer buys k items with indices x 1, x 2, ..., x k, then the cost of item x j is a x j + x j·k for 1 ≤ j ≤ k.
In other words, the cost of an item is equal to its base cost in addition to its index multiplied by the factor k.
Sagheer wants to buy as many souvenirs as possible without paying more than S Egyptian pounds. Note that he cannot buy a souvenir more than once.
If there are many ways to maximize the number of souvenirs, he will choose the way that will minimize the total cost.
Can you help him with this task?
*/

import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Arrays;
public class Mail{
  
  static long check(long[]a,int mid,int n){
    long ans=0;
    long[] b=new long[n];
    for(int i=0;i<n;i++){
      b[i]=a[i]+(long) mid*(i+1);
    }
    Arrays.sort(b);
    for(int i=0;i<mid;i++){
      ans+=b[i];
    }
    return ans;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    PrintWriter out1=new PrintWriter(System.out);
      int n=sc.nextInt();
      long s=sc.nextInt();
      long[] a=new long[n];
      
      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
      
      int low=1;
      int high=n;
      int ans1=0;
      long ans2=0;
      
      while(low<=high){
        int mid=low+(high-low)/2;
        
        long take=check(a,mid,n);
        if(take<=s){
          ans1=mid;
          ans2=take;
          low=mid+1;
        }else if(take>s){
          high=mid-1;
        }
      }
      out1.println(ans1+" "+ans2);
      
   out1.flush();
   out1.close();
  }
}
