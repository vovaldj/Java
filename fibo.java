class fibo{
public static void main(String [] args)
{
int n1=0,n2=1,t=0;
int i=0;
System.out.println("Fibonnaci Series");
for(i=0;i<10;i++){
    t=n1+n2;
    System.out.println(t);
    n1=n2;
    n2=t;
}
System.out.println("Done");
}
}