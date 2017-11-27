package se.hig.cn.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * Låter användaren välja en fil som ska visas i ett separat fönster.
 * 
 * @author Christian Olsson, Nicolas Suau Carvajal
 * @version 2017-11-14
 */
public class ShowFilesListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		JFrame frame = new JFrame();
		JTextArea area = new JTextArea();
		area.setEditable(false);
		frame.add(area);

		JFileChooser chooser = new JFileChooser();
		chooser.setDialogTitle("Välj fil");
		chooser.setApproveButtonText("Öppna");
		FileNameExtensionFilter filter = new FileNameExtensionFilter("SRU (*.SRU)", "SRU");
		chooser.setFileFilter(filter);
		chooser.setVisible(true);

		File file = null;
		BufferedReader reader = null;

		int returnVal = chooser.showOpenDialog(chooser);
		if (returnVal == JFileChooser.APPROVE_OPTION)
			file = new File(chooser.getSelectedFile().getAbsolutePath());

		try {
			reader = new BufferedReader(new FileReader(file));
			String input = "";

			while ((input = reader.readLine()) != null)
				area.append(input + "\n");

			reader.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		frame.pack();
		frame.setLocation(500, 500);
		frame.setVisible(true);
	}
}