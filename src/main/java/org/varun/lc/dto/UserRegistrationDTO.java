package org.varun.lc.dto;

import org.varun.lc.validators.annotations.Age;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

public class UserRegistrationDTO {
    @NotBlank(message = "* can not be empty")
    private String name;
    private String userName;
    private char[] password;
    private String country;
    private String[] hobbies;
    private String gender;
    @Age(lower = 5, upper = 90)
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Valid
    private CommunicationDto communicationDto;

    public CommunicationDto getCommunicationDto() {
        return communicationDto;
    }

    public void setCommunicationDto(CommunicationDto communicationDto) {
        this.communicationDto = communicationDto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
