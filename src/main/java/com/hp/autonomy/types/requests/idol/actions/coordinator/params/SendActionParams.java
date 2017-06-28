/*
 * Copyright 2015-2017 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.hp.autonomy.types.requests.idol.actions.coordinator.params;

public enum SendActionParams {
    Command,
    Type;

    public enum ActionType {
        ACI,
        Index,
        Service
    }
}
