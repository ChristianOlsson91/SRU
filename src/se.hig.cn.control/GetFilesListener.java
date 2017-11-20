package se.hig.cn.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * Hämtar en fil som användaren väljer och läser in innehållet till formuläret
 * 
 * @author Christian Olsson, Nicolas Suau Carvajal
 * @version 2017-11-14
 */
public class GetFilesListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		File file = null;
		JFileChooser chooser = new JFileChooser();
		chooser.setDialogTitle("Välj fil");
		FileNameExtensionFilter filter = new FileNameExtensionFilter("SRU (*.sru)", ".sru");
		chooser.setFileFilter(filter);
		chooser.setVisible(true);

		int returnVal = chooser.showOpenDialog(chooser);
		if (returnVal == JFileChooser.APPROVE_OPTION)
			file = new File(chooser.getSelectedFile().getAbsolutePath());

		BufferedReader buffer = null;

		try {
			buffer = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}

		String s = "";

		try {
			while ((s = buffer.readLine()) != null)
				System.out.println(s);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
