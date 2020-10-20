/*
 * (c) Copyright 2017 Micro Focus or one of its affiliates.
 *
 * Licensed under the MIT License (the "License"); you may not use this file
 * except in compliance with the License.
 *
 * The only warranties for products and services of Micro Focus and its affiliates
 * and licensors ("Micro Focus") are as may be set forth in the express warranty
 * statements accompanying such products and services. Nothing herein should be
 * construed as constituting an additional warranty. Micro Focus shall not be
 * liable for technical or editorial errors or omissions contained herein. The
 * information contained herein is subject to change without notice.
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
