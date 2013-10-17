package inf.ritchieg9.cucei;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
 
public class Twitter extends Activity
{
    private WebView browser;
 
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twitter);
 
        browser = (WebView)findViewById(R.id.webkit2);
         
        browser.getSettings().setJavaScriptEnabled(true);
        browser.getSettings().setBuiltInZoomControls(true);
                 
        browser.loadUrl("http://twitter.com/cdinf");
         
        browser.setWebViewClient(new WebViewClient()
        {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url)
            {
                return false;
            }   
             
        });
    }   
 
}