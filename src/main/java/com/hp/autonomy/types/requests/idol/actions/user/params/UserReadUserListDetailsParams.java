/*
 * Copyright 2015 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.hp.autonomy.types.requests.idol.actions.user.params;

/**
 * UserReadUserList Action Parameters
 */
public enum UserReadUserListDetailsParams {
    InputEncoding,
    Match,
    MatchFieldName,
    MatchFieldValue,
    MaxUsers,
    OutputEncoding,
    Start,
    StartMatch;

    public static UserReadUserListDetailsParams fromValue(final String value) {
        for (final UserReadUserListDetailsParams param : values()) {
            if (param.name().equalsIgnoreCase(value)) {
                return param;
            }
        }

        throw new IllegalArgumentException("Unknown UserReadUserList param " + value);
    }
}
