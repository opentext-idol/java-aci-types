/*
 * Copyright 2015 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.hp.autonomy.types.requests.idol.actions.general;

/**
 * "General" Actions
 */
public enum GeneralActions {
    Admin,
    DiskReport,
    Encrypted,
    ExecuteSchedule,
    GetAllRefs,
    GetChildren,
    GetLicenseInfo,
    GetVersion,
    GRL,
    LanguageSettings,
    MemoryReport,
    QueueInfo,
    ShowPermissions,
    ThreadStatus;

    public static GeneralActions fromValue(final String value) {
        for (final GeneralActions action : values()) {
            if (action.name().equalsIgnoreCase(value)) {
                return action;
            }
        }

        throw new IllegalArgumentException("Unknown action " + value);
    }
}
