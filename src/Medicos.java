import java.util.ArrayList;
import java.util.HashMap;

//import javax.rmi.ssl.SslRMIClientSocketFactory;

class Medico{
    
    String nome;
    String especialidade;
    String crm;
    String telefone;
    String periodo; // Manhã ou Tarde

    public Medico(String crm, String nome, String especialidade, String telefone, String periodo){
        this.nome = nome;
        this.especialidade = especialidade;
        this.crm = crm;
        this.telefone = telefone;
        this.periodo = periodo;
    }
    
    public String toString(){
        return "Médico: " + nome + " | CRM: " + crm + " | Especialidade: " + especialidade + " | Telefone: " + telefone + " | Período: " + periodo;
    }
}

class Paciente {
    String nome;
    String telefone;
    String endereco;
    String dataNascimento;

    public Paciente(String nome, String telefone, String endereco, String dataNascimento){
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
    }

    public String toString(){
        return "Paciente: " + nome + " | Telefone: " + telefone + " |Endereço: " + endereco + " | Data de Nascimento: " + dataNascimento;
    }
}

class Agendamento {
    Medico medico;
    Paciente paciente;
    String horario;

    public Agendamento(Medico medico, Paciente paciente, String horario){
        this.medico = medico;
        this.paciente = paciente;
        this.horario = horario;
    }

    public String toString(){
        return "Horário: " + horario + " | Médico: " + medico.nome + " | Paciente: " + paciente.nome;
    }
}

class Consultorio{
    String nome;
    ArrayList<Medico> medicos;
    ArrayList<Paciente> pacientes;
    HashMap<String, Agendamento> agenda;

    public Consultorio(String nome){
        this.nome = nome;
        this.medicos = new ArrayList<>();
        this.pacientes = new ArrayList<>();
        this.agenda = new HashMap<>();
    }

    public void cadastrarMedico(Medico medico){
        medicos.add(medico);
        System.out.println("Médico cadastrado: " + medico.nome);
    }

    public void cadastrarPaciente(Paciente paciente){
        pacientes.add(paciente);
        System.out.println("Paciente cadastrado: " + paciente.nome);
    }
    
    public void agendarConsulta(Paciente paciente, Medico medico, String horario){
        if(agenda.containsKey(horario)){
            System.out.println("Horário já agendado para outra consulta.");
        }else{
            Agendamento consulta = new Agendamento(medico, paciente, horario);
            agenda.put(horario, consulta);
            System.out.println("Consulta agendada para " + paciente.nome + " às " + horario);
        }
    }

    public void visualizarAgendamento(){
        System.out.println("Agenda de " + nome + ": ");
        if (agenda.isEmpty()) {
            System.out.println("Nenhuma consulta agendada.");
        }else {
            for (String horario : agenda.keySet()){
                System.out.println(agenda.get(horario));
            }
        }
    }
}