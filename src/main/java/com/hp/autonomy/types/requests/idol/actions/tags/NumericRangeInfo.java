/*
 * Copyright 2017 Hewlett Packard Enterprise Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.hp.autonomy.types.requests.idol.actions.tags;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.Singular;

import java.util.List;

@SuppressWarnings({"WeakerAccess", "unused"})
@Data
@Builder(toBuilder = true)
public class NumericRangeInfo implements RangeInfo<Double, Double, NumericRangeInfo.Value, NumericRangeInfo, NumericRangeInfo.NumericRangeInfoBuilder> {
    private static final long serialVersionUID = -850842200269239270L;

    private final String id;
    private final String displayName;
    private final int count;
    private final Double min;
    private final Double max;
    private final Double bucketSize;
    @Singular
    private final List<Value> values;

    @Data
    @RequiredArgsConstructor
    @AllArgsConstructor
    public static class Value implements RangeInfoValue<Double, Double> {
        private static final long serialVersionUID = 1433973915302512819L;
        private final Double min;
        private final Double max;
        private int count;

        @Override
        public void addData(final int count) {
            this.count += count;
        }

        @Override
        public Double getBucketSize() {
            return max - min;
        }
    }

    public static class NumericRangeInfoBuilder implements RangeInfoBuilder<Double, Double, NumericRangeInfo.Value, NumericRangeInfo, NumericRangeInfoBuilder> {}
}
