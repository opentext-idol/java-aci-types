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
 * Parameters for suggest actions
 */
public enum SuggestParams {
    AbsWeight,
    CaseSensitive,
    Characters,
    Cluster,
    ClusterThreshold,
    ClusterTitleLength,
    Combine,
    CombineNumber,
    DAHEndState,
    DAHStartState,
    DatabaseMatch,
    DontMatchID,
    DontMatchReference,
    EndTag,
    FieldCheck,
    FieldRecurse,
    FieldText,
    Highlight,
    HighlightTagTerm,
    ID,
    IRS,
    LanguageType,
    LinkFieldText,
    MatchEncoding,
    MatchID,
    MatchLanguage,
    MatchLanguageType,
    MatchReference,
    MaxDate,
    MaxID,
    MaxPrintChars,
    MaxResults,
    MaxScore,
    MinDate,
    MinID,
    MinLinks,
    MinScore,
    MinTermLength,
    OutputEncoding,
    PerformanceAnalysis,
    Predict,
    Print,
    PrintFields,
    QuerySummary,
    Reference,
    ReferenceField,
    SecurityInfo,
    Sentences,
    SingleMatch,
    Sort,
    Start,
    StartTag,
    StateDontMatchID,
    StateID,
    StateMatchID,
    Stemming,
    StoredStateField,
    StoredStateTokenLifetime,
    StoreState,
    Summary,
    Synchronous,
    TimeoutMS,
    TotalResults,
    WeighFieldText,
    XMLMeta;

    public static SuggestParams fromValue(final String value) {
        for (final SuggestParams param : values()) {
            if (param.name().equalsIgnoreCase(value)) {
                return param;
            }
        }

        throw new IllegalArgumentException("Unknown query param " + value);
    }
}
