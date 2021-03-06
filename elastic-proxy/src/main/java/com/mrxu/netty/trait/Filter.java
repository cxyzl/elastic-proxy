package com.mrxu.netty.trait;

import com.mrxu.exception.CustomException;
import com.mrxu.netty.filter.AbstractFilterContext;
import com.mrxu.netty.pojo.SessionContext;

public interface Filter {
    String name();

    void init();

    void run(AbstractFilterContext filterContext, SessionContext sessionContext) throws CustomException;

    boolean isValid();

    void shutdown();
}
