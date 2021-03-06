package se.hig.cn.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.border.BevelBorder;

import se.hig.cn.control.CreateFilesListener;
import se.hig.cn.control.GetFilesListener;
import se.hig.cn.control.ShowFilesListener;
import se.hig.cn.control.TextFieldController;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.BorderFactory;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;

/**
 * Skapar innehållet och visar upp det grafiska användargränssnittet för
 * programmet.
 * 
 * @author Christian Olsson, Nicolas Suau Carvajal
 * @version 2017-11-14
 */
public class GUI {

	private ArrayList<JTextField> numericAList = new ArrayList<>();
	private ArrayList<JTextField> numericBList = new ArrayList<>();
	private ArrayList<JTextField> fieldList = new ArrayList<>();
	private ArrayList<JTextField> personuppgiftsList = new ArrayList<>();
	private JFrame frame;
	private JTextField textField_tom;
	private JTextField textField_Datframst;
	private JTextField textField_PersOrgnr;
	private JTextField textField_fom;
	private JTextField textField2_1;
	private JTextField textField2_2;
	private JTextField textField2_3;
	private JTextField textField2_4;
	private JTextField textField2_5;
	private JTextField textField2_6;
	private JTextField textField2_7;
	private JTextField textField2_8;
	private JTextField textField2_9;
	private JTextField textField2_10;
	private JTextField textField2_11;
	private JTextField textField2_12;
	private JTextField textField2_16;
	private JTextField textField2_13;
	private JTextField textField2_14;
	private JTextField textField2_15;
	private JTextField textField2_17;
	private JTextField textField2_19;
	private JTextField textField2_22;
	private JTextField textField2_23;
	private JTextField textField2_18;
	private JTextField textField2_20;
	private JTextField textField2_21;
	private JTextField textField2_24;
	private JTextField textField2_25;
	private JTextField textField2_26;
	private JTextField textField2_27;
	private JTextField textField2_28;
	private JTextField textField2_29;
	private JTextField textField2_30;
	private JTextField textField2_31;
	private JTextField textField2_32;
	private JTextField textField2_33;
	private JTextField textField2_34;
	private JTextField textField2_35;
	private JTextField textField2_36;
	private JTextField textField2_37;
	private JTextField textField2_43;
	private JTextField textField2_40;
	private JTextField textField2_41;
	private JTextField textField2_42;
	private JTextField textField2_44;
	private JTextField textField2_46;
	private JTextField textField2_49;
	private JTextField textField2_50;
	private JTextField textField2_45;
	private JTextField textField2_47;
	private JTextField textField2_48;
	private JTextField textField2_38;
	private JTextField textField2_39;
	private JTextField textField3_1;
	private JTextField textField3_2;
	private JTextField textField3_3;
	private JTextField textField3_4;
	private JTextField textField3_5;
	private JTextField textField3_7;
	private JTextField textField3_10;
	private JTextField textField3_12;
	private JTextField textField3_12_2;
	private JTextField textField3_13;
	private JTextField textField3_14_2;
	private JTextField textField3_15;
	private JTextField textField3_16;
	private JTextField textField3_18;
	private JTextField textField3_20;
	private JTextField textField3_23;
	private JTextField textField3_19;
	private JTextField textField3_21;
	private JTextField textField3_22;
	private JTextField textField3_13_2;
	private JTextField textField3_14;

	JPanel panel, panel_1, panel_2, panel_3;
	private JTextField textField3_2_2;
	private JTextField textField3_6;
	private JTextField textField3_8;
	private JTextField textField3_9;
	private JTextField textField3_11;
	private JTextField textField3_17;
	private JTextField textField3_24_2;
	private JTextField textField3_24;
	private JTextField textField3_25_2;
	private JTextField textField3_25;
	private JTextField textField3_26;
	private JTextField textField3_27;
	private JTextField textField3_28;
	private JTextField txtRkernskapsr;
	private JTextField textField_fax;
	private JTextField textField_telefon;
	private JTextField textField_email;
	private JTextField textField_kontakt;
	private JTextField textField_postort;
	private JTextField textField_postnummer;
	private JTextField textField_adress;
	private JTextField textField_namn;
	private JTextField textField_avdelning;
	private JMenuBar menubar;
	private JMenu menu;
	private JMenuItem createFilesItem;
	private JMenuItem showFilesItem;
	private JMenuItem getFilesItem;
	private JMenuItem submitFilesItem;
	private JMenuItem helpItem;
	private JComboBox<String> comboBox;
	private String period = "";

