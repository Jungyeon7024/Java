

package com.kh.classBM;
	import com.kh.classAM.AM;

public class BM extends AM { //extends
	public static void main(String[] args) {
		//A 생성자를 class BM에서 만들고 싶어
		AM am = new AM();
		am.publicMethod();
		am.protectedMethod();
		am.defaultMethod();
	}

}
