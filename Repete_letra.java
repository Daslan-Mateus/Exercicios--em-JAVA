/*
 An isogram is a word that has no repeating letters, consecutive or non-consecutive. 
 Implement a function that determines whether a string that contains only letters is an isogram. 
 Assume the empty string is an isogram. Ignore letter case.

Example: (Input --> Output)

"Dermatoglyphics" --> true
"aba" --> false
"moOse" --> false (ignore letter case)
 */
public class Repete_letra {
	
	
	
	    public static boolean  isIsogram(String str) {
	    	str = str.toLowerCase();
	    	for (int i = 0; i < str.length(); i++) {
	    		char l = str.charAt(i);
	    		int start = i + 1;
	    		
	    		for (int j = start; j < str.length(); j++) {
	    			char m = str.charAt(j);
	    			
					if(Character.compare(l, m) == 0) {
						
	    				return false; 
	    				
		    		  } 
				}
			}
	    	return true;
	}

	public static void main(String[] args) {
		System.out.println(isIsogram("DaSLaN"));
	}

}
