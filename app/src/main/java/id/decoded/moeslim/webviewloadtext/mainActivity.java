package id.decoded.moeslim.webviewloadtext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class mainActivity extends AppCompatActivity {

    WebView wvInfoIlkom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wvInfoIlkom = (WebView)findViewById(R.id.wvText);

        String data = "Kontent 1:\n" +
                "      UTF-8. UTF-8 (Universal Character Set (UCS) Transformation Format — 8-bit)\n" +
                "      adalah sebuah pengkodean karakter dengan lebar variabel tertentu (variable-width\n" +
                "      encoding) yang mewakili setiap karakter komputer (character) dalam himpunan\n" +
                "      karakter Unicode.";

        String htmlText = " %s ";
        String fileHTML = "<html><body style=\"text-align:justify\">" + data + "</body></html>";

        wvInfoIlkom.loadData(String.format(htmlText, fileHTML), "text/html", "utf-8");
    }
}
