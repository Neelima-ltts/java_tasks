
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
public class Set2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
     @SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
     HashSet<String> hs = new HashSet<>();
     num = sc.nextInt();
     for(int i=0;i<num;i++) {
    	 hs.add(sc.next());
     }
     ArrayList<String> list = new ArrayList<String>(hs); 
     Collections.sort(list); 
     
     for(String e:list) {
    	 System.out.println(e);
     }
     
	}
}