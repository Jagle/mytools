package com.wukongtv.wkhelper.pushscreen; class PushScreenVideoActivity { void a() { int a;
a=0;// .class public Lcom/wukongtv/wkhelper/pushscreen/PushScreenVideoActivity;
a=0;// .super Lcom/lovesport/fitCommon/a;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private l:Landroid/view/View;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/lovesport/fitCommon/a;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/pushscreen/PushScreenVideoActivity;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Z)V
a=0;//     .locals 2
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenVideoActivity;->l:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(PosByte);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenVideoActivity;->l:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a()V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-direct {p0, v0}, Lcom/wukongtv/wkhelper/pushscreen/PushScreenVideoActivity;->a(Z)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final a(Landroid/view/ViewGroup;)V
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     const v0, 0x7f030014
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {p0, v0, v1}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenVideoActivity;->l:Landroid/view/View;
a=0;// 
a=0;//     new-instance v0, Landroid/widget/FrameLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/FrameLayout$LayoutParams;);
a=0;//     invoke-direct {v0, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/FrameLayout$LayoutParams;);
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenVideoActivity;->l:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {p1, v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final b()V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, v0}, Lcom/wukongtv/wkhelper/pushscreen/PushScreenVideoActivity;->a(Z)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final c()V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenVideoActivity;->a:Lcom/lovesport/fitCommon/WukongVideoView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lovesport/fitCommon/WukongVideoView;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenVideoActivity;->a:Lcom/lovesport/fitCommon/WukongVideoView;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/lovesport/fitCommon/WukongVideoView;->c()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenVideoActivity;->a:Lcom/lovesport/fitCommon/WukongVideoView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lovesport/fitCommon/WukongVideoView;);
a=0;//     iget-boolean v0, v0, Lcom/lovesport/fitCommon/WukongVideoView;->g:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, v0}, Lcom/wukongtv/wkhelper/pushscreen/PushScreenVideoActivity;->a(Z)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-super {p0, p1}, Lcom/lovesport/fitCommon/a;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     sget v0, Lcom/lovesport/fitCommon/j;->disclaimer:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/lovesport/fitCommon/a;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/lovesport/fitCommon/a;->b:Landroid/widget/TextView;
a=0;// 
a=0;//     sget v0, Lcom/lovesport/fitCommon/j;->surface_view:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/lovesport/fitCommon/a;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Lcom/lovesport/fitCommon/WukongVideoView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/lovesport/fitCommon/a;->a:Lcom/lovesport/fitCommon/WukongVideoView;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/a;->h:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     iput-boolean v5, p0, Lcom/lovesport/fitCommon/a;->k:Z
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/a;->h:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     sget v0, Lcom/lovesport/fitCommon/l;->playlocalvideo:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {p0, v0, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Toast;);
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     new-instance v0, Lcom/lovesport/fitCommon/e;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lovesport/fitCommon/e;);
a=0;//     invoke-direct {v0, p0}, Lcom/lovesport/fitCommon/e;-><init>(Lcom/lovesport/fitCommon/a;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lovesport/fitCommon/e;);
a=0;//     sget-object v1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/concurrent/Executor;);
a=0;//     new-array v2, v5, [Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcom/lovesport/fitCommon/a;->g:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     aput-object v3, v2, v4
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/lovesport/fitCommon/e;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;
a=0;// 
a=0;//     iput-boolean v4, p0, Lcom/lovesport/fitCommon/a;->k:Z
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/a;->a:Lcom/lovesport/fitCommon/WukongVideoView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lovesport/fitCommon/WukongVideoView;);
a=0;//     new-instance v1, Lcom/lovesport/fitCommon/b;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/lovesport/fitCommon/b;);
a=0;//     invoke-direct {v1, p0}, Lcom/lovesport/fitCommon/b;-><init>(Lcom/lovesport/fitCommon/a;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/lovesport/fitCommon/b;);
a=0;//     invoke-virtual {v0, v1}, Lcom/lovesport/fitCommon/WukongVideoView;->setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V
a=0;// 
a=0;//     new-instance v0, Lcom/lovesport/fitCommon/d;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lovesport/fitCommon/d;);
a=0;//     invoke-direct {v0, p0}, Lcom/lovesport/fitCommon/d;-><init>(Lcom/lovesport/fitCommon/a;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lovesport/fitCommon/d;);
a=0;//     iput-object v0, p0, Lcom/lovesport/fitCommon/a;->f:Landroid/os/Handler;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/a;->i:Landroid/view/ViewGroup;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/lovesport/fitCommon/a;->a(Landroid/view/ViewGroup;)V
a=0;// 
a=0;//     new-instance v0, Lcom/lovesport/fitCommon/g;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lovesport/fitCommon/g;);
a=0;//     invoke-direct {v0, p0}, Lcom/lovesport/fitCommon/g;-><init>(Lcom/lovesport/fitCommon/a;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lovesport/fitCommon/g;);
a=0;//     iput-object v0, p0, Lcom/lovesport/fitCommon/a;->j:Lcom/lovesport/fitCommon/g;
a=0;// 
a=0;//     new-instance v0, Landroid/content/IntentFilter;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/IntentFilter;);
a=0;//     invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/IntentFilter;);
a=0;//     const-string v1, "android.intent.action.SCREEN_ON"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v1, "android.intent.action.SCREEN_OFF"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v1, "android.net.conn.CONNECTIVITY_CHANGE"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v1, p0, Lcom/lovesport/fitCommon/a;->j:Lcom/lovesport/fitCommon/g;
a=0;// 
a=0;//     invoke-virtual {p0, v1, v0}, Lcom/lovesport/fitCommon/a;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/pushscreen/PushScreenVideoActivity;->b:Landroid/widget/TextView;
a=0;// 
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/pushscreen/PushScreenVideoActivity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "INTENT_KEY_VBIDEO_PATH"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "INTENT_KEY_MIME_TYPE"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "INTENT_KEY_REMOTE_ADDR"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0, v1, v2}, Lcom/wukongtv/wkhelper/a/l;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/wukongtv/wkhelper/pushscreen/PushScreenVideoActivity;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-direct {p0, v5}, Lcom/wukongtv/wkhelper/pushscreen/PushScreenVideoActivity;->a(Z)V
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Boolean);v2=(Uninit);v3=(Uninit);
a=0;//     invoke-virtual {p0, v0}, Lcom/lovesport/fitCommon/a;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/a;->g:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Lcom/lovesport/fitCommon/e;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lovesport/fitCommon/e;);
a=0;//     invoke-direct {v0, p0}, Lcom/lovesport/fitCommon/e;-><init>(Lcom/lovesport/fitCommon/a;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lovesport/fitCommon/e;);
a=0;//     sget-object v1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/concurrent/Executor;);
a=0;//     new-array v2, v5, [Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcom/lovesport/fitCommon/a;->g:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     aput-object v3, v2, v4
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/lovesport/fitCommon/e;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
