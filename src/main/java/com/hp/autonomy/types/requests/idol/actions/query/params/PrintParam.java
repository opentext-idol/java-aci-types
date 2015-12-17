/*
 * Copyright 2015 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.hp.autonomy.types.requests.idol.actions.query.params;

/**
 * Values of print parameter
 */
public enum PrintParam {
    All,
    AllSections,
    Date,
    Fields,
    Index,
    IndexText,
    NegativeFields,
    None,
    NoResults,
    Parametric,
    Reference,
    Source;

    public static PrintParam fromValue(final String value) {
        for (final PrintParam queryParam : values()) {
            if (queryParam.name().equalsIgnoreCase(value)) {
                return queryParam;
            }
        }

        throw new IllegalArgumentException("Unknown query param " + value);
    }

    public static PrintParam fromValue(final String value, final PrintParam defaultValue) {
        PrintParam match = defaultValue;

        for (final PrintParam queryParam : values()) {
            if (queryParam.name().equalsIgnoreCase(value)) {
                match = queryParam;
                break;
            }
        }

        return match;
    }
}
