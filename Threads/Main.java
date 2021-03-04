package ThreadDemo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException {
  Scanner sc=new Scanner(System.in);
 
  String ip="";
  //SortScore s = new SortScore();
  String match="";
 
	for(int i=0;i<3;i++)
	{ 
		 System.out.println("Enter the Match : ");
		  match=sc.nextLine();
		  System.out.println("Enter the Scores : ");
		  ip=sc.nextLine();
		  String[] s1=ip.split(",");	
		  SortScore s=new SortScore(match, ip);
		  s.setScore(s1);
		  System.out.println("Ordered Score List");
			 
		  s.start();
		  s.join();
		 
	}
	 
	  
	
	 
 

	}

}
