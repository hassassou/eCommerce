package org.web.eboutique.entities;

import java.io.Serializable;
import java.util.Collection;

public class User implements Serializable {
    private Long idUser;
    private String userName;
    private String password;
    private boolean avtived;
    private Collection<Role> roles;

    public User() {
        super();
    }

    public User(String userName, String password, boolean avtived) {
        this.userName = userName;
        this.password = password;
        this.avtived = avtived;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAvtived() {
        return avtived;
    }

    public void setAvtived(boolean avtived) {
        this.avtived = avtived;
    }

    public Collection<Role> getRoles() {
        return roles;
    }

    public void setRoles(Collection<Role> roles) {
        this.roles = roles;
    }
}
