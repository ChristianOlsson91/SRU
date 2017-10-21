package se.hig.cn.view;


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

import se.hig.CN.model.FileCreator;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;

/**
 * Skapandet av formuläret med knapp- och menyval.
 * @author tfk15nsl
 * @version 2017-10-16
 */
public class GUI2 {

	private ArrayList<JPanel> panelList = new ArrayList<>();
	private ArrayList<JLabel> labelList = new ArrayList<>();
	private ArrayList<JTextField> textFieldList = new ArrayList<>();
	private FileCreator creator = new FileCreator();
	private JFrame frame;
	private File file;
	private String inputFromFile;
	private JPanel p = new JPanel();
	private String s = "";
	private JFileChooser chooser = new JFileChooser();
	private FileNameExtensionFilter filter = new FileNameExtensionFilter("SRU-filer", "sru");
	private JMenu menu = new JMenu("Meny");
	private JMenuBar menuBar = new JMenuBar();
	private JMenuItem menuItem1 = new JMenuItem("Skapa filer");
	private JMenuItem menuItem2 = new JMenuItem("Visa fil");
	private JMenuItem menuItem3 = new JMenuItem("Hämta fil");
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
	private final JPanel panel_1 = new JPanel();
	private final JPanel panel_2 = new JPanel();
	private final JPanel panel_3 = new JPanel();
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

	ArrayList<JPanel>ink2rList = new ArrayList<>();
	JScrollPane scrollPane = new JScrollPane();
	
