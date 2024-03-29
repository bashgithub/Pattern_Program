package com.pattern.basics;

public class PatternMethod2 {

	public static void main(String[] args) {
		
          for(int i=1; i<=5; i++)
          {
    		  
          for(int j=5; j>i; j--)
          { 
        	  System.out.print(" ");
          }
        
          int k=1;

        	  for(int l=1; l<=i; l++)
        	  {
        	  System.out.print(k+ " ");
        	  k=k*(i-k)/(k);
        	 
          } 
          
             System.out.println();
          }
	}

}
