

	public class TesEnkapsulasi{
		public static void main(String[] args) {
			Karyawan obj = new Karyawan();
			obj.setNIM(112123);
			obj.setNamaKar("Bayu");
			obj.setUmurKar(23);
			System.out.println("NIM: " + obj.getNIM());
			System.out.println("Nama: " + obj.getNamaKar());
			System.out.println("Umur: " + obj.getUmurKar());
		}
	}
