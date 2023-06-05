public class ToQueue {
    private Queue<Patient> listLeve = new Queue<>();
    private Queue<Patient> listNormal = new Queue<>();
    private Queue<Patient> listModerado = new Queue<>();
    private Queue<Patient> listSevero = new Queue<>();

    public ToQueue() {

    }

    public void addPatient(Patient x) throws Exception{
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
}
