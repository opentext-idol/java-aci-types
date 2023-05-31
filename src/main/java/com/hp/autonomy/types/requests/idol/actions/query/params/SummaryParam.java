/*
 * Copyright 2015-2016 Open Text.
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
