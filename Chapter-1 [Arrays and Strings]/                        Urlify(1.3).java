// Chapter 1, 1.3 - URLify
// Write a method to replace all the spaces in a string with ‘%20’. You may assume that the string has sufficient space at the end to hold // the additional characters, and that you are given the “true” length of the string.

// Examples:
// Input : "Mr John Smith", 13
// Output : Mr%20John%20Smith

// Using an extra String
private String getURL(String input, int length) {
      String output = "";
      for(int i=0; i < length; i++) {
        char a = input.charAt(i);
        if (a == ' ') {
          output = output + "%20";
        } else {
          output = output + a;
        }
      }
      return output;
  }
  
// In-place, no extra String
 private static char[] getURL(char arr[], int length) { 
      int numberOfEmptySpaces = getCountOfEmptySpaces(arr, length);
      int newLength = length + (numberOfEmptySpaces * 2);

      for(int i = length-1; i >=0; i--) {
        if(arr[i] == ' ') {
          arr[newLength-1] = '0';
          arr[newLength-2] = '2';
          arr[newLength-3] = '%';
          newLength = newLength-3;
        } else {
          arr[newLength-1] = arr[i];
          newLength = newLength-1;
        }
      }
      return arr;
    }

      private static int getCountOfEmptySpaces(char[] arr, int length) {
        int count = 0;
        for (int i=0; i < length; i++) {
          if(arr[i] == ' ')
            count++;
        }
        return count;
      }
