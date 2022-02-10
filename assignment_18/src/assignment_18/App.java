package assignment_18;

import ignore.TestingUtils;

public class App {


	/**
	 * 
	
	Given a string, compute recursively a new string where identical chars 
	that are adjacent in the original string are separated from each other by a "-".

	<br>
	<br>

	 * <b>EXPECTATIONS:</b><br>
		repeatHyphen("hello") <b>---></b> hel-lo<br>
		repeatHyphen("xxyy") <b>---></b> x-xy-y <br>
		repeatHyphen("aaaa") <b>---></b> a-a-a-a <br>
	 */
	
	public static String hyphenSplit(String str) {

		if(str.isEmpty()){
			return str;
		}
		StringBuilder str1=new StringBuilder();
		for(int i=1;i<str.length();i++){
			str1.append(str.charAt(i-1));
			if(str.charAt(i-1)==str.charAt(i)){
				str1.append("-");
			}
		}
		str1.append(str.charAt(str.length()-1));
		// complete the body of this method
		return str1.toString();
	}



	
	
	
	
	
	
	
	

	
	//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		TestingUtils.runTests();
		
	}
}

