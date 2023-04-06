package day09;

import java.util.Scanner;
import java.lang.String;

public class Program02 {

	public static void main(String[] args) {
		// My Task of Mobile Shopping given on day08
		int mBrand;
		int mColor;
		int mAvail;
		Scanner x=new Scanner(System.in);
		System.out.println("Welcome to Mobile Shopping!!!");
		System.out.println("1. Samsung");
		System.out.println("2. OnePlus");
		System.out.println("3. iPhone");
		System.out.println("Please Enter the number for Brand Selection: ");
		mBrand=x.nextInt();
		if(mBrand==1)
		{
			System.out.println("Samsung Color Options");
			System.out.println("1. Ceramic White");
			System.out.println("2. Aqua Blue");
			System.out.println("3. Mystic Bronze");
			System.out.println("Please Enter the number for Color Selection: ");
			mColor=x.nextInt();
			if(mColor==1)
			{
				System.out.println("Samsung - Ceramic White");
				System.out.println("Price ranges between 20K-22K");
				System.out.println("Choose the number to Continue: ");
				System.out.println("1. Yes");
				System.out.println("2. No");
				mAvail=x.nextInt();
				if(mAvail==1)
				{
					System.out.println("Samsung - Ceramic White is Available to Purchase");
				}
				if(mAvail==2)
				{
					System.out.println("Thank you for the visit!!!");
				}					
			}
			else if(mColor==2)
			{
				System.out.println("Samsung - Aqua Blue");
				System.out.println("Price ranges between 19K-20K");
				System.out.println("Choose the number to Continue: ");
				System.out.println("1. Yes");
				System.out.println("2. No");
				mAvail=x.nextInt();
				if(mAvail==1)
				{
					System.out.println("Samsung - Aqua Blue is Not Available to Purchase");
				}
				if(mAvail==2)
				{
					System.out.println("Thank you for the visit!!!");
				}					
			}
			else if(mColor==3)
			{
				System.out.println("Samsung - Mystic Bronze");
				System.out.println("Price ranges between 22K-24K");
				System.out.println("Choose the number to Continue: ");
				System.out.println("1. Yes");
				System.out.println("2. No");
				mAvail=x.nextInt();
				if(mAvail==1)
				{
					System.out.println("Samsung - Mystic Bronze is Available to Purchase");
				}
				if(mAvail==2)
				{
					System.out.println("Thank you for the visit!!!");
				}					
			}
			
		}
		if(mBrand==2)
		{
			System.out.println("OnePlus Color Options");
			System.out.println("1. Blue Tide");
			System.out.println("2. Sierra Black");
			System.out.println("3. Grey Shadow");
			System.out.println("Please Enter the number for Color Selection: ");
			mColor=x.nextInt();
			if(mColor==1)
			{
				System.out.println("OnePlus - Blue Tide");
				System.out.println("Price ranges between 19K-21K");
				System.out.println("Choose the number to Continue: ");
				System.out.println("1. Yes");
				System.out.println("2. No");
				mAvail=x.nextInt();
				if(mAvail==1)
				{
					System.out.println("OnePlus - Blue Tide is Not Available to Purchase");
				}
				if(mAvail==2)
				{
					System.out.println("Thank you for the visit!!!");
				}					
			}
			else if(mColor==2)
			{
				System.out.println("OnePlus - Sierra Black");
				System.out.println("Price ranges between 31K-32K");
				System.out.println("Choose the number to Continue: ");
				System.out.println("1. Yes");
				System.out.println("2. No");
				mAvail=x.nextInt();
				if(mAvail==1)
				{
					System.out.println("OnePlus - Sierra Black is Available to Purchase");
				}
				if(mAvail==2)
				{
					System.out.println("Thank you for the visit!!!");
				}					
			}
			else if(mColor==3)
			{
				System.out.println("OnePlus - Grey Shadow");
				System.out.println("Price ranges between 28K-29K");
				System.out.println("Choose the number to Continue: ");
				System.out.println("1. Yes");
				System.out.println("2. No");
				mAvail=x.nextInt();
				if(mAvail==1)
				{
					System.out.println("OnePlus - Grey Shadow is Available to Purchase");
				}
				if(mAvail==2)
				{
					System.out.println("Thank you for the visit!!!");
				}					
			}
			
		}
		if(mBrand==3)
		{
			System.out.println("iPhone Color Options");
			System.out.println("1. Midnight Green");
			System.out.println("2. Silver");
			System.out.println("3. Star Light");
			System.out.println("Please Enter the number for Color Selection: ");
			mColor=x.nextInt();
			if(mColor==1)
			{
				System.out.println("iPhone - Midnight Green");
				System.out.println("Price ranges between 39K-40K");
				System.out.println("Choose the number to Continue: ");
				System.out.println("1. Yes");
				System.out.println("2. No");
				mAvail=x.nextInt();
				if(mAvail==1)
				{
					System.out.println("iPhone - Midnight Green is Available to Purchase");
				}
				if(mAvail==2)
				{
					System.out.println("Thank you for the visit!!!");
				}					
			}
			else if(mColor==2)
			{
				System.out.println("iPhone - Silver");
				System.out.println("Price ranges between 54K-55K");
				System.out.println("Choose the number to Continue: ");
				System.out.println("1. Yes");
				System.out.println("2. No");
				mAvail=x.nextInt();
				if(mAvail==1)
				{
					System.out.println("iPhone - Silver is Available to Purchase");
				}
				if(mAvail==2)
				{
					System.out.println("Thank you for the visit!!!");
				}					
			}
			else if(mColor==3)
			{
				System.out.println("iPhone - Star Light");
				System.out.println("Price ranges between 79K-80K");
				System.out.println("Choose the number to Continue: ");
				System.out.println("1. Yes");
				System.out.println("2. No");
				mAvail=x.nextInt();
				if(mAvail==1)
				{
					System.out.println("iPhone - Star Light is Not Available to Purchase");
				}
				if(mAvail==2)
				{
					System.out.println("Thank you for the visit!!!");
				}					
			}
			x.close();			
		}
	}

}
