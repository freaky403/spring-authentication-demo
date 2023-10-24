/*
 * Copyright (c) 2023, Mint
 * FREE TO USE
 *           _____                    _____                    _____                _____
 *          /\    \                  /\    \                  /\    \              /\    \
 *         /::\____\                /::\    \                /::\____\            /::\    \
 *        /::::|   |                \:::\    \              /::::|   |            \:::\    \
 *       /:::::|   |                 \:::\    \            /:::::|   |             \:::\    \
 *      /::::::|   |                  \:::\    \          /::::::|   |              \:::\    \
 *     /:::/|::|   |                   \:::\    \        /:::/|::|   |               \:::\    \
 *    /:::/ |::|   |                   /::::\    \      /:::/ |::|   |               /::::\    \
 *   /:::/  |::|___|______    ____    /::::::\    \    /:::/  |::|   | _____        /::::::\    \
 *  /:::/   |::::::::\    \  /\   \  /:::/\:::\    \  /:::/   |::|   |/\    \      /:::/\:::\    \
 * /:::/    |:::::::::\____\/::\   \/:::/  \:::\____\/:: /    |::|   /::\____\    /:::/  \:::\____\
 * \::/    / ~~~~~/:::/    /\:::\  /:::/    \::/    /\::/    /|::|  /:::/    /   /:::/    \::/    /
 *  \/____/      /:::/    /  \:::\/:::/    / \/____/  \/____/ |::| /:::/    /   /:::/    / \/____/
 *              /:::/    /    \::::::/    /                   |::|/:::/    /   /:::/    /
 *             /:::/    /      \::::/____/                    |::::::/    /   /:::/    /
 *            /:::/    /        \:::\    \                    |:::::/    /    \::/    /
 *           /:::/    /          \:::\    \                   |::::/    /      \/____/
 *          /:::/    /            \:::\    \                  /:::/    /
 *         /:::/    /              \:::\____\                /:::/    /
 *         \::/    /                \::/    /                \::/    /
 *          \/____/                  \/____/                  \/____/
 *
 * If you don't get it, don't worry, cause neither does the developer .
 */

package com.example.springauthenticationdemo.services;

import com.example.springauthenticationdemo.dto.UserDto;
import com.example.springauthenticationdemo.entities.Role;
import com.example.springauthenticationdemo.entities.User;
import com.example.springauthenticationdemo.repositories.RoleRepository;
import com.example.springauthenticationdemo.repositories.UserRepository;
import com.example.springauthenticationdemo.requests.UserRequest;
import com.example.springauthenticationdemo.utils.Constants;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class UserService implements IUserService {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public Boolean isUsernameAvailable(String username) {
        return this.userRepository.existsByUsername(username);
    }

    @Override
    public Boolean isEmailAvailable(String email) {
        return this.userRepository.existsByEmail(email);
    }

    @Override
    public UserDto create(UserRequest userRequest) {
        User user = new User();
        Set<Role> roles = new HashSet<>();

        user.setUsername(userRequest.getUsername());
        user.setEmail(userRequest.getEmail());
        user.setPassword(this.passwordEncoder.encode(userRequest.getPassword()));

        Optional<Role> role = this.roleRepository.findByName(Constants.Role.TESTUSER);

        if (role.isPresent()) {
            roles.add(role.get());
        } else {
            Role newRole = new Role();
            newRole.setName(Constants.Role.TESTUSER);
            newRole.setRoleKey(0);
            roles.add(this.roleRepository.save(newRole));
        }

        user.setRoles(roles);

        User savedUser = this.userRepository.save(user);

        return new UserDto().setId(savedUser.getId())
                .setUsername(savedUser.getUsername())
                .setEmail(savedUser.getEmail());
    }

    @Override
    public UserDto findByEmail(String email) {
        return null;
    }

    @Override
    public UserDto findByUsername(String username) {
        return null;
    }
}
