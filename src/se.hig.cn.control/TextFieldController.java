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
	public ArrayList<JTextField> checkTextFields(ArrayList<JTextField> numericAList, ArrayList<JTextField> numericBList) {
		
		for(int i = 0; i < numericAList.size(); i++) {
			if(numericAList.get(i).getText().length() > 0 && !numericAList.get(i).getText().matches("[-0-9]+") || numericAList.get(i).getText().length() > 14)
				wrongList.add(numericAList.get(i));
		}
		
		for(int i = 0; i < numericBList.size(); i++) {
			if(numericBList.get(i).getText().length() > 0 && !numericBList.get(i).getText().matches("[0-9]+") || numericBList.get(i).getText().length() > 13)
				wrongList.add(numericBList.get(i));
		}
		
		if(numericBList.get(2).getText().length() > 0 && numericBList.get(3).getText().length() > 0) {
			wrongList.add(numericBList.get(2));
			wrongList.add(numericBList.get(3));
		}

		return wrongList;
	}
}
