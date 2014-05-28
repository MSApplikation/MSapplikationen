package dk.scleroseforeningen.ms;

import java.util.ArrayList;
import java.util.HashMap;

import com.example.ms.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;

public class MellemmaaltidReg extends Activity {
    
   // List view
   private ListView lv;
    
   // Listview Adapter
   ArrayAdapter<String> adapter;
    
   // Search EditText 
   EditText inputSearch;
    
    
   // ArrayList for Listview
   ArrayList<HashMap<String, String>> productList;

   @Override
   public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.side7mellemmaaltid);
       
       addListenerOnButton();
        
       // Listview Data
       String food[] = {"Ananas", "Appelsin", "Avocado", "Blåbær", "Havregryn", "Mælk", "Kaffe"};
       
       lv = (ListView) findViewById(R.id.list_view);
       inputSearch = (EditText) findViewById(R.id.inputSearch);
        
       // Adding items to listview
       adapter = new ArrayAdapter<String>(this, R.layout.list_item, R.id.product_name, food);
       lv.setAdapter(adapter);
        
       /**
        * Enabling Search Filter
        * */
    //   inputSearch.addTextChangedListener(new TextWatcher() {
            
         //  @Override
          // public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
               // When user changed the Text
         //      MorgenReg.this.adapter.getFilter().filter(cs);  
         //  }
            
         //  @Override
         //  public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
         //          int arg3) {
               // TODO Auto-generated method stub
                
         //  }
            
         //  @Override
          // public void afterTextChanged(Editable arg0) {
         //      // TODO Auto-generated method stub                         
         //  }
      // });
   }

private void addListenerOnButton() {
	ImageButton oversigt5 = (ImageButton)findViewById(R.id.registrer_mad_tilbage);
    oversigt5.setOnClickListener(new OnClickListener() 
    {   public void onClick(View v) 
        {   
            Intent intent = new Intent(MellemmaaltidReg.this, RegistrerMad.class);
                startActivity(intent);      
                finish();
        }
    });
	
}   
}