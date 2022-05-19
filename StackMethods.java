import java.util.EmptyStackException;

	public class StackMethods {
		private int[] stack;
		private int size ;
		private static final int INITIAL_SIZE = 20;
	
		public StackMethods(){
		  stack = new int[INITIAL_SIZE];
		  size = -1;	
		}
	
	 //adding the element in stack if the stack is full then create double the capacity
	 public void Push(int element) {
	  if(size == stack.length)
		  {
			  doublecapacity();
		  }
		++size;
		stack[size] = element;
	 }
	
	 //If size is full then capacity will doublely created in extendedstack
   private void doublecapacity()
  	{
  		int extendedcapacity = 2*stack.length;
  		int[] extendedstack = new int[extendedcapacity];
  		for(int i=0;i<stack.length;i++){
  			extendedstack[i] = stack[i];
  		}
  		stack = extendedstack;
  	}

	  //delete the top of the element in stack also return top element
  	public int Pop() {
  		if(size == -1)
  		{
  			throw new EmptyStackException();
  		}
  		int popped = stack[size];
  		size--;
  		return popped;
  	}
	
	  //return the top of the element in stack
  	public int Peeek() {
  		if(size == -1)
  		{
  			throw new EmptyStackException();
  		}
  		int peeked = stack[size];
  		return peeked;
  	}
	  //return stored size of the stack 
  	public int Size() 
  	{
  		return size;
  	}
	
	  //Stack is empty return true
  	public boolean Empty() {
  		if(size == -1){
  			return true;
  		}
  		return false;
  	}
	
	  //how many element are stored In capcity 
  	public int Capacity() 
  	{
  		return stack.length;
  	}
	
	
	  //expect the store the element remaining capacity in stack
  	public int RemainCapacity() {
  		int remaincapacity = stack.length-size;
  		return remaincapacity;
  	}

	  //Display the Stack
  	public int[] display() 
  	{
  		int[] a =new int[Size()+1];
  		for(int i=0;i<=Size();i++){
  			a[i] = stack[i];	
  		}
  		return a;
  	}
	
}