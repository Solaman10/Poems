class Solution {
    public String countAndSay(int size) {

        int ind1=1;     
        String str = "1";

        while(ind1<size)
        {
            String newStr = "";
            int count = 1;
            char tempChar = str.charAt(0);
            for(int ind2=1;ind2<str.length();ind2++)
            {
                if(str.charAt(ind2) != str.charAt(ind2-1))
                {
                    newStr=newStr+count+tempChar;
                    tempChar = str.charAt(ind2);
                    count=1;
                }
                else
                {
                    ++count;
                }
            }
            newStr=newStr+count+tempChar;
            str = newStr;
            ++ind1;
        }
        return str;
    }
}
