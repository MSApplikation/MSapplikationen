package dk.scleroseforeningen.ms;

import com.example.ms.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class MSStatus extends Activity {
	

	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.side10);
        
        addListenerOnButton();
        addListenerOnButton1();
        addListenerOnButton2();
        addListenerOnButton3();
        
}

	private void addListenerOnButton1() {
		ImageButton gem= (ImageButton)findViewById(R.id.gem10);
	    gem.setOnClickListener(new OnClickListener() 
	    {   public void onClick(View v) 
	        {   
	            Intent intent = new Intent(MSStatus.this, TilbageTil6.class);
	                startActivity(intent);      
	                finish();
	        }
	    });
	}

	private void addListenerOnButton() {
		ImageButton tilbage= (ImageButton)findViewById(R.id.registrer_mad_tilbage);
	    tilbage.setOnClickListener(new OnClickListener() 
	    {   public void onClick(View v) 
	        {   
	            Intent intent = new Intent(MSStatus.this, TilbageTil6.class);
	                startActivity(intent);      
	                finish();
	        }
	    });
	} 

	private void addListenerOnButton2() {
		ImageButton dagfrem= (ImageButton)findViewById(R.id.tilTir29);
	    dagfrem.setOnClickListener(new OnClickListener() 
	    {   public void onClick(View v) 
	        {   
	            Intent intent = new Intent(MSStatus.this, MSStatusVis29.class);
	                startActivity(intent);      
	                finish();
	        }
	    });
	}
	
	private void addListenerOnButton3() {
		ImageButton dagtilbage= (ImageButton)findViewById(R.id.tilSoen27);
	    dagtilbage.setOnClickListener(new OnClickListener() 
	    {   public void onClick(View v) 
	        {   
	            Intent intent = new Intent(MSStatus.this, MSStatusVis27.class);
	                startActivity(intent);      
	                finish();
	        }
	    });
	} 
	
}