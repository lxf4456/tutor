package com.education.tutor.vo;

import java.awt.image.BufferedImage;
import java.io.File;

public class ImageVO {
	
	private String text;
	private BufferedImage bufferedImage;
	private File image;
	
	public ImageVO(String text, BufferedImage bufferedImage) {
		super();
		this.text = text;
		this.bufferedImage = bufferedImage;
	}

	public String getText() {
		return text;
	}

	public BufferedImage getBufferedImage() {
		return bufferedImage;
	}

	public File getImage() {
		return image;
	}

	public void setImage(File image) {
		this.image = image;
	}

}
