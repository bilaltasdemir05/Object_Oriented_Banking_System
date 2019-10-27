package hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class jpaFactoryImpl implements jpaFactory {
	private EntityManager entitiyManager =null;
	@Override
	public EntityManager getEntityManager() {
		EntityManagerFactory factory =Persistence.createEntityManagerFactory("persistence-unit");
		this.entitiyManager=factory.createEntityManager();
		return entitiyManager;
	}

	@Override
	public EntityTransaction getEntityTransaction() {
		EntityTransaction transaction=this.entitiyManager.getTransaction();
		return transaction;
	}

}
