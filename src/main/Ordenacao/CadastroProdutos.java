package main.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();

    }
    public void addProduto(String nome, long codigo, double preco, int quantidade){
        produtoSet.add(new Produto(nome, codigo,preco,quantidade));
    }

    public Set<Produto> exibirProdutoPorNome(){
        Set<Produto> produtosPorNome =new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutoPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.addProduto("Café", 1L, 10d, 5);
        cadastroProdutos.addProduto("Suco", 7L, 19d, 2);
        cadastroProdutos.addProduto("Salsicha", 8L, 7d, 17);
        cadastroProdutos.addProduto("Arroz", 2L, 10d, 5);

        System.out.println(cadastroProdutos.produtoSet);

        System.out.println(cadastroProdutos.exibirProdutoPorNome());

        System.out.println(cadastroProdutos.exibirProdutoPorPreco());

    }
}



