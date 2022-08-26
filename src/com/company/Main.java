package com.company;

import java.util.ArrayList;
import com.google.gson.Gson;

public class Main extends Produto {

    public static void main(String[] args) {

        System.out.println();
        System.out.println();

        ArrayList<Produto> lista = new ArrayList<>();

        //Instancia um produto e preenche suas propriedades
        Produto p1 = new Produto();

        p1.setId(12345);
        p1.setNome("MEIA DE ALGODÃO");
        p1.setSKU("CAM-01");
        p1.setVariacao(true);
        p1.tipoVariacao = new ArrayList();
        p1.tipoVariacao.add("cor");
        p1.tipoVariacao.add("tamanho");
        p1.quantidade = 1;

        Produto p2 = new Produto();

        p2.id = 12345;
        p2.nome = "MEIA DE ALGODÃO";
        p2.SKU = "CAM-01";
        p2.variacao = true;
        p2.tipoVariacao = new ArrayList();
        p2.tipoVariacao.add("cor");
        p2.tipoVariacao.add("tamanho");
        p2.quantidade = 1;

        lista.add(p1);
        lista.add(p2);

        Gson gson = new Gson();

        String aux = gson.toJson(lista);

        System.out.println(aux);

    }
}
