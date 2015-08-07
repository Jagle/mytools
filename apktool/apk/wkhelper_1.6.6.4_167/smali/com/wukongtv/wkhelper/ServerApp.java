package com.wukongtv.wkhelper; class ServerApp { void a() { int a;
a=0;// .class public Lcom/wukongtv/wkhelper/ServerApp;
a=0;// .super Landroid/app/Application;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/app/Application;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/ServerApp;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onCreate()V
a=0;//     .locals 10
a=0;// 
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-super {p0}, Landroid/app/Application;->onCreate()V
a=0;// 
a=0;//     new-instance v0, Lcom/c/a/b/e;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/c/a/b/e;);
a=0;//     invoke-direct {v0}, Lcom/c/a/b/e;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/c/a/b/e;);
a=0;//     iput-boolean v9, v0, Lcom/c/a/b/e;->i:Z
a=0;// 
a=0;//     iput-boolean v9, v0, Lcom/c/a/b/e;->h:Z
a=0;// 
a=0;//     iput-boolean v9, v0, Lcom/c/a/b/e;->g:Z
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/c/a/b/e;->a()Lcom/c/a/b/d;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/c/a/b/d;);
a=0;//     const-string v2, "WKHelper"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/ServerApp;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     const-string v0, "Download"
a=0;// 
a=0;//     invoke-static {v0}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v0, v4, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/a/h;->a(Ljava/io/File;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_10
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v4=(Conflicted);
a=0;//     new-instance v2, Lcom/c/a/b/i;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/c/a/b/i;);
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/ServerApp;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v3}, Lcom/c/a/b/i;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/c/a/b/i;);
a=0;//     iget-object v3, v2, Lcom/c/a/b/i;->c:Ljava/util/concurrent/Executor;
a=0;// 
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     iget-object v3, v2, Lcom/c/a/b/i;->d:Ljava/util/concurrent/Executor;
a=0;// 
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     :cond_1
a=0;//     const-string v3, "threadPoolSize(), threadPriority() and tasksProcessingOrder() calls can overlap taskExecutor() and taskExecutorForCachedImages() calls."
a=0;// 
a=0;//     new-array v4, v8, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v3, v4}, Lcom/c/a/c/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     :cond_2
a=0;//     #v4=(Conflicted);
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     iput v3, v2, Lcom/c/a/b/i;->g:I
a=0;// 
a=0;//     iget-object v3, v2, Lcom/c/a/b/i;->c:Ljava/util/concurrent/Executor;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/concurrent/Executor;);
a=0;//     if-nez v3, :cond_3
a=0;// 
a=0;//     iget-object v3, v2, Lcom/c/a/b/i;->d:Ljava/util/concurrent/Executor;
a=0;// 
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     :cond_3
a=0;//     const-string v3, "threadPoolSize(), threadPriority() and tasksProcessingOrder() calls can overlap taskExecutor() and taskExecutorForCachedImages() calls."
a=0;// 
a=0;//     new-array v4, v8, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v3, v4}, Lcom/c/a/c/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     :cond_4
a=0;//     #v4=(Conflicted);
a=0;//     const/4 v3, 0x4
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     iput v3, v2, Lcom/c/a/b/i;->h:I
a=0;// 
a=0;//     iput-object v1, v2, Lcom/c/a/b/i;->s:Lcom/c/a/b/d;
a=0;// 
a=0;//     new-instance v1, Lcom/c/a/a/a/a/b;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/c/a/a/a/a/b;);
a=0;//     invoke-direct {v1, v0}, Lcom/c/a/a/a/a/b;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/c/a/a/a/a/b;);
a=0;//     iget-wide v4, v2, Lcom/c/a/b/i;->l:J
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     const-wide/16 v6, 0x0
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     cmp-long v0, v4, v6
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gtz v0, :cond_5
a=0;// 
a=0;//     iget v0, v2, Lcom/c/a/b/i;->m:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_6
a=0;// 
a=0;//     :cond_5
a=0;//     const-string v0, "diskCache(), diskCacheSize() and diskCacheFileCount calls overlap each other"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-array v3, v8, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v3}, Lcom/c/a/c/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v0, v2, Lcom/c/a/b/i;->p:Lcom/c/a/a/a/b/a;
a=0;// 
a=0;//     #v0=(Reference,Lcom/c/a/a/a/b/a;);
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     const-string v0, "diskCache() and diskCacheFileNameGenerator() calls overlap each other"
a=0;// 
a=0;//     new-array v3, v8, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v3}, Lcom/c/a/c/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     :cond_7
a=0;//     #v3=(Conflicted);
a=0;//     iput-object v1, v2, Lcom/c/a/b/i;->o:Lcom/c/a/a/a/b;
a=0;// 
a=0;//     iget-object v0, v2, Lcom/c/a/b/i;->c:Ljava/util/concurrent/Executor;
a=0;// 
a=0;//     if-nez v0, :cond_12
a=0;// 
a=0;//     iget v0, v2, Lcom/c/a/b/i;->g:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, v2, Lcom/c/a/b/i;->h:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v3, v2, Lcom/c/a/b/i;->j:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v0, v1, v3}, Lcom/c/a/b/a;->a(III)Ljava/util/concurrent/Executor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/Executor;);
a=0;//     iput-object v0, v2, Lcom/c/a/b/i;->c:Ljava/util/concurrent/Executor;
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v0, v2, Lcom/c/a/b/i;->d:Ljava/util/concurrent/Executor;
a=0;// 
a=0;//     if-nez v0, :cond_13
a=0;// 
a=0;//     iget v0, v2, Lcom/c/a/b/i;->g:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, v2, Lcom/c/a/b/i;->h:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v3, v2, Lcom/c/a/b/i;->j:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v0, v1, v3}, Lcom/c/a/b/a;->a(III)Ljava/util/concurrent/Executor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/Executor;);
a=0;//     iput-object v0, v2, Lcom/c/a/b/i;->d:Ljava/util/concurrent/Executor;
a=0;// 
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v0, v2, Lcom/c/a/b/i;->o:Lcom/c/a/a/a/b;
a=0;// 
a=0;//     if-nez v0, :cond_9
a=0;// 
a=0;//     iget-object v0, v2, Lcom/c/a/b/i;->p:Lcom/c/a/a/a/b/a;
a=0;// 
a=0;//     if-nez v0, :cond_8
a=0;// 
a=0;//     new-instance v0, Lcom/c/a/a/a/b/b;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/c/a/a/a/b/b;);
a=0;//     invoke-direct {v0}, Lcom/c/a/a/a/b/b;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/c/a/a/a/b/b;);
a=0;//     iput-object v0, v2, Lcom/c/a/b/i;->p:Lcom/c/a/a/a/b/a;
a=0;// 
a=0;//     :cond_8
a=0;//     iget-object v0, v2, Lcom/c/a/b/i;->b:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v1, v2, Lcom/c/a/b/i;->p:Lcom/c/a/a/a/b/a;
a=0;// 
a=0;//     #v1=(Reference,Lcom/c/a/a/a/b/a;);
a=0;//     iget-wide v4, v2, Lcom/c/a/b/i;->l:J
a=0;// 
a=0;//     iget v3, v2, Lcom/c/a/b/i;->m:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v0, v1, v4, v5, v3}, Lcom/c/a/b/a;->a(Landroid/content/Context;Lcom/c/a/a/a/b/a;JI)Lcom/c/a/a/a/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v2, Lcom/c/a/b/i;->o:Lcom/c/a/a/a/b;
a=0;// 
a=0;//     :cond_9
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v0, v2, Lcom/c/a/b/i;->n:Lcom/c/a/a/b/a;
a=0;// 
a=0;//     if-nez v0, :cond_b
a=0;// 
a=0;//     iget v0, v2, Lcom/c/a/b/i;->k:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_a
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Runtime;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Runtime;->maxMemory()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const-wide/16 v4, 0x8
a=0;// 
a=0;//     div-long/2addr v0, v4
a=0;// 
a=0;//     long-to-int v0, v0
a=0;// 
a=0;//     :cond_a
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     new-instance v1, Lcom/c/a/a/b/a/b;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/c/a/a/b/a/b;);
a=0;//     invoke-direct {v1, v0}, Lcom/c/a/a/b/a/b;-><init>(I)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/c/a/a/b/a/b;);
a=0;//     iput-object v1, v2, Lcom/c/a/b/i;->n:Lcom/c/a/a/b/a;
a=0;// 
a=0;//     :cond_b
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-boolean v0, v2, Lcom/c/a/b/i;->i:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_c
a=0;// 
a=0;//     new-instance v0, Lcom/c/a/a/b/a/a;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/c/a/a/b/a/a;);
a=0;//     iget-object v1, v2, Lcom/c/a/b/i;->n:Lcom/c/a/a/b/a;
a=0;// 
a=0;//     #v1=(Reference,Lcom/c/a/a/b/a;);
a=0;//     new-instance v3, Lcom/c/a/c/g;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/c/a/c/g;);
a=0;//     invoke-direct {v3}, Lcom/c/a/c/g;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Lcom/c/a/c/g;);
a=0;//     invoke-direct {v0, v1, v3}, Lcom/c/a/a/b/a/a;-><init>(Lcom/c/a/a/b/a;Ljava/util/Comparator;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/c/a/a/b/a/a;);
a=0;//     iput-object v0, v2, Lcom/c/a/b/i;->n:Lcom/c/a/a/b/a;
a=0;// 
a=0;//     :cond_c
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v0, v2, Lcom/c/a/b/i;->q:Lcom/c/a/b/d/c;
a=0;// 
a=0;//     #v0=(Reference,Lcom/c/a/b/d/c;);
a=0;//     if-nez v0, :cond_d
a=0;// 
a=0;//     iget-object v0, v2, Lcom/c/a/b/i;->b:Landroid/content/Context;
a=0;// 
a=0;//     new-instance v1, Lcom/c/a/b/d/a;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/c/a/b/d/a;);
a=0;//     invoke-direct {v1, v0}, Lcom/c/a/b/d/a;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/c/a/b/d/a;);
a=0;//     iput-object v1, v2, Lcom/c/a/b/i;->q:Lcom/c/a/b/d/c;
a=0;// 
a=0;//     :cond_d
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, v2, Lcom/c/a/b/i;->r:Lcom/c/a/b/b/d;
a=0;// 
a=0;//     if-nez v0, :cond_e
a=0;// 
a=0;//     iget-boolean v0, v2, Lcom/c/a/b/i;->t:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     new-instance v1, Lcom/c/a/b/b/a;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/c/a/b/b/a;);
a=0;//     invoke-direct {v1, v0}, Lcom/c/a/b/b/a;-><init>(Z)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/c/a/b/b/a;);
a=0;//     iput-object v1, v2, Lcom/c/a/b/i;->r:Lcom/c/a/b/b/d;
a=0;// 
a=0;//     :cond_e
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, v2, Lcom/c/a/b/i;->s:Lcom/c/a/b/d;
a=0;// 
a=0;//     #v0=(Reference,Lcom/c/a/b/d;);
a=0;//     if-nez v0, :cond_f
a=0;// 
a=0;//     new-instance v0, Lcom/c/a/b/e;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/c/a/b/e;);
a=0;//     invoke-direct {v0}, Lcom/c/a/b/e;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/c/a/b/e;);
a=0;//     invoke-virtual {v0}, Lcom/c/a/b/e;->a()Lcom/c/a/b/d;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v2, Lcom/c/a/b/i;->s:Lcom/c/a/b/d;
a=0;// 
a=0;//     :cond_f
a=0;//     new-instance v0, Lcom/c/a/b/g;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/c/a/b/g;);
a=0;//     invoke-direct {v0, v2, v8}, Lcom/c/a/b/g;-><init>(Lcom/c/a/b/i;B)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/c/a/b/g;);
a=0;//     invoke-static {}, Lcom/c/a/b/f;->a()Lcom/c/a/b/f;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/c/a/b/f;);
a=0;//     invoke-virtual {v1, v0}, Lcom/c/a/b/f;->a(Lcom/c/a/b/g;)V
a=0;// 
a=0;//     invoke-static {p0}, Lcom/lovesport/lc/a;->a(Landroid/content/Context;)V
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_10
a=0;//     #v3=(Reference,Landroid/content/Context;);v4=(Boolean);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v3, v0}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v0, v4, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     if-eqz v4, :cond_11
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/a/h;->a(Ljava/io/File;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     :cond_11
a=0;//     #v2=(Conflicted);
a=0;//     invoke-virtual {v3}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_12
a=0;//     #v2=(Reference,Lcom/c/a/b/i;);v3=(Conflicted);v4=(LongLo);v5=(LongHi);v6=(LongLo);v7=(LongHi);
a=0;//     iput-boolean v9, v2, Lcom/c/a/b/i;->e:Z
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_13
a=0;//     #v1=(Conflicted);
a=0;//     iput-boolean v9, v2, Lcom/c/a/b/i;->f:Z
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// .end method
}}
