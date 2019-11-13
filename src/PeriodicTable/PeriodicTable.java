package PeriodicTable;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import type.AtomicElement;

public class PeriodicTable{
    private static char nk = 'u';
    private static char l  = 'l';
    private static char g  = 'g';
    private static char s =  's';
    public static final AtomicElement[] elements = new AtomicElement[] { 
        new AtomicElement(  0, "UnKnow","UnKnow","UnKnow",nk),
        new AtomicElement(  1, "H","HYDROGEN","ไฮโดรเจน",g),
        new AtomicElement(  2, "He","HELIUM" ,"ลิเทียม" ,g),
        new AtomicElement(  3, "Li","LITHIUM","ลิเทียม",s),
        new AtomicElement(  4, "Be","BERYLLIUM","เบริลเลียม",s),
        new AtomicElement(  5, "B","BORON","โบรอน",s), 
        new AtomicElement(  6, "C","CARBON","คาร์บอน",s), 
        new AtomicElement(  7, "N","NITROGEN","ไนโตรเจน",g), 
        new AtomicElement(  8, "O","OXYGEN","ออกซิเจน",g), 
        new AtomicElement(  9, "F","FLUORINE","ฟลูออรีน",g), 
        new AtomicElement( 10, "Ne","NEON","นีออน",g), 
        new AtomicElement( 11, "Na","SODIUM","โซเดียม",s),
        new AtomicElement( 12, "Mg","MAGNESIUM","แมกนีเซียม",s),
        new AtomicElement( 13, "Al","MAGNESIUM","อะลูมิเนียม",s), 
        new AtomicElement( 14, "Si","SILICON","ซิลิกอน",s), 
        new AtomicElement( 15, "P","PHOSPHORUS","ฟอสฟอรัส",g), 
        new AtomicElement( 16, "S","SULPHUR","กำมะถัน",g), 
        new AtomicElement( 17, "Cl","CHLORINE","คลอรีน",g), 
        new AtomicElement( 18, "Ar","ARGON","อาร์กอน",g), 
        new AtomicElement( 19, "K","POTASSIUM","โพแทสเซียม",s), 
        new AtomicElement( 20, "Ca","CALCIUM","แคลเซียม",s), 
        new AtomicElement( 21, "Sc","SCANDIUM","สแกนเดียม",s), 
        new AtomicElement( 22, "Ti","TITANIUM","ไทเทเนียม",s), 
        new AtomicElement( 23, "V","VANADIUM","วาเนเดียม",s), 
        new AtomicElement( 24, "Cr","CHROMIUM","โครเมียม",s), 
        new AtomicElement( 25, "Mn","MANGANESE","แมงกานีส",s),
        new AtomicElement( 26, "Fe","IRON","เหล็ก ",s),
        new AtomicElement( 27, "Co","COBALT","โคบอลต์",s), 
        new AtomicElement( 28, "Ni","NICKEL","นิกเกิล",s), 
        new AtomicElement( 29, "Cu","COPPER","ทองแดง",s), 
        new AtomicElement( 30, "Zn","ZINC","สังกะสี",s), 
        new AtomicElement( 31, "Ga","GALLIUM","แกลเลียม",s), 
        new AtomicElement( 32, "Ge","GERMANIUM","เจอร์เม­เนียม",s), 
        new AtomicElement( 33, "As","ARSENIC","สารหนู",s), 
        new AtomicElement( 34, "Se","SELENIUM","ซีลีเนียม",s), 
        new AtomicElement( 35, "Br","BROMINE","โบรมีน",l), 
        new AtomicElement( 36, "Kr","KRYPTON","คริปทอน",g), 
        new AtomicElement( 37, "Rb","RUBIDIUM","รูบิเดียม",s),
        new AtomicElement( 38, "Sr","STRONTIUM","สตรอนเซียม",s), 
        new AtomicElement( 39, "Y","YTTRIUM","อิตเทรียม",s), 
        new AtomicElement( 40, "Zr","ZIRCONIUM","เซอร์โคเนียม",s), 
        new AtomicElement( 41, "Nb","NIOBIUM","ไนโอเบียม",s), 
        new AtomicElement( 42, "Mo","MOLYBDENUM","โมลิบดีนัม",s), 
        new AtomicElement( 43, "Tc","TECHNETIUM","เทคนีเชียม",s), 
        new AtomicElement( 44, "Ru","RUTHENIUM","รูทีเนียม",s), 
        new AtomicElement( 45, "Rh","RHODIUM","โรเดียม",s), 
        new AtomicElement( 46, "Pd","PALLADIUM","แพลเลเดียม",s), 
        new AtomicElement( 47, "Ag","SILVER","เงิน",s), 
        new AtomicElement( 48, "Cd","CADMIUM","แคดเมียม",s), 
        new AtomicElement( 49, "In","INDIUM","อินเดียม",s), 
        new AtomicElement( 50, "Sn","TIN","ดีบุก",s), 
        new AtomicElement( 51, "Sb","ANTIMONY","พลวง",s), 
        new AtomicElement( 52, "Te","TELLURIUM","เทลลู­เรียม",s), 
        new AtomicElement( 53, "I","IODINE","ไอโอดีน",s), 
        new AtomicElement( 54, "Xe","XENON","ซีนอน",g), 
        new AtomicElement( 55, "Cs","CESIUM","ซีเซียม",s), 
        new AtomicElement( 56, "Ba","BARIUM","แบเรียม",s), 
        new AtomicElement( 57, "La","LANTHANUM","แลนทานัม",s), 
        new AtomicElement( 58, "Ce","CERIUM","ซีเรียม",s), 
        new AtomicElement( 59, "Pr","PRASEODYMIUM","เพรซิโอดีเมียม",s), 
        new AtomicElement( 60, "Nd","NEODYMIUM","นีโอดีเมียม",s), 
        new AtomicElement( 61, "Pm","PROMETHIUM","โพรมีเทียม",s), 
        new AtomicElement( 62, "Sm","SAMARIUM","ซาแมเรียม",s), 
        new AtomicElement( 63, "Eu","EUROPIUM","ยูโรเพียม",s), 
        new AtomicElement( 64, "Gd","GADOLINIUM","แกโดลิเนียม",s), 
        new AtomicElement( 65, "Tb","TERBIUM","เทอร์เบียม",s), 
        new AtomicElement( 66, "Dy","DYSPROSIUM","ดิสโพรเซียม",s), 
        new AtomicElement( 67, "Ho","HOLMIUM","โฮลเมียม",s), 
        new AtomicElement( 68, "Er","ERBIUM","เออร์เบียม",s), 
        new AtomicElement( 69, "Tm","THULIUM","ทูเลียม",s), 
        new AtomicElement( 70, "Yb","YTTERBIUM","อิตเทอร์เบียม",s), 
        new AtomicElement( 71, "Lu","LUTETIUM","ลูทีเชียม",s), 
        new AtomicElement( 72, "Hf","HAFNIUM","แฮฟเนียม",s), 
        new AtomicElement( 73, "Ta","TANTALUM","แทนทาลัม",s), 
        new AtomicElement( 74, "W","WOLFRAM","ทังสเตน",s), 
        new AtomicElement( 75, "Re","RHENIUM","รีเนียม",s), 
        new AtomicElement( 76, "Os","OSMIUM","ออสเมียม",s), 
        new AtomicElement( 77, "Ir","IRIDIUM","อิริเดียม",s), 
        new AtomicElement( 78, "Pt","PLATINUM","แพลต­ทินัม",s), 
        new AtomicElement( 79, "Au","GOLD","ทองคำ",s), 
        new AtomicElement( 80, "Hg","MERCURY","ปรอท",l), 
        new AtomicElement( 81, "Tl","THALLIUM","แทลเลียม",s), 
        new AtomicElement( 82, "Pb","LEAD","ตะกั่ว",s), 
        new AtomicElement( 83, "Bi","BISMUTH","บิสมัท",s), 
        new AtomicElement( 84, "Po","POLONIUM","พอโลเนียม",s), 
        new AtomicElement( 85, "At","ASTATINE","แอสทาทีน",s), 
        new AtomicElement( 86, "Rn","RADON","เรดอน",g), 
        new AtomicElement( 87, "Fr","FRANCIUM","แฟรนเซียม",s), 
        new AtomicElement( 88, "Ra","RADIUM","เรเดียม",s), 
        new AtomicElement( 89, "Ac","ACTINIUM","แอกทิเนียม",s), 
        new AtomicElement( 90, "Th","THORIUM","ทอเรียม",s), 
        new AtomicElement( 91, "Pa","PROTACTINIUM","โพรแทกทิเนียม",s), 
        new AtomicElement( 92, "U","URANIUM","ยูเรเนียม",s), 
        new AtomicElement( 93, "Np","NEPTUNIUM","เนปทูเนียม",s), 
        new AtomicElement( 94, "Pu","PLUTONIUM","พลูโทเนียม",s), 
        new AtomicElement( 95, "Am","AMERICIUM","อะเมริเซียม",s), 
        new AtomicElement( 96, "Cm","CURIUM","คูเรียม",s), 
        new AtomicElement( 97, "Bk","BERKELIUM","เบอร์คีเลียม",s), 
        new AtomicElement( 98, "Cf","CALIFORNIUM","แคลิฟอร์เนียม",s), 
        new AtomicElement( 99, "Es","EINSTEINIUM","ไอน์สไตเนียม",s), 
        new AtomicElement(100, "Fm","FERMIUM","เฟอร์เมียม",s), 
        new AtomicElement(101, "Md","MENDELEVIUM","เมนเดลีเวียม",s), 
        new AtomicElement(102, "No","NOBELIUM","โนเบเลียม",s), 
        new AtomicElement(103, "Lr","LAWRENCIUM","ลอว์เรนเชียม",s), 
        new AtomicElement(104, "Df","Rutherfordium","รัทเทอร์ฟอร์เดียม",nk), 
        new AtomicElement(105, "Db","Dubnium","ดุบเนียม",nk), 
        new AtomicElement(106, "Sg","Seaborgium","ซีบอร์เกียม",nk), 
        new AtomicElement(107, "Bh","Bohrium","โบห์เรียม",nk), 
        new AtomicElement(108, "Hs","Hassium","ฮัสเซียม",nk), 
        new AtomicElement(109, "Mt","Meitnerium","ไมต์เนเรียม",nk), 
        new AtomicElement(110, "Ds","Darmstadtium","ดาร์มสตัดเทียม",nk),
        new AtomicElement(111, "Rg","Roentgenium","เรินต์เกเนียม",nk), 
        new AtomicElement(112, "Cn","Copernicium","โคเปอร์นิเซียม",nk), 
        new AtomicElement(113, "Nh","Nihonium","นิโฮเนียม",nk), 
        new AtomicElement(114, "Fl","Flerovium","ฟลิโรเวียม",nk), 
        new AtomicElement(115, "Mc","Moscovium","มอสโกเวียม",nk), 
        new AtomicElement(116, "Lv","Livermorium","ลิเวอร์มอเรียม",nk), 
        new AtomicElement(117, "Ts","Tennessine","เทนเนสซีน",nk), 
        new AtomicElement(118, "Og","Oganesson","โอกาเนสซอน",g) 
    };
    public static final int length  = elements.length; 
    private static PeriodicTable test = new PeriodicTable();
    public PeriodicTable(){
    	try {
    		File link_url = new File("..\\PeriodicTable\\src\\PeriodicTable\\url_periodic.txt");
			Scanner text_url = new Scanner(link_url);
			int i = 1;
			String link = "";
			while(text_url.hasNextLine()) {
				link = text_url.nextLine().toString();
				link = link.substring(link.indexOf(":")+1);    //in textfile ex. 1He:(url_periodicInWikipedie)
				elements[i++].setLink(link);
			}
			text_url.close();
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
    }
    public static String getSymbol(int index) {
    	return elements[index].getSymbol();
    }
    public static String getThai(int index) {
    	return elements[index].getThai();
    }
    public static String getEng(int index) {
    	return elements[index].getEng();
    }
    public static int getNumber(int index) {
    	return elements[index].getNumber();
    }
    public static char getStatus(int index) {
    	return elements[index].getStatus();
    }
    public static String getLink(int index) {
    	return elements[index].getLink();
    }
    public static String getFullStatus(int index) {
    	switch(elements[index].getStatus()) {
    	case 's':
    		return "solid";
    	case 'l':
    		return "liquid";
    	case 'g':
    		return "gas";
    	case 'u':
    		return "Unknow";
    	case ' ':
    		return "";
    	}
    	return "";
    }
    public static String getFullStatus(char index) {
    	switch(index) {
    	case 's':
    		return "solid";
    	case 'l':
    		return "liquid";
    	case 'g':
    		return "gas";
    	case 'u':
    		return "Unknow";
    	case ' ':
    		return "";
    	}
    	return "";
    }

 
}