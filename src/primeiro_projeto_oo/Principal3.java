package primeiro_projeto_oo;

public class Principal3 {

    public static void main(String[] args) {
        Professor Prof1 = new Professor();
        Prof1.setSalario(100.00);
        System.out.println("Salário profe1:" + Prof1.getSalario());


        ProfessorHorista profHorista = new ProfessorHorista();
        profHorista.setSalario(10.0);
        profHorista.setQtdHoras(40);
        System.out.println("Salário professor" + profHorista.getSalario());
    }
}
