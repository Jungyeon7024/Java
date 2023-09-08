package com.kh.person.cl;

import com.kh.person.mo.PersonModel;
import com.kh.person.vo.PersonView;
import com.kh.person.co.PersonController;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonModel model = new PersonModel();
		
		PersonView view = new PersonView();
		
		PersonController controller = new PersonController(model,view);
		
		controller.run();
	}

}
