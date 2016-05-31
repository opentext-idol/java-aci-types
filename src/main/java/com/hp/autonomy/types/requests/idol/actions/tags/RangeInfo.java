/*
 * Copyright 2015 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.hp.autonomy.types.requests.idol.actions.tags;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.apache.commons.collections4.ListUtils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"WeakerAccess", "unused"})
@Getter
@EqualsAndHashCode
public class RangeInfo implements Serializable {
    private static final long serialVersionUID = -850842200269239270L;

    private final String name;
    private final int count;
    private final double min;
    private final double max;
    private final double bucketSize;
    private final List<Value> values;

    @SuppressWarnings("ConstructorWithTooManyParameters")
    @JsonCreator
    public RangeInfo(@JsonProperty final String name,
                     @JsonProperty final int count,
                     @JsonProperty final double min,
                     @JsonProperty final double max,
                     @JsonProperty final double bucketSize,
                     @JsonProperty final List<Value> values) {
        this.name = name;
        this.count = count;
        this.max = max;
        this.min = min;
        this.bucketSize = bucketSize;
        this.values = new ArrayList<>(ListUtils.emptyIfNull(values));
    }

    @EqualsAndHashCode
    @ToString
    @Getter
    public static class Value implements Serializable {
        private static final long serialVersionUID = 1433973915302512819L;

        private int count;
        private final double min;
        private final double max;

        @JsonCreator
        public Value(@JsonProperty final int count,
                     @JsonProperty final double min,
                     @JsonProperty final double max) {
            this.count = count;
            this.min = min;
            this.max = max;
        }

        public void addData(final int count) {
            this.count += count;
        }
    }
}
