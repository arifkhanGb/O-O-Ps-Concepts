package basicJava;
import java.util.*;

public class firstJavaClass {

	public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
    /* int a[][]=new int[3][3];
     int b[][]=new int[3][3];
     int c[][]=new int[3][3];
     System.out.println("enter first matriz");
     for(int i=0;i<3;i++)
     {
    	 for(int j=0;j<3;j++)
    	 {
    		 a[i][j]=s.nextInt();
    	 }
    	 
     }
     System.out.println("enter second matriz");
     for(int i=0;i<3;i++)
     {
    	 for(int j=0;j<3;j++)
    	 {
    		 b[i][j]=s.nextInt();
    	 }
    	 
     }
     System.out.println("some of matrix");
     for(int i=0;i<3;i++)
     {
    	 for(int j=0;j<3;j++)
    	 {
    		c[i][j]=a[i][j]+b[i][j];
    	 }
    	 
    	 
     }
     System.out.println("some of matrix");
     for(int i=0;i<3;i++)
     {
    	 for(int j=0;j<3;j++)
    	 {
    	 System.out.print("  "+ c[i][j]);
    	 }
    	 System.out.println();
    	 
    	 
     }*/
    	int sum=0,i;	 
     int a[]=new int [6];
     for( i=0;i<=5;i++)
     {
    	 a[i]=s.nextInt();
    	 
     }
     for( i=0;i<=5;i++)
     {
    	 System.out.print(a[i]);
    	   
     }

     for(i=0;i<=5;i++)
     {
     sum=sum+a[i];
     }
     System.out.println("sum is ="+sum);
     
     

	}

}
