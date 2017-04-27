// program to find the highest amoung 3 numbers
class Highest
{
    public static void main(String args[])
	{  
        System.out.println("enter 3 values");	 
           int a=Integer.parseInt(System.console().readLine());
	   int b=Integer.parseInt(System.console().readLine());// for reading a,b,c values
	   int c=Integer.parseInt(System.console().readLine());
	   if(a>b&&a>c)
                System.out.println(a+"   is highest");        // comparision for finding logic
	   else if(b>a&&b>c)
	        System.out.println(b+ "  is highest");
	   else
	        System.out.println(c+"  is highest");

	   
	}
	
	
}