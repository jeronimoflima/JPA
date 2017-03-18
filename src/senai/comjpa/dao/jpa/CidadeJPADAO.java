package senai.comjpa.dao.jpa;

import java.util.List;

import javax.persistence.Query;

import senai.comjpa.dao.CidadeDAO;
import senai.comjpa.pojo.Cidade;

public class CidadeJPADAO extends JPAAbstract implements CidadeDAO{

	/*
	@Override
	public Cidade buscarPorId(int id) {
		String hql = "select c from Cidade c where id = " + id;
		Query query = super.getQuery(hql);
		List list = query.getResultList();
		for(Object object : list){
			return((Cidade) object);
		}
		
		return null;
	}
	*/

	@Override
	public String getEntityName(){
	   return "Cidade";	
	}
}
