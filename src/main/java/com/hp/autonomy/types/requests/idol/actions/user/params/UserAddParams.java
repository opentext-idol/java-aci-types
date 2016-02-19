/*
 * Copyright 2015 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.hp.autonomy.types.requests.idol.actions.user.params;

/**
 * GetTagNames Action Parameters
 */
public enum UserAddParams {
    EmailAddress,
    FieldFieldName,
    InputEncoding,
    OutputEncoding,
    Password,
    RoleName,
    Security,
    UserName;

    public static UserAddParams fromValue(final String value) {
        for (final UserAddParams param : values()) {
            if (param.name().equalsIgnoreCase(value)) {
                return param;
            }
        }

        throw new IllegalArgumentException("Unknown user param " + value);
    }
}
