package bd.edu.ibaisuniv.ibaisuniversity.listview1;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] names={"প্রবীর রায়","রাজীব মুন্সী","লিটন দাস","রাজীব কুমার","গোলাম সবুর","তউহিদুল ইসলাম","সঞ্জয় সরদার","আনিমেষ মিস্ত্রি","ভবতারিনি মণ্ডল",
            "মনির হোসাইন","সবুজ তালুকদার","মাহবুবুর রহমান","সাদ আব্দুল ওয়ালী","রাজীব আহমেদ","ড. শাহজাহান তপন"};
    ListView List;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        List = (ListView)findViewById(R.id.ListView);
        ListAdapter ListAdapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,names);
        List.setAdapter(ListAdapter);
        List.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent,View view,int position,long id){
                String s1 = String.valueOf(parent.getItemAtPosition(position));
                Toast.makeText(MainActivity.this,s1,Toast.LENGTH_LONG).show();

                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("সম্মানিত গ্রাহক");
                builder.setMessage("আপনি সফলভাবে ক্লিক করেছেনঃ-"+String.valueOf(parent.getItemAtPosition(position)));
                builder.create();
                builder.show();

            }

        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
