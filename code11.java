import java.util.*;
public class solution{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int count=0;
    for(char ch : s.toCharArray()){
        if("ABCDEFGHIJKLMNOPQRSTUVWXYZ".contains(Character.toString(ch))){
            count++;
        }
    }
    System.out.print(count);
    }
}
-------------------------------------------------------------------------------
  import java.util.*;
public class solution{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int count=0;
    for(char ch : s.toCharArray()){
    if (ch >= 'A' && ch <= 'Z') {
        count++;
    }
    }
    System.out.print(count);
    }
}
