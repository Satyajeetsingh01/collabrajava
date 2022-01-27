import java.util.Scanner;
class Mlarge
{
  public static void add(int k, int l)
	{
	  System.out.println (" sum is: " + (k+l));
	}

   public static void add(int m, int n, int o)
	{
		      
			  System.out.println (" sum is: " + (m+n+o));
	}

   public static void add(int p, int q, int r, int s)
	{
		      
			  System.out.println (" sum is: " + (p+q+r+s));
	}

	public static void main(String[] args) 
	{
		Scanner s= new Scanner (System.in);
		System.out.println("-------Welcome-------");
        System.out.println(" Press 1 to add 2 numbers");
	    System.out.println(" Press 2 to add 3 numbers");
		System.out.println(" Press 3 to add 4 numbers"); 
			int a= s.nextInt();
            
	     	while(a>0)
		{

			   if (a==1)
			  { 
              System.out.println(" Enter two numbers");
              int b= s.nextInt();
			  int c= s.nextInt();
			  add(b,c);
			   }
             
			  
			else if (a==2)
			  {
			  System.out.println(" Enter three numbers");
              int d= s.nextInt();
			  int e= s.nextInt();
			  int f= s.nextInt();
			  add(d,e,f);
			  }

           else if (a==3)
			  {
			  System.out.println(" Enter four numbers");
              int g= s.nextInt();
			  int h= s.nextInt();
			  int i= s.nextInt();
			  int j= s.nextInt();
              add(g,h,i,j);
			   }

			else if ( a>3 || a<1)
			
		      {
              System.out.println ("-------Invalid Choice!!!--------");
			  }
			  System.out.println (" Press 1 for continue");
			  System.out.println (" Press any other number to stop");
			  int n= s.nextInt();
			  if(n==1)
				{
				    System.out.println(" Press 1 to add 2 numbers");
	                System.out.println(" Press 2 to add 3 numbers");
		            System.out.println(" Press 3 to add 4 numbers"); 
					int p=s.nextInt();
					a=p;
					continue;
					}

				else if (n>1 || n<1)
				{ System.out.println ("------Thank you--------");
				break;
				}
				//break;
                 
		}     
				
			
              }


}