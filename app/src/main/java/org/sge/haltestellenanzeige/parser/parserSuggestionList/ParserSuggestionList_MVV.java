package org.sge.haltestellenanzeige.parser.parserSuggestionList;

import org.sge.haltestellenanzeige.opnv.OPNV;

public class ParserSuggestionList_MVV extends ParserSuggestionList_Type1Json {
    public ParserSuggestionList_MVV() { }
    public ParserSuggestionList_MVV(OPNV opnv, String suggestionList) {
        parseSuggestionListResponse(opnv, suggestionList);
    }
}
