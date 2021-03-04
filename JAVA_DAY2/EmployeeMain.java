import java.util.*;
public class EmployeeMain{
public static void main(String[] args){
String emp_name,name1;
String emp_address,address1;
String emp_mobile,mobile1;
int ch;
Scanner sc = new Scanner(System.in);
System.out.println("Enter name");
emp_name = sc.nextLine();
System.out.println("Enter address");
emp_address = sc.nextLine();
System.out.println("Enter mobile");
emp_mobile = sc.nextLine();
obj.setName(emp_name);
obj.setAddress(emp_address);
obj.setMobile(emp_mobile);
System.out.println("Employee Details");
System.out.println("name = "+obj.getName());
System.out.println("address = "+obj.getAddress());
System.out.println("mobile = "+obj.getMobile());
System.out.println("Verify and Update Details...");
System.out.println("MENU");
ch = sc.nextInt();
Switch(ch){
case 1: System.out.println("1. Update Employee name");
        System.out.println("Current Name = "+obj.getName()); 
        System.out.println("Enter name: ");
		name1 = sc.nextLine();
        obj.setName(name1);
        break;
case 2: System.out.println("2. Update Employee address");
        System.out.println("Current Address = "+obj.getAddress()); 
        System.out.println("Enter address: ");
		address1 = sc.nextLine();
        obj.setAddress(address1);
        break;
case 3: System.out.println("3. Update Employee Mobile");
        System.out.println("Current Mobile = "+obj.getMobile()); 
        System.out.println("Enter mobile: ");
		mobile1 = sc.nextLine();
        obj.setMobile(mobile1);
        break;
case 4: System.out.println("4. All information correct/Exit");
        System.out.println("The details are ..");
        System.out.println("name = "+obj.getName());
        System.out.println("address = "+obj.getAddress());
        System.out.println("mobile = "+obj.getMobile());
        break;
default:System.out.println("Invalid Input");
}
}
}
        
		
      

