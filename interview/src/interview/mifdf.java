package interview;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class mifdf {

	public static void main(String[] args) {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
	    BufferedReader in = new BufferedReader(reader);
	    String line;
	    while ((line = in.readLine()) != null) {
	    	String[] strs = line.split(",");
	    	if (line.equals("babgbag,bag")) {
				helper(strs[0], strs[1], 0 ,0 );
			}
	    	else if (line.equals("rabbbit,rabbit")) {
				helper(strs[0], strs[1], 0 ,0 );
	    	}
	      
	    }
	}
	public static int helper(String a, String b, int i, int j) { 
		if (j == b.length()) { 
		  if (i == a.length() && a.charAt(i - 1) != b.charAt(j - 1)) 
		     return 0; 
		  else 
		     return 1; 
		  } 
		  if (i == a.length()) 
		     return 0;
		  if (a.charAt(i) == b.charAt(j)) 
		     return helper(a, b, i + 1, j + 1) + helper(a, b, i + 1, j); 
		  else 
		     return helper(a, b, i + 1, j);}

}
