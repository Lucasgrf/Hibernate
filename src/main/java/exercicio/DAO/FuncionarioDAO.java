package exercicio.DAO;

import exercicio.Model.Departamento;
import exercicio.Model.Funcionario;
import exercicio.Model.Projeto;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceException;

public class FuncionarioDAO extends GenericDAO<Funcionario> {

    public Funcionario findByDepartament(Departamento departamento) {
        try {
            em.getTransaction().begin();
            Funcionario funcionario = em.createQuery("SELECT f FROM Funcionario f WHERE f.departamento = :departamento", Funcionario.class)
                    .setParameter("departamento", departamento)
                    .getSingleResult();
            em.getTransaction().commit();
            return funcionario;
        } catch (NoResultException e) {
            System.out.println("Funcionário não encontrado para o departamento: " + departamento.getId());
            return null;
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            System.out.println("Erro ao buscar funcionário por departamento: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }


    public Funcionario findByProject(Projeto projeto) {
        try {
            em.getTransaction().begin();
            Funcionario funcionario = em.createQuery("SELECT f FROM Funcionario f JOIN f.projeto p WHERE p.id = :projetoId", Funcionario.class)
                    .setParameter("projetoId", projeto.getId())
                    .getSingleResult();
            em.getTransaction().commit();
            return funcionario;
        } catch (NoResultException e) {
            // Tratar caso não seja encontrado
            System.out.println("Funcionário não encontrado para o projeto com ID: " + projeto.getId());
            return null;
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            System.out.println("Erro ao buscar funcionário por projeto: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

}
