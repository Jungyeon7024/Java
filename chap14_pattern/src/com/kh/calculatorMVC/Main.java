package com.kh.calculatorMVC;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//model = CalculatorView 
		// Controller  CalculatorController 가져오기
		
		
		 CalculatorModel model = new CalculatorModel();
		 CalculatorView view = new CalculatorView();
		
		CalculatorController controller = new CalculatorController(model,view);
		
		
		public void run(0) {
			
		}
		
		
	}

}
