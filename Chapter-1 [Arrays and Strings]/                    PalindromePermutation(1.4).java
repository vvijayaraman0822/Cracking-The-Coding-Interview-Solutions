/*
Chapter 1, 1.3 - Palindrome Permutation
Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is a word or phrase that is the same forwards and backwards. A permutation is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.
Example : 
Input: Tact Coa
Output: True (permutations: 'taco cat', 'atco cta', etc)
*/
   
   public boolean palindromePermutation(String a) {
      String lowerCase = a.toLowerCase().replaceAll("\\s", "");
      HashMap<Character, Integer> instanceMap = new HashMap<>();
      for(int i=0; i < lowerCase.length(); i++) {
        char b = lowerCase.charAt(i);
        if(!instanceMap.containsKey(b)) {
          instanceMap.put(b, 1);
        } else {
          instanceMap.put(b, instanceMap.get(b) + 1);
        }
      }

// Calculate number of characters appearing only once, max of 1 character to form a palidrome. If it is a palindrome it can also form a permutation.
       int count = 0;
      for(int occurences : instanceMap.values()) {
        if(occurences % 2 != 0)
          count++;
      }
      return count <= 1;
   }

}
