import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        StackUp pacientes = new StackUp();
        GestaoHospital atender = new GestaoHospital();

        for(int i = 0; i < 10; i++) {
            int numeroAleatorio = random.nextInt(4);
            Patient exemplo = new Patient("Zé", i, numeroAleatorio);

            pacientes.addPacientesFila(exemplo);
        }

        atender.atenderPacientes();        
    }
}
