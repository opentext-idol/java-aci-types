/*
 * Copyright 2015 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.hp.autonomy.types.requests.idol.actions.role.params;

/**
 * GetTagNames Action Parameters
 */
public enum RoleGetUserListParams {
    Match,
    MaxUsers,
    Recurse,
    RoleName,
    Start,
    StartMatch;

    public static RoleGetUserListParams fromValue(final String value) {
        for (final RoleGetUserListParams param : values()) {
            if (param.name().equalsIgnoreCase(value)) {
                return param;
            }
        }

        throw new IllegalArgumentException("Unknown role param " + value);
    }
}
