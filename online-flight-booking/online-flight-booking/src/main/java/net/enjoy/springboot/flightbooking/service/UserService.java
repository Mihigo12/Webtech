package net.enjoy.springboot.flightbooking.service;

import net.enjoy.springboot.flightbooking.dto.UserDto;
import net.enjoy.springboot.flightbooking.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);
    User findUserByEmail(String email);
    List<User> findAllUsers();
    UserDto getUserById(Long id);
    void updateUser(UserDto userDto);
    void deleteUser(Long id);
}