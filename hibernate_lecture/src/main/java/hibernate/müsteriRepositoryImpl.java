package hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import com.proje.model.M�steri;
import com.proje.model.�grenci;

public class m�steriRepositoryImpl implements m�steriRepository {
	EntityManager entityManager=jpaFactory.getEntityManager();
	EntityTransaction transaction=jpaFactory.getEntityTransaction();

	@Override
	public void save(M�steri m�steri) {
		transaction.begin();
		entityManager.persist(m�steri);
		transaction.commit();
	}

	@Override
	public void delete(M�steri m�steri) {
		transaction.begin();
		entityManager.remove(m�steri);
		transaction.commit();
		
	}

	@Override
	public M�steri find(int id) {
		M�steri m�steri=this.entityManager.find(M�steri.class, id);
		if(m�steri!=null) {
			return m�steri;
		}
		return null;
		
	}

	@Override
	public M�steri update(M�steri m�steri) {
		transaction.begin();
		M�steri updatedM�steri=this.entityManager.merge(m�steri);
		transaction.commit();
		return updatedM�steri;
	}


}
