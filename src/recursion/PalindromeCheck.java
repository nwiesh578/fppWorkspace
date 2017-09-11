package recursion;

import java.util.Scanner;
class PalindromeCheck
{
    //My Method to check
    public static boolean isPalindrome(String s)
    {   // if length is 0 or 1 then String is palindrome
        if(s.length() == 0 || s.length() == 1)
            return true; 
        if(s.charAt(0) == s.charAt(s.length()-1))
        /* check for first and last char of String:
         * if they are same then do the same thing for a substring
         * with first and last char removed. and carry on this
         * until you string completes or condition fails
         * Function calling itself: Recursion
         */
        return isPalindrome(s.substring(1, s.length()-1));

        /* If program control reaches to this statement it means
         * the String is not palindrome hence return false.
         */
        return false;
    }

    public static void main(String[]args)
    {
    	//For capturing user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String for check:");
        String string = scanner.nextLine();
        /* If function returns true then the string is
         * palindrome else not
         */
        if(isPalindrome(string.toLowerCase()))
            System.out.println(string + " is a palindrome");
        else
            System.out.println(string + " is not a palindrome");
        scanner.close();
    }  
}

/* Output
   Enter the String for check:
   MADAM
   MADAM is a palindrome   
   
   Enter the String for check:
   man
   man is not a palindrome
*/