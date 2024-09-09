public class Main {
    public static void main(String[] args) {
        Esfera esfera = new Esfera();

        esfera.setRaio(5.0f);

        System.out.printf("Volume: %.2f%n", esfera.calcularVolume());

        System.out.printf("Área: %.2f%n", esfera.calcularArea());
    }
}
