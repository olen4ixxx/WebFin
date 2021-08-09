package com.example.WebFin.finance;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class PreviousClose {
    public String ticker;
    public String status;
    public int queryCount;
    public int resultsCount;
    public boolean adjusted;
    public PreviousCloseInnerObject[] results;
    public String request_id;
    public int count;


}