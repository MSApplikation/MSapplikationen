package dk.scleroseforeningen.ms;

import com.example.ms.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Vis27 extends Activity {

	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.side1_tilbage1);
        
        addListenerOnButton();
        addListenerOnButton1();
        addListenerOnButton2();
        addListenerOnButton3();
        addListenerOnButton4();
}

	private void addListenerOnButton4() {
		ImageButton tilKalender = (ImageButton)findViewById(R.id.registrer_mad_tilbage);
	    tilKalender.setOnClickListener(new OnClickListener() 
	    {   public void onClick(View v) 
	        {   
	            Intent intent = new Intent(Vis27.this, Kalender.class);
	                startActivity(intent);      
	                finish();
	        }
	    });	
	}

	private void addListenerOnButton3() {
		ImageButton tilNoter = (ImageButton)findViewById(R.id.tilStatus);
	    tilNoter.setOnClickListener(new OnClickListener() 
	    {   public void onClick(View v) 
	        {   
	            Intent intent = new Intent(Vis27.this, MSStatus.class);
	                startActivity(intent);      
	                finish();
	        }
	    });	
	}

	private void addListenerOnButton2() {
		ImageButton kalender = (ImageButton)findViewById(R.id.Button01);
	    kalender.setOnClickListener(new OnClickListener() 
	    {   public void onClick(View v) 
	        {   
	            Intent intent = new Intent(Vis27.this, Kalender.class);
	                startActivity(intent);      
	                finish();
	        }
	    });
	}

	private void addListenerOnButton1() {
		ImageButton til26 = (ImageButton)findViewById(R.id.oversigt5);
	    til26.setOnClickListener(new OnClickListener() 
	    {   public void onClick(View v) 
	        {   
	            Intent intent = new Intent(Vis27.this, Vis26.class);
	                startActivity(intent);      
	                finish();
	        }
	    });
	}

	private void addListenerOnButton() {
		ImageButton til28 = (ImageButton)findViewById(R.id.til_28);
	    til28.setOnClickListener(new OnClickListener() 
	    {   public void onClick(View v) 
	        {   
	            Intent intent = new Intent(Vis27.this, DagKalender.class);
	                startActivity(intent);      
	                finish();
	        }
	    });
	} 

}