import java.util.Scanner;

class joh{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c;
        while(b!=0){
        c=b;
        b=a%b;
        a=c;
        }
        System.out.println(a);
        
        }
}
