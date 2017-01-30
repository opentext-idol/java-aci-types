/*
 * Copyright 2015 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */
package com.hp.autonomy.types.requests.idol.actions.answer;

@SuppressWarnings({"WeakerAccess", "unused"})
public enum AnswerServerActions {
    Ask("ask"),
    GetJobStatus("get_job_status"),
    GetResources("get_resources"),
    GetStats("get_stats"),
    GetStatus("getStatus"),
    ManageResources("manage_resources"),
    TestRule("test_rule");

    private final String value;

    AnswerServerActions(final String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AnswerServerActions fromValue(final String value) {
        for (final AnswerServerActions action : values()) {
            if (action.value().equalsIgnoreCase(value)) {
                return action;
            }
        }

        throw new IllegalArgumentException("Unknown action " + value);
    }
}
