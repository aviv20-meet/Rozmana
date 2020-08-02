package com.example.rozmana;

public class User {
    public static int id =0;
    private String firstname;
    private String lastname;
    private String email;
    private String password;

    public User(String fname, String lname, String email, String password, String rpassword) {
        this.id++;
        if(password.equals(rpassword){
            this.password = password;
        }
        else{
            // make a message
        }

        // validate email

        this.firstname=fname;
        this.lastname=lname;


    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static int getId() {
        return id;
    }
}
