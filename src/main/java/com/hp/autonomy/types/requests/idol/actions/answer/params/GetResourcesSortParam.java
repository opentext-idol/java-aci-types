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

@SuppressWarnings({"WeakerAccess", "unused"})
public enum GetResourcesSortParam {
    ID("id"),
    CREATED_TIME("created_time"),
    INCONGRUITY("incongruity"),
    LIKELIHOOD("likelihood"),
    METADATA("metadata"),
    MODIFIED_TIME("modified_time"),
    POPULARITY("popularity"),
    RANDOM("random"),
    STATUS("status");

    private final String value;

    GetResourcesSortParam(final String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}
