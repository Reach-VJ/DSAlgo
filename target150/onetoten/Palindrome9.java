package target150.onetoten;

public class Palindrome9 {
	public static void main(String [] args) {
		int number = 0;

		Solution solution = new Solution();
		System.out.println(number+" polindrome : "+solution.isPalindrome(number));
	}

}

class Solution {
    public boolean isPalindrome(int number) {
    	if(number < 0)
    		return false;
    	if(number < 10)
    		return true;

    	char [] array = String.valueOf(number).toCharArray();
    	int i = 0;
    	int j = array.length -1;

    	while(i < j) {
    		if(array[i] != array[j]) {
    			return false;
    		}
    		i++;
    		j--;
    	}

        return true;
    }
}
