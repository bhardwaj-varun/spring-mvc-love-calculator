package org.varun.lc.dto;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInfoDTO {
    @NotBlank(message = "* user name can not be blank")
    @Size(min = 3, message = "* username should have at least 3 characters")
    String userName;
    @NotBlank(message = "* user name can not be blank")
    @Size(min = 3, message = "* username should have at least 3 characters")
    String crushName;

    @AssertTrue(message = "* Should accept terms and conditions.")
    boolean termsAndConditions;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCrushName() {
        return crushName;
    }

    public void setCrushName(String crushName) {
        this.crushName = crushName;
    }

    public boolean isTermsAndConditions() {
        return termsAndConditions;
    }

    public void setTermsAndConditions(boolean termsAndConditions) {
        this.termsAndConditions = termsAndConditions;
    }
    @Override
    public String toString() {
        return "UserInfo{" +
                "userName='" + userName + '\'' +
                ", crushName='" + crushName + '\'' +
                '}';
    }
}
