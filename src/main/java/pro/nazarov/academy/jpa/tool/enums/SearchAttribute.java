package pro.nazarov.academy.jpa.tool.enums;

/**
 * Created by Shahin on 11/5/2016.
 */
public enum SearchAttribute {

    EQUALS ("="),
    GREATER(">"),LESS("<"),
    GREATEREQUALS(">="),LESSEQUALS("<="),
    LIKE("Like"),

    NEQUALS ("!="),
    NGREATER("!>"),NLESS("!<"),
    NGREATEREQUALS("!>="),NLESSEQUALS("!<="),
    NLIKE("Not Like")

    ;


    SearchAttribute(String hql){
        this.hql = hql;
    }

    private String hql;

    public String getHql() {
        return hql;
    }



}
