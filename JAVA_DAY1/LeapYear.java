import java.util.*;
class LeapYear{
public static int checkLeapYear(int year){
boolean leap = false;
int res = 0;
if(year>0){
 if (year % 4 == 0) {

      // if the year is century
      if (year % 100 == 0) {

        // if year is divided by 400
        // then it is a leap year
        if (year % 400 == 0)
          leap = true;
        else
          leap = false;
      }
// if the year is not century
      else
        leap = true;
    }
    
    else
      leap = false;
}
else {
	res = -1;
}
    if (leap)
      res = 1;
    else
      res = 0;
 return res;
}
public static void main(String args[]){
int y;
Scanner sc = new Scanner(System.in);
y = sc.nextInt();
int result= checkLeapYear(y);
if(result == 1){
System.out.println("LeapYear");
}
else if(result == 0){
System.out.println("Not a LeapYear");
}
else {
System.out.println("Invalid Year");
}
}
}