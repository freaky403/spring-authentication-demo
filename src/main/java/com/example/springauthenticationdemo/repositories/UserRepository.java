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

package com.example.springauthenticationdemo.repositories;

import com.example.springauthenticationdemo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);

    Optional<User> findByUsernameOrEmail(String username, String email);

    Optional<User> findByUsername(String username);
}