import java.util.*;
import java.io.*;
import java.lang.Math.*;
class A
{
public static void main(String args[])
{
int n,c,d,p,x,i,j,e;
Scanner s=new Scanner(System.in);
n=s.nextInt();
for(i=0;i<n;i++)
{
c=s.nextInt();
d=s.nextInt();
e=s.nextInt();
x=0;
for(j=0;j<e;j++)
{
x=x+(c+(int)(Math.pow(2,j)*d));
System.out.print(x+" " );
}
System.out.println("\n");
}
}
}


