import java.util.*;
class ShapeMain{
public static void main(String[] args){
String s_name;
int radius,side;
Scanner sc = new Scanner(System.in);
Circle c = new Circle();
Square s = new Square();
System.out.println("Circle");
System.out.println("Square");
System.out.println("Enter shape");
s_name = sc.nextLine();
if(s_name.equalsIgnoreCase("Circle")){
System.out.println("Enter Radius);
radius = sc.nextInt();
c.calculateArea(radius);
}
else if(s_name.equalsIgnoreCase("Square")){
System.out.println("Enter Side");
side = sc.nextInt();
s.calculateArea(side);
}
else {
System.out.println("Invalid Input");
}
}
}