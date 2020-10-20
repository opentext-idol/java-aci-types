/*
 * (c) Copyright 2015-2016 Micro Focus or one of its affiliates.
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

package com.hp.autonomy.types.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Spelling implements Serializable {
    private static final long serialVersionUID = -3759977893073373750L;

    private final List<String> corrections;
    private final String correctedQuery;
    private final String originalQuery;

    public Spelling(
        @JsonProperty("corrections") final List<String> corrections,
        @JsonProperty("corrected_query") final String correctedQuery,
        @JsonProperty("original_query") final String originalQuery
    ) {
        this.corrections = corrections;
        this.correctedQuery = correctedQuery;
        this.originalQuery = originalQuery;
    }
}
