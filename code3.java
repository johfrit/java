import java.util.Scanner;

class joh{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num1 =scan.nextInt();
        int num2 =scan.nextInt();
        int temp;
        while(num2!=0){
        temp = num2;
        num2=num1 % num2;
        num1 =temp;
        }
        System.out.println(a);
        
        }
}
