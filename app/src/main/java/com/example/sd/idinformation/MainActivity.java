package com.example.sd.idinformation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText etID;
TextView tvMessage;
    @ Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etID = (EditText) findViewById(R.id.etID);//connection between component
        tvMessage= (TextView) findViewById(R.id.tvMessage);

    }
    public void btnSubmit_onClick(View v){
        String data =etID.getText().toString();
        String DOB =data.substring(0,6);
        int gender = Integer.parseInt( data.charAt(6)+"");
        String iGender;
        if (gender >=5)
            iGender="Male";
        else
            iGender="Female";
       int nationality =Integer.parseInt(data.charAt(10)+"");
       String iNationality;
       if(nationality==0 )
           iNationality="India";
           else
               iNationality="NON Indian";

       tvMessage.setText("Your information from your ID no.\n"+
               "Date of birth: "+DOB + "\n" +
       "Gender: "+ iGender +"\n"+
       "Nationality: "+iNationality);
    }
}
