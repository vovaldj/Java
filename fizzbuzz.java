import java.util.*;
class fizzbuzz{
public static void main(String [] args){
int n;
int i=0;
System.out.println("Eneter a No.");
Scanner sc= new Scanner(System.in);
n=sc.nextInt();

for(i=0;i<10;i++){
if(n%15==0){
System.out.println("FizzBuzz");
break;
}

else{
if(n%5==0){
System.out.println("Buzz");
    break;}
else
{
if(n%3==0){
System.out.println("Fizz");
break;}

else{
System.out.print("No. is not multiple of 15 ,3 and 5");
break;
}}}
}
System.out.println("Done");
}
}