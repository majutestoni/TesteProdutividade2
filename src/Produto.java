public class Produto {
    private String nome;
    private float m3;

    public Produto() {
    }

    public Produto(String nome, float m3) {
        this.nome = nome;
        this.m3 = m3;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getM3() {
        return m3;
    }

    public void setM3(float m3) {
        this.m3 = m3;
    }
}
