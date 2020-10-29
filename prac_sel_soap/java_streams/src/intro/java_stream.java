package intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;
@Test()
public class java_stream {
	@Test()
	public static void main(String[] args) {
//		regular();
//		streams();
//		streamMap();
		conversionintolist();
	}
	
	
	public static void regular(){
		
		ArrayList<String> names=new ArrayList<String>();
		names.add("Fardeen");
		names.add("avijit");
		names.add("sachit");
		names.add("aaradh");
		names.add("arun");
		int count=0;
		for(int i=0;i<names.size();i++) {
			String actualname=names.get(i);
			if(actualname.startsWith("a")) {
				count++;
			}
			
		}
		System.out.println(count);
		
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		names.stream().filter(s->s.length()>4).limit(2).forEach(s->System.out.println(s));
	}
	
	public static void streams() {
		ArrayList<String> names=new ArrayList<String>();
		names.add("Fardeen");
		names.add("avijit");
		names.add("sachit");
		names.add("aaradh");
		names.add("arun");
		
		long c=names.stream().filter(s->s.startsWith("a")).count();
		System.out.println(c);
		
		long d=Stream.of("Avijit","Aloo","Aaradh","Fak","lil").filter(s->{s.startsWith("A");return true;}).count();
		System.out.println(d);
	}

	public static void streamMap() {
//		Stream.of("Avijit","Alook","Aaradh","Fak","lilk").filter(s->s.endsWith("k")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		ArrayList<String> names=new ArrayList<String>();
		names.add("Fardeen");
		names.add("avijit");
		names.add("sachit");
		names.add("aaradh");
		names.add("arun");
		
		List<String>name1= Arrays.asList("Avijit","Aloo","Aaradh","Fak","lil");
//		name1.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	
		//meriging of two steams 
		Stream<String> newstring=Stream.concat(names.stream(), name1.stream());
//		newstring.sorted().forEach(s->System.out.println(s));
		boolean flag=newstring.anyMatch(s->s.equals("Fardeen"));
		System.out.println(flag);
		Assert.assertTrue(flag, "test case pass");
	}
	
	public static void conversionintolist() {
	
	Stream<String> ls = (Stream<String>) Stream.of("Avijit","Aloo","Aaradh","Fak","lil").filter(s->s.startsWith("A")).sorted();
	List<String> lipp=((Stream<String>) ls).collect(Collectors.toList());
	System.out.println(lipp);
	}
}

