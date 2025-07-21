import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      while(n1>0 && n2>0){
        if(n1>n2){
          n1=n1%n2;
        }
         else if(n1<n2){
          n2=n2%n1;
        }
      }
      System.out.println(n1==0?n2:n1);
  }
}
