package pe.edu.upc.decorroom.model.repository.impl;

import java.util.List;
import java.util.Optional;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pe.edu.upc.decorroom.model.entity.Furniture;
import pe.edu.upc.decorroom.model.repository.FurnitureRepository;

@Named
@ApplicationScoped
public class FurnitureRepositoryImpl implements FurnitureRepository {

	@PersistenceContext(unitName = "decorroomPU")
	private EntityManager entityManager; 
		
	@Override
	public EntityManager getEntityManager() {
	return entityManager;
	}

	@Override
	public Optional<Furniture> findById(String id) throws Exception {
		return findById(id, Furniture.class);
	}

	@Override
	public List<Furniture> findAll() throws Exception {
		String jpql = "SELECT furniture FROM Furniture furniture";
		return findByQuery(Furniture.class, jpql);
	}
}
