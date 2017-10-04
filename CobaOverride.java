public class KelasDasar{
	public void metodeOverride() {
		System.out.println("Ini metode kelas dasar");
	}
}
public class KelasMengambil{
	public void metodeOverride() {
		System.out.println("Ini metode kelas mengambil");
	}
}
public class CobaOverride {
	public static void main(String[] args) {
		KelasDasar obj1 = new KelasDasar();
		KelasDasar obj2 = new KelasMengambil();
		obj1.metodeOverride();
		obj2.metodeOverride();
	}

}
