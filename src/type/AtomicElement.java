package type;
public class AtomicElement{
    private String symbol="";
    private String thai="";
    private String eng="";
    private int number = 0;
    private char status= ' ' ;
    private String link="";


    public AtomicElement(int an, String s,String eng,String ths,char st){ 
        this.number = an; 
        this.symbol = s;
        this.thai= ths;
        this.eng = eng;
        this.status = st; // s=solid ,l = liquid, g =gas  ,u = UnKnow
    }
    public void setLink(String link_periodic) {
    	link = link_periodic;
    }
    public String getSymbol() {
    	return symbol;
    }
    public String getThai() {
    	return thai;
    }
    public String getEng() {
    	return eng;
    }
    public int getNumber() {
    	return number;
    }
    public char getStatus() {
    	return status;
    }
    public String getLink() {
    	return link;
    }
}