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

package com.example.springauthenticationdemo.requests;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequest {
    @NotEmpty(message = "Username is required.")
    private String username;
    @NotEmpty(message = "Email is required.")
    private String email;
    @NotEmpty(message = "Password is required.")
    private String password;
}
