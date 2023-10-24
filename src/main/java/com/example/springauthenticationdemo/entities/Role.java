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

package com.example.springauthenticationdemo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Column(name = "role_key", nullable = false, unique = true)
    private int roleKey;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users = new HashSet<>();
}