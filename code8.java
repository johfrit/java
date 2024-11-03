import java.util.*;
public class primenumber{
  public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    int n=sc.nextInt();
    int flag=0;
    for(int i=2;i<=n/2;i++){
      if(n%i==0){
        flag=1;
        break;
      }
      else{
        continue;
      }
    }
    if(flag==0){
      System.out.print("prime");
    }
    else if(flag==1)
    {
      System.out.print("not prime");
        }}}
