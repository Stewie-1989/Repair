package ru.repair.work.model;

import javax.persistence.*;

@Entity
@Table
public class User {
    @Id
    @GeneratedValue
    private long id;

    @Column
    private String login;

    @Column
    private String password;

    @Column
    private String mail;

    @Column
    private String kayCode;

    public long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getMail() {
        return mail;
    }

    public String getKayCode() {
        return kayCode;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setKayCode(String kayCode) {
        this.kayCode = kayCode;
    }
}
