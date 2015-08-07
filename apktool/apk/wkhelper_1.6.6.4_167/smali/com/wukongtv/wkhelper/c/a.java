package com.wukongtv.wkhelper.c; class a { void a() { int a;
a=0;// .class public Lcom/wukongtv/wkhelper/c/a;
a=0;// .super Lcom/wukongtv/wkhelper/c/g;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final g:Ljava/lang/ThreadLocal;
a=0;// 
a=0;// .field private static volatile h:Lcom/wukongtv/wkhelper/c/a;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public a:Landroid/os/Handler;
a=0;// 
a=0;// .field private f:Landroid/content/Context;
a=0;// 
a=0;// .field private i:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/c/b;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/c/b;);
a=0;//     invoke-direct {v0}, Lcom/wukongtv/wkhelper/c/b;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/c/b;);
a=0;//     sput-object v0, Lcom/wukongtv/wkhelper/c/a;->g:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/wukongtv/wkhelper/c/g;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/c/a;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/wukongtv/wkhelper/c/a;->i:Z
a=0;// 
a=0;//     iput-object p1, p0, Lcom/wukongtv/wkhelper/c/a;->f:Landroid/content/Context;
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/c/x;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/c/x;);
a=0;//     invoke-direct {v0}, Lcom/wukongtv/wkhelper/c/x;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/c/x;);
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/c/g;->d:Lcom/wukongtv/wkhelper/c/j;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a()Lcom/wukongtv/wkhelper/c/a;
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lcom/wukongtv/wkhelper/c/a;->h:Lcom/wukongtv/wkhelper/c/a;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/c/a;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     sget-object v0, Lcom/wukongtv/wkhelper/c/a;->h:Lcom/wukongtv/wkhelper/c/a;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;)Lcom/wukongtv/wkhelper/c/a;
a=0;//     .locals 2
a=0;// 
a=0;//     sget-object v0, Lcom/wukongtv/wkhelper/c/a;->h:Lcom/wukongtv/wkhelper/c/a;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/c/a;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     const-class v1, Lcom/wukongtv/wkhelper/c/a;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/wukongtv/wkhelper/c/a;->h:Lcom/wukongtv/wkhelper/c/a;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/c/a;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/c/a;);
a=0;//     invoke-direct {v0, p0}, Lcom/wukongtv/wkhelper/c/a;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/c/a;);
a=0;//     sput-object v0, Lcom/wukongtv/wkhelper/c/a;->h:Lcom/wukongtv/wkhelper/c/a;
a=0;// 
a=0;//     :cond_0
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v0, Lcom/wukongtv/wkhelper/c/a;->h:Lcom/wukongtv/wkhelper/c/a;
a=0;// 
a=0;//     invoke-direct {v0}, Lcom/wukongtv/wkhelper/c/a;->d()Lcom/wukongtv/wkhelper/c/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/Class;);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method private b(Ljava/lang/String;)Lcom/wukongtv/wkhelper/b/f;
a=0;//     .locals 12
a=0;//     .annotation build Landroid/annotation/SuppressLint;
a=0;//         value = {
a=0;//             "InlinedApi"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     new-instance v6, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     :try_start_0
a=0;//     #v6=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v7, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v7=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v7, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v0, "p"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "n"
a=0;// 
a=0;//     invoke-virtual {v7, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :try_start_1
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "u"
a=0;// 
a=0;//     invoke-virtual {v7, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_5
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :try_start_2
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "v"
a=0;// 
a=0;//     invoke-virtual {v7, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_6
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :try_start_3
a=0;//     #v0=(Integer);
a=0;//     const-string v8, "is"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v8}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Lorg/json/JSONArray;->length()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     const/4 v9, 0x3
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     invoke-static {v8, v9}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     :goto_0
a=0;//     #v5=(Integer);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     if-ge v5, v8, :cond_0
a=0;// 
a=0;//     new-instance v9, Lcom/wukongtv/wkhelper/c/f;
a=0;// 
a=0;//     #v9=(UninitRef,Lcom/wukongtv/wkhelper/c/f;);
a=0;//     invoke-direct {v9}, Lcom/wukongtv/wkhelper/c/f;-><init>()V
a=0;// 
a=0;//     #v9=(Reference,Lcom/wukongtv/wkhelper/c/f;);
a=0;//     invoke-virtual {v7, v5}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v11, "m"
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v10, v11}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     invoke-static {v11}, Lcom/wukongtv/wkhelper/b/c;->a(I)Lcom/wukongtv/wkhelper/b/c;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,Lcom/wukongtv/wkhelper/b/c;);
a=0;//     iput-object v11, v9, Lcom/wukongtv/wkhelper/c/f;->b:Lcom/wukongtv/wkhelper/b/c;
a=0;// 
a=0;//     const-string v11, "i"
a=0;// 
a=0;//     invoke-virtual {v10, v11}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     invoke-static {v10, v11}, Landroid/content/Intent;->parseUri(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     iput-object v10, v9, Lcom/wukongtv/wkhelper/c/f;->a:Landroid/content/Intent;
a=0;// 
a=0;//     invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_7
a=0;// 
a=0;//     add-int/lit8 v5, v5, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Uninit);v2=(Uninit);v4=(Conflicted);v5=(Null);v7=(Conflicted);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move v0, v5
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move-object v1, v3
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);v1=(Reference,Ljava/lang/String;);v2=(Reference,Ljava/lang/String;);v5=(Integer);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     move-object v4, v3
a=0;// 
a=0;//     :cond_0
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     sget-object v0, Lcom/wukongtv/wkhelper/b/f;->d:Lcom/wukongtv/wkhelper/b/f;
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/b/f;);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);v2=(Reference,Ljava/lang/String;);v3=(Boolean);v5=(Integer);v6=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v3, p0, Lcom/wukongtv/wkhelper/c/a;->f:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v3, v4, v0}, Lcom/wukongtv/wkhelper/a/g;->a(Landroid/content/Context;Ljava/lang/String;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     sget-object v0, Lcom/wukongtv/wkhelper/b/f;->b:Lcom/wukongtv/wkhelper/b/f;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/b/f;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, "http://yaokong.wukongtv.com"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_8
a=0;// 
a=0;//     const-string v5, " "
a=0;// 
a=0;//     :goto_3
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/c/a;->f:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/d/a;->a(Landroid/content/Context;)Lcom/wukongtv/wkhelper/d/a;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v3, p0, Lcom/wukongtv/wkhelper/c/a;->a:Landroid/os/Handler;
a=0;// 
a=0;//     const-wide/16 v6, 0x14
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     invoke-virtual/range {v1 .. v7}, Lcom/wukongtv/wkhelper/d/a;->a(Ljava/lang/String;Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/String;
a=0;// 
a=0;//     sget-object v0, Lcom/wukongtv/wkhelper/b/f;->c:Lcom/wukongtv/wkhelper/b/f;
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v5=(Integer);v6=(Reference,Ljava/util/ArrayList;);v7=(Conflicted);
a=0;//     sget-object v0, Lcom/wukongtv/wkhelper/b/f;->e:Lcom/wukongtv/wkhelper/b/f;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/b/f;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Boolean);
a=0;//     invoke-direct {p0, v4}, Lcom/wukongtv/wkhelper/c/a;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :cond_5
a=0;//     :goto_4
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/wukongtv/wkhelper/c/f;
a=0;// 
a=0;//     sget-object v2, Lcom/wukongtv/wkhelper/c/c;->b:[I
a=0;// 
a=0;//     #v2=(Reference,[I);
a=0;//     iget-object v3, v0, Lcom/wukongtv/wkhelper/c/f;->b:Lcom/wukongtv/wkhelper/b/c;
a=0;// 
a=0;//     #v3=(Reference,Lcom/wukongtv/wkhelper/b/c;);
a=0;//     invoke-virtual {v3}, Lcom/wukongtv/wkhelper/b/c;->ordinal()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     aget v2, v2, v3
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     packed-switch v2, :pswitch_data_0
a=0;// 
a=0;//     :goto_5
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-virtual {v6}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     if-le v0, v2, :cond_5
a=0;// 
a=0;//     const-wide/16 v2, 0x64
a=0;// 
a=0;//     :try_start_4
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_1
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :catch_1
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/InterruptedException;);
a=0;//     goto :goto_4
a=0;// 
a=0;//     :pswitch_0
a=0;//     :try_start_5
a=0;//     #v2=(Integer);v3=(Integer);
a=0;//     sget v2, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     const/16 v3, 0xb
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-le v2, v3, :cond_6
a=0;// 
a=0;//     iget-object v2, v0, Lcom/wukongtv/wkhelper/c/f;->a:Landroid/content/Intent;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     const/16 v3, 0x20
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     :cond_6
a=0;//     #v2=(Conflicted);
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/c/a;->f:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     iget-object v0, v0, Lcom/wukongtv/wkhelper/c/f;->a:Landroid/content/Intent;
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V
a=0;//     :try_end_5
a=0;//     .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :catch_2
a=0;//     #v2=(Conflicted);v3=(Integer);
a=0;//     move-exception v0
a=0;// 
a=0;//     const-string v2, "SADIEYU"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "SEND_BROADCAST Exception"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :pswitch_1
a=0;//     #v2=(Integer);v3=(Integer);
a=0;//     iget-object v2, v0, Lcom/wukongtv/wkhelper/c/f;->a:Landroid/content/Intent;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     const/high16 v3, 0x10000000
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     :try_start_6
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/c/a;->f:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/wukongtv/wkhelper/c/f;->a:Landroid/content/Intent;
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;//     :try_end_6
a=0;//     .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :catch_3
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :pswitch_2
a=0;//     :try_start_7
a=0;//     #v2=(Integer);
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/c/a;->f:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     iget-object v0, v0, Lcom/wukongtv/wkhelper/c/f;->a:Landroid/content/Intent;
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
a=0;//     :try_end_7
a=0;//     .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_4
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :catch_4
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :cond_7
a=0;//     #v0=(Boolean);v3=(Conflicted);
a=0;//     sget-object v0, Lcom/wukongtv/wkhelper/b/f;->a:Lcom/wukongtv/wkhelper/b/f;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/b/f;);
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :catch_5
a=0;//     #v2=(Uninit);v3=(Null);v5=(Null);v7=(Reference,Lorg/json/JSONObject;);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     move v0, v5
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :catch_6
a=0;//     #v0=(Reference,Ljava/lang/String;);v2=(Reference,Ljava/lang/String;);
a=0;//     move-exception v0
a=0;// 
a=0;//     move v0, v5
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :catch_7
a=0;//     #v0=(Integer);v5=(Integer);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     move-exception v4
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_8
a=0;//     #v0=(Boolean);v3=(Reference,Landroid/content/Context;);v7=(Conflicted);
a=0;//     move-object v5, v1
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method private b(Lcom/wukongtv/wkhelper/c/q;)Lcom/wukongtv/wkhelper/c/s;
a=0;//     .locals 14
a=0;// 
a=0;//     const/4 v4, 0x3
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const/4 v6, 0x2
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     const v9, 0x813813
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-interface {p1}, Lcom/wukongtv/wkhelper/c/q;->b()Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/util/Map;);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/c/a;->f:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     const-string v0, "action"
a=0;// 
a=0;//     invoke-interface {v7, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/c/d;->a(Ljava/lang/String;)Lcom/wukongtv/wkhelper/c/d;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/c/d;);
a=0;//     const-string v0, "jsoncallback"
a=0;// 
a=0;//     invoke-interface {v7, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     sget-object v2, Lcom/wukongtv/wkhelper/c/c;->a:[I
a=0;// 
a=0;//     #v2=(Reference,[I);
a=0;//     invoke-virtual {v1}, Lcom/wukongtv/wkhelper/c/d;->ordinal()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     aget v1, v2, v1
a=0;// 
a=0;//     packed-switch v1, :pswitch_data_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/c/s;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     sget-object v1, Lcom/wukongtv/wkhelper/c/t;->k:Lcom/wukongtv/wkhelper/c/t;
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/c/t;);
a=0;//     const-string v2, "text/plain"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "Not Found"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v2, v3}, Lcom/wukongtv/wkhelper/c/s;-><init>(Lcom/wukongtv/wkhelper/c/t;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/c/s;);v6=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :pswitch_0
a=0;//     #v1=(Integer);v3=(Null);v4=(PosByte);v5=(One);v6=(PosByte);v7=(Reference,Ljava/util/Map;);v8=(Reference,Landroid/content/pm/PackageManager;);v9=(Integer);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);
a=0;//     invoke-virtual {v8, v3}, Landroid/content/pm/PackageManager;->getInstalledPackages(I)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v4}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     new-array v7, v1, [Lcom/wukongtv/wkhelper/c/e;
a=0;// 
a=0;//     move v2, v3
a=0;// 
a=0;//     :goto_2
a=0;//     #v2=(Integer);v10=(Conflicted);
a=0;//     invoke-interface {v4}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-ge v2, v1, :cond_1
a=0;// 
a=0;//     invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     new-instance v9, Lcom/wukongtv/wkhelper/c/e;
a=0;// 
a=0;//     #v9=(UninitRef,Lcom/wukongtv/wkhelper/c/e;);
a=0;//     invoke-direct {v9}, Lcom/wukongtv/wkhelper/c/e;-><init>()V
a=0;// 
a=0;//     #v9=(Reference,Lcom/wukongtv/wkhelper/c/e;);
a=0;//     aput-object v9, v7, v2
a=0;// 
a=0;//     aget-object v9, v7, v2
a=0;// 
a=0;//     #v9=(Null);
a=0;//     iget-object v10, v1, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     iput-object v10, v9, Lcom/wukongtv/wkhelper/c/e;->a:Ljava/lang/String;
a=0;// 
a=0;//     aget-object v9, v7, v2
a=0;// 
a=0;//     iget-object v10, v1, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     iget-object v10, v10, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v10, v9, Lcom/wukongtv/wkhelper/c/e;->b:Ljava/lang/String;
a=0;// 
a=0;//     aget-object v9, v7, v2
a=0;// 
a=0;//     iget-object v10, v1, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     invoke-virtual {v10, v8}, Landroid/content/pm/ApplicationInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-interface {v10}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     iput-object v10, v9, Lcom/wukongtv/wkhelper/c/e;->c:Ljava/lang/String;
a=0;// 
a=0;//     aget-object v9, v7, v2
a=0;// 
a=0;//     iget-object v10, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v10, v9, Lcom/wukongtv/wkhelper/c/e;->d:Ljava/lang/String;
a=0;// 
a=0;//     aget-object v9, v7, v2
a=0;// 
a=0;//     iget v1, v1, Landroid/content/pm/PackageInfo;->versionCode:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v9, Lcom/wukongtv/wkhelper/c/e;->e:I
a=0;// 
a=0;//     add-int/lit8 v1, v2, 0x1
a=0;// 
a=0;//     move v2, v1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_1
a=0;//     #v9=(Integer);v10=(Conflicted);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     invoke-static {v7}, Lcom/wukongtv/wkhelper/c/e;->a([Lcom/wukongtv/wkhelper/c/e;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_3
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     new-instance v1, Lcom/wukongtv/wkhelper/c/s;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     sget-object v2, Lcom/wukongtv/wkhelper/c/t;->a:Lcom/wukongtv/wkhelper/c/t;
a=0;// 
a=0;//     #v2=(Reference,Lcom/wukongtv/wkhelper/c/t;);
a=0;//     const-string v3, "application/x-javascript; charset=utf-8"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2, v3, v0}, Lcom/wukongtv/wkhelper/c/s;-><init>(Lcom/wukongtv/wkhelper/c/t;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Integer);v2=(Integer);v3=(Null);
a=0;//     const-string v1, "%s(%s)"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-array v2, v6, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     aput-object v0, v2, v3
a=0;// 
a=0;//     invoke-static {v7}, Lcom/wukongtv/wkhelper/c/e;->a([Lcom/wukongtv/wkhelper/c/e;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     aput-object v0, v2, v5
a=0;// 
a=0;//     invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :pswitch_1
a=0;//     #v1=(Integer);v4=(PosByte);v10=(Uninit);
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/c/a;->f:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const-string v2, "mySharedPreferences"
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "install_app"
a=0;// 
a=0;//     new-instance v4, Ljava/util/HashSet;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/HashSet;);
a=0;//     invoke-direct {v4}, Ljava/util/HashSet;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/HashSet;);
a=0;//     invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getStringSet(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     const-string v2, "android.intent.action.MAIN"
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-direct {v1, v2, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     const-string v2, "android.intent.category.LAUNCHER"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     invoke-virtual {v8, v1, v3}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v9}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     new-array v10, v1, [Lcom/wukongtv/wkhelper/c/e;
a=0;// 
a=0;//     #v10=(Reference,[Lcom/wukongtv/wkhelper/c/e;);
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/e/a;->a()Lcom/wukongtv/wkhelper/e/a;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,Lcom/wukongtv/wkhelper/e/a;);
a=0;//     move v2, v3
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move v4, v3
a=0;// 
a=0;//     :goto_4
a=0;//     #v2=(Boolean);v4=(Integer);v12=(Conflicted);v13=(Conflicted);
a=0;//     invoke-interface {v9}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-ge v4, v1, :cond_4
a=0;// 
a=0;//     invoke-interface {v9, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/content/pm/ResolveInfo;
a=0;// 
a=0;//     new-instance v12, Lcom/wukongtv/wkhelper/c/e;
a=0;// 
a=0;//     #v12=(UninitRef,Lcom/wukongtv/wkhelper/c/e;);
a=0;//     invoke-direct {v12}, Lcom/wukongtv/wkhelper/c/e;-><init>()V
a=0;// 
a=0;//     #v12=(Reference,Lcom/wukongtv/wkhelper/c/e;);
a=0;//     aput-object v12, v10, v4
a=0;// 
a=0;//     aget-object v12, v10, v4
a=0;// 
a=0;//     #v12=(Null);
a=0;//     iget-object v13, v1, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;
a=0;// 
a=0;//     #v13=(Reference,Landroid/content/pm/ActivityInfo;);
a=0;//     iget-object v13, v13, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     iget-object v13, v13, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v13, v12, Lcom/wukongtv/wkhelper/c/e;->a:Ljava/lang/String;
a=0;// 
a=0;//     aget-object v12, v10, v4
a=0;// 
a=0;//     iget-object v13, v1, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;
a=0;// 
a=0;//     iget-object v13, v13, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     iget-object v13, v13, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v13, v12, Lcom/wukongtv/wkhelper/c/e;->b:Ljava/lang/String;
a=0;// 
a=0;//     aget-object v12, v10, v4
a=0;// 
a=0;//     invoke-virtual {v1, v8}, Landroid/content/pm/ResolveInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-interface {v13}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     iput-object v13, v12, Lcom/wukongtv/wkhelper/c/e;->c:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v1, v1, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;
a=0;// 
a=0;//     iget-object v1, v1, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v7, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     aget-object v1, v10, v4
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-boolean v5, v1, Lcom/wukongtv/wkhelper/c/e;->f:Z
a=0;// 
a=0;//     :cond_3
a=0;//     :try_start_0
a=0;//     #v1=(Boolean);
a=0;//     aget-object v1, v10, v4
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget-object v1, v1, Lcom/wukongtv/wkhelper/c/e;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     invoke-virtual {v8, v1, v12}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     aget-object v12, v10, v4
a=0;// 
a=0;//     iget-object v13, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v13, v12, Lcom/wukongtv/wkhelper/c/e;->d:Ljava/lang/String;
a=0;// 
a=0;//     aget-object v12, v10, v4
a=0;// 
a=0;//     iget v1, v1, Landroid/content/pm/PackageInfo;->versionCode:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v12, Lcom/wukongtv/wkhelper/c/e;->e:I
a=0;//     :try_end_0
a=0;//     .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_5
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     aget-object v1, v10, v4
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget-object v1, v1, Lcom/wukongtv/wkhelper/c/e;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v11, v1}, Lcom/wukongtv/wkhelper/e/a;->a(Ljava/lang/String;)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Long;->longValue()J
a=0;// 
a=0;//     move-result-wide v12
a=0;// 
a=0;//     #v12=(LongLo);v13=(LongHi);
a=0;//     aget-object v1, v10, v4
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget-object v1, v1, Lcom/wukongtv/wkhelper/c/e;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v11, v1}, Lcom/wukongtv/wkhelper/e/a;->b(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_45
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "need refresh :"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     aget-object v2, v10, v4
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iget-object v2, v2, Lcom/wukongtv/wkhelper/c/e;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move v1, v5
a=0;// 
a=0;//     :goto_6
a=0;//     #v1=(Boolean);v2=(Conflicted);
a=0;//     aget-object v2, v10, v4
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iput-wide v12, v2, Lcom/wukongtv/wkhelper/c/e;->g:J
a=0;// 
a=0;//     add-int/lit8 v2, v4, 0x1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move v4, v2
a=0;// 
a=0;//     move v2, v1
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v12=(Null);v13=(Reference,Ljava/lang/String;);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     aget-object v1, v10, v4
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const-string v12, "1.0.0"
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     iput-object v12, v1, Lcom/wukongtv/wkhelper/c/e;->d:Ljava/lang/String;
a=0;// 
a=0;//     aget-object v1, v10, v4
a=0;// 
a=0;//     iput v3, v1, Lcom/wukongtv/wkhelper/c/e;->e:I
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :cond_4
a=0;//     #v1=(Integer);v12=(Conflicted);v13=(Conflicted);
a=0;//     if-eqz v2, :cond_5
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/c/a;->a:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/c/a;->a:Landroid/os/Handler;
a=0;// 
a=0;//     const v2, 0x813826
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/c/a;->a:Landroid/os/Handler;
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v2, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     :cond_5
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     if-nez v0, :cond_6
a=0;// 
a=0;//     invoke-static {v10}, Lcom/wukongtv/wkhelper/c/e;->a([Lcom/wukongtv/wkhelper/c/e;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_7
a=0;//     new-instance v1, Lcom/wukongtv/wkhelper/c/s;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     sget-object v2, Lcom/wukongtv/wkhelper/c/t;->a:Lcom/wukongtv/wkhelper/c/t;
a=0;// 
a=0;//     #v2=(Reference,Lcom/wukongtv/wkhelper/c/t;);
a=0;//     const-string v3, "application/x-javascript; charset=utf-8"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2, v3, v0}, Lcom/wukongtv/wkhelper/c/s;-><init>(Lcom/wukongtv/wkhelper/c/t;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_6
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Null);
a=0;//     const-string v1, "%s(%s)"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-array v2, v6, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     aput-object v0, v2, v3
a=0;// 
a=0;//     invoke-static {v10}, Lcom/wukongtv/wkhelper/c/e;->a([Lcom/wukongtv/wkhelper/c/e;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     aput-object v0, v2, v5
a=0;// 
a=0;//     invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_7
a=0;// 
a=0;//     :pswitch_2
a=0;//     #v1=(Integer);v4=(PosByte);v9=(Integer);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);
a=0;//     const-string v0, "pkg"
a=0;// 
a=0;//     invoke-interface {v7, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     :try_start_1
a=0;//     invoke-virtual {v8, v0}, Landroid/content/pm/PackageManager;->getApplicationIcon(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/graphics/drawable/BitmapDrawable;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Bitmap;);
a=0;//     sget-object v0, Lcom/wukongtv/wkhelper/c/a;->g:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->reset()V
a=0;// 
a=0;//     sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;
a=0;// 
a=0;//     const/16 v3, 0x5a
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     sget-object v0, Lcom/wukongtv/wkhelper/c/a;->g:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/io/OutputStream;
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
a=0;// 
a=0;//     new-instance v1, Ljava/io/ByteArrayInputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/ByteArrayInputStream;);
a=0;//     sget-object v0, Lcom/wukongtv/wkhelper/c/a;->g:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v1, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/ByteArrayInputStream;);
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/c/s;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     sget-object v2, Lcom/wukongtv/wkhelper/c/t;->a:Lcom/wukongtv/wkhelper/c/t;
a=0;// 
a=0;//     const-string v3, "image/png"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v2, v3, v1}, Lcom/wukongtv/wkhelper/c/s;-><init>(Lcom/wukongtv/wkhelper/c/t;Ljava/lang/String;Ljava/io/InputStream;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     const-string v1, "Cache-Control"
a=0;// 
a=0;//     const-string v2, "public, max-age=3153600"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/wukongtv/wkhelper/c/s;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     :try_end_1
a=0;//     .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :pswitch_3
a=0;//     #v1=(Integer);v3=(Null);
a=0;//     const-string v0, "pkg"
a=0;// 
a=0;//     invoke-interface {v7, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :try_start_2
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v8, v0, v1}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
a=0;//     :try_end_2
a=0;//     .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_2 .. :try_end_2} :catch_2
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_8
a=0;//     #v1=(Reference,Landroid/content/pm/ApplicationInfo;);
a=0;//     if-eqz v1, :cond_8
a=0;// 
a=0;//     invoke-virtual {v8, v1}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_9
a=0;//     check-cast v1, Ljava/lang/String;
a=0;// 
a=0;//     check-cast v1, Ljava/lang/String;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/c/a;->f:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v2, v0}, Lcom/wukongtv/wkhelper/a/k;->a(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/c/a;->a:Landroid/os/Handler;
a=0;// 
a=0;//     if-eqz v2, :cond_7
a=0;// 
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/c/a;->a:Landroid/os/Handler;
a=0;// 
a=0;//     const v4, 0x8138131
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v2, v9, v4, v3, v1}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/c/a;->a:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/c/a;->a:Landroid/os/Handler;
a=0;// 
a=0;//     const v2, 0x813839
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2, v3, v3, v0}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/c/a;->a:Landroid/os/Handler;
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v2, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     :cond_7
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/c/a;->f:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/wukongtv/wkhelper/a/j;->a(Ljava/lang/String;Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/c/s;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     sget-object v1, Lcom/wukongtv/wkhelper/c/t;->a:Lcom/wukongtv/wkhelper/c/t;
a=0;// 
a=0;//     const-string v2, "application/x-javascript; charset=utf-8"
a=0;// 
a=0;//     const-string v3, "success"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v2, v3}, Lcom/wukongtv/wkhelper/c/s;-><init>(Lcom/wukongtv/wkhelper/c/t;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :catch_2
a=0;//     #v1=(Null);v3=(Null);v4=(PosByte);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_8
a=0;// 
a=0;//     :cond_8
a=0;//     #v1=(Reference,Landroid/content/pm/ApplicationInfo;);
a=0;//     const-string v1, "(unknown)"
a=0;// 
a=0;//     goto :goto_9
a=0;// 
a=0;//     :pswitch_4
a=0;//     #v1=(Integer);
a=0;//     const-string v0, "pkg"
a=0;// 
a=0;//     invoke-interface {v7, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     const-string v1, "isclean"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v7, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_9
a=0;// 
a=0;//     const-string v1, "false"
a=0;// 
a=0;//     :cond_9
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-nez v2, :cond_a
a=0;// 
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/c/a;->f:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     const-string v4, "action_preference"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V
a=0;// 
a=0;//     :cond_a
a=0;//     #v2=(Conflicted);v4=(Conflicted);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/c/a;->f:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0, v1}, Lcom/wukongtv/wkhelper/a/j;->b(Ljava/lang/String;Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-nez v1, :cond_c
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "pm uninstall "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/wukongtv/a/d;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {}, Lcom/wukongtv/a/d;->b()V
a=0;// 
a=0;//     invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_c
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "success"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_c
a=0;// 
a=0;//     :goto_a
a=0;//     #v1=(Conflicted);v2=(Conflicted);v5=(Boolean);
a=0;//     if-eqz v5, :cond_d
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/c/a;->a:Landroid/os/Handler;
a=0;// 
a=0;//     if-eqz v0, :cond_b
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/c/a;->a:Landroid/os/Handler;
a=0;// 
a=0;//     const v1, 0x8138133
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/c/a;->f:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const v4, 0x7f07008f
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v9, v1, v3, v2}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/c/a;->a:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     :cond_b
a=0;//     #v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/c/s;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     sget-object v1, Lcom/wukongtv/wkhelper/c/t;->a:Lcom/wukongtv/wkhelper/c/t;
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/c/t;);
a=0;//     const-string v2, "application/x-javascript; charset=utf-8"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     sget-object v3, Lcom/wukongtv/wkhelper/b/h;->c:Lcom/wukongtv/wkhelper/b/h;
a=0;// 
a=0;//     #v3=(Reference,Lcom/wukongtv/wkhelper/b/h;);
a=0;//     invoke-virtual {v3}, Lcom/wukongtv/wkhelper/b/h;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v0, v1, v2, v3}, Lcom/wukongtv/wkhelper/c/s;-><init>(Lcom/wukongtv/wkhelper/c/t;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_c
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Null);v5=(One);
a=0;//     move v5, v3
a=0;// 
a=0;//     #v5=(Null);
a=0;//     goto :goto_a
a=0;// 
a=0;//     :cond_d
a=0;//     #v5=(Boolean);
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/c/a;->f:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0, v1}, Lcom/wukongtv/wkhelper/a/j;->c(Ljava/lang/String;Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/c/a;->a:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     if-eqz v0, :cond_e
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/c/a;->a:Landroid/os/Handler;
a=0;// 
a=0;//     const v1, 0x8138132
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/c/a;->f:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const v4, 0x7f07008d
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v9, v1, v3, v2}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/c/a;->a:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     :cond_e
a=0;//     #v2=(Conflicted);v4=(Conflicted);
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/c/s;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     sget-object v1, Lcom/wukongtv/wkhelper/c/t;->a:Lcom/wukongtv/wkhelper/c/t;
a=0;// 
a=0;//     const-string v2, "application/x-javascript; charset=utf-8"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     sget-object v3, Lcom/wukongtv/wkhelper/b/h;->d:Lcom/wukongtv/wkhelper/b/h;
a=0;// 
a=0;//     #v3=(Reference,Lcom/wukongtv/wkhelper/b/h;);
a=0;//     invoke-virtual {v3}, Lcom/wukongtv/wkhelper/b/h;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v0, v1, v2, v3}, Lcom/wukongtv/wkhelper/c/s;-><init>(Lcom/wukongtv/wkhelper/c/t;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :pswitch_5
a=0;//     #v1=(Integer);v3=(Null);v4=(PosByte);v5=(One);
a=0;//     const-string v0, "vol"
a=0;// 
a=0;//     invoke-interface {v7, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/c/a;->f:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const-string v2, "audio"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Landroid/media/AudioManager;
a=0;// 
a=0;//     if-eqz v0, :cond_f
a=0;// 
a=0;//     :try_start_3
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-virtual {v1, v2, v0, v3}, Landroid/media/AudioManager;->setStreamVolume(III)V
a=0;// 
a=0;//     :cond_f
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Boolean);
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/c/s;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     sget-object v2, Lcom/wukongtv/wkhelper/c/t;->a:Lcom/wukongtv/wkhelper/c/t;
a=0;// 
a=0;//     #v2=(Reference,Lcom/wukongtv/wkhelper/c/t;);
a=0;//     const-string v3, "text/json; charset=utf-8"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "%d,%d"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     new-array v5, v5, [Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v7, 0x3
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     invoke-virtual {v1, v7}, Landroid/media/AudioManager;->getStreamVolume(I)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v7, v5, v6
a=0;// 
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     const/4 v7, 0x3
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     invoke-virtual {v1, v7}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v1, v5, v6
a=0;// 
a=0;//     invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v2, v3, v1}, Lcom/wukongtv/wkhelper/c/s;-><init>(Lcom/wukongtv/wkhelper/c/t;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :catch_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(PosByte);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :pswitch_6
a=0;//     #v1=(Integer);v2=(Reference,[I);v3=(Null);v4=(PosByte);v5=(One);v7=(Reference,Ljava/util/Map;);
a=0;//     const-string v0, "qihu"
a=0;// 
a=0;//     invoke-interface {v7, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     const-string v1, "true"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_13
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/c/a;->f:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const-string v1, "com.qihoo.tvsafe"
a=0;// 
a=0;//     invoke-static {v0, v1, v4}, Lcom/wukongtv/wkhelper/a/g;->b(Landroid/content/Context;Ljava/lang/String;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_12
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/c/a;->f:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const-string v1, "IS_QIHU_DOWNLOADED_BEFORE"
a=0;// 
a=0;//     const-string v2, "action_preference"
a=0;// 
a=0;//     invoke-virtual {v0, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_11
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/c/a;->a:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     if-eqz v0, :cond_11
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/c/a;->a:Landroid/os/Handler;
a=0;// 
a=0;//     const v1, 0x813835
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/c/a;->f:Landroid/content/Context;
a=0;// 
a=0;//     const-string v1, "IS_QIHU_DOWNLOADED_BEFORE"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "action_preference"
a=0;// 
a=0;//     invoke-virtual {v0, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0, v1, v5}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
a=0;// 
a=0;//     :cond_10
a=0;//     :goto_b
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/c/s;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     sget-object v1, Lcom/wukongtv/wkhelper/c/t;->a:Lcom/wukongtv/wkhelper/c/t;
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/c/t;);
a=0;//     const-string v2, "text/json; charset=utf-8"
a=0;// 
a=0;//     const-string v3, "success"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v2, v3}, Lcom/wukongtv/wkhelper/c/s;-><init>(Lcom/wukongtv/wkhelper/c/t;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_11
a=0;//     #v0=(Conflicted);v3=(Null);
a=0;//     invoke-direct {p0}, Lcom/wukongtv/wkhelper/c/a;->e()V
a=0;// 
a=0;//     goto :goto_b
a=0;// 
a=0;//     :cond_12
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/c/a;->a:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     if-eqz v0, :cond_10
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/c/a;->a:Landroid/os/Handler;
a=0;// 
a=0;//     const v1, 0x813836
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     goto :goto_b
a=0;// 
a=0;//     :cond_13
a=0;//     #v0=(Boolean);v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0}, Lcom/wukongtv/wkhelper/c/a;->e()V
a=0;// 
a=0;//     goto :goto_b
a=0;// 
a=0;//     :pswitch_7
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Integer);
a=0;//     const-string v0, "pkg"
a=0;// 
a=0;//     invoke-interface {v7, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v4, Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "url"
a=0;// 
a=0;//     invoke-interface {v7, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     const-string v1, "appname"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v7, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Ljava/lang/String;
a=0;// 
a=0;//     const-string v2, "0"
a=0;// 
a=0;//     const-string v3, "appsize"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v7, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_44
a=0;// 
a=0;//     const-string v2, "appsize"
a=0;// 
a=0;//     invoke-interface {v7, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Ljava/lang/String;
a=0;// 
a=0;//     move-object v3, v2
a=0;// 
a=0;//     :goto_c
a=0;//     :try_start_4
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "UTF-8"
a=0;// 
a=0;//     invoke-static {v0, v2}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_4
a=0;//     .catch Ljava/io/UnsupportedEncodingException; {:try_start_4 .. :try_end_4} :catch_4
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :try_start_5
a=0;//     invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_14
a=0;// 
a=0;//     const-string v0, "UTF-8"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v0}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_5
a=0;//     .catch Ljava/io/UnsupportedEncodingException; {:try_start_5 .. :try_end_5} :catch_16
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :cond_14
a=0;//     #v0=(Conflicted);
a=0;//     move-object v5, v1
a=0;// 
a=0;//     :goto_d
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     :try_start_6
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/Long;->longValue()J
a=0;//     :try_end_6
a=0;//     .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_15
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     :goto_e
a=0;//     const-wide/16 v6, 0x32
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     add-long/2addr v6, v0
a=0;// 
a=0;//     const-string v0, "http://yaokong.wukongtv.com"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_15
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/c/a;->f:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/d/a;->a(Landroid/content/Context;)Lcom/wukongtv/wkhelper/d/a;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/d/a;);
a=0;//     iget-object v3, p0, Lcom/wukongtv/wkhelper/c/a;->a:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual/range {v1 .. v7}, Lcom/wukongtv/wkhelper/d/a;->a(Ljava/lang/String;Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_f
a=0;//     #v1=(Conflicted);
a=0;//     new-instance v1, Lcom/wukongtv/wkhelper/c/s;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     sget-object v2, Lcom/wukongtv/wkhelper/c/t;->a:Lcom/wukongtv/wkhelper/c/t;
a=0;// 
a=0;//     const-string v3, "text/json; charset=utf-8"
a=0;// 
a=0;//     invoke-direct {v1, v2, v3, v0}, Lcom/wukongtv/wkhelper/c/s;-><init>(Lcom/wukongtv/wkhelper/c/t;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :catch_4
a=0;//     #v5=(One);v6=(PosByte);v7=(Reference,Ljava/util/Map;);
a=0;//     move-exception v2
a=0;// 
a=0;//     move-object v2, v0
a=0;// 
a=0;//     :goto_10
a=0;//     move-object v5, v1
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_d
a=0;// 
a=0;//     :cond_15
a=0;//     #v0=(Boolean);v1=(LongHi);v6=(LongLo);v7=(LongHi);
a=0;//     const-string v0, "illegal url"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_f
a=0;// 
a=0;//     :pswitch_8
a=0;//     #v1=(Integer);v3=(Null);v4=(PosByte);v5=(One);v6=(PosByte);v7=(Reference,Ljava/util/Map;);
a=0;//     const-string v0, "url"
a=0;// 
a=0;//     invoke-interface {v7, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     :try_start_7
a=0;//     const-string v1, "UTF-8"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_7
a=0;//     .catch Ljava/io/UnsupportedEncodingException; {:try_start_7 .. :try_end_7} :catch_14
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_11
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     const-string v2, "com.elinkway.tvlive2.playUrl"
a=0;// 
a=0;//     invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     new-instance v2, Landroid/content/ComponentName;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/content/ComponentName;);
a=0;//     const-string v3, "com.elinkway.tvlive2"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "com.elinkway.tvlive2.service.IntentService"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3, v4}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/ComponentName;);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;
a=0;// 
a=0;//     const-string v2, "channel_url"
a=0;// 
a=0;//     invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/c/a;->f:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/wukongtv/wkhelper/a/g;->a(Landroid/content/Context;Landroid/content/Intent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_16
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/c/s;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     sget-object v1, Lcom/wukongtv/wkhelper/c/t;->a:Lcom/wukongtv/wkhelper/c/t;
a=0;// 
a=0;//     const-string v2, "text/json; charset=utf-8"
a=0;// 
a=0;//     sget-object v3, Lcom/wukongtv/wkhelper/b/d;->b:Lcom/wukongtv/wkhelper/b/d;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/wukongtv/wkhelper/b/d;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v0, v1, v2, v3}, Lcom/wukongtv/wkhelper/c/s;-><init>(Lcom/wukongtv/wkhelper/c/t;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_16
a=0;//     :try_start_8
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/c/a;->f:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
a=0;//     :try_end_8
a=0;//     .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_13
a=0;// 
a=0;//     :goto_12
a=0;//     const-string v0, "com.elinkway.tvlive2"
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcom/wukongtv/wkhelper/c/a;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/c/s;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     sget-object v1, Lcom/wukongtv/wkhelper/c/t;->a:Lcom/wukongtv/wkhelper/c/t;
a=0;// 
a=0;//     const-string v2, "text/json; charset=utf-8"
a=0;// 
a=0;//     sget-object v3, Lcom/wukongtv/wkhelper/b/d;->a:Lcom/wukongtv/wkhelper/b/d;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/wukongtv/wkhelper/b/d;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v0, v1, v2, v3}, Lcom/wukongtv/wkhelper/c/s;-><init>(Lcom/wukongtv/wkhelper/c/t;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :pswitch_9
a=0;//     #v1=(Integer);v3=(Null);v4=(PosByte);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/c/a;->f:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/c/a;->f:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/wukongtv/wkhelper/a/g;->b(Landroid/content/Context;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/c/s;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     sget-object v2, Lcom/wukongtv/wkhelper/c/t;->a:Lcom/wukongtv/wkhelper/c/t;
a=0;// 
a=0;//     const-string v3, "text/json; charset=utf-8"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v2, v3, v1}, Lcom/wukongtv/wkhelper/c/s;-><init>(Lcom/wukongtv/wkhelper/c/t;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :pswitch_a
a=0;//     #v1=(Integer);v3=(Null);
a=0;//     const-string v0, "timer"
a=0;// 
a=0;//     invoke-interface {v7, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/c/a;->a:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     if-eqz v1, :cond_17
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/c/a;->a:Landroid/os/Handler;
a=0;// 
a=0;//     const v2, 0x813817
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :try_start_9
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;//     :try_end_9
a=0;//     .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_5
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_13
a=0;//     #v0=(Integer);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-eq v0, v2, :cond_17
a=0;// 
a=0;//     iput v0, v1, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/c/a;->a:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     :cond_17
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/c/s;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     sget-object v1, Lcom/wukongtv/wkhelper/c/t;->a:Lcom/wukongtv/wkhelper/c/t;
a=0;// 
a=0;//     const-string v2, "text/json; charset=utf-8"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "success"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v2, v3}, Lcom/wukongtv/wkhelper/c/s;-><init>(Lcom/wukongtv/wkhelper/c/t;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :catch_5
a=0;//     #v2=(Integer);v3=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_13
a=0;// 
a=0;//     :pswitch_b
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Integer);v2=(Reference,[I);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/c/a;->a:Landroid/os/Handler;
a=0;// 
a=0;//     if-eqz v0, :cond_18
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/c/a;->a:Landroid/os/Handler;
a=0;// 
a=0;//     const v1, 0x813818
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/c/a;->a:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     :cond_18
a=0;//     #v1=(Conflicted);
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/c/s;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     sget-object v1, Lcom/wukongtv/wkhelper/c/t;->a:Lcom/wukongtv/wkhelper/c/t;
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/c/t;);
a=0;//     const-string v2, "text/json; charset=utf-8"
a=0;// 
a=0;//     const-string v3, "success"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v2, v3}, Lcom/wukongtv/wkhelper/c/s;-><init>(Lcom/wukongtv/wkhelper/c/t;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :pswitch_c
a=0;//     #v1=(Integer);v3=(Null);
a=0;//     const-string v0, "vid"
a=0;// 
a=0;//     invoke-interface {v7, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     const-string v1, "vtype"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v7, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Ljava/lang/String;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/c/a;->f:Landroid/content/Context;
a=0;// 
a=0;//     const-string v3, "com.luxtone.tuzi3"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3}, Lcom/wukongtv/wkhelper/a/g;->a(Landroid/content/Context;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1c
a=0;// 
a=0;//     invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Message;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_19
a=0;// 
a=0;//     invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-eqz v3, :cond_1a
a=0;// 
a=0;//     :cond_19
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/c/s;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     sget-object v1, Lcom/wukongtv/wkhelper/c/t;->a:Lcom/wukongtv/wkhelper/c/t;
a=0;// 
a=0;//     const-string v2, "text/json; charset=utf-8"
a=0;// 
a=0;//     sget-object v3, Lcom/wukongtv/wkhelper/b/g;->c:Lcom/wukongtv/wkhelper/b/g;
a=0;// 
a=0;//     #v3=(Reference,Lcom/wukongtv/wkhelper/b/g;);
a=0;//     invoke-virtual {v3}, Lcom/wukongtv/wkhelper/b/g;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v0, v1, v2, v3}, Lcom/wukongtv/wkhelper/c/s;-><init>(Lcom/wukongtv/wkhelper/c/t;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_1a
a=0;//     #v3=(Boolean);
a=0;//     iget-object v3, p0, Lcom/wukongtv/wkhelper/c/a;->a:Landroid/os/Handler;
a=0;// 
a=0;//     #v3=(Reference,Landroid/os/Handler;);
a=0;//     const v4, 0x813821
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     iput-object v0, v2, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     :try_start_a
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, v2, Landroid/os/Message;->arg2:I
a=0;//     :try_end_a
a=0;//     .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_12
a=0;// 
a=0;//     :goto_14
a=0;//     #v0=(Conflicted);
a=0;//     const v0, 0x813820
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, v2, Landroid/os/Message;->what:I
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/c/a;->a:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     const-wide/16 v4, 0x3e8
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-virtual {v0, v2, v4, v5}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/c/a;->a:Landroid/os/Handler;
a=0;// 
a=0;//     if-eqz v0, :cond_1b
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/c/a;->a:Landroid/os/Handler;
a=0;// 
a=0;//     const-string v1, "\u5154\u5b50\u89c6\u9891"
a=0;// 
a=0;//     invoke-virtual {v0, v9, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/c/a;->a:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     :cond_1b
a=0;//     const-string v0, "com.luxtone.tuzi3"
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcom/wukongtv/wkhelper/c/a;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/c/s;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     sget-object v1, Lcom/wukongtv/wkhelper/c/t;->a:Lcom/wukongtv/wkhelper/c/t;
a=0;// 
a=0;//     const-string v2, "text/json; charset=utf-8"
a=0;// 
a=0;//     sget-object v3, Lcom/wukongtv/wkhelper/b/g;->a:Lcom/wukongtv/wkhelper/b/g;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/wukongtv/wkhelper/b/g;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v0, v1, v2, v3}, Lcom/wukongtv/wkhelper/c/s;-><init>(Lcom/wukongtv/wkhelper/c/t;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_1c
a=0;//     #v2=(Boolean);v4=(PosByte);v5=(One);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/c/a;->a:Landroid/os/Handler;
a=0;// 
a=0;//     const v1, 0x813819
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/c/s;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     sget-object v1, Lcom/wukongtv/wkhelper/c/t;->a:Lcom/wukongtv/wkhelper/c/t;
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/c/t;);
a=0;//     const-string v2, "text/json; charset=utf-8"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     sget-object v3, Lcom/wukongtv/wkhelper/b/g;->b:Lcom/wukongtv/wkhelper/b/g;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/wukongtv/wkhelper/b/g;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v0, v1, v2, v3}, Lcom/wukongtv/wkhelper/c/s;-><init>(Lcom/wukongtv/wkhelper/c/t;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :pswitch_d
a=0;//     #v1=(Integer);v3=(Null);
a=0;//     const-string v0, "linkData"
a=0;// 
a=0;//     invoke-interface {v7, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     const-string v1, "sid"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v7, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Ljava/lang/String;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/c/a;->f:Landroid/content/Context;
a=0;// 
a=0;//     const-string v3, "com.moretv.android"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3}, Lcom/wukongtv/wkhelper/a/g;->a(Landroid/content/Context;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1f
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-nez v2, :cond_1d
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-eqz v2, :cond_1e
a=0;// 
a=0;//     :cond_1d
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/c/s;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     sget-object v1, Lcom/wukongtv/wkhelper/c/t;->a:Lcom/wukongtv/wkhelper/c/t;
a=0;// 
a=0;//     const-string v2, "text/json; charset=utf-8"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     sget-object v3, Lcom/wukongtv/wkhelper/b/g;->c:Lcom/wukongtv/wkhelper/b/g;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/wukongtv/wkhelper/b/g;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v0, v1, v2, v3}, Lcom/wukongtv/wkhelper/c/s;-><init>(Lcom/wukongtv/wkhelper/c/t;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_1e
a=0;//     #v2=(Boolean);
a=0;//     invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Message;);
a=0;//     new-instance v3, Landroid/os/Bundle;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v3}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Landroid/os/Bundle;);
a=0;//     const v4, 0x813828
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iput v4, v2, Landroid/os/Message;->what:I
a=0;// 
a=0;//     const-string v4, "linkData"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "sid"
a=0;// 
a=0;//     invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/c/a;->a:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     const-string v0, "com.moretv.android"
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcom/wukongtv/wkhelper/c/a;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_1f
a=0;//     #v2=(Boolean);v4=(PosByte);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/c/a;->a:Landroid/os/Handler;
a=0;// 
a=0;//     const v1, 0x813827
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/c/s;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     sget-object v1, Lcom/wukongtv/wkhelper/c/t;->a:Lcom/wukongtv/wkhelper/c/t;
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/c/t;);
a=0;//     const-string v2, "text/json; charset=utf-8"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     sget-object v3, Lcom/wukongtv/wkhelper/b/g;->b:Lcom/wukongtv/wkhelper/b/g;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/wukongtv/wkhelper/b/g;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v0, v1, v2, v3}, Lcom/wukongtv/wkhelper/c/s;-><init>(Lcom/wukongtv/wkhelper/c/t;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :pswitch_e
a=0;//     #v1=(Integer);v3=(Null);
a=0;//     const-string v0, "requestType"
a=0;// 
a=0;//     invoke-interface {v7, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     const-string v1, "videoId"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v7, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Ljava/lang/String;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/c/a;->f:Landroid/content/Context;
a=0;// 
a=0;//     const-string v4, "net.myvst.v2"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v4}, Lcom/wukongtv/wkhelper/a/g;->a(Landroid/content/Context;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_26
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-nez v2, :cond_20
a=0;// 
a=0;//     invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-eqz v2, :cond_21
a=0;// 
a=0;//     :cond_20
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/c/s;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     sget-object v1, Lcom/wukongtv/wkhelper/c/t;->a:Lcom/wukongtv/wkhelper/c/t;
a=0;// 
a=0;//     const-string v2, "text/json; charset=utf-8"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     sget-object v3, Lcom/wukongtv/wkhelper/b/g;->c:Lcom/wukongtv/wkhelper/b/g;
a=0;// 
a=0;//     #v3=(Reference,Lcom/wukongtv/wkhelper/b/g;);
a=0;//     invoke-virtual {v3}, Lcom/wukongtv/wkhelper/b/g;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v0, v1, v2, v3}, Lcom/wukongtv/wkhelper/c/s;-><init>(Lcom/wukongtv/wkhelper/c/t;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_21
a=0;//     #v2=(Boolean);v3=(Null);
a=0;//     invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Message;);
a=0;//     new-instance v4, Landroid/os/Bundle;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v4}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Landroid/os/Bundle;);
a=0;//     const v8, 0x813825
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     iput v8, v2, Landroid/os/Message;->what:I
a=0;// 
a=0;//     const-string v8, "requestType"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v8, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v8, "videoId"
a=0;// 
a=0;//     invoke-virtual {v4, v8, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v1, "dataurl"
a=0;// 
a=0;//     invoke-interface {v7, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_24
a=0;// 
a=0;//     const-string v1, "dataurl"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "dataurl"
a=0;// 
a=0;//     invoke-interface {v7, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v4, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     :goto_15
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Byte);v5=(Conflicted);v8=(Conflicted);
a=0;//     const-string v0, "pkg"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "net.myvst.v2"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "setnum"
a=0;// 
a=0;//     invoke-interface {v7, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_22
a=0;// 
a=0;//     const-string v1, "setnum"
a=0;// 
a=0;//     const-string v0, "setnum"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v7, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v4, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_22
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {v2, v4}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/c/a;->a:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/c/a;->a:Landroid/os/Handler;
a=0;// 
a=0;//     if-eqz v0, :cond_23
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/c/a;->a:Landroid/os/Handler;
a=0;// 
a=0;//     const-string v1, "VST\u89c6\u9891\u5168\u805a\u5408"
a=0;// 
a=0;//     invoke-virtual {v0, v9, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/c/a;->a:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     :cond_23
a=0;//     const-string v0, "net.myvst.v2"
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcom/wukongtv/wkhelper/c/a;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_24
a=0;//     #v1=(Boolean);v3=(Null);v5=(One);v8=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->hashCode()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     sparse-switch v8, :sswitch_data_0
a=0;// 
a=0;//     :cond_25
a=0;//     #v0=(Conflicted);v3=(Reference,Ljava/lang/String;);v5=(Conflicted);
a=0;//     move v3, v1
a=0;// 
a=0;//     :goto_16
a=0;//     #v3=(Byte);
a=0;//     packed-switch v3, :pswitch_data_1
a=0;// 
a=0;//     goto :goto_15
a=0;// 
a=0;//     :pswitch_f
a=0;//     const-string v0, "dataurl"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "vst://myvst.v2/mediaplayer/vod"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_15
a=0;// 
a=0;//     :sswitch_0
a=0;//     #v1=(Byte);v3=(Null);v5=(One);
a=0;//     const-string v5, "vod"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_25
a=0;// 
a=0;//     goto :goto_16
a=0;// 
a=0;//     :sswitch_1
a=0;//     #v0=(Reference,Ljava/lang/String;);v5=(One);
a=0;//     const-string v3, "live"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_25
a=0;// 
a=0;//     move v3, v5
a=0;// 
a=0;//     #v3=(One);
a=0;//     goto :goto_16
a=0;// 
a=0;//     :sswitch_2
a=0;//     #v0=(Reference,Ljava/lang/String;);v3=(Null);
a=0;//     const-string v3, "vcd"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_25
a=0;// 
a=0;//     move v3, v6
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     goto :goto_16
a=0;// 
a=0;//     :pswitch_10
a=0;//     #v0=(Conflicted);v3=(Byte);v5=(Conflicted);
a=0;//     const-string v0, "dataurl"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "vst://myvst.v2/mediaplayer/live"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_15
a=0;// 
a=0;//     :pswitch_11
a=0;//     #v0=(Conflicted);v1=(Byte);
a=0;//     const-string v0, "dataurl"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "myvst.intent.action.MediaDetail"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_15
a=0;// 
a=0;//     :cond_26
a=0;//     #v2=(Boolean);v3=(Null);v5=(One);v8=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/c/a;->a:Landroid/os/Handler;
a=0;// 
a=0;//     const v1, 0x813824
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/c/s;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     sget-object v1, Lcom/wukongtv/wkhelper/c/t;->a:Lcom/wukongtv/wkhelper/c/t;
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/c/t;);
a=0;//     const-string v2, "text/json; charset=utf-8"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     sget-object v3, Lcom/wukongtv/wkhelper/b/g;->b:Lcom/wukongtv/wkhelper/b/g;
a=0;// 
a=0;//     #v3=(Reference,Lcom/wukongtv/wkhelper/b/g;);
a=0;//     invoke-virtual {v3}, Lcom/wukongtv/wkhelper/b/g;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v0, v1, v2, v3}, Lcom/wukongtv/wkhelper/c/s;-><init>(Lcom/wukongtv/wkhelper/c/t;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :pswitch_12
a=0;//     #v1=(Integer);v3=(Null);v4=(PosByte);
a=0;//     const-string v0, "pkg"
a=0;// 
a=0;//     invoke-interface {v7, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v4, Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "name"
a=0;// 
a=0;//     invoke-interface {v7, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :try_start_b
a=0;//     #v2=(Null);
a=0;//     const-string v1, "url"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v7, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Ljava/lang/String;
a=0;// 
a=0;//     const-string v5, "utf-8"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v5}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_27
a=0;// 
a=0;//     const-string v1, "UTF-8"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_b
a=0;//     .catch Ljava/io/UnsupportedEncodingException; {:try_start_b .. :try_end_b} :catch_6
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :cond_27
a=0;//     #v1=(Conflicted);
a=0;//     move-object v5, v0
a=0;// 
a=0;//     :goto_17
a=0;//     invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_29
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/c/a;->f:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0, v4}, Lcom/wukongtv/wkhelper/a/g;->a(Landroid/content/Context;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_29
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/c/a;->a:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     if-eqz v0, :cond_28
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/c/a;->a:Landroid/os/Handler;
a=0;// 
a=0;//     const v1, 0x813839
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1, v3, v3, v4}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/c/a;->a:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     :cond_28
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/c/a;->f:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v4, v0}, Lcom/wukongtv/wkhelper/a/j;->a(Ljava/lang/String;Landroid/content/Context;)Z
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/c/s;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     sget-object v1, Lcom/wukongtv/wkhelper/c/t;->a:Lcom/wukongtv/wkhelper/c/t;
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/c/t;);
a=0;//     const-string v2, "application/x-javascript; charset=utf-8"
a=0;// 
a=0;//     sget-object v3, Lcom/wukongtv/wkhelper/b/i;->a:Lcom/wukongtv/wkhelper/b/i;
a=0;// 
a=0;//     #v3=(Reference,Lcom/wukongtv/wkhelper/b/i;);
a=0;//     invoke-virtual {v3}, Lcom/wukongtv/wkhelper/b/i;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v0, v1, v2, v3}, Lcom/wukongtv/wkhelper/c/s;-><init>(Lcom/wukongtv/wkhelper/c/t;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :catch_6
a=0;//     #v1=(Conflicted);v3=(Null);v5=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/UnsupportedEncodingException;);
a=0;//     invoke-virtual {v1}, Ljava/io/UnsupportedEncodingException;->printStackTrace()V
a=0;// 
a=0;//     move-object v5, v0
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_17
a=0;// 
a=0;//     :cond_29
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const-string v0, "http://yaokong.wukongtv.com"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/c/a;->f:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/d/a;->a(Landroid/content/Context;)Lcom/wukongtv/wkhelper/d/a;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/d/a;);
a=0;//     iget-object v3, p0, Lcom/wukongtv/wkhelper/c/a;->a:Landroid/os/Handler;
a=0;// 
a=0;//     #v3=(Reference,Landroid/os/Handler;);
a=0;//     const-wide/16 v6, 0x0
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     invoke-virtual/range {v1 .. v7}, Lcom/wukongtv/wkhelper/d/a;->a(Ljava/lang/String;Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/String;
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/c/s;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     sget-object v1, Lcom/wukongtv/wkhelper/c/t;->a:Lcom/wukongtv/wkhelper/c/t;
a=0;// 
a=0;//     const-string v2, "application/x-javascript; charset=utf-8"
a=0;// 
a=0;//     sget-object v3, Lcom/wukongtv/wkhelper/b/i;->b:Lcom/wukongtv/wkhelper/b/i;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/wukongtv/wkhelper/b/i;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v0, v1, v2, v3}, Lcom/wukongtv/wkhelper/c/s;-><init>(Lcom/wukongtv/wkhelper/c/t;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :pswitch_13
a=0;//     #v1=(Integer);v3=(Null);v4=(PosByte);v5=(One);v6=(PosByte);v7=(Reference,Ljava/util/Map;);
a=0;//     const-string v0, "pkg"
a=0;// 
a=0;//     invoke-interface {v7, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     const-string v1, "id"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v7, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Ljava/lang/String;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/c/a;->f:Landroid/content/Context;
a=0;// 
a=0;//     const-string v3, "com.fastcloud.tv"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3}, Lcom/wukongtv/wkhelper/a/g;->a(Landroid/content/Context;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_2a
a=0;// 
a=0;//     invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Message;);
a=0;//     iput-object v0, v2, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     :try_start_c
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, v2, Landroid/os/Message;->arg1:I
a=0;//     :try_end_c
a=0;//     .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_11
a=0;// 
a=0;//     :goto_18
a=0;//     #v0=(Conflicted);
a=0;//     const v0, 0x813823
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, v2, Landroid/os/Message;->what:I
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/c/a;->a:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     const-string v0, "com.fastcloud.tv"
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcom/wukongtv/wkhelper/c/a;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/c/s;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     sget-object v1, Lcom/wukongtv/wkhelper/c/t;->a:Lcom/wukongtv/wkhelper/c/t;
a=0;// 
a=0;//     const-string v2, "text/json; charset=utf-8"
a=0;// 
a=0;//     sget-object v3, Lcom/wukongtv/wkhelper/b/e;->a:Lcom/wukongtv/wkhelper/b/e;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/wukongtv/wkhelper/b/e;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v0, v1, v2, v3}, Lcom/wukongtv/wkhelper/c/s;-><init>(Lcom/wukongtv/wkhelper/c/t;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_2a
a=0;//     #v2=(Boolean);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/c/a;->a:Landroid/os/Handler;
a=0;// 
a=0;//     const v1, 0x813822
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/c/s;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     sget-object v1, Lcom/wukongtv/wkhelper/c/t;->a:Lcom/wukongtv/wkhelper/c/t;
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/c/t;);
a=0;//     const-string v2, "text/json; charset=utf-8"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     sget-object v3, Lcom/wukongtv/wkhelper/b/e;->b:Lcom/wukongtv/wkhelper/b/e;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/wukongtv/wkhelper/b/e;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v0, v1, v2, v3}, Lcom/wukongtv/wkhelper/c/s;-><init>(Lcom/wukongtv/wkhelper/c/t;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :pswitch_14
a=0;//     #v1=(Integer);v3=(Null);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/c/a;->f:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/a;->a(Landroid/content/Context;)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/c/a;->f:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/a;->b(Landroid/content/Context;)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     :try_start_d
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/a/o;->a()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_2c
a=0;// 
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/a/o;->c()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/a/o;->a()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     if-eqz v6, :cond_2b
a=0;// 
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/io/File;);
a=0;//     new-instance v7, Landroid/os/StatFs;
a=0;// 
a=0;//     #v7=(UninitRef,Landroid/os/StatFs;);
a=0;//     invoke-virtual {v6}, Ljava/io/File;->getPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {v7, v6}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Landroid/os/StatFs;);
a=0;//     invoke-virtual {v7}, Landroid/os/StatFs;->getBlockSize()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     int-to-long v8, v6
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     invoke-virtual {v7}, Landroid/os/StatFs;->getBlockCount()I
a=0;//     :try_end_d
a=0;//     .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_10
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     mul-long/2addr v0, v8
a=0;// 
a=0;//     :goto_19
a=0;//     #v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v6, ","
a=0;// 
a=0;//     invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, ","
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ","
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/c/s;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     sget-object v2, Lcom/wukongtv/wkhelper/c/t;->a:Lcom/wukongtv/wkhelper/c/t;
a=0;// 
a=0;//     const-string v3, "text/json; charset=utf-8"
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v2, v3, v1}, Lcom/wukongtv/wkhelper/c/s;-><init>(Lcom/wukongtv/wkhelper/c/t;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_2b
a=0;//     #v0=(LongLo);v1=(LongHi);v2=(LongLo);v3=(LongHi);v6=(Boolean);v7=(Reference,Ljava/util/Map;);v8=(Reference,Landroid/content/pm/PackageManager;);v9=(Integer);
a=0;//     const-wide/16 v0, -0x1
a=0;// 
a=0;//     goto :goto_19
a=0;// 
a=0;//     :cond_2c
a=0;//     :try_start_e
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/a/o;->b()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/io/File;);
a=0;//     new-instance v7, Landroid/os/StatFs;
a=0;// 
a=0;//     #v7=(UninitRef,Landroid/os/StatFs;);
a=0;//     invoke-virtual {v6}, Ljava/io/File;->getPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {v7, v6}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Landroid/os/StatFs;);
a=0;//     invoke-virtual {v7}, Landroid/os/StatFs;->getBlockSize()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     int-to-long v8, v6
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     invoke-virtual {v7}, Landroid/os/StatFs;->getBlockCount()I
a=0;//     :try_end_e
a=0;//     .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_10
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     mul-long/2addr v0, v8
a=0;// 
a=0;//     goto :goto_19
a=0;// 
a=0;//     :pswitch_15
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Integer);v2=(Reference,[I);v3=(Null);v4=(PosByte);v5=(One);v6=(PosByte);v8=(Reference,Landroid/content/pm/PackageManager;);v9=(Integer);
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/a/m;->a()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2d
a=0;// 
a=0;//     const-string v0, "rm -rf /data/local/tmp/ssimg.png"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/a/m;->a(Ljava/lang/String;)Lcom/wukongtv/wkhelper/a/n;
a=0;// 
a=0;//     const-string v0, "screencap -p /data/local/tmp/ssimg.png"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/a/m;->a(Ljava/lang/String;)Lcom/wukongtv/wkhelper/a/n;
a=0;// 
a=0;//     const-string v0, "chmod 666 /data/local/tmp/ssimg.png"
a=0;// 
a=0;//     invoke-static {v0, v5, v5}, Lcom/wukongtv/wkhelper/a/m;->a(Ljava/lang/String;ZZ)Lcom/wukongtv/wkhelper/a/n;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/wukongtv/wkhelper/a/n;->c:Ljava/lang/String;
a=0;// 
a=0;//     const-string v1, "No such file"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2e
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/c/s;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     sget-object v1, Lcom/wukongtv/wkhelper/c/t;->k:Lcom/wukongtv/wkhelper/c/t;
a=0;// 
a=0;//     const-string v2, "text/json; charset=utf-8"
a=0;// 
a=0;//     const-string v3, ""
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v2, v3}, Lcom/wukongtv/wkhelper/c/s;-><init>(Lcom/wukongtv/wkhelper/c/t;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_2d
a=0;//     #v0=(Boolean);v1=(Integer);v3=(Null);
a=0;//     const-string v0, "rm /data/local/tmp/ssimg.png"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/wukongtv/a/d;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "screencap -p /data/local/tmp/ssimg.png"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/a/d;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {}, Lcom/wukongtv/a/d;->b()V
a=0;// 
a=0;//     if-nez v0, :cond_2e
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/c/s;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     sget-object v1, Lcom/wukongtv/wkhelper/c/t;->k:Lcom/wukongtv/wkhelper/c/t;
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/c/t;);
a=0;//     const-string v2, "text/json; charset=utf-8"
a=0;// 
a=0;//     const-string v3, ""
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v2, v3}, Lcom/wukongtv/wkhelper/c/s;-><init>(Lcom/wukongtv/wkhelper/c/t;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_2e
a=0;//     :try_start_f
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Null);
a=0;//     sget-object v0, Lcom/wukongtv/wkhelper/c/a;->g:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ThreadLocal;);
a=0;//     invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->reset()V
a=0;// 
a=0;//     new-instance v0, Landroid/graphics/BitmapFactory$Options;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/BitmapFactory$Options;);
a=0;//     invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/BitmapFactory$Options;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput-boolean v1, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z
a=0;// 
a=0;//     const-string v1, "/data/local/tmp/ssimg.png"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput v1, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     iput-boolean v1, v0, Landroid/graphics/BitmapFactory$Options;->inScaled:Z
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-boolean v1, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput-boolean v1, v0, Landroid/graphics/BitmapFactory$Options;->inPreferQualityOverSpeed:Z
a=0;// 
a=0;//     sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Bitmap$Config;);
a=0;//     iput-object v1, v0, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;
a=0;// 
a=0;//     iget v1, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0x28a
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     if-ge v1, v2, :cond_2f
a=0;// 
a=0;//     const/16 v1, 0xa0
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     iput v1, v0, Landroid/graphics/BitmapFactory$Options;->inDensity:I
a=0;// 
a=0;//     :goto_1a
a=0;//     #v1=(Integer);
a=0;//     const/16 v1, 0xa0
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     iput v1, v0, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I
a=0;// 
a=0;//     const-string v1, "/data/local/tmp/ssimg.png"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Bitmap$CompressFormat;);
a=0;//     const/16 v3, 0x50
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     sget-object v0, Lcom/wukongtv/wkhelper/c/a;->g:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/io/OutputStream;
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
a=0;// 
a=0;//     new-instance v1, Ljava/io/ByteArrayInputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/ByteArrayInputStream;);
a=0;//     sget-object v0, Lcom/wukongtv/wkhelper/c/a;->g:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v1, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/ByteArrayInputStream;);
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/c/s;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     sget-object v2, Lcom/wukongtv/wkhelper/c/t;->a:Lcom/wukongtv/wkhelper/c/t;
a=0;// 
a=0;//     const-string v3, "image/jpeg"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v2, v3, v1}, Lcom/wukongtv/wkhelper/c/s;-><init>(Lcom/wukongtv/wkhelper/c/t;Ljava/lang/String;Ljava/io/InputStream;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     const-string v1, "Cache-Control"
a=0;// 
a=0;//     const-string v2, "public, max-age=3153600"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/wukongtv/wkhelper/c/s;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     :try_end_f
a=0;//     .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_7
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :catch_7
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/c/s;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     sget-object v1, Lcom/wukongtv/wkhelper/c/t;->k:Lcom/wukongtv/wkhelper/c/t;
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/c/t;);
a=0;//     const-string v2, "text/json; charset=utf-8"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, ""
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v2, v3}, Lcom/wukongtv/wkhelper/c/s;-><init>(Lcom/wukongtv/wkhelper/c/t;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_2f
a=0;//     :try_start_10
a=0;//     #v1=(Integer);v2=(PosShort);v3=(Null);
a=0;//     iget v1, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I
a=0;// 
a=0;//     div-int/lit16 v1, v1, 0x28a
a=0;// 
a=0;//     mul-int/lit16 v1, v1, 0xa0
a=0;// 
a=0;//     iput v1, v0, Landroid/graphics/BitmapFactory$Options;->inDensity:I
a=0;//     :try_end_10
a=0;//     .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_7
a=0;// 
a=0;//     goto :goto_1a
a=0;// 
a=0;//     :pswitch_16
a=0;//     #v2=(Reference,[I);
a=0;//     const-string v0, "delay"
a=0;// 
a=0;//     invoke-interface {v7, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     :try_start_11
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
a=0;//     :try_end_11
a=0;//     .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_8
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_1b
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x258
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     if-gt v0, v1, :cond_30
a=0;// 
a=0;//     if-gez v0, :cond_31
a=0;// 
a=0;//     :cond_30
a=0;//     move v0, v3
a=0;// 
a=0;//     :cond_31
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/c/a;->a:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     const v2, 0x813831
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2, v0, v3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Message;);
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/c/a;->a:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/c/s;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     sget-object v1, Lcom/wukongtv/wkhelper/c/t;->a:Lcom/wukongtv/wkhelper/c/t;
a=0;// 
a=0;//     const-string v2, "text/json; charset=utf-8"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "success"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v2, v3}, Lcom/wukongtv/wkhelper/c/s;-><init>(Lcom/wukongtv/wkhelper/c/t;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :catch_8
a=0;//     #v1=(Integer);v3=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     move v0, v3
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1b
a=0;// 
a=0;//     :pswitch_17
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "param1"
a=0;// 
a=0;//     invoke-interface {v7, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     const-string v1, "param2"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v7, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Ljava/lang/String;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/c/a;->f:Landroid/content/Context;
a=0;// 
a=0;//     const-string v3, "com.suning.tv.ebuy"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/16 v4, 0x13
a=0;// 
a=0;//     invoke-static {v2, v3, v4}, Lcom/wukongtv/wkhelper/a/g;->b(Landroid/content/Context;Ljava/lang/String;I)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_32
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/c/a;->a:Landroid/os/Handler;
a=0;// 
a=0;//     const v1, 0x813832
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/c/s;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     sget-object v1, Lcom/wukongtv/wkhelper/c/t;->a:Lcom/wukongtv/wkhelper/c/t;
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/c/t;);
a=0;//     const-string v2, "text/json; charset=utf-8"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     sget-object v3, Lcom/wukongtv/wkhelper/b/g;->b:Lcom/wukongtv/wkhelper/b/g;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/wukongtv/wkhelper/b/g;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v0, v1, v2, v3}, Lcom/wukongtv/wkhelper/c/s;-><init>(Lcom/wukongtv/wkhelper/c/t;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_32
a=0;//     #v2=(Boolean);
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/c/a;->a:Landroid/os/Handler;
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Handler;);
a=0;//     if-eqz v2, :cond_33
a=0;// 
a=0;//     new-instance v2, Landroid/os/Message;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/os/Message;);
a=0;//     invoke-direct {v2}, Landroid/os/Message;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Message;);
a=0;//     new-instance v3, Landroid/os/Bundle;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v3}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Landroid/os/Bundle;);
a=0;//     const v4, 0x813833
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iput v4, v2, Landroid/os/Message;->what:I
a=0;// 
a=0;//     const-string v4, "action"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "data"
a=0;// 
a=0;//     invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/c/a;->a:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     :cond_33
a=0;//     #v4=(Conflicted);
a=0;//     const-string v0, "com.suning.tv.ebuy"
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcom/wukongtv/wkhelper/c/a;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/c/s;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     sget-object v1, Lcom/wukongtv/wkhelper/c/t;->a:Lcom/wukongtv/wkhelper/c/t;
a=0;// 
a=0;//     const-string v2, "text/json; charset=utf-8"
a=0;// 
a=0;//     sget-object v3, Lcom/wukongtv/wkhelper/b/g;->a:Lcom/wukongtv/wkhelper/b/g;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/wukongtv/wkhelper/b/g;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v0, v1, v2, v3}, Lcom/wukongtv/wkhelper/c/s;-><init>(Lcom/wukongtv/wkhelper/c/t;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :pswitch_18
a=0;//     :try_start_12
a=0;//     #v1=(Integer);v3=(Null);v4=(PosByte);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/c/a;->f:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/a/g;->g(Landroid/content/Context;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/high16 v1, 0x10000000
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/c/a;->f:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;//     :try_end_12
a=0;//     .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_9
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/c/s;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     sget-object v1, Lcom/wukongtv/wkhelper/c/t;->a:Lcom/wukongtv/wkhelper/c/t;
a=0;// 
a=0;//     const-string v2, "text/json; charset=utf-8"
a=0;// 
a=0;//     const-string v3, "success"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v2, v3}, Lcom/wukongtv/wkhelper/c/s;-><init>(Lcom/wukongtv/wkhelper/c/t;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :catch_9
a=0;//     #v1=(Conflicted);v3=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/c/s;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     sget-object v1, Lcom/wukongtv/wkhelper/c/t;->a:Lcom/wukongtv/wkhelper/c/t;
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/c/t;);
a=0;//     const-string v2, "text/json; charset=utf-8"
a=0;// 
a=0;//     const-string v3, "failed"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v2, v3}, Lcom/wukongtv/wkhelper/c/s;-><init>(Lcom/wukongtv/wkhelper/c/t;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :pswitch_19
a=0;//     #v1=(Integer);v3=(Null);
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-interface {p1}, Lcom/wukongtv/wkhelper/c/q;->e()Lcom/wukongtv/wkhelper/c/r;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v1, Lcom/wukongtv/wkhelper/c/r;->c:Lcom/wukongtv/wkhelper/c/r;
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/c/r;);
a=0;//     invoke-virtual {v1, v0}, Lcom/wukongtv/wkhelper/c/r;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_34
a=0;// 
a=0;//     :try_start_13
a=0;//     invoke-interface {p1}, Lcom/wukongtv/wkhelper/c/q;->a()V
a=0;//     :try_end_13
a=0;//     .catch Ljava/io/IOException; {:try_start_13 .. :try_end_13} :catch_a
a=0;//     .catch Lcom/wukongtv/wkhelper/c/u; {:try_start_13 .. :try_end_13} :catch_b
a=0;// 
a=0;//     invoke-interface {p1}, Lcom/wukongtv/wkhelper/c/q;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0}, Lcom/wukongtv/wkhelper/c/a;->b(Ljava/lang/String;)Lcom/wukongtv/wkhelper/b/f;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/c/s;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     sget-object v2, Lcom/wukongtv/wkhelper/c/t;->a:Lcom/wukongtv/wkhelper/c/t;
a=0;// 
a=0;//     const-string v3, "text/json;charset=utf-8"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Lcom/wukongtv/wkhelper/b/f;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v2, v3, v1}, Lcom/wukongtv/wkhelper/c/s;-><init>(Lcom/wukongtv/wkhelper/c/t;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :catch_a
a=0;//     #v0=(Boolean);v3=(Null);
a=0;//     move-exception v1
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/c/s;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     sget-object v2, Lcom/wukongtv/wkhelper/c/t;->n:Lcom/wukongtv/wkhelper/c/t;
a=0;// 
a=0;//     const-string v3, "text/plain"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "SERVER INTERNAL ERROR: IOException: "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v2, v3, v1}, Lcom/wukongtv/wkhelper/c/s;-><init>(Lcom/wukongtv/wkhelper/c/t;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :catch_b
a=0;//     #v0=(Boolean);v3=(Null);v4=(PosByte);v5=(One);
a=0;//     move-exception v1
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/c/s;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     iget-object v2, v1, Lcom/wukongtv/wkhelper/c/u;->a:Lcom/wukongtv/wkhelper/c/t;
a=0;// 
a=0;//     const-string v3, "text/plain"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Lcom/wukongtv/wkhelper/c/u;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v2, v3, v1}, Lcom/wukongtv/wkhelper/c/s;-><init>(Lcom/wukongtv/wkhelper/c/t;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_34
a=0;//     #v0=(Boolean);v3=(Null);
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/c/s;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     sget-object v1, Lcom/wukongtv/wkhelper/c/t;->a:Lcom/wukongtv/wkhelper/c/t;
a=0;// 
a=0;//     const-string v2, "text/json;charset=utf-8"
a=0;// 
a=0;//     sget-object v3, Lcom/wukongtv/wkhelper/b/f;->d:Lcom/wukongtv/wkhelper/b/f;
a=0;// 
a=0;//     #v3=(Reference,Lcom/wukongtv/wkhelper/b/f;);
a=0;//     invoke-virtual {v3}, Lcom/wukongtv/wkhelper/b/f;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v0, v1, v2, v3}, Lcom/wukongtv/wkhelper/c/s;-><init>(Lcom/wukongtv/wkhelper/c/t;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :pswitch_1a
a=0;//     #v1=(Integer);v3=(Null);
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-interface {p1}, Lcom/wukongtv/wkhelper/c/q;->e()Lcom/wukongtv/wkhelper/c/r;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v1, Lcom/wukongtv/wkhelper/c/r;->c:Lcom/wukongtv/wkhelper/c/r;
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/c/r;);
a=0;//     invoke-virtual {v1, v0}, Lcom/wukongtv/wkhelper/c/r;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_35
a=0;// 
a=0;//     :try_start_14
a=0;//     invoke-interface {p1}, Lcom/wukongtv/wkhelper/c/q;->a()V
a=0;//     :try_end_14
a=0;//     .catch Ljava/io/IOException; {:try_start_14 .. :try_end_14} :catch_c
a=0;//     .catch Lcom/wukongtv/wkhelper/c/u; {:try_start_14 .. :try_end_14} :catch_d
a=0;// 
a=0;//     invoke-interface {p1}, Lcom/wukongtv/wkhelper/c/q;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {p1}, Lcom/wukongtv/wkhelper/c/q;->d()Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     const-string v2, "remote-addr"
a=0;// 
a=0;//     invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     new-instance v2, Landroid/content/Intent;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v3, p0, Lcom/wukongtv/wkhelper/c/a;->f:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     const-class v4, Lcom/wukongtv/wkhelper/pushscreen/PushScreenImageActivity;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v2, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     const/high16 v3, 0x10000000
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     const-string v3, "INTENT_KEY_PUSH_DATA"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     const-string v1, "INTENT_KEY_REMOTE_ADDR"
a=0;// 
a=0;//     invoke-virtual {v2, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/c/a;->f:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/c/s;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     sget-object v1, Lcom/wukongtv/wkhelper/c/t;->a:Lcom/wukongtv/wkhelper/c/t;
a=0;// 
a=0;//     const-string v2, "text/json;charset=utf-8"
a=0;// 
a=0;//     const-string v3, "success"
a=0;// 
a=0;//     invoke-direct {v0, v1, v2, v3}, Lcom/wukongtv/wkhelper/c/s;-><init>(Lcom/wukongtv/wkhelper/c/t;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :catch_c
a=0;//     #v0=(Boolean);v3=(Null);v4=(PosByte);
a=0;//     move-exception v1
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/c/s;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     sget-object v2, Lcom/wukongtv/wkhelper/c/t;->n:Lcom/wukongtv/wkhelper/c/t;
a=0;// 
a=0;//     const-string v3, "text/plain"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "SERVER INTERNAL ERROR: IOException: "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v2, v3, v1}, Lcom/wukongtv/wkhelper/c/s;-><init>(Lcom/wukongtv/wkhelper/c/t;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :catch_d
a=0;//     #v0=(Boolean);v3=(Null);v4=(PosByte);v5=(One);
a=0;//     move-exception v1
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/c/s;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     iget-object v2, v1, Lcom/wukongtv/wkhelper/c/u;->a:Lcom/wukongtv/wkhelper/c/t;
a=0;// 
a=0;//     const-string v3, "text/plain"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Lcom/wukongtv/wkhelper/c/u;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v2, v3, v1}, Lcom/wukongtv/wkhelper/c/s;-><init>(Lcom/wukongtv/wkhelper/c/t;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_35
a=0;//     #v0=(Boolean);v3=(Null);
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/c/s;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     sget-object v1, Lcom/wukongtv/wkhelper/c/t;->a:Lcom/wukongtv/wkhelper/c/t;
a=0;// 
a=0;//     const-string v2, "text/json;charset=utf-8"
a=0;// 
a=0;//     sget-object v3, Lcom/wukongtv/wkhelper/b/f;->d:Lcom/wukongtv/wkhelper/b/f;
a=0;// 
a=0;//     #v3=(Reference,Lcom/wukongtv/wkhelper/b/f;);
a=0;//     invoke-virtual {v3}, Lcom/wukongtv/wkhelper/b/f;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v0, v1, v2, v3}, Lcom/wukongtv/wkhelper/c/s;-><init>(Lcom/wukongtv/wkhelper/c/t;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :pswitch_1b
a=0;//     #v1=(Integer);v3=(Null);
a=0;//     const-string v0, "what"
a=0;// 
a=0;//     invoke-interface {v7, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     const/16 v0, 0x113
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     if-ne v1, v0, :cond_36
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/c/a;->f:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const-string v2, "activity"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/ActivityManager;
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Landroid/app/ActivityManager;->getRunningTasks(I)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/ActivityManager$RunningTaskInfo;
a=0;// 
a=0;//     iget-object v0, v0, Landroid/app/ActivityManager$RunningTaskInfo;->topActivity:Landroid/content/ComponentName;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, "com.wukongtv.wkhelper.pushscreen.PushScreenNewActivity"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_36
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/c/s;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     sget-object v1, Lcom/wukongtv/wkhelper/c/t;->a:Lcom/wukongtv/wkhelper/c/t;
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/c/t;);
a=0;//     const-string v2, "text/json;charset=utf-8"
a=0;// 
a=0;//     const-string v3, "success"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v2, v3}, Lcom/wukongtv/wkhelper/c/s;-><init>(Lcom/wukongtv/wkhelper/c/t;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_36
a=0;//     #v0=(PosShort);v1=(Integer);v3=(Null);
a=0;//     invoke-interface {p1}, Lcom/wukongtv/wkhelper/c/q;->d()Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     const-string v2, "remote-addr"
a=0;// 
a=0;//     invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     new-instance v2, Ljava/util/HashMap;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v2}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     :try_start_15
a=0;//     #v2=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-interface {p1}, Lcom/wukongtv/wkhelper/c/q;->a()V
a=0;// 
a=0;//     invoke-interface {p1}, Lcom/wukongtv/wkhelper/c/q;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     new-instance v3, Landroid/content/Intent;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v4, p0, Lcom/wukongtv/wkhelper/c/a;->f:Landroid/content/Context;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     const-class v5, Lcom/wukongtv/wkhelper/pushscreen/PushScreenNewActivity;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v3, v4, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Intent;);
a=0;//     const/high16 v4, 0x10000000
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     const-string v4, "INTENT_KEY_WHAT"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     const-string v1, "INTENT_KEY_DATA"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     const-string v1, "INTENT_KEY_REMOTEADDR"
a=0;// 
a=0;//     invoke-virtual {v3, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/c/a;->f:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;//     :try_end_15
a=0;//     .catch Ljava/io/IOException; {:try_start_15 .. :try_end_15} :catch_e
a=0;//     .catch Lcom/wukongtv/wkhelper/c/u; {:try_start_15 .. :try_end_15} :catch_f
a=0;// 
a=0;//     :goto_1c
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/c/s;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     sget-object v1, Lcom/wukongtv/wkhelper/c/t;->a:Lcom/wukongtv/wkhelper/c/t;
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/c/t;);
a=0;//     const-string v2, "text/json;charset=utf-8"
a=0;// 
a=0;//     const-string v3, "success"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v2, v3}, Lcom/wukongtv/wkhelper/c/s;-><init>(Lcom/wukongtv/wkhelper/c/t;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :catch_e
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1c
a=0;// 
a=0;//     :catch_f
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/wukongtv/wkhelper/c/u;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1c
a=0;// 
a=0;//     :pswitch_1c
a=0;//     #v1=(Integer);v3=(Null);v4=(PosByte);v5=(One);
a=0;//     const-string v0, "pkgname"
a=0;// 
a=0;//     invoke-interface {v7, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     const-string v1, "appdir"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v7, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Ljava/lang/String;
a=0;// 
a=0;//     const-string v2, "appname"
a=0;// 
a=0;//     invoke-interface {v7, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_37
a=0;// 
a=0;//     iget-object v4, p0, Lcom/wukongtv/wkhelper/c/a;->f:Landroid/content/Context;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0, v4}, Lcom/wukongtv/wkhelper/a/j;->b(Ljava/lang/String;Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_37
a=0;// 
a=0;//     invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Message;);
a=0;//     const v3, 0x813837
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     new-instance v3, Landroid/os/Bundle;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v3}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v4, "appdir"
a=0;// 
a=0;//     invoke-virtual {v3, v4, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v1, "appname"
a=0;// 
a=0;//     invoke-virtual {v3, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/c/a;->a:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/c/s;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     sget-object v1, Lcom/wukongtv/wkhelper/c/t;->a:Lcom/wukongtv/wkhelper/c/t;
a=0;// 
a=0;//     const-string v2, "application/x-javascript; charset=utf-8"
a=0;// 
a=0;//     sget-object v3, Lcom/wukongtv/wkhelper/b/h;->d:Lcom/wukongtv/wkhelper/b/h;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/wukongtv/wkhelper/b/h;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v0, v1, v2, v3}, Lcom/wukongtv/wkhelper/c/s;-><init>(Lcom/wukongtv/wkhelper/c/t;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_37
a=0;//     :pswitch_1d
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Null);v4=(Conflicted);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     new-instance v2, Ljava/util/HashMap;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v2}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v4, "device_model"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/a/d;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_38
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     :goto_1d
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v2, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v4, "device_host"
a=0;// 
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/a/d;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_39
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     :goto_1e
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v2, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v4, "device_open_root"
a=0;// 
a=0;//     const-string v0, "id"
a=0;// 
a=0;//     invoke-static {v0, v3, v5}, Lcom/wukongtv/wkhelper/a/m;->a(Ljava/lang/String;ZZ)Lcom/wukongtv/wkhelper/a/n;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v6, v0, Lcom/wukongtv/wkhelper/a/n;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_3a
a=0;// 
a=0;//     iget-object v0, v0, Lcom/wukongtv/wkhelper/a/n;->b:Ljava/lang/String;
a=0;// 
a=0;//     const-string v6, "uid=0"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3a
a=0;// 
a=0;//     move v0, v5
a=0;// 
a=0;//     :goto_1f
a=0;//     #v6=(Conflicted);
a=0;//     invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v2, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v0, "device_open_adb"
a=0;// 
a=0;//     invoke-static {}, Lcom/wukongtv/a/d;->a()Lcom/wukongtv/a/c;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     if-nez v4, :cond_40
a=0;// 
a=0;//     :goto_20
a=0;//     #v3=(Boolean);
a=0;//     invoke-static {}, Lcom/wukongtv/a/d;->b()V
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v0, "device_tv_version"
a=0;// 
a=0;//     iget-object v3, p0, Lcom/wukongtv/wkhelper/c/a;->f:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/wukongtv/wkhelper/a/d;->a(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v0, "device_tv_channel"
a=0;// 
a=0;//     iget-object v3, p0, Lcom/wukongtv/wkhelper/c/a;->f:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/wukongtv/b/a;->a(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v3, "device_current_PROTOCAL"
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/c/a;->f:Landroid/content/Context;
a=0;// 
a=0;//     check-cast v0, Lcom/wukongtv/wkhelper/RemoteService;
a=0;// 
a=0;//     iget-object v4, v0, Lcom/wukongtv/wkhelper/RemoteService;->a:Lcom/wukongtv/wkhelper/controller/b;
a=0;// 
a=0;//     if-eqz v4, :cond_42
a=0;// 
a=0;//     iget-object v0, v0, Lcom/wukongtv/wkhelper/RemoteService;->a:Lcom/wukongtv/wkhelper/controller/b;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/wukongtv/wkhelper/controller/b;->a()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_41
a=0;// 
a=0;//     iget-object v0, v0, Lcom/wukongtv/wkhelper/controller/b;->a:Lcom/wukongtv/wkhelper/controller/a;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/wukongtv/wkhelper/controller/a;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_21
a=0;//     #v4=(Conflicted);
a=0;//     invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v0, "["
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :goto_22
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_43
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     const-string v4, "{\""
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v4, "\":\""
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v0, "\"},"
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_22
a=0;// 
a=0;//     :cond_38
a=0;//     #v0=(Boolean);v3=(Null);v6=(PosByte);
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/a/d;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_1d
a=0;// 
a=0;//     :cond_39
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/a/d;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_1e
a=0;// 
a=0;//     :cond_3a
a=0;//     #v0=(Conflicted);v6=(Conflicted);
a=0;//     const-string v0, "su -c id"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v3, v5}, Lcom/wukongtv/wkhelper/a/m;->a(Ljava/lang/String;ZZ)Lcom/wukongtv/wkhelper/a/n;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v6, v0, Lcom/wukongtv/wkhelper/a/n;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_3b
a=0;// 
a=0;//     iget-object v0, v0, Lcom/wukongtv/wkhelper/a/n;->b:Ljava/lang/String;
a=0;// 
a=0;//     const-string v6, "uid=0"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3b
a=0;// 
a=0;//     move v0, v5
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_1f
a=0;// 
a=0;//     :cond_3b
a=0;//     #v0=(Conflicted);v6=(Conflicted);
a=0;//     const-string v0, "id"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/wukongtv/a/d;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_3c
a=0;// 
a=0;//     const-string v6, "uid=0"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3d
a=0;// 
a=0;//     :cond_3c
a=0;//     #v0=(Conflicted);v6=(Conflicted);
a=0;//     invoke-static {}, Lcom/wukongtv/a/d;->b()V
a=0;// 
a=0;//     move v0, v5
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_1f
a=0;// 
a=0;//     :cond_3d
a=0;//     #v0=(Boolean);v6=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "su -c id"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/wukongtv/a/d;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {}, Lcom/wukongtv/a/d;->b()V
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_3e
a=0;// 
a=0;//     const-string v6, "uid=0"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3f
a=0;// 
a=0;//     :cond_3e
a=0;//     #v0=(Conflicted);v6=(Conflicted);
a=0;//     move v0, v5
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_1f
a=0;// 
a=0;//     :cond_3f
a=0;//     #v0=(Boolean);v6=(Reference,Ljava/lang/String;);
a=0;//     move v0, v3
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_1f
a=0;// 
a=0;//     :cond_40
a=0;//     #v0=(Reference,Ljava/lang/String;);v6=(Conflicted);
a=0;//     move v3, v5
a=0;// 
a=0;//     #v3=(One);
a=0;//     goto/16 :goto_20
a=0;// 
a=0;//     :cond_41
a=0;//     #v3=(Reference,Ljava/lang/String;);v4=(Boolean);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     goto/16 :goto_21
a=0;// 
a=0;//     :cond_42
a=0;//     #v4=(Reference,Lcom/wukongtv/wkhelper/controller/b;);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     goto/16 :goto_21
a=0;// 
a=0;//     :cond_43
a=0;//     #v0=(Boolean);v4=(Conflicted);
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v0, "]"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/c/s;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     sget-object v2, Lcom/wukongtv/wkhelper/c/t;->a:Lcom/wukongtv/wkhelper/c/t;
a=0;// 
a=0;//     const-string v3, "application/x-javascript; charset=utf-8"
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v2, v3, v1}, Lcom/wukongtv/wkhelper/c/s;-><init>(Lcom/wukongtv/wkhelper/c/t;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :catch_10
a=0;//     #v0=(LongLo);v1=(LongHi);v2=(LongLo);v3=(LongHi);v4=(Reference,Ljava/lang/String;);v5=(Reference,Ljava/lang/String;);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     move-exception v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Exception;);
a=0;//     goto/16 :goto_19
a=0;// 
a=0;//     :catch_11
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/String;);v2=(Reference,Landroid/os/Message;);v3=(Reference,Ljava/lang/String;);v4=(PosByte);v5=(One);v6=(PosByte);v7=(Reference,Ljava/util/Map;);v8=(Reference,Landroid/content/pm/PackageManager;);v9=(Integer);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto/16 :goto_18
a=0;// 
a=0;//     :catch_12
a=0;//     #v0=(Conflicted);v4=(Integer);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto/16 :goto_14
a=0;// 
a=0;//     :catch_13
a=0;//     #v0=(Conflicted);v4=(Reference,Ljava/lang/String;);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto/16 :goto_12
a=0;// 
a=0;//     :catch_14
a=0;//     #v1=(Conflicted);v3=(Null);v4=(PosByte);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/UnsupportedEncodingException;);
a=0;//     goto/16 :goto_11
a=0;// 
a=0;//     :catch_15
a=0;//     #v0=(LongLo);v1=(LongHi);v3=(Reference,Ujava/lang/Object;);v4=(Reference,Ljava/lang/String;);v5=(Reference,Ljava/lang/String;);
a=0;//     move-exception v3
a=0;// 
a=0;//     goto/16 :goto_e
a=0;// 
a=0;//     :catch_16
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/String;);v5=(One);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/UnsupportedEncodingException;);
a=0;//     goto/16 :goto_10
a=0;// 
a=0;//     :cond_44
a=0;//     #v3=(Boolean);
a=0;//     move-object v3, v2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_c
a=0;// 
a=0;//     :cond_45
a=0;//     #v1=(Boolean);v2=(Boolean);v3=(Null);v4=(Integer);v9=(Reference,Ljava/util/List;);v10=(Reference,[Lcom/wukongtv/wkhelper/c/e;);v11=(Reference,Lcom/wukongtv/wkhelper/e/a;);v12=(LongLo);v13=(LongHi);
a=0;//     move v1, v2
a=0;// 
a=0;//     goto/16 :goto_6
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//         :pswitch_4
a=0;//         :pswitch_5
a=0;//         :pswitch_6
a=0;//         :pswitch_7
a=0;//         :pswitch_8
a=0;//         :pswitch_9
a=0;//         :pswitch_a
a=0;//         :pswitch_b
a=0;//         :pswitch_c
a=0;//         :pswitch_d
a=0;//         :pswitch_e
a=0;//         :pswitch_12
a=0;//         :pswitch_13
a=0;//         :pswitch_14
a=0;//         :pswitch_15
a=0;//         :pswitch_16
a=0;//         :pswitch_17
a=0;//         :pswitch_18
a=0;//         :pswitch_19
a=0;//         :pswitch_1a
a=0;//         :pswitch_1b
a=0;//         :pswitch_1c
a=0;//         :pswitch_1d
a=0;//     .end packed-switch
a=0;// 
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x1c757 -> :sswitch_2
a=0;//         0x1c8cb -> :sswitch_0
a=0;//         0x32b0ec -> :sswitch_1
a=0;//     .end sparse-switch
a=0;// 
a=0;//     :pswitch_data_1
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_f
a=0;//         :pswitch_10
a=0;//         :pswitch_11
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method private c(Ljava/lang/String;)V
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/c/a;->a:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/c/a;->a:Landroid/os/Handler;
a=0;// 
a=0;//     const v1, 0x813840
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1, v2, v2, p1}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/c/a;->a:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private d()Lcom/wukongtv/wkhelper/c/a;
a=0;//     .locals 2
a=0;// 
a=0;//     iget-boolean v0, p0, Lcom/wukongtv/wkhelper/c/a;->i:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/wukongtv/wkhelper/c/a;->i:Z
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/c/a;->b()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "running @ "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/c/a;->c()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-object p0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(One);v1=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     iget v0, p0, Lcom/wukongtv/wkhelper/c/a;->b:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     iput v0, p0, Lcom/wukongtv/wkhelper/c/a;->b:I
a=0;// 
a=0;//     :try_start_1
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/c/a;->b()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_1
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private e()V
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/c/a;->a:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/c/a;->a:Landroid/os/Handler;
a=0;// 
a=0;//     const v1, 0x813816
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/c/a;->a:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(Lcom/wukongtv/wkhelper/c/q;)Lcom/wukongtv/wkhelper/c/s;
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lcom/wukongtv/wkhelper/c/a;->b(Lcom/wukongtv/wkhelper/c/q;)Lcom/wukongtv/wkhelper/c/s;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/c/s;);
a=0;//     return-object v0
a=0;// .end method
}}
