import java.util.*;
class joh{
    public static void main(String args[]){
        int a=89;
        
        String y=Integer.toBinaryString(a);
        int n=y.length();
        if(y.charAt(n-1)=='0'){
            System.out.print("even");}
        else{
            System.out.print("odd");
        }
        
        
        
    }
}
