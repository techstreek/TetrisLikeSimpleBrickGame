package classic_tetris.blockgame.ui;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import classic_tetris.blockgame.R;

public class Privacy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy);

        WebView mywebview = (WebView) findViewById(R.id.webView);

        mywebview.loadUrl("https://techstreek.com/classic-blocks-puzzle-privacy-policy/");
    }

}
