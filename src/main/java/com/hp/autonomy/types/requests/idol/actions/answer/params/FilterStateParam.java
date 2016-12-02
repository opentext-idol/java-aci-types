/*
 * Copyright 2015 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.hp.autonomy.types.requests.idol.actions.answer.params;

/**
 * Combination of Question/QEC states used in filter object
 */
@SuppressWarnings("unused")
public enum FilterStateParam {
    INCOMING("Incoming"),
    ANSWERABLE("Answerable"),
    NEEDS_ANSWER("NeedsAnswer"),
    ANSWERED("Answered"),
    REJECTED("Rejected"),
    PUBLISHED("Published");

    private final String value;

    FilterStateParam(final String v) {
        value = v;
    }

    public String value() {
        return value;
    }
}
