package com.fei.ad.mysql.listener;

import com.fei.ad.mysql.dto.BinlogRowData;

/**
 * Created by Qinyi.
 */
public interface Ilistener {

    void register();

    void onEvent(BinlogRowData eventData);
}
