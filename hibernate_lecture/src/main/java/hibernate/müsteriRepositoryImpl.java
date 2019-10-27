package hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import com.proje.model.Müsteri;
import com.proje.model.ögrenci;

public class müsteriRepositoryImpl implements müsteriRepository {
	EntityManager entityManager=jpaFactory.getEntityManager();
	EntityTransaction transaction=jpaFactory.getEntityTransaction();

	@Override
	public void save(Müsteri müsteri) {
		transaction.begin();
		entityManager.persist(müsteri);
		transaction.commit();
	}

	@Override
	public void delete(Müsteri müsteri) {
		transaction.begin();
		entityManager.remove(müsteri);
		transaction.commit();
		
	}

	@Override
	public Müsteri find(int id) {
		Müsteri müsteri=this.entityManager.find(Müsteri.class, id);
		if(müsteri!=null) {
			return müsteri;
		}
		return null;
		
	}

	@Override
	public Müsteri update(Müsteri müsteri) {
		transaction.begin();
		Müsteri updatedMüsteri=this.entityManager.merge(müsteri);
		transaction.commit();
		return updatedMüsteri;
	}


}
