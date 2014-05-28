package dk.scleroseforeningen.ms;

import com.example.ms.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Vis26 extends Activity {

	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.side1_tilbage2);
        
        addListenerOnButton();
        addListenerOnButton1();
        addListenerOnButton2();
        addListenerOnButton3();

}

	private void addListenerOnButton3() {
		ImageButton tilKalender = (ImageButton)findViewById(R.id.registrer_mad_tilbage);
	    tilKalender.setOnClickListener(new OnClickListener() 
	    {   public void onClick(View v) 
	        {   
	            Intent intent = new Intent(Vis26.this, Kalender.class);
	                startActivity(intent);      
	                finish();
	        }
	    });	
	}

	private void addListenerOnButton2() {
		ImageButton tilNoter = (ImageButton)findViewById(R.id.tilStatus);
	    tilNoter.setOnClickListener(new OnClickListener() 
	    {   public void onClick(View v) 
	        {   
	            Intent intent = new Intent(Vis26.this, MSStatus.class);
	                startActivity(intent);      
	                finish();
	        }
	    });
	}

	private void addListenerOnButton1() {
		ImageButton kalender = (ImageButton)findViewById(R.id.Button01);
	    kalender.setOnClickListener(new OnClickListener() 
	    {   public void onClick(View v) 
	        {   
	            Intent intent = new Intent(Vis26.this, Kalender.class);
	                startActivity(intent);      
	                finish();
	        }
	    });
	}

	private void addListenerOnButton() {
		ImageButton oversigt5 = (ImageButton)findViewById(R.id.til_27);
	    oversigt5.setOnClickListener(new OnClickListener() 
	    {   public void onClick(View v) 
	        {   
	            Intent intent = new Intent(Vis26.this, Vis27.class);
	                startActivity(intent);      
	                finish();
	        }
	    });
	}
}
