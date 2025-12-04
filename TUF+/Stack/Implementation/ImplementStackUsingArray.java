// https://takeuforward.org/plus/dsa/stack-and-queues/implementation/implement-stack-using-arrays

class ArrayStack {
  int top;
  int size;
  int temp[];

  public ArrayStack() {
    top = -1;
    size = 10; // self selected size
    temp = new int[10]; // self selected size
  }

  public void push(int x) {
    if (top + 1 == size) {
      System.out.println("Stack Overloaded");
      return;
    }
    top++;
    temp[top] = x;
  }

  public int pop() {
    if (top == -1) {
      System.out.println("Stack is Empty!");
      return -1;
    }
    int elementRemove = temp[top];
    top--;
    return elementRemove;
  }

  public int top() {
    if (top == -1) {
      System.out.println("Stack is Empty!");
      return -1;
    }
    return temp[top];
  }

  public boolean isEmpty() {
    if (top == -1) {
      return true;
    }
    return false;
  }
}
