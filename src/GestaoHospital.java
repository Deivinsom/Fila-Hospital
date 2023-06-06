import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class GestaoHospital {
    Scanner scanner = new Scanner(System.in);

    private String nome;
    private int cpf;
    private int prioridade;
    StackUp empilha = new StackUp();

    public void registrarPaciente() throws Exception {
        System.out.println("Informe o nome do paciente: ");
        nome = scanner.nextLine();

        System.out.println("Digite o cpf do paciente: ");
        cpf = scanner.nextInt();

        System.out.println("Informe o nível de prioridade do paciente: ");
        prioridade = scanner.nextInt();

        Patient pessoa = new Patient(nome, cpf, prioridade);

        empilha.addPacientesFila(pessoa);
    }

    public void atenderPacientes() throws Exception {
        Stack<Patient> pilha = new Stack<>();
        List<Patient> lista = new ArrayList<>();

        pilha = empilha.empilharPacientes();
        lista = pilha.popUp();

        for(Patient paciente : lista) {
            System.out.println("O paciente " + paciente.getNome() + " de CPF " + paciente.getCpf() +
                    " foi atendido com o nível de prioridade " + paciente.getPrioridade());

            System.out.println("Pressione <ENTER> para atender o próximo paciente...");
            scanner.nextLine();
        }
    }
}
