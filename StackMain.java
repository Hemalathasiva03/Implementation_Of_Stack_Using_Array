import java.util.Arrays;

public class StackMain {

	public static void main(String[] args) {
		
		StackMethods obj = new StackMethods();
		System.out.println("Stack Is Empty : "+obj.Empty());
		obj.Push(1);  //Push the element 1
		obj.Push(2);  //Push the element 2
		obj.Push(3);  //Push the element 3
		obj.Push(4);  //Push the element 4
		obj.Push(5);  //Push the element 5
		System.out.println("Peeked : "+obj.Peek());
		System.out.println("Popped : "+obj.Pop());
		System.out.println("Peeked : "+obj.Peek());
		System.out.println("Size : "+obj.Size());
		System.out.println("total capacity :"+obj.Capacity());
		System.out.println("Remaining capacity : "+obj.RemainCapacity());
		System.out.println("Display Stack:"+Arrays.toString(obj.display()));
		}
	}
