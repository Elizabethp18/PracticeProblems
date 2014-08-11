package main.test;

import main.java.Anagrams;
import org.junit.Assert;
import org.junit.Test;

public class TestAnagrams {

	@Test
	public void testForAnagramTrue() {
		Boolean actual = Anagrams.checkForAnagram("abcdbcd", "bcdbcda");
		
		Assert.assertTrue(actual);
	}
	
	@Test
	public void testForAnagramTrueDifferingCases()  {
		Boolean actual = Anagrams.checkForAnagram("AbcDbcd", "BCdbcda");
		
		Assert.assertTrue(actual);
	}

	@Test
	public void testForAnagramTrueWithNums()  {
		Boolean actual = Anagrams.checkForAnagram("abc123", "bca321");
		
		Assert.assertTrue(actual);
	}
	
	@Test
	public void testForAnagramTrueWithPunctuation()  {
		Boolean actual = Anagrams.checkForAnagram("ab?!", "?!ba");
		
		Assert.assertTrue(actual);
	}
	
	@Test
	public void testForAnagramFalseUnequalLengths()  {
		Boolean actual = Anagrams.checkForAnagram("abcd", "abc");
		
		Assert.assertFalse(actual);		
	}
	
	@Test
	public void testForAnagramsFalse()  {
		Boolean actual = Anagrams.checkForAnagram("abcc", "abcd");
		
		Assert.assertFalse(actual);				
	}
}