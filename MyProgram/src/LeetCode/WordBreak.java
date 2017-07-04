package LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class WordBreak {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "a";
		Set<String> dict = new HashSet<>();
		ArrayList<String> list = new ArrayList<>();
		dict.add("a");
		/*dict.add("cats");
		dict.add("dog");
		dict.add("sand");
		dict.add("and");*/
		wordBreak(s, dict, "", list);

	}
    public static void wordBreak(String s, Set<String> dict,String tmp,ArrayList<String> list) {
       String aString  =tmp;
       String bString  = s;
    	if (!s.equals("")) {
			for (String word: dict) {
				if (s.startsWith(word)) {
					tmp=tmp+word+" ";
					s = s.substring(word.length());
					wordBreak(s, dict, tmp, list);
					tmp = aString;
					s = bString;
				}
			}        	
		}else {
			list.add(tmp.trim());
			System.out.println(tmp);
			
		}
       
        
        	
        	
   }
        
    

}
