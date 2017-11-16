package se.hig.cn.control;

import java.util.ArrayList;

import javax.swing.JTextField;

/**
 * Kollar att alla textfält är korrekta.
 * 
 * @author Christian Olsson, Nicolas Suau Carvajal
 * @version 2017-11-14
 *
 */
public class TextFieldController {
	ArrayList<JTextField> wrongList = new ArrayList<>();

	/**
	 * Tar emot en lista med alla textfält från GUI-klassen och kollar igenom dem och skickar sedan tillbaka textfälten som är inkorrrekta.
	 * 
	 * @param textfieldList - Lista med alla textfält från GUI-klassen.
	 * @return wrongList - Lista med alla textfält som är inkorrekta.
	 */
	public ArrayList<JTextField> checkTextFields(ArrayList<JTextField> textfieldList) {
		
		for(int i = 0; i < textfieldList.size(); i++) {
			if(textfieldList.get(i).getText().length() == 0)
				wrongList.add(textfieldList.get(i));
		}
		
		for (int i = 0; i < wrongList.size(); i++) {
			System.out.println(i + ". " + wrongList.get(i).getText());
		}

		return wrongList;
	}
}
