package infoMetics;
import java.util.*;

public class stringClass {

	public static void main(String[] args) {
		
//		char ch[]= {'D','D','S','I','N','G'};
//		String s1=new String(ch,2,3);
//		System.out.println(s1);
//		
//		byte b[]= {68,68,82,77,79,68};//print the value of the above Ascii code..
//		String s2=new String(b,0,3);
//		System.out.println(s2);
		
		
		
		StringBuffer s=new StringBuffer("Hello");
		//The insert() method inserts the given string with this string at the given position.
		//s.insert(1,"Java");
		
		//The replace() method replaces the given string from the specified beginIndex and endIndex-1
		//s.replace(1, 3, "java");
		
		//The delete() method of StringBuffer class deletes the string from the specified beginIndex to
		//s.delete(1, 3);//(Hlo)
		
		//The reverse() method of StringBuilder class reverses the current string.
		//s.reverse();
		StringBuffer sb=new StringBuffer(); 
        System.out.println(sb.capacity());//default 16 
        sb.append("Hello"); 
        System.out.println(sb.capacity());//now 16 
        sb.append("java is my favourite language"); 
        System.out.println(sb.capacity()); 
		//System.out.println(s);
	}

}
