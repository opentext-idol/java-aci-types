/*
 * Copyright 2015 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.hp.autonomy.types.requests.idol.actions.query.params;

/**
 * Possible values for the Highlight parameter
 */
public enum HighlightParam {
    Off,
    Sentences,
    Terms,
    Proximity,
    SummarySentences,
    SummaryTerms,
    AgentBoolSentences,
    AgentBoolTerms;

    public static HighlightParam fromValue(final String value) {
        for (final HighlightParam param : values()) {
            if (param.name().equalsIgnoreCase(value)) {
                return param;
            }
        }

        throw new IllegalArgumentException("Unknown query param " + value);
    }
}
