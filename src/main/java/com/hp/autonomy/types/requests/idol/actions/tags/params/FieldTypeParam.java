/*
 * (c) Copyright 2015-2016, 2020 Micro Focus or one of its affiliates.
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
    AlwaysMatch,
    AutnRank,
    BitField,
    DataBase,
    Date,
    DocumentTracking,
    ExpireDate,
    FieldCheck,
    FlattenIndex,
    GeospatialUnified("geospatial (unified)"),
    GeospatialX("geospatial (X/longitude)"),
    GeospatialY("geospatial (Y/latitude)"),
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

    /**
     * Additional optional ID used by IDOL for this field type.
     */
    private final String value;

    FieldTypeParam(final String value) {
        this.value = value;
    }

    FieldTypeParam() {
        this(null);
    }

    /**
     * Return type matching the IDOL value, or null.
     */
    private static FieldTypeParam maybeFromValue(final String value) {
        for (final FieldTypeParam param : values()) {
            if (param.name().equalsIgnoreCase(value) ||
                (param.value != null && param.value.equalsIgnoreCase(value))
            ) {
                return param;
            }
        }

        return null;
    }

    /**
     * Return type matching the IDOL value, or throw {@link IllegalArgumentException}.
     */
    public static FieldTypeParam fromValue(final String value) {
        final FieldTypeParam match = maybeFromValue(value);
        if (match == null) {
            throw new IllegalArgumentException("Unknown query param " + value);
        }
        return match;
    }

    /**
     * Return type matching the IDOL value, or return the provided default value.
     */
    public static FieldTypeParam fromValue(final String value, final FieldTypeParam defaultValue) {
        final FieldTypeParam match = maybeFromValue(value);
        return match == null ? defaultValue : match;
    }
}
