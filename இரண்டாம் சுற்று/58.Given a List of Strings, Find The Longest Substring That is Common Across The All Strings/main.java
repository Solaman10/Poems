/*
i/p:
tenant tenure tenancy 

o/p:
(ten)
--------------------------------
i/p:
tourist florist purest fairest

o/p:                                // Here the common substring between these 4 String is "st". but, it's length is less than 3
()                                 // The one of constrain is that common substring's length should be atleast 3 Character
*/

import java.util.ArrayList;

public class listOfStrngFindComnSubStr {

    private static String isHas(ArrayList<String> arr) {

        String str="",prev="";
        int ind,index=1;
        boolean flag;

        for(ind=0;ind<arr.get(0).length();ind++)
        {
            flag = true;
            str+=arr.get(0).charAt(ind);
            while(flag)
            {
                if(index<arr.size() && arr.get(index).contains(str))
                    ++index;
                else if(index<arr.size() && !arr.get(index).contains(str))
                {
                    str = "";
                    break;
                }
                if(index>=arr.size())
                    flag = false;
            }
            if(str.length()>=3)
                prev = str;
            index = 1;
        }
        if(!prev.isEmpty())
            return prev;
        else
            return "";
    }

    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();
        arr.add("tenant");
        arr.add("tenure");
        arr.add("tenancy");
        arr.add("ten");
        System.out.print(isHas(arr));
    }
}
