import java.util.*;
public class List1 {

public static void main(String[] args) {
// TODO Auto-generated method stub
String name,country,skill;
int age,index;
        Scanner sc = new Scanner(System.in);
        ArrayList al = new ArrayList();
        System.out.println("Enter the player details");
        System.out.println("Enter player name");
        name = sc.next();
        al.add(name);
        System.out.println("Enter age");
        age = sc.nextInt();
        al.add(age);
        System.out.println("Enter Country");
        country = sc.next();
        al.add(country);
        System.out.println("Player Details");
        System.out.println(al);
        System.out.println("Enter Skill");
        skill = sc.next();
        al.add(skill);
        System.out.println("Enter the position to add the skill");
        index = sc.nextInt();
        al.add(index,skill);
        System.out.println("Player Details");
        System.out.println(al);
        System.out.println("Enter the position to remove the detail");
        index = sc.nextInt();
        al.remove(index);
        System.out.println("Player Details");
        System.out.println(al);
}

}

