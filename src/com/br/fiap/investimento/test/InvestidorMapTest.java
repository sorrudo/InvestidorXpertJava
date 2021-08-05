package com.br.fiap.investimento.test;

import java.util.HashMap;
import java.util.Map;

public class InvestidorMapTest {
    public static void main(String[] args) {
        Map<String,String> mapaNomes = new HashMap<String,String>();
        mapaNomes.put("chave 1", "valor 1");
        mapaNomes.put("chave 2", "valor 2");
        mapaNomes.put("chave 3", "valor 3");
        mapaNomes.put("chave 4", "valor 4");
        System.out.println(mapaNomes);



    }
}
