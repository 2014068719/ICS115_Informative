package com.example.kurtrhyandrodis.ics115_informative;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

public class Service extends IntentService {
    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param name Used to name the worker thread, important only for debugging.
     */
    public Service() {
        super("Service");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.d("Informative", "Service is Running");
    }
}

