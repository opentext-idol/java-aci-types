/*
 * Copyright 2015 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */
package com.hp.autonomy.types.requests.idol.actions.answer;

@SuppressWarnings({"WeakerAccess", "unused"})
public enum AnswerServerActions {
    Ask,
    GetJobStatus,
    GetResources,
    GetStats,
    GetStatus,
    ManageResources,
    TestRule;

    public static AnswerServerActions fromValue(final String value) {
        for (final AnswerServerActions action : values()) {
            if (action.name().equalsIgnoreCase(value)) {
                return action;
            }
        }

        throw new IllegalArgumentException("Unknown action " + value);
    }
}
