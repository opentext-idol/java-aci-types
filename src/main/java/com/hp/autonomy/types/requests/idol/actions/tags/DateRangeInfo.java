/*
 * Copyright 2017 Open Text.
 *
 * Licensed under the MIT License (the "License"); you may not use this file
 * except in compliance with the License.
 *
 * The only warranties for products and services of Open Text and its affiliates
 * and licensors ("Open Text") are as may be set forth in the express warranty
 * statements accompanying such products and services. Nothing herein should be
 * construed as constituting an additional warranty. Open Text shall not be
 * liable for technical or editorial errors or omissions contained herein. The
 * information contained herein is subject to change without notice.
 */

package com.hp.autonomy.types.requests.idol.actions.tags;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.Singular;

import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.List;

@SuppressWarnings({"WeakerAccess", "unused"})
@Data
@Builder(toBuilder = true)
public class DateRangeInfo implements RangeInfo<ZonedDateTime, Duration, DateRangeInfo.Value, DateRangeInfo, DateRangeInfo.DateRangeInfoBuilder> {
    private static final long serialVersionUID = -850842200269239270L;

    private final String id;
    private final String displayName;
    private final int count;
    private final ZonedDateTime min;
    private final ZonedDateTime max;
    private final Duration bucketSize;
    @Singular
    private final List<Value> values;

    @Data
    @RequiredArgsConstructor
    @AllArgsConstructor
    public static class Value implements RangeInfoValue<ZonedDateTime, Duration> {
        private static final long serialVersionUID = 1433973915302512819L;
        private final ZonedDateTime min;
        private final ZonedDateTime max;
        private int count;

        @Override
        public void addData(final int count) {
            this.count += count;
        }

        @Override
        public Duration getBucketSize() {
            return Duration.between(min, max);
        }
    }

    public static class DateRangeInfoBuilder implements RangeInfoBuilder<ZonedDateTime, Duration, DateRangeInfo.Value, DateRangeInfo, DateRangeInfoBuilder> {}
}
