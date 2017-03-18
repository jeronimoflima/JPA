package senai.comjpa.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public abstract class JPAAbstract extends JPAConnection {
	
	public <T> void incluir(T o) {
		EntityManager em = getEntityManager();
		em.getTransaction().begin();
		em.persist(o);
		em.getTransaction().commit();
		em.close();
	}

	
	public <T> T buscarPorId(int id) {
		String hql = "select e from " + getEntityName() +
				" e where id = " + id;
		Query query = super.getQuery(hql);
		@SuppressWarnings("unchecked")
		List<T> list = query.getResultList();
		for(T object : list){
			return(object);
		}
		
		return null;
	}
	
	public abstract String getEntityName();
}
