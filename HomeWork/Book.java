import java.util.*;

class Book{
	String Title, Author,Publication;
	int pages;
	
	Scanner sc=new Scanner(System.in);
	
	
	void getData()
	{
		System.out.println("Enter Name of Book:		");
		Title = sc.nextLine();
		
		System.out.println("Enter Name of Author:		");
		Author = sc.nextLine();
		
		System.out.println("Enter Name of Publication:		");
		Title = sc.nextLine();
		
		System.out.println("Enter No. of Pages:		");
		pages = sc.nextInt();	
		
	}
	
	void printData()
	{
		System.out.println("Name of Book is:		"+Title);
		System.out.println("Name of Author is:		"+Author);
		System.out.println("Name of Punlication is:		"+Publication);
		System.out.println("No. of Pages are:		"+pages);	
	}
		
	public static void main(String [] args){
		Book B = new Book();
			 B.getData();
			 B.printData();
	}

}