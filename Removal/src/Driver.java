public class Driver  
 { 
 	public static void main(String[] args) 
 	{ 
 		String s = "hello"; 
 		String s2 = "elephant"; 
 		Driver.removeVowels(s);
 		Driver.removeConsonants(s);
 		Driver.removeDigits(s);
	} 
	 
 	//returns a new String with all of the vowels 
 	//removed form the parameter String 
 	//"hello" -> hll 
 	static String removeVowels(String s) 
 	{ 
 		s=s.replace("a", "");
 		s=s.replace("e", "");
 		s=s.replace("i", "");
 		s=s.replace("o", "");
 		s=s.replace("u", "");
 	
 		return s;
 	} 
 	 
 	//returns a new String with all of the consonants 
 	//removed form the parameter String 
 	//"hello" -> eo 
 	static String removeConsonants(String s) 
 	{ 
 		s=s.replace("b", "");
 		s=s.replace("c", "");
 		s=s.replace("d", "");
 		s=s.replace("f", "");
 		s=s.replace("g", "");
 		s=s.replace("h", "");
 		s=s.replace("j", "");
 		s=s.replace("k", "");
 		s=s.replace("l", "");
 		s=s.replace("m", "");
 		s=s.replace("n", "");
 		s=s.replace("p", "");
 		s=s.replace("q", "");
 		s=s.replace("r", "");
 		s=s.replace("s", "");
 		s=s.replace("t", "");
 		s=s.replace("v", "");
 		s=s.replace("w", "");
 		s=s.replace("x", "");
 		s=s.replace("y", "");
 		s=s.replace("z", "");
 		
 		return s; 
 	} 
 		 
 	//returns a new String with all of the numbers 
 	//removed form the parameter String 
 	//"he11o" -> heo 
 	static String removeDigits(String s) 
 	{ 
 		s=s.replace("0", "");
 		s=s.replace("1", "");
 		s=s.replace("2", "");
 		s=s.replace("3", "");
 		s=s.replace("4", "");
 		s=s.replace("5", "");
 		s=s.replace("6", "");
 		s=s.replace("7", "");
 		s=s.replace("8", "");
 		s=s.replace("9", "");
 		
 		return s; 
 	} 
 		 
 	//return the first occurence in s where c is found or -1 if  
 	//it was not found - we can't use the String's indexOf 
 	static int indexOf(String s, char c) 
 	{ 
 		for(int i = 0; i < s.length(); i = i + 1) 
 		{ 
 			if(s.charAt(i) == c) 
 			{ 
 				return i; 
 			} 
 		} 
 		//if we are still kicking.... 
 		return -1; 
 	} 
 	 
 	static void displayString(String s) 
 	{ 
 		//should display the contents of the String one character per line 
 		for(int i = 0; i < s.length(); i = i + 1) 
 		{ 
 			System.out.println(s.charAt(i)); 
 		} 
 	} 
 	 
 	static void displayWithSpaces(String s) 
 	{ 
 		String answer = ""; 
 		for(int i = 0; i < s.length(); i = i + 1) 
 		{ 
 			answer = answer + s.charAt(i) + " "; 
 		} 
 		System.out.println(answer); 
 	} 
 	 
 	//this method should display on a single line the input String 
 	//in reverse: "hello" -> "olleh" 
 	static String reverseString(String s) 
 	{ 
 		String answer = ""; 
 		for(int i = s.length()-1; i >= 0; i = i - 1) 
 		{ 
 			answer = answer + s.charAt(i); 
 		} 
 		return answer; 
 	} 
 } 
