import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class folhaPagamento {

    public static List<folhaPagamento> getFolhaPagamentos() {
        return folhaPagamentos;
    }

    public static void setFolhaPagamentos(List<folhaPagamento> folhaPagamentos) {
        folhaPagamento.folhaPagamentos = folhaPagamentos;
    }
    private int idPagamento;
    private int idFuncionario;
    private LocalDate dataPagamento;
    private double totalPagamento;
    private String statusPagamento;

    // Construtor da classe com validações
    public folhaPagamento(int idPagamento, int idFuncionario, LocalDate dataPagamento, double totalPagamento, String statusPagamento) {
        setIdPagamento(idPagamento); 
        setIdFuncionario(idFuncionario);
        this.dataPagamento = dataPagamento;
        this.totalPagamento = totalPagamento;
        setStatusPagamento(statusPagamento);
    }

    // Getters e Setters com validações
    public int getIdPagamento() {
        return idPagamento;
    }

    private void setIdPagamento(int idPagamento) {
        if (idPagamento > 0) {
            this.idPagamento = idPagamento;
        } else {
            throw new IllegalArgumentException("ID de pagamento deve ser maior que zero.");
        }
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    private void setIdFuncionario(int idFuncionario) {
        if (idFuncionario > 0) {
            this.idFuncionario = idFuncionario;
        } else {
            throw new IllegalArgumentException("ID do funcionário deve ser maior que zero.");
        }
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public double getTotalPagamento() {
        return totalPagamento;
    }

    public void setTotalPagamento(double totalPagamento) {
        this.totalPagamento = totalPagamento;
    }

    public String getStatusPagamento() {
        return statusPagamento;
    }

    private void setStatusPagamento(String statusPagamento) {
        if (statusPagamento.equals("Não Pago") || 
            statusPagamento.equals("Em Processo") || 
            statusPagamento.equals("Pago")) {
            this.statusPagamento = statusPagamento;
        } else {
            throw new IllegalArgumentException("Status de pagamento inválido. Use 'Não Pago', 'Em Processo' ou 'Pago'.");
        }
    }

    // Método de exibição de folha de pagamento
    public void exibirFolha() {
        System.out.println("ID Pagamento: " + idPagamento);
        System.out.println("ID Funcionário: " + idFuncionario);
        System.out.println("Data de Pagamento: " + dataPagamento);
        System.out.println("Total de Pagamento: " + totalPagamento);
        System.out.println("Status do Pagamento: " + statusPagamento);
    }

    // Simulando um banco de dados com lista
    private static List<folhaPagamento> folhaPagamentos = new ArrayList<>();

    // Método CREATE: adiciona uma nova folha de pagamento
    public static void criarFolha(folhaPagamento folha) {
        folhaPagamentos.add(folha);
        System.out.println("Folha de pagamento adicionada com sucesso!");
    }

    // Método READ: busca uma folha de pagamento pelo ID
    public static void lerFolha(int idPagamento) {
        Optional<folhaPagamento> folha = folhaPagamentos.stream()
            .filter(f -> f.getIdPagamento() == idPagamento)
            .findFirst();

        if (folha.isPresent()) {
            folha.get().exibirFolha();
        } else {
            System.out.println("Folha de pagamento com ID " + idPagamento + " não encontrada.");
        }
    }

    // Método UPDATE: atualiza uma folha de pagamento existente
    public static void atualizarFolha(int idPagamento, folhaPagamento novaFolha) {
        Optional<folhaPagamento> folha = folhaPagamentos.stream()
            .filter(f -> f.getIdPagamento() == idPagamento)
            .findFirst();

        if (folha.isPresent()) {
            folhaPagamento folhaAtual = folha.get();
            folhaAtual.setIdFuncionario(novaFolha.getIdFuncionario());
            folhaAtual.setDataPagamento(novaFolha.getDataPagamento());
            folhaAtual.setTotalPagamento(novaFolha.getTotalPagamento());
            folhaAtual.setStatusPagamento(novaFolha.getStatusPagamento());
            System.out.println("Folha de pagamento atualizada com sucesso!");
        } else {
            System.out.println("Folha de pagamento com ID " + idPagamento + " não encontrada.");
        }
    }

    // Método DELETE: remove uma folha de pagamento pelo ID
    public static void deletarFolha(int idPagamento) {
        boolean removido = folhaPagamentos.removeIf(f -> f.getIdPagamento() == idPagamento);
        if (removido) {
            System.out.println("Folha de pagamento removida com sucesso!");
        } else {
            System.out.println("Folha de pagamento com ID " + idPagamento + " não encontrada.");
        }
    }

    // Método para listar todas as folhas de pagamento
    public static void listarFolhas() {
        if (folhaPagamentos.isEmpty()) {
            System.out.println("Nenhuma folha de pagamento cadastrada.");
        } else {
            folhaPagamentos.forEach(folhaPagamento::exibirFolha);
        }
    }
}
