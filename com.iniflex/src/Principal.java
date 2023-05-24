import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Principal {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        List<Funcionario> funcionarios = new ArrayList<>();

        //3.1 - INSERIR TODOS OS FUNCIONÁRIOS
        funcionarios.add(new Funcionario("João", LocalDate.of(1990, 3, 15), new BigDecimal("2500.00"), "Gerente"));
        funcionarios.add(new Funcionario("Maria", LocalDate.of(1985, 6, 22), new BigDecimal("1800.50"), "Analista"));
        funcionarios.add(new Funcionario("Pedro", LocalDate.of(1992, 8, 8), new BigDecimal("2100.00"), "Programador"));
        funcionarios.add(new Funcionario("Ana", LocalDate.of(1993, 10, 5), new BigDecimal("1900.00"), "Analista"));
        funcionarios.add(new Funcionario("Márcia", LocalDate.of(1988, 12, 18), new BigDecimal("2200.00"), "Programador"));
        //System.out.println(funcionarios);

        //3.2 - REMOVER O FUNCIONÁRIO "JOÃO"
        //funcionarios.removeIf(funcionario -> funcionario.getNome().equals("João"));
        //System.out.println(funcionarios);

        //3,3 - IMPRIMIR TODOS OS FUNCIONÁRIOS
        //System.out.println("3.3 - Funcionários");
        //funcionarios.forEach(System.out::println);

        //3.4 - AUMENTAR O SALÁRIO DOS FUNCIONÁRIOS EM 10%
        funcionarios.forEach(funcionario -> {
            BigDecimal novoSalario = funcionario.getSalario().multiply(new BigDecimal("1.10"));
            funcionario.setSalario(novoSalario);
        });
        //System.out.println(funcionarios);

        //3.5 - AGRUPAR OS FUNCIONÁRIOS POR FUNÇÃO
        Map<String, List<Funcionario>> funcionariosPorFuncao = funcionarios.stream()
                .collect(Collectors.groupingBy(Funcionario::getFuncao));

        System.out.println("\n3.6 - Funcionários agrupados por função:");
        funcionariosPorFuncao.forEach((funcao, listaFuncionarios) -> {
            System.out.println("Função: " + funcao);
            listaFuncionarios.forEach(System.out::println);
        });



    }
}
