package com.abdo_mashael.challenge1;

import android.net.http.SslError;
import android.os.Bundle;
import android.util.Log;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AboutALC extends AppCompatActivity {

    private static final String TAG = AboutALC.class.getSimpleName();
    @BindView(R.id.back_btn)
    ImageButton backBtn;
    @BindView(R.id.webview)
    WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);
        ButterKnife.bind(this);

        webview.getSettings().setJavaScriptEnabled(true);

        webview.setWebViewClient(new WebViewClient(){
            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                Log.d(TAG, "onReceivedSslError: "+error.toString());
                handler.proceed();
            }
        });


        webview.loadUrl(getString(R.string.url));

        backBtn.setOnClickListener(view -> onBackPressed());

    }
}
