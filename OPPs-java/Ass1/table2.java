//creating a table using sigle for loop

import java.util.*;

class table2{
	Scanner sc=new Scanner(System.in);
	
	void calc(){
		System.out.println("Enter the number to create table:	");
		int n=sc.nextInt();
	
		
			for(int j=1;j<=10;j++){
				System.out.println(j+"*"+n+"="+(j*n));
				
			}
		
	}
		
	public static void main(String[] args){
		table t=new table();
		t.calc();
	}
}