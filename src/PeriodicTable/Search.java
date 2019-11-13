package PeriodicTable;

import type.SearchHeaper;

public class Search{
    public int[] Searched = new int[PeriodicTable.length];
    public int number = 0;

    public Search(SearchHeaper SearchHP){
    	this.number = 0;
        for(int i=1;i<PeriodicTable.length;i++) {
        	if(checkSymbol(SearchHP,i)&&checkEng(SearchHP,i)&&checkThai(SearchHP,i)&&checkatomicNumber(SearchHP,i)&&checkStatus(SearchHP,i)) {
        		this.Searched[this.number++]=i;
        	}
        }
        if(this.number == 0 && (SearchHP.symbol!="" || SearchHP.eng!="" || SearchHP.thai!="")) {
        	for(int i=1;i<PeriodicTable.length;i++) {
            	if(checkStringLike(SearchHP.symbol,PeriodicTable.getSymbol(i).toLowerCase())&&checkStringLike(SearchHP.eng,PeriodicTable.getEng(i).toLowerCase())&&checkStringLike(SearchHP.thai,PeriodicTable.getThai(i).toLowerCase())&&checkatomicNumber(SearchHP,i)&&checkStatus(SearchHP,i)) {
            		this.Searched[this.number++]=i;
            	}
        	} 
        }
    }
    private boolean checkSymbol(SearchHeaper SearchHP,int index) {return (SearchHP.symbol == "")||SearchHP.symbol.toLowerCase() == PeriodicTable.getSymbol(index).toLowerCase();}
    private boolean checkEng(SearchHeaper SearchHP,int index) 	 {return (SearchHP.eng == "")   ||SearchHP.eng.toLowerCase() == PeriodicTable.getEng(index).toLowerCase();}
    private boolean checkThai(SearchHeaper SearchHP,int index)   {return (SearchHP.thai == "")  ||SearchHP.thai.toLowerCase() == PeriodicTable.getThai(index).toLowerCase();}
    private boolean checkatomicNumber(SearchHeaper SearchHP,int index) {
        if(SearchHP.atomicNumber==0 && SearchHP.C_atomicNumber == '=') {return true;}
    	else if(SearchHP.C_atomicNumber == '='){return SearchHP.atomicNumber == PeriodicTable.getNumber(index);}
    	else if(SearchHP.C_atomicNumber == '>'){return SearchHP.atomicNumber < PeriodicTable.getNumber(index);}
    	else if(SearchHP.C_atomicNumber == '<'){return SearchHP.atomicNumber > PeriodicTable.getNumber(index);}
        return false;
    }
    private boolean checkStatus(SearchHeaper SearchHP,int index) {return (SearchHP.status == ' ')||SearchHP.status == PeriodicTable.getStatus(index);}
    //for use future hahaha!
    private boolean checkStringLike(String Datacompare,String Data) {
    	int num = 0;
    	int max = 0;
    	if (Datacompare == "")
    		return true;
    	for(int i=0;i<Data.length();i++) {
    		for(int j=0;(j+i)<Data.length() && j<Datacompare.length();j++) {
    			if (Datacompare.toLowerCase().charAt(j)==Data.toLowerCase().charAt(j+i)){num++;}
    		}
    		max = (num>max)? num:max;
    		if(max==Datacompare.length())
    			return true;
    		num = 0;
    	}
    	return max/Datacompare.length()>=0.5f;
    }
}