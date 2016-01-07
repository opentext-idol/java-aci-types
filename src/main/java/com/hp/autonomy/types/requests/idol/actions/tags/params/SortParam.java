/*
 * Copyright 2015-2016 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.hp.autonomy.types.requests.idol.actions.tags.params;

public enum SortParam {
    Off,
    Alphabetical,
    Date,
    DocumentCount,
    NumberDecreasing,
    NumberIncreasing,
    ReverseAlphabetical,
    ReverseDate,
    ReverseDocumentCount;

    public static SortParam fromValue(final String value) {
        for (final SortParam param : values()) {
            if (param.name().equalsIgnoreCase(value)) {
                return param;
            }
        }

        throw new IllegalArgumentException("Unknown parameter " + value);
    }
}
