
package com.flowreader.app;

import android.os.Bundle;
import com.getcapacitor.BridgeActivity;

import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends BridgeActivity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// Enable IndexedDB, localStorage, DOM storage, file access
		WebView webView = (WebView) findViewById(com.getcapacitor.R.id.webview);
		if (webView != null) {
			WebSettings settings = webView.getSettings();
			settings.setDomStorageEnabled(true);
			settings.setDatabaseEnabled(true);
			settings.setAllowFileAccess(true);
			settings.setAllowFileAccessFromFileURLs(true);
			settings.setAllowUniversalAccessFromFileURLs(true);
			settings.setJavaScriptEnabled(true);
		}
	}
}
