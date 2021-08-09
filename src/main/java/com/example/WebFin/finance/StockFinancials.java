package com.example.WebFin.finance;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class StockFinancials {
    private String status;
    private int count;
    private OnePeriodStockFinancialsInnerObject[] results;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public OnePeriodStockFinancialsInnerObject[] getResults() {
        return results;
    }

    public void setResults(OnePeriodStockFinancialsInnerObject[] results) {
        this.results = results;
    }
}
