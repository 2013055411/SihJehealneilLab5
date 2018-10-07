package jehealneil.sih.com.sihjehealneillab5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onStop() {
        super.onStop ();
        Log.d("4ITH", "onStop");
    }


    @Override
    protected void onPause() {
        super.onPause () ;
        Log.d( "4ITH", "onPause: ");
    }



    public void buttonClickOne(View view)
    {
        Intent intent = new Intent(this,Activity2.class);
        startActivity(intent);
    }
}
