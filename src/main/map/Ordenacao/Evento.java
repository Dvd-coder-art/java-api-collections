package main.map.Ordenacao;

public class Evento {

    private String pessoa;


    private String atracao;
    public Evento(String pessoa, String atracao) {
        this.pessoa = pessoa;
        this.atracao = atracao;
    }


    public String getPessoa() {
        return pessoa;
    }

    public String getAtracao() {
        return atracao;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "pessoa='" + pessoa + '\'' +
                ", atracao=" + atracao +
                '}';
    }
}
