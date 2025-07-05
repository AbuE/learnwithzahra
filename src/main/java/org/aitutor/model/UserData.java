package org.aitutor.model;

import io.quarkus.runtime.annotations.RegisterForReflection;
import java.util.List;

@RegisterForReflection
public class UserData {
    public String userId;
    public String email;
    public String name;
    public List<ChildProfile> childProfiles;
    public String createdAt;


    public String getUserId() {
        return userId;
    }           

    public void setUserId(String userId) {
        this.userId = userId;
    }           

    public String getEmail() {
        return email;
    }       
    public void setEmail(String email) {
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<ChildProfile> getChildProfiles() {
        return childProfiles;
    }
    public void setChildProfiles(List<ChildProfile> childProfiles) {
        this.childProfiles = childProfiles;
    }
    public String getCreatedAt() {
        return createdAt;
    }   
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
 


}
