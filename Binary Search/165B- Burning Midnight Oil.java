import java.util.Scanner;
import java.io.PrintWriter;
 
public class Mail{
  
  static int check(int l,int k){
    int ans=l;
    int p=1;
    while(l/(Math.pow(k,p)) !=0){
      int toadd=l/(int)(Math.pow(k,p));
      ans+=toadd;
      p++;
    }
    return ans;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    PrintWriter out1=new PrintWriter(System.out);
      int n=sc.nextInt();
      int k=sc.nextInt();
      
      int low=1;
      int high=n;
      int ans=0;
      
      while(low<=high){
        int mid=low+(high-low)/2;
        
        if(check(mid,k)<n){
          low=mid+1;
        }else if(check(mid,k)>=n){
          ans=mid;
          high=mid-1;
        }
        
      }
      out1.println(ans);
      
   out1.flush();
   out1.close();
  }
}
