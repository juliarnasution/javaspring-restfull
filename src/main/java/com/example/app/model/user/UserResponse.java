package com.example.app.model.user;

import com.example.app.entity.User;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.Transient;
import java.time.LocalDate;
import java.util.Date;
@ResponseBody
public class UserResponse {
    public Long id;
    public String name;
    public String username;
    public LocalDate birthDate;
    public Date createdAt;
    public Integer age;
    public UserResponse(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.username = user.getUsername();
        this.birthDate = user.getBirthDate();
        this.createdAt = user.getCreatedAt();
        this.age = user.getAge();
    }
}
