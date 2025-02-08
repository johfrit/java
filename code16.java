import java.util.Scanner;

public class code {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int m=getreverse(n,0);
        if(n==m){
            System.out.print("palindrome");
        }
        else{
            System.out.println("not palin");
        }


    }
    static int getreverse(int n,int rev){

        
        if(n==0){
            return rev;
        }
        int rem=n%10;
        rev=rev*10+rem;
        n/=10;
        return getreverse(n,rev);


    }
    
}
