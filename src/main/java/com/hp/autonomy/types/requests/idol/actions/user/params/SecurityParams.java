/*
 * Copyright 2015 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.hp.autonomy.types.requests.idol.actions.user.params;

/**
 * GetTagNames Action Parameters
 */
public enum SecurityParams {
    Domain,
    Function,
    Group,
    GroupDN,
    GroupMemberAttribute,
    InputEncoding,
    LoginFieldValue,
    OutputEncoding,
    Password,
    Repository,
    UID,
    UserName;

    public static SecurityParams fromValue(final String value) {
        for (final SecurityParams param : values()) {
            if (param.name().equalsIgnoreCase(value)) {
                return param;
            }
        }

        throw new IllegalArgumentException("Unknown user param " + value);
    }
}
