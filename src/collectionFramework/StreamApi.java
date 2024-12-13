package collectionFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> sub = new ArrayList<String>();
		
		sub.add("english");
		sub.add("algebra");
		sub.add("geometry");
		sub.add("history");
		sub.add("geography");
		sub.add("hindi");
		
		//System.out.println(sub);
		
		Stream<String> s1 = sub.stream();
		
		//s1.forEach(n -> System.out.println(n));
		
//		s1.sorted().forEach(n -> System.out.println(n));
		
		s1.filter(n -> n.contains("e")).forEach(n -> System.out.println(n));
		
		
		System.out.println("_____________________");
		
		Stream<String> s2 = sub.parallelStream();
//		s2.sorted().forEach(n -> System.out.println(n));
		
		System.out.println("################");
		
		s2.filter(n -> n.endsWith("y")).forEach(n -> System.out.println(n));

	}

}
