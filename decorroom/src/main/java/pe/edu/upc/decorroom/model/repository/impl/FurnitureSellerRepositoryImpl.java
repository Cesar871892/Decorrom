package pe.edu.upc.decorroom.model.repository.impl;

import java.util.List;
import java.util.Optional;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pe.edu.upc.decorroom.model.entity.FurnitureSeller;
import pe.edu.upc.decorroom.model.repository.FurnitureSellerRepository;

@Named
@ApplicationScoped
public class FurnitureSellerRepositoryImpl implements FurnitureSellerRepository {

	@PersistenceContext(unitName = "decorroomPU")
	private EntityManager entityManager;

	@Override
	public EntityManager getEntityManager() {
		return entityManager;
	}

	@Override
	public Optional<FurnitureSeller> findById(String id) throws Exception {

		return findById(id, FurnitureSeller.class);
	}

	@Override
	public List<FurnitureSeller> findAll() throws Exception {
		String jpql = "SELECT furnitureseller FROM FurnitureSeller furnitureseller";
		return findByQuery(FurnitureSeller.class, jpql);
	}

}
