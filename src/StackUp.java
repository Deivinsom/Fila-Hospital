public class StackUp {
    private Queue<Patient> listLeve = new Queue<>();
    private Queue<Patient> listNormal = new Queue<>();
    private Queue<Patient> listModerado = new Queue<>();
    private Queue<Patient> listSevero = new Queue<>();

    public void addPacientesFila(Patient x) throws Exception{
        if (x.getPrioridade() == 0) {
            listLeve.enqueue(x);
        } 
        else if (x.getPrioridade() == 1) {
            listNormal.enqueue(x);
        } 
        else if (x.getPrioridade() == 2) {
            listModerado.enqueue(x);
        } 
        else if (x.getPrioridade() == 3) {
            listSevero.enqueue(x);
        } 
        else {
            throw new Exception("Número de prioridade errado"); 
        }
    }

    public Stack<Patient> empilharPacientes() throws Exception {
        Stack<Patient> pilha = new Stack<>();
        
        pilha.push(listNormal.dequeue());
        pilha.push(listSevero.dequeue());
        pilha.push(listModerado.dequeue());
        pilha.push(listSevero.dequeue());
        pilha.push(listLeve.dequeue());
        pilha.push(listModerado.dequeue());
        pilha.push(listSevero.dequeue());

        return pilha;
    }
}
