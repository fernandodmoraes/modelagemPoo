package javautil;

import javax.persistence.EntityManager;
import fernandodmoraes.com.github.Mpoo.Cliente;
import fernandodmoraes.com.github.Mpoo.Emissor;
import fernandodmoraes.com.github.Mpoo.Produto;

public class AppTeste {

	public static void main(String[] args) {
			
		
			Cliente cli = new Cliente("Joãozinho","123.456.789-00");
			Emissor ems = new Emissor("","");
			Produto pro = new Produto("","");
			
			EntityManager em = JpaUtils.getEntityManager();
			
			em.getTransaction().begin(); // mode ediÃ§Ã£o
			em.persist(cli); // gravar o objeto
			em.getTransaction().commit();
			
			
			
		}

	}
