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
	List<String> ink2r = new ArrayList<>();

	public FileCreator() {
		initializeLists();
	}

	public void initializeLists() {
		infoList.add("#DATABESKRIVNING_START");
		infoList.add("#PRODUKT SRU");
		infoList.add("#MEDIAID");
		infoList.add("#SKAPAD");
		infoList.add("#PROGRAM");
		infoList.add("#FILNAMN");
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
		
		blanketterList.add("#BLANKETT");
		blanketterList.add("#IDENTITET");
		blanketterList.add("#DATABESKRIVNING");
		blanketterList.add("#PRODUKT");
		blanketterList.add("#PERIOD");
		blanketterList.add("#MEDIAID");
		blanketterList.add("#SKAPAD");
		blanketterList.add("#PROGRAM");
		blanketterList.add("#FILNAMN BLANKETTER.SRU");
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
		
		ink2r.add("Räkenskapsår");
		ink2r.add("Fr.o.m.");
		ink2r.add("T.o.m.");
		ink2r.add("Organisationsnummer");
		ink2r.add("Datum när blanketten fylls i");
		ink2r.add("Tillgångar/Anläggningstillgångar");
		ink2r.add("Immateriella anläggningstillgångar\r\n" + 
				"2.1 Koncessioner, patent, licenser,\r\n" + 
				"varumärken, hyresrätter, goodwill\r\n" + 
				"och liknande rättigheter");
		ink2r.add("Materiella anläggningstillgångar\r\n" + 
				"2.3 Byggnader och mark");
		ink2r.add("2.4 Maskiner, inventarier och övriga\r\n" + 
				"materiella anläggningstillgångar");
		ink2r.add("2.5 Förbättringsutgifter på annans fastighet");
		ink2r.add("2.6 Pågående nyanläggningar och förskott\r\n" + 
				"avseende materiella anläggningstillgångar");
		ink2r.add("Finansiella anläggningstillgångar\r\n" + 
				"2.7 Andelar i koncernföretag");
		ink2r.add("2.8 Andelar i intresseföretag");
		ink2r.add("2.9 Fordringar hos koncern- och\r\n" + 
				"intresseföretag");
		ink2r.add("2.10 Andra långfristiga värdepappersinnehav");
		ink2r.add("2.11 Lån till delägare eller närstående");
		ink2r.add("2.12 Andra långfristiga fordringar");
		ink2r.add("Omsättningstillgångar");
		ink2r.add("Varulager\r\n" + 
				"2.13 Råvaror och förnödenheter");
		ink2r.add("2.14 Varor under tillverkning");
		ink2r.add("2.15 Färdiga varor och handelsvaror");
		ink2r.add("2.16 Övriga lagertillgångar");
		ink2r.add("2.17 Pågående arbeten för annans räkning");
		ink2r.add("2.18 Förskott till leverantörer");
		ink2r.add("Kortfristiga fordringar\r\n" + 
				"2.19 Kundfordringar");
		ink2r.add("2.20 Fordringar hos koncern- och\r\n" + 
				"intresseföretag");
		ink2r.add("2.21 Övriga fordringar");
		ink2r.add("2.22 Upparbetad men ej fakturerad intäkt");
		ink2r.add("2.23 Förutbetalda kostnader och upplupna\r\n" + 
				"intäkter");
		ink2r.add("Kortfristiga placeringar\r\n" + 
				"2.24 Andelar i koncernföretag");
		ink2r.add("2.25 Övriga kortfristiga placeringar");
		ink2r.add("Kassa och bank\r\n" + 
				"2.26 Kassa, bank och redovisningsmedel");
		ink2r.add("Räkenskapsschema");
		ink2r.add("Inkomstdeklaration 2");
		ink2r.add("Organisationsnummer");
		ink2r.add("Datum när blanketten fylls i");
		ink2r.add("Eget kapital");
		ink2r.add("2.27 Bundet eget kapital");
		ink2r.add("2.28 Fritt eget kapital");
		ink2r.add("Obeskattade reserver och avsättningar");
		ink2r.add("Obeskattade reserver\r\n" + 
				"2.29 Periodiseringsfonder");
		ink2r.add("2.30 Ackumulerade överavskrivningar");
		ink2r.add("2.31 Övriga obeskattade reserver");
		ink2r.add("Avsättningar\r\n" + 
				"2.32 Avsättningar för pensioner och liknande\r\n" + 
				"förpliktelser enligt lag (1967:531) om\r\n" + 
				"tryggande av pensionsutfästelse m.m.");
		ink2r.add("2.33 Övriga avsättningar för pensioner och\r\n" + 
				"liknande förpliktelser");
		ink2r.add("2.34 Övriga avsättningar");
		ink2r.add("Skulder");
		ink2r.add("Långfristiga skulder\r\n" + 
				"2.35 Obligationslån");
		ink2r.add("2.36 Checkräkningskredit");
		ink2r.add("2.37 Övriga skulder till kreditinstitut");
		ink2r.add("2.38 Skulder till koncern- och intresseföretag");
		ink2r.add("2.39 Övriga skulder");
		ink2r.add("Kortfristiga skulder\r\n" + 
				"2.40 Checkräkningskredit");
		ink2r.add("2.41 Övriga skulder till kreditinstitut");
		ink2r.add("2.42 Förskott från kunder");
		ink2r.add("2.43 Pågående arbeten för annans räkning");
		ink2r.add("2.44 Fakturerad men ej upparbetad intäkt");
		ink2r.add("2.45 Leverantörsskulder");
		ink2r.add("2.46 Växelskulder");
		ink2r.add("2.47 Skulder till koncern- och intresseföretag");
		ink2r.add("2.48 Skatteskulder");
		ink2r.add("2.49 Övriga skulder");
		ink2r.add("2.50 Upplupna kostnader och förutbetalda\r\n" + 
				"intäkter");
		ink2r.add("Räkenskapsår");
		ink2r.add("Fr.o.m.");
		ink2r.add("T.o.m.");
		ink2r.add("Organisationsnummer");
		ink2r.add("Datum när blanketten fylls i");
		ink2r.add("Resultaträkning");
		ink2r.add("3.1 Nettoomsättning");
		ink2r.add("3.2 Förändring av lager av produkter i\r\n" + 
				"arbete, färdiga varor och pågående\r\n" + 
				"arbete för annans räkning");
		ink2r.add("3.3 Aktiverat arbete för egen räkning");
		ink2r.add("3.4 Övriga rörelseintäkter");
		ink2r.add("3.5 Råvaror och förnödenheter");
		ink2r.add("3.6 Handelsvaror");
		ink2r.add("3.7 Övriga externa kostnader");
		ink2r.add("3.8 Personalkostnader");
		ink2r.add("3.9 Av- och nedskrivningar av materiella\r\n" + 
				"och immateriella anläggningstillgångar");
		ink2r.add("3.10 Nedskrivningar av omsättningstillgångar\r\n" + 
				"utöver normala nedskrivningar");
		ink2r.add("3.11 Övriga rörelsekostnader");
		ink2r.add("3.12 Resultat från andelar i koncernföretag");
		ink2r.add("3.13 Resultat från andelar i intresseföretag");
		ink2r.add("3.14 Resultat från övriga finansiella\r\n" + 
				"anläggningstillgångar");
		ink2r.add("Resultaträkning (forts.)");
		ink2r.add("3.15 Övriga ränteintäkter och liknande\r\n" + 
				"resultatposter");
		ink2r.add("3.16 Nedskrivningar av finansiella anläggningstillgångar\r\n" + 
				"och kortfristiga placeringar");
		ink2r.add("3.17 Räntekostnader och liknande\r\n" + 
				"resultatposter");
		ink2r.add("3.18 Extraordinära intäkter");
		ink2r.add("3.19 Extraordinära kostnader");
		ink2r.add("3.20 Lämnade koncernbidrag");
		ink2r.add("3.21 Mottagna koncernbidrag");
		ink2r.add("3.22 Återföring av periodiseringsfond");
		ink2r.add("3.23 Avsättning till periodiseringsfond");
		ink2r.add("3.24 Förändring av överavskrivningar");
		ink2r.add("3.25 Övriga bokslutsdispositioner");
		ink2r.add("3.26 Skatt på årets resultat");
		ink2r.add("3.27 Årets resultat, vinst (flyttas till\r\n" + 
				"p. 4.1) (+)");
		ink2r.add("3.28 Årets resultat, förlust (flyttas till\r\n" + 
				"p. 4.2) (-)");
	}
	
	public List<String> getInfoList() {
		return infoList;
	}

	public List<String> getBlanketterList() {
		return blanketterList;
	}
	
	public List<String> getInk2r() {
		return ink2r;
	}	
}