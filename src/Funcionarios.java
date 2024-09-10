import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Funcionarios {
    // Atributos
    private String cpf;
    private String nome;
    private int idCargo;
    private int idDepartamento;
    private String contaBancaria;
    private Date dataNascimento;
    private String sexo;
    private String municipio;
    private String endereco;
    private String telefone;
    private String email;
    private Date dataAdmissao;
    private Date dataRecisao;
    private int numeroDependentes;

    // Construtor
    public Funcionarios(String cpf, String nome, int idCargo, int idDepartamento, String contaBancaria,
                        Date dataNascimento, String sexo, String municipio, String endereco,
                        String telefone, String email, Date dataAdmissao, Date dataRecisao, int numeroDependentes) {
        this.cpf = cpf;
        this.nome = nome;
        this.idCargo = idCargo;
        this.idDepartamento = idDepartamento;
        this.contaBancaria = contaBancaria;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.municipio = municipio;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.dataAdmissao = dataAdmissao;
        this.dataRecisao = dataRecisao;
        this.numeroDependentes = numeroDependentes;
    }

    // Getters e Setters
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdCargo() {
        return idCargo;
    }
    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }
    public int getIdDepartamento() {
        return idDepartamento;
    }
    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }
    public String getContaBancaria() {
        return contaBancaria;
    }
    public void setContaBancaria(String contaBancaria) {
        this.contaBancaria = contaBancaria;
    }
    public Date getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getMunicipio() {
        return municipio;
    }
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Date getDataAdmissao() {
        return dataAdmissao;
    }
    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
    public Date getDataRecisao() {
        return dataRecisao;
    }
    public void setDataRecisao(Date dataRecisao) {
        this.dataRecisao = dataRecisao;
    }
    public int getNumeroDependentes() {
        return numeroDependentes;
    }
    public void setNumeroDependentes(int numeroDependentes) {
        if (numeroDependentes <= 5) {
            this.numeroDependentes = numeroDependentes;
        } else {
            System.out.println("Número de dependentes deve ser no máximo 5.");
        }
    }
}

// Classe CRUD para a entidade Funcionarios
class FuncionariosCRUD {
    // Lista para armazenar funcionários
    private List<Funcionarios> funcionariosList = new ArrayList<>();

    // Create - Adicionar funcionário
    public void adicionarFuncionario(Funcionarios funcionario) {
        funcionariosList.add(funcionario);
        System.out.println("Funcionário " + funcionario.getNome() + " adicionado com sucesso.");
    }

    // Read - Obter funcionário por CPF
    public Funcionarios obterFuncionarioPorCpf(String cpf) {
        for (Funcionarios funcionario : funcionariosList) {
            if (funcionario.getCpf().equals(cpf)) {
                return funcionario;
            }
        }
        System.out.println("Funcionário com CPF " + cpf + " não encontrado.");
        return null;
    }

    // Read - Obter todos os funcionários
    public List<Funcionarios> obterTodosFuncionarios() {
        return funcionariosList;
    }

    // Update - Atualizar funcionário por CPF
    public void atualizarFuncionario(String cpf, Funcionarios novoFuncionario) {
        for (int i = 0; i < funcionariosList.size(); i++) {
            if (funcionariosList.get(i).getCpf().equals(cpf)) {
                funcionariosList.set(i, novoFuncionario);
                System.out.println("Funcionário com CPF " + cpf + " atualizado com sucesso.");
                return;
            }
        }
        System.out.println("Funcionário com CPF " + cpf + " não encontrado.");
    }

    // Delete - Remover funcionário por CPF
    public void removerFuncionario(String cpf) {
        Funcionarios funcionario = obterFuncionarioPorCpf(cpf);
        if (funcionario != null) {
            funcionariosList.remove(funcionario);
            System.out.println("Funcionário com CPF " + cpf + " removido com sucesso.");
        }
    }

    public static void main(String[] args) {
        // Fazendo o CRUD
        FuncionariosCRUD crud = new FuncionariosCRUD();

        // Criando objetos Funcionarios
        Funcionarios funcionario1 = new Funcionarios("999.999.999-99", "Emanuel", 1, 101, "123-456",
                new Date(), "Masculino", "Assaré", "Rua 2", "1111-1111", "emanuel@mail.com",
                new Date(), null, 2);

        Funcionarios funcionario2 = new Funcionarios("888.888.888-88", "Emanuel Palácio", 2, 102, "1020-0",
                new Date(), "Masculino", "Juazeiro do Norte", "Rua B", "2222-2222", "emanuelpalacio@mail.com",
                new Date(), null, 1);

        // Adicionando funcionários
        crud.adicionarFuncionario(funcionario1);
        crud.adicionarFuncionario(funcionario2);

        // Lendo funcionário
        Funcionarios f = crud.obterFuncionarioPorCpf("999.999.999-99");
        if (f != null) {
            System.out.println("Funcionário encontrado: " + f.getNome());
        }

        // Atualizando funcionário
        Funcionarios funcionarioAtualizado = new Funcionarios("999.999.999-99",
                "Emanuel Palacio", 1, 201, "1020-0",
                new Date(), "Masculino", "Assaré", "Rua 1", "(88) 9 9999-9999",
                "emanuel@mail.com",new Date(), null, 2);
        crud.atualizarFuncionario("999.999.999-99", funcionarioAtualizado);

        // Removendo funcionário
        crud.removerFuncionario("888.888.888-88");
    }
}
