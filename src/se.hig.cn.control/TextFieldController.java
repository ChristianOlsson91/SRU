package se.hig.cn.control;

import java.util.ArrayList;
import java.util.Calendar;

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
	ArrayList<JTextField> correctList = new ArrayList<>();
	private boolean canCreateFiles = false;
	private boolean rightPeriod = false;

	/**
	 * Tar emot en lista med alla textfält från GUI-klassen och kollar igenom dem och skickar sedan tillbaka textfälten som är inkorrrekta.
	 * 
	 * @param textfieldList - Lista med alla textfält från GUI-klassen.
	 * @return wrongList - Lista med alla textfält som är inkorrekta.
	 */
	public ArrayList<JTextField> checkTextFields(ArrayList<JTextField> numericAList, ArrayList<JTextField> numericBList, ArrayList<JTextField> fieldList, ArrayList<JTextField> personuppgiftsList, String period) {
		
		if(fieldList.get(0).getText().length() == 12 && fieldList.get(0).getText().matches("[0-9]+"))
			correctList.add(fieldList.get(0));
		else
			wrongList.add(fieldList.get(0));
		
		if(fieldList.get(1).getText().length() != 0 && Integer.parseInt(fieldList.get(1).getText().substring(0, 4)) >= 1900 && (Integer.parseInt(fieldList.get(1).getText().substring(0, 4)) < 2018)
			&& (Integer.parseInt(fieldList.get(1).getText().substring(4, 6)) >= 01) && (Integer.parseInt(fieldList.get(1).getText().substring(4, 6)) <= 12)
			&& (Integer.parseInt(fieldList.get(1).getText().substring(6, 8)) >= 01) && (Integer.parseInt(fieldList.get(1).getText().substring(6, 8)) <= 31))
				correctList.add(fieldList.get(1));
		else
			wrongList.add(fieldList.get(1));
		
		if(fieldList.get(2).getText().length() != 0 && Integer.parseInt(fieldList.get(2).getText().substring(0, 4)) >= 1900 && (Integer.parseInt(fieldList.get(2).getText().substring(0, 4)) < 2018)
				&& (Integer.parseInt(fieldList.get(2).getText().substring(4, 6)) >= 01) && (Integer.parseInt(fieldList.get(2).getText().substring(4, 6)) <= 12)
				&& (Integer.parseInt(fieldList.get(2).getText().substring(6, 8)) >= 01) && (Integer.parseInt(fieldList.get(2).getText().substring(6, 8)) <= 31))
					correctList.add(fieldList.get(2));
			else
				wrongList.add(fieldList.get(1));
		
		if(fieldList.get(3).getText().length() != 0 && Integer.parseInt(fieldList.get(1).getText().substring(0, 4)) >= 1900 && (Integer.parseInt(fieldList.get(3).getText().substring(0, 4)) < 2018)
				&& (Integer.parseInt(fieldList.get(3).getText().substring(4, 6)) >= 01) && (Integer.parseInt(fieldList.get(3).getText().substring(4, 6)) <= 12)
				&& (Integer.parseInt(fieldList.get(3).getText().substring(6, 8)) >= 01) && (Integer.parseInt(fieldList.get(3).getText().substring(6, 8)) <= 31))
					correctList.add(fieldList.get(3));
			else
				wrongList.add(fieldList.get(3));
		
		for(int i = 0; i < numericAList.size(); i++) {
			if(numericAList.get(i).getText().length() > 0 && !numericAList.get(i).getText().matches("[-0-9]+") || numericAList.get(i).getText().length() > 14)
				wrongList.add(numericAList.get(i));
			else
				correctList.add(numericAList.get(i));
		}
		
		for(int i = 0; i < numericBList.size(); i++) {
			if(numericBList.get(i).getText().length() > 0 && !numericBList.get(i).getText().matches("[0-9]+") || numericBList.get(i).getText().length() > 13)
				wrongList.add(numericBList.get(i));
			else
				correctList.add(numericBList.get(i));
		}
		
		if(numericBList.get(2).getText().length() > 0 && numericBList.get(3).getText().length() > 0) {
			wrongList.add(numericBList.get(2));
			wrongList.add(numericBList.get(3));
		}
		else {
			correctList.add(numericBList.get(2));
			correctList.add(numericBList.get(3));
		}
		
		if(personuppgiftsList.get(0).getText().matches("[ A-Öa-ö]+"))
			correctList.add(personuppgiftsList.get(0));
		else
			wrongList.add(personuppgiftsList.get(0));

		if(personuppgiftsList.get(1).getText().length() != 0)
			if(personuppgiftsList.get(1).getText().matches("[ A-Öa-ö0-9]+"))
				correctList.add(personuppgiftsList.get(1));
			else
				wrongList.add(personuppgiftsList.get(1));
		
		if(personuppgiftsList.get(2).getText().matches("[0-9]+") && Integer.parseInt(personuppgiftsList.get(2).getText()) >= 10000 && Integer.parseInt(personuppgiftsList.get(2).getText()) <= 99999)
			correctList.add(personuppgiftsList.get(2));
		else
			wrongList.add(personuppgiftsList.get(2));
		
		if(personuppgiftsList.get(3).getText().matches("[A-Öa-ö]+"))
			correctList.add(personuppgiftsList.get(3));
		else
			wrongList.add(personuppgiftsList.get(3));
		
		//if(personuppgiftsList.get(4).getText().length() !=0 )
		//	if(personuppgiftsList.get(4).getText().matches())
		
		if(personuppgiftsList.get(6).getText().length() != 0)
			if(personuppgiftsList.get(6).getText().contains("@"))
				correctList.add(personuppgiftsList.get(6));
			else
				wrongList.add(personuppgiftsList.get(6));
		
		if(personuppgiftsList.get(7).getText().length() != 0)
			if(personuppgiftsList.get(7).getText().matches("[0-9]+"))
				correctList.add(personuppgiftsList.get(7));
			else
				wrongList.add(personuppgiftsList.get(7));
		
		if(period.equals("P1") || period.equals("P2") || period.equals("P3") || period.equals("P4"))
			rightPeriod = true;
		else
			rightPeriod = false;

		if(wrongList.size() == 0)
			canCreateFiles = true;
		
		return wrongList;
	}
	
	public boolean canCreateFiles() {
		return canCreateFiles;
	}
	
	public boolean rightPeriod() {
		return rightPeriod;
	}

	public ArrayList<JTextField> getCorrectList() {
		return correctList;
	}
}
