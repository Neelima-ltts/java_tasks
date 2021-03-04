mport java.util.ArrayList;
import java.util.Scanner;
public class List_4 {

public static void main(String[] args) {
// TODO Auto-generated method stub
int num;
int count = 0;
int count1 = 0;
     Scanner sc = new Scanner(System.in);
     ArrayList<Integer> al = new ArrayList<>();
     num = sc.nextInt();
     for(int i=0;i<num;i++) {
    al.add(sc.nextInt());
     }
     for(int i=0;i<num;i++) {
     if(al.get(i)>=50 && al.get(i)<60) {
    count++;
     }
     }
     System.out.println(count);
     for(int j=0;j<num;j++) {
         if(al.get(j)>=100) {
        count1++;
         }
         }
         System.out.println(count1);
}

}
