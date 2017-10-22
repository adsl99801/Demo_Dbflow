package dbflowdemo.lfo.com.dbflowdemo;

import android.app.Application;

import com.raizlabs.android.dbflow.config.FlowManager;

/**
 * Created by home on 2017/8/29.
 */

public class MApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FlowManager.init(this);
    }
}
