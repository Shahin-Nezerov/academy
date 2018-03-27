package pro.nazarov.shaheen.academy.jpa.tool;

import org.hibernate.Query;
import org.springframework.core.GenericTypeResolver;
import pro.nazarov.shaheen.academy.jpa.tool.enums.SearchAttribute;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Shahin on 10/10/2016.
 */
public abstract class DefaultDaoImpl<PK extends Serializable, M> extends HibernateTool implements DefaultDao<PK, M> {


    private final Class<M> genericType;
    private final String className;
    private final String defaultHql;

    public DefaultDaoImpl() {
        this.genericType = (Class<M>) GenericTypeResolver.resolveTypeArguments(getClass(), DefaultDaoImpl.class)[1];
        this.className = this.genericType.getName();
        this.defaultHql = "from " + className + " t";
    }

    @Override
    public M get(PK key) {
        M model = (M) getSession().get(className, key);
        return model;
    }

    @Override
    public List<M> list() {
        List<M> list = getSession().createQuery(defaultHql).list();
        return list;
    }

    @Override
    public void save(M model) {
        getSession().save(model);
    }

    @Override
    public void update(M model) {
        getSession().update(model);
    }

    @Override
    public void remove(M model) {
        getSession().delete(model);
    }

    @Override
    public int count() {
        return (Integer) getSession().createQuery("select count(t.*) " +defaultHql).uniqueResult();
    }

    @Override
    public List<M> advanceSearch(String[] orders , int start, int limit,SearchModel... values) {

        if (values != null) {

            String hql = defaultHql;

            if (values.length > 0) {
                hql += " where ";
                for (SearchModel model : values) {
                    if(model.getAttribute().equals(SearchAttribute.LIKE) || model.getAttribute().equals(SearchAttribute.NLIKE)){
                        model.setValue(model.getValue().toString());
                        hql += " t." + model.getName()
                                + " "+model.getAttribute().getHql()+" :" + model.getName() +
                                (model.isAnd() ? " and " : " or ");
                        continue;
                    }
                    hql += " t." + model.getName()
                            + " "+model.getAttribute().getHql()+" :" + model.getName() +
                    (model.isAnd() ? " and " : "  or ");
                }
                hql = hql.substring(0, hql.length() - 4);
            }

            if(orders != null && orders.length > 0) {
                hql+=" order by ";
                for (String order : orders)
                    hql += " t." + order +" ,";
                hql = hql.substring(0,hql.length()-2);
            }

            Query query = getSession().createQuery(hql);

            for (SearchModel model : values) {
                query.setParameter(model.getName(), model.getValue());
            }

            if(start != 0)
                query.setFirstResult(start);

            if(limit != 0)
                query.setMaxResults(limit);

            return query.list();
        }
        return list();

    }

    @Override
    public List<M> advanceSearch(SearchModel... values) {
        return advanceSearch(null,0,0,values);
    }

    @Override
    public List<M> advanceSearch(int limit, SearchModel... values) {
        return advanceSearch(null,0,limit,values);
    }

    @Override
    public List<M> advanceSearch(String[] orders, SearchModel... values) {
        return advanceSearch(orders,0,0,values);
    }

    @Override
    public List<M> advanceSearch(String[] orders, int limit, SearchModel... values) {
        return advanceSearch(orders,0,limit,values);
    }
}
