class NammaMetro{
	public static void main(String[] NammaMetro){
		String location="bangalore";
		String lines="2";
		String PStations="37 stations";
		String GStations="32 stations";

		String purple[]={"Whitefield (Kadugodi)","Hopefarm Channasandra","Kundalahalli","Indiranagar","Halasuru","Trinity","MG Road","Cubbon Park","Vidhana Soudha","Majestic (Nadaprabhu Kempegowda Station)"};

		String green[]={"Madavara","Peenya Industry","Yeshwanthpur","Sandal Soap Factory","Mahalakshmi","Rajajinagar","Majestic (Nadaprabhu Kempegowda Station)","Chickpete","National College","Banashankari","Silk Institute"};
	
		System.out.println("name of the location:"+location);
		System.out.println("number of metro lines:"+lines);
		System.out.println("number of Purple line stations:"+PStations);
		System.out.println("number of Green line stations:"+GStations);

		System.out.println("purple line station list");
		for(String purplelist:purple){
			System.out.println(purplelist);
		}

		System.out.println("green line station list");
		for(String greenlist:green){
			System.out.println(greenlist);
		}
	}
}
