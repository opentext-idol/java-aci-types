/*
 * Copyright 2015 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.hp.autonomy.types.requests.idol.actions.tags;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings({"WeakerAccess", "unused"})
@Data
@Builder(toBuilder = true)
public class RangeInfo implements Serializable {
    private static final long serialVersionUID = -850842200269239270L;

    private final String id;
    private final String displayName;
    private final int count;
    private final double min;
    private final double max;
    private final double bucketSize;
    @Singular
    private final List<Value> values;

    @Data
    @AllArgsConstructor
    public static class Value implements Serializable {
        private static final long serialVersionUID = 1433973915302512819L;
        private final double min;
        private final double max;
        private int count;

        public void addData(final int count) {
            this.count += count;
        }
    }
}
