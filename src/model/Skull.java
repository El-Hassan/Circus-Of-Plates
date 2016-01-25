package model;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Skull extends Shape{
	public Skull() throws IOException{
		this.image=ImageIO.read(new File("../circusOfplates2/src/images/Body-Skull-icon.png"));
		this.type="skull";
	}

}
