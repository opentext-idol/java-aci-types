/*
 * Copyright 2015 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.hp.autonomy.types.requests.idol.actions.tags.params;

/**
 * GetTagNames Action Parameters
 */
public enum GetTagNamesParams {
    BaseFieldCodeOnly,
    FieldCode,
    FieldType,
    MaxValues,
    OutputEncoding,
    Start,
    Synchronous,
    TypeDetails;

    public static GetTagNamesParams fromValue(final String value) {
        for (final GetTagNamesParams queryParam : values()) {
            if (queryParam.name().equalsIgnoreCase(value)) {
                return queryParam;
            }
        }

        throw new IllegalArgumentException("Unknown query param " + value);
    }
}
