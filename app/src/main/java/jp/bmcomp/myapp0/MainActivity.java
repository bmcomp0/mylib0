package jp.bmcomp.myapp0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import jp.bmcomp.mylib0.MyLib0;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyLib0 inst = new MyLib0();
        String s =inst.hello();

        TextView tv = (TextView) findViewById(R.id.tv0);
        tv.setText(s);

    }
}
