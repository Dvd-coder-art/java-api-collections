package main.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void addContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);

    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!this.agendaContatoMap.isEmpty()){
           numeroPorNome= (Integer)this.agendaContatoMap.get(nome);
           if(numeroPorNome ==null){
               System.out.println("Contato não encontrado.");
           }
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();


        agendaContatos.addContato("David", 123456);
        agendaContatos.addContato("David", 124563);
        agendaContatos.addContato("David Souza", 1111111);
        agendaContatos.addContato("David DIO", 55555);
        agendaContatos.addContato("David Nascimento", 11111);
        agendaContatos.addContato("David Souza", 12345);

        agendaContatos.exibirContato();

        agendaContatos.removerContato("David Souza");
        agendaContatos.exibirContato();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("David DIO"));

    }
}
