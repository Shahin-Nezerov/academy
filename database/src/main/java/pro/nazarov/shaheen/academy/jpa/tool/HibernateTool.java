package pro.nazarov.shaheen.academy.jpa.tool;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Shahin on 10/10/2016.
 */
public class HibernateTool {

    @Autowired(required = true)
    private SessionFactory sessionFactory;

    private static Session session;

    public Session getSession(){
        if(session == null){
            try {
                session = sessionFactory.getCurrentSession();
            }catch (HibernateException exception){
                session = sessionFactory.openSession();
            }
        }
        return session;
    }

}
