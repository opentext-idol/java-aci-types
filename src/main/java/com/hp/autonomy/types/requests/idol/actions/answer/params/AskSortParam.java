/*
 * Copyright 2015 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.hp.autonomy.types.requests.idol.actions.answer.params;

@SuppressWarnings({"WeakerAccess", "unused"})
public enum AskSortParam {
    CONFIDENCE("confidence"),
    SYSTEM("system");

    private final String value;

    AskSortParam(final String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}
