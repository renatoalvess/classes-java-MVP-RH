import java.util.Date;

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

    // Construtor!
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
