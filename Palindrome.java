import java.lang.*;

public class Palindrome {
    public static void main(String args[]) {
	
	String s = "madam";
	int len = s.length();
	int i;
	char[] tempArray = new char[len];
	char[] reversedArray = new char[len];

	for(i = len - 1; i >= 0; i--) {
	    reversedArray[i] = s.charAt(i);
	}

	int flag = 0;
	for(i = 0; i < len; i++) {
	    if(reversedArray[i] != s.charAt(i)) {
		flag += 1;
		break;
	    }
        }

	if(flag == 0) {
	    System.out.println("The given string is a palindrome");
	}
	else {
	    System.out.println("The given string is not a palindrome");
	}

    }
}
