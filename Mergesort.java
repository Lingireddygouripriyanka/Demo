import java.util.*;
import java.lang.*;
import java.io.*;
public class Mergesort
{
static int a[10],c[10];
static int i,j,n,m,l,h,k;
static Scanner sc;
public static void sort(int a[],int l,int h)
{
if(l<h){
m=l+h/2;
sort(a,l,m);
sort(a,m+1,h);
merge(a,l,h,m);
}
}
public static void merge(int a[],int l,int h,int m)
{
i=l;
j=m+1;
k=l;
while((i<=m)&&(j<=h))
{
if(a[i]<a[j])
{
c[k]=a[i];
k++;
i++;
}
else
{
c[k]=a[j];
k++;
j++;
}
}
while(i<=m) c[k++]=a[i++];
while(j<=n) c[k++]=a[j++];
for(i=l;i<=k;i++)
a[i]=c[i];
}
public static void main(String args[])
{
sc=new Scanner(System.in);
System.out.println("Enter range");
n=sc.nextInt();
a=new int[n];
System.out.println("Enter array elements");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println("Before sorting");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
sort(a,0,n-1);
System.out.println("After sorting");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
}
}
