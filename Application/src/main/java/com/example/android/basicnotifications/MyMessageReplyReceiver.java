package com.example.android.basicnotifications;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyMessageReplyReceiver extends BroadcastReceiver {
    public MyMessageReplyReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        int thisConversationId = intent.getIntExtra("conversation_id", -1);

        Log.d("BasicNotifications", "MyMessageReplyReceiver conversation ID: " + thisConversationId);
    }
}
