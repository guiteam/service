package tw.org.iii.mysevertext;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");

    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("brad","onStartCommand");


        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("brad","onCreate");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("brad","onDestroy1");

    }


}
