package coma.app;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*Given two strings s (length m) and p (length n), the task is to find the smallest substring in s 
 * that contains all characters of p, including duplicates. If no such substring exists, return "-1". 
 * If multiple substrings of the same length are found, return the one with the smallest starting index.

Examples: 

Input: s = "timetopractice", p = "toc"
Output: toprac
Explanation: "toprac" is the smallest substring in which "toc" can be found.
*/
public class SmallestSubString {

	public static void main(String[] args) {
		
		String s = "timetopcractice";
		String p = "toc";
		Map<Character,Set> map=new HashMap<>();
		for(int i=0;i<p.length();i++)
		{
			Set set=new HashSet();
			for(int j=0;j<s.length();j++)
			{
				if(p.charAt(i)==s.charAt(j))
				{
					set.add(j);
				
					
				}
			}
			map.put(p.charAt(i),set);
		}
		System.out.println(map);
		

	}

}
