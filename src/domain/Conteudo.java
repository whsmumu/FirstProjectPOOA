package domain;

public class Conteudo {
    String TypeOfConteudo;
    Long ID;

    public Conteudo(String typeOfConteudo, Long ID) {
        TypeOfConteudo = typeOfConteudo;
        this.ID = ID;
    }

    public Conteudo(){

    }

    public String getTypeOfConteudo() {
        return TypeOfConteudo;
    }

    public Long getID() {
        return ID;
    }

    public void setTypeOfConteudo(String typeOfConteudo) {
        TypeOfConteudo = typeOfConteudo;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "domain.Conteudo{" +
                "TypeOfConteudo='" + TypeOfConteudo + '\'' +
                ", ID=" + ID +
                '}';
    }
}
