package in.eyehunt.intenttypesimplicitandexplicit;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Implicit intent example
        Button btn_Implicit = (Button)findViewById(R.id.button_im);
        btn_Implicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });

        //Explicit intent example
        Button btn_Explicit = (Button)findViewById(R.id.button_ex);
        btn_Explicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://tutorial.eyehunt.in";
                //action
                Intent i = new Intent(Intent.ACTION_VIEW);
                //data
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
    }
}
