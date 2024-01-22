import java.util.*;
class Starifier
{
	public static void main(String[] args)
    {
    System.out.println("Enter any string of your choice...");
    Scanner sc = new Scanner(System.in);
    String name1= sc.nextLine();
	String name2= name1.toUpperCase();
	System.out.print("Here is the * pattern for string : " + name1);
	System.out.println();
	System.out.println();
   
    int i;
    int j;
	int k;

    for(i = 0; i<name2.length(); i++)
    { 
		char c = name2.charAt(i);

		//A
        if(c== 'A')
        {
        	for (j=1;j<=10 ;j++)
		    {
			      for (k=1;k<=10 ;k++)
			   {
				     if (j==1 || j==6 || k==1 || k==10 )
				   {
					     System.out.print("*");
				   }
				    else
				   {
					     System.out.print(" ");

				   }
			    }
			         	System.out.println();
			}
		  
			  System.out.println();
        }

        //B
        else if(c=='B')
        {
            for (j=1;j<=10 ;j++)
		    {
			    for (k=1;k<=10 ;k++)
			   {
				     if (j==1 && k<=9 || j==5 && k<=9 || j==10 && k<=9 || k==1 || k==10 && (j!=1 && j!=10 && i!=5))
				   {
					     System.out.print("*");
				   }
				    else
				   {
					    System.out.println(" ");

				   }
			   }
			       System.out.println();
		
		    }
		        
				System.out.println();
                
        } 
           //C
            else if(c=='C')
            {
                for (j=1;j<=10 ;j++)
		        {
			         for (k=1;k<=10 ;k++)
			          {
				            if (j==1 && k<=9|| j==10 && k<=9 || k==1 )
				           {
					           System.out.print("*");
				           }
				          else
				          {
					           System.out.print(" ");
                          }
			           }
			                 System.out.println();
				}
                
		    }


			//D
            else if(c=='D')
            {
                   for (j=1;j<=10 ;j++)
	         	{     
			           for (k=1;k<=10 ;k++)
		         	{
				          if (j==1 && k<=9 ||j==10 && k<=9 || k==1 || k==10 && (j!=1 && j!=10))
			        	{
					          System.out.print("*");
				        }
				          else
				        {
					          System.out.print(" ");
					    }
			        }
			             System.out.println();
				}  
		                System.out.println();
			}


			//E
			  else if(c=='E')
			  {
				       for (j=1;j<=10 ;j++)
		   {
			for (k=1;k<=10 ;k++)
			{
				if (j==1 && k<=9|| j==10 && k<=9||j==5 && k<=9 || k==1 )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");

				}
			}
			System.out.println();
		
		}
		System.out.println();
                  
			  }


			//F
			else if(c=='F')
			  {
				for (j=1;j<=10 ;j++)
		{
			for (k=1;k<=10 ;k++)
			{
				if (j==1 || j==5 || k==1 )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");

				}
			}
			System.out.println();
		
		}
		System.out.println();
				
			  }

