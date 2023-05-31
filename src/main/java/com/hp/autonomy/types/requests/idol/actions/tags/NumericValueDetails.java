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

import lombok.Builder;
import lombok.Data;

/**
 * Represents the value details response from an IDOL GetQueryTagValues or a HOD GetParametricValues request.
 */
@SuppressWarnings({"unused", "WeakerAccess"})
@Data
@Builder
public class NumericValueDetails implements ValueDetails<Double> {
    private static final long serialVersionUID = -5944398367052500489L;

    private final Double min;
    private final Double max;
    private final Double average;
    private final double sum;
    private final int totalValues;

    public static class NumericValueDetailsBuilder implements ValueDetailsBuilder<Double, NumericValueDetails, NumericValueDetailsBuilder> {}
}
