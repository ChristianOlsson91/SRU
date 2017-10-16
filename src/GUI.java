package se.hig.cn.view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import se.hig.cn.model.FileCreator;

/**
 * Skapandet av formuläret med knapp- och menyval.
 * @author tfk15nsl
 * @version 2017-10-16
 */
public class GUI {

	private ArrayList<JPanel> panelList = new ArrayList<>();
	private ArrayList<JLabel> labelList = new ArrayList<>();
	private ArrayList<JTextField> textFieldList = new ArrayList<>();
	private FileCreator creator = new FileCreator();
	private JFrame frame;
	private JMenuBar menuBar = new JMenuBar();
	private JMenu menu = new JMenu("Välj filtyp");
	private JMenuItem item2 = new JMenuItem("BLANKETTER");
	private JMenuItem item3 = new JMenuItem("INFO");
	private JMenuItem ink2rItem = new JMenuItem("INK2R");
	private File file;
	private String inputFromFile;
	private JPanel p;
	private String s = "";
	private JFileChooser chooser = new JFileChooser();
	private FileNameExtensionFilter filter = new FileNameExtensionFilter("SRU-filer", "sru");

	public GUI() {
		frame = new JFrame("SRU");
		p = new JPanel();
		p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));

		frame.add(p, BorderLayout.WEST);
		p.add(menuBar);
		menuBar.add(menu);
		menu.add(item2);
		menu.add(item3);
		menu.add(ink2rItem);

		JPanel buttonPanel = new JPanel();
		JButton createbutton = new JButton("Spara");
		JButton retrievebutton = new JButton("Hämta");

		createbutton.addActionListener(new CreateListener());
		retrievebutton.addActionListener(new RetrieveListener());
		item2.addActionListener(new BlanketterListener());
		item3.addActionListener(new InfoListener());
		ink2rItem.addActionListener(new Ink2rListener());

		buttonPanel.add(createbutton);
		buttonPanel.add(retrievebutton);
		frame.add(buttonPanel);

		frame.setLocation(1000, 1000);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	/** 
	 * Skapar och lägger in alla paneler, etiketter och textfält och lägger in de i GUI.
	 */
	public void setContentForFrame() {
		if (s.equals("INFO")) {
			for (int i = 0; i < creator.getInfoList().size(); i++) {
				panelList.add(new JPanel());
				labelList.add(new JLabel(creator.getInfoList().get(i)));
				textFieldList.add(new JTextField("              "));

				panelList.get(i).add(labelList.get(i));
				panelList.get(i).add(textFieldList.get(i));

				p.add(panelList.get(i));
			}
		} else if (s.equals("BLANKETTER")) {
			for (int i = 0; i < creator.getBlanketterList().size(); i++) {
				panelList.add(new JPanel());
				labelList.add(new JLabel(creator.getBlanketterList().get(i)));
				textFieldList.add(new JTextField("              "));

				panelList.get(i).add(labelList.get(i));
				panelList.get(i).add(textFieldList.get(i));

				p.add(panelList.get(i));
			}

			frame.pack();
		}
		else if (s.equals("INK2R")) {
			for (int i = 0; i < creator.getInk2r().size(); i++) {
				panelList.add(new JPanel());
				labelList.add(new JLabel(creator.getInk2r().get(i)));
				textFieldList.add(new JTextField("              "));

				panelList.get(i).add(labelList.get(i));
				panelList.get(i).add(textFieldList.get(i));

				p.add(panelList.get(i));
			}

			frame.pack();
		}

	}

	/**
	 * Lyssnare till Create-knappen 
	 *
	 */
	public class CreateListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				writeToFile();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}

		public void writeToFile() throws IOException {
			chooser.setFileFilter(filter);
			int returnVal = chooser.showSaveDialog(chooser);

			if (returnVal == JFileChooser.APPROVE_OPTION) {
				file = new File(chooser.getSelectedFile().getAbsolutePath());
				file.createNewFile();
			}

			FileWriter writer = new FileWriter(file);

			if (textFieldList.size() == 0 && labelList.size() == 0) {
			} else {
				for (int i = 0; i < creator.getInfoList().size(); i++)
					if (file.equals("INFO"))
						writer.write(creator.getInfoList().get(i) + " " + textFieldList.get(i).getText() + "\n");
					else
						writer.write(creator.getBlanketterList().get(i) + " " + textFieldList.get(i).getText() + "\n");
			}

			writer.close();
		}
	}

	public class RetrieveListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JFrame fileframe = new JFrame();
			JTextArea area = new JTextArea();

			fileframe.add(area);
			area.setEditable(false);

			chooser = new JFileChooser();
			chooser.setFileFilter(filter);
			int returnVal = chooser.showOpenDialog(chooser);

			if(returnVal == JFileChooser.APPROVE_OPTION)
				file = new File(chooser.getSelectedFile().getAbsolutePath());

			BufferedReader br = null;
			try {
				br = new BufferedReader(new FileReader(file));
			} catch (FileNotFoundException e2) {
				e2.printStackTrace();
			}

			try {
				while ((inputFromFile = br.readLine()) != null)
					area.append(inputFromFile + "\n");

			} catch (IOException e1) {
				e1.printStackTrace();
			}

			try {
				br.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}

			fileframe.setResizable(false);
			fileframe.pack();

			fileframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			fileframe.setVisible(true);
		}
	}

	public class InfoListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			s = "INFO";
			setContentForFrame();
		}
	}

	public class BlanketterListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			s = "BLANKETTER";
			setContentForFrame();
		}
	}

	public class Ink2rListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			s = "INK2R";
			setContentForFrame();
		}
	}
}
