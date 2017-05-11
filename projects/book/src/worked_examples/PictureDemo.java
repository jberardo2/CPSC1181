package worked_examples;

import common.Picture;

public class PictureDemo
{
	public PictureDemo() {
	}
	
	public static void run() {
		Picture pic = new Picture();
		pic.load("data/skull.jpeg");
        int newWidth = pic.getWidth() - 40;
	    int newHeight = pic.getHeight() - 40;
	    pic.scale(newWidth, newHeight);
	    pic.move(20, 20);
		pic.border(5);
	}
}