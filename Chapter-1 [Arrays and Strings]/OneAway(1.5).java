/*
Chapter 1, 1.4 - One Away
There are three types of edits that can be performed on strings: insert a character, remove a character, or replace a character. Given two strings, write a function to check if they are one edit (or zero edits) away.

Example:
pale, ple => true
pales, pale => true
pale, bale => true
pale, bake => false
*/

 public boolean oneAway(String a, String b) {
       if(a.length() - b.length() > 1)
          return false;
        int count = 0;
        int i = 0;
        int j = 0;
        while(i < a.length() && j < b.length()) {
          if(a.charAt(i) != b.charAt(j)) {
            if(a.length() == b.length()) {
              i++;
              j++;
            } else if (a.length() > b.length()) {
              i++;  
            } else {
              j++;          
            }
            count++;
          } else {
          i++;
          j++;

          }
        }     

    return count <=1;

  }
}