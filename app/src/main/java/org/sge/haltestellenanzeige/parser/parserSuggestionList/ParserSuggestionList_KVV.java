package org.sge.haltestellenanzeige.parser.parserSuggestionList;

import org.sge.haltestellenanzeige.opnv.OPNV;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_KVV;

public class ParserSuggestionList_KVV extends ParserSuggestionList_Type1Json {
    public ParserSuggestionList_KVV() { }
    public ParserSuggestionList_KVV(OPNV_KVV OPNVKVV, String jsonStringSuggestionList) {
        parseSuggestionListResponse(OPNVKVV, jsonStringSuggestionList);
    }
}
