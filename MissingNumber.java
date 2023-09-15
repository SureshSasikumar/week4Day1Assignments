package week4.day1.amazonlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,2,4,5,6,6,7,9,10};
		Set<Integer> set=new TreeSet<>();
		for(int i=0;i<=a.length-1;i++)
		{
			set.add(a[i]);
			
		}
		System.out.println(set);
		List<Integer> list= new ArrayList<>(set);
		int text=list.size();
		for(int i=0;i<=text-1;i++)
		{
			if(list.get(i)!=(i+1))//1,2,4,5,6,7,9,10
			{
				System.out.println(i+1);
				break;
				
			}
			
			
			}
		
		
		
	
	}

}
