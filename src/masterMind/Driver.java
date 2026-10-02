package masterMind;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		String rood = "rood";
		String blauw = "blauw";
		String paars = "paars";
		String groen = "groen";
		String geel = "geel";
		String bruin = "bruin";

		String wit = "wit";
		String zwart = "zwart";
		String niks = "niks";

		String poging1;
		String poging2;
		String poging3;
		String poging4;

		String check1= niks;
		String check2= niks;
		String check3= niks;
		String check4= niks;

		String code1 = rood;
		String code2 = paars;
		String code3 = bruin;
		String code4 = geel;

		boolean heeftGewonnen = false;

		// Begin het spel

		for (int pogingen = 0; pogingen < 10; pogingen++) {

			System.out.println("vul 4 kleuren in, je hebt de keuze uit rood, blauw, geel, bruin, paars en groen!");

			poging1 = console.next();
			poging2 = console.next();
			poging3 = console.next();
			poging4 = console.next();

			if (poging1.equals(code1)) {
				check1 = zwart;
			} else if (poging1.equals(code2)) {
				check1 = wit;
			} else if (poging1.equals(code3)) {
				check1 = wit;
			} else if (poging1.equals(code4)) {
				check1 = wit;
			} else {
				check1 = niks;
			}

			if (poging2.equals(code2)) {
				check2 = zwart;
			} else if (poging2.equals(code1)) {
				check2 = wit;
			} else if (poging2.equals(code3)) {
				check2 = wit;
			} else if (poging2.equals(code4)) {
				check2 = wit;
			} else {
				check2 = niks;
			}

			if (poging3.equals(code3)) {
				check3 = zwart;
			} else if (poging3.equals(code1)) {
				check3 = wit;
			} else if (poging3.equals(code2)) {
				check3 = wit;
			} else if (poging3.equals(code4)) {
				check3 = wit;
			} else {
				check3 = niks;
			}

			if (poging4.equals(code4)) {
				check4 = zwart;
			} else if (poging4.equals(code1)) {
				check4 = wit;
			} else if (poging4.equals(code2)) {
				check4 = wit;
			} else if (poging4.equals(code3)) {
				check4 = wit;
			} else {
				check4 = niks;
			}

			if (check1 == zwart) {
				if (check2 == zwart) {
					if (check3 == zwart) {
						if (check4 == zwart) {
							pogingen = 10;
							heeftGewonnen = true;
						}
					}
				}
			}
			System.out.println("hier heb je de tussendoorse check: ");
			System.out.println(check1 + ", " + check2 + ", " + check3 + ", " + check4);
		}
		if (heeftGewonnen == true) {
			System.out.println("Je hebt de code gekraakt! Gefeliciteerd! Het was inderdaad: " + code1 + ", " + code2 + ", " + code3 + ", " + code4);
		} else {
			System.out.println("je hebt verloren! Wat jammer :(, je mag het opnieuw proberen of je mag de pot op, domme sukkel");
		}

	}
}
