/*
 * Copyright 2015-2016 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.hp.autonomy.types.requests.idol.actions.params;

/**
 * Generic Action Params
 */
@SuppressWarnings("WeakerAccess")
public enum ActionParams {
    Action,
    ActionID,
    FileName,
    ForceTemplateRefresh,
    Format,
    Output,
    PortOnly,
    ResponseFormat,
    Template,
    TemplateParamCSVs;

    public static ActionParams fromValue(final String value) {
        for (final ActionParams queryParam : values()) {
            if (queryParam.name().equalsIgnoreCase(value)) {
                return queryParam;
            }
        }

        if ("a".equalsIgnoreCase(value)) {
            return Action;
        }

        throw new IllegalArgumentException("Unknown query param " + value);
    }
}