			//G
			else if(c=='G')
			  {
				
			for (j=1;j<=10 ;j++)
		    {
			for (k=1;k<=10 ;k++)
			{
				if (j==1 || j==10 || k==1 || k==10 && j>=5|| j==5 && k>=5 )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");

				}
			}
			System.out.println();
		
		}
		System.out.println();
			  }


			//H
			else if(c=='H')
			  {
				
		for (j=1;j<=10 ;j++)
		{
			for (k=1;k<=10 ;k++)
			{
				if (k==1 || j==5 || k==10 )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");

				}
			}
			System.out.println();
		
		}
		System.out.println();

			  }


			//I
			else if(c=='I')
			  {
				for (j=1;j<=10 ;j++)
		{
			for (k=1;k<=10 ;k++)
			{
				if (j==1 || k==5|| j==10 )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");

				}
			}
			System.out.println();
		
		}
		System.out.println();
			  }


			//J
			else if(c=='J')
			  {
				for (j=1;j<=10 ;j++)
		{
			for (k=1;k<=10 ;k++)
			{
				if (j==1 || k==6|| j==10 && k<=6 )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");

				}
			}
			System.out.println();
		
		}
		System.out.println();
			  }


			//K
			else if(c=='K')
			  {
				for (j=1;j<=10 ;j++)
		{
			for (k=1;k<=10 ;k++)
			{
				if (k==1 || j==k && j>=5 || k==9-j && j<=6 )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");

				}
			}
			System.out.println();
		
		}
		System.out.println();
		
			  }


			//L
			else if(c=='L')
			  {
			for (j=1;j<=10 ;j++)
		{
			for (k=1;k<=10 ;k++)
			{
				if (j==10 ||k==1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");

				}
			}
			System.out.println();
		
		}
		System.out.println();
			  }
			//M
			else if(c=='M')
			  {
				for (j=1;j<=10 ;j++)
		{
			for (k=1;k<=10 ;k++)
			{
				if (k==1 ||k==10 || j==k-1 && j<=4 && k<=5|| k==10-j && j<=4 && k>=5)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");

				}
			}
			System.out.println();
		
		}
		System.out.println();
				
			  }
			//N
			else if(c=='N')
			  {
				for (j=1;j<=10 ;j++)
		{
			for (k=1;k<=10 ;k++)
			{
				if (k==1 ||k==10 || j==k)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");

				}
			}
			System.out.println();
		
		}
		System.out.println();
			  }


			//O
			else if(c=='O')
			  {
				for (j=1;j<=10 ;j++)
		{
			for (k=1;k<=10 ;k++)
			{
				if (j==1 && k<=9 && k!=1 ||j==10 && k<=9 && k!=1 || k==1 && (j!=1 && j!=10) || k==10 && (j!=1 && j!=10))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");

				}
			}
			System.out.println();
		
		}
		System.out.println();
				
			  }


			//P
			else if(c=='P')
			  {
				for (j=1;j<=10 ;j++)
		{
			for (k=1;k<=10 ;k++)
			{
				if (j==1 ||k==1|| j==5 || k==10 && j<=5)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");

				}
			}
			System.out.println();
		
		}
		System.out.println();
			  }


			//Q
			else if(c=='Q')
			  {
				for (j=1;j<=10 ;j++)
		{
			for (k=1;k<=10 ;k++)
			{
				if (j==1 && k<=9 && k!=1 ||j==10 && k<=9   || k==1 && (j!=1 && j!=10) || k==10 && j!=1 || j==k && j>=5 && k>=5 )
				
				
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");

				}
			}
			System.out.println();
		
		}
		System.out.println();
			  }


			//R
			else if(c=='R')
			  {
				for (j=1;j<=10 ;j++)
		{
			for (k=1;k<=10 ;k++)
			{
				if (k==1 ||j==1 || j==5|| k==10 && j<=5 || j==k && j>=5)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");

				}
			}
			System.out.println();
		
		}
		System.out.println();
			  }


			//S
			else if(c=='S')
			  {
				for (j=1;j<=10 ;j++)
		{
			for (k=1;k<=10 ;k++)
			{
				if (j==1||j==5 || k==1 && j<=5 || j==10 ||k==10 && j>=5)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");

				}
			}
			System.out.println();
		
		}
		System.out.println();
			  }


			//T
			else if(c=='T')
			  {
				for (j=1;j<=10 ;j++)
		{
			for (k=1;k<=10 ;k++)
			{
				if (j==1 ||k==5)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");

				}
			}
			System.out.println();
		
		}
		System.out.println();
			  }


			//U
			else if(c=='U')
			  {
				for (j=1;j<=10 ;j++)
		{
			for (k=1;k<=10 ;k++)
			{
				if (j==10 ||k==10 || k==1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");

				}
			}
			System.out.println();
		
		}
		System.out.println();
			  }


			//V
         else if(c=='V')
		 {
			for (j=0;j<=10 ;j++)
		{
			for (k=0;k<=10 ;k++)
			{
				if (j==k && j<= 5|| k==10-j && j<=5)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");

				}
			}
			System.out.println();
		
		}
		System.out.println();
		 }


			//W
		else if(c=='W')
			  {
				for (j=1;j<=10;j++)
		   {
			for (k=1;k<=10 ;k++)
			{
				if (k==1 ||k==10 || j==k-1 && j>=5 && k>=5|| k==10-j && j>=4 && k<=5)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");

				}
			}
			System.out.println();
		
		}
		System.out.println();
			  }


			//X
			else if(c=='X')
			  {
				for (j=1;j<=10 ;j++)
		{
			for (k=1;k<=10 ;k++)
			{
				if (j==k || k==11-j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");

				}
			}
			System.out.println();
		
		}
		System.out.println();
			  }


			//Y
			else if(c=='Y')
			  {
				for (j=1;j<=10 ;j++)
		{
			for (k=1;k<=10 ;k++)
			{
				if (j==k && j<=5 || k==10-j && j<=5 || k==5 && j>=6)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");

				}
			}
			System.out.println();
		
		}
			  }


			//Z
			else if(c=='Z')
			  {
				for (j=1;j<=10 ;j++)
		{
			for (k=1;k<=10 ;k++)
			{
				if (j==1 ||j==10 || k==11-j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");

				}
			}
			System.out.println();
		
		}
		System.out.println();
    }
      
   }
   System.out.println("Thank You !..");
   
}	
}



    

 