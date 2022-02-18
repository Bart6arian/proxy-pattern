package com.kodilla.proxy.db;

public class LazyDataRetrieverProxy implements DbDataRetriever {

    private DbDataRetriever dbDataRetriever;

    @Override
    public int getFirstValue() throws InterruptedException {
        if(dbDataRetriever == null)
            dbDataRetriever = new PostgresDataRetriever();
        return dbDataRetriever.getFirstValue();
    }

    @Override
    public int getSecondValue() throws InterruptedException {
        if(dbDataRetriever == null)
            dbDataRetriever = new PostgresDataRetriever();
        return dbDataRetriever.getSecondValue();
    }

    @Override
    public int getThirdValue() throws InterruptedException {
        if(dbDataRetriever == null)
            dbDataRetriever = new PostgresDataRetriever();
        return dbDataRetriever.getThirdValue();
    }
}
