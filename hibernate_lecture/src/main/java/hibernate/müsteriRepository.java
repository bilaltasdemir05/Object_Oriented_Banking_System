package hibernate;

import com.proje.model.Müsteri;
import com.proje.model.ögrenci;

public interface müsteriRepository {
	jpaFactory jpaFactory=new jpaFactoryImpl();
	void save(Müsteri müsteri);
	void delete(Müsteri müsteri);
	Müsteri find(int id);
	Müsteri update(Müsteri müsteri);

}
