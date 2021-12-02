package array_test;

public class Array_exmple {

	public static void main(String[] args) {
		
		int a []= {20,40,60,80,100};
		int b[]= new int[a.length];
		System.out.println(a.length);
	for(int i=0;i<5;i++)
	{
		b[i]=a[(a.length-1)-i];
       System.out.print(b[i]+" ");	
       
	}

	 
	}
}
