package RomanConversion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class Solution {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "I");
        hm.put(4, "IV");
        hm.put(5, "V");
        hm.put(9, "IX");
        hm.put(10, "X");
        hm.put(40, "XL");
        hm.put(50, "L");
        hm.put(90, "XC");
        hm.put(100, "C");
        hm.put(400, "CD");
        hm.put(500, "D");
        hm.put(900, "CM");
        hm.put(1000, "M");

        ArrayList<Integer> lst = new ArrayList<>();
        for(int key : hm.keySet()) {
            lst.add(key);
        }

        Collections.sort(lst, Collections.reverseOrder());

        for(int n : lst) {
            while(num >= n) {
                sb.append(hm.get(n));
                num -= n;
            }
        }
        
        
        return sb.toString();

        
    }
}
public class IntToRoman {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int num = 123;
        String roman = solution.intToRoman(num);
        System.out.println("Roman numeral for " + num + ": " + roman);
    }
}
