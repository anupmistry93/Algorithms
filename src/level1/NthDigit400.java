package level1;

public class NthDigit400 {

	public int findNthDigit(int n) {
		long digit=9; 
		int length =1;
	    int fisrt=1;   
	 
	    while(n>length*digit){
	    	
	        n-= length*digit;
	        length++;
	        digit=digit*10;
	        fisrt=fisrt*10;
	    }
	   // identify the number
	    fisrt  = fisrt + (n-1)/length;
	    System.out.println(fisrt);
	    String distance =Integer.toString(fisrt);
	    System.out.println(distance);
	    
	    char ch= distance.charAt((n-1)%length);
	    return Character.getNumericValue(ch);
	   
	}
	
	
	public static void main(String[] args) {
		
		NthDigit400 obj = new NthDigit400();
		
		int result =obj.findNthDigit(203);
		System.out.println(result);

	}

}



/*


The "common knowledge" of programming is that x += y is an equivalent shorthand notation of x = x + y. As long as x and y are of the same type (for example, both are ints), you may consider the two statements equivalent.

However, in Java, x += y is not identical to x = x + y in general.

If x and y are of different types, the behavior of the two statements differs due to the rules of the language. For example, let's have x == 0 (int) and y == 1.1 (double):

    int x = 0;
    x += 1.1;    // just fine; hidden cast, x == 1 after assignment
    x = x + 1.1; // won't compile! 'cannot convert from double to int'
+= performs an implicit cast, whereas for + you need to explicitly cast the second operand, otherwise you'd get a compiler error.
 */
