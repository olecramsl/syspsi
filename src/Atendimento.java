import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Atendimento {
    private Calendar dataHorarioAtendimento;
    private double valor;
    private String prontuario;
    public Atendimento(Calendar dataHorarioAtendimento, double valor) {
        this.dataHorarioAtendimento = dataHorarioAtendimento;
        this.valor = valor;
    }
    public void cadastrarProntuario(String prontuario) {
        this.prontuario = prontuario;
    }
    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy 'at' HH:mm:ss");
        return sdf.format(dataHorarioAtendimento.getTime());
    }
}
