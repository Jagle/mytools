package com.b.a.a; class h { void a() { int a;
a=0;// .class public abstract Lcom/b/a/a/h;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/b/a/a/ac;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field a:Ljava/lang/String;
a=0;// 
a=0;// .field b:Z
a=0;// 
a=0;// .field private c:Landroid/os/Handler;
a=0;// 
a=0;// .field private d:Ljava/net/URI;
a=0;// 
a=0;// .field private e:[Lorg/apache/http/Header;
a=0;// 
a=0;// .field private f:Landroid/os/Looper;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, v0}, Lcom/b/a/a/h;-><init>(B)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/b/a/a/h;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(B)V
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/b/a/a/h;);
a=0;//     const-string v0, "UTF-8"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/b/a/a/h;->a:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v3, p0, Lcom/b/a/a/h;->d:Ljava/net/URI;
a=0;// 
a=0;//     iput-object v3, p0, Lcom/b/a/a/h;->e:[Lorg/apache/http/Header;
a=0;// 
a=0;//     iput-object v3, p0, Lcom/b/a/a/h;->f:Landroid/os/Looper;
a=0;// 
a=0;//     invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/b/a/a/h;->f:Landroid/os/Looper;
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lcom/b/a/a/h;->f:Landroid/os/Looper;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Looper;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const-string v1, "AsyncHttpResponseHandler"
a=0;// 
a=0;//     const-string v2, "Current thread has not called Looper.prepare(). Forcing synchronous mode."
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v2=(Conflicted);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     iget-object v1, p0, Lcom/b/a/a/h;->c:Landroid/os/Handler;
a=0;// 
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     new-instance v1, Lcom/b/a/a/i;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/b/a/a/i;);
a=0;//     iget-object v2, p0, Lcom/b/a/a/h;->f:Landroid/os/Looper;
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Looper;);
a=0;//     invoke-direct {v1, p0, v2}, Lcom/b/a/a/i;-><init>(Lcom/b/a/a/h;Landroid/os/Looper;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/b/a/a/i;);
a=0;//     iput-object v1, p0, Lcom/b/a/a/h;->c:Landroid/os/Handler;
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     iput-boolean v0, p0, Lcom/b/a/a/h;->b:Z
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_2
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v1, p0, Lcom/b/a/a/h;->c:Landroid/os/Handler;
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     iput-object v3, p0, Lcom/b/a/a/h;->c:Landroid/os/Handler;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a(ILjava/lang/Object;)Landroid/os/Message;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/b/a/a/h;->c:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     invoke-static {v0, p1, p2}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private b(Landroid/os/Message;)V
a=0;//     .locals 2
a=0;// 
a=0;//     iget-boolean v0, p0, Lcom/b/a/a/h;->b:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/b/a/a/h;->c:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {p0, p1}, Lcom/b/a/a/h;->a(Landroid/os/Message;)V
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Reference,Landroid/os/Handler;);v1=(Uninit);
a=0;//     invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/b/a/a/h;->c:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Boolean);
a=0;//     const-string v1, "handler should not be null!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcom/b/a/a/a;->a(ZLjava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/b/a/a/h;->c:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(I)V
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Lcom/b/a/a/h;->a(ILjava/lang/Object;)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Message;);
a=0;//     invoke-direct {p0, v0}, Lcom/b/a/a/h;->b(Landroid/os/Message;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(II)V
a=0;//     .locals 8
a=0;// 
a=0;//     const-string v2, "Progress %d from %d (%2.0f%%)"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v3, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v1, v3, v0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     aput-object v1, v3, v0
a=0;// 
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     if-lez p2, :cond_0
a=0;// 
a=0;//     int-to-double v0, p1
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     const-wide/high16 v6, 0x3ff0000000000000L
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     mul-double/2addr v0, v6
a=0;// 
a=0;//     int-to-double v6, p2
a=0;// 
a=0;//     #v6=(DoubleLo);v7=(DoubleHi);
a=0;//     div-double/2addr v0, v6
a=0;// 
a=0;//     const-wide/high16 v6, 0x4059000000000000L
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     mul-double/2addr v0, v6
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(LongLo);v1=(LongHi);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Double;);
a=0;//     aput-object v0, v3, v4
a=0;// 
a=0;//     invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(One);v1=(Reference,Ljava/lang/Integer;);v6=(Uninit);v7=(Uninit);
a=0;//     const-wide/high16 v0, -0x4010000000000000L
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public abstract a(I[Lorg/apache/http/Header;[B)V
a=0;// .end method
a=0;// 
a=0;// .method public abstract a(I[Lorg/apache/http/Header;[BLjava/lang/Throwable;)V
a=0;// .end method
a=0;// 
a=0;// .method protected final a(Landroid/os/Message;)V
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v6, 0x3
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iget v0, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     :goto_0
a=0;//     :pswitch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Integer);
a=0;//     return-void
a=0;// 
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);v3=(Null);
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, [Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, [Ljava/lang/Object;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     array-length v1, v0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt v1, v6, :cond_0
a=0;// 
a=0;//     aget-object v1, v0, v3
a=0;// 
a=0;//     #v1=(Null);
a=0;//     check-cast v1, Ljava/lang/Integer;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     aget-object v1, v0, v4
a=0;// 
a=0;//     #v1=(Null);
a=0;//     check-cast v1, [Lorg/apache/http/Header;
a=0;// 
a=0;//     #v1=(Reference,[Lorg/apache/http/Header;);
a=0;//     check-cast v1, [Lorg/apache/http/Header;
a=0;// 
a=0;//     aget-object v0, v0, v5
a=0;// 
a=0;//     #v0=(Null);
a=0;//     check-cast v0, [B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     check-cast v0, [B
a=0;// 
a=0;//     invoke-virtual {p0, v2, v1, v0}, Lcom/b/a/a/h;->a(I[Lorg/apache/http/Header;[B)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Uninit);
a=0;//     const-string v0, "AsyncHttpResponseHandler"
a=0;// 
a=0;//     const-string v1, "SUCCESS_MESSAGE didn\'t got enough params"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_2
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, [Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, [Ljava/lang/Object;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     array-length v1, v0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-lt v1, v2, :cond_1
a=0;// 
a=0;//     aget-object v1, v0, v3
a=0;// 
a=0;//     #v1=(Null);
a=0;//     check-cast v1, Ljava/lang/Integer;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     aget-object v1, v0, v4
a=0;// 
a=0;//     #v1=(Null);
a=0;//     check-cast v1, [Lorg/apache/http/Header;
a=0;// 
a=0;//     #v1=(Reference,[Lorg/apache/http/Header;);
a=0;//     check-cast v1, [Lorg/apache/http/Header;
a=0;// 
a=0;//     aget-object v2, v0, v5
a=0;// 
a=0;//     #v2=(Null);
a=0;//     check-cast v2, [B
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     check-cast v2, [B
a=0;// 
a=0;//     aget-object v0, v0, v6
a=0;// 
a=0;//     #v0=(Null);
a=0;//     check-cast v0, Ljava/lang/Throwable;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {p0, v3, v1, v2, v0}, Lcom/b/a/a/h;->a(I[Lorg/apache/http/Header;[BLjava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Null);
a=0;//     const-string v0, "AsyncHttpResponseHandler"
a=0;// 
a=0;//     const-string v1, "FAILURE_MESSAGE didn\'t got enough params"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_3
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);
a=0;//     invoke-virtual {p0}, Lcom/b/a/a/h;->c()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_4
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, [Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, [Ljava/lang/Object;
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     array-length v1, v0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt v1, v5, :cond_2
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     aget-object v1, v0, v1
a=0;// 
a=0;//     check-cast v1, Ljava/lang/Integer;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     aget-object v0, v0, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     check-cast v0, Ljava/lang/Integer;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v1, v0}, Lcom/b/a/a/h;->a(II)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const-string v1, "AsyncHttpResponseHandler"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "custom onProgress contains an error"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v2=(Uninit);
a=0;//     const-string v0, "AsyncHttpResponseHandler"
a=0;// 
a=0;//     const-string v1, "PROGRESS_MESSAGE didn\'t got enough params"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :pswitch_5
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, [Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, [Ljava/lang/Object;
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     array-length v1, v0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, v4, :cond_3
a=0;// 
a=0;//     aget-object v0, v0, v3
a=0;// 
a=0;//     #v0=(Null);
a=0;//     check-cast v0, Ljava/lang/Integer;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const-string v1, "Request retry no. %d"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-array v2, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v0, v2, v3
a=0;// 
a=0;//     invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);v2=(Uninit);
a=0;//     const-string v0, "AsyncHttpResponseHandler"
a=0;// 
a=0;//     const-string v1, "RETRY_MESSAGE didn\'t get enough params"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//         :pswitch_0
a=0;//         :pswitch_4
a=0;//         :pswitch_5
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method protected final a(Ljava/lang/Runnable;)V
a=0;//     .locals 2
a=0;// 
a=0;//     iget-boolean v0, p0, Lcom/b/a/a/h;->b:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/b/a/a/h;->c:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     invoke-interface {p1}, Ljava/lang/Runnable;->run()V
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/os/Handler;);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/b/a/a/h;->c:Landroid/os/Handler;
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Boolean);
a=0;//     const-string v1, "handler should not be null!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcom/b/a/a/a;->a(ZLjava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/b/a/a/h;->c:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public final a(Ljava/net/URI;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/b/a/a/h;->d:Ljava/net/URI;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final a(Lorg/apache/http/HttpResponse;)V
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-interface {p1}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/StatusLine;);
a=0;//     invoke-interface {p1}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lorg/apache/http/HttpEntity;);
a=0;//     invoke-virtual {p0, v1}, Lcom/b/a/a/h;->a(Lorg/apache/http/HttpEntity;)[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v2}, Ljava/lang/Thread;->isInterrupted()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/StatusLine;->getStatusCode()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/16 v3, 0x12c
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     if-lt v2, v3, :cond_1
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/StatusLine;->getStatusCode()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     invoke-interface {p1}, Lorg/apache/http/HttpResponse;->getAllHeaders()[Lorg/apache/http/Header;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,[Lorg/apache/http/Header;);
a=0;//     new-instance v4, Lorg/apache/http/client/HttpResponseException;
a=0;// 
a=0;//     #v4=(UninitRef,Lorg/apache/http/client/HttpResponseException;);
a=0;//     invoke-interface {v0}, Lorg/apache/http/StatusLine;->getStatusCode()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-interface {v0}, Lorg/apache/http/StatusLine;->getReasonPhrase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v4, v5, v0}, Lorg/apache/http/client/HttpResponseException;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Lorg/apache/http/client/HttpResponseException;);
a=0;//     invoke-virtual {p0, v2, v3, v1, v4}, Lcom/b/a/a/h;->b(I[Lorg/apache/http/Header;[BLjava/lang/Throwable;)V
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Reference,Lorg/apache/http/StatusLine;);v1=(Reference,[B);v2=(Integer);v3=(PosShort);v4=(Null);v5=(Uninit);
a=0;//     invoke-interface {v0}, Lorg/apache/http/StatusLine;->getStatusCode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-interface {p1}, Lorg/apache/http/HttpResponse;->getAllHeaders()[Lorg/apache/http/Header;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,[Lorg/apache/http/Header;);
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v0, v3, v4
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     aput-object v2, v3, v0
a=0;// 
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     aput-object v1, v3, v0
a=0;// 
a=0;//     invoke-direct {p0, v4, v3}, Lcom/b/a/a/h;->a(ILjava/lang/Object;)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Message;);
a=0;//     invoke-direct {p0, v0}, Lcom/b/a/a/h;->b(Landroid/os/Message;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final a([Lorg/apache/http/Header;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/b/a/a/h;->e:[Lorg/apache/http/Header;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final a()Z
a=0;//     .locals 1
a=0;// 
a=0;//     iget-boolean v0, p0, Lcom/b/a/a/h;->b:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method a(Lorg/apache/http/HttpEntity;)[B
a=0;//     .locals 10
a=0;// 
a=0;//     const-wide/16 v8, 0x0
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     const/16 v0, 0x1000
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     if-eqz p1, :cond_4
a=0;// 
a=0;//     invoke-interface {p1}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/io/InputStream;);
a=0;//     if-eqz v5, :cond_4
a=0;// 
a=0;//     invoke-interface {p1}, Lorg/apache/http/HttpEntity;->getContentLength()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     const-wide/32 v6, 0x7fffffff
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     cmp-long v1, v2, v6
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "HTTP entity too large to be buffered in memory"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(PosShort);v1=(Byte);
a=0;//     cmp-long v1, v2, v8
a=0;// 
a=0;//     if-gtz v1, :cond_1
a=0;// 
a=0;//     :goto_0
a=0;//     :try_start_0
a=0;//     #v0=(Integer);
a=0;//     new-instance v6, Lorg/apache/http/util/ByteArrayBuffer;
a=0;// 
a=0;//     #v6=(UninitRef,Lorg/apache/http/util/ByteArrayBuffer;);
a=0;//     invoke-direct {v6, v0}, Lorg/apache/http/util/ByteArrayBuffer;-><init>(I)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     #v6=(Reference,Lorg/apache/http/util/ByteArrayBuffer;);
a=0;//     const/16 v0, 0x1000
a=0;// 
a=0;//     :try_start_1
a=0;//     #v0=(PosShort);
a=0;//     new-array v7, v0, [B
a=0;// 
a=0;//     #v7=(Reference,[B);
a=0;//     move v0, v4
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);v1=(Conflicted);v4=(Integer);
a=0;//     invoke-virtual {v5, v7}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-eq v1, v4, :cond_3
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v4}, Ljava/lang/Thread;->isInterrupted()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_3
a=0;// 
a=0;//     add-int v4, v0, v1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v6, v7, v0, v1}, Lorg/apache/http/util/ByteArrayBuffer;->append([BII)V
a=0;// 
a=0;//     cmp-long v0, v2, v8
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gtz v0, :cond_2
a=0;// 
a=0;//     const-wide/16 v0, 0x1
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     long-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v4, v0}, Lcom/b/a/a/h;->b(II)V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     move v0, v4
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(PosShort);v1=(Byte);v4=(Null);v6=(LongLo);v7=(LongHi);
a=0;//     long-to-int v0, v2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Byte);v1=(Integer);v4=(Integer);v6=(Reference,Lorg/apache/http/util/ByteArrayBuffer;);v7=(Reference,[B);
a=0;//     move-wide v0, v2
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_3
a=0;//     :try_start_2
a=0;//     #v0=(Integer);v1=(Integer);v4=(Byte);
a=0;//     invoke-static {v5}, Lcom/b/a/a/b;->a(Ljava/io/InputStream;)V
a=0;// 
a=0;//     invoke-static {p1}, Lcom/b/a/a/b;->a(Lorg/apache/http/HttpEntity;)V
a=0;// 
a=0;//     invoke-virtual {v6}, Lorg/apache/http/util/ByteArrayBuffer;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_3
a=0;//     #v0=(Reference,[B);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(LongLo);v3=(LongHi);v4=(Conflicted);v5=(Reference,Ljava/io/InputStream;);v6=(Reference,Lorg/apache/http/util/ByteArrayBuffer;);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v5}, Lcom/b/a/a/b;->a(Ljava/io/InputStream;)V
a=0;// 
a=0;//     invoke-static {p1}, Lcom/b/a/a/b;->a(Lorg/apache/http/HttpEntity;)V
a=0;// 
a=0;//     throw v0
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/OutOfMemoryError;);
a=0;//     invoke-static {}, Ljava/lang/System;->gc()V
a=0;// 
a=0;//     new-instance v0, Ljava/io/IOException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/IOException;);
a=0;//     const-string v1, "File too large to fit into available memory"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(PosShort);v1=(Null);v2=(Uninit);v3=(Uninit);v4=(Null);v5=(Conflicted);v6=(Uninit);v7=(Uninit);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// .method public final b()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/b/a/a/h;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const-string v0, "UTF-8"
a=0;// 
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/b/a/a/h;->a:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final b(II)V
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Lcom/b/a/a/h;->a(ILjava/lang/Object;)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Message;);
a=0;//     invoke-direct {p0, v0}, Lcom/b/a/a/h;->b(Landroid/os/Message;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final b(I[Lorg/apache/http/Header;[BLjava/lang/Throwable;)V
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     aput-object p2, v0, v3
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     aput-object p3, v0, v1
a=0;// 
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     aput-object p4, v0, v1
a=0;// 
a=0;//     invoke-direct {p0, v3, v0}, Lcom/b/a/a/h;->a(ILjava/lang/Object;)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcom/b/a/a/h;->b(Landroid/os/Message;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public c()V
a=0;//     .locals 0
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final d()V
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0, v0, v1}, Lcom/b/a/a/h;->a(ILjava/lang/Object;)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Message;);
a=0;//     invoke-direct {p0, v0}, Lcom/b/a/a/h;->b(Landroid/os/Message;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final e()V
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0, v0, v1}, Lcom/b/a/a/h;->a(ILjava/lang/Object;)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Message;);
a=0;//     invoke-direct {p0, v0}, Lcom/b/a/a/h;->b(Landroid/os/Message;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final f()V
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v0, 0x6
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0, v0, v1}, Lcom/b/a/a/h;->a(ILjava/lang/Object;)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Message;);
a=0;//     invoke-direct {p0, v0}, Lcom/b/a/a/h;->b(Landroid/os/Message;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
