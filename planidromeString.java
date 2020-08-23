
import java.util.*;

class planidromeString{

public static void main(String[] args){

String initial, rev="";
Scanner in=new Scanner(System.in);
System.out.println("Enter the string to reverse");
initial=in.nextLine();

int length=initial.length();

for(int i=length-1;i>=0;i--)
rev=rev+initial.charAt(i);

System.out.println("Normal string: "+initial);
System.out.println("Reversed string: "+rev);

if (initial.equals(rev))
System.out.println("Palnidrome Exist");
else
System.out.println("Palnidrome does not Exist");
}
}