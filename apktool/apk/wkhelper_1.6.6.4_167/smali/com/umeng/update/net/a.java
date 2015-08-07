package com.umeng.update.net; class a { void a() { int a;
a=0;// .class final Lcom/umeng/update/net/a;
a=0;// .super Landroid/os/Handler;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/umeng/update/net/DownloadingService;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/umeng/update/net/a;->a:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/umeng/update/net/a;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final handleMessage(Landroid/os/Message;)V
a=0;//     .locals 13
a=0;// 
a=0;//     const/high16 v7, 0x8000000
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     const/4 v12, 0x2
a=0;// 
a=0;//     #v12=(PosByte);
a=0;//     const/4 v11, 0x1
a=0;// 
a=0;//     #v11=(One);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     iget v0, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Integer);v8=(Uninit);v9=(Uninit);
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/umeng/update/net/k;
a=0;// 
a=0;//     iget v3, p1, Landroid/os/Message;->arg2:I
a=0;// 
a=0;//     :try_start_0
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v2, "filename"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const/16 v1, 0x27
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-static {v4, v1}, Lcom/umeng/update/net/x;->a(Ljava/lang/String;I)Z
a=0;// 
a=0;//     invoke-static {}, Lcom/umeng/update/net/DownloadingService;->a()Ljava/lang/String;
a=0;// 
a=0;//     new-instance v5, Landroid/content/Intent;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/content/Intent;);
a=0;//     const-string v1, "android.intent.action.VIEW"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/Intent;);
a=0;//     const/high16 v1, 0x10000000
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v5, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v1, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-static {v1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "application/vnd.android.package-archive"
a=0;// 
a=0;//     invoke-virtual {v5, v1, v2}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/umeng/update/net/a;->a:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/umeng/update/net/DownloadingService;->b(Lcom/umeng/update/net/DownloadingService;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/high16 v6, 0x8000000
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-static {v1, v2, v5, v6}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/PendingIntent;);
a=0;//     iget-boolean v1, v0, Lcom/umeng/update/net/k;->h:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     new-instance v1, Landroid/app/Notification;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/app/Notification;);
a=0;//     const v6, 0x1080082
a=0;// 
a=0;//     iget-object v7, p0, Lcom/umeng/update/net/a;->a:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     #v7=(Reference,Lcom/umeng/update/net/DownloadingService;);
a=0;//     invoke-static {v7}, Lcom/umeng/update/net/DownloadingService;->b(Lcom/umeng/update/net/DownloadingService;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     iget-object v8, p0, Lcom/umeng/update/net/a;->a:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     #v8=(Reference,Lcom/umeng/update/net/DownloadingService;);
a=0;//     invoke-static {v8}, Lcom/umeng/update/net/DownloadingService;->b(Lcom/umeng/update/net/DownloadingService;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-static {v8}, La/b/o;->m(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v7, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v8
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     invoke-direct {v1, v6, v7, v8, v9}, Landroid/app/Notification;-><init>(ILjava/lang/CharSequence;J)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Notification;);
a=0;//     iget-object v6, p0, Lcom/umeng/update/net/a;->a:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     #v6=(Reference,Lcom/umeng/update/net/DownloadingService;);
a=0;//     invoke-static {v6}, Lcom/umeng/update/net/DownloadingService;->b(Lcom/umeng/update/net/DownloadingService;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     iget-object v7, v0, Lcom/umeng/update/net/k;->b:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v8, p0, Lcom/umeng/update/net/a;->a:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     #v8=(Reference,Lcom/umeng/update/net/DownloadingService;);
a=0;//     invoke-static {v8}, Lcom/umeng/update/net/DownloadingService;->b(Lcom/umeng/update/net/DownloadingService;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     iget-object v9, p0, Lcom/umeng/update/net/a;->a:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     #v9=(Reference,Lcom/umeng/update/net/DownloadingService;);
a=0;//     invoke-static {v9}, Lcom/umeng/update/net/DownloadingService;->b(Lcom/umeng/update/net/DownloadingService;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-static {v9}, La/b/o;->m(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {v8, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v1, v6, v7, v8, v2}, Landroid/app/Notification;->setLatestEventInfo(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V
a=0;// 
a=0;//     move-object v2, v1
a=0;// 
a=0;//     :goto_1
a=0;//     const/16 v1, 0x10
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, v2, Landroid/app/Notification;->flags:I
a=0;// 
a=0;//     iget-object v6, p0, Lcom/umeng/update/net/a;->a:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/umeng/update/net/a;->a:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     #v1=(Reference,Lcom/umeng/update/net/DownloadingService;);
a=0;//     const-string v7, "notification"
a=0;// 
a=0;//     invoke-virtual {v1, v7}, Lcom/umeng/update/net/DownloadingService;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Landroid/app/NotificationManager;
a=0;// 
a=0;//     invoke-static {v6, v1}, Lcom/umeng/update/net/DownloadingService;->a(Lcom/umeng/update/net/DownloadingService;Landroid/app/NotificationManager;)Landroid/app/NotificationManager;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/umeng/update/net/a;->a:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/umeng/update/net/DownloadingService;->c(Lcom/umeng/update/net/DownloadingService;)Landroid/app/NotificationManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     add-int/lit8 v6, v3, 0x1
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v1, v6, v2}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
a=0;// 
a=0;//     invoke-static {}, Lcom/umeng/update/net/DownloadingService;->a()Ljava/lang/String;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/umeng/update/net/a;->a:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/umeng/update/net/DownloadingService;->a(Lcom/umeng/update/net/DownloadingService;)Lcom/umeng/update/net/p;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/umeng/update/net/a;->a:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/umeng/update/net/DownloadingService;->b(Lcom/umeng/update/net/DownloadingService;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/umeng/update/net/p;->a(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     invoke-static {}, Lcom/umeng/update/net/DownloadingService;->a()Ljava/lang/String;
a=0;// 
a=0;//     const-string v2, "isAppOnForeground = %1$B"
a=0;// 
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     new-array v6, v6, [Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     aput-object v8, v6, v7
a=0;// 
a=0;//     invoke-static {v2, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-boolean v1, v0, Lcom/umeng/update/net/k;->h:Z
a=0;// 
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/umeng/update/net/a;->a:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     #v1=(Reference,Lcom/umeng/update/net/DownloadingService;);
a=0;//     invoke-static {v1}, Lcom/umeng/update/net/DownloadingService;->c(Lcom/umeng/update/net/DownloadingService;)Landroid/app/NotificationManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     add-int/lit8 v2, v3, 0x1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/app/NotificationManager;->cancel(I)V
a=0;// 
a=0;//     iget-object v1, p0, Lcom/umeng/update/net/a;->a:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/umeng/update/net/DownloadingService;->b(Lcom/umeng/update/net/DownloadingService;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     invoke-static {}, Lcom/umeng/update/net/DownloadingService;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "%1$10s downloaded. Saved to: %2$s"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     new-array v5, v5, [Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     iget-object v0, v0, Lcom/umeng/update/net/k;->b:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v0, v5, v6
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     aput-object v4, v5, v0
a=0;// 
a=0;//     invoke-static {v2, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v0}, La/b/b;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-static {}, Lcom/umeng/update/net/DownloadingService;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "can not install. "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v1, v0}, La/b/b;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/a;->a:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/umeng/update/net/DownloadingService;->c(Lcom/umeng/update/net/DownloadingService;)Landroid/app/NotificationManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     add-int/lit8 v1, v3, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->cancel(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     #v1=(Boolean);v5=(Reference,Landroid/content/Intent;);v6=(Integer);v7=(Integer);v8=(Uninit);v9=(Uninit);
a=0;//     new-instance v1, Landroid/app/Notification;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/app/Notification;);
a=0;//     const v6, 0x1080082
a=0;// 
a=0;//     iget-object v7, p0, Lcom/umeng/update/net/a;->a:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     #v7=(Reference,Lcom/umeng/update/net/DownloadingService;);
a=0;//     invoke-static {v7}, Lcom/umeng/update/net/DownloadingService;->b(Lcom/umeng/update/net/DownloadingService;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     iget-object v8, p0, Lcom/umeng/update/net/a;->a:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     #v8=(Reference,Lcom/umeng/update/net/DownloadingService;);
a=0;//     invoke-static {v8}, Lcom/umeng/update/net/DownloadingService;->b(Lcom/umeng/update/net/DownloadingService;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-static {v8}, La/b/o;->k(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v7, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v8
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     invoke-direct {v1, v6, v7, v8, v9}, Landroid/app/Notification;-><init>(ILjava/lang/CharSequence;J)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Notification;);
a=0;//     iget-object v6, p0, Lcom/umeng/update/net/a;->a:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     #v6=(Reference,Lcom/umeng/update/net/DownloadingService;);
a=0;//     invoke-static {v6}, Lcom/umeng/update/net/DownloadingService;->b(Lcom/umeng/update/net/DownloadingService;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     iget-object v7, v0, Lcom/umeng/update/net/k;->b:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v8, p0, Lcom/umeng/update/net/a;->a:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     #v8=(Reference,Lcom/umeng/update/net/DownloadingService;);
a=0;//     invoke-static {v8}, Lcom/umeng/update/net/DownloadingService;->b(Lcom/umeng/update/net/DownloadingService;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     iget-object v9, p0, Lcom/umeng/update/net/a;->a:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     #v9=(Reference,Lcom/umeng/update/net/DownloadingService;);
a=0;//     invoke-static {v9}, Lcom/umeng/update/net/DownloadingService;->b(Lcom/umeng/update/net/DownloadingService;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-static {v9}, La/b/o;->k(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {v8, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v1, v6, v7, v8, v2}, Landroid/app/Notification;->setLatestEventInfo(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     move-object v2, v1
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Integer);v8=(Uninit);v9=(Uninit);
a=0;//     iget-object v4, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v4, Lcom/umeng/update/net/k;
a=0;// 
a=0;//     iget v3, p1, Landroid/os/Message;->arg2:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v1, "filename"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/a;->a:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/umeng/update/net/DownloadingService;->c(Lcom/umeng/update/net/DownloadingService;)Landroid/app/NotificationManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/app/NotificationManager;->cancel(I)V
a=0;// 
a=0;//     new-instance v0, Landroid/app/Notification;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/app/Notification;);
a=0;//     const v1, 0x1080081
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lcom/umeng/update/net/a;->a:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     #v2=(Reference,Lcom/umeng/update/net/DownloadingService;);
a=0;//     invoke-static {v2}, Lcom/umeng/update/net/DownloadingService;->b(Lcom/umeng/update/net/DownloadingService;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v5, p0, Lcom/umeng/update/net/a;->a:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     #v5=(Reference,Lcom/umeng/update/net/DownloadingService;);
a=0;//     invoke-static {v5}, Lcom/umeng/update/net/DownloadingService;->b(Lcom/umeng/update/net/DownloadingService;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v5}, La/b/o;->n(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v2, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v8
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     invoke-direct {v0, v1, v2, v8, v9}, Landroid/app/Notification;-><init>(ILjava/lang/CharSequence;J)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Notification;);
a=0;//     iget-object v1, p0, Lcom/umeng/update/net/a;->a:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     #v1=(Reference,Lcom/umeng/update/net/DownloadingService;);
a=0;//     invoke-static {v1}, Lcom/umeng/update/net/DownloadingService;->b(Lcom/umeng/update/net/DownloadingService;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v2, Landroid/content/Intent;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v2}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     invoke-static {v1, v10, v2, v7}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/umeng/update/net/a;->a:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/umeng/update/net/DownloadingService;->b(Lcom/umeng/update/net/DownloadingService;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v5, p0, Lcom/umeng/update/net/a;->a:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     #v5=(Reference,Lcom/umeng/update/net/DownloadingService;);
a=0;//     invoke-static {v5}, Lcom/umeng/update/net/DownloadingService;->b(Lcom/umeng/update/net/DownloadingService;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v5}, La/b/a;->h(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget-object v7, p0, Lcom/umeng/update/net/a;->a:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     #v7=(Reference,Lcom/umeng/update/net/DownloadingService;);
a=0;//     invoke-static {v7}, Lcom/umeng/update/net/DownloadingService;->b(Lcom/umeng/update/net/DownloadingService;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     iget-object v8, p0, Lcom/umeng/update/net/a;->a:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     #v8=(Reference,Lcom/umeng/update/net/DownloadingService;);
a=0;//     invoke-static {v8}, Lcom/umeng/update/net/DownloadingService;->b(Lcom/umeng/update/net/DownloadingService;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-static {v8}, La/b/o;->n(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v7, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v0, v2, v5, v7, v1}, Landroid/app/Notification;->setLatestEventInfo(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V
a=0;// 
a=0;//     iget-object v1, p0, Lcom/umeng/update/net/a;->a:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/umeng/update/net/DownloadingService;->c(Lcom/umeng/update/net/DownloadingService;)Landroid/app/NotificationManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     add-int/lit8 v2, v3, 0x1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2, v0}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
a=0;// 
a=0;//     const-string v0, ".patch"
a=0;// 
a=0;//     const-string v1, ".apk"
a=0;// 
a=0;//     invoke-virtual {v6, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/a;->a:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/umeng/update/util/DeltaUpdate;->a(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     new-instance v0, Lcom/umeng/update/net/t;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/umeng/update/net/t;);
a=0;//     iget-object v1, p0, Lcom/umeng/update/net/a;->a:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/umeng/update/net/DownloadingService;->a(Lcom/umeng/update/net/DownloadingService;)Lcom/umeng/update/net/p;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/umeng/update/net/a;->a:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     #v2=(Reference,Lcom/umeng/update/net/DownloadingService;);
a=0;//     invoke-static {v2}, Lcom/umeng/update/net/DownloadingService;->b(Lcom/umeng/update/net/DownloadingService;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/umeng/update/net/t;-><init>(Lcom/umeng/update/net/p;Landroid/content/Context;ILcom/umeng/update/net/k;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/update/net/t;);
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     new-array v1, v1, [Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/String;);
a=0;//     aput-object v7, v1, v10
a=0;// 
a=0;//     aput-object v5, v1, v11
a=0;// 
a=0;//     aput-object v6, v1, v12
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/umeng/update/net/t;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x5
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
}}
