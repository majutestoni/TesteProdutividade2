import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Caminhao> caminhaos = new ArrayList<>();

        Produto papelH = new Produto("papel higienico", (float) 0.1);
        Produto detergente = new Produto("detergente", (float) 0.025);
        Produto luva = new Produto("luva", (float) 0.0125);

        int id = 0;
        Caminhao c1 = new Caminhao(id);
        caminhaos.add(c1);
        for (int i = 1; i <= 6000; i++) {
            if ((caminhaos.get(id).getOcupacao() + luva.getM3()) <= 50) {
                caminhaos.get(id).addProdutos(luva);
            } else {
                id++;
                Caminhao c2 = new Caminhao(id);
                caminhaos.add(c2);
                caminhaos.get(id).addProdutos(luva);
            }
        }
        for (int i = 1; i <= 890; i++) {
            if ((caminhaos.get(id).getOcupacao() + detergente.getM3()) <= 50) {
                caminhaos.get(id).addProdutos(detergente);
            } else {
                id++;
                Caminhao c2 = new Caminhao(id);
                caminhaos.add(c2);
                caminhaos.get(id).addProdutos(detergente);
            }
        }
        for (int i = 1; i <= 741; i++) {
            if ((caminhaos.get(id).getOcupacao() + papelH.getM3()) <= 50) {
                caminhaos.get(id).addProdutos(papelH);
            } else {
                id++;
                Caminhao c2 = new Caminhao(id);
                caminhaos.add(c2);
                caminhaos.get(id).addProdutos(papelH);
            }
        }




        for (Caminhao caminhao : caminhaos) {
            System.out.println(caminhao.mostrar());
        }


    }
}