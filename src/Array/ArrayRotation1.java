package Array;

public class ArrayRotation1 {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7};
		int k=0;
		int temp[] = new int[a.length];
		
		//rotate element by d position--[1,2,3,4,5,6,7] after d position [3,4,5,6,7,1,2]
		int d=2;
		
		for(int i=d;i<a.length;i++)
		{
		  temp[k] =	a[i];
		  k++;
		}
		
		for(int i=0;i<d;i++)
		{
		temp[k] = a[i];
		k++;
		}
		for(int i=0;i<temp.length;i++)
		{
			a[i]=temp[i];
		}
		
		System.out.println("After rotation of array by"+" "+d+" "+"position");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}
}
