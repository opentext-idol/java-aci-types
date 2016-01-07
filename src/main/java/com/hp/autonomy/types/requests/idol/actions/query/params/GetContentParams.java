/*
 * Copyright 2015-2016 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.hp.autonomy.types.requests.idol.actions.query.params;

/**
 * GetContent Action Parameters
 */
public enum GetContentParams {
    Boolean,
    Characters,
    DatabaseMatch,
    EndTag,
    FieldRecurse,
    FieldRestriction,
    HardFieldRestriction,
    Highlight,
    HighlightTagTerm,
    ID,
    IgnoreSpecials,
    LanguageType,
    Links,
    MatchAllTerms,
    MaxPrintChars,
    OutputEncoding,
    Print,
    PrintEngine,
    PrintFields,
    Reference,
    ReferenceField,
    SecurityInfo,
    Sentences,
    StartTag,
    StateID,
    Stemming,
    Summary,
    Synchronous,
    XMLMeta;

    public static GetContentParams fromValue(final String value) {
        for (final GetContentParams param : values()) {
            if (param.name().equalsIgnoreCase(value)) {
                return param;
            }
        }

        throw new IllegalArgumentException("Unknown query param " + value);
    }
}
