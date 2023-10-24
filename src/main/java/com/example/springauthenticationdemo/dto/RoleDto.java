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

package com.example.springauthenticationdemo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * DTO for {@link com.example.springauthenticationdemo.entities.Role}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class RoleDto implements Serializable {
    private Long id;
    private String name;
    private int roleKey;
}