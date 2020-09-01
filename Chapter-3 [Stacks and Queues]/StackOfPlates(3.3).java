// Chapter - 3, 3.3 Stack of Plates

/* Imagine a stack of plates. If the stack gets too high, it might topple.
 * Therefore, in real life, we would literally start a new stack when the
 * previous stack exceeds some threshold. Implement a data structure,
 * SetOfStacks which mimics this. SetOfStacks should be composed of several 
 * stacks and should create a new stack once the previous one exceeds capacity.
 * SetOfStacks.push() and SetOfStacks.pop() should behave identically to a 
 * single stack (that is, pop() should return the same values as it would if
 * there were just a single stack.)
 * 
 * FOLLOW UP : Implement a function popAt(int index) which performs a pop
 * function on a specific sub-stack.
 * 
 */



import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


  public class Stack {
    public List<Stack<Integer>> myStack;
    public int eachStackSize = 10;
    int currentNumber;

    public Stack() {
      myStack = new ArrayList<>();
    }

  public void push(int num) {
    // if size is 0, create a new Stack and Push
    if (myStack.size() == 0) {
        createNewStackAndPush(num);
    } else {
      // otherwise, get the lastStack and see if it has met it's limit,
      // if, yes create new stack and push, else push to same stak
      Stack<Integer> lastStack = getLastStack();
      if (lastStack != null) {
        if (lastStack.size() >= eachStackSize) {
          createNewStackAndPush(num);
        } else {
          lastStack.push(num);
        }
      }
    }
  }

// returns the last stack
  public Stack getLastStack() {
    if(!myStack.isEmpty()) {
      return myStack.get(myStack.size() - 1);
    }
    return null;
  }
   

public void createNewStackAndPush(int num) {
 Stack<Integer> stack = new Stack();
 stack.push(num);
 myStack.push(stack);
}


public Integer pop() {
  Stack<Integer> lastStack = getLastStack();
  if (lastStack == null) {
    throw new EmptyStackException();
  }
  Integer item = lastStack.pop();
  if (lastStack.size == 0) {
    myStack.remove(myStack.size() - 1);
  }

  return item;
}

public Integer popAtIndex(int stackNumber) {
  if (stackNumber >= myStack.size) {
      return null;
  }
  return myStack.get(stackNumber).pop();
}

  }

  }
