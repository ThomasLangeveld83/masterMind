package masterMind;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		// opzet van spel

		String[] kleuren = { "rood", "blauw", "paars", "groen", "geel", "bruin" };
		String[] kleurenCheck = { "wit", "niks", "zwart" };

		String[] pogingen = new String[4];

		String[] checks = new String[4];

		String[] code = { kleuren[4], kleuren[3], kleuren[3], kleuren[3] };

		boolean heeftGewonnen = false;

		// Begin het spel

		for (int ronde = 0; ronde < 10; ronde++) {

			System.out.println("vul 4 kleuren in, je hebt de keuze uit rood, blauw, geel, bruin, paars en groen!");
			for (int index = 0; index < 4; index++) {
				pogingen[index] = console.next();

			}
			for (int numering = 0; numering < 4; numering++) {
				checks[numering] = kleurenCheck[1];
				if (pogingen[numering].equals(code[numering])) {
					checks[numering] = kleurenCheck[2];
				} else {
					for (int i = 0; i < 4; i++) {
						if (pogingen[numering].equals(code[i])) {
							checks[numering] = kleurenCheck[0];
						}

					}

				}

				heeftGewonnen = true;
				for (int p = 0; p < 4; p++) {
					if (checks[p] != kleurenCheck[2]) {
						heeftGewonnen = false;

					}
				}

				if (heeftGewonnen == true) {
					ronde = 10;
				}
			}
			System.out.println(" ");
			System.out.println("hier heb je de tussendoorse check: ");

			for (int t = 0; t < 4; t++) {
				System.out.print(checks[t] + " ");

			}
			if (heeftGewonnen == true)

			{
				System.out.println(" ");
				System.out.println("Je hebt de code gekraakt! Gefeliciteerd! Het was inderdaad: ");
				for (int u = 0; u < 4; u++) {
					System.out.print(code[u] + " ");
				}
			} else {
				System.out.println(
						"je hebt verloren! Wat jammer :(, je mag het opnieuw proberen of je mag de pot op, domme sukkel");
			}
		}
	}
}
