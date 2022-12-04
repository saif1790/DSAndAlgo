package streamAPIDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIDemo
{

	public static void main(String[] args) {
		
		List<Integer> number = Arrays.asList(2,3,4,5,12,15,27,29,49,79);
		List<Integer> newList = number.stream().filter(i->i>20).collect(Collectors.toList());
		
		System.out.println(newList);
		 
		
	}
}
