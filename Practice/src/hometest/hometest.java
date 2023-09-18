package hometest;

public class hometest {
	
	public static void main(String[] args) {
		hometest h = new hometest();
		h.hometest1(1, 2, 3, 4);
	}

	public void hometest1(int numer1, int denom1, int numer2, int denom2) { 
        int a =  numer1 % denom1 ;
        System.out.println(a);
        
        int b = numer2 % denom2 ;
        System.out.println(b);
            
        int av = a + b;
        System.out.println(av);

	}
}