package com.alimama.mobile.csdk.umupdate.a; class i { void a() { int a;
a=0;// .class final Lcom/alimama/mobile/csdk/umupdate/a/i;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/util/concurrent/Executor;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final a:Ljava/util/ArrayDeque;
a=0;// 
a=0;// .field b:Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/alimama/mobile/csdk/umupdate/a/i;);
a=0;//     new-instance v0, Ljava/util/ArrayDeque;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayDeque;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayDeque;);
a=0;//     iput-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/i;->a:Ljava/util/ArrayDeque;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(B)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/alimama/mobile/csdk/umupdate/a/i;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/alimama/mobile/csdk/umupdate/a/i;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected final declared-synchronized a()V
a=0;//     .locals 2
a=0;// 
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/i;->a:Ljava/util/ArrayDeque;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayDeque;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Runnable;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/i;->b:Ljava/lang/Runnable;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     sget-object v0, Lcom/alimama/mobile/csdk/umupdate/a/b;->a:Ljava/util/concurrent/Executor;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/alimama/mobile/csdk/umupdate/a/i;->b:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Runnable;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public final declared-synchronized execute(Ljava/lang/Runnable;)V
a=0;//     .locals 2
a=0;// 
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/i;->a:Ljava/util/ArrayDeque;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayDeque;);
a=0;//     new-instance v1, Lcom/alimama/mobile/csdk/umupdate/a/j;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/alimama/mobile/csdk/umupdate/a/j;);
a=0;//     invoke-direct {v1, p0, p1}, Lcom/alimama/mobile/csdk/umupdate/a/j;-><init>(Lcom/alimama/mobile/csdk/umupdate/a/i;Ljava/lang/Runnable;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/alimama/mobile/csdk/umupdate/a/j;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z
a=0;// 
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/i;->b:Ljava/lang/Runnable;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/alimama/mobile/csdk/umupdate/a/i;->a()V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     :cond_0
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
}}
