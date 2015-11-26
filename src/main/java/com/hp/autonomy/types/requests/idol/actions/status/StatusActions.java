/*
 * Copyright 2015 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.hp.autonomy.types.requests.idol.actions.status;

/**
 * IDOL Status Actions
 */
public enum StatusActions {
    GetPid,
    GetStatus,
    IndexerGetStatus;

    public static StatusActions fromValue(final String value) {
        for (final StatusActions action : values()) {
            if (action.name().equalsIgnoreCase(value)) {
                return action;
            }
        }

        throw new IllegalArgumentException("Unknown action " + value);
    }
}
