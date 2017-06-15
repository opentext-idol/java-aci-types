/*
 * Copyright 2017 Hewlett Packard Enterprise Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.hp.autonomy.types.requests.idol.actions.tags;

import lombok.Builder;
import lombok.Data;

import java.time.ZonedDateTime;

/**
 * Represents the value details response from an IDOL GetQueryTagValues or a HOD GetParametricValues request.
 */
@SuppressWarnings({"unused", "WeakerAccess"})
@Data
@Builder
public class DateValueDetails implements ValueDetails<ZonedDateTime> {
    private static final long serialVersionUID = 442355827856054986L;

    private final ZonedDateTime min;
    private final ZonedDateTime max;
    private final ZonedDateTime average;
    private final double sum;
    private final int totalValues;

    public static class DateValueDetailsBuilder implements ValueDetailsBuilder<ZonedDateTime, DateValueDetails, DateValueDetailsBuilder> {}
}
