package br.daniel.dao;

import br.daniel.model.Coordenador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CoordenadorDao {

    public boolean salvarCoordenador(Coordenador coordenador) {
        String sql = "insert into empresa.coordenadores(cpf, nome, salario_hora, loja, meta_loja) values(?, ?, ?, ?, ?)";

        Connection connection = null;
        PreparedStatement ps = null;
        boolean sucesso = false;

        try {
            connection = ConnectionFactory.connectMySql();

            ps = connection.prepareStatement(sql);

            ps.setString(1, coordenador.getCpf());
            ps.setString(2, coordenador.getNome());
            ps.setString(3, String.valueOf(coordenador.getSalarioHora()));
            ps.setString(4, coordenador.getLoja());
            ps.setString(5, String.valueOf(coordenador.getMetaDaLoja()));

            ps.execute();

            System.out.println("Coordenador inserido com sucesso");

            sucesso = true;
            return sucesso;

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao salvar o coordenador");
            return sucesso;

        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (connection != null) {
                    connection.close();
                }

            } catch (Exception e2) {
                e2.printStackTrace();
                System.out.println("Erro ao tentar encerrrar as conexões");
            }
            return sucesso;
        }
    }

    public List<Coordenador> coordenadorList() {
        String sql = "SELECT * FROM EMPRESA.COORDENADORES";
        List<Coordenador> coordenadorList = new ArrayList<>();

        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet resultSet = null;

        try {
            connection = ConnectionFactory.connectMySql();
            ps = connection.prepareStatement(sql);
            resultSet = ps.executeQuery();

            while (resultSet.next()) {
                Coordenador coordenador = new Coordenador();
                coordenador.setCpf(resultSet.getString(1));
                coordenador.setNome(resultSet.getString(2));
                coordenador.setSalarioHora(Double.valueOf(resultSet.getString(3)));
                coordenador.setLoja(resultSet.getString(4));
                coordenador.setMetaDaLoja(Double.valueOf(resultSet.getString(5)));

                coordenadorList.add(coordenador);
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao buscar lista de coordenadores");

        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                System.out.println("Erro ao fechar a conexão");
            }
         }
        return coordenadorList;
    }

    public boolean deletarCoordenador(String cpf) {
        String sql = "delete from empresa.coordenadores where cpf = ?";

        Connection connection = null;
        PreparedStatement ps = null;
        boolean sucesso = false;

        try {
            connection = ConnectionFactory.connectMySql();

            ps = connection.prepareStatement(sql);

            ps.setString(1, cpf);

            ps.execute();

            System.out.println("Coordenador deletado com sucesso");

            sucesso = true;
            return sucesso;

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao deletar o coordenador");
            return sucesso;

        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (connection != null) {
                    connection.close();
                }

            } catch (Exception e2) {
                e2.printStackTrace();
                System.out.println("Erro ao tentar encerrar as conexões");
            }
            return sucesso;
        }
    }

    public boolean AlterarCoordenador(){
        String sql = "UPDATE empresa.coordenadores SET ? = ? WHERE CPF = ?";
        return false;
    }
}
