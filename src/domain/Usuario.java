package domain;

public class Usuario {

    String nome;
    Long ID;
    Integer password;
    public Usuario(String nome, Long ID, Integer senha) {
        this.nome = nome;
        this.ID = ID;
        this.password = senha;
    }

    public Usuario() {

    }
    public String getNome() {
        return nome;
    };
    public Long getID() {
        return ID;
    };
    public Integer getpassword() {
        return password;
    };

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public void setSenha(Integer senha) {
        this.password = senha;
    }

    @Override
    public String   toString() {
        return "domain.Usuario{" +
                "nome='" + nome + '\'' +
                ", ID=" + ID +
                ", senha='" + password + '\'' +
                '}';
    }
}