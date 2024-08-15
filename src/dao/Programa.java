package dao;

import domain.Conteudo;
import domain.Usuario;

import java.util.*;

public class Programa implements IPrograma {

    List<Usuario> listUser;
    List<Conteudo> listConteudo;

    public Programa() {
        listUser = new ArrayList<>();
        listConteudo = new ArrayList<>();
    }

    @Override
    public boolean criarUsuario(Usuario usuario) {
        if (listUser.contains(usuario)) {
            System.out.println("Usuario já cadastrado");
            return false;
        }
        listUser.add(usuario);
        System.out.println("Usuario cadastrado com sucesso");
        System.out.println(usuario);
        return true;
    }

    @Override
    public boolean criarConteudo(Conteudo conteudo) {
        if (listConteudo.contains(conteudo)) {
            System.out.println("Conteudo ja existente");
            return false;
        }
        listConteudo.add(conteudo);
        System.out.println("Conteudo cadastrado com sucesso");
        return true;

    }

    @Override
    public boolean excluirConteudo(Long ID) {
        for (Conteudo conteudo : listConteudo) {
            if (conteudo.getID().equals(ID)) {
                listConteudo.remove(conteudo);
                System.out.println("Conteudo excluido com sucesso");
                return true;
            }

        }
        System.out.println("Conteudo não encontrado");
        return false;
    }

    @Override
    public void alterarConteudo(Conteudo conteudo, Long antigoID) {
        for (Conteudo conteudo1 : listConteudo) {
            if (conteudo1.getID().equals(antigoID)) {
                conteudo1.setTypeOfConteudo(conteudo.getTypeOfConteudo());
                conteudo1.setID(conteudo.getID());
                System.out.println("Conteudo alterado com sucesso");
            }
            else{
                System.out.println("Conteudo não alterado");
            }
        }
    }
    @Override
    public Collection<Conteudo> listarConteudo() {
        return listConteudo;
    }

    @Override
    public boolean verificaUser(Long ID, Integer password) {
        for (Usuario usuario : listUser) {
            if (usuario.getID().equals(ID) && usuario.getpassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}
