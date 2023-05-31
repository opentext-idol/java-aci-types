/*
 * Copyright 2015 Open Text.
 *
 * Licensed under the MIT License (the "License"); you may not use this file
 * except in compliance with the License.
 *
 * The only warranties for products and services of Open Text and its affiliates
 * and licensors ("Open Text") are as may be set forth in the express warranty
 * statements accompanying such products and services. Nothing herein should be
 * construed as constituting an additional warranty. Open Text shall not be
 * liable for technical or editorial errors or omissions contained herein. The
 * information contained herein is subject to change without notice.
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
