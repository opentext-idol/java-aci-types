/*
 * Copyright 2015-2017 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.hp.autonomy.types.requests.idol.actions.connector;

public enum FetchActions {
    Fetch,
    // the rest are not strictly actions, but might as well be
    Collect,
    Delete,
    Identifiers,
    Insert,
    Stub,
    Synchronize,
    Update
}
