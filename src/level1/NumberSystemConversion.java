package level1;




public class NumberSystemConversion {
	
	private static long decimalToBinary(int n) {
		
		long binary =0;
		while(n!=0) {
			
			binary= 10*binary + n%2;
			n=n/2;
			
			
		}
		
		return binary; //convert to string and reverse depending on question.
	}
	
	private static String decimalToBinary1(int n) {
		
		String ReverseBinary = "";
		while (n != 0) {

			ReverseBinary += n % 2;
			n = n / 2;

		}
		String binary = "";
		for (int i = ReverseBinary.length() - 1; i >= 0; i--) {
			binary += ReverseBinary.charAt(i);
		}

		return binary;
	}
	
	private static String binaryToDecimal(String binary) {
		
		int decimal =0;
		for(int i= binary.length()-1; i>=0; i--) {
			
			char a=binary.charAt(i);
			int v = Integer.parseInt(Character.toString(a));
			int t= binary.length()-1-i;
			int k = (int) Math.pow(2, t);
			
			decimal+= v*k;
			
			//decimal += (Integer.parseInt(Character.toString(a)))*2^((binary.length()-1-i));
			
		}
		
		return Integer.toString(decimal);
	}

	
	public static String toHexa(String ch) {
		
		if(Integer.parseInt(ch)>=0 && Integer.parseInt(ch)<10 ) { return ch;}
		
		
			if(ch.equals("10")) return "a";
			if(ch.equals("11")) return "b";
			if(ch.equals("12")) return "c";
			if(ch.equals("13")) return "d";
			if(ch.equals("14")) return "e";
			if(ch.equals("15")) return "f";
									
		
		
		return "";
		
	}
	
	private static String decimalToHexaDecimal(int n) {
	
		String reverseHexa = "";
		
		while(n!=0) {
			
			String a= Integer.toString(n%16);
			reverseHexa  += toHexa(a);
			n=n/16;
			
		}
		String hexa="";
		for(int i=reverseHexa.length()-1;i>=0;i--) {
			hexa  += reverseHexa.charAt(i);
		}
		
		return hexa;
	}
	
	
	
	public static String toDecimal(char ch) {

			
			if(ch=='a') return "10";
			if(ch=='b') return "11";
			if(ch=='c') return "12";
			if(ch=='d') return "13";
			if(ch=='e') return "14";
			if(ch=='f') return "15";
									
		
		
		  return Character.toString(ch);
		
	}
	
	private static String hexaToDecimal(String hexa1) {
		
		int decimal= 0;
		for(int i =hexa1.length()-1; i>=0; i--) {
			
			String a = toDecimal(hexa1.charAt(i));
			
			int b = Integer.parseInt(a);		
			int c = (int) Math.pow(16, hexa1.length()-1-i);
			
			decimal+= b*c;
			
			
			
		}
		
		
		return Integer.toString(decimal);
	}

	public static void main(String[] args) {

//		int n = 23;
//		long binary =decimalToBinary(n);
//		System.out.println(binary);
//		
//		String binary1 =decimalToBinary1(n);
//		System.out.println(binary1);
		
//		String binary2 ="110011";
//		String decimal =binaryToDecimal(binary2);
//		System.out.println(decimal);

//		String hexa =decimalToHexaDecimal(n);
//		System.out.println(hexa);
		
		
		String hexa1 ="fd";
		String decimal01 =hexaToDecimal(hexa1);
		System.out.println(decimal01);
	}






	/*
	 hexadecimal of negative number-
	 Change the number into 8 bit binary number then take 2's complement
      ex: -3 change into binary: 00000011 take 2's complement: 11111101=FD (hex)
      
      same for binary to decimal.
       
	*/

}
