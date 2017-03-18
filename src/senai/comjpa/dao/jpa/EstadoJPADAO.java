package senai.comjpa.dao.jpa;

import java.util.List;

import javax.persistence.Query;

import senai.comjpa.dao.EstadoDAO;
import senai.comjpa.pojo.Estado;

public class EstadoJPADAO extends JPAAbstract implements EstadoDAO{

	@Override
	public String getEntityName(){
	   return "Estado";	
	}
}
