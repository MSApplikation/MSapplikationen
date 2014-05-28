package dk.scleroseforeningen.ms;

import com.example.ms.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class RegistrerMadFrem extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.side5_3);
        
        

        addListenerOnButton1();
        addListenerOnButton2();
}
	
	

	private void addListenerOnButton2() {
		ImageButton tilbage1 = (ImageButton)findViewById(R.id.registrer_mad_tilbage);
		    tilbage1.setOnClickListener(new OnClickListener() 
		    {   public void onClick(View v) 
		        {   
		            Intent intent = new Intent(RegistrerMadFrem.this, MainActivity.class);
		                startActivity(intent);      
		                finish();
		        }
		    });
		} 



	public void addListenerOnButton1() {
		
		ImageButton mondayEdit= (ImageButton)findViewById(R.id.registrer_mad_tilbage_t);
	    mondayEdit.setOnClickListener(new OnClickListener() 
	    {   public void onClick(View v) 
	        {   
	            Intent intent = new Intent(RegistrerMadFrem.this, RegistrerMad.class);
	                startActivity(intent);      
	                finish();
	        }
	    });
       
    }

	
}
