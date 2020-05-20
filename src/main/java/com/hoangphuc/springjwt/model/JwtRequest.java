package com.hoangphuc.springjwt.model;

import java.io.Serializable;
import java.util.Objects;

public class JwtRequest implements Serializable {
   private static final long serialVersionUID = 5926468583005150707L; 
   private String username;
   private String password;


    public JwtRequest() {
    }

    public JwtRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof JwtRequest)) {
            return false;
        }
        JwtRequest jwtRequest = (JwtRequest) o;
        return Objects.equals(username, jwtRequest.username) && Objects.equals(password, jwtRequest.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password);
    }

    @Override
    public String toString() {
        return "{" +
            " username='" + getUsername() + "'" +
            ", password='" + getPassword() + "'" +
            "}";
    }
   

}