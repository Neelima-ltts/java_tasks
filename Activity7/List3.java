import java.util.*;
public class List3 {

public static void main(String[] args) {
// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      ArrayList<String> al1 = new ArrayList<String>();
      ArrayList<String> al2 = new ArrayList<String>();
      System.out.println("Enter the top 5 scorers of IPL Season 13");
      for(int i=0;i<5;i++) {
     al1.add(sc.next());
      }
      System.out.println("Enter the top 5 scorers of IPL Season 12");
      for(int j=0;j<5;j++) {
     al2.add(sc.next());
      }
      System.out.println("Consistent run scorers");
      for(int k=0;k<5;k++) {
     for(int l=0;l<5;l++) {
     if(al1.get(k).equalsIgnoreCase(al2.get(l))) {
     System.out.println(al1.get(k));
     }
     }
      }
}

}

