import java.util.*;
public class Swap_Digit {
public static void main(String[]args){
Scanner s =new Scanner(System.in);
System.out.println("enter the number");
int n= s.nextInt();
int ld =n%10;
System.out.println(ld);
int d = (int)(Math.log10(n));
System.out.println(d);
int fd =(int)(n/Math.pow(10,d));
int rev =ld;
rev = rev *(int) (Math.pow(10,d));
rev = rev + n%(int)(Math.pow(10,d));
rev = rev- ld;
rev = rev + fd;
System.out.println("Swappednumber="+rev);
}}