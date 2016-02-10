/*
 * Copyright 2015-2016 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
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
     * @serial The list of documents returned by HP Haven OnDemand
     */
    private final List<T> documents;

    /**
     * @serial The total number of results found by HP Haven OnDemand. If the total_results parameter was not specified,
     * this will be null.
     */
    private final Integer totalResults;

    /**
     * @serial The expanded query returned by HP Haven OnDemand. This will be null if no query profile was used.
     */
    private final String expandedQuery;

    /**
     * @return The spelling suggestion returned by HP Haven OnDemand. This will only be returned if the check_spelling
     * parameter is set to suggest.
     * @serial The spelling suggestion returned by HP Haven OnDemand. This will only be returned if the check_spelling
     * parameter is set to suggest.
     */
    private final Spelling suggestion;

    /**
     * @return The spelling suggestion returned by HP Haven OnDemand. This will only be returned if the check_spelling
     * parameter is set to auto_correction.
     * @serial The spelling suggestion returned by HP Haven OnDemand. This will only be returned if the check_spelling
     * parameter is set to auto_correction.
     */
    private final Spelling autoCorrection;

    /**
     * @return Warnings returned alongside IDOL/Hod responses.
     * @serial Warnings returned alongside IDOL/Hod responses.
     */
    private final Warnings warnings;

    // We can't use a builder here because Jackson doesn't support Builders with generic types
    // https://github.com/FasterXML/jackson-databind/issues/921
    public Documents(
            @JsonProperty("documents") final List<T> documents,
            @JsonProperty("totalhits") final Integer totalResults,
            @JsonProperty("expandedQuery") final String expandedQuery,
            @JsonProperty("suggestion") final Spelling suggestion,
            @JsonProperty("auto_correction") final Spelling autoCorrection,
            @JsonProperty("warnings") final Warnings warnings
    ) {
        this.documents = new ArrayList<>(documents);
        this.totalResults = totalResults;
        this.expandedQuery = expandedQuery;
        this.suggestion = suggestion;
        this.autoCorrection = autoCorrection;
        this.warnings = warnings;
    }

}
