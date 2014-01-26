package main.java;

public class Anagrams {
	
	public static Boolean checkForAnagram(String firstString, String secondString)  {
		Boolean anagram = true;
		
		//assumes anagrams are not case sensitive
		firstString = firstString.toLowerCase();
		secondString = secondString.toLowerCase();
		
		if(firstString.length() != secondString.length())  {
			anagram = false;
		}
		else  {
			//assumes ASCII chars
			int[] charsFound = new int[256];
			char[] firstCharArray = firstString.toCharArray();
			char[] secondCharArray = secondString.toCharArray();

			for(int i = 0; i < firstCharArray.length; i++)  {
				int charInt = firstCharArray[i];
				charsFound[charInt]++;
			}
			
			for(int j = 0; j < secondCharArray.length; j++)  {
				int secondStringCharInt = secondCharArray[j];
				
				if(charsFound[secondStringCharInt] == 0)  {
					anagram = false;
					break;
				}
				else  {
					charsFound[secondStringCharInt]--;
				}
			}
		}
		
		return anagram;
	}
}