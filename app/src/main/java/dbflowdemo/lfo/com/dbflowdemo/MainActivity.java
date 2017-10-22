package dbflowdemo.lfo.com.dbflowdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.raizlabs.android.dbflow.config.FlowManager;
import com.raizlabs.android.dbflow.sql.language.SQLite;
import com.raizlabs.android.dbflow.structure.ModelAdapter;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ModelAdapter<MyLearnAnswer> adapter = FlowManager.getModelAdapter(MyLearnAnswer.class);
        MyLearnAnswer vo =new MyLearnAnswer.Builder().imagePath("1").build();
        adapter.insert(vo);

        List<MyLearnAnswer> users = SQLite.select()
                .from(MyLearnAnswer.class)
//                .where()
                .queryList();
        Log.d("","");
    }
}
