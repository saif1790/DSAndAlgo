package Array;

public class ConvertOpposite 
{

	public static void main(String[] args) {
		
		StringBuffer str =new StringBuffer("CloudTech");
		
		int length = str.length();
		
		for(int i=0;i<length;i++)
		{
			Character  character = str.charAt(i);
			if(Character.isLowerCase(character))
			{
				str.setCharAt(i, Character.toUpperCase(character));
			}
			else if (Character.isUpperCase(character)) {
				str.setCharAt(i, Character.toLowerCase(character));
			}
		}
			
		System.out.println(str);
		
	}
}

