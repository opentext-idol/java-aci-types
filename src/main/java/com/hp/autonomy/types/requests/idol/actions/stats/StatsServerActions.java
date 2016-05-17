/*
 * Copyright 2015-2016 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.hp.autonomy.types.requests.idol.actions.stats;

public enum StatsServerActions {
    AddStat,
    /**
     * This action requires a config parameter to enable it
     */
    Event,
    GetDynamicValues,
    GetStatus,
    StatDelete,
    StatResult
}
