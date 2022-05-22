import java.util.EmptyStackException;

	public class StackMethods {
		private int[] stack;
		private int size ;
		private static final int INITIAL_SIZE = 20;
	
		public StackMethods(){
		  stack = new int[INITIAL_SIZE];
		  size = 0;	
		}
	
	 //1.adding the element in stack
	 public void Push(int element) {
	  if(size == stack.length)
		  {
			  doublecapacity();
		  }
		++size;
		stack[size] = element;
	 }
	
	 //2.If size is full then capacity will doublely created in extendedstack
         private void doublecapacity()
  	 {
  		int extendedcapacity = 2*stack.length;
  		int[] extendedstack = new int[extendedcapacity];
  		for(int i=0;i<stack.length;i++){
  			extendedstack[i] = stack[i];
  		}
  		stack = extendedstack;
  	  }

	  //3.delete the top of the element in stack also return top element
  	  public int Pop() {
  		if(size == 0)
  		{
  			throw new EmptyStackException();
  		}
  		int popped = stack[size];
  		size--;
  		return popped;
  	}
	
	  //4.return the top of the element in stack
  	  public int Peek() {
  		if(size == 0)
  		{
  			throw new EmptyStackException();
  		}
  		int peeked = stack[size];
  		return peeked;
  	  }
	  //5.return stored size of the stack 
  	  public int Size() 
  	  {
  		return size;
  	  }
	
	  //6.Stack is empty return true
  	  public boolean Empty() {
  		if(size == 0){
  			return true;
  		}
  		return false;
  	  }
	
	  //7.how many element are stored In capcity 
  	  public int Capacity() 
  	  {
  		return stack.length;
  	  }
	
	
	  //8.return remaining capacity in stack
  	  public int RemainCapacity() {
  		int remaincapacity = stack.length-size;
  		return remaincapacity;
  	  }

	  //9.Display the Stack
  	  public int[] display() 
  	  {
  		int[] a =new int[Size()];
  		for(int i=0;i<Size();i++){
  			a[i] = stack[i+1];	
  		}
  		return a;
  	  }
	
}
