/*
 * Copyright 2015 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.hp.autonomy.types.requests.idol.actions.answer.params;

@SuppressWarnings({"WeakerAccess", "unused"})
public enum GetResourcesParams {
    ExcludedIds("excluded_ids"),
    Filter("filter"),
    FirstResult("first_result"),
    Ids("ids"),
    MaxResults("max_results"),
    Sort("sort"),
    SystemName("system_name"),
    Type("type");

    private final String value;

    GetResourcesParams(final String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GetResourcesParams fromValue(final String value) {
        for (final GetResourcesParams param : values()) {
            if (param.value().equalsIgnoreCase(value)) {
                return param;
            }
        }

        throw new IllegalArgumentException("Unknown parameter " + value);
    }
}
