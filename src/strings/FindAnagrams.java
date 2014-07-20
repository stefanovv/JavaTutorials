/** An anagram is a word or a phrase made by transposing the letters of 
 * another word or phrase; for example, "parliament" is an anagram of 
 * "partial men," and "software" is an anagram of "swear oft." Write a 
 * program that figures out whether one string is an anagram of another 
 * string. The program should ignore white space and punctuation.
 */

package strings;

public class FindAnagrams {

	public static void main(String[] args) {
		String firstString = "Cosmo and Laine:";
		String secondString = "Maid, clean soon!";
		
		System.out.println("Checking strings for anagram:");
		System.out.println("String 1: " + firstString);
		System.out.println("String 2: " + secondString);
		
		if(checkAnagram(firstString, secondString)){
			System.out.println("They are anagrams.");
		}
		else {
			System.out.println("They are not anagrams.");
		}

	}
	
	static boolean checkAnagram(String string1, String string2){
		String clearedString1 = clearString(string1);
		String clearedString2 = clearString(string2);
		
		clearedString1 = clearedString1.toLowerCase();
		clearedString2 = clearedString2.toLowerCase();
		
		StringBuilder sb = new StringBuilder(clearedString2);
		
		for(int i = 0; i < clearedString1.length(); i++){
			int index = sb.indexOf(String.valueOf(clearedString1.charAt(i))); //Find index foreach char in the first string
		
			if(index != -1){
				sb.deleteCharAt(index);
			}
			else {
				return false;
			}
		}
		
		return true;
	}
	
	static String clearString(String stringToClear){
		StringBuilder sb = new StringBuilder(stringToClear);
		
		char[] junks = {' ', '.', ',', '!', '?', '\\', '/', ';', '-', ':'};
		
		for(char junk: junks){
			int index = sb.indexOf(String.valueOf(junk));
			
			while(index != -1){
				sb.deleteCharAt(index);
				index = sb.indexOf(String.valueOf(junk));
			}
		}
		
		return sb.toString();
	}
}
