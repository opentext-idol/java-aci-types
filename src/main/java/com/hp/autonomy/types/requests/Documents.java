/*
 * Copyright 2015-2017 Open Text.
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

package com.hp.autonomy.types.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Top level response from the QueryTextIndex API and FindSimilar API.
 */
@SuppressWarnings("InstanceVariableOfConcreteClass")
@Data
public class Documents<T extends Serializable> implements Serializable {
    private static final long serialVersionUID = 7657511117355673864L;

    /**
     * @serial The list of documents returned by Haven OnDemand
     */
    private final List<T> documents;

    /**
     * @serial The total number of results found by Haven OnDemand. If the total_results parameter was not specified,
     * this will be null.
     */
    private final Integer totalResults;

    /**
     * @serial The expanded query returned by Haven OnDemand. This will be null if no query profile was used.
     */
    private final String expandedQuery;

    /**
     * parameter is set to suggest.
     *
     * @serial The spelling suggestion returned by Haven OnDemand. This will only be returned if the check_spelling
     * parameter is set to suggest.
     */
    private final Spelling suggestion;

    /**
     * parameter is set to auto_correction.
     *
     * @serial The spelling suggestion returned by Haven OnDemand. This will only be returned if the check_spelling
     * parameter is set to auto_correction.
     */
    private final Spelling autoCorrection;

    /**
     * @serial Warnings returned alongside IDOL/Hod responses.
     */
    private final Warnings warnings;

    /**
     * @serial List of expansion rules applicable to the type, may be null.
     */
    private final List<ExpansionRule> expansionOrder;

    // We can't use a builder here because Jackson doesn't support Builders with generic types
    // https://github.com/FasterXML/jackson-databind/issues/921
    public Documents(
        @JsonProperty("documents") final List<T> documents,
        @JsonProperty("totalhits") final Integer totalResults,
        @JsonProperty("expandedQuery") final String expandedQuery,
        @JsonProperty("suggestion") final Spelling suggestion,
        @JsonProperty("auto_correction") final Spelling autoCorrection,
        @JsonProperty("warnings") final Warnings warnings,
        @JsonProperty("expansionOrder") final List<ExpansionRule> expansionOrder
    ) {
        this.documents = new ArrayList<>(documents);
        this.totalResults = totalResults;
        this.expandedQuery = expandedQuery;
        this.suggestion = suggestion;
        this.autoCorrection = autoCorrection;
        this.warnings = warnings;
        this.expansionOrder = expansionOrder;
    }

    public Documents(
        final List<T> documents,
        final Integer totalResults,
        final String expandedQuery,
        final Spelling suggestion,
        final Spelling autoCorrection,
        final Warnings warnings
    ) {
        this(documents, totalResults, expandedQuery, suggestion, autoCorrection, warnings, null);
    }
}
