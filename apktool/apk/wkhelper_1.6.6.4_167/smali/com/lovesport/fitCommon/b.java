package com.lovesport.fitCommon; class b { void a() { int a;
a=0;// .class public final Lcom/lovesport/fitCommon/b;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/media/MediaPlayer$OnErrorListener;
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
a=0;//     iput-object p1, p0, Lcom/lovesport/fitCommon/b;->a:Lcom/lovesport/fitCommon/a;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/lovesport/fitCommon/b;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final onError(Landroid/media/MediaPlayer;II)Z
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/b;->a:Lcom/lovesport/fitCommon/a;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lovesport/fitCommon/a;);
a=0;//     invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Boolean;);
a=0;//     invoke-static {v0, v1}, Lcom/lovesport/fitCommon/a;->a(Lcom/lovesport/fitCommon/a;Ljava/lang/Boolean;)Ljava/lang/Boolean;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/b;->a:Lcom/lovesport/fitCommon/a;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/lovesport/fitCommon/a;->a(Lcom/lovesport/fitCommon/a;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "http"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     new-instance v0, Lcom/lovesport/fitCommon/e;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lovesport/fitCommon/e;);
a=0;//     iget-object v1, p0, Lcom/lovesport/fitCommon/b;->a:Lcom/lovesport/fitCommon/a;
a=0;// 
a=0;//     invoke-direct {v0, v1}, Lcom/lovesport/fitCommon/e;-><init>(Lcom/lovesport/fitCommon/a;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lovesport/fitCommon/e;);
a=0;//     sget-object v1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;
a=0;// 
a=0;//     new-array v2, v4, [Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcom/lovesport/fitCommon/b;->a:Lcom/lovesport/fitCommon/a;
a=0;// 
a=0;//     #v3=(Reference,Lcom/lovesport/fitCommon/a;);
a=0;//     invoke-static {v3}, Lcom/lovesport/fitCommon/a;->b(Lcom/lovesport/fitCommon/a;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     aput-object v3, v2, v5
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/lovesport/fitCommon/e;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/b;->a:Lcom/lovesport/fitCommon/a;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/lovesport/fitCommon/b;->a:Lcom/lovesport/fitCommon/a;
a=0;// 
a=0;//     sget v2, Lcom/lovesport/fitCommon/l;->local_play_error:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Lcom/lovesport/fitCommon/a;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v4
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Reference,Ljava/lang/String;);v2=(Uninit);v3=(Uninit);
a=0;//     const/16 v0, 0x64
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-eq p2, v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/b;->a:Lcom/lovesport/fitCommon/a;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lovesport/fitCommon/a;);
a=0;//     invoke-static {v0}, Lcom/lovesport/fitCommon/a;->c(Lcom/lovesport/fitCommon/a;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/lovesport/fitCommon/b;->a:Lcom/lovesport/fitCommon/a;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/lovesport/fitCommon/a;->d(Lcom/lovesport/fitCommon/a;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
