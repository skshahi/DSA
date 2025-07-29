package coma.app;

/*Input: s = "geeekk"
Output: e
Explanation: character e comes 3 times consecutively which is maximum.*/

public class LongestRepeatingCharinString {
	// Function to find out the maximum repeating
    // character in given string
    static   char maxRepeating(String s) {
        int n = s.length();
        int maxCnt = 0;
        char res = s.charAt(0);
        int cnt = 1;

        for (int i = 1; i < n; i++) {

            // If current char matches with
            // previous, increment cnt
            if (s.charAt(i) == s.charAt(i - 1)) {
                cnt++;
            } 
            else {

                // Reset cnt
                cnt = 1;
            }

            // Update result if required
            if (cnt > maxCnt) {
                maxCnt = cnt;
                res = s.charAt(i - 1);
            }
        }

        return res;
    }

	public static void main(String[] args) {
		String s = "geeeekkkkk";
		System.out.println(maxRepeating(s));
		String res="";
		for(int i=0;i<s.length()-1;i++)
		{
			String temp=String.valueOf(s.charAt(i));
			for(int j=i;j<s.length()-1;j++)
			{
				if(s.charAt(j)==s.charAt(j+1))
				{
					temp=temp+s.charAt(j);
					
				}else {
					break;
				}
				
				
			}
			if(temp.length()>res.length())
			{
				res=temp;
			}
		}
		
		System.out.println(res);
		

	}

}
