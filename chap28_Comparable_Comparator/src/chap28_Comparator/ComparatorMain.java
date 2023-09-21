package chap28_Comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class ComparatorMain implements Comparator<String> {

	@Override
	public int compare(String num1, String num2) {
		//길이가 같으면 0 반환 
		if(num1.length() == num2.length()) {
			return 0;
		}
		// num1이 num2보다 길면 양수
		else if(num1.length()>num2.length()) {
			return 1;
		}
		//num1이 num2보다 짧으면 음수
		else {
			return -1;
		}
	}
		
	public static void main(String[] args) {
		List<String>str = new ArrayList<>();
		str.add("apple");
		str.add("banana");
		str.add("cherry");

		//Comparator 를사용해서 문자열을 정렬 1.길이 2. 순서
		Collections.sort(str,new ComparatorMain());
				
		
		
		//정렬된 결과 출력
		
		for (String s : str) {
			System.out.println(s);
		}
		
		
		
		
	}

}
