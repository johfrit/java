import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		while(y!=0){
		int temp=y;
		y=x%y;
		x=temp;
		    
		}
		System.out.print(x);
		
		
		
		
		
		
	}
}
