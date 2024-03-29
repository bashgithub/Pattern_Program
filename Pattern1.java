package com.pattern.basics;

public class Pattern1 {

	public static void main(String[] args) {
		
		for(int i=1; i<=3; i++)
		{
		   for(int k=3; k>i; k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i; j++)
			{
				System.out.print(j+" ");
			}
			for(int n=1; n<i; n++)
			{
				System.out.print(n+" ");
			}
			System.out.println();
		}

	}

}

 