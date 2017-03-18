package senai.comjpa.dao.jpa;

import java.util.List;

import javax.persistence.Query;

import senai.comjpa.dao.ClienteDAO;
import senai.comjpa.pojo.Cliente;

public class ClienteJPADAO extends JPAAbstract implements ClienteDAO{

	/*
	@Override
	public Cliente buscarPorId(int id) {
		String hql = "select c from Cliente c where id = " + id;
		Query query = super.getQuery(hql);
		List list = query.getResultList();
		for(Object object : list){
			return((Cliente) object);
		}
		
		return null;
	}*/
	
	@Override
	public String getEntityName(){
	   return "Cliente";	
	}

}
