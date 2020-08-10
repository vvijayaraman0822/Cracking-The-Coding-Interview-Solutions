/*
Chapter 1, 1.8 - Zero Matrix
Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0.
*/

 public static int[][] zeroMatrix(int[][] arr) {
    // find row & column that need to be set to 0
   List<Integer> rows = new ArrayList<>();
   List<Integer> columns = new ArrayList<>();
    for(int i=0; i < arr.length; i++) {
      for(int j=1; j < arr[i].length; j++) {
        if (arr[i][j] == 0) {
         rows.add(i);
         columns.add(j);
        }
      }
    }

// set 0's in the designated row and column 
    for(int i=0; i < arr.length; i++) {
      for(int j=0; j < arr[i].length; j++) {
        if (rows.contains(i) || columns.contains(j)) {
          arr[i][j] = 0;
        }
      }
    }
    return arr;
  }
}
