/*
 * Copyright 2015 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.hp.autonomy.types.requests.qms;

/**
 * QMS-specific action parameters that can be added to actions
 */
public enum QmsActionParams {
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

    public static QmsActionParams fromValue(final String value) {
        for (final QmsActionParams queryParam : values()) {
            if (queryParam.name().equalsIgnoreCase(value)) {
                return queryParam;
            }
        }

        throw new IllegalArgumentException("Unknown query param " + value);
    }
}
