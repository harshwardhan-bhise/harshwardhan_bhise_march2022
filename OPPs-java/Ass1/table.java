import java.util.*;

class table{
	Scanner sc=new Scanner(System.in);
	
	void calc(){
		System.out.println("Enter the number to create table:	");
		int n=sc.nextInt();
	
		for(int i=n;i<n+1;i++){
			for(int j=1;j<=10;j++){
				System.out.println(i+"*"+j+"="+(i*j));
				
			}
		}
	}
		
	public static void main(String[] args){
		table t=new table();
		t.calc();
	}
}