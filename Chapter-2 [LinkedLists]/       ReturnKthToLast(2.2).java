// Chapter 2 - 2.2 - Return Kth to Last
  
// Implement an algorithm to find the kth to last element of a singly linked list
// Exampele - 1 -> 2 -> 3 -> 4 -> 5,   K = 2,  Return = 4 (2nd from last)
  
  // Using two passes, get size first and then return the right element
  public Integer KthElementFromLast(int k, Node head) {
    Node current = head;
    Node runner = head;
    int size = 0;
    while(current != null) {
        size++; 
        current = current.next;
    }
    int currentElementIndex = 1;
    while(runner != null) {
      if(currentElementIndex == size-k+1) {
        return runner.data;
      } else {
        currentElementIndex++;
        runner = runner.next;
      }
    }

    return null;
  }
  
  // One pass with two pointer technique, 
  public Integer KthElementFromLast(Node head, int k) {
    Node current = head;
    Node runner = head;
   
   for(int i=0; i < k; i++) {
      if(i > k) {
        return null;
      }
      current = current.next;
   }

   while(current != null) {
     current = current.next;
     runner = runner.next;
   }

   return runner.data;

  }
