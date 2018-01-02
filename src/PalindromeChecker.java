
public class PalindromeChecker {

	public boolean isAPalindRome(String string) {
		// TODO Auto-generated method stub
		return string.equals(getReversedString(string));
	}

	private String getReversedString(String string) {
		StringBuffer reverseString = new StringBuffer(string);
		reverseString.reverse();
		return reverseString.toString();
	}

}
