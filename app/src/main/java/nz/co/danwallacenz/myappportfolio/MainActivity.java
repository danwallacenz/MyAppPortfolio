package nz.co.danwallacenz.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private Toast toast;
//    int duration = Toast.LENGTH_SHORT;
//    Context context = getApplicationContext();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void spotifyStreamerButtonTap(View view) {
        CharSequence text = "This button will launch the Spotify Streamer app!";
        showToast(view, text);
    }

    public void scoresAppButtonTap(View view) {
        CharSequence text = "This button will launch the Scores app!";
        showToast(view, text);
    }

    public void libraryAppButtonTap(View view) {
        CharSequence text = "This button will launch the Library app!";
        showToast(view, text);
    }

    public void buildItBiggerButtonTap(View view) {
        CharSequence text = "This button will launch the Build it Bigger app!";
        showToast(view, text);
    }

    public void xyzReaderButtonTap(View view) {
        CharSequence text = "This button will launch the XYZ Reader app!";
        showToast(view, text);
    }

    public void capstoneButtonTap(View view) {
        CharSequence text = "This button will launch my Capstone app!";
        showToast(view, text);
    }

    private void showToast(View view, CharSequence text){
        if (toast != null) {
            toast.cancel();
        }
        int duration = Toast.LENGTH_SHORT;
        Context context = getApplicationContext();
        toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.TOP|Gravity.LEFT, view.getLeft() + 10, view.getBottom());
        toast.show();
    }
}
