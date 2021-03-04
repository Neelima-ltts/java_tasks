import java.util.*;
class StringTwo{
public static void main(String args[]){
String s1,s2;
Scanner sc = new Scanner(System.in);
s1= sc.nextLine();
s2= sc.nextLine();
String[] split1 = s1.split("\\s+");
String[] split2 = s2.split("\\s+");
if(split1[1].equals(split2[1])){
System.out.println("YES");
}
else{
System.out.println("NO");
}
}
}