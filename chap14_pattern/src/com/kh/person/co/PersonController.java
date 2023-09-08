package com.kh.person.co;

import com.kh.person.mo.PersonModel;
import com.kh.person.vo.PersonView;

public class PersonController {
	private PersonModel model;
	private PersonView view;
	
		public PersonController(PersonModel model,PersonView view) {
			this.model = model;
			this.view = view;
		}
	public void run () {
		String userNameInput = view.getNameInput();
		model.setName(userNameInput);
		String userHobbyInput =view.getHobbyInput();
		model.setHobby(userHobbyInput);
		
	}
	
	
}
