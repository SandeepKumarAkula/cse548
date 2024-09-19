import java.lang.*;
import java.io.*; 
class Addition
{
public static void main(String args[ ])throws IOException
{
int r,c,i,j;
int a[][]=new int[10][10];
int b[][]=new int[10][10];
int c[][]=new int[10][10];
Buffered Reader br=new Buffered Reader(new InputStream Reader(System.in());
System.out.println("enter the number of rows");
r=Integer.parseInt(br.readline ( ));
System.out.println("enter number of columns");
c=Integer.parseInt(br.readline( ));
System.out.println("enter"+r*c+"elements of matrix a");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
a[i][j]=Integer.parseInt(br.readline());
}
}
System.out.println("enter"+r*c+"elements of matrix b");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
b[i][j]=Integer.parseInt(br.readline());
}
}
System.out.println("the addition of matrix a and b is ");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
System.out.print(c[i][j]+"\t");
}
Sysytem.out.println( );
}
}
}
