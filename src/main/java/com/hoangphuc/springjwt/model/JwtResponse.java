package com.hoangphuc.springjwt.model;

import java.io.Serializable;
import java.util.Objects;

public class JwtResponse implements Serializable {
    private static final long serialVersionUID = -8091879091924046844L;
    private final String jwttoken;

    public JwtResponse(String jwttoken) {
        this.jwttoken = jwttoken;
    }

    public String getJwttoken() {
        return this.jwttoken;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof JwtResponse)) {
            return false;
        }
        JwtResponse jwtResponse = (JwtResponse) o;
        return Objects.equals(jwttoken, jwtResponse.jwttoken);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(jwttoken);
    }

    @Override
    public String toString() {
        return "{" +
            " jwttoken='" + getJwttoken() + "'" +
            "}";
    }
    
}