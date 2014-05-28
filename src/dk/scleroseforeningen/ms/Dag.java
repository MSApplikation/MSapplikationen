package dk.scleroseforeningen.ms;

import java.util.ArrayList;
import java.util.List;

import com.example.ms.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Dag extends Activity {

    public ListView lv;

    public void onCreate(Bundle savedInstanceState) {
    	 super.onCreate(savedInstanceState);
         setContentView(R.layout.side1);

         lv = (ListView) findViewById(R.id.kostDagList);
       

         // Instanciating an array list (you don't need to do this, 
         // you already have yours).
         List<String> your_array_list = new ArrayList<String>();
         your_array_list.add("2 x Appelsin");
         your_array_list.add("1 x Gulerod");
         your_array_list.add("1 x Banan");
         your_array_list.add("150 x Ananas");

         // This is the array adapter, it takes the context of the activity as a 
         // first parameter, the type of list view as a second parameter and your 
         // array as a third parameter.
         ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                 this, 
                 android.R.layout.simple_list_item_1,
                 your_array_list );

         lv.setAdapter(arrayAdapter); 
    }
}