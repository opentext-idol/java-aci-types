/*
 * (c) Copyright 2015-2016 Micro Focus or one of its affiliates.
 *
 * Licensed under the MIT License (the "License"); you may not use this file
 * except in compliance with the License.
 *
 * The only warranties for products and services of Micro Focus and its affiliates
 * and licensors ("Micro Focus") are as may be set forth in the express warranty
 * statements accompanying such products and services. Nothing herein should be
 * construed as constituting an additional warranty. Micro Focus shall not be
 * liable for technical or editorial errors or omissions contained herein. The
 * information contained herein is subject to change without notice.
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
