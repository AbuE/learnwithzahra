package org.aitutor.model;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class UserRegistrationResponse {

    private String message;
    private boolean success;
    private UserData data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public UserData getData() {
        return data;
    }   
    public void setData(UserData data) {
        this.data = data;
    }   



}
