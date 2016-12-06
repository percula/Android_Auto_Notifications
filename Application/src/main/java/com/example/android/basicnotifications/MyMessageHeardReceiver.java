package com.example.android.basicnotifications;

import android.app.RemoteInput;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class MyMessageHeardReceiver extends BroadcastReceiver {
    public MyMessageHeardReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        int thisConversationId = intent.getIntExtra("conversation_id", -1);

        Bundle remoteInput = RemoteInput.getResultsFromIntent(intent);
        if (remoteInput != null) {
            CharSequence replyText = remoteInput.getCharSequence("voice_reply_key");
        }
    }
}
