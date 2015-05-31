package eliasdowling.com.wetsuitpicker;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class DisplayMessageActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // get message from intent
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // create text view
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);
        //sets the text view as activity layout
        setContentView(textView);

        //parse to int
        int temp = Integer.parseInt(message);

        //centers text
        textView.setGravity(Gravity.CENTER);

        // general temp info
        if (temp<42){
            textView.setText("Suit: 6/5/4mm hooded\nBoots: 7mm\nGloves 7mm");
        }
        else if(temp>=42 && temp<52){
            textView.setText("Suit: 5/4/3mm hooded\nBoots: 5mm\nGloves 5mm");

        }
        else if(temp>=52&&temp<58){
            textView.setText("Suit: 4/3mm \nBoots: 5mm\nGloves: 5mm");
        }
        else if (temp>=58&&temp<63){
            textView.setText("Suit: 3/2mm \nBoots: 3mm optional\nGloves: 3mm optional");
        }
        else if (temp>=63&&temp<70){
            textView.setText("Suit: 3/2mm or 2mm top");
        }
        else if(temp>=70){
            textView.setText("Rashguard");
        }




    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_display_message, menu);
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
