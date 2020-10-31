package com.fei.ad.sender;

import com.fei.ad.mysql.dto.MySqlRowData;

/**
 * Created by Qinyi.
 */
public interface ISender {

    void sender(MySqlRowData rowData);
}
