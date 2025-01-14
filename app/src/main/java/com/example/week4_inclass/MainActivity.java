package com.example.week4_inclass;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {
    TextView txtMsg;
    ListView listView;
    String[] names={"Hoang Thanh Nam","Dinh Thi Thuy Huong","Phan Tri Nhan","Nguyen Thanh Hue","Pham Van Anh Thu"};
    String[] phones={"0359935724","098798787","0824417567","0357456282","0567843211"};
    Integer[] thumbnails={R.drawable.icon_teamwork_1,R.drawable.icon_teamwork_2,R.drawable.icon_teamwork_3,R.drawable.icon_teamwork_4,R.drawable.icon_teamwork_5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtMsg = (TextView) findViewById(R.id.txtMsg);
        listView=findViewById(R.id.listView);

        CustomIconLabelAdapter adapter=new CustomIconLabelAdapter(this,R.layout.custom_row_icon_label,names,phones,thumbnails);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                txtMsg.setText("You choose: "+names[position]);
            }
        });
    }
}
