package main.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidar {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidar() {
        this.convidadoSet = new HashSet<>();
    }

    public void addConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidado( int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet){
            if(c.getCodigoConvite()==codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }

        convidadoSet.remove(convidadoParaRemover);
    }
   public int contarConvidados(){
        return convidadoSet.size();
   }

   public void exibirConvidados(){
       System.out.println(convidadoSet);
   }

    public static void main(String[] args) {
        ConjuntoConvidar conjuntoConvidar = new ConjuntoConvidar();
        System.out.println("Existem " + conjuntoConvidar.contarConvidados() + "dentro do Set convidados");

        conjuntoConvidar.addConvidado("Convidado 1", 1234);
        conjuntoConvidar.addConvidado("Convidado 2", 1235);
        conjuntoConvidar.addConvidado("Convidado 3", 1235);
        conjuntoConvidar.addConvidado("Convidado 4", 1236);

        conjuntoConvidar.exibirConvidados();

        System.out.println("Existem " + conjuntoConvidar.contarConvidados() + " dentro do Set de convidados.");

        conjuntoConvidar.removerConvidado(1234);

        System.out.println("Existem " + conjuntoConvidar.contarConvidados() + " dentro do Set de convidados.");
    }
}
