//calculate salary of Employee using Method overriding

import java.util.*;

class Salary{
	double sal;
	double basicPay;
	double DA,incentive;
	int days,hour=100;
	double totalSalary;
	
	Scanner sc=new Scanner(System.in);
	
	void getData()
		{
			System.out.println("Enter the Basic pay:	");
			basicPay=sc.nextDouble();			
		}
		
	void tSalary()
		{
			DA=basicPay/10;
			System.out.println("Your DA is:	"+DA);
			
			incentive=(basicPay*7)/100;
			System.out.println("Your incentive is:	"+incentive);
			
			totalSalary=basicPay+DA+incentive;
			System.out.println("Your Salary is:	"+totalSalary);
			
		}
		
	void work()
		{
			System.out.println("How many days in month employee is absent:	");	
			int days=sc.nextInt();
			
			System.out.println("How many extra hour in month employee is absent:	");	
			int hour=sc.nextInt();
						
		}
		
	void calculate()
		{
			
			days=8*hour;
			double inHand=totalSalary-days-hour;
			System.out.println("Salary in Hand:	"+inHand);
		}
		
	
	public static void main(String[] args){	
		Salary s= new Salary();
		s.getData();
		s.tSalary();
		s.work();
		s.calculate();
		
	}

}