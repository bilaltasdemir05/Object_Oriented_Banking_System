package hibernate;

import com.proje.model.M�steri;
import com.proje.model.�grenci;

public interface m�steriRepository {
	jpaFactory jpaFactory=new jpaFactoryImpl();
	void save(M�steri m�steri);
	void delete(M�steri m�steri);
	M�steri find(int id);
	M�steri update(M�steri m�steri);

}
