package dao;

import domain.Conteudo;
import domain.Usuario;

import java.util.Collection;

public interface IPrograma {
    public boolean criarUsuario(Usuario usuario);
    public boolean criarConteudo(Conteudo conteudo);
    public boolean excluirConteudo(Long ID);
    public void alterarConteudo(Conteudo conteudo, Long ID);
    public Collection<Conteudo> listarConteudo();
    public boolean verificaUser(Long ID, Integer password);


}
