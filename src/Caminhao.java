import java.util.ArrayList;

public class Caminhao {

    private int id;
    private float ocupacao;
    private ArrayList<Produto> produtosLuva = new ArrayList<>();
    private ArrayList<Produto> produtosDetergente = new ArrayList<>();
    private ArrayList<Produto> produtosPapelH = new ArrayList<>();

    public Caminhao() {
    }

    public Caminhao(int id) {
        setId(id);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void addProdutos(Produto p) {
        setOcupacao(p.getM3());
        switch (p.getNome()) {
            case "luva":
                produtosLuva.add(p);
            case "detergente":
                produtosDetergente.add(p);
            case "papel higienico":
                produtosPapelH.add(p);
                break;
        }
    }

    public double getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(float ocupacao) {
        this.ocupacao += ocupacao;
    }

    public String mostrar() {
        String mostrar = "O caminhao de id " + id + " está com ocupação de " + getOcupacao() + "\n";

        if(produtosLuva.size() > 0) mostrar += " produto: " + produtosLuva.get(0).getNome() + ", quantidade de caixas: " + produtosLuva.size() + "\n";
        if(produtosDetergente.size() > 0) mostrar += " produto: " + produtosDetergente.get(0).getNome() + ", quantidade de caixas: " + produtosDetergente.size() + "\n";
        if(produtosPapelH.size() > 0) mostrar += " produto: " + produtosPapelH.get(0).getNome() + ", quantidade de caixas: " + produtosPapelH.size() + "\n";

        return mostrar;
    }

}
