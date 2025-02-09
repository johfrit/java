
import java.util.Scanner;

public class code {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        int length=order(num);
        if(isarmstrong(num,length)){
            System.out.println("arm");

        }
        else{
            System.out.println("not arm");
        }
        
    
}
static int order(int n){
    int i=0;
    while(n!=0){
        i++;
        n/=10;
    }
    return i;

}
static boolean isarmstrong(int n,int m){
    int temp=n;
    int sum=0;
    while(temp!=0){
        int rem=temp%10;
        sum = sum +(int)Math.pow(rem,m);
        temp/=10;
        
    }
    return n==sum;
}
}
//code2

import java.util.Scanner;

public class code {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        int length=order(num);
        if(isarmstrong(num,length)==num){
            System.out.println("arm");

        }
        else{
            System.out.println("not arm");
        }
        
    
}
static int order(int n){
    int i=0;
    while(n!=0){
        i++;
        n/=10;
    }
    return i;

}
static int isarmstrong(int n,int m){
    if(n==0){
        return 0;
    }
    int digit=0;
    digit=n%10;
    return (int)Math.pow(digit,m)+isarmstrong(n/10,m);
}
}

