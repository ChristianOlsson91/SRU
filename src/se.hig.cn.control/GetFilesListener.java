package se.hig.cn.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class GetFilesListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		JFileChooser chooser = new JFileChooser();
		chooser.setDialogTitle("Välj fil");
		FileNameExtensionFilter filter = new FileNameExtensionFilter("SRU (*.sru)", ".sru");
		chooser.setFileFilter(filter);

		int returnVal = chooser.showOpenDialog(chooser);
		if (returnVal == JFileChooser.APPROVE_OPTION)

			chooser.setVisible(true);
	}
}
