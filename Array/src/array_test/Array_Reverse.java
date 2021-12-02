package array_test;

public class Array_Reverse {

	public static void main(String[] args) {
		
		int a[]= {11,22,33,44,55,66,77,88,99};
		int b;
		for(int i=0;i<a.length-1;i++)
		{
			b=a[i];
			a[i]=a[(a.length-1)-i];
			a[(a.length-1)-i]=b;
			System.out.print(b+" ");
			//System.out.print(b+" ");
		}
	}
}
