package poo.ex121fixation.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
    private String name;
    private String email;
    private Date birthDate;
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return name + " (" + sdf.format(birthDate) + ") - " + email;
    }
}
