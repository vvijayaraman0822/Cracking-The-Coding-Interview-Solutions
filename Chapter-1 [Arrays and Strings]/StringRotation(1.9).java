/*
Chapter 1, 1.9 - String Rotation
Assume you have a method isSubstring which checks if one word is a substring of another. Given two strings, write the code to check if one string is a rotation of the other using only one call to isSubstring (e.g., waterbottle is a rotation of erbottlewat)
*/

public static boolean isStringRotation(String s1, String s2) {
      int j = 0;
      for(int i=0; i < s1.length(); i++) {
        if(s1.charAt(i) == s2.charAt(j)) {
          j++;
        }
      }
        int index = j; // now index will be where 'w' is which is at 8
        String checkString = s2.substring(index, s2.length());
        if (s1.contains(checkString)) // consider this as the isSubString method
          return true;
        else
          return false;
   }
}