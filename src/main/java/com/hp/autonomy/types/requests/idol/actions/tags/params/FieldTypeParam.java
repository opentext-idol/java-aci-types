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

package com.hp.autonomy.types.requests.idol.actions.tags.params;

/**
 * FieldType parameter values
 */
@SuppressWarnings({"WeakerAccess", "unused"})
public enum FieldTypeParam {
    ACL,
    All,
    AutnRank,
    BitField,
    DataBase,
    Date,
    DocumentTracking,
    ExpireDate,
    FieldCheck,
    FlattenIndex,
    Highlight,
    Index,
    IndexWeight,
    InvertedAgent,
    Language,
    Match,
    NumericDate,
    Numeric,
    Parametric,
    Print,
    Reference,
    SectionBreak,
    Security,
    Sort,
    Source,
    Synonym,
    Title;

    public static FieldTypeParam fromValue(final String value) {
        for (final FieldTypeParam param : values()) {
            if (param.name().equalsIgnoreCase(value)) {
                return param;
            }
        }

        throw new IllegalArgumentException("Unknown query param " + value);
    }

    public static FieldTypeParam fromValue(final String value, final FieldTypeParam defaultValue) {
        FieldTypeParam match = defaultValue;

        for (final FieldTypeParam param : values()) {
            if (param.name().equalsIgnoreCase(value)) {
                match = param;
                break;
            }
        }

        return match;
    }
}
