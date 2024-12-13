package string;

public class StringFunctions {

	public static void main(String[] args) {
		
		//String Functions
		
		String s1="Good Morning";
		
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		System.out.println(s1.charAt(0));//G
		System.out.println(s1.length());//12
		
		System.out.println(s1.startsWith("G"));
		System.out.println(s1.endsWith("i"));
		
		System.out.println(s1.contains("z"));
		
		System.out.println(s1.replace("G", "F"));
		
		System.out.println(s1.substring(6));//starts at index 6 and goes till last char
		System.out.println(s1.substring(3, 8)); //start index and end index(returns upto end index-1)
		
		
		char[] chars=s1.toCharArray();
		
		for(char c:chars) {
			System.out.print(c+" ");
		}
		String[] str = s1.split(" ");
		
		System.out.println();
		for(String s : str) {
			System.out.println(s);
		}
		
		
		
		//StringBuffer & StringBuilder Functions
		
		
		StringBuffer sb = new StringBuffer("Hello World");
		
		System.out.println(sb);
		
		System.out.println(sb.append(" Good Morning"));
		
		System.out.println(sb.insert(4,"oo")); //it will insert given string at given index and
		
		System.out.println(sb.replace (0, 3, "1234"));
		
		System.out.println(sb.delete(0, 3));
		System.out.println(sb.reverse());
		
		
		

	}

}
