import java.util.*;
public class Quicksort
{
static int a[5];
static int l,u,i,j,temp,n,piv;
static Scanner sc;
public static void quicksort(int a[],int l,int u)
{
if(l<u)
{
i=partition(a,l,u);
quicksort(a,l,i-1);
quicksort(a,i+1,u);
}
}
public static int partition(int a[],int l,int u)
{
i=l;
j=u+1;
piv=a[l];
while(true)
{
do ++i;while((a[i]<=piv)&&(i<=u));
do --j;while(a[j]>piv);
if(i>=j)
break;
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
temp=a[l];
a[l]=a[j];
a[j]=temp;
return j;
}
public static void main(String args[])
{
sc=new Scanner(System.in);
System.out.println("Enter the range");
n=sc.nextInt();
a=new int[n];
System.out.println("Enter array elements");
for(i=0;i<n;i++)
a[i]=sc.nextInt();
System.out.println("Before sorting");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
quicksort(a,0,n-1);
System.out.println("After sorting");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
}
}

