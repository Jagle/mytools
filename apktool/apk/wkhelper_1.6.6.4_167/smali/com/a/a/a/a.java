package com.a.a.a; class a { void a() { int a;
a=0;// .class public final Lcom/a/a/a/a;
a=0;// .super Landroid/os/Handler;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static b:Lcom/a/a/a/a;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final a:Ljava/util/Queue;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/a/a/a/a;);
a=0;//     new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/LinkedBlockingQueue;);
a=0;//     invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/LinkedBlockingQueue;);
a=0;//     iput-object v0, p0, Lcom/a/a/a/a;->a:Ljava/util/Queue;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected static declared-synchronized a()Lcom/a/a/a/a;
a=0;//     .locals 2
a=0;// 
a=0;//     const-class v1, Lcom/a/a/a/a;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/a/a/a/a;->b:Lcom/a/a/a/a;
a=0;// 
a=0;//     #v0=(Reference,Lcom/a/a/a/a;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     sget-object v0, Lcom/a/a/a/a;->b:Lcom/a/a/a/a;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     :goto_0
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     new-instance v0, Lcom/a/a/a/a;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/a/a/a/a;);
a=0;//     invoke-direct {v0}, Lcom/a/a/a/a;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/a/a/a/a;);
a=0;//     sput-object v0, Lcom/a/a/a/a;->b:Lcom/a/a/a/a;
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Lcom/a/a/a/b;)V
a=0;//     .locals 3
a=0;// 
a=0;//     iget v0, p0, Lcom/a/a/a/b;->a:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "cannot manual remove a toast that duration is not manual"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/a/a/a/b;->d:Landroid/view/WindowManager;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/WindowManager;);
a=0;//     iget-object v1, p0, Lcom/a/a/a/b;->c:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/a/a/a/b;->d()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     invoke-interface {v0, v1}, Landroid/view/WindowManager;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Lcom/a/a/a/b;IJ)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-virtual {p0, p2}, Lcom/a/a/a/a;->obtainMessage(I)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Message;);
a=0;//     iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     invoke-virtual {p0, v0, p3, p4}, Lcom/a/a/a/a;->sendMessageDelayed(Landroid/os/Message;J)Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method final b()V
a=0;//     .locals 6
a=0;// 
a=0;//     iget-object v0, p0, Lcom/a/a/a/a;->a:Ljava/util/Queue;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Queue;);
a=0;//     invoke-interface {v0}, Ljava/util/Queue;->isEmpty()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     iget-object v0, p0, Lcom/a/a/a/a;->a:Ljava/util/Queue;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Queue;);
a=0;//     invoke-interface {v0}, Ljava/util/Queue;->peek()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/a/a/a/b;
a=0;// 
a=0;//     iget v1, v0, Lcom/a/a/a/b;->a:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     iget-object v1, p0, Lcom/a/a/a/a;->a:Ljava/util/Queue;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Queue;);
a=0;//     invoke-interface {v1}, Ljava/util/Queue;->poll()Ljava/lang/Object;
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     invoke-virtual {v0}, Lcom/a/a/a/b;->d()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     const v1, 0x415354
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/a/a/a/a;->obtainMessage(I)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Message;);
a=0;//     iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Lcom/a/a/a/a;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Boolean);
a=0;//     const v1, 0x445354
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, v0, Lcom/a/a/a/b;->a:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-long v2, v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     const-wide/16 v4, 0x3e8
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     add-long/2addr v2, v4
a=0;// 
a=0;//     invoke-direct {p0, v0, v1, v2, v3}, Lcom/a/a/a/a;->a(Lcom/a/a/a/b;IJ)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final handleMessage(Landroid/os/Message;)V
a=0;//     .locals 8
a=0;// 
a=0;//     const-wide/16 v6, 0x1f4
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     const v4, 0x445354
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/a/a/a/b;
a=0;// 
a=0;//     iget v1, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sparse-switch v1, :sswitch_data_0
a=0;// 
a=0;//     invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :sswitch_0
a=0;//     #v1=(Integer);v2=(Uninit);v3=(Uninit);
a=0;//     invoke-virtual {p0}, Lcom/a/a/a/a;->b()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :sswitch_1
a=0;//     invoke-virtual {v0}, Lcom/a/a/a/b;->d()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/a/a/a/b;->d:Landroid/view/WindowManager;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/WindowManager;);
a=0;//     iget-object v2, v0, Lcom/a/a/a/b;->c:Landroid/view/View;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     iget-object v3, v0, Lcom/a/a/a/b;->e:Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/WindowManager$LayoutParams;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-interface {v1, v2, v3}, Landroid/view/WindowManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     iget v1, v0, Lcom/a/a/a/b;->a:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     const v1, 0x525354
a=0;// 
a=0;//     iget v2, v0, Lcom/a/a/a/b;->a:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit16 v2, v2, 0x1f4
a=0;// 
a=0;//     int-to-long v2, v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-direct {p0, v0, v1, v2, v3}, Lcom/a/a/a/a;->a(Lcom/a/a/a/b;IJ)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v2=(Reference,Landroid/view/View;);v3=(Reference,Landroid/view/WindowManager$LayoutParams;);
a=0;//     invoke-direct {p0, v0, v4, v6, v7}, Lcom/a/a/a/a;->a(Lcom/a/a/a/b;IJ)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :sswitch_2
a=0;//     #v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v1, v0, Lcom/a/a/a/b;->d:Landroid/view/WindowManager;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/WindowManager;);
a=0;//     iget-object v2, v0, Lcom/a/a/a/b;->c:Landroid/view/View;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v3, p0, Lcom/a/a/a/a;->a:Ljava/util/Queue;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/Queue;);
a=0;//     invoke-interface {v3}, Ljava/util/Queue;->poll()Ljava/lang/Object;
a=0;// 
a=0;//     invoke-interface {v1, v2}, Landroid/view/WindowManager;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     invoke-direct {p0, v0, v4, v6, v7}, Lcom/a/a/a/a;->a(Lcom/a/a/a/b;IJ)V
a=0;// 
a=0;//     iget-object v1, v0, Lcom/a/a/a/b;->b:Lcom/a/a/a/d;
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/a/a/a/b;->b:Lcom/a/a/a/d;
a=0;// 
a=0;//     invoke-interface {v0}, Lcom/a/a/a/d;->a()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x415354 -> :sswitch_1
a=0;//         0x445354 -> :sswitch_0
a=0;//         0x525354 -> :sswitch_2
a=0;//     .end sparse-switch
a=0;// .end method
}}
