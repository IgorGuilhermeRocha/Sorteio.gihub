package teste;

import java.util.Scanner;

public class Teste {

	private static String[] sort;

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Scanner is = new Scanner(System.in);

		int numeroP = in.nextInt();
		String[] v = new String[numeroP + 1];
		v[0] = "F A C E";
		sort = new String[v.length];

		for (int c = 1; c < v.length; c++) {
			v[c] = is.nextLine();
		}
		System.out.println(sorteio(v));
	}

	public static int sorteio(String v[]) {
		sort = v;
		int ganhadores = 0;
		for (int i = 1; i < sort.length; i++) {
			if (sort[i] != null) {
				if (reverse(sort[i - 1]).equals(sort[i])) {
					ganhadores += 1;
					sort[i - 1] = "";
					sort[i] = "";
					ordenar();
					i = 0;
				}
			}
		}

		return ganhadores;
	}

	public static String reverse(String r) {
		String reverseP = "";
		for (int c = r.length() - 1; c >= 0; c--) {
			reverseP += r.charAt(c);
		}
		return reverseP;
	}

	public static void ordenar() {
		int n = 1;
		String v[] = new String[sort.length];
		v[0] = "F A C E";
		for (int c = 1; c < sort.length; c++) {
			if (sort[c] != "") {
				v[n] = sort[c];
				n++;
			}
		}
		sort = v;

	}
}
