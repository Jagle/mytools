package com.alimama.mobile.csdk.umupdate.a; class e { void a() { int a;
a=0;// .class final Lcom/alimama/mobile/csdk/umupdate/a/e;
a=0;// .super Ljava/util/concurrent/FutureTask;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/alimama/mobile/csdk/umupdate/a/b;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/alimama/mobile/csdk/umupdate/a/b;Ljava/util/concurrent/Callable;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/alimama/mobile/csdk/umupdate/a/e;->a:Lcom/alimama/mobile/csdk/umupdate/a/b;
a=0;// 
a=0;//     invoke-direct {p0, p2}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/alimama/mobile/csdk/umupdate/a/e;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected final done()V
a=0;//     .locals 3
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/e;->a:Lcom/alimama/mobile/csdk/umupdate/a/b;
a=0;// 
a=0;//     #v0=(Reference,Lcom/alimama/mobile/csdk/umupdate/a/b;);
a=0;//     invoke-virtual {p0}, Lcom/alimama/mobile/csdk/umupdate/a/e;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcom/alimama/mobile/csdk/umupdate/a/b;->b(Lcom/alimama/mobile/csdk/umupdate/a/b;Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_2
a=0;// 
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/InterruptedException;);
a=0;//     const-string v1, "AsyncTask"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_1
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/ExecutionException;);
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     const-string v2, "An error occured while executing doInBackground()"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/util/concurrent/ExecutionException;->getCause()Ljava/lang/Throwable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// 
a=0;//     :catch_2
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/CancellationException;);
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/e;->a:Lcom/alimama/mobile/csdk/umupdate/a/b;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v0, v1}, Lcom/alimama/mobile/csdk/umupdate/a/b;->b(Lcom/alimama/mobile/csdk/umupdate/a/b;Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
