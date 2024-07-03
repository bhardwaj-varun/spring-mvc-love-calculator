package org.varun.lc.dto;

import org.varun.lc.validators.annotations.PhoneValidator;

public class CommunicationDto {
    private String email;

    @PhoneValidator
    private Phone phone;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }
}
