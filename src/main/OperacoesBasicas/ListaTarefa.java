package main.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void AddTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void remTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int ObterNumeroTotal(){
        return tarefaList.size();
    }

    public void ObterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("Número total de elementos na lista é: " + listaTarefa.ObterNumeroTotal());
        listaTarefa.AddTarefa("Tarefa 1");
        listaTarefa.AddTarefa("Tarefa 1");
        listaTarefa.AddTarefa("Tarefa 2");
        System.out.println("Número total de elementos na lista é: " + listaTarefa.ObterNumeroTotal());
        listaTarefa.remTarefa("Tarefa 1");
        System.out.println("Número total de elementos na lista é: " + listaTarefa.ObterNumeroTotal());
        listaTarefa.ObterDescricoesTarefas();
    }
}
