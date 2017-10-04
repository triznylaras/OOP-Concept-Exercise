abstract class Kucing {
	public abstract int JumlahKucing(int K1, int K2, int K3);
	public abstract int JumlahRumahK(int R1, int R2);
	
	public void disp() {
		System.out.println("Metode dari kelas Kucing");
	}
}
public class CobaAbstrak extends Kucing {
	public int JumlahKucing(int Kuc1, int Kuc2, int Kuc3) {
		return Kuc1+Kuc2+Kuc3;
	}
	public int JumlahRumahK(int Rum1, int Rum2) {
		return Rum1+Rum2;
	}
	public static void main(String[] args) {
		CobaAbstrak obj = new CobaAbstrak();
		System.out.println(obj.JumlahKucing(1, 2, 3));
		System.out.println(obj.JumlahRumahK(2, 4));
		obj.disp();
	}
}
