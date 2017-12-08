package pro.nazarov.academy.jpa.tool;


import pro.nazarov.academy.jpa.tool.enums.SearchAttribute;

/**
 * Created by Shahin on 11/5/2016.
 */
public class SearchModel {

    private String name;
    private SearchAttribute attribute;
    private boolean and;
    private Object value;

    public SearchModel(String name, SearchAttribute attribute, boolean and, Object value) {
        this.name = name;
        this.attribute = attribute;
        this.and = and;
        this.value = value;
    }

    public boolean isAnd() {
        return and;
    }

    public void setAnd(boolean and) {
        this.and = and;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SearchAttribute getAttribute() {
        return attribute;
    }

    public void setAttribute(SearchAttribute attribute) {
        this.attribute = attribute;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
