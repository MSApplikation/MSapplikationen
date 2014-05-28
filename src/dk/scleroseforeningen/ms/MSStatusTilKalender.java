package dk.scleroseforeningen.ms;

import com.example.ms.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class MSStatusTilKalender extends Activity {
	

	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.side10);
        
        addListenerOnButton();
        addListenerOnButton1();
}

	private void addListenerOnButton1() {
		ImageButton gem= (ImageButton)findViewById(R.id.gem10);
	    gem.setOnClickListener(new OnClickListener() 
	    {   public void onClick(View v) 
	        {   
	            Intent intent = new Intent(MSStatusTilKalender.this, DagKalender.class);
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
	            Intent intent = new Intent(MSStatusTilKalender.this, DagKalender.class);
	                startActivity(intent);      
	                finish();
	        }
	    });
	} 

}