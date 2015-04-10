package gyq.struts2download;

import gyq.struts2upload.FileEntity;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

public class DownloadDao {
	private static SessionFactory sf;
		public DownloadDao() {
			Configuration cfg = new Configuration().configure();
			sf = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build());
		}
		public  List<FileEntity> getdownloadfiel(){
			Session session = sf.openSession();
			session.beginTransaction();
			Query q = session.createQuery("from FileEntity");
			List<FileEntity> fileentity = (List<FileEntity>)q.list();
			session.getTransaction().commit();
			return fileentity;
		}
		public void close(){
			sf.close();
		}
		@Test
		public void test(){
			List<FileEntity> fileentitylist = getdownloadfiel();
		
		}
}
