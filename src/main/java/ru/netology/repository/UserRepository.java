package ru.netology.repository;

import org.springframework.stereotype.Repository;
import ru.netology.model.Authorities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        List<Authorities> users = new ArrayList<>();
        if ("Igor".equals(user) & "1234".equals(password)) {
            return Arrays.asList(Authorities.READ, Authorities.DELETE);
        }
        if ("Victor".equals(user) & "4567".equals(password)) {
            return List.of();
        }
        return users;
    }
}
