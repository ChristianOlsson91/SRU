package se.hig.cn.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

import se.hig.cn.model.FileCreator;
import se.hig.cn.view.GUI;

/**
 * Låter användaren skapa filer utifrån formuläret.
 * 
 * @author Christian Olsson, Nicolas Suau Carvajal
 * @version 2017-11-14
 */
public class CreateFilesListener {

	private ArrayList<JTextField> numericAList = new ArrayList<>();
	private ArrayList<JTextField> numericBList = new ArrayList<>();
	private ArrayList<JTextField> fieldList = new ArrayList<>();
	private ArrayList<JTextField> personuppgiftsList = new ArrayList<>();

	public void createFiles() {
		File file = null;
		FileCreator creator = new FileCreator();
		JFileChooser chooser = new JFileChooser();
		chooser.setDialogTitle("Skapa SRU-filer");
		chooser.setApproveButtonText("Spara");
		FileNameExtensionFilter filter = new FileNameExtensionFilter("SRU (*.SRU)", "SRU");
		chooser.setFileFilter(filter);
		chooser.setVisible(true);

		String filename = "";
		int returnVal = chooser.showOpenDialog(chooser);

		if (returnVal == JFileChooser.APPROVE_OPTION) {
			file = new File(chooser.getSelectedFile().getAbsolutePath().toUpperCase());
			filename = chooser.getSelectedFile().getName();

			try {
				file.createNewFile();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}

		FileWriter writer = null;
		try {
			writer = new FileWriter(file);
		} catch (IOException e2) {
			e2.printStackTrace();
		}

		if (filename.equalsIgnoreCase("BLANKETTER.SRU")) {
			for (int i = 0; i < creator.getBlanketterList().size(); i++) {
				try {
					writer.write(creator.getBlanketterList().get(i) + "\n");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}

			for (int i = 0; i < numericAList.size(); i++)
				try {
					if (!numericAList.get(i).getText().isEmpty())
						writer.write("#UPPGIFT " + numericAList.get(i).getName() + " " + numericAList.get(i).getText()
								+ "\n");
				} catch (IOException e1) {
					e1.printStackTrace();
				}

			for (int i = 0; i < numericBList.size(); i++)
				try {
					if (!numericAList.get(i).getText().isEmpty())
						writer.write("#UPPGIFT " + numericBList.get(i).getName() + " " + numericBList.get(i).getText()
								+ "\n");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
		} else if (filename.equalsIgnoreCase("INFO.SRU")) {

			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd hhmmss");
			Date date = new Date();
			date = Calendar.getInstance().getTime();


			for (int i = 0; i < creator.getInfoList().size(); i++) {
				try {
					if(creator.getInfoList().get(i).equals("#SKAPAD"))
						writer.write(creator.getInfoList().get(3) + " " + simpleDateFormat.format(date));
					
					writer.write(creator.getInfoList().get(i) + " " + personuppgiftsList.get(i).getText() + "\n");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}

			try {
				writer.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}

	public void save(ArrayList<JTextField> numericAList, ArrayList<JTextField> numericBList,
			ArrayList<JTextField> fieldList, ArrayList<JTextField> personuppgiftsList) {
		this.numericAList = numericAList;
		this.numericBList = numericBList;
		this.fieldList = fieldList;
		this.personuppgiftsList = personuppgiftsList;
	}
}