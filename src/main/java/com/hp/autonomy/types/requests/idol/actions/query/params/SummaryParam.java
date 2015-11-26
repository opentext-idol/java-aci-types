/*
 * Copyright 2015 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.hp.autonomy.types.requests.idol.actions.query.params;

/**
 * Sort Parameter Values
 */
public enum SummaryParam {
    Concept,
    Context,
    Quick,
    ParagraphConcept,
    ParagraphContext,
    Off;

    public static SummaryParam fromValue(final String value) {
        for (final SummaryParam queryParam : values()) {
            if (queryParam.name().equalsIgnoreCase(value)) {
                return queryParam;
            }
        }

        throw new IllegalArgumentException("Unknown query param " + value);
    }

    public static SummaryParam fromValue(final String value, final SummaryParam defaultValue) {
        SummaryParam match = defaultValue;

        for (final SummaryParam queryParam : values()) {
            if (queryParam.name().equalsIgnoreCase(value)) {
                match = queryParam;
                break;
            }
        }

        return match;
    }
}
