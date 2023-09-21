package Chap28_Comparable;
import java.util.ArrayList;
import java.util.List;
import Chap28_Comparable.Person;

public class ComparMain {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<Person>();
		people.add(new Person("학생1",78));
		people.add(new Person("학생2",79));
		people.add(new Person("학생3",71));
		
		//나이를 기준으로 정렬
		//Collections.short(people);
		
		for(Person person : people) {
			System.out.println(people);
		}
	}

}
