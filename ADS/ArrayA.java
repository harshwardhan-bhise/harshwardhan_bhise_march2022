import java.util.*;

class ArrayA{
	int n,j,key;
	int a[]=new int[10];
	
    Scanner sc=new Scanner(System.in);
	
	
	void getData(){
		System.out.println("How many Array elements you want to store:	");
		 n=sc.nextInt();
			
		
		System.out.println("Enter Array Elements:	");
		for(int i=0;i<n;i++){	
			a[i]=sc.nextInt();
		}
	}	
	void printData(){	
		System.out.println("Array Elements are:	");
		for(int i=0;i<n;i++){		
			System.out.println(a[i]);
		}
	}

	void AddElement(){
			int j=0;
					System.out.println("How many more Elements you want to add:	");
					n=sc.nextInt();
					
					System.out.println("Enter elements you want add in Array 	");
					for(int i=0;i<n;i++)
						a[i]=sc.nextInt();
					System.out.println("New Array Elements are:	");
					for(int i=0;i<n;i++){
						System.out.println(a[i]);
				}	
	}
	
	void Search(){
		System.out.println("Enter number you want to search:	");
		key=sc.nextInt();
			
		for(int j=0;j<n;j++)
		{
			if(a[j]== key)
				break;
		}
		if(a[j]==n)
		System.out.println("Number "+key+" is not present in list");
		else
		System.out.println("Number " +key+ " is present in list");
			
	}
	
	void Delete(){
		System.out.println("Enter the number you want to delete from the list:	");
		key=sc.nextInt();
		for(j=0;j<n;j++)
		{
			if(a[j] == key)
				break;
		}
		for(int k=j;k<n;k++)
			a[k]=a[k+1];
		n--;
		System.out.println("Number "+key+" Deleted ");
		
		System.out.println("New list is:");
		
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	
}
}	
class Main{
	public static void main(String args[]){
		ArrayA arr=new ArrayA();
		arr.getData();
		arr.printData();
		
		Scanner sc=new Scanner(System.in);
			
			System.out.println("Which operation you want to perform:	\n1.Add Elements \n2.Search Element\n3.Delete Element");
			int ch;
					try {
						ch=sc.nextInt();
					}
					catch(InputMismatchException r)
					{
						System.out.println("Envalid Inpute please Enter Integer value: ");
						ch=sc.nextInt();
					}
					//int ch;
		
			switch(ch){
				case 1:
					arr.AddElement();
					break;
				case 2:
					arr.Search();
					break;	
				case 3:
					arr.Delete();
					break;
			}
			
	}
}
