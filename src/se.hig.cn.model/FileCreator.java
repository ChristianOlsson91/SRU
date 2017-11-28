package se.hig.cn.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Denna klass tillhandahåller inlägg av poster och har metoder för att returnera listorna.
 * 
 * @author Christian Olsson, Nicolas Suau Carvajal
 * @version 2017-10-16
 */
public class FileCreator {

	List<String> blanketterList = new ArrayList<>();
	List<String> infoList = new ArrayList<>();

	public FileCreator() {
		initializeLists();
	}

	public void initializeLists() {
		infoList.add("#DATABESKRIVNING_START");
		infoList.add("#PRODUKT SRU");
		infoList.add("#PERIOD");
		infoList.add("#MEDIAID DISK 12");
		infoList.add("#SKAPAD");
		infoList.add("#PROGRAM SRUCreator");
		infoList.add("#FILNAMN BLANKETTER.SRU");
		infoList.add("#DATABESKRIVNING_SLUT");
		infoList.add("#MEDIELEV_START");
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
		infoList.add("#MEDIELEV_SLUT");
		
		blanketterList.add("#BLANKETT INK2R-");
		blanketterList.add("#IDENTITET");
		blanketterList.add("#NAMN");
		blanketterList.add("#SYSTEMINFO");
		blanketterList.add("#BLANKETTSLUT");
		blanketterList.add("#FIL_SLUT");
	}
	
	public List<String> getInfoList() {
		return infoList;
	}

	public List<String> getBlanketterList() {
		return blanketterList;
	}
}
