import java.util.*;
class CricketerId{
public static void  findCricketerId(int a[], int size, int score){
if(size<0){
System.out.println("Invalid array size");
}
for(int i=1;i<size;i=i+2){
if(a[i]<0){
System.out.println("Invalid score");
}
else if(a[i-1]<0){
System.out.println("Invalid score");
}
if(a[i] > score){
System.out.println(a[i-1]);
}
}
}
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int l,p;
l=sc.nextInt();
p=sc.nextInt();
int[] arr = new int[l];
for(int j=0;j<l;j++){
arr[j] = sc.nextInt();
}
findCricketerId(arr,l,p);
}
}