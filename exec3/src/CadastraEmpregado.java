import java.util.Scanner;

public class CadastraEmpregado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Empregado empregado = new Empregado();
        System.out.println("Informe o nome do empregado:");
        empregado.setNome(scanner.nextLine());

        System.out.println("Informe o salário do empregado:");
        empregado.setSalario(scanner.nextDouble());
        scanner.nextLine();


        Empresa empresa = new Empresa();
        System.out.println("Informe a razão social da empresa:");
        empresa.setRazaoSocial(scanner.nextLine());

        System.out.println("Informe o CNPJ da empresa:");
        empresa.setCNPJ(scanner.nextLine());

        System.out.println("Informe o telefone da empresa:");
        empresa.setFone(scanner.nextLine());

        empregado.setEmpresa(empresa);

        System.out.println("\n--- Dados do Empregado ---");
        System.out.println("Nome: " + empregado.getNome());
        System.out.println("Salário: " + empregado.getSalario());

        Empresa emp = empregado.getEmpresa();
        System.out.println("\n--- Dados da Empresa ---");
        System.out.println("Razão Social: " + emp.getRazaoSocial());
        System.out.println("CNPJ: " + emp.getCNPJ());
        System.out.println("Telefone: " + emp.getFone());

        scanner.close();
    }
}
