import junit.framework.TestCase;


public class PalindromeCheckerTest extends TestCase {
	PalindromeChecker testObject;
	public void setUp(){
		testObject = new PalindromeChecker();
	}
	public void testCreatePalindromeTestObject() throws Exception{
		assertNotNull(testObject);
	}
	
	public void testSimplePalindromeMethod_yesPalindrome() throws Exception{
		assertTrue(testObject.isAPalindRome("MOM"));
	}
	public void testSimplePalindromeMethod_notAPalindrome() throws Exception{
		assertFalse(testObject.isAPalindRome("Blah"));
	}
	public void testSimplePalindromeMethod_NotAPalindrome2() throws Exception{
		assertFalse(testObject.isAPalindRome("jffjkfsk"));
	}
	
	public void testComplexPalindromeMethod() throws Exception{
		assertTrue(testObject.isAPalindRome("knknknknk"));
	}
}
