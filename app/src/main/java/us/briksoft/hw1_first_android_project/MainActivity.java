package us.briksoft.hw1_first_android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.view.textservice.TextServicesManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText txtText;
    Button btnInfo, btnCities, btnMovies, btnParks, btnTraffic, btnMusic, btnFood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    txtText = (EditText)findViewById(R.id.txtText);
    btnInfo = (Button)findViewById(R.id.btnInfo);
    btnCities =(Button)findViewById(R.id.btnCities);
    btnMovies =(Button)findViewById(R.id.btnMovies);
    btnParks =(Button)findViewById(R.id.btnParks);
    btnTraffic =(Button)findViewById(R.id.btnTraffic);
    btnMusic =(Button)findViewById(R.id.btnMusic);
    btnFood =(Button)findViewById(R.id.btnFood);

    }


   public void displayToast(View v) {
       Toast.makeText(MainActivity.this, "Toast", Toast.LENGTH_SHORT).show();

    }
}