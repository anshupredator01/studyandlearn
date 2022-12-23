package com.predator.studyandlearn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class Simple : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple)
        val webView = findViewById<WebView>(R.id.webView3)
        webView.settings.setJavaScriptEnabled(true)

        webView.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                view?.loadUrl("https://images.collegedunia.com/public/college_data/images/entrance/sample_paper/1656329230SAT%20Reading%20Test%201.pdf")
                return true
            }
        }
        webView.loadUrl("https://images.collegedunia.com/public/college_data/images/entrance/sample_paper/1656329230SAT%20Reading%20Test%201.pdf")
    }
}