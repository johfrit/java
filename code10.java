import java.util.*;
public class solution{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    char c=sc.nextLine().charAt(0);
    for(char ch : s.toCharArray()){
        if(ch==c){
            break;
        }
        else if(ch!=c){
            System.out.print(ch);
        }
    }
    }
}
--------------------------------------------------
  import java.util.*;
public class solution{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    char c=sc.nextLine().charAt(0);
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)==c){
            break;
        }
        else if(s.charAt(i)!=c){
            System.out.print(s.charAt(i));
        }
    }
    }
}
