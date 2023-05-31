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
