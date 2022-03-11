
import java.util.*;

class DietPlan{
	char Gender;
	String Nuetrients;
	int age;
	float weight;
	
	Scanner sc=new Scanner(System.in);
	
	/*void setdata(char Gender, String Nuetrients, int age, float weight)
	{
		this.Gender=Gender;
		this.Nuetrients=Nuetrients;
		this.age=age;
		this.weight=weight;
	}*/
	
	void getdata()
	{
		System.out.println("What is your Gender(M/F):	");
		Gender=sc.next().charAt(0);
		
		//	sc.nextLine();
		System.out.println("What Nuetrients you take:	");
		Nuetrients=sc.next();
		
	
		
		System.out.println("What is Age:				");
		age=sc.nextInt();
		
		System.out.println("What is your Weight:		");
		weight=sc.nextFloat();
				
			
	}
	
	void printdata()
	{
		System.out.println("Your Gender:	"+Gender);
		System.out.println("Your Nuetrients:	"+Nuetrients);
		System.out.println("Your Age:	"+age);
		System.out.println("Your Weight:	"+weight);
		
		
		
	}

public static void main(String[] args)
{
	DietPlan d = new DietPlan();
	//d.setdata(M,GY);
	d.getdata();
	d.printdata();
}
}