import java.util.*;
class StringOne{
public static void main(String args[]){
String s1,s2;
Scanner sc = new Scanner(System.in);
s1 = sc.nextLine();
s2 = sc.nextLine();
String first = s1.substring(0, 1);
String remaining = s1.substring(1, s1.length());

    first = first.toUpperCase();
	
    String s_1 = first + remaining;
    String s_2 = s2.toUpperCase();
	String name = s_1+s_2;
	System.out.println(name);
}
}