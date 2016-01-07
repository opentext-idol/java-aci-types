/*
 * Copyright 2015-2016 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.hp.autonomy.types.requests.idol.actions.query.params;

public enum CombineParam {
    Simple,
    ReferenceField,
    FieldCheck,
    MetadataField;

    public static CombineParam fromValue(final String value) {
        for (final CombineParam param : values()) {
            if (param.name().equalsIgnoreCase(value)) {
                return param;
            }
        }

        throw new IllegalArgumentException("Unknown combine param " + value);
    }

    public static CombineParam fromValue(final String value, final CombineParam defaultValue) {
        CombineParam match = defaultValue;

        for (final CombineParam param : values()) {
            if (param.name().equalsIgnoreCase(value)) {
                match = param;
                break;
            }
        }

        return match;
    }
}
