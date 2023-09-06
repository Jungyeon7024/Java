package H_W;

public class Lotto {
	private int lotto;

	public int getLotto() {
		return lotto;
		int lotto[] = new int [6];
		
		  
		for(int i=0; i<6; i++) {// 번호 뽑아내기
			lotto[i] = (int)(Math.random() * 45) + 1;
    
		  	 
	    for(int j=0; j<i; j++) { //중복 숫자 없애기
	    	if(lotto[i] == lotto[j]) {
	    		i--;
	    		break;
	
	    	}
	    }
		}
	}
	        	
	    

	public void setLotto(int lotto) {
		this.lotto = lotto;
		System.out.print("당첨 번호: ");

		
		for(int i=0; i<6; i++) {//당첨 번호 뽑아내기
			System.out.print(lotto[i] + " ");
	}
		
	}
	    }
	
	
		


