// Pair star
// Send Feedback
// Given a string, compute recursively a new string where 
// identical chars that are adjacent in the original string 
// are separated from each other by a "*".
// Sample Input 1 :
// hello
// Sample Output 1:
// hel*lo
// Sample Input 2 :
// xxyy
// Sample Output 2:
// x*xy*y
// Sample Input 3 :
// aaaa
// Sample Output 3:
// a*a*a*a

public class solution {

	// Return the updated string
	public static String addStars(String s) {
		// Write your code here

         
         if (s.length() == 1) { 
            return s; 
        } 
  
     
        if (s.charAt(0) == s.charAt(1) ) { 
           return s.charAt(0) +"*"+ addStars(s.substring(1, s.length())); 
        } 
  
      
        
        return s.charAt(0) + addStars(s.substring(1, s.length())); 
        
        
        
        
	}
}
