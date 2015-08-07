package com.umeng.update.net; class b { void a() { int a;
a=0;// .class final Lcom/umeng/update/net/b;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/umeng/update/net/e;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field a:Landroid/util/SparseArray;
a=0;// 
a=0;// .field final synthetic b:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/umeng/update/net/DownloadingService;)V
a=0;//     .locals 1
a=0;// 
a=0;//     iput-object p1, p0, Lcom/umeng/update/net/b;->b:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/umeng/update/net/b;);
a=0;//     new-instance v0, Landroid/util/SparseArray;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/util/SparseArray;);
a=0;//     invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/util/SparseArray;);
a=0;//     iput-object v0, p0, Lcom/umeng/update/net/b;->a:Landroid/util/SparseArray;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(I)V
a=0;//     .locals 9
a=0;// 
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {}, Lcom/umeng/update/net/DownloadingService;->b()Landroid/util/SparseArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/util/SparseArray;);
a=0;//     invoke-virtual {v0, p1}, Landroid/util/SparseArray;->indexOfKey(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ltz v0, :cond_1
a=0;// 
a=0;//     invoke-static {}, Lcom/umeng/update/net/DownloadingService;->b()Landroid/util/SparseArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/util/SparseArray;);
a=0;//     invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/umeng/update/net/s;
a=0;// 
a=0;//     iget-object v2, v0, Lcom/umeng/update/net/s;->f:[J
a=0;// 
a=0;//     #v2=(Reference,[J);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     aget-wide v4, v2, v8
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     const-wide/16 v6, 0x0
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     cmp-long v3, v4, v6
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-lez v3, :cond_0
a=0;// 
a=0;//     aget-wide v4, v2, v1
a=0;// 
a=0;//     long-to-float v1, v4
a=0;// 
a=0;//     #v1=(Float);
a=0;//     aget-wide v2, v2, v8
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     long-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     div-float/2addr v1, v2
a=0;// 
a=0;//     const/high16 v2, 0x42c80000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     mul-float/2addr v1, v2
a=0;// 
a=0;//     float-to-int v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0x64
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-le v1, v2, :cond_0
a=0;// 
a=0;//     const/16 v1, 0x63
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     iget-object v2, v0, Lcom/umeng/update/net/s;->e:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     #v2=(Reference,Lcom/umeng/update/net/k;);
a=0;//     iget-boolean v2, v2, Lcom/umeng/update/net/k;->h:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/umeng/update/net/b;->a:Landroid/util/SparseArray;
a=0;// 
a=0;//     #v2=(Reference,Landroid/util/SparseArray;);
a=0;//     const-wide/16 v4, -0x1
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Long;);
a=0;//     invoke-virtual {v2, p1, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V
a=0;// 
a=0;//     iget-object v2, p0, Lcom/umeng/update/net/b;->b:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/umeng/update/net/DownloadingService;->a(Lcom/umeng/update/net/DownloadingService;)Lcom/umeng/update/net/p;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/umeng/update/net/b;->b:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     iget-object v3, v0, Lcom/umeng/update/net/s;->e:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     invoke-static {v2, v3, p1, v1}, Lcom/umeng/update/net/p;->a(Landroid/content/Context;Lcom/umeng/update/net/k;II)Lcom/umeng/update/net/r;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/umeng/update/net/r;);
a=0;//     iput-object v1, v0, Lcom/umeng/update/net/s;->b:Lcom/umeng/update/net/r;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/b;->b:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/umeng/update/net/DownloadingService;->c(Lcom/umeng/update/net/DownloadingService;)Landroid/app/NotificationManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/umeng/update/net/r;->a()Landroid/app/Notification;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, p1, v1}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final a(II)V
a=0;//     .locals 10
a=0;// 
a=0;//     invoke-static {}, Lcom/umeng/update/net/DownloadingService;->b()Landroid/util/SparseArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/util/SparseArray;);
a=0;//     invoke-virtual {v0, p1}, Landroid/util/SparseArray;->indexOfKey(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ltz v0, :cond_1
a=0;// 
a=0;//     invoke-static {}, Lcom/umeng/update/net/DownloadingService;->b()Landroid/util/SparseArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/util/SparseArray;);
a=0;//     invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/umeng/update/net/s;
a=0;// 
a=0;//     iget-object v2, v0, Lcom/umeng/update/net/s;->e:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     #v2=(Reference,Lcom/umeng/update/net/k;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     iget-boolean v1, v2, Lcom/umeng/update/net/k;->h:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/umeng/update/net/b;->a:Landroid/util/SparseArray;
a=0;// 
a=0;//     #v1=(Reference,Landroid/util/SparseArray;);
a=0;//     invoke-virtual {v1, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Ljava/lang/Long;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Long;->longValue()J
a=0;// 
a=0;//     move-result-wide v6
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     sub-long v6, v4, v6
a=0;// 
a=0;//     const-wide/16 v8, 0x1f4
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     cmp-long v1, v6, v8
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/umeng/update/net/b;->a:Landroid/util/SparseArray;
a=0;// 
a=0;//     #v1=(Reference,Landroid/util/SparseArray;);
a=0;//     invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Long;);
a=0;//     invoke-virtual {v1, p1, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V
a=0;// 
a=0;//     iget-object v0, v0, Lcom/umeng/update/net/s;->b:Lcom/umeng/update/net/r;
a=0;// 
a=0;//     invoke-virtual {v0, p2}, Lcom/umeng/update/net/r;->a(I)Lcom/umeng/update/net/r;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "%"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Lcom/umeng/update/net/r;->a(Ljava/lang/CharSequence;)Lcom/umeng/update/net/r;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/umeng/update/net/b;->b:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/umeng/update/net/DownloadingService;->c(Lcom/umeng/update/net/DownloadingService;)Landroid/app/NotificationManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/umeng/update/net/r;->a()Landroid/app/Notification;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, p1, v0}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     invoke-static {}, Lcom/umeng/update/net/DownloadingService;->a()Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "%3$10s Notification: mNotificationId = %1$15s\t|\tprogress = %2$15s"
a=0;// 
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v4, v1, v3
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     aput-object v4, v1, v3
a=0;// 
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     iget-object v2, v2, Lcom/umeng/update/net/k;->b:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v2, v1, v3
a=0;// 
a=0;//     invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final a(ILjava/lang/String;)V
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v6, 0x5
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     invoke-static {}, Lcom/umeng/update/net/DownloadingService;->b()Landroid/util/SparseArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/util/SparseArray;);
a=0;//     invoke-virtual {v0, p1}, Landroid/util/SparseArray;->indexOfKey(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ltz v0, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/umeng/update/net/DownloadingService;->b()Landroid/util/SparseArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/util/SparseArray;);
a=0;//     invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/umeng/update/net/s;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/umeng/update/net/s;->e:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/umeng/update/net/b;->b:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     #v1=(Reference,Lcom/umeng/update/net/DownloadingService;);
a=0;//     invoke-static {v1}, Lcom/umeng/update/net/DownloadingService;->b(Lcom/umeng/update/net/DownloadingService;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/umeng/update/net/m;->a(Landroid/content/Context;)Lcom/umeng/update/net/m;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, v0, Lcom/umeng/update/net/k;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, v0, Lcom/umeng/update/net/k;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/16 v4, 0x64
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v1, v2, v3, v4}, Lcom/umeng/update/net/m;->a(Ljava/lang/String;Ljava/lang/String;I)V
a=0;// 
a=0;//     new-instance v1, Landroid/os/Bundle;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v1}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v2, "filename"
a=0;// 
a=0;//     invoke-virtual {v1, v2, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v2, v0, Lcom/umeng/update/net/k;->a:Ljava/lang/String;
a=0;// 
a=0;//     const-string v3, "delta_update"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Message;);
a=0;//     const/4 v3, 0x6
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     iput v3, v2, Landroid/os/Message;->what:I
a=0;// 
a=0;//     iput v5, v2, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     iput-object v0, v2, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     iput p1, v2, Landroid/os/Message;->arg2:I
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/b;->b:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/umeng/update/net/DownloadingService;->d(Lcom/umeng/update/net/DownloadingService;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Reference,Lcom/umeng/update/net/k;);v1=(Reference,Landroid/os/Bundle;);v2=(Boolean);v3=(Reference,Ljava/lang/String;);v4=(PosByte);
a=0;//     invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Message;);
a=0;//     iput v6, v2, Landroid/os/Message;->what:I
a=0;// 
a=0;//     iput v5, v2, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     iput-object v0, v2, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     iput p1, v2, Landroid/os/Message;->arg2:I
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V
a=0;// 
a=0;//     iget-object v3, p0, Lcom/umeng/update/net/b;->b:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/umeng/update/net/DownloadingService;->d(Lcom/umeng/update/net/DownloadingService;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput v6, v2, Landroid/os/Message;->what:I
a=0;// 
a=0;//     iput v5, v2, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     iput p1, v2, Landroid/os/Message;->arg2:I
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/umeng/update/net/DownloadingService;->c()Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     invoke-static {}, Lcom/umeng/update/net/DownloadingService;->c()Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/os/Messenger;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
a=0;// 
a=0;//     :cond_2
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/b;->b:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/umeng/update/net/DownloadingService;->a(Lcom/umeng/update/net/DownloadingService;)Lcom/umeng/update/net/p;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/umeng/update/net/b;->b:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/umeng/update/net/DownloadingService;->b(Lcom/umeng/update/net/DownloadingService;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/umeng/update/net/p;->a(Landroid/content/Context;I)V
a=0;//     :try_end_0
a=0;//     .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/b;->b:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/umeng/update/net/DownloadingService;->a(Lcom/umeng/update/net/DownloadingService;)Lcom/umeng/update/net/p;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/umeng/update/net/b;->b:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/umeng/update/net/DownloadingService;->b(Lcom/umeng/update/net/DownloadingService;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/umeng/update/net/p;->a(Landroid/content/Context;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final b(I)V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-static {}, Lcom/umeng/update/net/DownloadingService;->b()Landroid/util/SparseArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/util/SparseArray;);
a=0;//     invoke-virtual {v0, p1}, Landroid/util/SparseArray;->indexOfKey(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ltz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/b;->b:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/update/net/DownloadingService;);
a=0;//     invoke-static {v0}, Lcom/umeng/update/net/DownloadingService;->a(Lcom/umeng/update/net/DownloadingService;)Lcom/umeng/update/net/p;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/umeng/update/net/b;->b:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     #v1=(Reference,Lcom/umeng/update/net/DownloadingService;);
a=0;//     invoke-static {v1}, Lcom/umeng/update/net/DownloadingService;->b(Lcom/umeng/update/net/DownloadingService;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/umeng/update/net/p;->a(Landroid/content/Context;I)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
