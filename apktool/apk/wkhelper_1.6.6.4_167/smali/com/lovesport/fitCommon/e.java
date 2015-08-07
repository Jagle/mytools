package com.lovesport.fitCommon; class e { void a() { int a;
a=0;// .class public final Lcom/lovesport/fitCommon/e;
a=0;// .super Landroid/os/AsyncTask;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/lovesport/fitCommon/a;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/lovesport/fitCommon/a;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/lovesport/fitCommon/e;->a:Lcom/lovesport/fitCommon/a;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/lovesport/fitCommon/e;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static varargs a([Ljava/lang/String;)Ljava/util/ArrayList;
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     aget-object v2, p0, v0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-instance v3, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-static {v2}, Lcom/lovesport/fitCommon/m;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     invoke-static {v2}, Lcom/lovesport/fitCommon/m;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     new-instance v2, Lorg/json/JSONArray;
a=0;// 
a=0;//     #v2=(UninitRef,Lorg/json/JSONArray;);
a=0;//     invoke-direct {v2, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Reference,Lorg/json/JSONArray;);
a=0;//     invoke-virtual {v2}, Lorg/json/JSONArray;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v0, v1, :cond_1
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     return-object v3
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     check-cast p1, [Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {p1}, Lcom/lovesport/fitCommon/e;->a([Ljava/lang/String;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected final synthetic onPostExecute(Ljava/lang/Object;)V
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     check-cast p1, Ljava/util/ArrayList;
a=0;// 
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_1
a=0;// 
a=0;//     iget-object v1, p0, Lcom/lovesport/fitCommon/e;->a:Lcom/lovesport/fitCommon/a;
a=0;// 
a=0;//     #v1=(Reference,Lcom/lovesport/fitCommon/a;);
a=0;//     invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcom/lovesport/fitCommon/a;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/e;->a:Lcom/lovesport/fitCommon/a;
a=0;// 
a=0;//     invoke-static {v0, p1}, Lcom/lovesport/fitCommon/a;->a(Lcom/lovesport/fitCommon/a;Ljava/util/List;)Ljava/util/List;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/e;->a:Lcom/lovesport/fitCommon/a;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/lovesport/fitCommon/a;->j(Lcom/lovesport/fitCommon/a;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/e;->a:Lcom/lovesport/fitCommon/a;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/lovesport/fitCommon/a;->j(Lcom/lovesport/fitCommon/a;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/16 v1, 0x125
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     const-wide/16 v2, 0x3a98
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/e;->a:Lcom/lovesport/fitCommon/a;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lovesport/fitCommon/a;);
a=0;//     invoke-static {v0}, Lcom/lovesport/fitCommon/a;->k(Lcom/lovesport/fitCommon/a;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Lcom/lovesport/fitCommon/h;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lovesport/fitCommon/h;);
a=0;//     iget-object v1, p0, Lcom/lovesport/fitCommon/e;->a:Lcom/lovesport/fitCommon/a;
a=0;// 
a=0;//     #v1=(Reference,Lcom/lovesport/fitCommon/a;);
a=0;//     invoke-direct {v0, v1}, Lcom/lovesport/fitCommon/h;-><init>(Lcom/lovesport/fitCommon/a;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lovesport/fitCommon/h;);
a=0;//     sget-object v1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcom/lovesport/fitCommon/e;->a:Lcom/lovesport/fitCommon/a;
a=0;// 
a=0;//     #v3=(Reference,Lcom/lovesport/fitCommon/a;);
a=0;//     invoke-static {v3}, Lcom/lovesport/fitCommon/a;->k(Lcom/lovesport/fitCommon/a;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     aput-object v3, v2, v4
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/lovesport/fitCommon/h;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
