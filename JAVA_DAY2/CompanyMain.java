import java.util.*;
public class CompanyMain{
public static void main(String[] args){
String comp_name;
String employees;
string team_lead;
Scanner sc = new Scanner(System.in);
Company obj = new Company();
System.out.println("Enter company name");
comp_name = sc.nextLine();
System.out.println("Enter employee names");
employees = sc.nextLine();
String[] list = employees.split(',');
System.out.println("Enter Teamlead");
team_lead = sc.nextLine();
obj.setName(comp_name);
obj.setEmployees(employees);
obj.setTeamlead(team_lead);
for(int i=0;i<list.length();i++){
	if(team_lead.equals(list[i])){
		System.out.println("Name : "+obj.getName);
		System.out.println("Employees : "+obj.getEmployees);
		System.out.println("Lead : "+obj.getTeamlead);
	}
	else{
		System.out.println("Invalid Input");
	}
}
}
}