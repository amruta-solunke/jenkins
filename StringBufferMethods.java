package StringBuffer;

public class StringBufferMethods {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("String ");
		
		//append() method
		sb.append("Buffer");
		System.out.println(sb);
		
		//insert() method
		sb.insert(0,"java ");
		System.out.println(sb);

		//replace() method
		sb.replace(0, 10, "Hello ");
		System.out.println(sb);
		
		//delete() method
		sb.delete(0,5);
		System.out.println(sb);
		
		//reverse() method
		sb.reverse();
		System.out.println(sb);
		
		//capacity() method
		StringBuffer sb1 = new StringBuffer();
		System.out.println("Default capacity :"+ sb1.capacity());
		
		sb1.append("String");
		System.out.println(sb1);
		System.out.println("Capacity :"+ sb1.capacity());
		
		sb1.append("Buffer is mutable");
		System.out.println(sb1);
		System.out.println("Capacity :"+ sb1.capacity());

		//ensureCapacity() method
		sb1.ensureCapacity(10);
		System.out.println(sb1);
		System.out.println("Ensure Capacity is 10 :"+ sb1.capacity());
		
		sb1.ensureCapacity(50);
		System.out.println("Ensure Capacity is 50 :"+ sb1.capacity());
		
		
		

	}

}
