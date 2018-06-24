package org.web.eboutique.entities;

import java.io.Serializable;

public class Role implements Serializable {
    private Long idRole;
    private String roleName;

    public Role() {
        super();
    }

    public Role(String roleName) {
        this.roleName = roleName;
    }

    public Long getIdRole() {
        return idRole;
    }

    public void setIdRole(Long idRole) {
        this.idRole = idRole;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
