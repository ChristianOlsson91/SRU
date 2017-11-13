package se.hig.cn.control;

import java.util.ArrayList;

public class TextFieldController {
	ArrayList<String> wrongList = new ArrayList<>();

	public ArrayList<String> checkTextFields(ArrayList<String> textList) {

		for (int i = 0; i < textList.size(); i++)
			if (!textList.get(i).matches("[0-9]+"))
				wrongList.add(textList.get(i));

		for (int i = 0; i < wrongList.size(); i++) {
			System.out.println(wrongList.get(i));
		}

		return wrongList;
	}
}
