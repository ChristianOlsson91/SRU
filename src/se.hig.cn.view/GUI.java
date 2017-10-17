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
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;

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
	private final JLabel lblNewLabel = new JLabel(new ImageIcon("H:\\Oxygen\\SRU\\SkatteverketLogo2.png"));
	private final JLabel lblNewLabel_1 = new JLabel("Räkenskapsschema");
	private final JLabel lblInkomstdeklaration = new JLabel("Inkomstdeklaration 2");
	private final JLabel lblFrom = new JLabel("Fr.o.m.");
	private final JLabel lblTom = new JLabel("T.o.m.");
	private final JLabel lblOrganisationsnummer = new JLabel("Organisationsnummer");
	private final JLabel lblDatumNrBlanketten = new JLabel("Datum när blanketten fylls i");
	private final JLabel lblNewLabel_2 = new JLabel("INK2R");
	private JTextField textField;
	private JTextField textField_1;
	private final JTextField textField_2 = new JTextField();
	private final JTextField textField_3 = new JTextField();
	private final Label label_1 = new Label("Tillgångar/Anläggningstillgångar");
	private final JTextField textField_4 = new JTextField();
	private JTextField textField_5;
	private JTextField textField_6;
	private final JTextArea txtrKoncessionerPatent = new JTextArea();
	private final JPanel panel_4 = new JPanel();
	private final JTextArea txtrMaskinerInventarier = new JTextArea();
	private final JTextField textField_7 = new JTextField();
	private final JPanel panel_5 = new JPanel();
	private final JTextArea txtrFrbttring = new JTextArea();
	private final JTextField textField_8 = new JTextField();
	private final JPanel panel_6 = new JPanel();
	private final JTextArea txtrPgendeNyanlggningar = new JTextArea();
	private final JTextField textField_9 = new JTextField();
	private final Label label_4 = new Label("Eget Kapital");
	private final JPanel panel_7 = new JPanel();
	private final JTextArea txtrBundetEget = new JTextArea();
	private final JTextField textField_10 = new JTextField();
	private final JPanel panel_8 = new JPanel();
	private final JTextArea txtrKoncessionerPatent_1 = new JTextArea();
	private final Label label_5 = new Label("Finansiella anläggningstillgångar");
	private final JTextField textField_11 = new JTextField();
	private final JPanel panel_9 = new JPanel();
	private final JTextArea txtrAndelarI = new JTextArea();
	private final JPanel panel_10 = new JPanel();
	private final JTextArea txtrFordringarHos = new JTextArea();
	private final JPanel panel_11 = new JPanel();
	private final JTextArea txtrAndraLngfristiga = new JTextArea();
	private final JPanel panel_12 = new JPanel();
	private final JTextArea txtrLnTill = new JTextArea();
	private final JPanel panel_13 = new JPanel();
	private final JTextArea txtrAndraLngfristiga_1 = new JTextArea();
	private final JTextField textField_12 = new JTextField();
	private final JTextField textField_13 = new JTextField();
	private final JTextField textField_14 = new JTextField();
	private final JTextField textField_15 = new JTextField();
	private final JPanel panel_14 = new JPanel();
	private final JTextArea txtrFrittEget = new JTextArea();
	private final JTextField textField_17 = new JTextField();
	private final Label label_6 = new Label("Obeskattade reserver och avsättningar");
	private final JPanel panel_15 = new JPanel();
	private final Label label_7 = new Label("Obeskattade reserver");
	private final JTextArea txtrPeriodiseringsfonder = new JTextArea();
	private final JTextField textField_18 = new JTextField();
	private final JPanel panel_16 = new JPanel();
	private final JTextArea txtrAckumuleradeveravskrivningar = new JTextArea();
	private final JPanel panel_17 = new JPanel();
	private final JTextArea txtrvrigaObeskattade = new JTextArea();
	private final JTextField textField_19 = new JTextField();
	private final JTextField textField_20 = new JTextField();
	private final JPanel panel_18 = new JPanel();
	private final Label label_8 = new Label("Långfristiga skulder");
	private final JTextArea txtrObligationsln = new JTextArea();
	private final Label label_9 = new Label("Omsättningstillgångar");
	private final JPanel panel = new JPanel();
	private final Label label_10 = new Label("Varulager");
	private final JTextArea txtrRvarorOch = new JTextArea();
	private final JTextField textField_21 = new JTextField();
	private final JPanel panel_19 = new JPanel();
	private final JTextArea txtrVarorUnder = new JTextArea();
	private final JTextField textField_22 = new JTextField();
	private final JTextField textField_16 = new JTextField();
	private final JPanel panel_20 = new JPanel();
	private final JTextArea txtrFrdigaVaror = new JTextArea();
	private final JPanel panel_21 = new JPanel();
	private final JTextArea txtrvrigaLagertillgngar = new JTextArea();
	private final JPanel panel_22 = new JPanel();
	private final JTextArea txtrPgendeArbetenFr = new JTextArea();
	private final JPanel panel_23 = new JPanel();
	private final JTextArea txtrFrskottTill = new JTextArea();
	private final JPanel panel_27 = new JPanel();
	private final JTextArea txtrFordringarHos_1 = new JTextArea();
	private final JPanel panel_28 = new JPanel();
	private final JTextArea txtrvrigaFordringar = new JTextArea();
	private final JPanel panel_29 = new JPanel();
	private final JTextArea txtrUpparbetadMen = new JTextArea();
	private final JPanel panel_30 = new JPanel();
	private final JTextArea txtrFrutbetaldaKostnader = new JTextArea();
	private final JPanel panel_31 = new JPanel();
	private final JTextArea txtrvrigaKostfria = new JTextArea();
	private final JTextArea txtrKoncessionerPatent_2 = new JTextArea();
	private final JPanel panel_24 = new JPanel();
	private final Label label_11 = new Label("Kortfristiga fordringar");
	private final JTextArea txtrKundfordringar = new JTextArea();
	private final JPanel panel_25 = new JPanel();
	private final Label label_12 = new Label("Kortfristiga placeringar");
	private final JTextArea txtrFrutbetaldaKostnader_1 = new JTextArea();
	private final JPanel panel_26 = new JPanel();
	private final Label label_13 = new Label("Kassa och bank");
	private final JTextArea txtrKassaBank = new JTextArea();
	private final JTextField textField_23 = new JTextField();
	private final JTextField textField_24 = new JTextField();
	private final JTextField textField_25 = new JTextField();
	private final JTextField textField_26 = new JTextField();
	private final JTextField textField_27 = new JTextField();
	private final JTextField textField_28 = new JTextField();
	private final JTextField textField_29 = new JTextField();
	private final JTextField textField_30 = new JTextField();
	private final JTextField textField_31 = new JTextField();
	private final JTextField textField_32 = new JTextField();
	private final JTextField textField_33 = new JTextField();
	private final JTextField textField_34 = new JTextField();
	private final JPanel panel_32 = new JPanel();
	private final Label label_14 = new Label("Avsättningar");
	private final JTextArea txtrAvsttningarFr = new JTextArea();
	private final JTextField textField_35 = new JTextField();
	private final JPanel panel_33 = new JPanel();
	private final JTextArea txtrvrigaAvsttningar = new JTextArea();
	private final JPanel panel_34 = new JPanel();
	private final JTextArea txtrvrigaAvsttningar_1 = new JTextArea();
	private final JTextField textField_36 = new JTextField();
	private final JTextField textField_37 = new JTextField();
	private final Label label_15 = new Label("Skulder");
	private final JTextField textField_38 = new JTextField();
	private final JPanel panel_35 = new JPanel();
	private final JTextArea txtrCheckrkningskredit = new JTextArea();
	private final JTextField textField_39 = new JTextField();
	private final JPanel panel_36 = new JPanel();
	private final JTextArea txtrvrigaSkulder = new JTextArea();
	private final JPanel panel_37 = new JPanel();
	private final JTextArea txtrSkulderTill = new JTextArea();
	private final JPanel panel_38 = new JPanel();
	private final JTextArea txtrvrigaSkulder_1 = new JTextArea();
	private final JTextField textField_40 = new JTextField();
	private final JTextField textField_41 = new JTextField();
	private final JTextField textField_42 = new JTextField();
	private final JPanel panel_39 = new JPanel();
	private final Label label_16 = new Label("Kortfristiga skulder");
	private final JTextArea txtrCheckrkningskredit_1 = new JTextArea();
	private final JTextField textField_43 = new JTextField();
	private final JPanel panel_40 = new JPanel();
	private final JTextArea txtrvrigaSkulder_2 = new JTextArea();
	private final JPanel panel_41 = new JPanel();
	private final JTextArea txtrFrskottFrn = new JTextArea();
	private final JPanel panel_42 = new JPanel();
	private final JTextArea txtrPgendeArbeten = new JTextArea();
	private final JPanel panel_43 = new JPanel();
	private final JTextArea txtrFaktureradMen = new JTextArea();
	private final JPanel panel_44 = new JPanel();
	private final JTextArea txtrLeverantrsskulder = new JTextArea();
	private final JPanel panel_45 = new JPanel();
	private final JTextArea txtrVxelskulder = new JTextArea();
	private final JPanel panel_46 = new JPanel();
	private final JTextArea txtrSkulderTill_1 = new JTextArea();
	private final JPanel panel_47 = new JPanel();
	private final JTextArea txtrLeverantrsskulder_1 = new JTextArea();
	private final JPanel panel_48 = new JPanel();
	private final JTextArea txtrvrigaSkulder_3 = new JTextArea();
	private final JPanel panel_49 = new JPanel();
	private final JTextArea txtrUpplupnaKostnader = new JTextArea();
	private final JTextField textField_44 = new JTextField();
	private final JTextField textField_45 = new JTextField();
	private final JTextField textField_46 = new JTextField();
	private final JTextField textField_47 = new JTextField();
	private final JTextField textField_48 = new JTextField();
	private final JTextField textField_49 = new JTextField();
	private final JTextField textField_50 = new JTextField();
	private final JTextField textField_51 = new JTextField();
	private final JTextField textField_52 = new JTextField();
	private final JTextField textField_53 = new JTextField();

	public GUI() {
		textField_3.setBounds(614, 77, 230, 20);
		textField_3.setColumns(10);
		textField_2.setBounds(393, 77, 223, 20);
		textField_2.setColumns(10);
		frame = new JFrame("SRU");
		p = new JPanel();
		frame.getContentPane().setLayout(null);
		menuBar.setBounds(0, 0, 60, 20);
		//p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));

		//frame.getContentPane().add(p, BorderLayout.WEST);
		frame.getContentPane().add(menuBar);
		menuBar.add(menu);
		menu.add(item2);
		menu.add(item3);
		menu.add(ink2rItem);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(918, 77, 17, 1256);
		frame.getContentPane().add(scrollBar);
		lblNewLabel.setBounds(0, 31, 230, 20);
		
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel_1.setBounds(393, 21, 238, 14);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		frame.getContentPane().add(lblNewLabel_1);
		lblInkomstdeklaration.setBounds(393, 37, 176, 14);
		lblInkomstdeklaration.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		frame.getContentPane().add(lblInkomstdeklaration);
		lblFrom.setBounds(84, 62, 72, 14);
		lblFrom.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		frame.getContentPane().add(lblFrom);
		lblTom.setBounds(210, 62, 72, 14);
		lblTom.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		frame.getContentPane().add(lblTom);
		lblOrganisationsnummer.setBounds(393, 62, 104, 14);
		lblOrganisationsnummer.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		frame.getContentPane().add(lblOrganisationsnummer);
		lblDatumNrBlanketten.setBounds(615, 62, 131, 14);
		lblDatumNrBlanketten.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		frame.getContentPane().add(lblDatumNrBlanketten);
		lblNewLabel_2.setBounds(762, 21, 140, 45);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		
		frame.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(84, 74, 116, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(210, 74, 130, 20);
		textField_1.setColumns(10);
		frame.getContentPane().add(textField_1);
		
		frame.getContentPane().add(textField_2);
		
		frame.getContentPane().add(textField_3);
		label_1.setBounds(0, 100, 255, 22);
		label_1.setFont(new Font("Arial", Font.BOLD, 16));
		
		frame.getContentPane().add(label_1);
		textField_4.setBounds(222, 128, 164, 68);
		textField_4.setColumns(10);
		
		frame.getContentPane().add(textField_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 128, 223, 68);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		Label label_2 = new Label("Immateriella anläggningstillgångar");
		label_2.setBounds(10, 5, 173, 14);
		panel_1.add(label_2);
		label_2.setFont(new Font("Dialog", Font.BOLD, 10));
		txtrKoncessionerPatent_2.setText("2.1 Koncessioner, patent, licenser\r\n      varumärken, hyresrätter, goodwill\r\n      och liknande rättigheter");
		txtrKoncessionerPatent_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrKoncessionerPatent_2.setBounds(10, 25, 157, 43);
		
		panel_1.add(txtrKoncessionerPatent_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 194, 222, 45);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JTextArea txtrFrskottAvseende = new JTextArea();
		txtrFrskottAvseende.setBounds(10, 0, 157, 43);
		txtrFrskottAvseende.setText("\r\n2.2 Förskott avseende immateriella\r\n      anläggningstillgångar");
		txtrFrskottAvseende.setFont(new Font("Tahoma", Font.PLAIN, 10));
		panel_2.add(txtrFrskottAvseende);
		
		textField_5 = new JTextField();
		textField_5.setBounds(221, 194, 165, 45);
		textField_5.setColumns(10);
		frame.getContentPane().add(textField_5);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 237, 222, 45);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		Label label_3 = new Label("Materiella anläggningstillgångar");
		label_3.setBounds(10, 0, 172, 20);
		panel_3.add(label_3);
		label_3.setFont(new Font("Dialog", Font.BOLD, 10));
		txtrKoncessionerPatent.setBounds(10, 25, 158, 20);
		txtrKoncessionerPatent.setText("2.3 Byggnader och mark");
		txtrKoncessionerPatent.setFont(new Font("Tahoma", Font.PLAIN, 10));
		
		panel_3.add(txtrKoncessionerPatent);
		
		textField_6 = new JTextField();
		textField_6.setBounds(222, 237, 164, 45);
		textField_6.setColumns(10);
		frame.getContentPane().add(textField_6);
		panel_4.setBounds(0, 281, 223, 45);
		panel_4.setLayout(null);
		
		frame.getContentPane().add(panel_4);
		txtrMaskinerInventarier.setText("2.4 Maskiner, inventarier och övriga\r\n      materiella anläggningstillgångar");
		txtrMaskinerInventarier.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrMaskinerInventarier.setBounds(10, 11, 169, 34);
		
		panel_4.add(txtrMaskinerInventarier);
		textField_7.setBounds(222, 281, 164, 45);
		textField_7.setColumns(10);
		
		frame.getContentPane().add(textField_7);
		panel_5.setBounds(0, 326, 222, 35);
		
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		txtrFrbttring.setBounds(10, 0, 210, 23);
		txtrFrbttring.setText("2.5 Förbättringsuppgifter på annans fastighet");
		txtrFrbttring.setFont(new Font("Tahoma", Font.PLAIN, 10));
		
		panel_5.add(txtrFrbttring);
		textField_8.setBounds(222, 326, 164, 35);
		textField_8.setColumns(10);
		
		frame.getContentPane().add(textField_8);
		panel_6.setBounds(0, 361, 222, 35);
		
		frame.getContentPane().add(panel_6);
		panel_6.setLayout(null);
		txtrPgendeNyanlggningar.setBounds(10, 0, 212, 35);
		txtrPgendeNyanlggningar.setText("2.6 Pågående nyanläggningar coh förskott\r\n      avseende materiella anläggningstillgångar");
		txtrPgendeNyanlggningar.setFont(new Font("Tahoma", Font.PLAIN, 10));
		
		panel_6.add(txtrPgendeNyanlggningar);
		textField_9.setBounds(222, 361, 164, 35);
		textField_9.setColumns(10);
		
		frame.getContentPane().add(textField_9);
		label_4.setBounds(393, 103, 255, 22);
		label_4.setFont(new Font("Arial", Font.BOLD, 16));
		
		frame.getContentPane().add(label_4);
		panel_7.setBounds(394, 128, 222, 33);
		
		frame.getContentPane().add(panel_7);
		panel_7.setLayout(null);
		txtrBundetEget.setBounds(10, 0, 212, 17);
		txtrBundetEget.setText("2.27 Bundet eget kapital");
		txtrBundetEget.setFont(new Font("Tahoma", Font.PLAIN, 10));
		
		panel_7.add(txtrBundetEget);
		textField_10.setBounds(615, 128, 229, 33);
		textField_10.setColumns(10);
		
		frame.getContentPane().add(textField_10);
		panel_8.setBounds(0, 397, 223, 45);
		
		frame.getContentPane().add(panel_8);
		panel_8.setLayout(null);
		txtrKoncessionerPatent_1.setBounds(10, 21, 203, 13);
		txtrKoncessionerPatent_1.setText("2.7 Andelar i koncernföretag");
		txtrKoncessionerPatent_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		
		panel_8.add(txtrKoncessionerPatent_1);
		label_5.setBounds(10, 0, 172, 20);
		label_5.setFont(new Font("Dialog", Font.BOLD, 10));
		
		panel_8.add(label_5);
		textField_11.setBounds(222, 397, 165, 45);
		textField_11.setColumns(10);
		
		frame.getContentPane().add(textField_11);
		panel_9.setBounds(0, 440, 222, 33);
		panel_9.setLayout(null);
		
		frame.getContentPane().add(panel_9);
		txtrAndelarI.setText("2.8 Andelar i intresseföretag");
		txtrAndelarI.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrAndelarI.setBounds(10, 11, 212, 17);
		
		panel_9.add(txtrAndelarI);
		panel_10.setBounds(1, 471, 222, 35);
		panel_10.setLayout(null);
		
		frame.getContentPane().add(panel_10);
		txtrFordringarHos.setText("2.9 Fordringar hos koncern- och\r\n      intresseföretag");
		txtrFordringarHos.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrFordringarHos.setBounds(10, 0, 212, 35);
		
		panel_10.add(txtrFordringarHos);
		panel_11.setBounds(0, 506, 222, 28);
		
		frame.getContentPane().add(panel_11);
		panel_11.setLayout(null);
		txtrAndraLngfristiga.setBounds(10, 0, 202, 28);
		txtrAndraLngfristiga.setText("2.10 Andra långfristiga värde-\r\n        pappersinnehav");
		txtrAndraLngfristiga.setFont(new Font("Tahoma", Font.PLAIN, 10));
		
		panel_11.add(txtrAndraLngfristiga);
		panel_12.setBounds(0, 533, 222, 28);
		panel_12.setLayout(null);
		
		frame.getContentPane().add(panel_12);
		txtrLnTill.setText("2.11 Lån till delägare eller närstående");
		txtrLnTill.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrLnTill.setBounds(10, 11, 212, 13);
		
		panel_12.add(txtrLnTill);
		panel_13.setBounds(0, 559, 222, 28);
		panel_13.setLayout(null);
		
		frame.getContentPane().add(panel_13);
		txtrAndraLngfristiga_1.setText("2.12 Andra långfristiga fordringar");
		txtrAndraLngfristiga_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrAndraLngfristiga_1.setBounds(10, 0, 212, 24);
		
		panel_13.add(txtrAndraLngfristiga_1);
		textField_12.setBounds(221, 440, 165, 33);
		textField_12.setColumns(10);
		
		frame.getContentPane().add(textField_12);
		textField_13.setBounds(222, 471, 164, 35);
		textField_13.setColumns(10);
		
		frame.getContentPane().add(textField_13);
		textField_14.setBounds(223, 506, 163, 26);
		textField_14.setColumns(10);
		
		frame.getContentPane().add(textField_14);
		textField_15.setBounds(222, 533, 165, 28);
		textField_15.setColumns(10);
		
		frame.getContentPane().add(textField_15);
		panel_14.setBounds(394, 161, 222, 35);
		panel_14.setLayout(null);
		
		frame.getContentPane().add(panel_14);
		txtrFrittEget.setText("2.28 Fritt eget kapital");
		txtrFrittEget.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrFrittEget.setBounds(10, 0, 212, 17);
		
		panel_14.add(txtrFrittEget);
		textField_17.setBounds(615, 161, 229, 35);
		textField_17.setColumns(10);
		
		frame.getContentPane().add(textField_17);
		label_6.setBounds(393, 194, 320, 22);
		label_6.setFont(new Font("Arial", Font.BOLD, 16));
		
		frame.getContentPane().add(label_6);
		panel_15.setBounds(393, 219, 222, 45);
		panel_15.setLayout(null);
		
		frame.getContentPane().add(panel_15);
		label_7.setFont(new Font("Dialog", Font.BOLD, 10));
		label_7.setBounds(4, 5, 172, 20);
		
		panel_15.add(label_7);
		txtrPeriodiseringsfonder.setText("2.29 Periodiseringsfonder");
		txtrPeriodiseringsfonder.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrPeriodiseringsfonder.setBounds(0, 25, 158, 20);
		
		panel_15.add(txtrPeriodiseringsfonder);
		textField_18.setBounds(615, 219, 230, 45);
		textField_18.setColumns(10);
		
		frame.getContentPane().add(textField_18);
		panel_16.setBounds(393, 264, 222, 28);
		panel_16.setLayout(null);
		
		frame.getContentPane().add(panel_16);
		txtrAckumuleradeveravskrivningar.setText("2.30 Ackumulerade överavskrivningar");
		txtrAckumuleradeveravskrivningar.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrAckumuleradeveravskrivningar.setBounds(0, 11, 202, 13);
		
		panel_16.add(txtrAckumuleradeveravskrivningar);
		panel_17.setBounds(393, 290, 222, 36);
		panel_17.setLayout(null);
		
		frame.getContentPane().add(panel_17);
		txtrvrigaObeskattade.setText("2.31 Övriga obeskattade reserver");
		txtrvrigaObeskattade.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrvrigaObeskattade.setBounds(0, 11, 157, 13);
		
		panel_17.add(txtrvrigaObeskattade);
		textField_19.setBounds(615, 264, 229, 28);
		textField_19.setColumns(10);
		
		frame.getContentPane().add(textField_19);
		textField_20.setBounds(615, 290, 229, 35);
		textField_20.setColumns(10);
		
		frame.getContentPane().add(textField_20);
		panel_18.setBounds(393, 493, 222, 41);
		
		frame.getContentPane().add(panel_18);
		panel_18.setLayout(null);
		label_8.setBounds(0, -2, 172, 20);
		label_8.setFont(new Font("Dialog", Font.BOLD, 10));
		
		panel_18.add(label_8);
		txtrObligationsln.setBounds(0, 22, 158, 19);
		txtrObligationsln.setText("2.35 Obligationslån");
		txtrObligationsln.setFont(new Font("Tahoma", Font.PLAIN, 10));
		
		panel_18.add(txtrObligationsln);
		
		Label label = new Label("Räkenskapsår");
		label.setBounds(0, 69, 78, 22);
		frame.getContentPane().add(label);
		label_9.setBounds(0, 593, 255, 22);
		label_9.setFont(new Font("Arial", Font.BOLD, 16));
		
		frame.getContentPane().add(label_9);
		panel.setBounds(1, 616, 222, 45);
		panel.setLayout(null);
		
		frame.getContentPane().add(panel);
		label_10.setFont(new Font("Dialog", Font.BOLD, 10));
		label_10.setBounds(10, 0, 172, 20);
		
		panel.add(label_10);
		txtrRvarorOch.setText("2.13 Råvaror och förnödenheter");
		txtrRvarorOch.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrRvarorOch.setBounds(10, 26, 158, 20);
		
		panel.add(txtrRvarorOch);
		textField_21.setBounds(222, 616, 164, 45);
		textField_21.setColumns(10);
		
		frame.getContentPane().add(textField_21);
		panel_19.setBounds(0, 661, 222, 28);
		panel_19.setLayout(null);
		
		frame.getContentPane().add(panel_19);
		txtrVarorUnder.setText("2.14 Varor under tillverkning");
		txtrVarorUnder.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrVarorUnder.setBounds(10, 11, 212, 17);
		
		panel_19.add(txtrVarorUnder);
		textField_22.setBounds(221, 661, 165, 28);
		textField_22.setColumns(10);
		
		frame.getContentPane().add(textField_22);
		textField_16.setBounds(222, 559, 165, 28);
		textField_16.setColumns(10);
		
		frame.getContentPane().add(textField_16);
		panel_20.setBounds(0, 687, 222, 28);
		panel_20.setLayout(null);
		
		frame.getContentPane().add(panel_20);
		txtrFrdigaVaror.setText("2.15 Färdiga varor och handelsvaror");
		txtrFrdigaVaror.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrFrdigaVaror.setBounds(10, 11, 212, 17);
		
		panel_20.add(txtrFrdigaVaror);
		panel_21.setBounds(0, 717, 222, 28);
		panel_21.setLayout(null);
		
		frame.getContentPane().add(panel_21);
		txtrvrigaLagertillgngar.setText("2.16 Övriga lagertillgångar");
		txtrvrigaLagertillgngar.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrvrigaLagertillgngar.setBounds(10, 11, 212, 17);
		
		panel_21.add(txtrvrigaLagertillgngar);
		panel_22.setBounds(0, 747, 222, 28);
		panel_22.setLayout(null);
		
		frame.getContentPane().add(panel_22);
		txtrPgendeArbetenFr.setText("2.17 Pågående arbeten för annans räkning");
		txtrPgendeArbetenFr.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrPgendeArbetenFr.setBounds(10, 11, 212, 17);
		
		panel_22.add(txtrPgendeArbetenFr);
		panel_23.setBounds(0, 776, 222, 28);
		panel_23.setLayout(null);
		
		frame.getContentPane().add(panel_23);
		txtrFrskottTill.setText("2.18 Förskott till leverantörer");
		txtrFrskottTill.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrFrskottTill.setBounds(10, 11, 212, 17);
		
		panel_23.add(txtrFrskottTill);
		panel_27.setBounds(0, 847, 222, 28);
		panel_27.setLayout(null);
		
		frame.getContentPane().add(panel_27);
		txtrFordringarHos_1.setText("2.20 Fordringar hos koncern- och\r\n        intresseföretag");
		txtrFordringarHos_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrFordringarHos_1.setBounds(10, 0, 212, 34);
		
		panel_27.add(txtrFordringarHos_1);
		panel_28.setBounds(0, 875, 222, 28);
		panel_28.setLayout(null);
		
		frame.getContentPane().add(panel_28);
		txtrvrigaFordringar.setText("2.21 Övriga fordringar");
		txtrvrigaFordringar.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrvrigaFordringar.setBounds(10, 11, 212, 17);
		
		panel_28.add(txtrvrigaFordringar);
		panel_29.setBounds(0, 903, 222, 28);
		panel_29.setLayout(null);
		
		frame.getContentPane().add(panel_29);
		txtrUpparbetadMen.setText("2.22 Upparbetad men ej fakturerad intäkt");
		txtrUpparbetadMen.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrUpparbetadMen.setBounds(10, 11, 212, 17);
		
		panel_29.add(txtrUpparbetadMen);
		panel_30.setBounds(1, 932, 222, 45);
		panel_30.setLayout(null);
		
		frame.getContentPane().add(panel_30);
		txtrFrutbetaldaKostnader.setText("2.23 Förutbetalda kostnader och upplupna\r\n        intäkter");
		txtrFrutbetaldaKostnader.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrFrutbetaldaKostnader.setBounds(10, 11, 212, 30);
		
		panel_30.add(txtrFrutbetaldaKostnader);
		panel_31.setBounds(0, 1026, 222, 35);
		panel_31.setLayout(null);
		
		frame.getContentPane().add(panel_31);
		txtrvrigaKostfria.setText("2.25 Övriga kostfria placeringar");
		txtrvrigaKostfria.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrvrigaKostfria.setBounds(10, 11, 212, 17);
		
		panel_31.add(txtrvrigaKostfria);
		panel_24.setBounds(0, 802, 222, 45);
		panel_24.setLayout(null);
		
		frame.getContentPane().add(panel_24);
		label_11.setFont(new Font("Dialog", Font.BOLD, 10));
		label_11.setBounds(10, 0, 172, 20);
		
		panel_24.add(label_11);
		txtrKundfordringar.setText("2.19 Kundfordringar");
		txtrKundfordringar.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrKundfordringar.setBounds(10, 26, 158, 20);
		
		panel_24.add(txtrKundfordringar);
		panel_25.setBounds(1, 981, 222, 45);
		panel_25.setLayout(null);
		
		frame.getContentPane().add(panel_25);
		label_12.setFont(new Font("Dialog", Font.BOLD, 10));
		label_12.setBounds(10, 10, 172, 10);
		
		panel_25.add(label_12);
		txtrFrutbetaldaKostnader_1.setText("2.24 Andelar i koncernföretag");
		txtrFrutbetaldaKostnader_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrFrutbetaldaKostnader_1.setBounds(10, 26, 202, 20);
		
		panel_25.add(txtrFrutbetaldaKostnader_1);
		panel_26.setBounds(0, 1065, 222, 55);
		
		frame.getContentPane().add(panel_26);
		panel_26.setLayout(null);
		label_13.setBounds(10, 10, 172, 20);
		label_13.setFont(new Font("Dialog", Font.BOLD, 10));
		
		panel_26.add(label_13);
		txtrKassaBank.setBounds(10, 26, 202, 20);
		txtrKassaBank.setText("2.26 Kassa, bank och redovisningsmedel");
		txtrKassaBank.setFont(new Font("Tahoma", Font.PLAIN, 10));
		
		panel_26.add(txtrKassaBank);
		textField_23.setBounds(221, 687, 165, 28);
		textField_23.setColumns(10);
		
		frame.getContentPane().add(textField_23);
		textField_24.setBounds(221, 717, 165, 28);
		textField_24.setColumns(10);
		
		frame.getContentPane().add(textField_24);
		textField_25.setBounds(221, 747, 165, 28);
		textField_25.setColumns(10);
		
		frame.getContentPane().add(textField_25);
		textField_26.setBounds(222, 776, 165, 28);
		textField_26.setColumns(10);
		
		frame.getContentPane().add(textField_26);
		textField_27.setBounds(222, 802, 164, 45);
		textField_27.setColumns(10);
		
		frame.getContentPane().add(textField_27);
		textField_28.setBounds(221, 847, 165, 28);
		textField_28.setColumns(10);
		
		frame.getContentPane().add(textField_28);
		textField_29.setBounds(222, 875, 165, 28);
		textField_29.setColumns(10);
		
		frame.getContentPane().add(textField_29);
		textField_30.setBounds(222, 903, 165, 28);
		textField_30.setColumns(10);
		
		frame.getContentPane().add(textField_30);
		textField_31.setBounds(221, 932, 165, 45);
		textField_31.setColumns(10);
		
		frame.getContentPane().add(textField_31);
		textField_32.setBounds(222, 981, 164, 45);
		textField_32.setColumns(10);
		
		frame.getContentPane().add(textField_32);
		textField_33.setBounds(222, 1026, 165, 35);
		textField_33.setColumns(10);
		
		frame.getContentPane().add(textField_33);
		textField_34.setBounds(222, 1065, 164, 55);
		textField_34.setColumns(10);
		
		frame.getContentPane().add(textField_34);
		panel_32.setBounds(393, 326, 223, 61);
		panel_32.setLayout(null);
		
		frame.getContentPane().add(panel_32);
		label_14.setFont(new Font("Dialog", Font.BOLD, 10));
		label_14.setBounds(0, 0, 172, 20);
		
		panel_32.add(label_14);
		txtrAvsttningarFr.setText("2.32 Avsättningar för pensioner och liknande\r\n        förpliktelse enligt lag (1967:531) om\r\n        tryggande av pensionsutfästelse m.m.");
		txtrAvsttningarFr.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrAvsttningarFr.setBounds(0, 15, 206, 47);
		
		panel_32.add(txtrAvsttningarFr);
		textField_35.setBounds(615, 326, 229, 61);
		textField_35.setColumns(10);
		
		frame.getContentPane().add(textField_35);
		panel_33.setBounds(393, 385, 222, 35);
		panel_33.setLayout(null);
		
		frame.getContentPane().add(panel_33);
		txtrvrigaAvsttningar.setText("2.33 Övriga avsättningar för pensioner och\r\n        liknande förpliktelser");
		txtrvrigaAvsttningar.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrvrigaAvsttningar.setBounds(0, 0, 212, 34);
		
		panel_33.add(txtrvrigaAvsttningar);
		panel_34.setBounds(394, 418, 222, 45);
		panel_34.setLayout(null);
		
		frame.getContentPane().add(panel_34);
		txtrvrigaAvsttningar_1.setText("2.34 Övriga avsättningar\r\n");
		txtrvrigaAvsttningar_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrvrigaAvsttningar_1.setBounds(0, 11, 157, 13);
		
		panel_34.add(txtrvrigaAvsttningar_1);
		textField_36.setBounds(615, 385, 229, 35);
		textField_36.setColumns(10);
		
		frame.getContentPane().add(textField_36);
		textField_37.setBounds(615, 418, 229, 45);
		textField_37.setColumns(10);
		
		frame.getContentPane().add(textField_37);
		label_15.setBounds(393, 471, 299, 22);
		label_15.setFont(new Font("Arial", Font.BOLD, 16));
		
		frame.getContentPane().add(label_15);
		textField_38.setBounds(615, 493, 229, 41);
		textField_38.setColumns(10);
		
		frame.getContentPane().add(textField_38);
		panel_35.setBounds(393, 533, 223, 38);
		panel_35.setLayout(null);
		
		frame.getContentPane().add(panel_35);
		txtrCheckrkningskredit.setText("2.36 Checkräkningskredit");
		txtrCheckrkningskredit.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrCheckrkningskredit.setBounds(0, 21, 212, 17);
		
		panel_35.add(txtrCheckrkningskredit);
		textField_39.setBounds(615, 533, 229, 38);
		textField_39.setColumns(10);
		
		frame.getContentPane().add(textField_39);
		panel_36.setBounds(393, 572, 223, 29);
		panel_36.setLayout(null);
		
		frame.getContentPane().add(panel_36);
		txtrvrigaSkulder.setText("2.37 Övriga skulder till kreditinstitut");
		txtrvrigaSkulder.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrvrigaSkulder.setBounds(0, 11, 212, 17);
		
		panel_36.add(txtrvrigaSkulder);
		panel_37.setBounds(393, 602, 223, 33);
		
		frame.getContentPane().add(panel_37);
		panel_37.setLayout(null);
		txtrSkulderTill.setBounds(0, 11, 213, 17);
		txtrSkulderTill.setText("2.38 Skulder till koncern- och intresseföretag");
		txtrSkulderTill.setFont(new Font("Tahoma", Font.PLAIN, 10));
		
		panel_37.add(txtrSkulderTill);
		panel_38.setBounds(393, 634, 223, 38);
		panel_38.setLayout(null);
		
		frame.getContentPane().add(panel_38);
		txtrvrigaSkulder_1.setText("2.39 Övriga skulder");
		txtrvrigaSkulder_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrvrigaSkulder_1.setBounds(0, 21, 212, 17);
		
		panel_38.add(txtrvrigaSkulder_1);
		textField_40.setBounds(615, 572, 229, 29);
		textField_40.setColumns(10);
		
		frame.getContentPane().add(textField_40);
		textField_41.setBounds(615, 602, 229, 33);
		textField_41.setColumns(10);
		
		frame.getContentPane().add(textField_41);
		textField_42.setBounds(615, 634, 229, 38);
		textField_42.setColumns(10);
		
		frame.getContentPane().add(textField_42);
		panel_39.setBounds(393, 672, 222, 43);
		panel_39.setLayout(null);
		
		frame.getContentPane().add(panel_39);
		label_16.setFont(new Font("Dialog", Font.BOLD, 10));
		label_16.setBounds(0, -2, 172, 20);
		
		panel_39.add(label_16);
		txtrCheckrkningskredit_1.setText("2.40 Checkräkningskredit");
		txtrCheckrkningskredit_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrCheckrkningskredit_1.setBounds(0, 22, 158, 19);
		
		panel_39.add(txtrCheckrkningskredit_1);
		textField_43.setBounds(615, 670, 229, 45);
		textField_43.setColumns(10);
		
		frame.getContentPane().add(textField_43);
		panel_40.setLayout(null);
		panel_40.setBounds(393, 717, 223, 38);
		
		frame.getContentPane().add(panel_40);
		txtrvrigaSkulder_2.setText("2.41 Övriga skulder till kreditinstitut");
		txtrvrigaSkulder_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrvrigaSkulder_2.setBounds(0, 21, 212, 17);
		
		panel_40.add(txtrvrigaSkulder_2);
		panel_41.setLayout(null);
		panel_41.setBounds(393, 755, 223, 38);
		
		frame.getContentPane().add(panel_41);
		txtrFrskottFrn.setText("2.42 Förskott från kunder");
		txtrFrskottFrn.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrFrskottFrn.setBounds(0, 21, 212, 17);
		
		panel_41.add(txtrFrskottFrn);
		panel_42.setLayout(null);
		panel_42.setBounds(393, 791, 223, 38);
		
		frame.getContentPane().add(panel_42);
		txtrPgendeArbeten.setText("2.43 Pågående arbeten för annans räkning");
		txtrPgendeArbeten.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrPgendeArbeten.setBounds(0, 21, 212, 17);
		
		panel_42.add(txtrPgendeArbeten);
		panel_43.setLayout(null);
		panel_43.setBounds(393, 828, 223, 38);
		
		frame.getContentPane().add(panel_43);
		txtrFaktureradMen.setText("2.44 Fakturerad men ej apparbetad intäkt");
		txtrFaktureradMen.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrFaktureradMen.setBounds(0, 21, 212, 17);
		
		panel_43.add(txtrFaktureradMen);
		panel_44.setLayout(null);
		panel_44.setBounds(393, 865, 223, 38);
		
		frame.getContentPane().add(panel_44);
		txtrLeverantrsskulder.setText("2.45 Leverantörsskulder");
		txtrLeverantrsskulder.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrLeverantrsskulder.setBounds(0, 21, 212, 17);
		
		panel_44.add(txtrLeverantrsskulder);
		panel_45.setLayout(null);
		panel_45.setBounds(393, 903, 223, 38);
		
		frame.getContentPane().add(panel_45);
		txtrVxelskulder.setText("2.46 Växelskulder");
		txtrVxelskulder.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrVxelskulder.setBounds(0, 21, 212, 17);
		
		panel_45.add(txtrVxelskulder);
		panel_46.setLayout(null);
		panel_46.setBounds(393, 939, 223, 38);
		
		frame.getContentPane().add(panel_46);
		txtrSkulderTill_1.setText("2.47 Skulder till koncern- och intresseföretag");
		txtrSkulderTill_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrSkulderTill_1.setBounds(10, 21, 212, 17);
		
		panel_46.add(txtrSkulderTill_1);
		panel_47.setLayout(null);
		panel_47.setBounds(393, 977, 223, 38);
		
		frame.getContentPane().add(panel_47);
		txtrLeverantrsskulder_1.setText("2.48 Skatteskulder");
		txtrLeverantrsskulder_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrLeverantrsskulder_1.setBounds(0, 21, 212, 17);
		
		panel_47.add(txtrLeverantrsskulder_1);
		panel_48.setLayout(null);
		panel_48.setBounds(393, 1013, 223, 38);
		
		frame.getContentPane().add(panel_48);
		txtrvrigaSkulder_3.setText("2.49 Övriga skulder");
		txtrvrigaSkulder_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrvrigaSkulder_3.setBounds(0, 21, 212, 17);
		
		panel_48.add(txtrvrigaSkulder_3);
		panel_49.setLayout(null);
		panel_49.setBounds(393, 1050, 223, 45);
		
		frame.getContentPane().add(panel_49);
		txtrUpplupnaKostnader.setText("2.50 Upplupna kostnader och förutbetalda\r\n        intäkter");
		txtrUpplupnaKostnader.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrUpplupnaKostnader.setBounds(0, 11, 212, 27);
		
		panel_49.add(txtrUpplupnaKostnader);
		textField_44.setColumns(10);
		textField_44.setBounds(615, 717, 229, 38);
		
		frame.getContentPane().add(textField_44);
		textField_45.setColumns(10);
		textField_45.setBounds(615, 755, 229, 38);
		
		frame.getContentPane().add(textField_45);
		textField_46.setColumns(10);
		textField_46.setBounds(615, 791, 229, 38);
		
		frame.getContentPane().add(textField_46);
		textField_47.setColumns(10);
		textField_47.setBounds(615, 828, 229, 38);
		
		frame.getContentPane().add(textField_47);
		textField_48.setColumns(10);
		textField_48.setBounds(615, 865, 229, 38);
		
		frame.getContentPane().add(textField_48);
		textField_49.setColumns(10);
		textField_49.setBounds(615, 903, 229, 38);
		
		frame.getContentPane().add(textField_49);
		textField_50.setColumns(10);
		textField_50.setBounds(615, 939, 229, 38);
		
		frame.getContentPane().add(textField_50);
		textField_51.setColumns(10);
		textField_51.setBounds(615, 977, 229, 38);
		
		frame.getContentPane().add(textField_51);
		textField_52.setColumns(10);
		textField_52.setBounds(615, 1013, 229, 38);
		
		frame.getContentPane().add(textField_52);
		textField_53.setColumns(10);
		textField_53.setBounds(615, 1050, 229, 45);
		
		frame.getContentPane().add(textField_53);

//		JPanel buttonPanel = new JPanel();
//		JButton createbutton = new JButton("Spara");
//		createbutton.setBounds(105, 5, 61, 23);
//		JButton retrievebutton = new JButton("Hämta");
//		retrievebutton.setBounds(171, 5, 63, 23);

//		createbutton.addActionListener(new CreateListener());
//		retrievebutton.addActionListener(new RetrieveListener());
		item2.addActionListener(new BlanketterListener());
		item3.addActionListener(new InfoListener());
		ink2rItem.addActionListener(new Ink2rListener());
//		buttonPanel.setLayout(null);
//
//		buttonPanel.add(createbutton);
//		buttonPanel.add(retrievebutton);
//		frame.getContentPane().add(buttonPanel);

		frame.setLocation(1000, 1000);
		//frame.pack();
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

			fileframe.getContentPane().add(area);
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
