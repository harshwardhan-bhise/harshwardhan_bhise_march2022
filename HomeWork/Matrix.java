import java.util.*;

class Input{
	int i,j;
	public int m1[][]=new int[3][3];
	public int m2[][]=new int[3][3];
	public int m3[][]=new int[3][3];
	
	 
	
	Scanner sc = new Scanner(System.in);
	
		void getdata(){
			System.out.println("Enter Values of Matrix 1:	");
				for(int i=0;i<m1.length;i++){	
					for(int j=0;j<m1.length;j++){	
				m1[i][j]=sc.nextInt();		
				}
			}	
				
			System.out.println("Enter Values of Matrix 2:	");
				for(int i=0;i<m2.length;i++){
					for(int j=0;j<m2.length;j++){
						
				m2[i][j]=sc.nextInt();
				}	
			}
		}

		void printMatrix1(){
			System.out.println("Matrix 1:	");
			for(int x[]:m1){
				for(int v1:x){
					System.out.print(v1+" ");
				}
				System.out.println();
			}
		}

		void printMatrix2(){
			System.out.println("Matrix 2:	");
			for(int x[]:m2){
				for(int v2:x){
					System.out.print(v2+" ");
				}
				System.out.println();
			}
		}
	
		void addition(){
			System.out.println("Addition is :	");
				for(int i=0;i<m3.length;i++){	
					for(int j=0;j<m3.length;j++){	
				m3[i][j]=m1[i][j]+m2[i][j];		
				}
			}
			for(int x[]:m3){
				for(int v3:x){
					System.out.print(v3+"");
				}
				System.out.println();
			}
		}

		void substraction(){
			System.out.println("Substraction is :	");
				for(int i=0;i<m3.length;i++){	
					for(int j=0;j<m3.length;j++){	
				m3[i][j]=m1[i][j]-m2[i][j];		
				}
			}
			for(int x[]:m3){
				for(int v3:x){
					System.out.print(v3+"");
				}
				System.out.println();
			}
		}
		
		void multiplication(){
			int sum=0;
			System.out.println("Multiplication is :	");
			for(int i=0;i<m3.length;i++){	
				for(int j=0;j<m3.length;j++){	
					m3[i][j]=0;
					for(int k=0;k<m3.length;k++){
							m3[i][j]+=m1[i][j]*m2[i][j];
					}
				}
			}
			for(int x[]:m3){
				for(int v3:x){
					System.out.print(v3+"");
				}
				System.out.println();
			}
		}
		
		void Transpose(){
			int m4[][]=new int[3][3];
			System.out.println("Enter Values of Matrix to Transpose:	");
				for(int i=0;i<m3.length;i++){	
					for(int j=0;j<m3.length;j++){	
				m3[i][j]=sc.nextInt();		
				}
			}
			
			
			
			System.out.println("Matrix to trans is:	");
			for(int x[]:m3){
				for(int v1:x){
					System.out.print(v1+" ");
				}
				System.out.println();
			}
			
			
			
			
			for(int i=0;i<m3.length;i++){    
			for(int j=0;j<m3.length;j++){    
			m4[i][j]=m3[j][i];  
			}    
			}
			
			System.out.println("Matrix Transpose is:	");
			for(int x[]:m4){
				for(int v3:x){
					System.out.print(v3+" ");
				}
				System.out.println();
			}
		}	
}

		 
		
			
class Matrix{	
	
	public static void main(String args[]){
	  int ch;
	  Scanner n=new Scanner(System.in);
			
		Input l=new Input();
		l.getdata();		
		l.printMatrix1();
		l.printMatrix2();
			
		Matrix m=new Matrix();
		
		
	do{
		System.out.println("Which Operation you wanted to perform:\n0.Exit \n1.Additon \n2.Sub \n3.Multi \n4.Transpose");
		ch=n.nextInt();
		
		switch(ch){
			default:
				System.out.println("please enter correct choice:");
				break;	
			case 0:
			System.out.println("*****You are exited from Program*****");
				break;
			case 1:

				l.addition();
				break;
			case 2:
				l.substraction();
				break;
			case 3:
				l.multiplication();
				break;
			case 4:
				l.Transpose();
				break;
			}
	  }while(ch!=0);
	}		
}

	