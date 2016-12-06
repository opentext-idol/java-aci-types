/*
 * Copyright 2015 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.hp.autonomy.types.requests.idol.actions.answer.params;

@SuppressWarnings({"WeakerAccess", "unused"})
public enum GetResourcesParams {
    ExcludedIds,
    Filter,
    FirstResult,
    Ids,
    MaxResults,
    Sort,
    SystemName,
    Type;

    public static GetResourcesParams fromValue(final String value) {
        for (final GetResourcesParams param : values()) {
            if (param.name().equalsIgnoreCase(value)) {
                return param;
            }
        }

        throw new IllegalArgumentException("Unknown parameter " + value);
    }
}
