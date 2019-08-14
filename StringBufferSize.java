package session7;

public class StringBufferSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str=new StringBuffer("This is");
		System.out.println(str);
		System.out.println(str.capacity());
		str.append(" a String");
		System.out.println(str);
		System.out.println(str.capacity());
		str.append(" Of characters");
		System.out.println(str);
		System.out.println(str.capacity());
		str.append(" and lots and lots of more characters to test how the buffer grows");
		System.out.println(str);
		System.out.println(str.capacity());
	}

}
