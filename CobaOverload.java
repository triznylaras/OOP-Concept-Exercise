class Overload {
	void number(int x, int y) {
		System.out.println("x: " + x + " y: " + y);
	}
	void number(int a, int b, int c) {
		System.out.println("a: " + a + " b: " + b + " c: " + c);
	}
	double number(double a) {
		System.out.println("double a: " + a);
		return a*a;
	}
}
class CobaOverload {
	public static void main(String[] args) {
		Overload obj = new Overload();
		double result;
		obj.number(1, 2);
		obj.number(3, 4, 5);
		result = obj.number(2.5);
		System.out.println("O/P: " + result);
		
	}

}
