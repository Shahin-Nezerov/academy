package pro.nazarov.academy.jpa.tool;

import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Shahin on 10/10/2016.
 */
public interface DefaultDao<PK extends Serializable, M> {

    M get(PK key);

    List<M> list();

    @Transactional
    void save(M model);

    @Transactional
    void update(M model);

    @Transactional
    void remove(M model);

    int count();

    List<M> advanceSearch(SearchModel... values);

    List<M> advanceSearch(int limit, SearchModel... values);

    List<M> advanceSearch(String[] orders, SearchModel... values);

    List<M> advanceSearch(String[] orders, int limit, SearchModel... values);

    List<M> advanceSearch(String[] orders, int start, int limit, SearchModel... values);
}
