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
    INCOMING("incoming"),
    ANSWERABLE("answerable"),
    NEEDS_ANSWER("needs_answer"),
    ANSWERED("answered"),
    REJECTED("rejected"),
    PUBLISHED("published");

    private final String value;

    FilterStateParam(final String v) {
        value = v;
    }

    public String value() {
        return value;
    }
}
