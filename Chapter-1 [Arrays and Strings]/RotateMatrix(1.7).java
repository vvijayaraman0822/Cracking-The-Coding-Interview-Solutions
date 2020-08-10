/*
Chapter 1, 1.7 - Rotate Matrix
Given an image represented by an N x N matrix, where each pixel in the image is represented by an integer, write
a  method to rotate the image by 90 degrees. Can you do this in place?
*/
Input =  {1, 2}, 
         {4, 5} 

Output = {4, 1},		 
		 {5, 2} 		 

  public int[][] rotateMatrix(int[][] arr) {
      // transpose the matrix 
      for(int i = 0; i < arr.length; i++) {
        for(int j =i; j < arr.length; j++) {
          int temp = arr[i][j];
          arr[i][j] = arr[j][i];
          arr[j][i] = temp;
        }
      }

      // swapping first column with last column and so on. 
      for(int i=0; i < arr.length; i++) {
        for(int j=0; j < arr.length/2; j++) {
          int temp = arr[i][j];
          arr[i][j] = arr[i][arr.length-1-j];
          arr[i][arr.length-1-j] = temp;
        }
      }
     return arr;  

    }
  }
}