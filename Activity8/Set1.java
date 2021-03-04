import java.util.*;
public class Set1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
     Scanner sc = new Scanner(System.in);
     HashSet<String> hs = new HashSet<>();
     num = sc.nextInt();
     for(int i=0;i<num;i++) {
    	 hs.add(sc.next());
     }
     System.out.println(hs.size());
     
	}

}
