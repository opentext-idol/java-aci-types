/*
 * Copyright 2015-2016 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.hp.autonomy.types.requests.idol.actions.tags.params;

public enum GetQueryTagValuesParams {
    AllowNonParametricFields,
    DateOffset,
    DatePeriod,
    DocumentCount,
    FieldDependence,
    FieldDependenceMultiLevel,
    FieldName,
    MaxValues,
    Merge,
    Ranges,
    RestrictedValues,
    Sort,
    Start,
    Synchronous,
    TotalValues,
    ValueDetails;

    public static GetQueryTagValuesParams fromValue(final String value) {
        for (final GetQueryTagValuesParams param : values()) {
            if (param.name().equalsIgnoreCase(value)) {
                return param;
            }
        }

        throw new IllegalArgumentException("Unknown parameter " + value);
    }
}
