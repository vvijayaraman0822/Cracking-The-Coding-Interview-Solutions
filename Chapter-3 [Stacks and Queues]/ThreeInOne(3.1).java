// Chapter 3- 3.1 - Three in One
/* Describe how you could use a single array to implement three stacks
*/
// Single array implementation of three stacks 

private class Stack {
  int[] stackData; // actual array to hold the stack
  int[] topOfStack; // arrays that maps all tops of all stacks
  int[] nextIndex; // given a node, returns what's the next available node
  int size;
  int nextAvailable = 0; // which Index should the value be pushed into

  public Stack(int size) {
    topOfStack = new int[]{-1,-1,-1};
    stackData = new int[size];
    nextIndex = new int[]{1,2,3,4,5,-1};
  }
 
  public void push(int stackIndex, int data) {
    if (stackIndex < 0 || stackIndex >= topOfStack.length) {
      throw new IndexOutOfBoundsException();
    }
    if (nextAvailable < 0) {
      return;
    }

    int currentIndex = nextAvailable;
    nextAvailable = index[currentIndex];
    stackData[currentIndex] = data;
    nextIndex[currentIndex] = topOfStack[stackIndex];
    topOfStack[stackIndex] = currentIndex;
  }

  public int pop(int stackIndex) {
    if (stackIndex < 0 || stackIndex >= topOfStack.length || topOfStack[stackIndex] < 0) {
        throw new IndexOutOfBoundsException();
    }
    int currentIndex = topOfStack[stackIndex];
    int value = stackData[currentIndex];
    topOfStack[stackIndex] = nextIndex[currentIndex];
    nextIndex[currentIndex] = nextAvailable;
    nextAvailable = currentIndex;
    return value;
  }
}