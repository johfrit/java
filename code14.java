import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		List<String> reverse=new ArrayList<>();
		for(int i=s.length()-1;i>=0;i--){
		    reverse.add(Character.toString(s.charAt(i)));
		
		}
		System.out.print(String.join("",reverse));

	}
}
