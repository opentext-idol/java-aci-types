/*
 * Copyright 2015-2016 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.hp.autonomy.types.requests.idol.actions.query;

/**
 * Interface for Query Summary Response elements
 */
public interface QuerySummaryElement {
    String getText();

    Integer getDocsWithPhrase();

    Integer getOccurrences();

    Integer getDocsWithAllTerms();

    Integer getCluster();
}
