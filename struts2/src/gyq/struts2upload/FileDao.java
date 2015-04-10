package gyq.struts2upload;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public class FileDao {
	private static SessionFactory sf ;
	public FileDao() {
		Configuration cfg = new Configuration().configure();
		sf = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build());
	}

	public void save(FileEntity uploadfile) {
	
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(uploadfile);
		session.getTransaction().commit();
		session.close();
	
	}
	public void sessionfactoryclose(){
		sf.close();
		
	}

}
