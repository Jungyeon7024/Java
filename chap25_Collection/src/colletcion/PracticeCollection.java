package colletcion;

import java.util.ArrayList;
import java.util.List;
import java.util.Set; 
import java.util.HashSet; 
import java.util.Map;
import java.util.HashMap;

public class PracticeCollection {

	public static void main(String[] args) {
		PracticeCollection pc = new PracticeCollection();
		
		//pc.practiceList();
		pc.practiceMap();
	}
	public void practiceList() {
		List<String> pList = new ArrayList<>();
		pList.add("참치");
		pList.add("광어");
		pList.add("연어");
		
		System.out.println("List :");
		
		for(String fish : pList) {
			System.out.println(fish);
		}
		
		Set<Integer> pset = new HashSet<>();
		pset.add(1);
		pset.add(2);
		pset.add(3);
		pset.add(1);
		
		for(Integer number : pset) {
			System.out.println(number);
		}
	
		
		
	}
	
	public void practiceMap() {
		
		Map<String, Integer> mMap = new HashMap<>();
		mMap.put("한국", 1);
		mMap.put("북한", 99);
		mMap.put("북한", 100);
		mMap.put("일본", 2);
		mMap.put("중국", 3);
		
		
		for (String country : mMap.keySet()) {
			int code = mMap.get(country);
			System.out.println(country + " : "+code);
		}
		
		
	}
	

}
