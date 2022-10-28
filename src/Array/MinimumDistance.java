package Array;

//w1=java
//w2=age
//output=1
public class MinimumDistance {

	public static void main(String[] args) {
		
		String s = "This is java learning age";
		String[] split = s.split(" ");
		//System.out.println(split.length);
		String w1 = "java";
		String w2 ="age";
		int c=0;
		for(int i=0;i<split.length;i++)
		{
			//System.out.println(split[i]);
			if(split[i].equals(w1))
			{
				for(int j=i;j<split.length;j++)
				{
					c++;
					if(split[j].equals(w2))
					{
						
					}
				}
			}
		}
		
		System.out.println(c);
	}

	 

}
