package dk.scleroseforeningen.ms;

import com.example.ms.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Toast;

public class MadKaffe extends Activity {

	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.side2_kaffe);
        
        addListenerOnButton();
        addListenerOnButton1();
}

	private void addListenerOnButton() {
		ImageButton tilKalender = (ImageButton)findViewById(R.id.ok1);
	    tilKalender.setOnClickListener(new OnClickListener() 
	    {   public void onClick(View v) 
	        {   
	            Intent intent = new Intent(MadKaffe.this, MorgenReg.class);
	                startActivity(intent);      
	                finish();
	                
	                Toast.makeText(getApplicationContext(), "Kaffe tilføjet",
	                		   Toast.LENGTH_LONG).show();
	        }
	    });	
	}

	private void addListenerOnButton1() {
		ImageButton tilNoter = (ImageButton)findViewById(R.id.registrer_mad_tilbage);
	    tilNoter.setOnClickListener(new OnClickListener() 
	    {   public void onClick(View v) 
	        {   
	            Intent intent = new Intent(MadKaffe.this, MorgenReg.class);
	                startActivity(intent);      
	                finish();
	        }
	    });	
	}



}