/*
 * Copyright 2015-2017 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.hp.autonomy.types.requests.idol.actions.async;

public enum QueueInfoParams {
    Priority,
    QueueAction,
    QueueName,
    State,
    Token,
    SortBy {
        @Override
        public String toString() {
            // this is stupid...
            return "Sort-By";
        }
    },
    SortOrder {
        @Override
        public String toString() {
            // this is stupid...
            return "Sort-Order";
        }
    }

}
