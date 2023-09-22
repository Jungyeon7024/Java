import java.io.FileWriter;

public class FileIOMain {
	
	
	public static void main (String[]args) {
	
	try{
	FileWriter fw = null;	// 2번째 인자의 값이 boolean true가 지정되면 해당 파일에 이어쓰기
	fw = new FileWriter("file.txt",true);
	fw.write(1000);
	fw.write(10000);
	
	System.out.println("작업 완료");
}catch(Exception e) {
	e.printStackTrace();
	

}
}
}

