import java.util.ArrayList;

public class Setores {
    private String nomeSetor;
    private String responsavelSetor;

    // Cria uma lista estática chamada listaDeSetores dentro da classe Setores
    private static ArrayList<Setores> listaDeSetores = new ArrayList<>();

    // Construtor
    public Setores(String nomeSetor, String responsavelSetor) {
        this.nomeSetor = nomeSetor;
        this.responsavelSetor = responsavelSetor;
    }

    // Getters
    public String getNomeSetor() {
        return nomeSetor;
    }

    public String getResponsavelSetor() {
        return responsavelSetor;
    }

    // Setters
    public void setNomeSetor(String nomeSetor) {
        this.nomeSetor = nomeSetor;
    }

    public void setResponsavelSetor(String responsavelSetor) {
        this.responsavelSetor = responsavelSetor;
    }

    // Método para adicionar setor
    public static void adicionarSetor(String nomeSetor, String responsavelSetor) {
        Setores novoSetor = new Setores(nomeSetor, responsavelSetor);
        listaDeSetores.add(novoSetor);
        System.out.println("Setor adicionado: " + nomeSetor);
    }

    // Método para editar um setor
    public static void atualizarSetor(String nomeSetor, String novoNomeSetor, String novoResponsavel) {
        for (Setores setor : listaDeSetores) {
            if (setor.getNomeSetor().equals(nomeSetor)) {
                setor.setNomeSetor(novoNomeSetor);
                setor.setResponsavelSetor(novoResponsavel);
                
                System.out.println("Setor atualizado: " + setor.getNomeSetor() + ", Responsável: " + setor.getResponsavelSetor());
                return;
            }
        }
        System.out.println("Setor não encontrado: " + nomeSetor);
    }

    // Método para remover um setor
    public static void removerSetor(String nomeSetor) {
        for (Setores setor : listaDeSetores) {
            if (setor.getNomeSetor().equals(nomeSetor)) {
                listaDeSetores.remove(setor);
                System.out.println("Setor removido: " + nomeSetor);
                return;
            }
        }
        System.out.println("Setor não encontrado: " + nomeSetor);
    }

    // Método para listar todos os setores
    public static void listarSetores() {
        for (Setores setor : listaDeSetores) {
            System.out.println("Nome do Setor: " + setor.getNomeSetor() + ", Responsável: " + setor.getResponsavelSetor());
        }
    }
}
