/**
 *
 * PalindromeDriver.java
 *
 * The main driver code for lab 1 (asst2).
 * Uses user-defined stack and queue class to determine if
 * input words are palindromes.
 *
 * Momo Ozawa | Jan 27, 2015
 *
 */ 

import java.io.IOException;
import java.util.Scanner;

public class PalindromeDriver {

    /* Main method: reads input and calls palindrome test, prints results */
    public static void main(String[] args) throws IOException
    {
        String[] results;
        int num_phrases;

        @SuppressWarnings("resource")
        Scanner stdin = new Scanner(System.in);
        
        num_phrases = Integer.parseInt(stdin.nextLine());
        results = new String[num_phrases];

        for (int i = 0; i < num_phrases; i++) {
        	String phrase = stdin.nextLine();
        	phrase = phrase.replaceAll("\\W", "").toLowerCase();
        	String result = (is_palindrome(phrase)) ? "Palindrome" : "Not a palindrome";
        	results[i] = result;
        }
        
        for (String result : results)
        	System.out.println(result);
    }

    /* is_palindrome: checks whether input is palindrome, returns true if so,
     * false otherwise.
     */
    public static boolean is_palindrome(String input) {
    	Stack s = new Stack();
    	Queue q = new Queue();
    	
    	for (int i = 0; i < input.length(); i++) {
    		s.push(input.charAt(i));
    		q.enqueue(input.charAt(i));
    	}

    	while (!(s.isEmpty()) && !(q.isEmpty())) {
    		if (s.pop() != q.dequeue())
    			return false;
    	}
    	return true;
    }
}