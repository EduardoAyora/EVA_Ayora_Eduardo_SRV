package ec.edu.ups.est.ProyectoFinal.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.est.ProyectoFinal.model.Automovil;

@Stateless
public class AutomovilDAO {
	@PersistenceContext
	private EntityManager em;

	public void insert(Automovil op) {
		em.persist(op);
	}
	
	public List<Automovil> getList() {		
		List<Automovil> listado = new ArrayList<Automovil>();
		String jpql = "SELECT op FROM Automovil op";
		Query query = em.createQuery(jpql, Automovil.class);
		listado = query.getResultList();
		return listado;
	}
}
