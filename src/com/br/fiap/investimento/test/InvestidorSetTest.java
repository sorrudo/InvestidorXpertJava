package com.br.fiap.investimento.test;

import com.br.fiap.investimento.model.Fundo;
import com.br.fiap.investimento.model.InvestidorPF;

import java.util.Set;
import java.util.TreeSet;

public class InvestidorSetTest {
    public static void main(String[] args) {
        //Set<Fundo> fundos = new HashSet<>();
        Set<Fundo> fundos = new TreeSet<>();

        fundos.add(new Fundo(1, "Fundo1"));
        fundos.add(new Fundo(3, "Fundo3"));
        fundos.add(new Fundo(2, "Fundo2"));
        fundos.add(new Fundo(4, "Fundo4"));
        fundos.add(new Fundo(1, "Fundo1"));
        //System.out.println(fundos);

        Set<InvestidorPF> investidores = new TreeSet<>();
        investidores.add(new InvestidorPF("inv 1", 1));
        investidores.add(new InvestidorPF("inv 3", 3));
        investidores.add(new InvestidorPF("inv 2", 2));
        investidores.add(new InvestidorPF("inv 4", 4));
        investidores.add(new InvestidorPF("inv 1", 1));
        System.out.println(investidores);
    }




}
