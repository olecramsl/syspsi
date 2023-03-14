import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Psicologo psicologo = new Psicologo("Magda Beatriz", "Vaz Cunha",
                "psicologamagda@yahoo.com.br", "11111111111", "2222222");
        Paciente pac1 = new Paciente("Marcelo", "Lima");
        Paciente pac2 = new Paciente("Laura", "Lima");

        psicologo.cadastrarPaciente(pac1);
        psicologo.cadastrarPaciente(pac2);

        Calendar dtAtd1 =  Calendar.getInstance();
        dtAtd1.set(2023, 03, 14, 18, 30, 00);
        Atendimento atd1 = new Atendimento(dtAtd1, 300.00);

        Calendar dtAtd2 =  Calendar.getInstance();
        dtAtd1.set(2023, 12, 05, 15, 13, 50);
        Atendimento atd2 = new Atendimento(dtAtd1, 150.00);

        psicologo.cadastrarAtendimento(pac1, atd1);
        psicologo.cadastrarAtendimento(pac2, atd2);
        psicologo.listarPacientes();
        psicologo.listarAtendimentos();

    }
}