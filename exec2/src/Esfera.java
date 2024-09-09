public class Esfera {
    private float raio;

    public Esfera(float raio) {
        this.raio = raio;
    }

    public void setRaio(float r) {
        this.raio = r;
    }

    public float calcularVolume() {
        return (4.0f / 3.0f) * (float) Math.PI * (raio * raio * raio);
    }

    public float calcularArea() {
        return 4.0f * (float) Math.PI * (raio * raio);
    }
}
