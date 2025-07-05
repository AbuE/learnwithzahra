package org.aitutor.model;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class UserRegistrationRequest {
    private String name;
    private String email;
    private String password;
    private String childName;
    private int childAge;
    private boolean parentConsent;

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
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getChildName() {
        return childName;
    }
    public void setChildName(String childName) {
        this.childName = childName;
    }
    public int getChildAge() {
        return childAge;
    }
    public void setChildAge(int childAge) {
        this.childAge = childAge;
    }
    public boolean getParentConsent() {
        return parentConsent;
    }
    public void setParentConsent(boolean parentConsent) {
        this.parentConsent = parentConsent;
    }
     
}
