package iut.tdd;

import java.util.HashMap;

public class Convert {
	static HashMap<String,String> DicoFr = new HashMap<String, String>();
	static {
		DicoFr.put("0","zéro");
		DicoFr.put("1","un");
		DicoFr.put("2","deux");
		DicoFr.put("3","trois");
		DicoFr.put("4","quatre");
		DicoFr.put("5","cinq");
		DicoFr.put("6","six");
		DicoFr.put("7","sept");
		DicoFr.put("8","huit");
		DicoFr.put("9","neuf");
		DicoFr.put("10","dix");
		DicoFr.put("11","onze");
		DicoFr.put("12","douze");
		DicoFr.put("13","treize");
		DicoFr.put("14","quatorze");
		DicoFr.put("15","quinze");
		DicoFr.put("16","seize");
		DicoFr.put("20","vingt");
		DicoFr.put("30","trente");
		DicoFr.put("40","quarante");
		DicoFr.put("50","cinquante");
		DicoFr.put("60","soixante");
	}

	public static String num2text(String input) {
		int nbr=Integer.parseInt(input);
		if(nbr<17 || nbr==20 ||nbr==30 ||nbr==40 ||nbr==50||nbr==60)
			return DicoFr.get(input);
		else if(nbr<20){
			return DicoFr.get("10")+"-"+DicoFr.get((""+(nbr-10)));
		}
		
		else{return null;}
		
	}
		
	public static String text2num(String input) {
		if(input.equals("zéro"))
			return "0";
		else
			return null;
	}
}