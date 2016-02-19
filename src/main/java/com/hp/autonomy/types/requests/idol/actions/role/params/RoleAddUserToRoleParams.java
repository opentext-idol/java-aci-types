/*
 * Copyright 2015 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.hp.autonomy.types.requests.idol.actions.role.params;

/**
 * GetTagNames Action Parameters
 */
public enum RoleAddUserToRoleParams {
    EmailAddress,
    FieldFieldName,
    RoleName,
    Security,
    UID,
    UserName;

    public static RoleAddUserToRoleParams fromValue(final String value) {
        for (final RoleAddUserToRoleParams param : values()) {
            if (param.name().equalsIgnoreCase(value)) {
                return param;
            }
        }

        throw new IllegalArgumentException("Unknown role param " + value);
    }
}
