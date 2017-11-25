package se.hig.cn.control;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * Hämtar en fil som användaren väljer och läser in innehållet till formuläret
 * 
 * @author Christian Olsson, Nicolas Suau Carvajal
 * @version 2017-11-14
 */
public class GetFilesListener {

	ArrayList<JTextField> numericAList = new ArrayList<>();
	ArrayList<JTextField> numericBList = new ArrayList<>();
	ArrayList<JTextField> fieldList = new ArrayList<>();
	ArrayList<JTextField> personuppgiftsList = new ArrayList<>();
	ArrayList<String> uppgiftsList = new ArrayList<>();
	String filename = "";

	public void readFromFiles() {
		File file = null;
		JFileChooser chooser = new JFileChooser();
		chooser.setDialogTitle("Välj fil");
		FileNameExtensionFilter filter = new FileNameExtensionFilter("SRU (*.sru)", ".sru");
		chooser.setFileFilter(filter);
		chooser.setVisible(true);

		int returnVal = chooser.showOpenDialog(chooser);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			file = new File(chooser.getSelectedFile().getAbsolutePath());
			filename = chooser.getSelectedFile().getName();
		}

		BufferedReader buffer = null;

		try {
			buffer = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}

		String s = "";
		ArrayList<String> list = new ArrayList<>();

		try {
			while ((s = buffer.readLine()) != null) {
				String[] sArray = s.split(" ");

				if (sArray.length == 2) {
					list.add(sArray[0] + " " + sArray[1]);
				} else if (sArray.length == 3 && sArray[0].equals("#UPPGIFT")) {
					uppgiftsList.add(sArray[1] + " " + sArray[2]);
				}
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		for(int i = 0; i < uppgiftsList.size(); i++)
			System.out.println(uppgiftsList.get(i));
		
		/*for (int i = 0; i < uppgiftsList.size()+1; i += 2) {
		
			for (int j = 0; j < numericAList.size(); j++) {
				if (uppgiftsList.get(i) == numericAList.get(j).getName()) {
					numericAList.get(j).setText(uppgiftsList.get(i));
				} else if (uppgiftsList.get(i) == numericBList.get(j).getName()) {
					numericBList.get(j).setText(uppgiftsList.get(i));
				}
			}
		}*/
	}

	public ArrayList<JTextField> getNumericAList() {
		return numericAList;
	}
	
	public ArrayList<JTextField> getNumericBList() {
		return numericBList;
	}
	
	public ArrayList<String> getUppgiftsList() {
		return uppgiftsList;
	}
	
	public void save(ArrayList<JTextField> numericAList, ArrayList<JTextField> numericBList, ArrayList<JTextField> fieldList, ArrayList<JTextField> personuppgiftsList) {
		this.numericAList = numericAList;
		this.numericBList = numericBList;
		this.fieldList = fieldList;
		this.personuppgiftsList = personuppgiftsList;
	}
}
