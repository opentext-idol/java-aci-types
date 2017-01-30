/*
 * Copyright 2015 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.hp.autonomy.types.requests.idol.actions.answer.params;

@SuppressWarnings({"WeakerAccess", "unused"})
public enum ManageResourcesParams {
    Data("data"),
    SystemName("system_name");

    private final String value;

    ManageResourcesParams(final String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ManageResourcesParams fromValue(final String value) {
        for (final ManageResourcesParams param : values()) {
            if (param.value().equalsIgnoreCase(value)) {
                return param;
            }
        }

        throw new IllegalArgumentException("Unknown parameter " + value);
    }
}
