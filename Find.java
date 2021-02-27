import java.util.*;
class Find{
public static int findElementCount(int size,int a[],int x){
int res = 0;
int count = 0;
if(size<0 || x<0){
 res = -1;
}
else{
for(int i=0;i<size;i++){
if(a[i]<0){
res = -1;
}
if(a[i]==x){
count++;
res = count;
}
}
}
return res;
}
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int s,ele;
s = sc.nextInt();
int arr[] = new int[s];
for(int j=0;j<s;j++){
arr[j] = sc.nextInt();
}
ele = sc.nextInt();
int result = findElementCount(s,arr,ele);
if(result == -1){
System.out.println("Invalid Input");
}
else{
System.out.println(result);
}
}
}

