package cc.virk.cornapp;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class FullscreenActivity extends ActionBarActivity {
    private Button loginButton;
    private EditText username, password;
    private String user, pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_fullscreen);

        username = (EditText) findViewById(R.id.editText);
        password = (EditText) findViewById(R.id.editText2);
        loginButton = (Button) findViewById(R.id.button);
    }

    public void loginButtonClickHandler (View v) {
        user = username.getText().toString();
        pass = password.getText().toString();

        if (user.equals("cally") && pass.equals("kitty")) {
            Toast.makeText(getApplicationContext(), "Valid Login", Toast.LENGTH_LONG).show();
//            Intent mainActivityIntent = new Intent(this, MainActivity.class);
//            startActivity(mainActivityIntent);
//            finish();
        } else {
            password.setText("", TextView.BufferType.EDITABLE);
            Toast.makeText(getApplicationContext(), "Invalid Login", Toast.LENGTH_LONG).show();
        }
    }

//    @Override
//    protected void onPostCreate(Bundle savedInstanceState) {
//        super.onPostCreate(savedInstanceState);
//
//        // Trigger the initial hide() shortly after the activity has been
//        // created, to briefly hint to the user that UI controls
//        // are available.
//        delayedHide(100);
//    }

}
