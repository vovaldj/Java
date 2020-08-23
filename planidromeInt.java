import java.util.*;

class planidromeInt{

public static void main(String[] args){
int i,rev=0;
int rem=0,temp=0;
System.out.println("Enter the no");
Scanner sc = new Scanner(System.in);
int no= sc.nextInt();
temp=no;
while(temp!=0){
rem=temp%10;
rev=rev*10+rem;
temp=temp/10;
}
if (no==rev)
System.out.println("Planidrome Exist " +no);
else
System.out.println("Planidrome does not Exist" + no);
}
}