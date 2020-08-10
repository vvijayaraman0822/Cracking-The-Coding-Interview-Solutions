/*
Chapter 1, 1.6 - String compression
 Implement a method to perform basic string compression using the counts
 of repeated characters. For example, the string aabcccccaaa would become
 a2b1c5a3. If the "compressed" string would not become smaller than the
 original string, your method should return the original string.
*/                                                               

private String getStringCompression(String a) {
      if (a.length() <= 1) {
        return a;
    }

      int count = 1;
      StringBuilder str = new StringBuilder();
      Character currentChar = null;
      for (int i=0; i < a.length()-1 ; i++) {
         currentChar = a.charAt(i);
        char nextChar = a.charAt(i+1);
          if (currentChar == nextChar) {
              count++;
          } else {
            str.append(currentChar);
            str.append(count);
            count = 1;           
            }
      }
      str.append(currentChar);
      str.append(count);
      
      return a.length() > str.length() ? str.toString() : a;
    }
} 