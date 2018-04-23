package com.education.tutor.util;

import com.education.tutor.vo.ImageVO;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * 图片验证码生成工具类
 * 
 * @author clonegod
 *
 */
public final class ImageUtil {

	private static final String[] CHARS = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E",
			"F", "G", "H", "J", "K", "L", "M", "N", "P" };
	private static final int SIZE = 5;// 字符长度
	private static final int LINES = 10;// 干扰线
	private static final int WIDTH = 100;
	private static final int HEIGHT = 50;
	private static final int FONT_SIZE = 30;// 字体大小

	private static final Random RANDOM = new Random();

	/**
	 * 生成一张验证码图片，并保存到本地磁盘。
	 * 
	 * @return 返回验证码字符串，以及对应的图片文件。
	 */
	public static ImageVO createCaptcha() {
		ImageVO imageVo = createImage();

		File imageFile = new File("/tmp/captcha/", UUID.randomUUID().toString().toLowerCase() + ".jpg");
		imageFile.getParentFile().mkdirs();
		try {
			imageFile.createNewFile();
			writeJPEGImage(imageVo.getBufferedImage(), imageFile);
			imageVo.setImage(imageFile);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
		}

		return imageVo;
	}

	public static ImageVO createCaptcha(String instanceId) {
		ImageVO imageVo = createImage();

		File imageFile = new File("/tmp/captcha/", instanceId + ".jpg");
		imageFile.getParentFile().mkdirs();
		try {
			imageFile.createNewFile();
			writeJPEGImage(imageVo.getBufferedImage(), imageFile);
			imageVo.setImage(imageFile);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
		}

		return imageVo;
	}

	public static ImageVO createCaptchaImage() {
		ImageVO imageVo = createImage();
		return imageVo;
	}

	
	private static boolean writeImage(RenderedImage im, String formatName, File file) {
		boolean result = false;
		try {
			result = ImageIO.write(im, formatName, file);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		return result;
	}

	private static boolean writeJPEGImage(RenderedImage im, File file) {
		return writeImage(im, "JPEG", file);
	}

	@SuppressWarnings("unused")
	private static boolean writePNGImage(RenderedImage im, File file) {
		return writeImage(im, "PNG", file);
	}


	private static ImageVO createImage() {
		StringBuffer charBuf = new StringBuffer();

		BufferedImage image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
		Graphics graphic = image.getGraphics();
		graphic.setColor(Color.LIGHT_GRAY);
		graphic.fillRect(0, 0, WIDTH, HEIGHT);
		
		// 随机字符
		for (int i = 1; i <= SIZE; i++) {
			int r = RANDOM.nextInt(CHARS.length);
			graphic.setColor(getRandomColor());
			graphic.setFont(new Font(null, Font.BOLD + Font.ITALIC, FONT_SIZE));
			graphic.drawString(CHARS[r], (i - 1) * WIDTH / SIZE, HEIGHT / 2 + 10);
			charBuf.append(CHARS[r]);// 将字符保存，存入Session
		}
		// 干扰线
		for (int i = 1; i <= LINES; i++) {
			graphic.setColor(getRandomColor());
			graphic.drawLine(RANDOM.nextInt(WIDTH), RANDOM.nextInt(HEIGHT), RANDOM.nextInt(WIDTH), RANDOM.nextInt(HEIGHT));
		}
		ImageVO imageVo = new ImageVO(charBuf.toString(), image);
		return imageVo;
	}

	private static Color getRandomColor() {
		Color color = new Color(RANDOM.nextInt(156), RANDOM.nextInt(156), RANDOM.nextInt(156));
		return color;
	}

	
	// Test
	public static void main(String[] args) throws Exception {
		ImageVO imageVo = createCaptcha();
		System.out.println("Captcha: " + imageVo.getText());
		showImage(imageVo.getBufferedImage());
	}

	private static void showImage(final BufferedImage image) throws Exception {
		JFrame jframe = new JFrame();
		jframe.add(new JPanel() {
			private static final long serialVersionUID = 1L;

			@Override
			public void paintComponent(Graphics g) {
				g.drawImage(image, 0, 0, null);
			}
		});
		jframe.setSize(200, 100);
		jframe.setLocation(500, 300);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setVisible(true);

		TimeUnit.SECONDS.sleep(1);
		jframe.dispose();
	}

}