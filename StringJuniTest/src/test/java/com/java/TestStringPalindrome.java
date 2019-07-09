package com.java;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import org.junit.Before;
import org.mockito.runners.MockitoJUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(MockitoJUnitRunner.class)
public class TestStringPalindrome {
	
	@Before
	public void moc() {
		mock(StringPalindrome.class);
	}
    String input = "boob";
    StringPalindrome pal = new StringPalindrome();
    boolean expected =true;
    
    @Test
    public void isPalindromeTest() {
    	
      assertEquals(expected, pal.ispal(input));
    }
    @Test
    public void isnotPalindrome() {
        assertEquals(false,pal.ispal("sand"));
      }
    @Test(expected=IllegalArgumentException.class)
    public void isnotPalindromeException() {
        assertEquals(false,pal.ispal(null));
      }
    
    
}
