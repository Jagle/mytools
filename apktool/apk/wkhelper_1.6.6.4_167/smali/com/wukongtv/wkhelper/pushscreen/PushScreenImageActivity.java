package com.wukongtv.wkhelper.pushscreen; class PushScreenImageActivity { void a() { int a;
a=0;// .class public Lcom/wukongtv/wkhelper/pushscreen/PushScreenImageActivity;
a=0;// .super Landroid/app/Activity;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Z
a=0;// 
a=0;// .field private b:Lcom/wukongtv/wkhelper/widget/WKImageSwitcher;
a=0;// 
a=0;// .field private c:Ljava/util/List;
a=0;// 
a=0;// .field private d:I
a=0;// 
a=0;// .field private e:Ljava/lang/String;
a=0;// 
a=0;// .field private f:Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/pushscreen/PushScreenImageActivity;);
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/pushscreen/b;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/pushscreen/b;);
a=0;//     invoke-direct {v0, p0}, Lcom/wukongtv/wkhelper/pushscreen/b;-><init>(Lcom/wukongtv/wkhelper/pushscreen/PushScreenImageActivity;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/pushscreen/b;);
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenImageActivity;->f:Landroid/view/View$OnClickListener;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/wukongtv/wkhelper/pushscreen/PushScreenImageActivity;)Landroid/view/View$OnClickListener;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenImageActivity;->f:Landroid/view/View$OnClickListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View$OnClickListener;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/content/Intent;)V
a=0;//     .locals 7
a=0;// 
a=0;//     const v6, 0x7f07006e
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const-string v0, "INTENT_KEY_PUSH_DATA"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const-string v0, "INTENT_KEY_REMOTE_ADDR"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-static {p0, v6, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Toast;);
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/pushscreen/PushScreenImageActivity;->finish()V
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     const-string v0, "INTENT_KEY_PUSH_DATA"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "INTENT_KEY_REMOTE_ADDR"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenImageActivity;->e:Ljava/lang/String;
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v1, Lorg/json/JSONArray;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/json/JSONArray;);
a=0;//     invoke-direct {v1, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lorg/json/JSONArray;);
a=0;//     invoke-virtual {v1}, Lorg/json/JSONArray;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_2
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v1, v0}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     :try_start_1
a=0;//     const-string v2, "initposition"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenImageActivity;->d:I
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     :try_start_2
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenImageActivity;->c:Ljava/util/List;
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-virtual {v1}, Lorg/json/JSONArray;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v0, v2, :cond_3
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lorg/json/JSONObject;);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     new-instance v3, Lcom/wukongtv/wkhelper/pushscreen/c;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/wukongtv/wkhelper/pushscreen/c;);
a=0;//     invoke-direct {v3}, Lcom/wukongtv/wkhelper/pushscreen/c;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Lcom/wukongtv/wkhelper/pushscreen/c;);
a=0;//     const-string v4, "filepath"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iput-object v4, v3, Lcom/wukongtv/wkhelper/pushscreen/c;->a:Ljava/lang/String;
a=0;// 
a=0;//     const-string v4, "mimetype"
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v3, Lcom/wukongtv/wkhelper/pushscreen/c;->b:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenImageActivity;->c:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Uninit);v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenImageActivity;->d:I
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-static {p0, v6, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/pushscreen/PushScreenImageActivity;->finish()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     :try_start_3
a=0;//     #v0=(Integer);v1=(Reference,Lorg/json/JSONArray;);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenImageActivity;->c:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenImageActivity;->d:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-gt v0, v1, :cond_4
a=0;// 
a=0;//     new-instance v0, Ljava/lang/Exception;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Exception;);
a=0;//     const-string v1, "Data error"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     throw v0
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenImageActivity;->c:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     iget v1, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenImageActivity;->d:I
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/wukongtv/wkhelper/pushscreen/c;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenImageActivity;->e:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, v0, Lcom/wukongtv/wkhelper/pushscreen/c;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, v0, Lcom/wukongtv/wkhelper/pushscreen/c;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v1, v2, v0}, Lcom/wukongtv/wkhelper/a/l;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenImageActivity;->b:Lcom/wukongtv/wkhelper/widget/WKImageSwitcher;
a=0;// 
a=0;//     const v2, 0x7f040001
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {p0, v2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/animation/Animation;);
a=0;//     invoke-virtual {v1, v2}, Lcom/wukongtv/wkhelper/widget/WKImageSwitcher;->setInAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenImageActivity;->b:Lcom/wukongtv/wkhelper/widget/WKImageSwitcher;
a=0;// 
a=0;//     const v2, 0x7f040002
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {p0, v2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/animation/Animation;);
a=0;//     invoke-virtual {v1, v2}, Lcom/wukongtv/wkhelper/widget/WKImageSwitcher;->setOutAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenImageActivity;->b:Lcom/wukongtv/wkhelper/widget/WKImageSwitcher;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcom/wukongtv/wkhelper/widget/WKImageSwitcher;->setImageLoaderUri(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcom/wukongtv/wkhelper/pushscreen/PushScreenImageActivity;)I
a=0;//     .locals 1
a=0;// 
a=0;//     iget v0, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenImageActivity;->d:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic c(Lcom/wukongtv/wkhelper/pushscreen/PushScreenImageActivity;)Ljava/util/List;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenImageActivity;->c:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic d(Lcom/wukongtv/wkhelper/pushscreen/PushScreenImageActivity;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenImageActivity;->e:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onBackPressed()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onBackPressed()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     const v0, 0x7f030016
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/wukongtv/wkhelper/pushscreen/PushScreenImageActivity;->setContentView(I)V
a=0;// 
a=0;//     const v0, 0x7f0b005a
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/wukongtv/wkhelper/pushscreen/PushScreenImageActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Lcom/wukongtv/wkhelper/widget/WKImageSwitcher;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenImageActivity;->b:Lcom/wukongtv/wkhelper/widget/WKImageSwitcher;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenImageActivity;->b:Lcom/wukongtv/wkhelper/widget/WKImageSwitcher;
a=0;// 
a=0;//     new-instance v1, Lcom/wukongtv/wkhelper/pushscreen/a;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/wukongtv/wkhelper/pushscreen/a;);
a=0;//     invoke-direct {v1, p0}, Lcom/wukongtv/wkhelper/pushscreen/a;-><init>(Lcom/wukongtv/wkhelper/pushscreen/PushScreenImageActivity;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/pushscreen/a;);
a=0;//     invoke-virtual {v0, v1}, Lcom/wukongtv/wkhelper/widget/WKImageSwitcher;->setFactory(Landroid/widget/ViewSwitcher$ViewFactory;)V
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/pushscreen/PushScreenImageActivity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcom/wukongtv/wkhelper/pushscreen/PushScreenImageActivity;->a(Landroid/content/Intent;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onKeyDown(ILandroid/view/KeyEvent;)Z
a=0;//     .locals 3
a=0;// 
a=0;//     invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     iget-boolean v1, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenImageActivity;->a:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenImageActivity;->c:Ljava/util/List;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenImageActivity;->c:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Integer);v2=(Uninit);
a=0;//     const/16 v1, 0x15
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-eq p1, v1, :cond_2
a=0;// 
a=0;//     const/16 v1, 0x16
a=0;// 
a=0;//     if-ne p1, v1, :cond_3
a=0;// 
a=0;//     :cond_2
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenImageActivity;->c:Ljava/util/List;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     packed-switch p1, :pswitch_data_0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);v2=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenImageActivity;->c:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     iget v1, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenImageActivity;->d:I
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/wukongtv/wkhelper/pushscreen/c;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenImageActivity;->e:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, v0, Lcom/wukongtv/wkhelper/pushscreen/c;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, v0, Lcom/wukongtv/wkhelper/pushscreen/c;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v1, v2, v0}, Lcom/wukongtv/wkhelper/a/l;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenImageActivity;->b:Lcom/wukongtv/wkhelper/widget/WKImageSwitcher;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcom/wukongtv/wkhelper/widget/WKImageSwitcher;->setImageLoaderUri(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_0
a=0;//     #v0=(Boolean);v1=(Integer);v2=(Uninit);
a=0;//     iget v1, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenImageActivity;->d:I
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget v0, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenImageActivity;->d:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     iput v0, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenImageActivity;->d:I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :pswitch_1
a=0;//     #v0=(Boolean);
a=0;//     iget v2, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenImageActivity;->d:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-eq v1, v2, :cond_0
a=0;// 
a=0;//     iget v0, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenImageActivity;->d:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     iput v0, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenImageActivity;->d:I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x15
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method protected onNewIntent(Landroid/content/Intent;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onNewIntent(Landroid/content/Intent;)V
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lcom/wukongtv/wkhelper/pushscreen/PushScreenImageActivity;->a(Landroid/content/Intent;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onPause()V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onPause()V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenImageActivity;->a:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onResume()V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onResume()V
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenImageActivity;->a:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
