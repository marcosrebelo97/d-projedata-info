import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Principal {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        List<Funcionario> funcionarios = new ArrayList<>();

        // 3.1 - INSERIR TODOS OS FUNCIONÁRIOS
        funcionarios.add(new Funcionario("João", LocalDate.of(1990, 3, 15), new BigDecimal("2500.00"), "Gerente"));
        funcionarios.add(new Funcionario("Maria", LocalDate.of(1985, 6, 22), new BigDecimal("1800.50"), "Analista"));
        funcionarios.add(new Funcionario("Pedro", LocalDate.of(1992, 8, 8), new BigDecimal("2100.00"), "Programador"));
        funcionarios.add(new Funcionario("Ana", LocalDate.of(1993, 10, 5), new BigDecimal("1900.00"), "Analista"));
        funcionarios.add(new Funcionario("Márcia", LocalDate.of(1988, 12, 18), new BigDecimal("2200.00"), "Programador"));
        System.out.println(funcionarios);

        // 3.2 - REMOVER O FUNCIONÁRIO "JOÃO"
        // funcionarios.removeIf(funcionario -> funcionario.getNome().equals("João"));
        // System.out.println(funcionarios);

        // 3,3 - IMPRIMIR TODOS OS FUNCIONÁRIOS
        /*
         * System.out.println("3.3 - Funcionários");
         * funcionarios.forEach(System.out::println);
         */

        // 3.4 - AUMENTAR O SALÁRIO DOS FUNCIONÁRIOS EM 10%
        /*
         * funcionarios.forEach(funcionario -> {
         * BigDecimal novoSalario = funcionario.getSalario().multiply(new
         * BigDecimal("1.10"));
         * funcionario.setSalario(novoSalario);
         * });
         * System.out.println(funcionarios);
         */

        // 3.5 - AGRUPAR OS FUNCIONÁRIOS POR FUNÇÃO
        /*
         * Map<String, List<Funcionario>> funcionariosPorFuncao = funcionarios.stream()
         * .collect(Collectors.groupingBy(Funcionario::getFuncao));
         */

        // 3.6 - IMPRIMIR OS FUNCIONÁRIOS AGRUPADOR POR FUNÇÃO
        /*
         * System.out.println("\n3.6 - Funcionários agrupados por função:");
         * funcionariosPorFuncao.forEach((funcao, listaFuncionarios) -> {
         * System.out.println("Função: " + funcao);
         * listaFuncionarios.forEach(System.out::println);
         * });
         */

        // IMPRIMIR OS FUNCIONÁRIOS QUE FAZEM ANIVERSÁRIO EM OUTUBRO(MêS 10) E
        // DEZEMBRO(mês 12)
        /*
         * System.out.
         * println("\n3.8 - Funcionários que fazem aniversário em outubro e dezembro:");
         * funcionarios.stream()
         * .filter(funcionario -> {
         * int mesAniversario = funcionario.getDataNascimento().getMonthValue();
         * return mesAniversario == 10 || mesAniversario == 12;
         * })
         * .forEach(System.out::println);
         */

        // IMPRIMIR FUNCIONÁRIO COM A MAIOR IDADE
        /*System.out.println("\n3.9 - Funcionário mais velho:");
        Funcionario funcionarioMaiorIdade = Collections.min(funcionarios,
                Comparator.comparing(Funcionario::getDataNascimento));
        int idadeFuncionarioMaiorIdade = LocalDate.now().getYear()
                - funcionarioMaiorIdade.getDataNascimento().getYear();
        System.out.println("Nome: " + funcionarioMaiorIdade.getNome() + ", Idade: " + idadeFuncionarioMaiorIdade);*/

        //IMPRIMIR A LISTA DE FUNCIONÁRIOS POR ORDEM ALFABÉTICA
        /*System.out.println("\n3.10 - Funcionários em ordem alfabética:");
        List<Funcionario> funcionariosOrdenados = new ArrayList<>(funcionarios);
        funcionariosOrdenados.sort(Comparator.comparing(Funcionario::getNome));
        funcionariosOrdenados.forEach(System.out::println);*/

        //IMPRIMIR O TOTAL DOS SALÁRIOS DOS FUNCIONÁRIOS
        /*System.out.println("\n3.11 - Total dos salários dos funcionários:");
        BigDecimal totalSalarios = funcionarios.stream()
                .map(Funcionario::getSalario)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println("Total: " + totalSalarios.toString().replace(".", ","));*/

        // 3.12 - Imprimir quantos salários mínimos ganha cada funcionário
        /*System.out.println("\n3.12 - Salários mínimos ganhos por cada funcionário:");
        BigDecimal salarioMinimo = new BigDecimal("1212.00");
        funcionarios.forEach(funcionario -> {
            BigDecimal salarioMinimoGanho = funcionario.getSalario().divide(salarioMinimo, 2, BigDecimal.ROUND_DOWN);
            System.out.println("Funcionário: " + funcionario.getNome() + ", Salários mínimos: " + salarioMinimoGanho);
        });*/

    }
}
