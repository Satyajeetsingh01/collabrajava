//Question 23 print the strong no in the given range
class Strongnorange
{
public static void main(String[] args) 
{
for(int num=1;num<=1000;num++)
{
int sum=0;
int num1=num;
while(num1>0)
{
int temp=num1%10;
sum=sum+fact(temp);
num1=num1/10;
}
if(sum==num)
{
System.out.println("Strong no"+sum);
}
}
}

public static int fact(int n)
{
int fact=1;
for(int i=1;i<=n;i++)
{
fact=fact*i;
}
return fact;
}
}
