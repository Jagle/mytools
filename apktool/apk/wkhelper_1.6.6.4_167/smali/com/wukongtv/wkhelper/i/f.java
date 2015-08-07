package com.wukongtv.wkhelper.i; class f { void a() { int a;
a=0;// .class public final Lcom/wukongtv/wkhelper/i/f;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/wukongtv/wkhelper/i/e;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public a:Lcom/wukongtv/wkhelper/i/c;
a=0;// 
a=0;// .field b:Landroid/content/Context;
a=0;// 
a=0;// .field c:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;)V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/i/f;);
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/i/c;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/i/c;);
a=0;//     invoke-direct {v0, p2}, Lcom/wukongtv/wkhelper/i/c;-><init>(Landroid/os/Handler;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/i/c;);
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/i/f;->a:Lcom/wukongtv/wkhelper/i/c;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/i/f;->a:Lcom/wukongtv/wkhelper/i/c;
a=0;// 
a=0;//     const/16 v1, 0x1f40
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     iput v1, v0, Lcom/wukongtv/wkhelper/i/c;->b:I
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/i/f;->a:Lcom/wukongtv/wkhelper/i/c;
a=0;// 
a=0;//     iput-object p0, v0, Lcom/wukongtv/wkhelper/i/c;->a:Lcom/wukongtv/wkhelper/i/e;
a=0;// 
a=0;//     iput-object p1, p0, Lcom/wukongtv/wkhelper/i/f;->b:Landroid/content/Context;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a()V
a=0;//     .locals 4
a=0;// 
a=0;//     iget v0, p0, Lcom/wukongtv/wkhelper/i/f;->c:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/i/g;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/i/g;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {v0, p0, v1}, Lcom/wukongtv/wkhelper/i/g;-><init>(Lcom/wukongtv/wkhelper/i/f;B)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/i/g;);
a=0;//     sget-object v1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/concurrent/Executor;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/Void;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Void;);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/wukongtv/wkhelper/i/g;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;
a=0;//     :try_end_0
a=0;//     .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/i/f;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/i/f;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/wukongtv/wkhelper/a/g;->b(Landroid/content/Context;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/i/f;->b:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/wukongtv/wkhelper/a;->a(Landroid/content/Context;)J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     long-to-int v1, v2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     new-instance v2, Lcom/wukongtv/wkhelper/b/a;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/wukongtv/wkhelper/b/a;);
a=0;//     iget v3, p0, Lcom/wukongtv/wkhelper/i/f;->c:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-direct {v2, v0, v1, v3}, Lcom/wukongtv/wkhelper/b/a;-><init>(III)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/wukongtv/wkhelper/b/a;);
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/h/a;->a()Lcom/wukongtv/wkhelper/h/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/h/a;);
a=0;//     invoke-virtual {v0, v2}, Lcom/wukongtv/wkhelper/h/a;->a(Lcom/wukongtv/wkhelper/b/a;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/RejectedExecutionException;);
a=0;//     goto :goto_0
a=0;// .end method
}}
