/*
 * Copyright 2015 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.hp.autonomy.types.requests.idol.actions.query;

/**
 * IDOL Status Actions
 */
public enum QueryActions {
    DocumentStats,
    GetContent,
    List,
    Query,
    Suggest,
    SuggestOnText,
    QueryActionParameters;

    public static QueryActions fromValue(final String value) {
        for (final QueryActions action : values()) {
            if (action.name().equalsIgnoreCase(value)) {
                return action;
            }
        }

        throw new IllegalArgumentException("Unknown action " + value);
    }
}
