package com.hp.autonomy.types.requests.idol.actions.tags;

import java.util.List;

/**
 * Generic response for queries to GetTagNames for multiple field types
 */
public interface TagResponse {
    List<String> getIndexTypeFields();

    List<String> getParametricTypeFields();

    List<String> getNumericTypeFields();

    List<String> getAutnRankTypeFields();

    List<String> getReferenceTypeFields();

    List<String> getDateTypeFields();

    List<String> getStoredTypeFields();
}
