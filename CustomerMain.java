import java.util.*;
class CustomerMain{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
Customer obj = new Customer();
String a,b,c;
String line;
String[] lineVector;

line = sc.nextLine(); //read 1,2,3

   //separate all values by comma
lineVector = line.split(",");

   //parsing the values to Integer
        a=lineVector[0];
        b=lineVector[1];
        c=lineVector[2];
        obj.setName(a);
        obj.setAddress(b);
        obj.setMobile(c);
        System.out.println("name = "+obj.getName());
        System.out.println("address = "+obj.getAddress());
        System.out.println("mobile = "+obj.getMobile());
}
}