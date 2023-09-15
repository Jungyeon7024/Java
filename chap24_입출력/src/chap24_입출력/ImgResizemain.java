package chap24_입출력;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImgResizemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path= "C:\\Users\\user1\\Desktop\\";
		String inputImg = path+"cute.jpg";
		String outputImg = path+"reSizeCute.jpg";
		
		
		int width = 200;
		int height =200;
		
		//원본 이미지 읽어오기
		
		try {
			BufferedImage bufImg =	ImageIO.read(new File(inputImg));
			
			//새로운 크기로 이미지 리사이즈
			Image resizeImg = bufImg.getScaledInstance(width, height, Image.SCALE_SMOOTH);
			
			bufImg.getGraphics().drawImage(resizeImg, 0,0,null);
			
			//BufferedImage 변환
			BufferedImage bufReszieImg = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
			
			//Resize한 이미지를 파일로 저장하기
			ImageIO.write(bufReszieImg, "jpg", new File(outputImg));
			
			System.out.println("이미지 리사이즈 완료!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("이미지 리사이즈 중 오류발생"); e.printStackTrace();
		}
		
	}

}
