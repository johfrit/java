import java.util.*;
public class fibbo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Long> fib=new ArrayList<>();
        fib.add(0L);
        fib.add(1L);
        for(int i=2;i<n;i++){
            Long sum=0L;
            sum=(fib.get(i-1)+fib.get(i-2));
            fib.add(sum);
        }
        for(int i=0;i<n;i++){
            System.out.print(fib.get(i)+" ");
        }
    }
}
