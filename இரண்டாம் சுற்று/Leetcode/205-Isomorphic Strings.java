class Solution {
    public boolean isIsomorphic(String s, String t) {

    HashMap<Character,Character> hmap1 = new HashMap<>();
    HashMap<Character,Character> hmap2 = new HashMap<>();
    char a,b;
    for(int i=0;i<s.length();i++)
    {
        a = s.charAt(i);
        b = t.charAt(i);
        if(hmap1.containsKey(a) && hmap1.get(a)!=b || hmap2.containsKey(b) && hmap2.get(b)!=a)
            return false;

        hmap1.put(a,b);
        hmap2.put(b,a);    
    }    
    return true;
    }
}
