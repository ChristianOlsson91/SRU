package se.hig.cn.control;

import se.hig.CN.model.FileCreator;
import se.hig.CN.view.GUI;

public class Main {

	public static void main(String[] args) {
		new GUI();
		
		FileCreator c = new FileCreator();
		c.createStructureForFile();
	}
}
