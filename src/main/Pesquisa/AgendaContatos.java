package main.Pesquisa;
import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;


    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void AddContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet){
            if (c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContato();

        agendaContatos.AddContato("Contato 1", 8899);
        agendaContatos.AddContato("Contato 1", 8899);
        agendaContatos.AddContato("Contato 3", 8345);

        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarPorNome("Contato 1"));
        System.out.println("Atualizando contato para " + agendaContatos.atualizarNumeroContato("Contato 3", 8192));

    }
}
