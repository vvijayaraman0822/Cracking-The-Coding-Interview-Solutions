// Chapter - 3, 3.5 Sort Stack
// Write a program to sort a stack such that the smallest items are on the top. 
// You may use additional stacks to hold items, but you may not copy the elements into any other data structure (such as an array). 
// The stack supports the following operations: push, pop, peek, and isEmpty.

import java.util.Stack;

class Main {
    Stack<Integer> inputStack = new Stack<>();
    inputStack.push(2);
    inputStack.push(4);
    inputStack.push(10);
    inputStack.push(7);
    inputStack.push(3);
    sortStack(inputStack);

    public Stack<Integer> sortStack(Stack<Integer> inputStack) {
      Stack<Integer> tempStack = new Stack<>();
      while(!inputStack.isEmpty()) {
        int currentData = inputStack.pop();
        while(!tempStack.isEmpty() && tempStack.peek() > currentData) {
           intputStack.push(tempStack.pop());
        }
         tempStack.push(currentData);
      } 
	  while(!tempStack.isEmpty()) {
	  inputStack.push(tempStack.pop())
   }
   return inputStack;
}