package com.codegym.form.model;

import javax.validation.constraints.*;

public class User {

    @NotEmpty
    @Size(min = 5, max = 45)
    private String firstName;

    @NotEmpty
    @Size(min = 5, max = 45)
    private String lastName;

    @NotEmpty
    @Size(min = 10, max = 11)
    @Pattern(regexp = "(^$|[0-9]*$)")
    private String phoneNumber;

    @Min(18)
    private int age;

    public User(@NotEmpty @Size(min = 5, max = 45) String firstName, @NotEmpty @Size(min = 5, max = 45) String lastName, @NotEmpty @Size(min = 10, max = 11) @Pattern(regexp = "(^$|[0-9]*$)") String phoneNumber, @Min(18) int age, @NotEmpty @Email String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @NotEmpty
    @Email
    private String email;

    public User() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
