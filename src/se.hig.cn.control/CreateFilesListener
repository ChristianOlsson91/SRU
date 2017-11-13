package se.hig.cn.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class CreateFilesListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		JFileChooser chooser = new JFileChooser();
		chooser.setDialogTitle("Skapa SRU-filer");
		chooser.setApproveButtonText("Spara");
		FileNameExtensionFilter filter = new FileNameExtensionFilter("SRU (*.sru)", ".sru");
		chooser.setFileFilter(filter);
		chooser.setVisible(true);

		int returnVal = chooser.showOpenDialog(chooser);

		if (returnVal == JFileChooser.APPROVE_OPTION) {
			File blanketterFile = new File(chooser.getSelectedFile().getAbsolutePath());
			File infoFile = new File(chooser.getSelectedFile().getAbsolutePath());

			try {
				blanketterFile.createNewFile();
				infoFile.createNewFile();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
}
