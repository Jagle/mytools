package com.b.a.a; class o { void a() { int a;
a=0;// .class public Lcom/b/a/a/o;
a=0;// .super Lcom/b/a/a/ag;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     const-string v0, "UTF-8"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0}, Lcom/b/a/a/ag;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/b/a/a/o;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/lang/Throwable;)V
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "JsonHttpResponseHandler"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "onFailure(int, Header[], Throwable, JSONObject) was not overriden, but callback was received"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected final a([B)Ljava/lang/Object;
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/Object;);v1=(Reference,Ljava/lang/Object;);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Null);v2=(Uninit);
a=0;//     invoke-virtual {p0}, Lcom/b/a/a/o;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1, v0}, Lcom/b/a/a/o;->a([BLjava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, "\ufeff"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :cond_2
a=0;//     #v2=(Boolean);
a=0;//     const-string v2, "{"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_3
a=0;// 
a=0;//     const-string v2, "["
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     :cond_3
a=0;//     new-instance v1, Lorg/json/JSONTokener;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/json/JSONTokener;);
a=0;//     invoke-direct {v1, v0}, Lorg/json/JSONTokener;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lorg/json/JSONTokener;);
a=0;//     invoke-virtual {v1}, Lorg/json/JSONTokener;->nextValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :cond_4
a=0;//     #v2=(Conflicted);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public a(I[Lorg/apache/http/Header;Lorg/json/JSONObject;)V
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "JsonHttpResponseHandler"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "onSuccess(int, Header[], JSONObject) was not overriden, but callback was received"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final a(I[Lorg/apache/http/Header;[B)V
a=0;//     .locals 2
a=0;// 
a=0;//     const/16 v0, 0xcc
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     if-eq p1, v0, :cond_1
a=0;// 
a=0;//     new-instance v0, Lcom/b/a/a/p;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/b/a/a/p;);
a=0;//     invoke-direct {v0, p0, p3, p1, p2}, Lcom/b/a/a/p;-><init>(Lcom/b/a/a/o;[BI[Lorg/apache/http/Header;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/b/a/a/p;);
a=0;//     iget-boolean v1, p0, Lcom/b/a/a/h;->b:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     new-instance v1, Ljava/lang/Thread;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/Thread;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Thread;->start()V
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Boolean);
a=0;//     invoke-interface {v0}, Ljava/lang/Runnable;->run()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(PosShort);v1=(Uninit);
a=0;//     new-instance v0, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     invoke-virtual {p0, p1, p2, v0}, Lcom/b/a/a/o;->a(I[Lorg/apache/http/Header;Lorg/json/JSONObject;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final a(I[Lorg/apache/http/Header;[BLjava/lang/Throwable;)V
a=0;//     .locals 6
a=0;// 
a=0;//     if-eqz p3, :cond_1
a=0;// 
a=0;//     new-instance v0, Lcom/b/a/a/s;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/b/a/a/s;);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/b/a/a/o;);
a=0;//     move-object v2, p3
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     move v3, p1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move-object v4, p2
a=0;// 
a=0;//     #v4=(Reference,[Lorg/apache/http/Header;);
a=0;//     move-object v5, p4
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/b/a/a/s;-><init>(Lcom/b/a/a/o;[BI[Lorg/apache/http/Header;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/b/a/a/s;);
a=0;//     iget-boolean v1, p0, Lcom/b/a/a/h;->b:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     new-instance v1, Ljava/lang/Thread;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/Thread;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Thread;->start()V
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/b/a/a/s;);v1=(Boolean);v2=(Reference,[B);v3=(Integer);v4=(Reference,[Lorg/apache/http/Header;);v5=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-interface {v0}, Ljava/lang/Runnable;->run()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-static {p4}, Lcom/b/a/a/o;->a(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final a(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "JsonHttpResponseHandler"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "onSuccess(int, Header[], String) was not overriden, but callback was received"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final b(Ljava/lang/Throwable;)V
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "JsonHttpResponseHandler"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "onFailure(int, Header[], String, Throwable) was not overriden, but callback was received"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
