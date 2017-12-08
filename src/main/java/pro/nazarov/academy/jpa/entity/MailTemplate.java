package pro.nazarov.academy.jpa.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Shahin on 3/6/2016.
 */
@Entity
@Table(name = "MAIL_TEMPLATE")
@NamedQueries({
//        @NamedQuery(name = "subscriber" , query = "")
})
public class MailTemplate {

    @Id
    @Column(name = "NAME",nullable = false)
    private String name;

    @Lob
    @Column(name = "HTML_TEXT")
    @NotNull
    private String htmlText;

    @Column(name = "MODE")
    private boolean htmlMode;

    @Column(name = "SUBJECT")
    private String subject;

    @Column(name = "CREATED_DATE")
    @Temporal(TemporalType.DATE)
    private Date registred = new Date();

    public Date getRegistred() {
        return registred;
    }

    public void setRegistred(Date registred) {
        this.registred = registred;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getHtmlText() {
        return htmlText;
    }

    public void setHtmlText(String htmlText) {
        this.htmlText = htmlText;
    }

    public boolean isHtmlMode() {
        return htmlMode;
    }

    public void setHtmlMode(boolean htmlMode) {
        this.htmlMode = htmlMode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