	private CreateFilesListener createFilesListener = new CreateFilesListener();
	private GetFilesListener getFilesListener = new GetFilesListener();
	private TextFieldController textcontroller = new TextFieldController();

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.YELLOW);

		frame.getContentPane().setName("7202");
		frame.setBounds(100, 160, 799, 975);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel orgPanel = new JPanel();
		orgPanel.setBackground(Color.WHITE);
		orgPanel.setBounds(0, 0, 793, 159);
		orgPanel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frame.getContentPane().add(orgPanel);
		orgPanel.setLayout(null);

		menubar = new JMenuBar();
		menu = new JMenu("Meny");
		createFilesItem = new JMenuItem("Skapa filer");
		showFilesItem = new JMenuItem("Visa filer");
		getFilesItem = new JMenuItem("Hämta filer");
		submitFilesItem = new JMenuItem("Lämna in filer till Skatteverket");
		helpItem = new JMenuItem("Hjälp");

		orgPanel.add(menubar);
		menubar.setBounds(0, 0, 40, 20);
		menubar.add(menu);
		menu.add(createFilesItem);
		menu.add(showFilesItem);
		menu.add(getFilesItem);
		menu.add(submitFilesItem);
		menu.add(helpItem);

		textField_tom = new JTextField();
		textField_tom.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_tom.setBackground(Color.WHITE);
		textField_tom.setColumns(10);
		textField_tom.setBounds(240, 102, 113, 30);
		orgPanel.add(textField_tom);

		JLabel lblTom = new JLabel("T.o.m.");
		lblTom.setHorizontalAlignment(SwingConstants.LEFT);
		lblTom.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTom.setBounds(242, 88, 89, 14);
		orgPanel.add(lblTom);

		textField_Datframst = new JTextField();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
		Date date = new Date();
		textField_Datframst.setText(simpleDateFormat.format(date));
		textField_Datframst.setColumns(10);
		textField_Datframst.setBounds(551, 102, 190, 30);
		orgPanel.add(textField_Datframst);

		JLabel lblDatumNrBlanketen = new JLabel("Datum när blanketten fylls i");
		lblDatumNrBlanketen.setHorizontalAlignment(SwingConstants.LEFT);
		lblDatumNrBlanketen.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDatumNrBlanketen.setBounds(551, 88, 165, 14);
		orgPanel.add(lblDatumNrBlanketen);

		JLabel label_18 = new JLabel("Organisationsnummer");
		label_18.setHorizontalAlignment(SwingConstants.LEFT);
		label_18.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_18.setBounds(365, 88, 158, 14);
		orgPanel.add(label_18);

		textField_PersOrgnr = new JTextField();
		textField_PersOrgnr.setColumns(10);
		textField_PersOrgnr.setBounds(365, 102, 187, 30);
		orgPanel.add(textField_PersOrgnr);

		textField_fom = new JTextField();
		textField_fom.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_fom.setBackground(Color.WHITE);
		textField_fom.setColumns(10);
		textField_fom.setBounds(116, 102, 125, 30);
		orgPanel.add(textField_fom);

		JLabel lblFom = new JLabel("F.o.m.");
		lblFom.setHorizontalAlignment(SwingConstants.LEFT);
		lblFom.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblFom.setBounds(118, 88, 89, 14);
		orgPanel.add(lblFom);

		JLabel label_69 = new JLabel("Räkenskapsschema");
		label_69.setFont(new Font("Tahoma", Font.BOLD, 24));
		label_69.setBounds(365, 25, 232, 29);
		orgPanel.add(label_69);

		JLabel label_94 = new JLabel("INK2R");
		label_94.setFont(new Font("Tahoma", Font.BOLD, 24));
		label_94.setBounds(653, 12, 84, 42);
		orgPanel.add(label_94);

		JLabel label_123 = new JLabel("Inkomstdeklaration 2");
		label_123.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_123.setBounds(365, 65, 176, 20);
		orgPanel.add(label_123);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("H:\\workspace\\SRU2\\SkatteverketLogo.png"));
		lblNewLabel.setBounds(10, 11, 370, 80);
		orgPanel.add(lblNewLabel);

		txtRkernskapsr = new JTextField();
		txtRkernskapsr.setText("Räkenskapsår");
		txtRkernskapsr.setEditable(false);
		txtRkernskapsr.setColumns(10);
		txtRkernskapsr.setBackground(Color.WHITE);
		txtRkernskapsr.setBounds(7, 102, 109, 30);
		orgPanel.add(txtRkernskapsr);
		
		comboBox = new JComboBox<>();
		comboBox.setModel(new DefaultComboBoxModel(new String[]{"Välj period", "P1", "P2", "P3", "P4"}));
		comboBox.setBounds(17, 135, 90, 20);
		orgPanel.add(comboBox);

		JPanel firstPage = new JPanel();
		firstPage.setBounds(10, 160, 762, 690);
		frame.getContentPane().add(firstPage);
		firstPage.setLayout(new CardLayout(0, 0));

		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		firstPage.add(panel, "name_1271288328627825");

		JSeparator separator_28 = new JSeparator();
		separator_28.setBackground(Color.BLACK);
		separator_28.setOrientation(SwingConstants.VERTICAL);
		separator_28.setBounds(217, 29, 4, 623);
		panel.add(separator_28);

		JLabel label_27 = new JLabel("2.1");
		label_27.setHorizontalAlignment(SwingConstants.LEFT);
		label_27.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_27.setBounds(5, 47, 25, 14);
		panel.add(label_27);

		textField2_1 = new JTextField();
		textField2_1.setName("7201");
		textField2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField2_1.setColumns(10);
		textField2_1.setBounds(231, 47, 126, 25);
		panel.add(textField2_1);

		JSeparator separator_29 = new JSeparator();
		separator_29.setBackground(Color.BLACK);
		separator_29.setBounds(0, 95, 367, 6);
		panel.add(separator_29);

		JLabel label_28 = new JLabel("Immateriella anläggningstillgångar");
		label_28.setHorizontalAlignment(SwingConstants.LEFT);
		label_28.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_28.setBounds(5, 31, 207, 14);
		panel.add(label_28);

		JLabel label_29 = new JLabel("2.2");
		label_29.setHorizontalAlignment(SwingConstants.LEFT);
		label_29.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_29.setBounds(5, 107, 25, 14);
		panel.add(label_29);

		textField2_2 = new JTextField();
		textField2_2.setName("7202");
		textField2_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField2_2.setColumns(10);
		textField2_2.setBounds(231, 109, 126, 25);
		panel.add(textField2_2);

		JLabel label_30 = new JLabel("2.3");
		label_30.setHorizontalAlignment(SwingConstants.LEFT);
		label_30.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_30.setBounds(5, 176, 25, 14);
		panel.add(label_30);

		textField2_3 = new JTextField();
		textField2_3.setName("7214");
		textField2_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField2_3.setColumns(10);
		textField2_3.setBounds(231, 161, 126, 25);
		panel.add(textField2_3);

		JTextArea textArea_12 = new JTextArea();
		textArea_12.setEditable(false);
		textArea_12.setText(
				"Koncessioner, patent, licenser,\r\nvarumärken, hyresrätter, goodwill\r\noch liknande rättigheter");
		textArea_12.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textArea_12.setBackground(Color.WHITE);
		textArea_12.setBounds(36, 47, 171, 50);
		panel.add(textArea_12);

		JTextArea textArea_13 = new JTextArea();
		textArea_13.setEditable(false);
		textArea_13.setText("Förskott avseende immateriella\r\nanläggningstillgångar");
		textArea_13.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textArea_13.setBackground(Color.WHITE);
		textArea_13.setBounds(36, 107, 171, 32);
		panel.add(textArea_13);

		JSeparator separator_30 = new JSeparator();
		separator_30.setBackground(Color.BLACK);
		separator_30.setBounds(0, 151, 367, 2);
		panel.add(separator_30);

		JLabel label_31 = new JLabel("Materiella anläggningstillgångar");
		label_31.setHorizontalAlignment(SwingConstants.LEFT);
		label_31.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_31.setBounds(5, 155, 207, 14);
		panel.add(label_31);

		JTextArea textArea_14 = new JTextArea();
		textArea_14.setEditable(false);
		textArea_14.setText("Byggnader och mark");
		textArea_14.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textArea_14.setBackground(Color.WHITE);
		textArea_14.setBounds(36, 176, 171, 23);
		panel.add(textArea_14);

		JSeparator separator_31 = new JSeparator();
		separator_31.setBackground(Color.BLACK);
		separator_31.setBounds(0, 201, 367, 2);
		panel.add(separator_31);

		JTextArea textArea_15 = new JTextArea();
		textArea_15.setEditable(false);
		textArea_15.setText("Maskiner, inventarier och övriga\r\nmateriella anläggningstillgångar");
		textArea_15.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textArea_15.setBackground(Color.WHITE);
		textArea_15.setBounds(36, 209, 171, 32);
		panel.add(textArea_15);

		JLabel label_32 = new JLabel("2.4");
		label_32.setHorizontalAlignment(SwingConstants.LEFT);
		label_32.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_32.setBounds(5, 209, 25, 14);
		panel.add(label_32);

		textField2_4 = new JTextField();
		textField2_4.setName("7215");
		textField2_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField2_4.setColumns(10);
		textField2_4.setBounds(231, 209, 126, 25);
		panel.add(textField2_4);

		JTextArea textArea_16 = new JTextArea();
		textArea_16.setEditable(false);
		textArea_16.setText("Förbättringsutgifter på annans \r\nfastighet");
		textArea_16.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textArea_16.setBackground(Color.WHITE);
		textArea_16.setBounds(36, 260, 171, 32);
		panel.add(textArea_16);

		JLabel label_33 = new JLabel("2.5");
		label_33.setHorizontalAlignment(SwingConstants.LEFT);
		label_33.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_33.setBounds(5, 260, 25, 14);
		panel.add(label_33);

		textField2_5 = new JTextField();
		textField2_5.setName("7216");
		textField2_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField2_5.setColumns(10);
		textField2_5.setBounds(231, 260, 126, 25);
		panel.add(textField2_5);

		JSeparator separator_32 = new JSeparator();
		separator_32.setBackground(Color.BLACK);
		separator_32.setBounds(0, 248, 367, 2);
		panel.add(separator_32);

		JSeparator separator_33 = new JSeparator();
		separator_33.setBackground(Color.BLACK);
		separator_33.setBounds(0, 299, 367, 2);
		panel.add(separator_33);

		JTextArea textArea_17 = new JTextArea();
		textArea_17.setEditable(false);
		textArea_17.setText("Pågående nyanläggningar och \r\nförskott avseende materiella \r\nanläggningstillgångar");
		textArea_17.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textArea_17.setBackground(Color.WHITE);
		textArea_17.setBounds(36, 303, 171, 48);
		panel.add(textArea_17);

		JLabel label_34 = new JLabel("2.6");
		label_34.setHorizontalAlignment(SwingConstants.LEFT);
		label_34.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_34.setBounds(5, 303, 25, 14);
		panel.add(label_34);

		textField2_6 = new JTextField();
		textField2_6.setName("7217");
		textField2_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField2_6.setColumns(10);
		textField2_6.setBounds(231, 319, 126, 25);
		panel.add(textField2_6);

		JSeparator separator_34 = new JSeparator();
		separator_34.setBackground(Color.BLACK);
		separator_34.setBounds(0, 357, 367, 2);
		panel.add(separator_34);

		JLabel label_35 = new JLabel("Finansiella anläggningstillgångar");
		label_35.setHorizontalAlignment(SwingConstants.LEFT);
		label_35.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_35.setBounds(5, 361, 207, 14);
		panel.add(label_35);

		JTextArea textArea_18 = new JTextArea();
		textArea_18.setEditable(false);
		textArea_18.setText("Andelar i koncernföretag");
		textArea_18.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textArea_18.setBackground(Color.WHITE);
		textArea_18.setBounds(36, 383, 171, 22);
		panel.add(textArea_18);

		JLabel label_36 = new JLabel("2.7");
		label_36.setHorizontalAlignment(SwingConstants.LEFT);
		label_36.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_36.setBounds(5, 383, 25, 14);
		panel.add(label_36);

		textField2_7 = new JTextField();
		textField2_7.setName("7230");
		textField2_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField2_7.setColumns(10);
		textField2_7.setBounds(231, 371, 126, 25);
		panel.add(textField2_7);

		JSeparator separator_35 = new JSeparator();
		separator_35.setBackground(Color.BLACK);
		separator_35.setBounds(0, 411, 367, 2);
		panel.add(separator_35);

		JTextArea textArea_19 = new JTextArea();
		textArea_19.setEditable(false);
		textArea_19.setText("Andelar i intresseföretag");
		textArea_19.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textArea_19.setBackground(Color.WHITE);
		textArea_19.setBounds(36, 422, 171, 20);
		panel.add(textArea_19);

		JLabel label_37 = new JLabel("2.8");
		label_37.setHorizontalAlignment(SwingConstants.LEFT);
		label_37.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_37.setBounds(5, 422, 25, 14);
		panel.add(label_37);

		textField2_8 = new JTextField();
		textField2_8.setName("7231");
		textField2_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField2_8.setColumns(10);
		textField2_8.setBounds(231, 420, 126, 25);
		panel.add(textField2_8);

		JSeparator separator_36 = new JSeparator();
		separator_36.setBackground(Color.BLACK);
		separator_36.setBounds(0, 453, 367, 2);
		panel.add(separator_36);

		JTextArea textArea_20 = new JTextArea();
		textArea_20.setEditable(false);
		textArea_20.setText("Fordringar hos koncern- och\r\nintresseföretag");
		textArea_20.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textArea_20.setBackground(Color.WHITE);
		textArea_20.setBounds(36, 463, 171, 32);
		panel.add(textArea_20);

		JLabel label_38 = new JLabel("2.9");
		label_38.setHorizontalAlignment(SwingConstants.LEFT);
		label_38.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_38.setBounds(5, 463, 25, 14);
		panel.add(label_38);

		textField2_9 = new JTextField();
		textField2_9.setName("7232");
		textField2_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField2_9.setColumns(10);
		textField2_9.setBounds(231, 469, 126, 25);
		panel.add(textField2_9);

		JSeparator separator_37 = new JSeparator();
		separator_37.setBackground(Color.BLACK);
		separator_37.setBounds(0, 502, 367, 2);
		panel.add(separator_37);

		JTextArea textArea_21 = new JTextArea();
		textArea_21.setEditable(false);
		textArea_21.setText("Andra långfristiga värde-\r\npappersinnehav");
		textArea_21.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textArea_21.setBackground(Color.WHITE);
		textArea_21.setBounds(36, 505, 161, 32);
		panel.add(textArea_21);

		JLabel label_39 = new JLabel("2.10");
		label_39.setHorizontalAlignment(SwingConstants.LEFT);
		label_39.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_39.setBounds(5, 506, 35, 14);
		panel.add(label_39);

		textField2_10 = new JTextField();
		textField2_10.setName("7233");
		textField2_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField2_10.setColumns(10);
		textField2_10.setBounds(231, 512, 126, 25);
		panel.add(textField2_10);

		JSeparator separator_38 = new JSeparator();
		separator_38.setBackground(Color.BLACK);
		separator_38.setBounds(0, 548, 367, 2);
		panel.add(separator_38);

		JTextArea textArea_22 = new JTextArea();
		textArea_22.setEditable(false);
		textArea_22.setText("Lån till delägare eller närstånde");
		textArea_22.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textArea_22.setBackground(Color.WHITE);
		textArea_22.setBounds(36, 554, 161, 32);
		panel.add(textArea_22);

		JLabel label_40 = new JLabel("2.11");
		label_40.setHorizontalAlignment(SwingConstants.LEFT);
		label_40.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_40.setBounds(5, 555, 35, 14);
		panel.add(label_40);

		textField2_11 = new JTextField();
		textField2_11.setName("7234");
		textField2_11.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField2_11.setColumns(10);
		textField2_11.setBounds(231, 561, 126, 25);
		panel.add(textField2_11);

		JSeparator separator_39 = new JSeparator();
		separator_39.setBackground(Color.BLACK);
		separator_39.setBounds(0, 597, 367, 2);
		panel.add(separator_39);

		JLabel label_41 = new JLabel("2.12");
		label_41.setHorizontalAlignment(SwingConstants.LEFT);
		label_41.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_41.setBounds(5, 612, 35, 14);
		panel.add(label_41);

		JTextArea textArea_23 = new JTextArea();
		textArea_23.setEditable(false);
		textArea_23.setText("Andra långfristiga fordringar\r\n");
		textArea_23.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textArea_23.setBackground(new Color(255, 255, 255));
		textArea_23.setBounds(36, 611, 161, 23);
		panel.add(textArea_23);

		textField2_12 = new JTextField();
		textField2_12.setName("7235");
		textField2_12.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField2_12.setColumns(10);
		textField2_12.setBounds(231, 610, 126, 25);
		panel.add(textField2_12);

		JLabel lblTillgngaranlggningstillgngar = new JLabel("Tillgångar/Anläggningstillgångar");
		lblTillgngaranlggningstillgngar.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTillgngaranlggningstillgngar.setBounds(5, 5, 360, 22);
		panel.add(lblTillgngaranlggningstillgngar);

		textField2_16 = new JTextField();
		textField2_16.setName("7244");
		textField2_16.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField2_16.setColumns(10);
		textField2_16.setBounds(615, 159, 126, 25);
		panel.add(textField2_16);

		JLabel label_43 = new JLabel("Varulager");
		label_43.setHorizontalAlignment(SwingConstants.LEFT);
		label_43.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_43.setBounds(376, 31, 207, 14);
		panel.add(label_43);

		JLabel label_44 = new JLabel("Omsättningstillgångar");
		label_44.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_44.setBounds(367, 5, 360, 22);
		panel.add(label_44);

		textField2_13 = new JTextField();
		textField2_13.setName("7241");
		textField2_13.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField2_13.setColumns(10);
		textField2_13.setBounds(615, 47, 126, 25);
		panel.add(textField2_13);

		JTextArea textArea_24 = new JTextArea();
		textArea_24.setEditable(false);
		textArea_24.setText("Råvaror och förnödenheter");
		textArea_24.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textArea_24.setBackground(Color.WHITE);
		textArea_24.setBounds(415, 47, 152, 14);
		panel.add(textArea_24);

		JLabel label_45 = new JLabel("2.13");
		label_45.setHorizontalAlignment(SwingConstants.LEFT);
		label_45.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_45.setBounds(376, 47, 35, 14);
		panel.add(label_45);

		JLabel label_46 = new JLabel("2.14");
		label_46.setHorizontalAlignment(SwingConstants.LEFT);
		label_46.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_46.setBounds(376, 85, 35, 14);
		panel.add(label_46);

		JTextArea textArea_25 = new JTextArea();
		textArea_25.setEditable(false);
		textArea_25.setText("Varor under tillverkning");
		textArea_25.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textArea_25.setBackground(Color.WHITE);
		textArea_25.setBounds(415, 85, 152, 15);
		panel.add(textArea_25);

		textField2_14 = new JTextField();
		textField2_14.setName("7242");
		textField2_14.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField2_14.setColumns(10);
		textField2_14.setBounds(615, 85, 126, 25);
		panel.add(textField2_14);

		textField2_15 = new JTextField();
		textField2_15.setName("7243");
		textField2_15.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField2_15.setColumns(10);
		textField2_15.setBounds(615, 122, 126, 25);
		panel.add(textField2_15);

		JTextArea txtrFrdigaVarorOch = new JTextArea();
		txtrFrdigaVarorOch.setEditable(false);
		txtrFrdigaVarorOch.setText("Färdiga varor och handelsvaror");
		txtrFrdigaVarorOch.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrFrdigaVarorOch.setBackground(Color.WHITE);
		txtrFrdigaVarorOch.setBounds(415, 124, 152, 23);
		panel.add(txtrFrdigaVarorOch);

		JLabel label_47 = new JLabel("2.15");
		label_47.setHorizontalAlignment(SwingConstants.LEFT);
		label_47.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_47.setBounds(376, 124, 35, 14);
		panel.add(label_47);

		JTextArea txtrvrigaLagertillgngar = new JTextArea();
		txtrvrigaLagertillgngar.setEditable(false);
		txtrvrigaLagertillgngar.setText("Övriga lagertillgångar");
		txtrvrigaLagertillgngar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrvrigaLagertillgngar.setBackground(Color.WHITE);
		txtrvrigaLagertillgngar.setBounds(415, 161, 152, 23);
		panel.add(txtrvrigaLagertillgngar);

		JLabel label_48 = new JLabel("2.16");
		label_48.setHorizontalAlignment(SwingConstants.LEFT);
		label_48.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_48.setBounds(376, 161, 38, 14);
		panel.add(label_48);

		JSeparator separator_42 = new JSeparator();
		separator_42.setBackground(Color.BLACK);
		separator_42.setOrientation(SwingConstants.VERTICAL);
		separator_42.setBounds(597, 29, 13, 623);
		panel.add(separator_42);

		JSeparator separator_43 = new JSeparator();
		separator_43.setBackground(Color.BLACK);
		separator_43.setBounds(367, 151, 393, 6);
		panel.add(separator_43);

		textField2_17 = new JTextField();
		textField2_17.setName("7245");
		textField2_17.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField2_17.setColumns(10);
		textField2_17.setBounds(615, 201, 126, 25);
		panel.add(textField2_17);

		JTextArea txtrPgendeArbetenFr = new JTextArea();
		txtrPgendeArbetenFr.setEditable(false);
		txtrPgendeArbetenFr.setText("Pågående arbeten för annans \r\nräkning\r\n");
		txtrPgendeArbetenFr.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrPgendeArbetenFr.setBackground(Color.WHITE);
		txtrPgendeArbetenFr.setBounds(415, 201, 157, 32);
		panel.add(txtrPgendeArbetenFr);

		JLabel label_49 = new JLabel("2.17");
		label_49.setHorizontalAlignment(SwingConstants.LEFT);
		label_49.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_49.setBounds(376, 201, 35, 14);
		panel.add(label_49);

		JSeparator separator_45 = new JSeparator();
		separator_45.setBackground(Color.BLACK);
		separator_45.setBounds(368, 237, 395, 2);
		panel.add(separator_45);

		textField2_19 = new JTextField();
		textField2_19.setName("7251");
		textField2_19.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField2_19.setColumns(10);
		textField2_19.setBounds(615, 285, 126, 25);
		panel.add(textField2_19);

		JTextArea txtrKundfordringar = new JTextArea();
		txtrKundfordringar.setEditable(false);
		txtrKundfordringar.setText("Kundfordringar");
		txtrKundfordringar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrKundfordringar.setBackground(Color.WHITE);
		txtrKundfordringar.setBounds(415, 294, 159, 16);
		panel.add(txtrKundfordringar);

		JLabel lblKortfristigaFordringar = new JLabel("Kortfristiga fordringar");
		lblKortfristigaFordringar.setHorizontalAlignment(SwingConstants.LEFT);
		lblKortfristigaFordringar.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblKortfristigaFordringar.setBounds(376, 280, 207, 14);
		panel.add(lblKortfristigaFordringar);

		JLabel label_52 = new JLabel("2.19");
		label_52.setHorizontalAlignment(SwingConstants.LEFT);
		label_52.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_52.setBounds(376, 295, 35, 14);
		panel.add(label_52);

		JLabel label_53 = new JLabel("2.22");
		label_53.setHorizontalAlignment(SwingConstants.LEFT);
		label_53.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_53.setBounds(376, 405, 37, 14);
		panel.add(label_53);

		JTextArea txtrUpparbetadMenEj = new JTextArea();
		txtrUpparbetadMenEj.setEditable(false);
		txtrUpparbetadMenEj.setText("Upparbetad men ej fakturerad\r\nintäkt");
		txtrUpparbetadMenEj.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrUpparbetadMenEj.setBackground(Color.WHITE);
		txtrUpparbetadMenEj.setBounds(415, 400, 150, 35);
		panel.add(txtrUpparbetadMenEj);

		textField2_22 = new JTextField();
		textField2_22.setName("7262");
		textField2_22.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField2_22.setColumns(10);
		textField2_22.setBounds(615, 402, 126, 25);
		panel.add(textField2_22);

		textField2_23 = new JTextField();
		textField2_23.setName("7263");
		textField2_23.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField2_23.setColumns(10);
		textField2_23.setBounds(615, 445, 125, 25);
		panel.add(textField2_23);

		JTextArea txtrFrutbetaldaKostnaderOch = new JTextArea();
		txtrFrutbetaldaKostnaderOch.setEditable(false);
		txtrFrutbetaldaKostnaderOch.setText("Förutbetalda kostnader och \r\nupplupna intäkter");
		txtrFrutbetaldaKostnaderOch.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrFrutbetaldaKostnaderOch.setBackground(Color.WHITE);
		txtrFrutbetaldaKostnaderOch.setBounds(415, 445, 171, 32);
		panel.add(txtrFrutbetaldaKostnaderOch);

		JSeparator separator_48 = new JSeparator();
		separator_48.setBackground(Color.BLACK);
		separator_48.setBounds(368, 437, 395, 2);
		panel.add(separator_48);

		JLabel label_54 = new JLabel("2.23");
		label_54.setHorizontalAlignment(SwingConstants.LEFT);
		label_54.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_54.setBounds(376, 450, 35, 14);
		panel.add(label_54);

		JSeparator separator_52 = new JSeparator();
		separator_52.setBackground(Color.BLACK);
		separator_52.setBounds(368, 115, 393, 2);
		panel.add(separator_52);

		JSeparator separator_53 = new JSeparator();
		separator_53.setBackground(Color.BLACK);
		separator_53.setBounds(368, 78, 393, 2);
		panel.add(separator_53);

		JSeparator separator_54 = new JSeparator();
		separator_54.setBackground(Color.BLACK);
		separator_54.setOrientation(SwingConstants.VERTICAL);
		separator_54.setBounds(367, 29, 9, 623);
		panel.add(separator_54);

		JSeparator separator_41 = new JSeparator();
		separator_41.setBackground(Color.BLACK);
		separator_41.setBounds(367, 188, 395, 11);
		panel.add(separator_41);

		JTextArea txtrFrskotTillLeverantrer = new JTextArea();
		txtrFrskotTillLeverantrer.setEditable(false);
		txtrFrskotTillLeverantrer.setText("Förskott till leverantörer");
		txtrFrskotTillLeverantrer.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrFrskotTillLeverantrer.setBackground(Color.WHITE);
		txtrFrskotTillLeverantrer.setBounds(415, 250, 157, 14);
		panel.add(txtrFrskotTillLeverantrer);

		JLabel label_63 = new JLabel("2.18");
		label_63.setHorizontalAlignment(SwingConstants.LEFT);
		label_63.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_63.setBounds(376, 250, 35, 14);
		panel.add(label_63);

		textField2_18 = new JTextField();
		textField2_18.setName("7246");
		textField2_18.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField2_18.setColumns(10);
		textField2_18.setBounds(615, 245, 126, 25);
		panel.add(textField2_18);

		JSeparator separator_44 = new JSeparator();
		separator_44.setBackground(Color.BLACK);
		separator_44.setBounds(368, 275, 395, 2);
		panel.add(separator_44);

		JSeparator separator_55 = new JSeparator();
		separator_55.setBackground(Color.BLACK);
		separator_55.setBounds(368, 319, 395, 2);
		panel.add(separator_55);

		JLabel label_50 = new JLabel("2.20");
		label_50.setHorizontalAlignment(SwingConstants.LEFT);
		label_50.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_50.setBounds(376, 332, 35, 14);
		panel.add(label_50);

		JTextArea txtrFordringarHosKoncern = new JTextArea();
		txtrFordringarHosKoncern.setEditable(false);
		txtrFordringarHosKoncern.setText("Fordringar hos koncern- och\r\nintresseföretag");
		txtrFordringarHosKoncern.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrFordringarHosKoncern.setBackground(Color.WHITE);
		txtrFordringarHosKoncern.setBounds(415, 320, 155, 30);
		panel.add(txtrFordringarHosKoncern);

		textField2_20 = new JTextField();
		textField2_20.setName("7252");
		textField2_20.setBackground(Color.WHITE);
		textField2_20.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField2_20.setColumns(10);
		textField2_20.setBounds(615, 327, 126, 25);
		panel.add(textField2_20);

		JSeparator separator_56 = new JSeparator();
		separator_56.setBackground(Color.BLACK);
		separator_56.setBounds(368, 357, 395, 2);
		panel.add(separator_56);

		JTextArea txtrvrigaFordringar = new JTextArea();
		txtrvrigaFordringar.setEditable(false);
		txtrvrigaFordringar.setText("Övriga fordringar");
		txtrvrigaFordringar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrvrigaFordringar.setBackground(Color.WHITE);
		txtrvrigaFordringar.setBounds(415, 370, 155, 20);
		panel.add(txtrvrigaFordringar);

		JLabel label_51 = new JLabel("2.21");
		label_51.setHorizontalAlignment(SwingConstants.LEFT);
		label_51.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_51.setBounds(376, 370, 35, 14);
		panel.add(label_51);

		JSeparator separator_46 = new JSeparator();
		separator_46.setBackground(Color.BLACK);
		separator_46.setBounds(368, 395, 395, 2);
		panel.add(separator_46);

		textField2_21 = new JTextField();
		textField2_21.setName("7261");
		textField2_21.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField2_21.setColumns(10);
		textField2_21.setBounds(616, 365, 126, 25);
		panel.add(textField2_21);

		JSeparator separator_47 = new JSeparator();
		separator_47.setBackground(Color.BLACK);
		separator_47.setBounds(368, 481, 395, 2);
		panel.add(separator_47);

		textField2_24 = new JTextField();
		textField2_24.setName("7270");
		textField2_24.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField2_24.setColumns(10);
		textField2_24.setBounds(615, 490, 126, 25);
		panel.add(textField2_24);

		JLabel lblKortfristigaPlaceringar = new JLabel("Kortfristiga placeringar");
		lblKortfristigaPlaceringar.setHorizontalAlignment(SwingConstants.LEFT);
		lblKortfristigaPlaceringar.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblKortfristigaPlaceringar.setBounds(376, 485, 188, 14);
		panel.add(lblKortfristigaPlaceringar);

		JTextArea txtrAndelarIKoncernfretag = new JTextArea();
		txtrAndelarIKoncernfretag.setEditable(false);
		txtrAndelarIKoncernfretag.setText("Andelar i koncernföretag");
		txtrAndelarIKoncernfretag.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrAndelarIKoncernfretag.setBackground(Color.WHITE);
		txtrAndelarIKoncernfretag.setBounds(415, 504, 159, 16);
		panel.add(txtrAndelarIKoncernfretag);

		JLabel label_64 = new JLabel("2.24");
		label_64.setHorizontalAlignment(SwingConstants.LEFT);
		label_64.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_64.setBounds(376, 505, 35, 14);
		panel.add(label_64);

		JSeparator separator_49 = new JSeparator();
		separator_49.setBackground(Color.BLACK);
		separator_49.setBounds(368, 525, 395, 2);
		panel.add(separator_49);

		JSeparator separator_50 = new JSeparator();
		separator_50.setBackground(Color.BLACK);
		separator_50.setBounds(368, 561, 395, 2);
		panel.add(separator_50);

		textField2_25 = new JTextField();
		textField2_25.setName("7271");
		textField2_25.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField2_25.setColumns(10);
		textField2_25.setBounds(616, 531, 126, 25);
		panel.add(textField2_25);

		JTextArea txtrvrigaKortfristigaPlaceringar = new JTextArea();
		txtrvrigaKortfristigaPlaceringar.setEditable(false);
		txtrvrigaKortfristigaPlaceringar.setText("Övriga kortfristiga placeringar");
		txtrvrigaKortfristigaPlaceringar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrvrigaKortfristigaPlaceringar.setBackground(Color.WHITE);
		txtrvrigaKortfristigaPlaceringar.setBounds(415, 533, 155, 20);
		panel.add(txtrvrigaKortfristigaPlaceringar);

		JLabel label_55 = new JLabel("2.25");
		label_55.setHorizontalAlignment(SwingConstants.LEFT);
		label_55.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_55.setBounds(376, 536, 35, 14);
		panel.add(label_55);

		JLabel lblKassaOchBank = new JLabel("Kassa och bank");
		lblKassaOchBank.setHorizontalAlignment(SwingConstants.LEFT);
		lblKassaOchBank.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblKassaOchBank.setBounds(376, 564, 188, 14);
		panel.add(lblKassaOchBank);

		textField2_26 = new JTextField();
		textField2_26.setName("7281");
		textField2_26.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField2_26.setColumns(10);
		textField2_26.setBounds(615, 574, 126, 25);
		panel.add(textField2_26);

		JTextArea txtrKassaBankOch = new JTextArea();
		txtrKassaBankOch.setEditable(false);
		txtrKassaBankOch.setText("Kassa, bank och \r\nredovisningsmedel");
		txtrKassaBankOch.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrKassaBankOch.setBackground(Color.WHITE);
		txtrKassaBankOch.setBounds(415, 580, 159, 32);
		panel.add(txtrKassaBankOch);

		JLabel label_57 = new JLabel("2.26");
		label_57.setHorizontalAlignment(SwingConstants.LEFT);
		label_57.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_57.setBounds(376, 581, 35, 14);
		panel.add(label_57);

		JSeparator separator_51 = new JSeparator();
		separator_51.setBackground(Color.BLACK);
		separator_51.setBounds(0, 650, 765, 8);
		panel.add(separator_51);

		JButton btnPageto2 = new JButton("Nästa");
		btnPageto2.setBounds(663, 656, 89, 23);
		panel.add(btnPageto2);

		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLACK);
		separator.setBounds(0, 29, 762, 2);
		panel.add(separator);
		btnPageto2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				panel_1.setVisible(true);
				panel_2.setVisible(false);
				panel_3.setVisible(false);
			}
		});

		panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		firstPage.add(panel_1, "name_1277860912021374");

		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(Color.BLACK);
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(220, 150, 1, 305);
		panel_1.add(separator_2);

		JLabel label = new JLabel("2.27");
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		label.setBounds(5, 45, 34, 15);
		panel_1.add(label);

		textField2_27 = new JTextField();
		textField2_27.setName("7301");
		textField2_27.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField2_27.setColumns(10);
		textField2_27.setBounds(231, 40, 126, 25);
		panel_1.add(textField2_27);

		JSeparator separator_3 = new JSeparator();
		separator_3.setBackground(Color.BLACK);
		separator_3.setBounds(0, 70, 367, 6);
		panel_1.add(separator_3);

		JLabel label_2 = new JLabel("2.28");
		label_2.setHorizontalAlignment(SwingConstants.LEFT);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_2.setBounds(5, 80, 34, 14);
		panel_1.add(label_2);

		textField2_28 = new JTextField();
		textField2_28.setName("7302");
		textField2_28.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField2_28.setColumns(10);
		textField2_28.setBounds(231, 80, 126, 25);
		panel_1.add(textField2_28);

		JLabel label_3 = new JLabel("2.29");
		label_3.setHorizontalAlignment(SwingConstants.LEFT);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_3.setBounds(5, 170, 34, 15);
		panel_1.add(label_3);

		textField2_29 = new JTextField();
		textField2_29.setName("7321");
		textField2_29.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField2_29.setColumns(10);
		textField2_29.setBounds(231, 160, 126, 25);
		panel_1.add(textField2_29);

		JTextArea txtrBundetEgetKapital = new JTextArea();
		txtrBundetEgetKapital.setEditable(false);
		txtrBundetEgetKapital.setText("Bundet eget kapital");
		txtrBundetEgetKapital.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrBundetEgetKapital.setBackground(Color.WHITE);
		txtrBundetEgetKapital.setBounds(50, 45, 167, 15);
		panel_1.add(txtrBundetEgetKapital);

		JTextArea txtrFrittEgetKapita = new JTextArea();
		txtrFrittEgetKapita.setEditable(false);
		txtrFrittEgetKapita.setText("Fritt eget kapital");
		txtrFrittEgetKapita.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrFrittEgetKapita.setBackground(Color.WHITE);
		txtrFrittEgetKapita.setBounds(50, 80, 167, 15);
		panel_1.add(txtrFrittEgetKapita);

		JSeparator separator_4 = new JSeparator();
		separator_4.setBackground(Color.BLACK);
		separator_4.setBounds(0, 113, 367, 2);
		panel_1.add(separator_4);

		JLabel lblObeskattadeReserver = new JLabel("Obeskattade reserver");
		lblObeskattadeReserver.setHorizontalAlignment(SwingConstants.LEFT);
		lblObeskattadeReserver.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblObeskattadeReserver.setBounds(5, 153, 207, 14);
		panel_1.add(lblObeskattadeReserver);

		JTextArea txtrPeriodiseringsfonder = new JTextArea();
		txtrPeriodiseringsfonder.setEditable(false);
		txtrPeriodiseringsfonder.setText("Periodiseringsfonder");
		txtrPeriodiseringsfonder.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrPeriodiseringsfonder.setBackground(Color.WHITE);
		txtrPeriodiseringsfonder.setBounds(50, 170, 167, 15);
		panel_1.add(txtrPeriodiseringsfonder);

		JSeparator separator_5 = new JSeparator();
		separator_5.setBackground(Color.BLACK);
		separator_5.setBounds(0, 195, 367, 2);
		panel_1.add(separator_5);

		JTextArea txtrAckumuleradeveravskrivningar = new JTextArea();
		txtrAckumuleradeveravskrivningar.setEditable(false);
		txtrAckumuleradeveravskrivningar.setText("Ackumulerade överavskrivningar");
		txtrAckumuleradeveravskrivningar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrAckumuleradeveravskrivningar.setBackground(Color.WHITE);
		txtrAckumuleradeveravskrivningar.setBounds(50, 209, 167, 30);
		panel_1.add(txtrAckumuleradeveravskrivningar);

		JLabel label_5 = new JLabel("2.30");
		label_5.setHorizontalAlignment(SwingConstants.LEFT);
		label_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_5.setBounds(5, 209, 34, 14);
		panel_1.add(label_5);

		textField2_30 = new JTextField();
		textField2_30.setName("7322");
		textField2_30.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField2_30.setColumns(10);
		textField2_30.setBounds(231, 209, 126, 25);
		panel_1.add(textField2_30);

		JTextArea txtrvrigaObeskattadeReserver = new JTextArea();
		txtrvrigaObeskattadeReserver.setEditable(false);
		txtrvrigaObeskattadeReserver.setText("Övriga obeskattade reserver");
		txtrvrigaObeskattadeReserver.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrvrigaObeskattadeReserver.setBackground(Color.WHITE);
		txtrvrigaObeskattadeReserver.setBounds(50, 260, 167, 30);
		panel_1.add(txtrvrigaObeskattadeReserver);

		JLabel label_6 = new JLabel("2.31");
		label_6.setHorizontalAlignment(SwingConstants.LEFT);
		label_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_6.setBounds(5, 260, 34, 14);
		panel_1.add(label_6);

		textField2_31 = new JTextField();
		textField2_31.setName("7323");
		textField2_31.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField2_31.setColumns(10);
		textField2_31.setBounds(231, 260, 126, 25);
		panel_1.add(textField2_31);

		JSeparator separator_6 = new JSeparator();
		separator_6.setBackground(Color.BLACK);
		separator_6.setBounds(0, 248, 367, 2);
		panel_1.add(separator_6);

		JSeparator separator_7 = new JSeparator();
		separator_7.setBackground(Color.BLACK);
		separator_7.setBounds(0, 295, 367, 2);
		panel_1.add(separator_7);

		JTextArea txtrAvsttningarFrPensioner = new JTextArea();
		txtrAvsttningarFrPensioner.setEditable(false);
		txtrAvsttningarFrPensioner.setText(
				"Avsättningar för pensioner och \r\nliknande förpliktelser enligt lag \r\n(1967:531) om tryggande av \r\npensionsutfästelse m.m.");
		txtrAvsttningarFrPensioner.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrAvsttningarFrPensioner.setBackground(Color.WHITE);
		txtrAvsttningarFrPensioner.setBounds(50, 315, 167, 60);
		panel_1.add(txtrAvsttningarFrPensioner);

		JLabel label_7 = new JLabel("2.32");
		label_7.setHorizontalAlignment(SwingConstants.LEFT);
		label_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_7.setBounds(5, 315, 34, 14);
		panel_1.add(label_7);

		textField2_32 = new JTextField();
		textField2_32.setName("7331");
		textField2_32.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField2_32.setColumns(10);
		textField2_32.setBounds(231, 315, 126, 25);
		panel_1.add(textField2_32);

		JSeparator separator_8 = new JSeparator();
		separator_8.setBackground(Color.BLACK);
		separator_8.setBounds(0, 375, 367, 2);
		panel_1.add(separator_8);

		JTextArea txtrvrigaAvsttningarFr = new JTextArea();
		txtrvrigaAvsttningarFr.setEditable(false);
		txtrvrigaAvsttningarFr.setText("Övriga avsättningar för pensioner \r\noch liknande förpliktelser");
		txtrvrigaAvsttningarFr.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrvrigaAvsttningarFr.setBackground(Color.WHITE);
		txtrvrigaAvsttningarFr.setBounds(50, 385, 167, 30);
		panel_1.add(txtrvrigaAvsttningarFr);

		JLabel label_9 = new JLabel("2.33");
		label_9.setHorizontalAlignment(SwingConstants.LEFT);
		label_9.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_9.setBounds(5, 385, 34, 14);
		panel_1.add(label_9);

		textField2_33 = new JTextField();
		textField2_33.setName("7332");
		textField2_33.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField2_33.setColumns(10);
		textField2_33.setBounds(231, 385, 126, 25);
		panel_1.add(textField2_33);

		JSeparator separator_9 = new JSeparator();
		separator_9.setBackground(Color.BLACK);
		separator_9.setBounds(0, 419, 367, 2);
		panel_1.add(separator_9);

		JTextArea txtrvrigaAvsttningar = new JTextArea();
		txtrvrigaAvsttningar.setEditable(false);
		txtrvrigaAvsttningar.setText("Övriga avsättningar");
		txtrvrigaAvsttningar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrvrigaAvsttningar.setBackground(Color.WHITE);
		txtrvrigaAvsttningar.setBounds(50, 425, 157, 25);
		panel_1.add(txtrvrigaAvsttningar);

		JLabel label_10 = new JLabel("2.34");
		label_10.setHorizontalAlignment(SwingConstants.LEFT);
		label_10.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_10.setBounds(5, 425, 34, 14);
		panel_1.add(label_10);

		textField2_34 = new JTextField();
		textField2_34.setName("7333");
		textField2_34.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField2_34.setColumns(10);
		textField2_34.setBounds(231, 425, 126, 25);
		panel_1.add(textField2_34);

		JSeparator separator_10 = new JSeparator();
		separator_10.setBackground(Color.BLACK);
		separator_10.setBounds(0, 455, 367, 2);
		panel_1.add(separator_10);

		JSeparator separator_11 = new JSeparator();
		separator_11.setBackground(Color.BLACK);
		separator_11.setBounds(0, 490, 367, 2);
		panel_1.add(separator_11);

		JTextArea txtrObligationsln = new JTextArea();
		txtrObligationsln.setEditable(false);
		txtrObligationsln.setText("Obligationslån");
		txtrObligationsln.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrObligationsln.setBackground(Color.WHITE);
		txtrObligationsln.setBounds(50, 505, 161, 20);
		panel_1.add(txtrObligationsln);

		JLabel label_12 = new JLabel("2.35");
		label_12.setHorizontalAlignment(SwingConstants.LEFT);
		label_12.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_12.setBounds(5, 505, 35, 14);
		panel_1.add(label_12);

		textField2_35 = new JTextField();
		textField2_35.setName("7350");
		textField2_35.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField2_35.setColumns(10);
		textField2_35.setBounds(231, 500, 126, 25);
		panel_1.add(textField2_35);

		JSeparator separator_12 = new JSeparator();
		separator_12.setBackground(Color.BLACK);
		separator_12.setBounds(0, 530, 367, 2);
		panel_1.add(separator_12);

		JTextArea txtrCheckrkningskredit = new JTextArea();
		txtrCheckrkningskredit.setEditable(false);
		txtrCheckrkningskredit.setText("Checkräkningskredit");
		txtrCheckrkningskredit.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrCheckrkningskredit.setBackground(Color.WHITE);
		txtrCheckrkningskredit.setBounds(50, 537, 161, 20);
		panel_1.add(txtrCheckrkningskredit);

		JLabel label_13 = new JLabel("2.36");
		label_13.setHorizontalAlignment(SwingConstants.LEFT);
		label_13.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_13.setBounds(5, 537, 35, 14);
		panel_1.add(label_13);

		textField2_36 = new JTextField();
		textField2_36.setName("7351");
		textField2_36.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField2_36.setColumns(10);
		textField2_36.setBounds(231, 537, 126, 25);
		panel_1.add(textField2_36);

		JSeparator separator_13 = new JSeparator();
		separator_13.setBackground(Color.BLACK);
		separator_13.setBounds(0, 565, 367, 2);
		panel_1.add(separator_13);

		JLabel label_14 = new JLabel("2.37");
		label_14.setHorizontalAlignment(SwingConstants.LEFT);
		label_14.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_14.setBounds(5, 573, 35, 14);
		panel_1.add(label_14);

		JTextArea txtrvrigaSkulderTill = new JTextArea();
		txtrvrigaSkulderTill.setEditable(false);
		txtrvrigaSkulderTill.setText("Övriga skulder till kreditinstitut");
		txtrvrigaSkulderTill.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrvrigaSkulderTill.setBackground(Color.WHITE);
		txtrvrigaSkulderTill.setBounds(50, 573, 161, 20);
		panel_1.add(txtrvrigaSkulderTill);

		textField2_37 = new JTextField();
		textField2_37.setName("7352");
		textField2_37.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField2_37.setColumns(10);
		textField2_37.setBounds(231, 573, 126, 25);
		panel_1.add(textField2_37);

		JSeparator separator_14 = new JSeparator();
		separator_14.setBackground(Color.BLACK);
		separator_14.setBounds(0, 35, 762, 2);
		panel_1.add(separator_14);

		JLabel lblEgetKapital = new JLabel("Eget kapital");
		lblEgetKapital.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEgetKapital.setBounds(5, 5, 360, 22);
		panel_1.add(lblEgetKapital);

		textField2_43 = new JTextField();
		textField2_43.setName("7363");
		textField2_43.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField2_43.setColumns(10);
		textField2_43.setBounds(615, 160, 126, 25);
		panel_1.add(textField2_43);

		JLabel lblVarulagerkortfristigaSkulder = new JLabel("Kortfristiga skulder");
		lblVarulagerkortfristigaSkulder.setHorizontalAlignment(SwingConstants.LEFT);
		lblVarulagerkortfristigaSkulder.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblVarulagerkortfristigaSkulder.setBounds(376, 37, 207, 14);
		panel_1.add(lblVarulagerkortfristigaSkulder);

		textField2_40 = new JTextField();
		textField2_40.setName("7360");
		textField2_40.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField2_40.setColumns(10);
		textField2_40.setBounds(615, 40, 126, 25);
		panel_1.add(textField2_40);

		JTextArea txtrCheckrkningskredit_1 = new JTextArea();
		txtrCheckrkningskredit_1.setEditable(false);
		txtrCheckrkningskredit_1.setText("Checkräkningskredit");
		txtrCheckrkningskredit_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrCheckrkningskredit_1.setBackground(Color.WHITE);
		txtrCheckrkningskredit_1.setBounds(425, 53, 152, 14);
		panel_1.add(txtrCheckrkningskredit_1);

		JLabel label_19 = new JLabel("2.40");
		label_19.setHorizontalAlignment(SwingConstants.LEFT);
		label_19.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_19.setBounds(376, 53, 35, 14);
		panel_1.add(label_19);

		JLabel label_20 = new JLabel("2.41");
		label_20.setHorizontalAlignment(SwingConstants.LEFT);
		label_20.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_20.setBounds(376, 80, 35, 14);
		panel_1.add(label_20);

		JTextArea txtrvrigaSkulderTill_1 = new JTextArea();
		txtrvrigaSkulderTill_1.setEditable(false);
		txtrvrigaSkulderTill_1.setText("Övriga skulder till \r\nkreditinstitut");
		txtrvrigaSkulderTill_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrvrigaSkulderTill_1.setBackground(Color.WHITE);
		txtrvrigaSkulderTill_1.setBounds(425, 80, 152, 31);
		panel_1.add(txtrvrigaSkulderTill_1);

		textField2_41 = new JTextField();
		textField2_41.setName("7361");
		textField2_41.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField2_41.setColumns(10);
		textField2_41.setBounds(615, 80, 126, 25);
		panel_1.add(textField2_41);

		textField2_42 = new JTextField();
		textField2_42.setName("7362");
		textField2_42.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField2_42.setColumns(10);
		textField2_42.setBounds(615, 120, 126, 25);
		panel_1.add(textField2_42);

		JTextArea txtrFaktureradMenEj = new JTextArea();
		txtrFaktureradMenEj.setEditable(false);
		txtrFaktureradMenEj.setText("Förskott från kunder");
		txtrFaktureradMenEj.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrFaktureradMenEj.setBackground(Color.WHITE);
		txtrFaktureradMenEj.setBounds(425, 120, 152, 15);
		panel_1.add(txtrFaktureradMenEj);

		JLabel label_21 = new JLabel("2.42");
		label_21.setHorizontalAlignment(SwingConstants.LEFT);
		label_21.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_21.setBounds(376, 120, 35, 14);
		panel_1.add(label_21);

		JTextArea txtrPgendeArbetenFr_1 = new JTextArea();
		txtrPgendeArbetenFr_1.setEditable(false);
		txtrPgendeArbetenFr_1.setText("Pågående arbeten för \r\nannans räkning\r\n");
		txtrPgendeArbetenFr_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrPgendeArbetenFr_1.setBackground(Color.WHITE);
		txtrPgendeArbetenFr_1.setBounds(425, 160, 152, 30);
		panel_1.add(txtrPgendeArbetenFr_1);

		JLabel label_22 = new JLabel("2.43");
		label_22.setHorizontalAlignment(SwingConstants.LEFT);
		label_22.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_22.setBounds(376, 160, 38, 14);
		panel_1.add(label_22);

		JSeparator separator_15 = new JSeparator();
		separator_15.setBackground(Color.BLACK);
		separator_15.setOrientation(SwingConstants.VERTICAL);
		separator_15.setBounds(597, 0, 13, 489);
		panel_1.add(separator_15);

		JSeparator separator_16 = new JSeparator();
		separator_16.setBackground(Color.BLACK);
		separator_16.setBounds(367, 148, 395, 2);
		panel_1.add(separator_16);

		textField2_44 = new JTextField();
		textField2_44.setName("7364");
		textField2_44.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField2_44.setColumns(10);
		textField2_44.setBounds(615, 201, 126, 25);
		panel_1.add(textField2_44);

		JTextArea txtrFaktureradMenEj_1 = new JTextArea();
		txtrFaktureradMenEj_1.setEditable(false);
		txtrFaktureradMenEj_1.setText("Fakturerad men ej upparbetad \r\nintäkt");
		txtrFaktureradMenEj_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrFaktureradMenEj_1.setBackground(Color.WHITE);
		txtrFaktureradMenEj_1.setBounds(425, 201, 152, 32);
		panel_1.add(txtrFaktureradMenEj_1);

		JLabel label_23 = new JLabel("2.44");
		label_23.setHorizontalAlignment(SwingConstants.LEFT);
		label_23.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_23.setBounds(376, 201, 35, 14);
		panel_1.add(label_23);

		JSeparator separator_17 = new JSeparator();
		separator_17.setBackground(Color.BLACK);
		separator_17.setBounds(367, 237, 395, 2);
		panel_1.add(separator_17);

		textField2_46 = new JTextField();
		textField2_46.setName("7366");
		textField2_46.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField2_46.setColumns(10);
		textField2_46.setBounds(615, 289, 126, 25);
		panel_1.add(textField2_46);

		JTextArea txtrVxelskulder = new JTextArea();
		txtrVxelskulder.setEditable(false);
		txtrVxelskulder.setText("Växelskulder");
		txtrVxelskulder.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrVxelskulder.setBackground(Color.WHITE);
		txtrVxelskulder.setBounds(425, 294, 159, 16);
		panel_1.add(txtrVxelskulder);

		JLabel label_25 = new JLabel("2.46");
		label_25.setHorizontalAlignment(SwingConstants.LEFT);
		label_25.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_25.setBounds(376, 293, 35, 14);
		panel_1.add(label_25);

		JLabel label_26 = new JLabel("2.49");
		label_26.setHorizontalAlignment(SwingConstants.LEFT);
		label_26.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_26.setBounds(376, 405, 37, 14);
		panel_1.add(label_26);

		JTextArea txtrvrigaSkulder_1 = new JTextArea();
		txtrvrigaSkulder_1.setEditable(false);
		txtrvrigaSkulder_1.setText("Övriga skulder");
		txtrvrigaSkulder_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrvrigaSkulder_1.setBackground(Color.WHITE);
		txtrvrigaSkulder_1.setBounds(425, 405, 150, 20);
		panel_1.add(txtrvrigaSkulder_1);

		textField2_49 = new JTextField();
		textField2_49.setName("7369");
		textField2_49.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField2_49.setColumns(10);
		textField2_49.setBounds(615, 402, 126, 25);
		panel_1.add(textField2_49);

		textField2_50 = new JTextField();
		textField2_50.setName("7370");
		textField2_50.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField2_50.setColumns(10);
		textField2_50.setBounds(616, 450, 125, 25);
		panel_1.add(textField2_50);

		JTextArea txtrUpplupnaKostnaderOch = new JTextArea();
		txtrUpplupnaKostnaderOch.setEditable(false);
		txtrUpplupnaKostnaderOch.setText("Upplupna kostnader och \r\nförutbetalda intäkter");
		txtrUpplupnaKostnaderOch.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrUpplupnaKostnaderOch.setBackground(Color.WHITE);
		txtrUpplupnaKostnaderOch.setBounds(425, 450, 152, 32);
		panel_1.add(txtrUpplupnaKostnaderOch);

		JSeparator separator_18 = new JSeparator();
		separator_18.setBackground(Color.BLACK);
		separator_18.setBounds(367, 436, 395, 2);
		panel_1.add(separator_18);

		JLabel label_56 = new JLabel("2.50");
		label_56.setHorizontalAlignment(SwingConstants.LEFT);
		label_56.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_56.setBounds(377, 450, 35, 14);
		panel_1.add(label_56);

		JSeparator separator_19 = new JSeparator();
		separator_19.setBackground(Color.BLACK);
		separator_19.setBounds(367, 113, 395, 4);
		panel_1.add(separator_19);

		JSeparator separator_20 = new JSeparator();
		separator_20.setBackground(Color.BLACK);
		separator_20.setBounds(367, 70, 393, 10);
		panel_1.add(separator_20);

		JSeparator separator_21 = new JSeparator();
		separator_21.setBackground(Color.BLACK);
		separator_21.setOrientation(SwingConstants.VERTICAL);
		separator_21.setBounds(367, 0, 9, 650);
		panel_1.add(separator_21);

		JSeparator separator_22 = new JSeparator();
		separator_22.setBackground(Color.BLACK);
		separator_22.setBounds(367, 195, 395, 8);
		panel_1.add(separator_22);

		JTextArea txtrLeverantrsskulder = new JTextArea();
		txtrLeverantrsskulder.setEditable(false);
		txtrLeverantrsskulder.setText("Leverantörsskulder");
		txtrLeverantrsskulder.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrLeverantrsskulder.setBackground(Color.WHITE);
		txtrLeverantrsskulder.setBounds(425, 250, 157, 14);
		panel_1.add(txtrLeverantrsskulder);

		JLabel label_58 = new JLabel("2.45");
		label_58.setHorizontalAlignment(SwingConstants.LEFT);
		label_58.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_58.setBounds(376, 250, 35, 14);
		panel_1.add(label_58);

		textField2_45 = new JTextField();
		textField2_45.setName("7365");
		textField2_45.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField2_45.setColumns(10);
		textField2_45.setBounds(615, 245, 126, 25);
		panel_1.add(textField2_45);

		JSeparator separator_23 = new JSeparator();
		separator_23.setBackground(Color.BLACK);
		separator_23.setBounds(367, 275, 395, 2);
		panel_1.add(separator_23);

		JSeparator separator_24 = new JSeparator();
		separator_24.setBackground(Color.BLACK);
		separator_24.setBounds(367, 319, 395, 2);
		panel_1.add(separator_24);

		JLabel label_59 = new JLabel("2.47");
		label_59.setHorizontalAlignment(SwingConstants.LEFT);
		label_59.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_59.setBounds(376, 327, 35, 14);
		panel_1.add(label_59);

		JTextArea txtrSkulderTillKoncern_1 = new JTextArea();
		txtrSkulderTillKoncern_1.setEditable(false);
		txtrSkulderTillKoncern_1.setText("Skulder till koncern- och \r\nintresseföretag\r\n");
		txtrSkulderTillKoncern_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrSkulderTillKoncern_1.setBackground(Color.WHITE);
		txtrSkulderTillKoncern_1.setBounds(425, 322, 155, 32);
		panel_1.add(txtrSkulderTillKoncern_1);

		textField2_47 = new JTextField();
		textField2_47.setName("7367");
		textField2_47.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField2_47.setColumns(10);
		textField2_47.setBounds(615, 327, 126, 25);
		panel_1.add(textField2_47);

		JSeparator separator_25 = new JSeparator();
		separator_25.setBackground(Color.BLACK);
		separator_25.setBounds(367, 357, 395, 2);
		panel_1.add(separator_25);

		JTextArea txtrSkatteskulder = new JTextArea();
		txtrSkatteskulder.setEditable(false);
		txtrSkatteskulder.setText("Skatteskulder");
		txtrSkatteskulder.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrSkatteskulder.setBackground(Color.WHITE);
		txtrSkatteskulder.setBounds(425, 370, 155, 20);
		panel_1.add(txtrSkatteskulder);

		JLabel label_60 = new JLabel("2.48");
		label_60.setHorizontalAlignment(SwingConstants.LEFT);
		label_60.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_60.setBounds(376, 370, 35, 14);
		panel_1.add(label_60);

		JSeparator separator_26 = new JSeparator();
		separator_26.setBackground(Color.BLACK);
		separator_26.setBounds(367, 395, 395, 2);
		panel_1.add(separator_26);

		textField2_48 = new JTextField();
		textField2_48.setName("7368");
		textField2_48.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField2_48.setColumns(10);
		textField2_48.setBounds(616, 365, 126, 25);
		panel_1.add(textField2_48);

		JSeparator separator_27 = new JSeparator();
		separator_27.setBackground(Color.BLACK);
		separator_27.setBounds(367, 490, 395, 2);
		panel_1.add(separator_27);

		JSeparator separator_59 = new JSeparator();
		separator_59.setBackground(Color.BLACK);
		separator_59.setBounds(0, 650, 762, 14);
		panel_1.add(separator_59);

		JSeparator separator_60 = new JSeparator();
		separator_60.setBackground(Color.BLACK);
		separator_60.setBounds(0, 148, 367, 2);
		panel_1.add(separator_60);

		JSeparator separator_61 = new JSeparator();
		separator_61.setBackground(Color.BLACK);
		separator_61.setOrientation(SwingConstants.VERTICAL);
		separator_61.setBounds(220, 35, 2, 78);
		panel_1.add(separator_61);

		JLabel lblEgetKapitalobeskattadeReserver = new JLabel("Obeskattade reserver och avsättningar");
		lblEgetKapitalobeskattadeReserver.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEgetKapitalobeskattadeReserver.setBounds(5, 120, 360, 22);
		panel_1.add(lblEgetKapitalobeskattadeReserver);

		JLabel lblAvsttningar = new JLabel("Avsättningar");
		lblAvsttningar.setHorizontalAlignment(SwingConstants.LEFT);
		lblAvsttningar.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAvsttningar.setBounds(5, 300, 207, 14);
		panel_1.add(lblAvsttningar);

		JSeparator separator_62 = new JSeparator();
		separator_62.setBounds(221, 502, 1, 132);
		panel_1.add(separator_62);

		JSeparator separator_63 = new JSeparator();
		separator_63.setBackground(Color.BLACK);
		separator_63.setOrientation(SwingConstants.VERTICAL);
		separator_63.setBounds(220, 492, 2, 159);
		panel_1.add(separator_63);

		JLabel lblSkulder = new JLabel("Skulder");
		lblSkulder.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSkulder.setBounds(5, 462, 360, 22);
		panel_1.add(lblSkulder);

		JLabel lblLngfristigaSkulder = new JLabel("Långfristiga skulder");
		lblLngfristigaSkulder.setHorizontalAlignment(SwingConstants.LEFT);
		lblLngfristigaSkulder.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblLngfristigaSkulder.setBounds(5, 492, 207, 14);
		panel_1.add(lblLngfristigaSkulder);

		JSeparator separator_64 = new JSeparator();
		separator_64.setBackground(Color.BLACK);
		separator_64.setBounds(0, 601, 367, 2);
		panel_1.add(separator_64);

		textField2_38 = new JTextField();
		textField2_38.setName("7353");
		textField2_38.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField2_38.setColumns(10);
		textField2_38.setBounds(231, 610, 126, 25);
		panel_1.add(textField2_38);

		JTextArea txtrSkulderTillKoncern = new JTextArea();
		txtrSkulderTillKoncern.setEditable(false);
		txtrSkulderTillKoncern.setText("Skulder till koncern- och \r\nintresseföretag");
		txtrSkulderTillKoncern.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrSkulderTillKoncern.setBackground(Color.WHITE);
		txtrSkulderTillKoncern.setBounds(50, 610, 161, 32);
		panel_1.add(txtrSkulderTillKoncern);

		JLabel label_1 = new JLabel("2.38");
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_1.setBounds(5, 610, 35, 14);
		panel_1.add(label_1);

		JLabel label_4 = new JLabel("2.39");
		label_4.setHorizontalAlignment(SwingConstants.LEFT);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_4.setBounds(376, 5, 35, 14);
		panel_1.add(label_4);

		textField2_39 = new JTextField();
		textField2_39.setName("7354");
		textField2_39.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField2_39.setColumns(10);
		textField2_39.setBounds(615, 6, 126, 25);
		panel_1.add(textField2_39);

		JTextArea txtrvrigaSkulder = new JTextArea();
		txtrvrigaSkulder.setEditable(false);
		txtrvrigaSkulder.setText("Övriga skulder");
		txtrvrigaSkulder.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrvrigaSkulder.setBackground(Color.WHITE);
		txtrvrigaSkulder.setBounds(425, 6, 161, 23);
		panel_1.add(txtrvrigaSkulder);

		JButton btnPage1 = new JButton("Föregående");
		btnPage1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(true);
				panel_1.setVisible(false);
				panel_2.setVisible(false);
				panel_3.setVisible(false);
			}
		});
		btnPage1.setBounds(10, 656, 104, 23);
		panel_1.add(btnPage1);

		JButton btnPage3 = new JButton("Nästa");
		btnPage3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				panel_1.setVisible(false);
				panel_2.setVisible(true);
				panel_3.setVisible(false);
			}
		});
		btnPage3.setBounds(663, 656, 89, 23);
		panel_1.add(btnPage3);

		panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setLayout(null);
		panel_2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		firstPage.add(panel_2, "name_144424106264739");

		JSeparator separator_57 = new JSeparator();
		separator_57.setBackground(Color.BLACK);
		separator_57.setOrientation(SwingConstants.VERTICAL);
		separator_57.setBounds(211, 35, 9, 616);
		panel_2.add(separator_57);

		JLabel label_8 = new JLabel("3.1");
		label_8.setHorizontalAlignment(SwingConstants.LEFT);
		label_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_8.setBounds(5, 42, 34, 14);
		panel_2.add(label_8);

		textField3_1 = new JTextField();
		textField3_1.setName("7410");
		textField3_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField3_1.setColumns(10);
		textField3_1.setBounds(260, 42, 100, 25);
		panel_2.add(textField3_1);

		JSeparator separator_58 = new JSeparator();
		separator_58.setBackground(Color.BLACK);
		separator_58.setBounds(0, 70, 367, 6);
		panel_2.add(separator_58);

		JLabel label_11 = new JLabel("3.2");
		label_11.setHorizontalAlignment(SwingConstants.LEFT);
		label_11.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_11.setBounds(5, 76, 29, 14);
		panel_2.add(label_11);

		textField3_2 = new JTextField();
		textField3_2.setName("7411");
		textField3_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField3_2.setColumns(10);
		textField3_2.setBounds(260, 76, 100, 25);
		panel_2.add(textField3_2);

		JLabel label_15 = new JLabel("3.3");
		label_15.setHorizontalAlignment(SwingConstants.LEFT);
		label_15.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_15.setBounds(5, 144, 34, 14);
		panel_2.add(label_15);

		textField3_3 = new JTextField();
		textField3_3.setName("7412");
		textField3_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField3_3.setColumns(10);
		textField3_3.setBounds(260, 145, 100, 25);
		panel_2.add(textField3_3);

		JTextArea txtrNettoomsttning = new JTextArea();
		txtrNettoomsttning.setText("Nettoomsättning");
		txtrNettoomsttning.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrNettoomsttning.setEditable(false);
		txtrNettoomsttning.setBackground(Color.WHITE);
		txtrNettoomsttning.setBounds(40, 42, 152, 15);
		panel_2.add(txtrNettoomsttning);

		JTextArea txtrFrndringAvLager = new JTextArea();
		txtrFrndringAvLager.setText(
				"Förändring av lager av produkter \r\ni arbete, färdiga varor och \r\npågående arbete för annans \r\nräkning");
		txtrFrndringAvLager.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrFrndringAvLager.setEditable(false);
		txtrFrndringAvLager.setBackground(Color.WHITE);
		txtrFrndringAvLager.setBounds(40, 76, 161, 58);
		panel_2.add(txtrFrndringAvLager);

		JSeparator separator_65 = new JSeparator();
		separator_65.setBackground(Color.BLACK);
		separator_65.setBounds(211, 106, 154, 6);
		panel_2.add(separator_65);

		JTextArea txtrAktiveratArbeteFr = new JTextArea();
		txtrAktiveratArbeteFr.setText("Aktiverat arbete för egen \r\nräkning");
		txtrAktiveratArbeteFr.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrAktiveratArbeteFr.setEditable(false);
		txtrAktiveratArbeteFr.setBackground(Color.WHITE);
		txtrAktiveratArbeteFr.setBounds(40, 144, 152, 29);
		panel_2.add(txtrAktiveratArbeteFr);

		JSeparator separator_66 = new JSeparator();
		separator_66.setBackground(Color.BLACK);
		separator_66.setBounds(0, 175, 367, 2);
		panel_2.add(separator_66);

		JTextArea txtrvrigaRrelseintkter = new JTextArea();
		txtrvrigaRrelseintkter.setText("Övriga rörelseintäkter");
		txtrvrigaRrelseintkter.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrvrigaRrelseintkter.setEditable(false);
		txtrvrigaRrelseintkter.setBackground(Color.WHITE);
		txtrvrigaRrelseintkter.setBounds(40, 185, 145, 23);
		panel_2.add(txtrvrigaRrelseintkter);

		JLabel label_17 = new JLabel("3.4");
		label_17.setHorizontalAlignment(SwingConstants.LEFT);
		label_17.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_17.setBounds(5, 185, 34, 14);
		panel_2.add(label_17);

		textField3_4 = new JTextField();
		textField3_4.setName("7413");
		textField3_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField3_4.setColumns(10);
		textField3_4.setBounds(260, 181, 100, 25);
		panel_2.add(textField3_4);

		JTextArea txtrRvarorOchFrndenheter = new JTextArea();
		txtrRvarorOchFrndenheter.setText("Råvaror och förnödenheter");
		txtrRvarorOchFrndenheter.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrRvarorOchFrndenheter.setEditable(false);
		txtrRvarorOchFrndenheter.setBackground(Color.WHITE);
		txtrRvarorOchFrndenheter.setBounds(40, 217, 145, 24);
		panel_2.add(txtrRvarorOchFrndenheter);

		JLabel label_24 = new JLabel("3.5");
		label_24.setHorizontalAlignment(SwingConstants.LEFT);
		label_24.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_24.setBounds(5, 217, 34, 14);
		panel_2.add(label_24);

		textField3_5 = new JTextField();
		textField3_5.setName("7511");
		textField3_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField3_5.setColumns(10);
		textField3_5.setBounds(260, 215, 100, 25);
		panel_2.add(textField3_5);

		JSeparator separator_67 = new JSeparator();
		separator_67.setBackground(Color.BLACK);
		separator_67.setBounds(0, 210, 367, 2);
		panel_2.add(separator_67);

		JSeparator separator_68 = new JSeparator();
		separator_68.setBackground(Color.BLACK);
		separator_68.setBounds(0, 245, 367, 2);
		panel_2.add(separator_68);

		textField3_7 = new JTextField();
		textField3_7.setName("7513");
		textField3_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField3_7.setColumns(10);
		textField3_7.setBounds(260, 289, 100, 25);
		panel_2.add(textField3_7);

		JSeparator separator_70 = new JSeparator();
		separator_70.setBackground(Color.BLACK);
		separator_70.setBounds(0, 405, 367, 2);
		panel_2.add(separator_70);

		JTextArea txtrAvOchNedskrivningar = new JTextArea();
		txtrAvOchNedskrivningar
				.setText("Nedskrivningar av omsättnings-\r\ntillgångar utöver normala \r\nnedskrivningar");
		txtrAvOchNedskrivningar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrAvOchNedskrivningar.setEditable(false);
		txtrAvOchNedskrivningar.setBackground(Color.WHITE);
		txtrAvOchNedskrivningar.setBounds(40, 408, 157, 45);
		panel_2.add(txtrAvOchNedskrivningar);

		JLabel label_65 = new JLabel("3.10");
		label_65.setHorizontalAlignment(SwingConstants.LEFT);
		label_65.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_65.setBounds(5, 420, 34, 14);
		panel_2.add(label_65);

		textField3_10 = new JTextField();
		textField3_10.setName("7516");
		textField3_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField3_10.setColumns(10);
		textField3_10.setBounds(260, 418, 100, 25);
		panel_2.add(textField3_10);

		JSeparator separator_71 = new JSeparator();
		separator_71.setBackground(Color.BLACK);
		separator_71.setBounds(0, 455, 367, 2);
		panel_2.add(separator_71);

		JSeparator separator_72 = new JSeparator();
		separator_72.setBackground(Color.BLACK);
		separator_72.setBounds(0, 490, 367, 2);
		panel_2.add(separator_72);

		textField3_12 = new JTextField();
		textField3_12.setName("7414");
		textField3_12.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField3_12.setColumns(10);
		textField3_12.setBounds(260, 497, 100, 25);
		panel_2.add(textField3_12);

		JSeparator separator_73 = new JSeparator();
		separator_73.setBackground(Color.BLACK);
		separator_73.setBounds(211, 526, 156, 6);
		panel_2.add(separator_73);

		JTextArea txtrResultatFrnAndelar = new JTextArea();
		txtrResultatFrnAndelar.setText("Resultat från andelar i \r\nkoncernföretag");
		txtrResultatFrnAndelar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrResultatFrnAndelar.setEditable(false);
		txtrResultatFrnAndelar.setBackground(Color.WHITE);
		txtrResultatFrnAndelar.setBounds(40, 526, 152, 35);
		panel_2.add(txtrResultatFrnAndelar);

		JLabel label_67 = new JLabel("3.12");
		label_67.setHorizontalAlignment(SwingConstants.LEFT);
		label_67.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_67.setBounds(5, 527, 35, 14);
		panel_2.add(label_67);

		textField3_12_2 = new JTextField();
		textField3_12_2.setName("7518");
		textField3_12_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField3_12_2.setColumns(10);
		textField3_12_2.setBounds(260, 534, 100, 25);
		panel_2.add(textField3_12_2);

		JSeparator separator_74 = new JSeparator();
		separator_74.setBackground(Color.BLACK);
		separator_74.setBounds(0, 565, 367, 2);
		panel_2.add(separator_74);

		JLabel label_68 = new JLabel("3:13");
		label_68.setHorizontalAlignment(SwingConstants.LEFT);
		label_68.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_68.setBounds(5, 606, 35, 14);
		panel_2.add(label_68);

		JTextArea txtrResultatFrnAndelar_1 = new JTextArea();
		txtrResultatFrnAndelar_1.setText("Resultat från andelar \r\ni intresseföretag");
		txtrResultatFrnAndelar_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrResultatFrnAndelar_1.setEditable(false);
		txtrResultatFrnAndelar_1.setBackground(Color.WHITE);
		txtrResultatFrnAndelar_1.setBounds(40, 605, 155, 35);
		panel_2.add(txtrResultatFrnAndelar_1);

		textField3_13 = new JTextField();
		textField3_13.setName("7415");
		textField3_13.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField3_13.setColumns(10);
		textField3_13.setBounds(260, 569, 100, 25);
		panel_2.add(textField3_13);

		JSeparator separator_75 = new JSeparator();
		separator_75.setBackground(Color.BLACK);
		separator_75.setBounds(0, 35, 367, 2);
		panel_2.add(separator_75);

		JLabel lblResultatrkning = new JLabel("Resultaträkning");
		lblResultatrkning.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblResultatrkning.setBounds(7, 5, 360, 22);
		panel_2.add(lblResultatrkning);

		textField3_14_2 = new JTextField();
		textField3_14_2.setName("7520");
		textField3_14_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField3_14_2.setColumns(10);
		textField3_14_2.setBounds(652, 42, 100, 25);
		panel_2.add(textField3_14_2);

		JLabel label_72 = new JLabel("3.15");
		label_72.setHorizontalAlignment(SwingConstants.LEFT);
		label_72.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_72.setBounds(380, 76, 35, 14);
		panel_2.add(label_72);

		JTextArea txtrvrigaRnteintkterOch = new JTextArea();
		txtrvrigaRnteintkterOch.setText("Övriga ränteintäkter och \r\nliknande resultatposter");
		txtrvrigaRnteintkterOch.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrvrigaRnteintkterOch.setEditable(false);
		txtrvrigaRnteintkterOch.setBackground(Color.WHITE);
		txtrvrigaRnteintkterOch.setBounds(425, 75, 152, 30);
		panel_2.add(txtrvrigaRnteintkterOch);

		textField3_15 = new JTextField();
		textField3_15.setName("7417");
		textField3_15.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField3_15.setColumns(10);
		textField3_15.setBounds(652, 76, 100, 25);
		panel_2.add(textField3_15);

		textField3_16 = new JTextField();
		textField3_16.setName("7521");
		textField3_16.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField3_16.setColumns(10);
		textField3_16.setBounds(652, 129, 100, 25);
		panel_2.add(textField3_16);

		JTextArea txtrNedskrivningarAvFinansiella = new JTextArea();
		txtrNedskrivningarAvFinansiella
				.setText("Nedskrivningar av finansiella \r\nanläggningstillgångar och \r\nkortfristiga placeringar");
		txtrNedskrivningarAvFinansiella.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrNedskrivningarAvFinansiella.setEditable(false);
		txtrNedskrivningarAvFinansiella.setBackground(Color.WHITE);
		txtrNedskrivningarAvFinansiella.setBounds(425, 118, 152, 43);
		panel_2.add(txtrNedskrivningarAvFinansiella);

		JLabel label_73 = new JLabel("3.16");
		label_73.setHorizontalAlignment(SwingConstants.LEFT);
		label_73.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_73.setBounds(380, 125, 35, 14);
		panel_2.add(label_73);

		JSeparator separator_76 = new JSeparator();
		separator_76.setBackground(Color.BLACK);
		separator_76.setOrientation(SwingConstants.VERTICAL);
		separator_76.setBounds(597, 0, 13, 651);
		panel_2.add(separator_76);

		textField3_18 = new JTextField();
		textField3_18.setName("7418");
		textField3_18.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField3_18.setColumns(10);
		textField3_18.setBounds(653, 206, 100, 25);
		panel_2.add(textField3_18);

		JTextArea txtrExtraordinraIntkter = new JTextArea();
		txtrExtraordinraIntkter.setText("Extraordinära intäkter");
		txtrExtraordinraIntkter.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrExtraordinraIntkter.setEditable(false);
		txtrExtraordinraIntkter.setBackground(Color.WHITE);
		txtrExtraordinraIntkter.setBounds(425, 209, 152, 24);
		panel_2.add(txtrExtraordinraIntkter);

		JLabel label_75 = new JLabel("3.18");
		label_75.setHorizontalAlignment(SwingConstants.LEFT);
		label_75.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_75.setBounds(380, 209, 35, 14);
		panel_2.add(label_75);

		JSeparator separator_78 = new JSeparator();
		separator_78.setBackground(Color.BLACK);
		separator_78.setBounds(367, 237, 395, 2);
		panel_2.add(separator_78);

		textField3_20 = new JTextField();
		textField3_20.setName("7524");
		textField3_20.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField3_20.setColumns(10);
		textField3_20.setBounds(652, 279, 100, 25);
		panel_2.add(textField3_20);

		JTextArea txtrLmnadeKoncernbidrag = new JTextArea();
		txtrLmnadeKoncernbidrag.setText("Lämnade koncernbidrag");
		txtrLmnadeKoncernbidrag.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrLmnadeKoncernbidrag.setEditable(false);
		txtrLmnadeKoncernbidrag.setBackground(Color.WHITE);
		txtrLmnadeKoncernbidrag.setBounds(425, 280, 159, 16);
		panel_2.add(txtrLmnadeKoncernbidrag);

		JLabel label_76 = new JLabel("3.20");
		label_76.setHorizontalAlignment(SwingConstants.LEFT);
		label_76.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_76.setBounds(380, 281, 35, 14);
		panel_2.add(label_76);

		JLabel label_77 = new JLabel("3.23");
		label_77.setHorizontalAlignment(SwingConstants.LEFT);
		label_77.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_77.setBounds(380, 377, 37, 14);
		panel_2.add(label_77);

		JTextArea txtrAvsttningTillPeriodiseringsfond = new JTextArea();
		txtrAvsttningTillPeriodiseringsfond.setText("Avsättning till periodiserings\r\nfond");
		txtrAvsttningTillPeriodiseringsfond.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrAvsttningTillPeriodiseringsfond.setEditable(false);
		txtrAvsttningTillPeriodiseringsfond.setBackground(Color.WHITE);
		txtrAvsttningTillPeriodiseringsfond.setBounds(425, 376, 150, 29);
		panel_2.add(txtrAvsttningTillPeriodiseringsfond);

		textField3_23 = new JTextField();
		textField3_23.setName("7525");
		textField3_23.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField3_23.setColumns(10);
		textField3_23.setBounds(652, 377, 100, 25);
		panel_2.add(textField3_23);

		JSeparator separator_79 = new JSeparator();
		separator_79.setBackground(Color.BLACK);
		separator_79.setBounds(366, 405, 396, 4);
		panel_2.add(separator_79);

		JSeparator separator_80 = new JSeparator();
		separator_80.setBackground(Color.BLACK);
		separator_80.setBounds(367, 106, 395, 2);
		panel_2.add(separator_80);

		JSeparator separator_81 = new JSeparator();
		separator_81.setBackground(Color.BLACK);
		separator_81.setBounds(367, 70, 395, 2);
		panel_2.add(separator_81);

		JSeparator separator_82 = new JSeparator();
		separator_82.setBackground(Color.BLACK);
		separator_82.setOrientation(SwingConstants.VERTICAL);
		separator_82.setBounds(367, 2, 9, 650);
		panel_2.add(separator_82);

		JSeparator separator_83 = new JSeparator();
		separator_83.setBackground(Color.BLACK);
		separator_83.setBounds(367, 200, 395, 8);
		panel_2.add(separator_83);

		JTextArea txtrExtraordinraKostnader_1 = new JTextArea();
		txtrExtraordinraKostnader_1.setText("Extraordinära kostnader");
		txtrExtraordinraKostnader_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrExtraordinraKostnader_1.setEditable(false);
		txtrExtraordinraKostnader_1.setBackground(Color.WHITE);
		txtrExtraordinraKostnader_1.setBounds(425, 250, 151, 14);
		panel_2.add(txtrExtraordinraKostnader_1);

		JLabel label_79 = new JLabel("3.19");
		label_79.setHorizontalAlignment(SwingConstants.LEFT);
		label_79.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_79.setBounds(380, 250, 35, 14);
		panel_2.add(label_79);

		textField3_19 = new JTextField();
		textField3_19.setName("7523");
		textField3_19.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField3_19.setColumns(10);
		textField3_19.setBounds(652, 245, 100, 25);
		panel_2.add(textField3_19);

		JSeparator separator_84 = new JSeparator();
		separator_84.setBackground(Color.BLACK);
		separator_84.setBounds(367, 275, 395, 2);
		panel_2.add(separator_84);

		JSeparator separator_85 = new JSeparator();
		separator_85.setBackground(Color.BLACK);
		separator_85.setBounds(367, 308, 395, 2);
		panel_2.add(separator_85);

		JLabel label_80 = new JLabel("3.21");
		label_80.setHorizontalAlignment(SwingConstants.LEFT);
		label_80.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_80.setBounds(380, 315, 35, 14);
		panel_2.add(label_80);

		JTextArea txtrExtraordinraKostnader = new JTextArea();
		txtrExtraordinraKostnader.setText("Mottagna koncernbidrag");
		txtrExtraordinraKostnader.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrExtraordinraKostnader.setEditable(false);
		txtrExtraordinraKostnader.setBackground(Color.WHITE);
		txtrExtraordinraKostnader.setBounds(425, 314, 152, 21);
		panel_2.add(txtrExtraordinraKostnader);

		textField3_21 = new JTextField();
		textField3_21.setName("7419");
		textField3_21.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField3_21.setColumns(10);
		textField3_21.setBounds(652, 315, 100, 25);
		panel_2.add(textField3_21);

		JSeparator separator_86 = new JSeparator();
		separator_86.setBackground(Color.BLACK);
		separator_86.setBounds(367, 341, 395, 2);
		panel_2.add(separator_86);

		JTextArea txtrterfringAvPeriodiseringsfond = new JTextArea();
		txtrterfringAvPeriodiseringsfond.setText("Återföring av periodiserings-\r\nfond");
		txtrterfringAvPeriodiseringsfond.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrterfringAvPeriodiseringsfond.setEditable(false);
		txtrterfringAvPeriodiseringsfond.setBackground(Color.WHITE);
		txtrterfringAvPeriodiseringsfond.setBounds(425, 341, 155, 29);
		panel_2.add(txtrterfringAvPeriodiseringsfond);

		JLabel label_81 = new JLabel("3.22");
		label_81.setHorizontalAlignment(SwingConstants.LEFT);
		label_81.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_81.setBounds(380, 350, 35, 14);
		panel_2.add(label_81);

		JSeparator separator_87 = new JSeparator();
		separator_87.setBackground(Color.BLACK);
		separator_87.setBounds(367, 373, 398, 5);
		panel_2.add(separator_87);

		textField3_22 = new JTextField();
		textField3_22.setName("7420");
		textField3_22.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField3_22.setColumns(10);
		textField3_22.setBounds(652, 345, 100, 25);
		panel_2.add(textField3_22);

		JSeparator separator_88 = new JSeparator();
		separator_88.setBackground(Color.BLACK);
		separator_88.setBounds(367, 471, 395, 2);
		panel_2.add(separator_88);

		JSeparator separator_89 = new JSeparator();
		separator_89.setBackground(Color.BLACK);
		separator_89.setBounds(0, 650, 752, 8);
		panel_2.add(separator_89);

		JSeparator separator_90 = new JSeparator();
		separator_90.setBackground(Color.BLACK);
		separator_90.setBounds(0, 141, 367, 2);
		panel_2.add(separator_90);

		JSeparator separator_94 = new JSeparator();
		separator_94.setBackground(Color.BLACK);
		separator_94.setBounds(211, 598, 156, 6);
		panel_2.add(separator_94);

		textField3_13_2 = new JTextField();
		textField3_13_2.setName("7519");
		textField3_13_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField3_13_2.setColumns(10);
		textField3_13_2.setBounds(260, 608, 100, 25);
		panel_2.add(textField3_13_2);

		JLabel label_87 = new JLabel("3.14");
		label_87.setHorizontalAlignment(SwingConstants.LEFT);
		label_87.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_87.setBounds(380, 15, 35, 14);
		panel_2.add(label_87);

		textField3_14 = new JTextField();
		textField3_14.setName("7416");
		textField3_14.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField3_14.setColumns(10);
		textField3_14.setBounds(651, 5, 100, 25);
		panel_2.add(textField3_14);

		JTextArea txtrResultatFrnvriga = new JTextArea();
		txtrResultatFrnvriga.setText("Resultat från övriga \r\nfinansiella anläggnings-\r\ntillgångar");
		txtrResultatFrnvriga.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrResultatFrnvriga.setEditable(false);
		txtrResultatFrnvriga.setBackground(Color.WHITE);
		txtrResultatFrnvriga.setBounds(425, 15, 152, 46);
		panel_2.add(txtrResultatFrnvriga);

		JSeparator separator_91 = new JSeparator();
		separator_91.setOrientation(SwingConstants.VERTICAL);
		separator_91.setBounds(240, 35, -2, 605);
		panel_2.add(separator_91);

		JButton btnPage2fr3 = new JButton("Föregående");
		btnPage2fr3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPage2fr3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				panel_1.setVisible(true);
				panel_2.setVisible(false);
				panel_3.setVisible(false);
			}
		});
		btnPage2fr3.setBounds(10, 656, 110, 23);
		panel_2.add(btnPage2fr3);

		textField3_2_2 = new JTextField();
		textField3_2_2.setName("7510");
		textField3_2_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField3_2_2.setColumns(10);
		textField3_2_2.setBounds(260, 112, 100, 25);
		panel_2.add(textField3_2_2);

		JTextArea txtrHandelsvaror = new JTextArea();
		txtrHandelsvaror.setText("Handelsvaror");
		txtrHandelsvaror.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrHandelsvaror.setEditable(false);
		txtrHandelsvaror.setBackground(Color.WHITE);
		txtrHandelsvaror.setBounds(40, 255, 145, 22);
		panel_2.add(txtrHandelsvaror);

		JLabel label_16 = new JLabel("3.6");
		label_16.setHorizontalAlignment(SwingConstants.LEFT);
		label_16.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_16.setBounds(5, 256, 34, 14);
		panel_2.add(label_16);

		textField3_6 = new JTextField();
		textField3_6.setName("7512");
		textField3_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField3_6.setColumns(10);
		textField3_6.setBounds(260, 253, 100, 25);
		panel_2.add(textField3_6);

		JSeparator separator_93 = new JSeparator();
		separator_93.setBackground(Color.BLACK);
		separator_93.setBounds(0, 283, 367, 2);
		panel_2.add(separator_93);

		JTextArea txtrvrigaExternaKostnader = new JTextArea();
		txtrvrigaExternaKostnader.setText("Övriga externa kostnader");
		txtrvrigaExternaKostnader.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrvrigaExternaKostnader.setEditable(false);
		txtrvrigaExternaKostnader.setBackground(Color.WHITE);
		txtrvrigaExternaKostnader.setBounds(40, 290, 145, 22);
		panel_2.add(txtrvrigaExternaKostnader);

		JLabel label_61 = new JLabel("3.7");
		label_61.setHorizontalAlignment(SwingConstants.LEFT);
		label_61.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_61.setBounds(5, 291, 34, 14);
		panel_2.add(label_61);

		JSeparator separator_95 = new JSeparator();
		separator_95.setBackground(Color.BLACK);
		separator_95.setBounds(0, 319, 367, 2);
		panel_2.add(separator_95);

		JLabel label_82 = new JLabel("3.8");
		label_82.setHorizontalAlignment(SwingConstants.LEFT);
		label_82.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_82.setBounds(5, 328, 34, 14);
		panel_2.add(label_82);

		JTextArea txtrPersonalkostnader_1 = new JTextArea();
		txtrPersonalkostnader_1.setText("Personalkostnader");
		txtrPersonalkostnader_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrPersonalkostnader_1.setEditable(false);
		txtrPersonalkostnader_1.setBackground(Color.WHITE);
		txtrPersonalkostnader_1.setBounds(40, 327, 145, 22);
		panel_2.add(txtrPersonalkostnader_1);

		textField3_8 = new JTextField();
		textField3_8.setName("7514");
		textField3_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField3_8.setColumns(10);
		textField3_8.setBounds(260, 325, 100, 25);
		panel_2.add(textField3_8);

		JSeparator separator_96 = new JSeparator();
		separator_96.setBackground(Color.BLACK);
		separator_96.setBounds(0, 357, 367, 2);
		panel_2.add(separator_96);

		JLabel label_62 = new JLabel("3.9");
		label_62.setHorizontalAlignment(SwingConstants.LEFT);
		label_62.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_62.setBounds(5, 370, 34, 14);
		panel_2.add(label_62);

		JTextArea txtrPersonalkostnader = new JTextArea();
		txtrPersonalkostnader
				.setText("Av- och nedskrivningar av \r\nmateriella och immateriella \r\nanläggningstillgångar");
		txtrPersonalkostnader.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrPersonalkostnader.setEditable(false);
		txtrPersonalkostnader.setBackground(Color.WHITE);
		txtrPersonalkostnader.setBounds(40, 357, 145, 45);
		panel_2.add(txtrPersonalkostnader);

		textField3_9 = new JTextField();
		textField3_9.setName("7515");
		textField3_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField3_9.setColumns(10);
		textField3_9.setBounds(260, 369, 100, 25);
		panel_2.add(textField3_9);

		JTextArea txtrvrigaRrelsekostnader = new JTextArea();
		txtrvrigaRrelsekostnader.setText("Övriga rörelsekostnader");
		txtrvrigaRrelsekostnader.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrvrigaRrelsekostnader.setEditable(false);
		txtrvrigaRrelsekostnader.setBackground(Color.WHITE);
		txtrvrigaRrelsekostnader.setBounds(40, 464, 145, 23);
		panel_2.add(txtrvrigaRrelsekostnader);

		textField3_11 = new JTextField();
		textField3_11.setName("7517");
		textField3_11.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField3_11.setColumns(10);
		textField3_11.setBounds(260, 460, 100, 25);
		panel_2.add(textField3_11);

		JLabel label_83 = new JLabel("3.11");
		label_83.setHorizontalAlignment(SwingConstants.LEFT);
		label_83.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_83.setBounds(5, 465, 34, 14);
		panel_2.add(label_83);

		JSeparator separator_69 = new JSeparator();
		separator_69.setBounds(5, 651, 365, 2);
		panel_2.add(separator_69);

		JSeparator separator_97 = new JSeparator();
		separator_97.setBackground(Color.WHITE);
		separator_97.setOrientation(SwingConstants.VERTICAL);
		separator_97.setBounds(636, 0, 6, 650);
		panel_2.add(separator_97);

		JSeparator separator_98 = new JSeparator();
		separator_98.setBackground(Color.BLACK);
		separator_98.setBounds(596, 35, 165, 3);
		panel_2.add(separator_98);

		JSeparator separator_77 = new JSeparator();
		separator_77.setBackground(Color.BLACK);
		separator_77.setBounds(367, 163, 395, 2);
		panel_2.add(separator_77);

		JTextArea textArea = new JTextArea();
		textArea.setText("Fakturerad men ej upparbetad \r\nintäkt");
		textArea.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textArea.setEditable(false);
		textArea.setBackground(Color.WHITE);
		textArea.setBounds(425, 165, 152, 32);
		panel_2.add(textArea);

		JLabel label_66 = new JLabel("3.17");
		label_66.setHorizontalAlignment(SwingConstants.LEFT);
		label_66.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_66.setBounds(380, 173, 35, 14);
		panel_2.add(label_66);

		textField3_17 = new JTextField();
		textField3_17.setName("7522");
		textField3_17.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField3_17.setColumns(10);
		textField3_17.setBounds(653, 168, 100, 25);
		panel_2.add(textField3_17);

		textField3_24_2 = new JTextField();
		textField3_24_2.setName("7526");
		textField3_24_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField3_24_2.setColumns(10);
		textField3_24_2.setBounds(653, 443, 100, 25);
		panel_2.add(textField3_24_2);

		textField3_24 = new JTextField();
		textField3_24.setName("7421");
		textField3_24.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField3_24.setColumns(10);
		textField3_24.setBounds(653, 410, 100, 25);
		panel_2.add(textField3_24);

		JSeparator separator_99 = new JSeparator();
		separator_99.setBackground(Color.BLACK);
		separator_99.setBounds(597, 439, 165, 3);
		panel_2.add(separator_99);

		JLabel label_70 = new JLabel("3.24");
		label_70.setHorizontalAlignment(SwingConstants.LEFT);
		label_70.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_70.setBounds(380, 448, 37, 14);
		panel_2.add(label_70);

		JTextArea txtrFrndringAvveravskrivningar = new JTextArea();
		txtrFrndringAvveravskrivningar.setText("Förändring av överavskrivningar");
		txtrFrndringAvveravskrivningar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrFrndringAvveravskrivningar.setEditable(false);
		txtrFrndringAvveravskrivningar.setBackground(Color.WHITE);
		txtrFrndringAvveravskrivningar.setBounds(425, 448, 162, 22);
		panel_2.add(txtrFrndringAvveravskrivningar);

		JSeparator separator_100 = new JSeparator();
		separator_100.setBackground(Color.BLACK);
		separator_100.setBounds(367, 539, 395, 2);
		panel_2.add(separator_100);

		textField3_25_2 = new JTextField();
		textField3_25_2.setName("7527");
		textField3_25_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField3_25_2.setColumns(10);
		textField3_25_2.setBounds(652, 509, 100, 25);
		panel_2.add(textField3_25_2);

		JSeparator separator_101 = new JSeparator();
		separator_101.setBackground(Color.BLACK);
		separator_101.setBounds(596, 503, 165, 3);
		panel_2.add(separator_101);

		textField3_25 = new JTextField();
		textField3_25.setName("7422");
		textField3_25.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField3_25.setColumns(10);
		textField3_25.setBounds(652, 474, 100, 25);
		panel_2.add(textField3_25);

		JTextArea txtrvrigaBokslutsdispositioner = new JTextArea();
		txtrvrigaBokslutsdispositioner.setText("Övriga bokslutsdispositioner");
		txtrvrigaBokslutsdispositioner.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrvrigaBokslutsdispositioner.setEditable(false);
		txtrvrigaBokslutsdispositioner.setBackground(Color.WHITE);
		txtrvrigaBokslutsdispositioner.setBounds(425, 510, 162, 25);
		panel_2.add(txtrvrigaBokslutsdispositioner);

		JLabel label_71 = new JLabel("3.25");
		label_71.setHorizontalAlignment(SwingConstants.LEFT);
		label_71.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_71.setBounds(380, 510, 37, 14);
		panel_2.add(label_71);

		JLabel label_74 = new JLabel("3.26");
		label_74.setHorizontalAlignment(SwingConstants.LEFT);
		label_74.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_74.setBounds(380, 549, 35, 14);
		panel_2.add(label_74);

		JTextArea txtrSkattPrets = new JTextArea();
		txtrSkattPrets.setText("Skatt på årets resultat");
		txtrSkattPrets.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrSkattPrets.setEditable(false);
		txtrSkattPrets.setBackground(Color.WHITE);
		txtrSkattPrets.setBounds(425, 546, 152, 17);
		panel_2.add(txtrSkattPrets);

		textField3_26 = new JTextField();
		textField3_26.setName("7528");
		textField3_26.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField3_26.setColumns(10);
		textField3_26.setBounds(652, 544, 100, 25);
		panel_2.add(textField3_26);

		JSeparator separator_102 = new JSeparator();
		separator_102.setBackground(Color.BLACK);
		separator_102.setBounds(368, 573, 395, 2);
		panel_2.add(separator_102);

		JLabel label_78 = new JLabel("3.27");
		label_78.setHorizontalAlignment(SwingConstants.LEFT);
		label_78.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_78.setBounds(380, 586, 35, 14);
		panel_2.add(label_78);

		JTextArea txtrretsResultatVinst = new JTextArea();
		txtrretsResultatVinst.setText("Årets resultat, vinst \r\n(flyttas till p. 4.1)");
		txtrretsResultatVinst.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrretsResultatVinst.setEditable(false);
		txtrretsResultatVinst.setBackground(Color.WHITE);
		txtrretsResultatVinst.setBounds(425, 575, 130, 35);
		panel_2.add(txtrretsResultatVinst);

		textField3_27 = new JTextField();
		textField3_27.setName("7450");
		textField3_27.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField3_27.setColumns(10);
		textField3_27.setBounds(653, 580, 100, 25);
		panel_2.add(textField3_27);

		JSeparator separator_103 = new JSeparator();
		separator_103.setBackground(Color.BLACK);
		separator_103.setBounds(368, 610, 395, 2);
		panel_2.add(separator_103);

		JLabel label_84 = new JLabel("3.28");
		label_84.setHorizontalAlignment(SwingConstants.LEFT);
		label_84.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_84.setBounds(380, 623, 35, 14);
		panel_2.add(label_84);

		JTextArea txtrretsResultatFrlust = new JTextArea();
		txtrretsResultatFrlust.setText("Årets resultat, förlust\r\n(flyttas till p. 4.2) ");
		txtrretsResultatFrlust.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrretsResultatFrlust.setEditable(false);
		txtrretsResultatFrlust.setBackground(Color.WHITE);
		txtrretsResultatFrlust.setBounds(425, 612, 120, 35);
		panel_2.add(txtrretsResultatFrlust);

		textField3_28 = new JTextField();
		textField3_28.setName("7550");
		textField3_28.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField3_28.setColumns(10);
		textField3_28.setBounds(653, 617, 100, 25);
		panel_2.add(textField3_28);

		JSeparator separator_104 = new JSeparator();
		separator_104.setBounds(367, 650, 395, 2);
		panel_2.add(separator_104);

		JLabel label_85 = new JLabel("+");
		label_85.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_85.setBounds(225, 44, 16, 14);
		panel_2.add(label_85);

		JLabel label_86 = new JLabel("+");
		label_86.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_86.setBounds(225, 78, 16, 14);
		panel_2.add(label_86);

		JLabel label_88 = new JLabel("+");
		label_88.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_88.setBounds(225, 145, 16, 14);
		panel_2.add(label_88);

		JLabel label_89 = new JLabel("+");
		label_89.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_89.setBounds(225, 187, 16, 14);
		panel_2.add(label_89);

		JLabel label_90 = new JLabel("+");
		label_90.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_90.setBounds(225, 502, 16, 14);
		panel_2.add(label_90);

		JLabel label_91 = new JLabel("+");
		label_91.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_91.setBounds(225, 577, 16, 14);
		panel_2.add(label_91);

		JLabel label_92 = new JLabel("+");
		label_92.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_92.setBounds(610, 10, 16, 14);
		panel_2.add(label_92);

		JLabel label_93 = new JLabel("+");
		label_93.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_93.setBounds(610, 209, 16, 14);
		panel_2.add(label_93);

		JLabel label_95 = new JLabel("+");
		label_95.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_95.setBounds(610, 414, 16, 14);
		panel_2.add(label_95);

		JLabel label_96 = new JLabel("+");
		label_96.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_96.setBounds(610, 348, 16, 14);
		panel_2.add(label_96);

		JLabel label_97 = new JLabel("(+)");
		label_97.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_97.setBounds(565, 577, 29, 30);
		panel_2.add(label_97);

		JLabel label_98 = new JLabel("(-)");
		label_98.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_98.setBounds(569, 618, 25, 21);
		panel_2.add(label_98);

		JLabel label_99 = new JLabel("=");
		label_99.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_99.setBounds(610, 619, 16, 14);
		panel_2.add(label_99);

		JLabel label_100 = new JLabel("=");
		label_100.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_100.setBounds(610, 585, 16, 14);
		panel_2.add(label_100);

		JLabel label_101 = new JLabel("-");
		label_101.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_101.setBounds(227, 117, 16, 14);
		panel_2.add(label_101);

		JLabel label_102 = new JLabel("-");
		label_102.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_102.setBounds(227, 221, 16, 14);
		panel_2.add(label_102);

		JLabel label_103 = new JLabel("-");
		label_103.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_103.setBounds(227, 259, 16, 14);
		panel_2.add(label_103);

		JLabel label_104 = new JLabel("-");
		label_104.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_104.setBounds(227, 294, 16, 14);
		panel_2.add(label_104);

		JLabel label_105 = new JLabel("-");
		label_105.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_105.setBounds(227, 331, 16, 14);
		panel_2.add(label_105);

		JLabel label_106 = new JLabel("-");
		label_106.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_106.setBounds(227, 372, 16, 14);
		panel_2.add(label_106);

		JLabel label_107 = new JLabel("-");
		label_107.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_107.setBounds(227, 423, 16, 14);
		panel_2.add(label_107);

		JLabel label_108 = new JLabel("-");
		label_108.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_108.setBounds(227, 467, 16, 14);
		panel_2.add(label_108);

		JLabel label_109 = new JLabel("-");
		label_109.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_109.setBounds(227, 537, 16, 14);
		panel_2.add(label_109);

		JLabel label_110 = new JLabel("-");
		label_110.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_110.setBounds(227, 615, 16, 14);
		panel_2.add(label_110);

		JLabel label_111 = new JLabel("-");
		label_111.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_111.setBounds(612, 46, 16, 14);
		panel_2.add(label_111);

		JLabel label_113 = new JLabel("-");
		label_113.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_113.setBounds(612, 136, 16, 14);
		panel_2.add(label_113);

		JLabel label_114 = new JLabel("-");
		label_114.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_114.setBounds(612, 175, 16, 14);
		panel_2.add(label_114);

		JLabel label_115 = new JLabel("-");
		label_115.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_115.setBounds(612, 252, 16, 14);
		panel_2.add(label_115);

		JLabel label_116 = new JLabel("-");
		label_116.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_116.setBounds(612, 289, 16, 14);
		panel_2.add(label_116);

		JLabel label_117 = new JLabel("-");
		label_117.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_117.setBounds(612, 321, 16, 14);
		panel_2.add(label_117);

		JLabel label_118 = new JLabel("-");
		label_118.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_118.setBounds(612, 378, 16, 14);
		panel_2.add(label_118);

		JLabel label_119 = new JLabel("-");
		label_119.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_119.setBounds(612, 449, 16, 14);
		panel_2.add(label_119);

		JLabel label_121 = new JLabel("-");
		label_121.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_121.setBounds(612, 510, 16, 14);
		panel_2.add(label_121);

		JLabel label_122 = new JLabel("-");
		label_122.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_122.setBounds(612, 547, 16, 14);
		panel_2.add(label_122);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.BLACK);
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(249, 35, 9, 614);
		panel_2.add(separator_1);

		JLabel label_42 = new JLabel("+");
		label_42.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_42.setBounds(610, 83, 16, 14);
		panel_2.add(label_42);

		JLabel label_112 = new JLabel("+");
		label_112.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_112.setBounds(610, 478, 16, 14);
		panel_2.add(label_112);

		JButton btnPage4fr3 = new JButton("Nästa");
		btnPage4fr3.setBounds(663, 656, 89, 23);
		panel_2.add(btnPage4fr3);

		panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		firstPage.add(panel_3, "name_536297812370552");
		panel_3.setBackground(Color.WHITE);
		panel_3.setLayout(null);

		btnPage4fr3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				panel_1.setVisible(false);
				panel_2.setVisible(false);
				panel_3.setVisible(true);
			}
		});

		JLabel lblPersonuppgifter = new JLabel("Personuppgifter");
		lblPersonuppgifter.setBounds(10, 9, 178, 22);
		lblPersonuppgifter.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_3.add(lblPersonuppgifter);

		JLabel lblNewLabel_1 = new JLabel("Namn");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 48, 46, 14);
		panel_3.add(lblNewLabel_1);

		JSeparator separator_40 = new JSeparator();
		separator_40.setBackground(Color.BLACK);
		separator_40.setBounds(0, 40, 762, 2);
		panel_3.add(separator_40);

		textField_namn = new JTextField();
		textField_namn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_namn.setColumns(10);
		textField_namn.setBounds(192, 50, 442, 25);
		panel_3.add(textField_namn);

		JSeparator separator_92 = new JSeparator();
		separator_92.setOrientation(SwingConstants.VERTICAL);
		separator_92.setBackground(Color.BLACK);
		separator_92.setBounds(186, 0, 9, 690);
		panel_3.add(separator_92);

		JSeparator separator_105 = new JSeparator();
		separator_105.setBackground(Color.BLACK);
		separator_105.setBounds(0, 80, 762, 2);
		panel_3.add(separator_105);

		JSeparator separator_106 = new JSeparator();
		separator_106.setBackground(Color.BLACK);
		separator_106.setBounds(0, 160, 762, 2);
		panel_3.add(separator_106);

		JSeparator separator_107 = new JSeparator();
		separator_107.setBackground(Color.BLACK);
		separator_107.setBounds(0, 200, 762, 2);
		panel_3.add(separator_107);

		JSeparator separator_108 = new JSeparator();
		separator_108.setBackground(Color.BLACK);
		separator_108.setBounds(0, 240, 762, 2);
		panel_3.add(separator_108);

		JSeparator separator_109 = new JSeparator();
		separator_109.setBackground(Color.BLACK);
		separator_109.setBounds(0, 280, 762, 2);
		panel_3.add(separator_109);

		JLabel lblAdress = new JLabel("Adress");
		lblAdress.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAdress.setBounds(10, 96, 46, 14);
		panel_3.add(lblAdress);

		JLabel lblPostnummer = new JLabel("Postnummer");
		lblPostnummer.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPostnummer.setBounds(10, 170, 84, 14);
		panel_3.add(lblPostnummer);

		JLabel lblPostort = new JLabel("Postort");
		lblPostort.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPostort.setBounds(10, 210, 46, 14);
		panel_3.add(lblPostort);

		JLabel lblAvdelning = new JLabel("Avdelning");
		lblAvdelning.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAvdelning.setBounds(10, 250, 71, 14);
		panel_3.add(lblAvdelning);

		textField_adress = new JTextField();
		textField_adress.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_adress.setColumns(10);
		textField_adress.setBounds(192, 89, 442, 60);
		panel_3.add(textField_adress);

		textField_postnummer = new JTextField();
		textField_postnummer.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_postnummer.setColumns(10);
		textField_postnummer.setBounds(192, 170, 143, 25);
		panel_3.add(textField_postnummer);

		textField_postort = new JTextField();
		textField_postort.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_postort.setColumns(10);
		textField_postort.setBounds(192, 210, 442, 25);
		panel_3.add(textField_postort);

		textField_avdelning = new JTextField();
		textField_avdelning.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_avdelning.setColumns(10);
		textField_avdelning.setBounds(192, 250, 442, 25);
		panel_3.add(textField_avdelning);

		JSeparator separator_110 = new JSeparator();
		separator_110.setBackground(Color.BLACK);
		separator_110.setBounds(0, 320, 762, 2);
		panel_3.add(separator_110);

		JSeparator separator_111 = new JSeparator();
		separator_111.setBackground(Color.BLACK);
		separator_111.setBounds(0, 360, 762, 2);
		panel_3.add(separator_111);

		JSeparator separator_112 = new JSeparator();
		separator_112.setBackground(Color.BLACK);
		separator_112.setBounds(0, 400, 762, 2);
		panel_3.add(separator_112);

		JSeparator separator_113 = new JSeparator();
		separator_113.setBackground(Color.BLACK);
		separator_113.setBounds(0, 440, 762, 2);
		panel_3.add(separator_113);

		JLabel lblKontakt = new JLabel("Kontakt");
		lblKontakt.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblKontakt.setBounds(10, 290, 71, 14);
		panel_3.add(lblKontakt);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEmail.setBounds(10, 330, 71, 14);
		panel_3.add(lblEmail);

		JLabel lblTelefon = new JLabel("Telefon");
		lblTelefon.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTelefon.setBounds(10, 370, 71, 14);
		panel_3.add(lblTelefon);

		JLabel lblFax = new JLabel("Fax");
		lblFax.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFax.setBounds(10, 410, 71, 14);
		panel_3.add(lblFax);

		textField_kontakt = new JTextField();
		textField_kontakt.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_kontakt.setColumns(10);
		textField_kontakt.setBounds(192, 290, 442, 25);
		panel_3.add(textField_kontakt);

		textField_email = new JTextField();
		textField_email.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_email.setColumns(10);
		textField_email.setBounds(192, 330, 442, 25);
		panel_3.add(textField_email);

		textField_telefon = new JTextField();
		textField_telefon.setName("7410");
		textField_telefon.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_telefon.setColumns(10);
		textField_telefon.setBounds(192, 370, 442, 25);
		panel_3.add(textField_telefon);

		textField_fax = new JTextField();
		textField_fax.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_fax.setColumns(10);
		textField_fax.setBounds(192, 410, 442, 25);
		panel_3.add(textField_fax);

		JButton btnPage3fr4 = new JButton("Föregående");
		btnPage3fr4.setBounds(5, 656, 110, 23);
		panel_3.add(btnPage3fr4);
		btnPage3fr4.setFont(new Font("Tahoma", Font.BOLD, 11));

		btnPage3fr4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				panel_1.setVisible(false);
				panel_2.setVisible(true);
				panel_3.setVisible(false);
			}
		});

		JButton btnControl = new JButton("Kontrollera");
		btnControl.setBounds(659, 853, 100, 23);
		frame.getContentPane().add(btnControl);
		btnControl.setFont(new Font("Tahoma", Font.BOLD, 11));

		btnControl.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				initializeLists();

				ArrayList<JTextField> wrongList = textcontroller.checkTextFields(numericAList, numericBList, fieldList,
						personuppgiftsList, period);

				for (int i = 0; i < wrongList.size(); i++)
					wrongList.get(i).setBackground(Color.RED);
				
				if(comboBox.getSelectedItem() == "Välj period")
					comboBox.setBackground(Color.RED);
				else
					comboBox.setBackground(Color.WHITE);
				
				for (int i = 0; i < textcontroller.getCorrectList().size(); i++)
					textcontroller.getCorrectList().get(i).setBackground(Color.WHITE);

				if (wrongList.size() > 0)
					javax.swing.JOptionPane.showMessageDialog(frame,
							"Kolla på hjälpsidan för mer information om hur fälten ska vara ifyllda");
			}
		});

		createFilesItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//textcontroller.checkTextFields(numericAList, numericBList, fieldList, personuppgiftsList);
				//if (textcontroller.canCreateFiles() == true) {
					initializeLists();
					period = comboBox.getSelectedItem().toString();
					createFilesListener.save(numericAList, numericBList, fieldList, personuppgiftsList, period);
					try {
						createFilesListener.createFiles();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				//} else {
				//	javax.swing.JOptionPane.showMessageDialog(frame, "Alla textfält är inte korrekt ifyllda");
				//}
			}
		});
		showFilesItem.addActionListener(new ShowFilesListener());
		getFilesItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				initializeLists();
				getFilesListener.save(numericAList, numericBList, fieldList, personuppgiftsList);
				try {
					getFilesListener.readFromFiles();
				} catch (IOException e1) {
					e1.printStackTrace();
				}

				for (int i = 0; i < getFilesListener.getUppgiftsList().size(); i++) {
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7201"))
						textField2_1.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7202"))
						textField2_2.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7214"))
						textField2_3.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7215"))
						textField2_4.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7216"))
						textField2_5.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7217"))
						textField2_6.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7230"))
						textField2_7.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7231"))
						textField2_8.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7232"))
						textField2_9.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7233"))
						textField2_10.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7234"))
						textField2_11.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7235"))
						textField2_12.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7241"))
						textField2_13.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7242"))
						textField2_14.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7243"))
						textField2_15.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7244"))
						textField2_16.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7245"))
						textField2_17.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7246"))
						textField2_18.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7251"))
						textField2_19.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7252"))
						textField2_20.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7261"))
						textField2_21.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7262"))
						textField2_22.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7263"))
						textField2_23.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7270"))
						textField2_24.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7271"))
						textField2_25.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7281"))
						textField2_26.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7301"))
						textField2_27.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7302"))
						textField2_28.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7321"))
						textField2_29.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7322"))
						textField2_30.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7323"))
						textField2_31.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7331"))
						textField2_32.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7332"))
						textField2_33.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7333"))
						textField2_34.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7350"))
						textField2_35.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7351"))
						textField2_36.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7352"))
						textField2_37.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7353"))
						textField2_38.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7354"))
						textField2_39.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7360"))
						textField2_40.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7361"))
						textField2_41.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7362"))
						textField2_42.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7363"))
						textField2_43.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7364"))
						textField2_44.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7365"))
						textField2_45.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7366"))
						textField2_46.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7367"))
						textField2_47.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7368"))
						textField2_48.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7369"))
						textField2_49.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7370"))
						textField2_50.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7410"))
						textField3_1.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7411"))
						textField3_2.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7510"))
						textField3_2_2.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7412"))
						textField3_3.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7413"))
						textField3_4.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7511"))
						textField3_5.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7512"))
						textField3_6.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7513"))
						textField3_7.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7514"))
						textField3_8.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7515"))
						textField3_9.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7516"))
						textField3_10.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7517"))
						textField3_11.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7414"))
						textField3_12.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7518"))
						textField3_12_2.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7415"))
						textField3_13.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7519"))
						textField3_13_2.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7416"))
						textField3_14.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7520"))
						textField3_14_2.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7417"))
						textField3_19.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7521"))
						textField3_20.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7522"))
						textField3_21.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7418"))
						textField3_22.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7523"))
						textField3_23.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7524"))
						textField3_24.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7419"))
						textField3_25.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7420"))
						textField3_26.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7525"))
						textField2_3.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7421"))
						textField3_24.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7526"))
						textField3_24_2.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7422"))
						textField3_25.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7527"))
						textField3_25_2.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7528"))
						textField3_26.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7450"))
						textField3_27.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
					if (getFilesListener.getUppgiftsList().get(i).substring(0, 4).equals("7550"))
						textField3_28.setText(getFilesListener.getUppgiftsList().get(i).substring(5,
								getFilesListener.getUppgiftsList().get(i).length()));
				}

				for (int i = 0; i < getFilesListener.getInfoList().size(); i++) {
					if (getFilesListener.getInfoList().get(i).substring(0, 7).equals("#SKAPAD")) {
						textField_fom.setText(getFilesListener.getInfoList().get(i).substring(8, 16));
						textField_tom.setText(getFilesListener.getInfoList().get(i).substring(17,
								getFilesListener.getInfoList().get(i).length()));
					}
					if (getFilesListener.getInfoList().get(i).substring(0, 5).equals("#NAMN"))
						textField_namn.setText(getFilesListener.getInfoList().get(i).substring(5,
								getFilesListener.getInfoList().get(i).length()));
					if(getFilesListener.getInfoList().get(i).substring(0, 7).equals("#ADRESS"))
						textField_adress.setText(getFilesListener.getInfoList().get(i).substring(8, getFilesListener.getInfoList().get(i).length()));
					if(getFilesListener.getInfoList().get(i).substring(0, 7).equals("#POSTNR"))
						textField_adress.setText(getFilesListener.getInfoList().get(i).substring(7, getFilesListener.getInfoList().get(i).length()));
					if(getFilesListener.getInfoList().get(i).substring(0, 8).equals("#POSTORT"))
						textField_adress.setText(getFilesListener.getInfoList().get(i).substring(9, getFilesListener.getInfoList().get(i).length()));
					if(getFilesListener.getInfoList().get(i).substring(0, 10).equals("#AVDELNING"))
						textField_adress.setText(getFilesListener.getInfoList().get(i).substring(11, getFilesListener.getInfoList().get(i).length()));
					if(getFilesListener.getInfoList().get(i).substring(0, 8).equals("#KONTAKT"))
						textField_adress.setText(getFilesListener.getInfoList().get(i).substring(9, getFilesListener.getInfoList().get(i).length()));
					if(getFilesListener.getInfoList().get(i).substring(0, 6).equals("#EMAIL"))
						textField_adress.setText(getFilesListener.getInfoList().get(i).substring(7, getFilesListener.getInfoList().get(i).length()));
					if(getFilesListener.getInfoList().get(i).substring(0, 8).equals("#TELEFON"))
						textField_adress.setText(getFilesListener.getInfoList().get(i).substring(9, getFilesListener.getInfoList().get(i).length()));
					if(getFilesListener.getInfoList().get(i).substring(0, 4).equals("#FAX"))
						textField_adress.setText(getFilesListener.getInfoList().get(i).substring(5, getFilesListener.getInfoList().get(i).length()));
					
				}
			}
		});

		submitFilesItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (Desktop.isDesktopSupported()) {
					try {
						Desktop.getDesktop().browse(new URI(
								"https://www.skatteverket.se/foretagochorganisationer/sjalvservice/allaetjanster/tjanster/filoverforing.4.1f604301062bf0c47e8000527.html"));
					} catch (IOException e1) {
						e1.printStackTrace();
					} catch (URISyntaxException e2) {
						e2.printStackTrace();
					}
				}
			}
		});

		helpItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (Desktop.isDesktopSupported()) {
					try {
						Desktop.getDesktop().browse(new URI(
								"https://www.skatteverket.se/download/18.64a656d113f4c75970147da/1378299381180/SKV269_20_10.pdf"));
					} catch (IOException e1) {
						e1.printStackTrace();
					} catch (URISyntaxException e2) {
						e2.printStackTrace();
					}
				}
			}
		});

		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public void initializeLists() {
		numericAList.add(textField2_27);
		numericAList.add(textField2_28);
		numericAList.add(textField2_29);
		numericAList.add(textField2_30);

		numericAList.add(textField2_31);
		numericAList.add(textField2_32);
		numericAList.add(textField2_33);
		numericAList.add(textField2_34);
		numericAList.add(textField2_38);
		numericAList.add(textField2_35);
		numericAList.add(textField2_36);
		numericAList.add(textField2_37);
		numericAList.add(textField2_1);
		numericAList.add(textField2_2);
		numericAList.add(textField2_3);
		numericAList.add(textField2_4);
		numericAList.add(textField2_5);
		numericAList.add(textField2_6);
		numericAList.add(textField2_7);
		numericAList.add(textField2_8);
		numericAList.add(textField2_9);
		numericAList.add(textField2_10);
		numericAList.add(textField2_11);
		numericAList.add(textField2_12);
		numericAList.add(textField2_16);
		numericAList.add(textField2_13);
		numericAList.add(textField2_14);
		numericAList.add(textField2_15);
		numericAList.add(textField2_17);
		numericAList.add(textField2_20);
		numericAList.add(textField2_19);
		numericAList.add(textField2_22);
		numericAList.add(textField2_23);
		numericAList.add(textField2_24);
		numericAList.add(textField2_25);
		numericAList.add(textField2_26);
		numericAList.add(textField2_43);
		numericAList.add(textField2_40);
		numericAList.add(textField2_41);
		numericAList.add(textField2_42);
		numericAList.add(textField2_44);
		numericAList.add(textField2_46);
		numericAList.add(textField2_49);
		numericAList.add(textField2_50);
		numericAList.add(textField2_45);
		numericAList.add(textField2_47);
		numericAList.add(textField2_48);
		numericAList.add(textField3_1);
		numericAList.add(textField2_18);
		numericAList.add(textField2_21);
		numericAList.add(textField3_2);
		numericAList.add(textField3_3);
		numericAList.add(textField2_39);
		numericAList.add(textField3_4);
		numericAList.add(textField3_5);
		numericAList.add(textField3_7);
		numericAList.add(textField3_9);
		numericAList.add(textField3_10);
		numericAList.add(textField3_12);
		numericAList.add(textField3_12_2);
		numericAList.add(textField3_13);
		numericAList.add(textField3_17);
		numericAList.add(textField3_14_2);
		numericAList.add(textField3_15);
		numericAList.add(textField3_16);
		numericAList.add(textField3_18);
		numericAList.add(textField3_20);
		numericAList.add(textField3_24_2);
		numericAList.add(textField3_19);
		numericAList.add(textField3_21);
		numericAList.add(textField3_13_2);
		numericAList.add(textField3_14);
		numericAList.add(textField3_2_2);
		numericAList.add(textField3_6);
		numericAList.add(textField3_11);
		numericAList.add(textField3_24);
		numericAList.add(textField3_25_2);
		numericAList.add(textField3_25);
		numericAList.add(textField3_26);
		numericAList.add(textField3_8);

		numericBList.add(textField3_22);
		numericBList.add(textField3_23);
		numericBList.add(textField3_27);
		numericBList.add(textField3_28);

		fieldList.add(textField_PersOrgnr);
		fieldList.add(textField_Datframst);
		fieldList.add(textField_fom);
		fieldList.add(textField_tom);

		personuppgiftsList.add(textField_namn);
		personuppgiftsList.add(textField_adress);
		personuppgiftsList.add(textField_postnummer);
		personuppgiftsList.add(textField_postort);
		personuppgiftsList.add(textField_avdelning);
		personuppgiftsList.add(textField_kontakt);
		personuppgiftsList.add(textField_email);
		personuppgiftsList.add(textField_telefon);
		personuppgiftsList.add(textField_fax);
	}

	public ArrayList<JTextField> getNumericAList() {
		return numericAList;
	}

	public ArrayList<JTextField> getNumericBList() {
		return numericBList;
	}

	public ArrayList<JTextField> getFieldList() {
		return fieldList;
	}

	public ArrayList<JTextField> getPersonuppgiftsList() {
		return personuppgiftsList;
	}
}
