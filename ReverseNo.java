import java.util.*;

class reverseno{

public static void main(String[] args){
int i,rev=0;
int rem=0;
System.out.println("Enter the no");
Scanner sc = new Scanner(System.in);
int no= sc.nextInt();

while(no!=0){
rem=no%10;
rev=rev*10+rem;
no=no/10;
}
System.out.println(rev);
}
}