package pl.modulczwarty_java;

public class Miasto implements Comparable<Miasto> {

	int kodPocztowy;
	String nazwaMiasta;

	Miasto(int kod, String miasto) {
		kodPocztowy = kod;
		nazwaMiasta = miasto;
	}

	@Override
	public String toString() {
		return kodPocztowy + " " + nazwaMiasta;
	}

	@Override
	public int compareTo(Miasto o) {
		return this.kodPocztowy - o.kodPocztowy;
	}

}
