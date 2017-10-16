package se.hig.cn.model;

import java.util.ArrayList;
import java.util.List;

public class FileCreator {

	List<String> blanketterList = new ArrayList<>();
	List<String> infoList = new ArrayList<>();

	public FileCreator() {
		createStructureForFile();
	}

	public void createStructureForFile() {
		infoList.add("#DATABESKRIVNINGSTART");
		infoList.add("#PRODUKT");
		infoList.add("#PERIOD");
		infoList.add("#MEDIAID");
		infoList.add("#SKAPAD");
		infoList.add("#PROGRAM");
		infoList.add("#FILNAMN");
		infoList.add("#DATABESKRIVNINGSLUT");
		infoList.add("#MEDIELEV");
		infoList.add("#ORGNR");
		infoList.add("#NAMN");
		infoList.add("#ADRESS");
		infoList.add("#POSTNR");
		infoList.add("#POSTORT");
		infoList.add("#AVDELNING");
		infoList.add("#KONTAKT");
		infoList.add("#EMAIL");
		infoList.add("#TELEFON");
		infoList.add("#FAX");
		infoList.add("#MEDIELEVSLUT");
		
		blanketterList.add("#BLANKETT");
		blanketterList.add("#IDENTITET");
		blanketterList.add("#DATABESKRIVNING");
		blanketterList.add("#PRODUKT");
		blanketterList.add("#PERIOD");
		blanketterList.add("#MEDIAID");
		blanketterList.add("#SKAPAD");
		blanketterList.add("#PROGRAM");
		blanketterList.add("#FILNAMN");
		blanketterList.add("#DATABESKRIVNNG");
		blanketterList.add("#MEDIELEV");
		blanketterList.add("#ORGNR");
		blanketterList.add("#NAMN");
		blanketterList.add("#ADRESS");
		blanketterList.add("#POSTNR");
		blanketterList.add("#POSTORT");
		blanketterList.add("#AVDELNING");
		blanketterList.add("#KONTAKT");
		blanketterList.add("#EMAIL");
		blanketterList.add("#TELEFON");
		blanketterList.add("#FAX");
		blanketterList.add("#MEDIELEV");
	}
	
	public List<String> getInfoList() {
		return infoList;
	}

	public List<String> getBlanketterList() {
		return blanketterList;
	}
}