	public GUI2() {
		frame = new JFrame("SRU");	
		frame.getContentPane().setLayout(null);
		JPanel basePanel = new JPanel();
		scrollPane = new JScrollPane(basePanel);
		frame.getContentPane().add(scrollPane);
		basePanel.setLayout(null);
		basePanel.setBackground(Color.WHITE);
		scrollPane.setBounds(0, 0, 1000, 1260);
		basePanel.setBounds(0, 0, 1000, 1260);
		scrollPane.setVerticalScrollBar(new JScrollBar());
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		menuBar.setSize(38, 20);
		basePanel.add(menuBar);
		menuBar.add(menu);
		menu.add(menuItem1);
		menu.add(menuItem2);
		menu.add(menuItem3);
		//basePanel.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));

		//frame.getContentPane().add(p, BorderLayout.WEST);
		
		//Skapar scrollpanel och kopplar den samma med f�nstret som man har formul�ret i

		basePanel.add(panel);
		basePanel.add(panel_1);
		basePanel.add(panel_2);
		basePanel.add(panel_3);
		basePanel.add(panel_4);
		basePanel.add(panel_5);
		basePanel.add(panel_6);
		basePanel.add(panel_7);
		basePanel.add(panel_8);
		basePanel.add(panel_9);
		basePanel.add(panel_10);
		basePanel.add(panel_11);
		basePanel.add(panel_12);
		basePanel.add(panel_13);
		basePanel.add(panel_14);
		basePanel.add(panel_15);
		basePanel.add(panel_16);
		basePanel.add(panel_17);
		basePanel.add(panel_18);
		basePanel.add(panel_19);
		basePanel.add(panel_20);
		basePanel.add(panel_21);
		basePanel.add(panel_22);
		basePanel.add(panel_23);
		basePanel.add(panel_24);
		basePanel.add(panel_25);
		basePanel.add(panel_26);
		basePanel.add(panel_27);
		basePanel.add(panel_28);
		basePanel.add(panel_29);
		basePanel.add(panel_30);
		basePanel.add(panel_31);
		basePanel.add(panel_32);
		basePanel.add(panel_33);
		basePanel.add(panel_34);
		basePanel.add(panel_35);
		basePanel.add(panel_36);
		basePanel.add(panel_37);
		basePanel.add(panel_30);
		basePanel.add(panel_31);
		basePanel.add(panel_32);
		basePanel.add(panel_33);
		basePanel.add(panel_34);
		basePanel.add(panel_35);
		basePanel.add(panel_36);
		basePanel.add(panel_37);
		basePanel.add(panel_38);
		basePanel.add(panel_39);
		basePanel.add(panel_40);
		basePanel.add(panel_41);
		basePanel.add(panel_42);
		basePanel.add(panel_43);
		basePanel.add(panel_44);
		basePanel.add(panel_45);
		basePanel.add(panel_46);
		basePanel.add(panel_47);
		basePanel.add(panel_48);
		basePanel.add(panel_49);
		
		panel.setLayout(null);
		panel_1.setLayout(null);
		panel_2.setLayout(null);
		panel_3.setLayout(null);
		panel_4.setLayout(null);
		panel_5.setLayout(null);
		panel_6.setLayout(null);
		panel_7.setLayout(null);
		panel_8.setLayout(null);
		panel_9.setLayout(null);
		panel_10.setLayout(null);
		panel_11.setLayout(null);
		panel_12.setLayout(null); 
		panel_13.setLayout(null);
		panel_14.setLayout(null);
		panel_15.setLayout(null);
		panel_16.setLayout(null);
		panel_17.setLayout(null);
		panel_18.setLayout(null);
		panel_19.setLayout(null);
		panel_20.setLayout(null);
		panel_21.setLayout(null);
		panel_22.setLayout(null);
		panel_23.setLayout(null);
		panel_24.setLayout(null);
		panel_25.setLayout(null);
		panel_26.setLayout(null);
		panel_27.setLayout(null);
		panel_28.setLayout(null);
		panel_29.setLayout(null);
		panel_30.setLayout(null);
		panel_31.setLayout(null);
		panel_32.setLayout(null);
		panel_33.setLayout(null);
		panel_34.setLayout(null);
		panel_35.setLayout(null);
		panel_36.setLayout(null);
		panel_37.setLayout(null);
		panel_38.setLayout(null);
		panel_39.setLayout(null);
		panel_40.setLayout(null);
		panel_41.setLayout(null);
		panel_42.setLayout(null);
		panel_43.setLayout(null);
		panel_44.setLayout(null);
		panel_45.setLayout(null);
		panel_46.setLayout(null);
		panel_47.setLayout(null);
		panel_48.setLayout(null);
		panel_49.setLayout(null);

		panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_5.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_6.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_7.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_8.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_9.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_10.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_11.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_12.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_13.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_14.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_15.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_16.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_17.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_18.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_19.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_20.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_21.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_22.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_23.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_24.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_25.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_26.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_27.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_28.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_29.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_30.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_31.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_32.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_33.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_34.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_35.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_36.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_37.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_38.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_39.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_40.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_41.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_42.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_43.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_44.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_45.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_46.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_47.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_48.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_49.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		panel.setBackground(Color.WHITE);
		panel_1.setBackground(Color.WHITE);
		panel_2.setBackground(Color.WHITE);
		panel_3.setBackground(Color.WHITE);
		panel_4.setBackground(Color.WHITE);
		panel_5.setBackground(Color.WHITE);
		panel_6.setBackground(Color.WHITE);
		panel_7.setBackground(Color.WHITE);
		panel_8.setBackground(Color.WHITE);
		panel_9.setBackground(Color.WHITE);
		panel_10.setBackground(Color.WHITE);
		panel_11.setBackground(Color.WHITE);
		panel_12.setBackground(Color.WHITE);
		panel_13.setBackground(Color.WHITE);
		panel_14.setBackground(Color.WHITE);
		panel_15.setBackground(Color.WHITE);
		panel_16.setBackground(Color.WHITE);
		panel_17.setBackground(Color.WHITE);
		panel_18.setBackground(Color.WHITE);
		panel_19.setBackground(Color.WHITE);
		panel_20.setBackground(Color.WHITE);
		panel_21.setBackground(Color.WHITE);
		panel_22.setBackground(Color.WHITE);
		panel_23.setBackground(Color.WHITE);
		panel_24.setBackground(Color.WHITE);
		panel_25.setBackground(Color.WHITE);
		panel_26.setBackground(Color.WHITE);
		panel_27.setBackground(Color.WHITE);
		panel_28.setBackground(Color.WHITE);
		panel_29.setBackground(Color.WHITE);
		panel_30.setBackground(Color.WHITE);
		panel_31.setBackground(Color.WHITE);
		panel_32.setBackground(Color.WHITE);
		panel_33.setBackground(Color.WHITE);
		panel_34.setBackground(Color.WHITE);
		panel_35.setBackground(Color.WHITE);
		panel_36.setBackground(Color.WHITE);
		panel_37.setBackground(Color.WHITE);
		panel_38.setBackground(Color.WHITE);
		panel_39.setBackground(Color.WHITE);
		panel_40.setBackground(Color.WHITE);
		panel_41.setBackground(Color.WHITE);
		panel_42.setBackground(Color.WHITE);
		panel_43.setBackground(Color.WHITE);
		panel_44.setBackground(Color.WHITE);
		panel_45.setBackground(Color.WHITE);
		panel_46.setBackground(Color.WHITE);
		panel_47.setBackground(Color.WHITE);
		panel_48.setBackground(Color.WHITE);
		panel_49.setBackground(Color.WHITE);
		
		textField_3.setBounds(614, 77, 230, 20);
		textField_3.setColumns(10);
		textField_2.setBounds(393, 77, 223, 20);
		textField_2.setColumns(10);
		
		lblNewLabel_1.setBounds(393, 21, 238, 14);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		basePanel.add(lblNewLabel_1);
		lblInkomstdeklaration.setBounds(393, 37, 176, 14);
		lblInkomstdeklaration.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		basePanel.add(lblInkomstdeklaration);
		lblFrom.setBounds(84, 92, 72, 14);
		lblFrom.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		basePanel.add(lblFrom);
		lblTom.setBounds(214, 92, 72, 14);
		lblTom.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		basePanel.add(lblTom);
		lblOrganisationsnummer.setBounds(393, 62, 104, 14);
		lblOrganisationsnummer.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		basePanel.add(lblOrganisationsnummer);
		lblDatumNrBlanketten.setBounds(615, 62, 131, 14);
		lblDatumNrBlanketten.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		basePanel.add(lblDatumNrBlanketten);
		lblNewLabel_2.setBounds(762, 21, 140, 45);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		
		basePanel.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(84, 112, 116, 20);
		basePanel.add(textField); 
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(210, 74, 130, 20);
		textField_1.setColumns(10);
		
		basePanel.add(textField_2);
		
		basePanel.add(textField_3);
		label_1.setBounds(0, 158, 255, 22);
		label_1.setFont(new Font("Arial", Font.BOLD, 16));
		
		basePanel.add(label_1);
		textField_4.setBounds(222, 128, 164, 68);
		textField_4.setColumns(10);
		
		basePanel.add(textField_4);
		
		panel_1.setBounds(0, 194, 223, 68);
		txtrKoncessionerPatent_2.setText("2.1 Koncessioner, patent, licenser\r\n      varumärken, hyresrätter, goodwill\r\n      och liknande rättigheter");
		txtrKoncessionerPatent_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrKoncessionerPatent_2.setBounds(10, 25, 157, 43);
		txtrKoncessionerPatent_2.setOpaque(false);
		
		panel_1.add(txtrKoncessionerPatent_2);
		
		panel_2.setBounds(0, 262, 222, 45);
		JTextArea txtrFrskottAvseende = new JTextArea();
		txtrFrskottAvseende.setBounds(10, 5, 157, 43);
		txtrFrskottAvseende.setText("\r\n2.2 Förskott avseende immateriella\r\n      anläggningstillgångar");
		txtrFrskottAvseende.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrFrskottAvseende.setOpaque(false);
		panel_2.add(txtrFrskottAvseende);
		
		textField_5 = new JTextField();
		textField_5.setBounds(221, 194, 165, 45);
		textField_5.setColumns(10);
		basePanel.add(textField_5);
		
		panel_3.setBounds(0, 307, 222, 45);
				
		Label label_3 = new Label("Materiella anläggningstillgångar");
		label_3.setBounds(10, 5, 172, 20);
		panel_3.add(label_3);
		label_3.setFont(new Font("Dialog", Font.BOLD, 10));
		txtrKoncessionerPatent.setBounds(10, 25, 158, 20);
		txtrKoncessionerPatent.setText("2.3 Byggnader och mark");
		txtrKoncessionerPatent.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrKoncessionerPatent.setOpaque(false);
		panel_3.add(txtrKoncessionerPatent);
		
		textField_6 = new JTextField();
		textField_6.setBounds(222, 237, 164, 45);
		textField_6.setColumns(10);
		basePanel.add(textField_6);
		panel_4.setBounds(0, 352, 223, 45);
		
		
		
		txtrMaskinerInventarier.setText("2.4 Maskiner, inventarier och övriga\r\n      materiella anläggningstillgångar");
		txtrMaskinerInventarier.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrMaskinerInventarier.setBounds(10, 11, 169, 34);
		txtrMaskinerInventarier.setOpaque(false);
		panel_4.add(txtrMaskinerInventarier);
		textField_7.setBounds(222, 281, 164, 45);
		textField_7.setColumns(10);
		
		
		basePanel.add(textField_7);
		panel_5.setBounds(0, 397, 222, 35);
		
		
		txtrFrbttring.setBounds(10, 0, 210, 23);
		txtrFrbttring.setText("2.5 Förbättringsuppgifter på annans fastighet");
		txtrFrbttring.setFont(new Font("Tahoma", Font.PLAIN, 10));
		
		panel_5.add(txtrFrbttring);
		textField_8.setBounds(222, 326, 164, 35);
		textField_8.setColumns(10);
		
		basePanel.add(textField_8);
		panel_6.setBounds(0, 432, 222, 35);
		txtrFrbttring.setOpaque(false);
		
		
		
		txtrPgendeNyanlggningar.setBounds(10, 0, 212, 35);
		txtrPgendeNyanlggningar.setText("2.6 Pågående nyanläggningar och förskott\r\n      avseende materiella anläggningstillgångar");
		txtrPgendeNyanlggningar.setFont(new Font("Tahoma", Font.PLAIN, 10));
		
		panel_6.add(txtrPgendeNyanlggningar);
		textField_9.setBounds(222, 361, 164, 35);
		textField_9.setColumns(10);
		
		basePanel.add(textField_9);
		label_4.setBounds(393, 103, 255, 22);
		label_4.setFont(new Font("Arial", Font.BOLD, 16));
		txtrPgendeNyanlggningar.setOpaque(false);
		
		basePanel.add(label_4);
		panel_7.setBounds(394, 158, 222, 33);
		
	
		txtrBundetEget.setBounds(10, 5, 212, 17);
		txtrBundetEget.setText("2.27 Bundet eget kapital");
		txtrBundetEget.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrBundetEget.setOpaque(false);
		panel_7.add(txtrBundetEget);
		textField_10.setBounds(615, 128, 229, 33);
		textField_10.setColumns(10);
		
		basePanel.add(textField_10);
		panel_8.setBounds(0, 467, 223, 45);
		
			
		txtrKoncessionerPatent_1.setBounds(10, 21, 203, 13);
		txtrKoncessionerPatent_1.setText("2.7 Andelar i koncernföretag");
		txtrKoncessionerPatent_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		
		panel_8.add(txtrKoncessionerPatent_1);
		label_5.setBounds(10, 2, 172, 20);
		txtrKoncessionerPatent_1.setOpaque(false);
		label_5.setFont(new Font("Dialog", Font.BOLD, 10));
		
		panel_8.add(label_5);
		textField_11.setBounds(222, 397, 165, 45);
		textField_11.setColumns(10);
		
		basePanel.add(textField_11);
		panel_9.setBounds(0, 510, 222, 33);
	
		txtrAndelarI.setText("2.8 Andelar i intresseföretag");
		txtrAndelarI.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrAndelarI.setBounds(10, 11, 212, 17);
		txtrAndelarI.setOpaque(false);
		panel_9.add(txtrAndelarI);
		panel_10.setBounds(0, 543, 222, 35);
	
		
		
		txtrFordringarHos.setText("2.9 Fordringar hos koncern- och\r\n      intresseföretag");
		txtrFordringarHos.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrFordringarHos.setBounds(10, 0, 186, 35);
		txtrFordringarHos.setOpaque(false);
		
		panel_10.add(txtrFordringarHos);
		panel_11.setBounds(0, 578, 222, 28);

		txtrAndraLngfristiga.setBounds(10, 0, 202, 28);
		txtrAndraLngfristiga.setText("2.10 Andra långfristiga värde-\r\n        pappersinnehav");
		txtrAndraLngfristiga.setFont(new Font("Tahoma", Font.PLAIN, 10));
		panel_11.add(txtrAndraLngfristiga);
		panel_12.setBounds(0, 605, 222, 28);
		txtrAndraLngfristiga.setOpaque(false);
		
		
		txtrLnTill.setText("2.11 Lån till delägare eller närstående");
		txtrLnTill.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrLnTill.setBounds(10, 11, 212, 13);
		txtrLnTill.setOpaque(false);
		panel_12.add(txtrLnTill);
		panel_13.setBounds(0, 632, 222, 28);
		
		
		
		txtrAndraLngfristiga_1.setText("2.12 Andra långfristiga fordringar");
		txtrAndraLngfristiga_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrAndraLngfristiga_1.setBounds(10, 0, 212, 24);
		txtrAndraLngfristiga_1.setOpaque(false);
		panel_13.add(txtrAndraLngfristiga_1);
		textField_12.setBounds(221, 440, 165, 33);
		textField_12.setColumns(10);
		
		basePanel.add(textField_12);
		textField_13.setBounds(222, 471, 164, 35);
		textField_13.setColumns(10);
		
		basePanel.add(textField_13);
		textField_14.setBounds(223, 506, 163, 26);
		textField_14.setColumns(10);
		
		basePanel.add(textField_14);
		textField_15.setBounds(222, 533, 165, 28);
		textField_15.setColumns(10);
		
		basePanel.add(textField_15);
		panel_14.setBounds(394, 191, 222, 33);
		
		
		
		txtrFrittEget.setText("2.28 Fritt eget kapital");
		txtrFrittEget.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrFrittEget.setBounds(10, 5, 212, 17);
		txtrFrittEget.setOpaque(false);
		panel_14.add(txtrFrittEget);
		textField_17.setBounds(615, 161, 229, 35);
		textField_17.setColumns(10);
		
		basePanel.add(textField_17);
		label_6.setBounds(393, 194, 320, 22);
		label_6.setFont(new Font("Arial", Font.BOLD, 16));
		
		basePanel.add(label_6);
		panel_15.setBounds(393, 249, 222, 45);
		
		
		
		label_7.setFont(new Font("Dialog", Font.BOLD, 10));
		label_7.setBounds(4, 5, 172, 20);
		
		panel_15.add(label_7);
		txtrPeriodiseringsfonder.setText("2.29 Periodiseringsfonder");
		txtrPeriodiseringsfonder.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrPeriodiseringsfonder.setBounds(10, 25, 158, 20);
		txtrPeriodiseringsfonder.setOpaque(false);
		panel_15.add(txtrPeriodiseringsfonder);
		textField_18.setBounds(615, 219, 230, 45);
		textField_18.setColumns(10);
		
		basePanel.add(textField_18);
		panel_16.setBounds(393, 294, 222, 28);
		
		
		
		txtrAckumuleradeveravskrivningar.setText("2.30 Ackumulerade överavskrivningar");
		txtrAckumuleradeveravskrivningar.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrAckumuleradeveravskrivningar.setBounds(10, 11, 202, 13);
		
		panel_16.add(txtrAckumuleradeveravskrivningar);
		panel_17.setBounds(393, 320, 222, 36);
		
		
		
		txtrvrigaObeskattade.setText("2.31 Övriga obeskattade reserver");
		txtrvrigaObeskattade.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrvrigaObeskattade.setBounds(10, 11, 157, 13);
		txtrvrigaObeskattade.setOpaque(false);
		panel_17.add(txtrvrigaObeskattade);
		textField_19.setBounds(615, 264, 229, 28);
		textField_19.setColumns(10);
		
		basePanel.add(textField_19);
		textField_20.setBounds(615, 290, 229, 35);
		textField_20.setColumns(10);
		
		basePanel.add(textField_20);
		panel_18.setBounds(393, 523, 222, 41);
		
		label_8.setBounds(0, -2, 172, 20);
		label_8.setFont(new Font("Dialog", Font.BOLD, 10));
		
		panel_18.add(label_8);
		txtrObligationsln.setBounds(0, 22, 158, 19);
		txtrObligationsln.setText("2.35 Obligationslån");
		txtrObligationsln.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrObligationsln.setOpaque(false);
		panel_18.add(txtrObligationsln);
		
		Label label = new Label("Räkenskapser");
		label.setBounds(0, 110, 78, 22);
		basePanel.add(label);
		label_9.setBounds(0, 677, 205, 22);
		label_9.setFont(new Font("Arial", Font.BOLD, 16));
		
		basePanel.add(label_9);
		panel.setBounds(0, 705, 222, 45);
		
		
		
		label_10.setFont(new Font("Dialog", Font.BOLD, 10));
		label_10.setBounds(10, 5, 172, 20);
		
		panel.add(label_10);
		txtrRvarorOch.setText("2.13 Råvaror och förnödenheter");
		txtrRvarorOch.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrRvarorOch.setBounds(10, 26, 158, 20);
		txtrRvarorOch.setOpaque(false);
		panel.add(txtrRvarorOch);
		textField_21.setBounds(222, 645, 164, 45);
		textField_21.setColumns(10);
		
		basePanel.add(textField_21);
		panel_19.setBounds(0, 719, 222, 28);
	
				
		txtrVarorUnder.setText("2.14 Varor under tillverkning");
		txtrVarorUnder.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrVarorUnder.setBounds(10, 11, 212, 17);
		txtrVarorUnder.setOpaque(false);
		panel_19.add(txtrVarorUnder);
		textField_22.setBounds(222, 689, 165, 28);
		textField_22.setColumns(10);
		
		basePanel.add(textField_22);
		textField_16.setBounds(222, 559, 165, 28);
		textField_16.setColumns(10);
		
		basePanel.add(textField_16);
		panel_20.setBounds(0, 748, 222, 28);
						
		txtrFrdigaVaror.setText("2.15 Färdiga varor och handelsvaror");
		txtrFrdigaVaror.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrFrdigaVaror.setBounds(10, 11, 212, 17);
		txtrFrdigaVaror.setOpaque(false);
		panel_20.add(txtrFrdigaVaror);
		panel_21.setBounds(0, 775, 222, 28);
		
		txtrvrigaLagertillgngar.setText("2.16 Övriga lagertillgångar");
		txtrvrigaLagertillgngar.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrvrigaLagertillgngar.setBounds(10, 11, 212, 17);
		txtrvrigaLagertillgngar.setOpaque(false);
		panel_21.add(txtrvrigaLagertillgngar);
		panel_22.setBounds(0, 774, 222, 28);
	
		txtrPgendeArbetenFr.setText("2.17 Pågående arbeten för annans räkning");
		txtrPgendeArbetenFr.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrPgendeArbetenFr.setBounds(10, 11, 212, 17);
		txtrPgendeArbetenFr.setOpaque(false);
		panel_22.add(txtrPgendeArbetenFr);
		panel_23.setBounds(0, 801, 222, 28);
			
		txtrFrskottTill.setText("2.18 Förskott till leverantörer");
		txtrFrskottTill.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrFrskottTill.setBounds(10, 11, 212, 17);
		txtrFrskottTill.setOpaque(false);
		panel_23.add(txtrFrskottTill);
		panel_27.setBounds(0, 875, 222, 28);
		
		txtrFordringarHos_1.setText("2.20 Fordringar hos koncern- och\r\n        intresseföretag");
		txtrFordringarHos_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrFordringarHos_1.setBounds(10, 0, 196, 28);
		txtrFordringarHos_1.setOpaque(false);
		panel_27.add(txtrFordringarHos_1);
		panel_28.setBounds(1, 903, 222, 28);

		
		txtrvrigaFordringar.setText("2.21 Övriga fordringar");
		txtrvrigaFordringar.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrvrigaFordringar.setBounds(10, 11, 212, 17);
		txtrvrigaFordringar.setOpaque(false);
		panel_28.add(txtrvrigaFordringar);
		panel_29.setBounds(1, 931, 222, 39);
	
		txtrUpparbetadMen.setText("2.22 Upparbetad men ej fakturerad intäkt");
		txtrUpparbetadMen.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrUpparbetadMen.setBounds(10, 11, 212, 17);
		txtrUpparbetadMen.setOpaque(false);
		panel_29.add(txtrUpparbetadMen);
		panel_30.setBounds(1, 970, 222, 45);
		
		txtrFrutbetaldaKostnader.setText("2.23 Förutbetalda kostnader och upplupna\r\n        intäkter");
		txtrFrutbetaldaKostnader.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrFrutbetaldaKostnader.setBounds(10, 11, 212, 30);
		txtrFrutbetaldaKostnader.setOpaque(false);
		panel_30.add(txtrFrutbetaldaKostnader);
		panel_31.setBounds(0, 1060, 222, 35);
		
		txtrvrigaKostfria.setText("2.25 Övriga kostfria placeringar");
		txtrvrigaKostfria.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrvrigaKostfria.setBounds(10, 11, 212, 17);
		txtrvrigaKostfria.setOpaque(false);
		panel_31.add(txtrvrigaKostfria);
		panel_24.setBounds(1, 830, 222, 45);
				
		label_11.setFont(new Font("Dialog", Font.BOLD, 10));
		label_11.setBounds(10, 0, 172, 20);
		
		panel_24.add(label_11);
		txtrKundfordringar.setText("2.19 Kundfordringar");
		txtrKundfordringar.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrKundfordringar.setBounds(10, 26, 158, 20);
		txtrKundfordringar.setOpaque(false);
		panel_24.add(txtrKundfordringar);
		panel_25.setBounds(1, 1013, 222, 45);
			
		label_12.setFont(new Font("Dialog", Font.BOLD, 10));
		label_12.setBounds(10, 10, 172, 10);
		
		panel_25.add(label_12);
		txtrFrutbetaldaKostnader_1.setText("2.24 Andelar i koncernföretag");
		txtrFrutbetaldaKostnader_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrFrutbetaldaKostnader_1.setBounds(10, 26, 202, 20);
		txtrFrutbetaldaKostnader_1.setOpaque(false);
		panel_25.add(txtrFrutbetaldaKostnader_1);
		panel_26.setBounds(0, 1095, 222, 55);
		
		label_13.setBounds(10, 10, 172, 20);
		label_13.setFont(new Font("Dialog", Font.BOLD, 10));
		
		panel_26.add(label_13);
		txtrKassaBank.setBounds(10, 26, 202, 20);
		txtrKassaBank.setText("2.26 Kassa, bank och redovisningsmedel");
		txtrKassaBank.setFont(new Font("Tahoma", Font.PLAIN, 10));
		
		panel_26.add(txtrKassaBank);
		textField_23.setBounds(222, 717, 165, 28);
		txtrKassaBank.setOpaque(false);
		textField_23.setColumns(10);
		
		basePanel.add(textField_23);
		textField_24.setBounds(221, 743, 165, 28);
		textField_24.setColumns(10);
		
		basePanel.add(textField_24);
		textField_25.setBounds(221, 774, 165, 28);
		textField_25.setColumns(10);
		
		basePanel.add(textField_25);
		textField_26.setBounds(222, 809, 165, 28);
		textField_26.setColumns(10);
		
		basePanel.add(textField_26);
		textField_27.setBounds(223, 840, 164, 45);
		textField_27.setColumns(10);
		
		basePanel.add(textField_27);
		textField_28.setBounds(222, 883, 165, 28);
		textField_28.setColumns(10);
		
		basePanel.add(textField_28);
		textField_29.setBounds(222, 913, 165, 28);
		textField_29.setColumns(10);
		
		basePanel.add(textField_29);
		textField_30.setBounds(222, 939, 165, 28);
		textField_30.setColumns(10);
		
		basePanel.add(textField_30);
		textField_31.setBounds(222, 969, 165, 45);
		textField_31.setColumns(10);
		
		basePanel.add(textField_31);
		textField_32.setBounds(222, 1013, 164, 45);
		textField_32.setColumns(10);
		
		basePanel.add(textField_32);
		textField_33.setBounds(221, 1060, 165, 35);
		textField_33.setColumns(10);
		
		basePanel.add(textField_33);
		textField_34.setBounds(222, 1095, 164, 55);
		textField_34.setColumns(10);
		
		basePanel.add(textField_34);
		panel_32.setBounds(393, 326, 223, 61);
				
		label_14.setFont(new Font("Dialog", Font.BOLD, 10));
		label_14.setBounds(0, 0, 172, 20);
		
		panel_32.add(label_14);
		txtrAvsttningarFr.setText("2.32 Avsättningar för pensioner och liknande\r\n        förpliktelse enligt lag (1967:531) om\r\n        tryggande av pensionsutfästelse m.m.");
		txtrAvsttningarFr.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrAvsttningarFr.setBounds(0, 15, 206, 47);
		txtrAvsttningarFr.setOpaque(false);
		panel_32.add(txtrAvsttningarFr);
		textField_35.setBounds(615, 326, 229, 61);
		textField_35.setColumns(10);
		
		basePanel.add(textField_35);
		panel_33.setBounds(393, 385, 222, 35);

		txtrvrigaAvsttningar.setText("2.33 Övriga avsättningar för pensioner och\r\n        liknande förpliktelser");
		txtrvrigaAvsttningar.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrvrigaAvsttningar.setBounds(0, 0, 212, 34);
		txtrvrigaAvsttningar.setOpaque(false);
		panel_33.add(txtrvrigaAvsttningar);
		panel_34.setBounds(394, 418, 222, 45);
	
		txtrvrigaAvsttningar_1.setText("2.34 Övriga avsättningar\r\n");
		txtrvrigaAvsttningar_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrvrigaAvsttningar_1.setBounds(0, 11, 157, 13);
		txtrvrigaAvsttningar_1.setOpaque(false);
		panel_34.add(txtrvrigaAvsttningar_1);
		textField_36.setBounds(615, 385, 229, 35);
		textField_36.setColumns(10);
		
		basePanel.add(textField_36);
		textField_37.setBounds(615, 418, 229, 45);
		textField_37.setColumns(10);
		
		basePanel.add(textField_37);
		label_15.setBounds(393, 471, 299, 22);
		label_15.setFont(new Font("Arial", Font.BOLD, 16));
		
		basePanel.add(label_15);
		textField_38.setBounds(615, 493, 229, 41);
		textField_38.setColumns(10);
		
		basePanel.add(textField_38);
		panel_35.setBounds(393, 533, 223, 38);
		
		txtrCheckrkningskredit.setText("2.36 Checkräkningskredit");
		txtrCheckrkningskredit.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrCheckrkningskredit.setBounds(0, 21, 212, 17);
		txtrCheckrkningskredit.setOpaque(false);
		panel_35.add(txtrCheckrkningskredit);
		textField_39.setBounds(615, 533, 229, 38);
		textField_39.setColumns(10);
		
		basePanel.add(textField_39);
		panel_36.setBounds(393, 572, 223, 29);
		
		txtrvrigaSkulder.setText("2.37 Övriga skulder till kreditinstitut");
		txtrvrigaSkulder.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrvrigaSkulder.setBounds(0, 11, 212, 17);
		txtrvrigaSkulder.setOpaque(false);
		panel_36.add(txtrvrigaSkulder);
		panel_37.setBounds(393, 602, 223, 33);
		
		txtrSkulderTill.setBounds(0, 11, 213, 17);
		txtrSkulderTill.setText("2.38 Skulder till koncern- och intresseföretag");
		txtrSkulderTill.setFont(new Font("Tahoma", Font.PLAIN, 10));
		
		panel_37.add(txtrSkulderTill);
		panel_38.setBounds(393, 634, 223, 38);
		txtrSkulderTill.setOpaque(false);
			
		txtrvrigaSkulder_1.setText("2.39 Övriga skulder");
		txtrvrigaSkulder_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrvrigaSkulder_1.setBounds(0, 21, 212, 17);
		txtrvrigaSkulder_1.setOpaque(false);
		panel_38.add(txtrvrigaSkulder_1);
		textField_40.setBounds(615, 572, 229, 29);
		textField_40.setColumns(10);
		
		basePanel.add(textField_40);
		textField_41.setBounds(615, 602, 229, 33);
		textField_41.setColumns(10);
		
		basePanel.add(textField_41);
		textField_42.setBounds(615, 634, 229, 38);
		textField_42.setColumns(10);
		
		basePanel.add(textField_42);
		panel_39.setBounds(393, 672, 222, 43);
		
		label_16.setFont(new Font("Dialog", Font.BOLD, 10));
		label_16.setBounds(0, -2, 172, 20);
		
		panel_39.add(label_16);
		txtrCheckrkningskredit_1.setText("2.40 Checkräkningskredit");
		txtrCheckrkningskredit_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrCheckrkningskredit_1.setBounds(0, 22, 158, 19);
		txtrCheckrkningskredit_1.setOpaque(false);
		panel_39.add(txtrCheckrkningskredit_1);
		textField_43.setBounds(615, 670, 229, 45);
		textField_43.setColumns(10);
		
		basePanel.add(textField_43);
		panel_40.setBounds(393, 717, 223, 38);
		
		txtrvrigaSkulder_2.setText("2.41 Övriga skulder till kreditinstitut");
		txtrvrigaSkulder_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrvrigaSkulder_2.setBounds(0, 21, 212, 17);
		txtrvrigaSkulder_2.setOpaque(false);
		panel_40.add(txtrvrigaSkulder_2);
		panel_41.setBounds(393, 755, 223, 38);
		
		txtrFrskottFrn.setText("2.42 Förskott från kunder");
		txtrFrskottFrn.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrFrskottFrn.setBounds(0, 21, 212, 17);
		txtrFrskottFrn.setOpaque(false);
		panel_41.add(txtrFrskottFrn);
		
		JTextArea textArea = new JTextArea();
		textArea.setText("2.13 Råvaror och förnödenheter");
		textArea.setOpaque(false);
		textArea.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textArea.setBounds(-133, 47, 158, 20);
		panel_41.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setText("2.1 Koncessioner, patent, licenser\r\n      varumärken, hyresrätter, goodwill\r\n      och liknande rättigheter");
		textArea_1.setOpaque(false);
		textArea_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textArea_1.setBounds(-134, -442, 157, 43);
		panel_41.add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setText("\r\n2.2 Förskott avseende immateriella\r\n      anläggningstillgångar");
		textArea_2.setOpaque(false);
		textArea_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textArea_2.setBounds(-134, -396, 157, 43);
		panel_41.add(textArea_2);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setText("2.3 Byggnader och mark");
		textArea_3.setOpaque(false);
		textArea_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textArea_3.setBounds(-134, -333, 158, 20);
		panel_41.add(textArea_3);
		
		JTextArea textArea_4 = new JTextArea();
		textArea_4.setText("2.4 Maskiner, inventarier och övriga\r\n      materiella anläggningstillgångar");
		textArea_4.setOpaque(false);
		textArea_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textArea_4.setBounds(-134, -303, 169, 34);
		panel_41.add(textArea_4);
		
		JTextArea textArea_5 = new JTextArea();
		textArea_5.setText("2.5 Förbättringsuppgifter på annans fastighet");
		textArea_5.setOpaque(false);
		textArea_5.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textArea_5.setBounds(-134, -269, 210, 23);
		panel_41.add(textArea_5);
		
		JTextArea textArea_6 = new JTextArea();
		textArea_6.setText("2.6 Pågående nyanläggningar och förskott\r\n      avseende materiella anläggningstillgångar");
		textArea_6.setOpaque(false);
		textArea_6.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textArea_6.setBounds(-134, -234, 212, 35);
		panel_41.add(textArea_6);
		
		JTextArea textArea_7 = new JTextArea();
		textArea_7.setText("2.27 Bundet eget kapital");
		textArea_7.setOpaque(false);
		textArea_7.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textArea_7.setBounds(260, -462, 212, 17);
		panel_41.add(textArea_7);
		
		JTextArea textArea_8 = new JTextArea();
		textArea_8.setText("2.7 Andelar i koncernföretag");
		textArea_8.setOpaque(false);
		textArea_8.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textArea_8.setBounds(-134, -177, 203, 13);
		panel_41.add(textArea_8);
		
		JTextArea textArea_9 = new JTextArea();
		textArea_9.setText("2.8 Andelar i intresseföretag");
		textArea_9.setOpaque(false);
		textArea_9.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textArea_9.setBounds(-134, -144, 212, 17);
		panel_41.add(textArea_9);
		
		JTextArea textArea_10 = new JTextArea();
		textArea_10.setText("2.9 Fordringar hos koncern- och\r\n      intresseföretag");
		textArea_10.setOpaque(false);
		textArea_10.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textArea_10.setBounds(-133, -124, 212, 35);
		panel_41.add(textArea_10);
		
		JTextArea textArea_11 = new JTextArea();
		textArea_11.setText("2.10 Andra långfristiga värde-\r\n        pappersinnehav");
		textArea_11.setOpaque(false);
		textArea_11.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textArea_11.setBounds(-134, -89, 202, 28);
		panel_41.add(textArea_11);
		
		JTextArea textArea_12 = new JTextArea();
		textArea_12.setText("2.11 Lån till delägare eller närstående");
		textArea_12.setOpaque(false);
		textArea_12.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textArea_12.setBounds(-134, -51, 212, 13);
		panel_41.add(textArea_12);
		
		JTextArea textArea_13 = new JTextArea();
		textArea_13.setText("2.12 Andra långfristiga fordringar");
		textArea_13.setOpaque(false);
		textArea_13.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textArea_13.setBounds(-134, -36, 212, 24);
		panel_41.add(textArea_13);
		
		JTextArea textArea_14 = new JTextArea();
		textArea_14.setText("2.28 Fritt eget kapital");
		textArea_14.setOpaque(false);
		textArea_14.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textArea_14.setBounds(260, -429, 212, 17);
		panel_41.add(textArea_14);
		
		JTextArea textArea_15 = new JTextArea();
		textArea_15.setText("2.29 Periodiseringsfonder");
		textArea_15.setOpaque(false);
		textArea_15.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textArea_15.setBounds(259, -351, 158, 20);
		panel_41.add(textArea_15);
		
		JTextArea textArea_16 = new JTextArea();
		textArea_16.setText("2.30 Ackumulerade överavskrivningar");
		textArea_16.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textArea_16.setBounds(259, -320, 202, 13);
		panel_41.add(textArea_16);
		
		JTextArea textArea_17 = new JTextArea();
		textArea_17.setText("2.31 Övriga obeskattade reserver");
		textArea_17.setOpaque(false);
		textArea_17.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textArea_17.setBounds(259, -294, 157, 13);
		panel_41.add(textArea_17);
		
		JTextArea textArea_18 = new JTextArea();
		textArea_18.setText("2.35 Obligationslån");
		textArea_18.setOpaque(false);
		textArea_18.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textArea_18.setBounds(249, -80, 158, 19);
		panel_41.add(textArea_18);
		
		JTextArea textArea_19 = new JTextArea();
		textArea_19.setText("2.14 Varor under tillverkning");
		textArea_19.setOpaque(false);
		textArea_19.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textArea_19.setBounds(-134, 77, 212, 17);
		panel_41.add(textArea_19);
		
		JTextArea textArea_20 = new JTextArea();
		textArea_20.setText("2.15 Färdiga varor och handelsvaror");
		textArea_20.setOpaque(false);
		textArea_20.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textArea_20.setBounds(-134, 103, 212, 17);
		panel_41.add(textArea_20);
		
		JTextArea textArea_21 = new JTextArea();
		textArea_21.setText("2.16 Övriga lagertillgångar");
		textArea_21.setOpaque(false);
		textArea_21.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textArea_21.setBounds(-134, 133, 212, 17);
		panel_41.add(textArea_21);
		
		JTextArea textArea_22 = new JTextArea();
		textArea_22.setText("2.17 Pågående arbeten för annans räkning");
		textArea_22.setOpaque(false);
		textArea_22.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textArea_22.setBounds(-134, 163, 212, 17);
		panel_41.add(textArea_22);
		
		JTextArea textArea_23 = new JTextArea();
		textArea_23.setText("2.18 Förskott till leverantörer");
		textArea_23.setOpaque(false);
		textArea_23.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textArea_23.setBounds(-134, 192, 212, 17);
		panel_41.add(textArea_23);
		
		JTextArea textArea_24 = new JTextArea();
		textArea_24.setText("2.19 Kundfordringar");
		textArea_24.setOpaque(false);
		textArea_24.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textArea_24.setBounds(-134, 233, 158, 20);
		panel_41.add(textArea_24);
		
		JTextArea textArea_25 = new JTextArea();
		textArea_25.setText("2.24 Andelar i koncernföretag");
		textArea_25.setOpaque(false);
		textArea_25.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textArea_25.setBounds(-133, 412, 202, 20);
		panel_41.add(textArea_25);
		
		JTextArea textArea_26 = new JTextArea();
		textArea_26.setText("2.26 Kassa, bank och redovisningsmedel");
		textArea_26.setOpaque(false);
		textArea_26.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textArea_26.setBounds(-134, 496, 202, 20);
		panel_41.add(textArea_26);
		
		JTextArea textArea_27 = new JTextArea();
		textArea_27.setText("2.20 Fordringar hos koncern- och\r\n        intresseföretag");
		textArea_27.setOpaque(false);
		textArea_27.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textArea_27.setBounds(-134, 252, 212, 28);
		panel_41.add(textArea_27);
		
		JTextArea textArea_28 = new JTextArea();
		textArea_28.setText("2.21 Övriga fordringar");
		textArea_28.setOpaque(false);
		textArea_28.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textArea_28.setBounds(-134, 291, 212, 17);
		panel_41.add(textArea_28);
		
		JTextArea textArea_29 = new JTextArea();
		textArea_29.setText("2.22 Upparbetad men ej fakturerad intäkt");
		textArea_29.setOpaque(false);
		textArea_29.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textArea_29.setBounds(-134, 319, 212, 17);
		panel_41.add(textArea_29);
		
		JTextArea textArea_30 = new JTextArea();
		textArea_30.setText("2.23 Förutbetalda kostnader och upplupna\r\n        intäkter");
		textArea_30.setOpaque(false);
		textArea_30.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textArea_30.setBounds(-133, 348, 212, 30);
		panel_41.add(textArea_30);
		
		JTextArea textArea_31 = new JTextArea();
		textArea_31.setText("2.25 Övriga kostfria placeringar");
		textArea_31.setOpaque(false);
		textArea_31.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textArea_31.setBounds(-134, 442, 212, 17);
		panel_41.add(textArea_31);
		
		JTextArea textArea_32 = new JTextArea();
		textArea_32.setText("2.32 Avsättningar för pensioner och liknande\r\n        förpliktelse enligt lag (1967:531) om\r\n        tryggande av pensionsutfästelse m.m.");
		textArea_32.setOpaque(false);
		textArea_32.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textArea_32.setBounds(249, -254, 206, 47);
		panel_41.add(textArea_32);
		
		JTextArea textArea_33 = new JTextArea();
		textArea_33.setText("2.33 Övriga avsättningar för pensioner och\r\n        liknande förpliktelser");
		textArea_33.setOpaque(false);
		textArea_33.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textArea_33.setBounds(249, -210, 212, 34);
		panel_41.add(textArea_33);
		
		JTextArea textArea_34 = new JTextArea();
		textArea_34.setText("2.34 Övriga avsättningar\r\n");
		textArea_34.setOpaque(false);
		textArea_34.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textArea_34.setBounds(250, -166, 157, 13);
		panel_41.add(textArea_34);
		
		JTextArea textArea_35 = new JTextArea();
		textArea_35.setText("2.36 Checkräkningskredit");
		textArea_35.setOpaque(false);
		textArea_35.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textArea_35.setBounds(249, -41, 212, 17);
		panel_41.add(textArea_35);
		
		JTextArea textArea_36 = new JTextArea();
		textArea_36.setText("2.37 Övriga skulder till kreditinstitut");
		textArea_36.setOpaque(false);
		textArea_36.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textArea_36.setBounds(249, -12, 212, 17);
		panel_41.add(textArea_36);
		
		JTextArea textArea_37 = new JTextArea();
		textArea_37.setText("2.38 Skulder till koncern- och intresseföretag");
		textArea_37.setOpaque(false);
		textArea_37.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textArea_37.setBounds(249, 18, 213, 17);
		panel_41.add(textArea_37);
		
		JTextArea textArea_38 = new JTextArea();
		textArea_38.setText("2.39 Övriga skulder");
		textArea_38.setOpaque(false);
		textArea_38.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textArea_38.setBounds(249, 60, 212, 17);
		panel_41.add(textArea_38);
		
		JTextArea textArea_39 = new JTextArea();
		textArea_39.setText("2.40 Checkräkningskredit");
		textArea_39.setOpaque(false);
		textArea_39.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textArea_39.setBounds(249, 99, 158, 19);
		panel_41.add(textArea_39);
		
		JTextArea textArea_40 = new JTextArea();
		textArea_40.setText("2.41 Övriga skulder till kreditinstitut");
		textArea_40.setOpaque(false);
		textArea_40.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textArea_40.setBounds(249, 143, 212, 17);
		panel_41.add(textArea_40);
		
		JTextArea textArea_41 = new JTextArea();
		textArea_41.setText("2.42 Förskott från kunder");
		textArea_41.setOpaque(false);
		textArea_41.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textArea_41.setBounds(249, 181, 212, 17);
		panel_41.add(textArea_41);
		
		JTextArea textArea_42 = new JTextArea();
		textArea_42.setText("2.43 Pågående arbeten för annans räkning");
		textArea_42.setOpaque(false);
		textArea_42.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textArea_42.setBounds(249, 217, 212, 17);
		panel_41.add(textArea_42);
		
		JTextArea textArea_43 = new JTextArea();
		textArea_43.setText("2.44 Fakturerad men ej apparbetad intäkt");
		textArea_43.setOpaque(false);
		textArea_43.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textArea_43.setBounds(249, 254, 212, 17);
		panel_41.add(textArea_43);
		
		JTextArea textArea_44 = new JTextArea();
		textArea_44.setText("2.45 Leverantörsskulder");
		textArea_44.setOpaque(false);
		textArea_44.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textArea_44.setBounds(249, 291, 212, 17);
		panel_41.add(textArea_44);
		
		JTextArea textArea_45 = new JTextArea();
		textArea_45.setText("2.46 Växelskulder");
		textArea_45.setOpaque(false);
		textArea_45.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textArea_45.setBounds(249, 329, 212, 17);
		panel_41.add(textArea_45);
		
		JTextArea textArea_46 = new JTextArea();
		textArea_46.setText("2.47 Skulder till koncern- och intresseföretag");
		textArea_46.setOpaque(false);
		textArea_46.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textArea_46.setBounds(259, 365, 212, 17);
		panel_41.add(textArea_46);
		
		JTextArea textArea_47 = new JTextArea();
		textArea_47.setText("2.48 Skatteskulder");
		textArea_47.setOpaque(false);
		textArea_47.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textArea_47.setBounds(249, 403, 212, 17);
		panel_41.add(textArea_47);
		
		JTextArea textArea_48 = new JTextArea();
		textArea_48.setText("2.49 Övriga skulder");
		textArea_48.setOpaque(false);
		textArea_48.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textArea_48.setBounds(249, 439, 212, 17);
		panel_41.add(textArea_48);
		
		JTextArea textArea_49 = new JTextArea();
		textArea_49.setText("2.50 Upplupna kostnader och förutbetalda\r\n        intäkter");
		textArea_49.setOpaque(false);
		textArea_49.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textArea_49.setBounds(249, 466, 212, 27);
		panel_41.add(textArea_49);
		panel_42.setBounds(393, 791, 223, 38);
		
		txtrPgendeArbeten.setText("2.43 Pågående arbeten för annans räkning");
		txtrPgendeArbeten.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrPgendeArbeten.setBounds(0, 21, 212, 17);
		txtrPgendeArbeten.setOpaque(false);
		panel_42.add(txtrPgendeArbeten);
		panel_43.setBounds(393, 828, 223, 38);
		
		txtrFaktureradMen.setText("2.44 Fakturerad men ej apparbetad intäkt");
		txtrFaktureradMen.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrFaktureradMen.setBounds(0, 21, 212, 17);
		txtrFaktureradMen.setOpaque(false);
		panel_43.add(txtrFaktureradMen);
		panel_44.setBounds(393, 865, 223, 38);
		
		txtrLeverantrsskulder.setText("2.45 Leverantörsskulder");
		txtrLeverantrsskulder.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrLeverantrsskulder.setBounds(0, 21, 212, 17);
		txtrLeverantrsskulder.setOpaque(false);
		panel_44.add(txtrLeverantrsskulder);
		panel_45.setBounds(393, 903, 223, 38);
		
		txtrVxelskulder.setText("2.46 Växelskulder");
		txtrVxelskulder.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrVxelskulder.setBounds(0, 21, 212, 17);
		txtrVxelskulder.setOpaque(false);
		panel_45.add(txtrVxelskulder);
		panel_46.setBounds(393, 939, 223, 38);
		
		txtrSkulderTill_1.setText("2.47 Skulder till koncern- och intresseföretag");
		txtrSkulderTill_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrSkulderTill_1.setBounds(10, 21, 212, 17);
		txtrSkulderTill_1.setOpaque(false);
		panel_46.add(txtrSkulderTill_1);
		panel_47.setBounds(393, 977, 223, 38);
		
		txtrLeverantrsskulder_1.setText("2.48 Skatteskulder");
		txtrLeverantrsskulder_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrLeverantrsskulder_1.setBounds(0, 21, 212, 17);
		txtrLeverantrsskulder_1.setOpaque(false);
		panel_47.add(txtrLeverantrsskulder_1);
		panel_48.setBounds(393, 1013, 223, 38);
		
		txtrvrigaSkulder_3.setText("2.49 Övriga skulder");
		txtrvrigaSkulder_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrvrigaSkulder_3.setBounds(0, 21, 212, 17);
		txtrvrigaSkulder_3.setOpaque(false);
		panel_48.add(txtrvrigaSkulder_3);
		panel_49.setBounds(393, 1050, 223, 45);
		
		txtrUpplupnaKostnader.setText("2.50 Upplupna kostnader och förutbetalda\r\n        intäkter");
		txtrUpplupnaKostnader.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrUpplupnaKostnader.setBounds(0, 11, 212, 27);
		txtrUpplupnaKostnader.setOpaque(false);
		panel_49.add(txtrUpplupnaKostnader);
		
		Label label_2 = new Label("Immateriella anläggningstillgångar");
		label_2.setBounds(0, 138, 173, 14);
		basePanel.add(label_2);
		label_2.setFont(new Font("Dialog", Font.BOLD, 10));
		textField_44.setColumns(10);
		textField_44.setBounds(615, 717, 229, 38);
		
		basePanel.add(textField_44);
		textField_45.setColumns(10);
		textField_45.setBounds(615, 755, 229, 38);
		
		basePanel.add(textField_45);
		textField_46.setColumns(10);
		textField_46.setBounds(615, 791, 229, 38);
		
		basePanel.add(textField_46);
		textField_47.setColumns(10);
		textField_47.setBounds(615, 828, 229, 38);
		
		basePanel.add(textField_47);
		textField_48.setColumns(10);
		textField_48.setBounds(615, 865, 229, 38);
		
		basePanel.add(textField_48);
		textField_49.setColumns(10);
		textField_49.setBounds(615, 903, 229, 38);
		
		basePanel.add(textField_49);
		textField_50.setColumns(10);
		textField_50.setBounds(615, 939, 229, 38);
		
		basePanel.add(textField_50);
		textField_51.setColumns(10);
		textField_51.setBounds(615, 977, 229, 38);
		
		basePanel.add(textField_51);
		textField_52.setColumns(10);
		textField_52.setBounds(615, 1013, 229, 38);
		
		basePanel.add(textField_52);
		textField_53.setColumns(10);
		textField_53.setBounds(615, 1050, 229, 45);
		
		basePanel.add(textField_53);
		
		JLabel lblNewLabel = new JLabel(new ImageIcon("C:/Users/Christian/workspace/SRU/SkatteverketLogo.png"));
		lblNewLabel.setBounds(19, 16, 367, 68);
		basePanel.add(lblNewLabel);
		
		textField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField_1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField_2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField_3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField_4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField_5.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField_6.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField_7.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField_8.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField_9.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField_10.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField_11.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField_12.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField_13.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField_14.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField_15.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField_16.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField_17.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField_18.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField_19.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField_20.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField_21.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField_22.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField_23.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField_24.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField_25.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField_26.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField_27.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField_28.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField_29.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField_30.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField_31.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField_32.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField_33.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField_34.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField_35.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField_36.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField_37.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField_38.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField_39.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField_40.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField_41.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField_42.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField_43.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField_44.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField_45.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField_46.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField_47.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField_48.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField_49.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField_50.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField_51.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField_52.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField_53.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		//addPanel();
		//ultimatePanel();
//		buttonPanel.setLayout(null);
//
//		buttonPanel.add(createbutton);
//		buttonPanel.add(retrievebutton);
//		frame.getContentPane().add(buttonPanel);

		frame.setLocation(600, 200);
		frame.setSize(1000, 1280);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	/** 
	 * 
	 * 
	 */
	
	public void addPanel() {
		
		ink2rList.add(panel);
		ink2rList.add(panel_1);
		ink2rList.add(panel_2);
		ink2rList.add(panel_3);
		ink2rList.add(panel_4);
		ink2rList.add(panel_5);
		ink2rList.add(panel_6);
		ink2rList.add(panel_7);
		ink2rList.add(panel_8);
		ink2rList.add(panel_9);
		ink2rList.add(panel_10);
		ink2rList.add(panel_11);
		ink2rList.add(panel_12);
		ink2rList.add(panel_13);
		ink2rList.add(panel_14);
		ink2rList.add(panel_15);
		ink2rList.add(panel_16);
		ink2rList.add(panel_17);
		ink2rList.add(panel_18);
		ink2rList.add(panel_19);
		ink2rList.add(panel_20);
		ink2rList.add(panel_21);
		ink2rList.add(panel_22);
		ink2rList.add(panel_23);
		ink2rList.add(panel_24);
		ink2rList.add(panel_25);
		ink2rList.add(panel_26);
		ink2rList.add(panel_27);
		ink2rList.add(panel_28);
		ink2rList.add(panel_29);
		ink2rList.add(panel_30);
		ink2rList.add(panel_31);
		ink2rList.add(panel_32);
		ink2rList.add(panel_33);
		ink2rList.add(panel_34);
		ink2rList.add(panel_35);
		ink2rList.add(panel_36);
		ink2rList.add(panel_37);
		ink2rList.add(panel_38);
		ink2rList.add(panel_39);
		ink2rList.add(panel_40);
		ink2rList.add(panel_41);
		ink2rList.add(panel_42);
		ink2rList.add(panel_43);
		ink2rList.add(panel_44);
		ink2rList.add(panel_45);
		ink2rList.add(panel_46);
		ink2rList.add(panel_47);
		ink2rList.add(panel_48);
		ink2rList.add(panel_49);	
	}
	
	public void ultimatePanel() {
		
		for(int i = 0; i <ink2rList.size(); i++)
		{
			scrollPane.add(ink2rList.get(i));
			ink2rList.get(i).setBorder(BorderFactory.createLineBorder(Color.BLACK));
			ink2rList.get(i).setBackground(Color.WHITE);
			ink2rList.get(i).setLayout(null);
			
		}
		
	}
	
	/** 
	 * Skapar och l�gger in alla paneler, etiketter och textf�lt och l�gger in de i GUI.
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
}