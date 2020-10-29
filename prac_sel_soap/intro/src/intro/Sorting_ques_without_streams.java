package intro;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//question is below find out put of 1 and 2 
//you have a list = [1,2,3,3,8,7,4,4,8,3,2,1,5,9,0]
//
//1  i want unique nos. in an order of decreaing
//
//2. print the 4 th obj in it 




public class Sorting_ques_without_streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> a= new ArrayList<Integer>(); 
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(3);
		a.add(8);
		a.add(7);
		a.add(4);
		a.add(4);
		a.add(8);
		a.add(3);
		a.add(2);
		a.add(5);
		a.add(9);
		a.add(0);
		a.add(6);
		
		System.out.println("The list with dups and unsorted "+ a);
		Stream<Integer> s=a.stream().distinct().sorted();
		List<Integer> b=s.collect(Collectors.toList());
		System.out.println("The list sorted snd without dups " + b);
		System.out.println("The 4 th obj in new list is "+ b.get(3) );
		
		
	}

}
