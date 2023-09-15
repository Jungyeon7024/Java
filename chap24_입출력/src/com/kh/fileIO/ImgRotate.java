package com.kh.fileIO;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImgRotate {

	public static void main(String[] args) {
		String path = "C:\\Users\\user1\\Desktop\\";
		String inputImg = path + "kamen.jpg";
		String outputImg = path + "reSizseKamen.jpg";
		
		
		//이미지 로드
		try {
			BufferedImage originImg =ImageIO.read(new File(inputImg));
		} catch (IOException e) {
			
			//이미지 90도 회전
			BufferedImage rotateImg = rotateImage(originImg,90);
			
			ImageIO.write(rotateImg, "jpg", new File(outputImg));
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	
		//이미지를 주어진 각도로 회전하는 메서드
	public static BufferedImage rotateImage(BufferedImage originImg,double degrees) {
			double radians =Math.toRadians(degrees); 
			double sin = Math.abs(radians);
			double cos = Math.abs(radians);
			
			int width = originImg.getWidth();
			int height = originImg.getHeight();
			
			
			int newWidth = (int) Math.floor(width * cos+ height *sin);
			int newHeight = (int) Math.floor(height * cos+ width *sin);
			
			
			BufferedImage rotateImg = new BufferedImage(newWidth, newHeight,originImg.getType());
			Graphics2D g2d = rotateImg.createGraphics();
			g2d.translate((newWidth-width)/2,(newHeight-height)/2);
			g2d.rotate(radians,width/2,height/2	);
			g2d.drawRenderableImage(originImg, null);
			g2d.dispose();
			
			
			return rotateImage;
			
			
					
	}
}
