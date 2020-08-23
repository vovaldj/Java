class maxno{
static int a[]={10,50,20,10,30};

static int max()
{
int i,max=0;
max=a[0];
for (i=1; i<a.length; i++)
{
if (a[i]>max)
max=a[i];
}
return max;
}

public static void main(String[] args)
{
System.out.println("Largest no. is" + " " + max());
}

}