import java.util.ArrayList;

public class Psicologo {
    private String nome;
    private String sobrenome;
    private String email;
    private String cpf;
    private String crp;
    private ArrayList<Paciente> lstPacientes = new ArrayList<>();
    private ArrayList<Atendimento> lstAtendimentos = new ArrayList<>();
    private Agenda agenda;

    public Psicologo(String nome, String sobrenome, String email, String cpf, String crp) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.cpf = cpf;
        this.crp = crp;
    }

    public void cadastrarPaciente(Paciente paciente) {
        lstPacientes.add(paciente);
    }

    public void cadastrarAtendimento(Paciente paciente, Atendimento atendimento) {
        int index = lstPacientes.indexOf(paciente);
        if (index >= 0) {
            Paciente tmpPaciente = lstPacientes.get(index);
            lstAtendimentos.add(atendimento);
            tmpPaciente.cadastrarAtendimento(atendimento);
        } else {
            System.out.println("Paciente não vinculado ao psicólogo");
        }
    }
    public void listarPacientes() {
        for (Paciente paciente: lstPacientes) {
            System.out.println(paciente);
        }
    }
    public void listarAtendimentos() {
        for (Atendimento atendimento: lstAtendimentos) {
            System.out.println(atendimento);
        }
    }
}
