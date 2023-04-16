package isIsomorphic;

import java.util.HashMap;

class isIsomorphicSoln {
    
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        
        HashMap<Character, Character> sToT = new HashMap<>();
        HashMap<Character, Character> tToS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            System.out.println(":sToT.get(sChar)"+ sToT.get(sChar));
            if (sToT.containsKey(sChar) && sToT.get(sChar) != tChar) {
                return false;
            }
            if (tToS.containsKey(tChar) && tToS.get(tChar) != sChar) {
                return false;
            }
            sToT.put(sChar, tChar);
            tToS.put(tChar, sChar);
        }
        return true;
    }
    
    public static void main(String[] args) {
        String s1 = "egg";
        String t1 = "add";
        boolean result1 = isIsomorphic(s1, t1);
        System.out.println(result1); // prints true
        
        String s2 = "foo";
        String t2 = "bar";
        boolean result2 = isIsomorphic(s2, t2);
        System.out.println(result2); // prints false
    }



}
