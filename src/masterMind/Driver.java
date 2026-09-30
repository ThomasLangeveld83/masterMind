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

		String check1;
		String check2;
		String check3;
		String check4;

		String code1 = rood;
		String code2 = paars;
		String code3 = bruin;
		String code4 = geel;

		// Begin het spel
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
			check1 = zwart;
		} else if (poging2.equals(code1)) {
			check1 = wit;
		} else if (poging2.equals(code3)) {
			check1 = wit;
		} else if (poging2.equals(code4)) {
			check1 = wit;
		} else {
			check1 = niks;
		}

		if (poging3.equals(code3)) {
			check1 = zwart;
		} else if (poging3.equals(code1)) {
			check1 = wit;
		} else if (poging3.equals(code2)) {
			check1 = wit;
		} else if (poging3.equals(code4)) {
			check1 = wit;
		} else {
			check1 = niks;

			if (poging1.equals(code4)) {
				check1 = zwart;
			} else if (poging4.equals(code1)) {
				check1 = wit;
			} else if (poging4.equals(code2)) {
				check1 = wit;
			} else if (poging4.equals(code3)) {
				check1 = wit;
			} else {
				check1 = niks;
			}
		}
	}
	
}

