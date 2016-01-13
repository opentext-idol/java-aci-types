/*
 * Copyright 2015-2016 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.hp.autonomy.types.requests.qms.actions.query.params;

/**
 * QMS-specific query action parameters.
 */
public enum QmsQueryParams {
    Blacklist,
    Cook,
    CookerContext,
    CookRequest,
    ExpandQuery,
    IntentRankedQuery,
    IRQCorpusSize,
    Promotions,
    PromotionsScope,
    QueryCookingParameters,
    RegenerateUsersTermCache,
    SynonymDatabaseMatch,
    SynonymReplace,
    Username,
    Whitelist;

    public static QmsQueryParams fromValue(final String value) {
        for (final QmsQueryParams queryParam : values()) {
            if (queryParam.name().equalsIgnoreCase(value)) {
                return queryParam;
            }
        }

        throw new IllegalArgumentException("Unknown query param " + value);
    }
}
