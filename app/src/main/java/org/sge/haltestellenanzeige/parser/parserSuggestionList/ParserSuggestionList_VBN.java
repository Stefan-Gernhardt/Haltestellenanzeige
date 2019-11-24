package org.sge.haltestellenanzeige.parser.parserSuggestionList;

import org.sge.haltestellenanzeige.opnv.OPNV;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_VBN;

public class ParserSuggestionList_VBN extends ParserSuggestionList_DB_SVV {

    public ParserSuggestionList_VBN() { }
    public ParserSuggestionList_VBN(OPNV opnv, String suggestionList) {
        parseSuggestionListResponse(opnv, suggestionList);
    }


    public void parseSuggestionResponse(OPNV opnv, String response) {
        parseSuggestionListResponse(opnv, response);
    }
}
