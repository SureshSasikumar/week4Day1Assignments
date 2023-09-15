package week4.day1.amazonlist;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="PayPal India";
		char[] charArray=name.toCharArray();
		Set<Character> charset=new LinkedHashSet<>();
		Set<Character> duplicate=new LinkedHashSet<>();
		for(Character character: charArray) {
			if(!charset.add(character)) {
				duplicate.add(character);
			}
			charset.removeAll(duplicate);
			}
		for(Character character:charset) {
			if(character!=' ') {
				System.out.print(character);
			}
		}
		}
	
		

}
