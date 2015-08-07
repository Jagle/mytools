package com.wukongtv.wkhelper; class WKWebView { void a() { int a;
a=0;// .class public Lcom/wukongtv/wkhelper/WKWebView;
a=0;// .super Landroid/app/Activity;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field a:Landroid/webkit/WebView;
a=0;// 
a=0;// .field b:Ljava/lang/String;
a=0;// 
a=0;// .field c:Landroid/widget/LinearLayout;
a=0;// 
a=0;// .field private d:Z
a=0;// 
a=0;// .field private e:Landroid/os/Handler;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/WKWebView;);
a=0;//     new-instance v0, Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Handler;);
a=0;//     invoke-direct {v0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/WKWebView;->e:Landroid/os/Handler;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/wukongtv/wkhelper/WKWebView;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     iget-boolean v0, p0, Lcom/wukongtv/wkhelper/WKWebView;->d:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcom/wukongtv/wkhelper/WKWebView;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/wukongtv/wkhelper/WKWebView;->d:Z
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onBackPressed()V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/WKWebView;->a:Landroid/webkit/WebView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/webkit/WebView;);
a=0;//     invoke-virtual {v0}, Landroid/webkit/WebView;->canGoBack()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/WKWebView;->a:Landroid/webkit/WebView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/webkit/WebView;);
a=0;//     invoke-virtual {v0}, Landroid/webkit/WebView;->goBack()V
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onBackPressed()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 4
a=0;//     .annotation build Landroid/annotation/SuppressLint;
a=0;//         value = {
a=0;//             "SetJavaScriptEnabled",
a=0;//             "AddJavascriptInterface",
a=0;//             "JavascriptInterface"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     const v0, 0x7f03001f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/wukongtv/wkhelper/WKWebView;->setContentView(I)V
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/WKWebView;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "website"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/WKWebView;->b:Ljava/lang/String;
a=0;// 
a=0;//     const v0, 0x7f0b0073
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/wukongtv/wkhelper/WKWebView;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/webkit/WebView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/WKWebView;->a:Landroid/webkit/WebView;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/WKWebView;->a:Landroid/webkit/WebView;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/WKWebView;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setAppCachePath(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/WKWebView;->a:Landroid/webkit/WebView;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setAppCacheEnabled(Z)V
a=0;// 
a=0;//     const v0, 0x7f0b0074
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/wukongtv/wkhelper/WKWebView;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/WKWebView;->c:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/WKWebView;->a:Landroid/webkit/WebView;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/WKWebView;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const v2, 0x106000b
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setBackgroundColor(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/WKWebView;->a:Landroid/webkit/WebView;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/webkit/WebView;->setScrollBarStyle(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/WKWebView;->a:Landroid/webkit/WebView;
a=0;// 
a=0;//     const-string v1, "WKinterface"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, p0, v1}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/WKWebView;->a:Landroid/webkit/WebView;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/WKWebView;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
a=0;// 
a=0;//     iput-boolean v3, p0, Lcom/wukongtv/wkhelper/WKWebView;->d:Z
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/WKWebView;->a:Landroid/webkit/WebView;
a=0;// 
a=0;//     new-instance v1, Lcom/wukongtv/wkhelper/z;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/wukongtv/wkhelper/z;);
a=0;//     invoke-direct {v1, p0}, Lcom/wukongtv/wkhelper/z;-><init>(Lcom/wukongtv/wkhelper/WKWebView;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/z;);
a=0;//     invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/WKWebView;->a:Landroid/webkit/WebView;
a=0;// 
a=0;//     new-instance v1, Lcom/wukongtv/wkhelper/aa;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/wukongtv/wkhelper/aa;);
a=0;//     invoke-direct {v1, p0}, Lcom/wukongtv/wkhelper/aa;-><init>(Lcom/wukongtv/wkhelper/WKWebView;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/aa;);
a=0;//     invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onPause()V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onPause()V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/WKWebView;->a:Landroid/webkit/WebView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/webkit/WebView;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/WKWebView;->a:Landroid/webkit/WebView;
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/webkit/WebView;->clearCache(Z)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/WKWebView;->a:Landroid/webkit/WebView;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/webkit/WebView;->clearFormData()V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/WKWebView;->a:Landroid/webkit/WebView;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/webkit/WebView;->clearHistory()V
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
