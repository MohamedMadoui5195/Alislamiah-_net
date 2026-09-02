package com.example.mybrowser // قم بتغييرها لتوافق حزمة مشروعك

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.EditText
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.pm.ShortcutInfoCompat
import androidx.core.content.pm.ShortcutManagerCompat
import androidx.core.graphics.drawable.IconCompat

class MainActivity : AppCompatActivity() {

    private lateinit var webView: WebView
    private lateinit var etUrlBar: EditText
    private lateinit var btnMenu: ImageView
    
    private var currentUrl: String = "https://www.google.com"
    private var currentTitle: String = "Google"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView = findViewById(R.id.webView)
        etUrlBar = findViewById(R.id.etUrlBar)
        btnMenu = findViewById(R.id.btnMenu)

        setupWebView()
        setupMenu()

        // تحميل الصفحة الافتتاحية أو الرابط القادم من اختصار الشاشة الرئيسية إن وجد
        val intentUrl = intent.dataString
        if (intentUrl != null) {
            webView.loadUrl(intentUrl)
        } else {
            webView.loadUrl(currentUrl)
        }
    }

    private fun setupWebView() {
        webView.settings.javaScriptEnabled = true
        webView.webViewClient = object : WebViewClient() {
            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
                if (url != null) {
                    currentUrl = url
                    etUrlBar.setText(url) // تحديث شريط الرابط بالعنوان الحالي
                }
            }
        }
        
        webView.webChromeClient = object : WebChromeClient() {
            override fun onReceivedTitle(view: WebView?, title: String?) {
                super.onReceivedTitle(view, title)
                if (title != null) {
                    currentTitle = title // حفظ عنوان الصفحة الحالي لإستخدامه في الاختصار
                }
            }
        }
    }

    private fun setupMenu() {
        btnMenu.setOnClickListener { view ->
            val popup = PopupMenu(this, view)
            popup.menuInflater.inflate(R.menu.menu_browser, popup.menu)

            popup.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action_share -> {
                        shareCurrentUrl()
                        true
                    }
                    R.id.action_add_to_home -> {
                        addShortcutToHomeScreen()
                        true
                    }
                    else -> false
                }
            }
            popup.show()
        }
    }

    private fun shareCurrentUrl() {
        val shareIntent = Intent(Intent.ACTION_SEND).apply {
            type = "text/plain"
            putExtra(Intent.EXTRA_TEXT, currentUrl)
        }
        startActivity(Intent.createChooser(shareIntent, "Share via"))
    }

    private fun addShortcutToHomeScreen() {
        if (ShortcutManagerCompat.isRequestPinShortcutSupported(this)) {
            val shortcutInfo = ShortcutInfoCompat.Builder(this, currentUrl.hashCode().toString())
                .setShortLabel(currentTitle)
                .setLongLabel(currentUrl)
                .setIcon(IconCompat.createWithResource(this, android.p.ic_menu_compass)) // أيقونة افتراضية
                .setIntent(Intent(this, MainActivity::class.java).apply {
                    action = Intent.ACTION_VIEW
                    data = Uri.parse(currentUrl)
                })
                .build()

            ShortcutManagerCompat.requestPinShortcut(shortcutInfo, null)
            Toast.makeText(this, "تم إرسال طلب إضافة الاختصار", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "جهازك لا يدعم إضافة الاختصارات تلقائياً", Toast.LENGTH_SHORT).show()
        }
    }

    // السماح بالرجوع للخلف في صفحات المتصفح عند الضغط على زر الرجوع في الهاتف
    override fun onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack()
        } else {
            super.onBackPressed()
        }
    }
}
