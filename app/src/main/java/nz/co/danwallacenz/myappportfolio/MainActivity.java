package nz.co.danwallacenz.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
//        toast.setGravity(Gravity.TOP|Gravity.LEFT, view.getLeft() + 10, view.getBottom());
        toast.show();
    }
}
