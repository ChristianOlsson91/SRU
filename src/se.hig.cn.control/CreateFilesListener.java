package se.hig.cn.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import se.hig.cn.model.FileCreator;

/**
 * Låter användaren skapa filer utifrån formuläret.
 * 
 * @author Christian Olsson, Nicolas Suau Carvajal
 * @version 2017-11-14
 */
public class CreateFilesListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		File file = null;
		FileCreator creator = new FileCreator();
		JFileChooser chooser = new JFileChooser();
		chooser.setDialogTitle("Skapa SRU-filer");
		chooser.setApproveButtonText("Spara");
		FileNameExtensionFilter filter = new FileNameExtensionFilter("SRU (*.sru)", ".sru");
		chooser.setFileFilter(filter);
		chooser.setVisible(true);

		String filename = "";
		int returnVal = chooser.showOpenDialog(chooser);

		if (returnVal == JFileChooser.APPROVE_OPTION) {
			file = new File(chooser.getSelectedFile().getAbsolutePath());
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

		if (filename.equals("blanketter.sru")) {
			for (int i = 0; i < creator.getBlanketterList().size(); i++) {
				try {
					writer.write(creator.getBlanketterList().get(i) + "\n");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		} else if (filename.equals("info.sru")) {
			for (int i = 0; i < creator.getInfoList().size(); i++) {
				try {
					writer.write(creator.getInfoList().get(i) + "\n");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}

		try {
			writer.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
