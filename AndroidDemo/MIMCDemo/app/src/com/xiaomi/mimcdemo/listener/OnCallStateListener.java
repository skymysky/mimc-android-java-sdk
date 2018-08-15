package com.xiaomi.mimcdemo.listener;

import mimc.RtsData;

/**
 * Created by houminjiang on 18-5-24.
 */

public interface OnCallStateListener {
    void onLaunched(String fromAccount, String fromResource, Long chatId, byte[] data);
    void onAnswered(Long chatId, boolean accepted, String errMsg);
    void handleData(Long chatId, RtsData.PKT_TYPE pktType, byte[] data);
    void onClosed(Long chatId, String errMsg);
}