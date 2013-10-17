package inf.ritchieg9.cucei;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
 
public class Facebook extends Activity
{
    private WebView browser;
 
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook);
 
        browser = (WebView)findViewById(R.id.webkit);
         
                //habilitamos javascript y el zoom
        browser.getSettings().setJavaScriptEnabled(true);
        browser.getSettings().setBuiltInZoomControls(true);
                 
                //habilitamos los plugins (flash)
        //browser.getSettings().setPluginsEnabled(true);
         
                browser.loadUrl("http://www.facebook.com/pages/Coordinacion-Informatica-CUCEI/235704839890195");
         
        browser.setWebViewClient(new WebViewClient()
        {
                        // evita que los enlaces se abran fuera nuestra app en el navegador de android
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url)
            {
                return false;
            }   
             
        });
    }   
 
}