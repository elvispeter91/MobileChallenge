package com.currency.appInterface;

import com.currency.pojo.ExchangeRate;

/**
 * Created by Elvis Peter on 2017-03-16.
 */

public interface Communicator {

    void onTaskFinish(ExchangeRate data);
}
