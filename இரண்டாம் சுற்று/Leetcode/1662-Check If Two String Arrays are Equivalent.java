class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        StringBuffer str1 = new StringBuffer(word1[0]);
        StringBuffer str2 = new StringBuffer(word2[0]);

        for(int i=1;i<word1.length;i++)
        {
            str1.append(word1[i]);
        }

        for(int i=1;i<word2.length;i++)
        {
            str2.append(word2[i]);
        }

        if(String.valueOf(str1).equals(String.valueOf(str2)))
          return true;
         else 
          return false; 
    }
}
