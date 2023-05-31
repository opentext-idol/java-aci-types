/*
 * Copyright 2015-2016 Open Text.
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
