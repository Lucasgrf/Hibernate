package exercicio;

import exercicio.DAO.DepartamentoDAO;
import exercicio.DAO.FuncionarioDAO;
import exercicio.DAO.ProjetoDAO;
import exercicio.Model.Departamento;
import exercicio.Model.Funcionario;
import exercicio.Model.Projeto;

public class Main {

    public static void main(String[] args) {
        DepartamentoDAO dDao = new DepartamentoDAO();
        FuncionarioDAO fDao = new FuncionarioDAO();
        ProjetoDAO pDao = new ProjetoDAO();

        Departamento d1 = new Departamento();
        Funcionario f1 = new Funcionario();
        Projeto p1 = new Projeto();

        /*p1.setNome("Recrutamento");
        //pDao.save(p1);

        f1.setNome("João");
        f1.setDepartamento(dDao.findById(Departamento.class,2L));
        f1.setProjeto(p1);
        f1.setCargo("Tech Recruiter");

        fDao.save(f1);*/

        /*d1 = dDao.findById(Departamento.class,1); FIND
        f1 = fDao.findById(Funcionario.class,1);
        p1 = pDao.findById(Projeto.class,1);

        System.out.println(d1);
        System.out.println(f1);
        System.out.println(p1);*/

        /*d1.setNome("RH"); SAVE / INSERT
        dDao.save(d1);
        System.out.println(dDao.findById(Departamento.class,d1.getId()));*/

        /*d1 = dDao.findById(Departamento.class,3L); DELETE
        dDao.delete(d1);*/

        /*System.out.println(dDao.findAll(Departamento.class)); FIND ALL */

        /*d1.setNome("Recursos Humanos"); UPDATE
        d1.setId(2L);
        dDao.update(d1); */

        //System.out.println(fDao.findByDepartament(new Departamento(1L)));

        //System.out.println(fDao.findByProject(new Projeto(2L)));

    }
}


