import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            Consultorio consultorio01 = new Consultorio("Consultório 01");
            Consultorio consultorio02 = new Consultorio("Consultório 02");
            System.out.println();

            Medico medico01 = new Medico("1234", "Dr. Henrique", "Pediatra", "9 9999-9999", "Matutino");
            Medico medico02 = new Medico("5678", "Dra. Fernanda", "Cardiologista", "9 8888-8888", "Matutino");
            Medico medico03 = new Medico("9101", "Dr. Leandro", "Cirurgião Plastico", "9 7777-7777", "Vespertino");
            Medico medico04 = new Medico("1213", "Dra. Larissa", "Ortopedista", "9 6666-6666", "Vespertino");
            System.out.println();

            consultorio01.cadastrarMedico(medico01);
            consultorio01.cadastrarMedico(medico03);
            consultorio02.cadastrarMedico(medico02);
            consultorio02.cadastrarMedico(medico04);
            System.out.println();

            Paciente paciente01 = new Paciente("Lucas", "9 5555-5555", "Rua das Rosas, número 37", "05/10/1995");
            Paciente paciente02 = new Paciente("Laura", "9 4444-4444", "Rua T, número 57", "25/08/2000");
            System.out.println();

            consultorio01.cadastrarPaciente(paciente01);
            consultorio02.cadastrarPaciente(paciente02);
            System.out.println();

            consultorio01.agendarConsulta(paciente01, medico01, "08:30");
            consultorio02.agendarConsulta(paciente02, medico04, "15:00");
            System.out.println();

            consultorio01.agendarConsulta(paciente01, medico01, "08:30");
            System.out.println();

            consultorio01.visualizarAgendamento();
            consultorio02.visualizarAgendamento();
           
        input.close();
    }
}
