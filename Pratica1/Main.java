public class Main {
	public static void main (String[] args) {
		System.out.println("Os atributos do carro são: ");

		Carro c1 = new Carro();
		c1.modelo = "Fusca";
		c1.cor = "Azul";

		System.out.println(c1.modelo);
		System.out.println(c1.cor);
	}
}
