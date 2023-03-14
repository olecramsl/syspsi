import java.util.ArrayList;
import java.util.Objects;

public class Paciente {
    private String nome;
    private String sobrenome;
    private ArrayList<Atendimento> lstAtendimento = new ArrayList<>();
    public Paciente(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
    public void cadastrarAtendimento(Atendimento atendimento) {
        lstAtendimento.add(atendimento);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paciente paciente = (Paciente) o;
        return Objects.equals(nome, paciente.nome) && Objects.equals(sobrenome, paciente.sobrenome);
    }

    @Override
    public String toString() {
        return nome + " " + sobrenome;
    }
}
