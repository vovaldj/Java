import java.util.*;
class primeno{
public static void main(String [] args)
{
int n,counter =0;
int i=0;
System.out.println("Enter the No.");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(i=2;i<n/2;i++){
    if(n%i==0)
{
counter =counter+1;
}
}
if(counter == 0)
System.out.println("Prime No." +n);
else
System.out.println("Not a Prime No." +n);

System.out.println("Done");
}
}