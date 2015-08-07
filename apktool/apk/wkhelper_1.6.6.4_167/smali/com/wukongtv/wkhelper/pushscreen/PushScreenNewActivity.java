package com.wukongtv.wkhelper.pushscreen; class PushScreenNewActivity { void a() { int a;
a=0;// .class public Lcom/wukongtv/wkhelper/pushscreen/PushScreenNewActivity;
a=0;// .super Landroid/app/Activity;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Lcom/lovesport/fitCommon/WukongVideoView;
a=0;// 
a=0;// .field private b:Lcom/wukongtv/wkhelper/widget/WKImageSwitcher;
a=0;// 
a=0;// .field private c:Landroid/widget/ProgressBar;
a=0;// 
a=0;// .field private d:Ljava/lang/String;
a=0;// 
a=0;// .field private e:Lcom/c/a/b/d;
a=0;// 
a=0;// .field private f:Landroid/media/MediaPlayer$OnInfoListener;
a=0;// 
a=0;// .field private g:Lcom/c/a/b/f/a;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/pushscreen/PushScreenNewActivity;);
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/pushscreen/e;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/pushscreen/e;);
a=0;//     invoke-direct {v0, p0}, Lcom/wukongtv/wkhelper/pushscreen/e;-><init>(Lcom/wukongtv/wkhelper/pushscreen/PushScreenNewActivity;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/pushscreen/e;);
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenNewActivity;->f:Landroid/media/MediaPlayer$OnInfoListener;
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/pushscreen/f;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/pushscreen/f;);
a=0;//     invoke-direct {v0, p0}, Lcom/wukongtv/wkhelper/pushscreen/f;-><init>(Lcom/wukongtv/wkhelper/pushscreen/PushScreenNewActivity;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/pushscreen/f;);
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenNewActivity;->g:Lcom/c/a/b/f/a;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/wukongtv/wkhelper/pushscreen/PushScreenNewActivity;)Landroid/widget/ProgressBar;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenNewActivity;->c:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ProgressBar;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static a(Ljava/lang/String;)Ljava/util/List;
a=0;//     .locals 8
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v3, Lorg/json/JSONArray;
a=0;// 
a=0;//     #v3=(UninitRef,Lorg/json/JSONArray;);
a=0;//     invoke-direct {v3, p0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Lorg/json/JSONArray;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v2, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Integer);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-virtual {v3}, Lorg/json/JSONArray;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-ge v2, v0, :cond_1
a=0;// 
a=0;//     new-instance v4, Ljava/util/HashMap;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v4}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v3, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Lorg/json/JSONObject;);
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     invoke-virtual {v5}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v6=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v4, v0, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONException;);
a=0;//     invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_2
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v0=(Boolean);v1=(Reference,Ljava/util/ArrayList;);v2=(Integer);v3=(Reference,Lorg/json/JSONArray;);v4=(Reference,Ljava/util/HashMap;);v5=(Reference,Lorg/json/JSONObject;);v6=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_1
a=0;//     .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     add-int/lit8 v0, v2, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v2, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method private a(I)V
a=0;//     .locals 3
a=0;// 
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenNewActivity;->a:Lcom/lovesport/fitCommon/WukongVideoView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lovesport/fitCommon/WukongVideoView;);
a=0;//     invoke-virtual {v0, v2}, Lcom/lovesport/fitCommon/WukongVideoView;->setVisibility(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenNewActivity;->b:Lcom/wukongtv/wkhelper/widget/WKImageSwitcher;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lcom/wukongtv/wkhelper/widget/WKImageSwitcher;->setVisibility(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenNewActivity;->c:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V
a=0;// 
a=0;//     packed-switch p1, :pswitch_data_0
a=0;// 
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     :pswitch_0
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenNewActivity;->b:Lcom/wukongtv/wkhelper/widget/WKImageSwitcher;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/wukongtv/wkhelper/widget/WKImageSwitcher;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_1
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenNewActivity;->a:Lcom/lovesport/fitCommon/WukongVideoView;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/lovesport/fitCommon/WukongVideoView;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_2
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenNewActivity;->c:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x211
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/content/Intent;)V
a=0;//     .locals 9
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const-string v1, "INTENT_KEY_WHAT"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0x113
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     if-ne v2, v1, :cond_1
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/pushscreen/PushScreenNewActivity;->finish()V
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Integer);v2=(PosShort);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     const-string v2, "INTENT_KEY_REMOTEADDR"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenNewActivity;->d:Ljava/lang/String;
a=0;// 
a=0;//     const-string v2, "INTENT_KEY_DATA"
a=0;// 
a=0;//     invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lcom/wukongtv/wkhelper/pushscreen/PushScreenNewActivity;->a(Ljava/lang/String;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/List;);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     packed-switch v1, :pswitch_data_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_0
a=0;//     move v2, v0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Integer);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-ge v2, v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/util/Map;
a=0;// 
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     const-string v1, "filepath"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Ljava/lang/String;
a=0;// 
a=0;//     const-string v4, "mimetype"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenNewActivity;->d:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v4, v1, v0}, Lcom/wukongtv/wkhelper/a/l;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v4, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenNewActivity;->b:Lcom/wukongtv/wkhelper/widget/WKImageSwitcher;
a=0;// 
a=0;//     iget-object v5, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenNewActivity;->g:Lcom/c/a/b/f/a;
a=0;// 
a=0;//     #v5=(Reference,Lcom/c/a/b/f/a;);
a=0;//     invoke-virtual {v4}, Lcom/wukongtv/wkhelper/widget/WKImageSwitcher;->a()V
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/wukongtv/wkhelper/widget/WKImageSwitcher;->getNextView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-static {}, Lcom/c/a/b/f;->a()Lcom/c/a/b/f;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Lcom/c/a/b/f;);
a=0;//     iget-object v7, v4, Lcom/wukongtv/wkhelper/widget/WKImageSwitcher;->a:Lcom/c/a/b/d;
a=0;// 
a=0;//     #v7=(Reference,Lcom/c/a/b/d;);
a=0;//     new-instance v8, Lcom/c/a/b/e/b;
a=0;// 
a=0;//     #v8=(UninitRef,Lcom/c/a/b/e/b;);
a=0;//     invoke-direct {v8, v0}, Lcom/c/a/b/e/b;-><init>(Landroid/widget/ImageView;)V
a=0;// 
a=0;//     #v8=(Reference,Lcom/c/a/b/e/b;);
a=0;//     invoke-virtual {v6, v1, v8, v7, v5}, Lcom/c/a/b/f;->a(Ljava/lang/String;Lcom/c/a/b/e/a;Lcom/c/a/b/d;Lcom/c/a/b/f/a;)V
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/wukongtv/wkhelper/widget/WKImageSwitcher;->showNext()V
a=0;// 
a=0;//     :goto_2
a=0;//     #v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     add-int/lit8 v0, v2, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v2, v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Reference,Ljava/util/Map;);v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     const-string v1, "filepath"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Ljava/lang/String;
a=0;// 
a=0;//     const-string v4, "mimetype"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenNewActivity;->d:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v4, v1, v0}, Lcom/wukongtv/wkhelper/a/l;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {}, Lcom/c/a/b/f;->a()Lcom/c/a/b/f;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v4, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenNewActivity;->e:Lcom/c/a/b/d;
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v1, v0, v4, v5}, Lcom/c/a/b/f;->a(Ljava/lang/String;Lcom/c/a/b/d;Lcom/c/a/b/f/a;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :pswitch_1
a=0;//     #v0=(Null);v1=(Integer);v2=(Reference,Ljava/lang/String;);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     invoke-interface {v3}, Ljava/util/List;->isEmpty()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/util/Map;
a=0;// 
a=0;//     const-string v1, "filepath"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Ljava/lang/String;
a=0;// 
a=0;//     const-string v2, "mimetype"
a=0;// 
a=0;//     invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenNewActivity;->d:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v2, v1, v0}, Lcom/wukongtv/wkhelper/a/l;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/16 v1, 0x212
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-direct {p0, v1}, Lcom/wukongtv/wkhelper/pushscreen/PushScreenNewActivity;->a(I)V
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenNewActivity;->a:Lcom/lovesport/fitCommon/WukongVideoView;
a=0;// 
a=0;//     #v1=(Reference,Lcom/lovesport/fitCommon/WukongVideoView;);
a=0;//     invoke-virtual {v1, v0}, Lcom/lovesport/fitCommon/WukongVideoView;->setVideoPath(Ljava/lang/String;)V
a=0;// 
a=0;//     new-instance v0, Lcom/lovesport/fitCommon/p;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lovesport/fitCommon/p;);
a=0;//     invoke-direct {v0, p0}, Lcom/lovesport/fitCommon/p;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lovesport/fitCommon/p;);
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenNewActivity;->a:Lcom/lovesport/fitCommon/WukongVideoView;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcom/lovesport/fitCommon/WukongVideoView;->setMediaController(Lcom/lovesport/fitCommon/p;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenNewActivity;->a:Lcom/lovesport/fitCommon/WukongVideoView;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenNewActivity;->f:Landroid/media/MediaPlayer$OnInfoListener;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/lovesport/fitCommon/WukongVideoView;->setOnInfoListener(Landroid/media/MediaPlayer$OnInfoListener;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenNewActivity;->a:Lcom/lovesport/fitCommon/WukongVideoView;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/lovesport/fitCommon/WukongVideoView;->requestFocus()Z
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenNewActivity;->a:Lcom/lovesport/fitCommon/WukongVideoView;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/lovesport/fitCommon/WukongVideoView;->a()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x111
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/wukongtv/wkhelper/pushscreen/PushScreenNewActivity;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lcom/wukongtv/wkhelper/pushscreen/PushScreenNewActivity;->a(I)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     invoke-static {p0}, Lcom/lovesport/lc/a;->a(Landroid/content/Context;)V
a=0;// 
a=0;//     const v0, 0x7f030006
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/wukongtv/wkhelper/pushscreen/PushScreenNewActivity;->setContentView(I)V
a=0;// 
a=0;//     const v0, 0x7f0b002f
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/wukongtv/wkhelper/pushscreen/PushScreenNewActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Lcom/lovesport/fitCommon/WukongVideoView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenNewActivity;->a:Lcom/lovesport/fitCommon/WukongVideoView;
a=0;// 
a=0;//     const v0, 0x7f0b0030
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/wukongtv/wkhelper/pushscreen/PushScreenNewActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Lcom/wukongtv/wkhelper/widget/WKImageSwitcher;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenNewActivity;->b:Lcom/wukongtv/wkhelper/widget/WKImageSwitcher;
a=0;// 
a=0;//     const v0, 0x7f0b0031
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/wukongtv/wkhelper/pushscreen/PushScreenNewActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ProgressBar;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenNewActivity;->c:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenNewActivity;->b:Lcom/wukongtv/wkhelper/widget/WKImageSwitcher;
a=0;// 
a=0;//     new-instance v1, Lcom/wukongtv/wkhelper/pushscreen/d;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/wukongtv/wkhelper/pushscreen/d;);
a=0;//     invoke-direct {v1, p0}, Lcom/wukongtv/wkhelper/pushscreen/d;-><init>(Lcom/wukongtv/wkhelper/pushscreen/PushScreenNewActivity;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/pushscreen/d;);
a=0;//     invoke-virtual {v0, v1}, Lcom/wukongtv/wkhelper/widget/WKImageSwitcher;->setFactory(Landroid/widget/ViewSwitcher$ViewFactory;)V
a=0;// 
a=0;//     new-instance v0, Lcom/c/a/b/e;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/c/a/b/e;);
a=0;//     invoke-direct {v0}, Lcom/c/a/b/e;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/c/a/b/e;);
a=0;//     iput-boolean v2, v0, Lcom/c/a/b/e;->h:Z
a=0;// 
a=0;//     iput-boolean v2, v0, Lcom/c/a/b/e;->m:Z
a=0;// 
a=0;//     sget-object v1, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/c/a/b/e;->a(Landroid/graphics/Bitmap$Config;)Lcom/c/a/b/e;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget v1, Lcom/c/a/b/a/e;->e:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Lcom/c/a/b/e;->j:I
a=0;// 
a=0;//     new-instance v1, Lcom/c/a/b/c/b;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/c/a/b/c/b;);
a=0;//     invoke-direct {v1}, Lcom/c/a/b/c/b;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lcom/c/a/b/c/b;);
a=0;//     iput-object v1, v0, Lcom/c/a/b/e;->q:Lcom/c/a/b/c/a;
a=0;// 
a=0;//     iput-boolean v2, v0, Lcom/c/a/b/e;->g:Z
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/c/a/b/e;->a()Lcom/c/a/b/d;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenNewActivity;->e:Lcom/c/a/b/d;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/pushscreen/PushScreenNewActivity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcom/wukongtv/wkhelper/pushscreen/PushScreenNewActivity;->a(Landroid/content/Intent;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onNewIntent(Landroid/content/Intent;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onNewIntent(Landroid/content/Intent;)V
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lcom/wukongtv/wkhelper/pushscreen/PushScreenNewActivity;->a(Landroid/content/Intent;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
