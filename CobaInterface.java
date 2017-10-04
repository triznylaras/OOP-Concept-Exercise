interface myInterface{
	public void metode1();
	public void metode2();
}
class CobaInterface implements myInterface {
	public void metode1() {
		System.out.println("Ini metode 1");
	}
	public void metode2() {
		System.out.println("Ini metode 2");
	}
	public static void main(String[] args) {
		myInterface obj = new CobaInterface();
		obj.metode2();
	}
}
