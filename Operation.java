import java.util.*;
class Operation{
public static int arithmeticOperation(int a,int b,int c){
int result=0;
if(a<32767 && b<32767 && a>0 && b>0 && c>0 && c<=4){
if(c==1){
result=a+b;
}
else if(c==2){
result=a-b;
}
else if(c==3){
result=a*b;
}
else{
result=a/b;
}
}
else if(a>32767 || b>32767 || a<0 || b<0 || c<0 || c>4){
 result=-1;
}
 return result;
}
public static void main(String args[]){
int x,y,z;
Scanner sc = new Scanner(System.in);
x= sc.nextInt();
y= sc.nextInt();
z= sc.nextInt();
int res = arithmeticOperation(x,y,z);
if(res == -1){
System.out.println("Invalid Input");
}
else{
System.out.println(res);
}
}
}
