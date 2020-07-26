package com.hackerrank.test;

public class SolutionURLfy {

	static int MAX = 1000;
	// Replaces spaces with %20 in-place 
    // and returns new length of modified string. 
    // It returns -1 if modified string 
    // cannot be stored in str[] 
    public static char[] replaceSpaces(char[] str) 
    { 
    	int trueLength = str.length;
        // count spaces and find current length 
        int spaceCount = 0;
        int index = 0; 
        int i = 0;
        for (i = 0; i < trueLength; i++) {
        	 if (str[i] == ' ') {
             	spaceCount++; 
             }
        }
           
        // Find new length. 
        index = trueLength + spaceCount * 2; 
        System.out.println("Index is "+index);
  
        char[] new_str = str; 
        str = new char[index]; 
        
         // Fill rest of the string from end 
        for (i = trueLength - 1; i >= 0; i--)  
        { 
  
            // inserts %20 in place of space 
            if (new_str[i] == ' ')  
            { 
                str[index - 1] = '0'; 
                str[index - 2] = '2'; 
                str[index - 3] = '%'; 
                index = index - 3; 
            }  
            else 
            { 
                str[index - 1] = new_str[i]; 
                index--; 
            } 
        } 
        return str; 
    } 
	 
	public String usingTrimAndReplaceAll(String str) {
		// Trim the given string 
        str = str.trim(); 
        // Replace All space (unicode is \\s) to %20 
        str = str.replaceAll("\\s", "%20"); 
        return str;
	}
	public static void main(String[] args) {
		System.out.println(new SolutionURLfy().usingTrimAndReplaceAll("Vikram C Tambe"));
		char[] str = "Mr John Smith".toCharArray(); 
		// Prints the replaced string 
        System.out.println(replaceSpaces(str)); 
	}

}
