import java.util.ArrayList;

public class Cargos {
    private String nomeCargo;
    private float salarioBase;
    private int cargaHoraria;
    private float valorGratif;

    // Cria uma lista estática chamada listaDeCargos dentro da classe Cargos
    private static ArrayList<Cargos> listaDeCargos = new ArrayList<>();

    // Construtor
    public Cargos(String nomeCargo, float salarioBase, int cargaHoraria, float valorGratif) {
        this.nomeCargo = nomeCargo;
        this.salarioBase = salarioBase;
        this.cargaHoraria = cargaHoraria;
        this.valorGratif = valorGratif;
    }

    // Getters
    public String getNomeCargo() {
        return nomeCargo;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public float getValorGratif() {
        return valorGratif;
    }

    // Setters
    public void setNomeCargo(String nomeCargo) {
        this.nomeCargo = nomeCargo;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void setValorGratif(float valorGratif) {
        this.valorGratif = valorGratif;
    }

    // Método para adicionar cargo
    public static void adicionarCargo(String nomeCargo, float salarioBase, int cargaHoraria, float valorGratif) {
        Cargos novoCargo = new Cargos(nomeCargo, salarioBase, cargaHoraria, valorGratif);
        listaDeCargos.add(novoCargo);
        System.out.println("Cargo adicionado: " + nomeCargo);
    }

    // Método para editar um cargo
    public static void atualizarCargo(String nomeCargo, String novoNomeCargo, float novoSalarioBase, int novoCargaHoraria, float novoValorGratif) {
        for (Cargos cargo : listaDeCargos) {
            if (cargo.getNomeCargo().equals(nomeCargo)) {
                cargo.setNomeCargo(novoNomeCargo);
                cargo.setSalarioBase(novoSalarioBase);
                cargo.setCargaHoraria(novoCargaHoraria);
                cargo.setValorGratif(novoValorGratif);
                
                System.out.println("Cargo atualizado: " + nomeCargo);
                return;
            }
        }
        System.out.println("Cargo não encontrado: " + nomeCargo);
    }

    // Método para remover um cargo
    public static void removerCargo(String nomeCargo) {
        for (Cargos cargo : listaDeCargos) {
            if (cargo.getNomeCargo().equals(nomeCargo)) {
                listaDeCargos.remove(cargo);
                System.out.println("Cargo removido: " + nomeCargo);
                return;
            }
        }
        System.out.println("Cargo não encontrado: " + nomeCargo);
    }

    // Método para listar todos os Cargos
    public static void listarCargos() {
        for (Cargos cargo : listaDeCargos) {
            System.out.println("Nome do Cargo: " + cargo.getNomeCargo() + ", Salário Base: R$ " + cargo.getSalarioBase() + ", Carga horária mensal: "
            + cargo.getCargaHoraria() + ", Valor gratificação: R$ " + cargo.getValorGratif());
        }
    }
}
