package coma.app;

/*Input: s = "geeksforgeeks"
Output: 7 
Explanation: The longest substrings without repeating characters are "eksforg” and "ksforge", with lengths of 7.
*/
public class LongestSubString {

	public static void main(String[] args) {
		String str="geeksforgeeks";
		String res="";
		
		for(int i=0;i<str.length()-1;i++)
		{
			String temp="" ;
			for(int j=i;j<str.length()-1;j++)
			{
				if(str.charAt(j)!=str.charAt(j+1))
				{
					temp=temp+str.charAt(j);
				}else {
					break;
				}
				
			}
			if(temp.length()>res.length())
			{
				res=temp;
			}
		}
		
		System.out.println(res+" "+res.length());
		

	}

}
