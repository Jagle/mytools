package com.umeng.update.net; class t { void a() { int a;
a=0;// .class final Lcom/umeng/update/net/t;
a=0;// .super Landroid/os/AsyncTask;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public a:I
a=0;// 
a=0;// .field public b:Ljava/lang/String;
a=0;// 
a=0;// .field final synthetic c:Lcom/umeng/update/net/p;
a=0;// 
a=0;// .field private d:Lcom/umeng/update/net/k;
a=0;// 
a=0;// .field private e:Landroid/content/Context;
a=0;// 
a=0;// .field private f:Landroid/app/NotificationManager;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/umeng/update/net/p;Landroid/content/Context;ILcom/umeng/update/net/k;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     iput-object p1, p0, Lcom/umeng/update/net/t;->c:Lcom/umeng/update/net/p;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/umeng/update/net/t;);
a=0;//     invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     iput-object v0, p0, Lcom/umeng/update/net/t;->e:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/t;->e:Landroid/content/Context;
a=0;// 
a=0;//     const-string v1, "notification"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/NotificationManager;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/umeng/update/net/t;->f:Landroid/app/NotificationManager;
a=0;// 
a=0;//     iput p3, p0, Lcom/umeng/update/net/t;->a:I
a=0;// 
a=0;//     iput-object p4, p0, Lcom/umeng/update/net/t;->d:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     iput-object p5, p0, Lcom/umeng/update/net/t;->b:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     check-cast p1, [Ljava/lang/String;
a=0;// 
a=0;//     aget-object v0, p1, v4
a=0;// 
a=0;//     #v0=(Null);
a=0;//     aget-object v1, p1, v3
a=0;// 
a=0;//     #v1=(Null);
a=0;//     aget-object v2, p1, v5
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {v0, v1, v2}, Lcom/umeng/update/util/DeltaUpdate;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     aget-object v2, p1, v5
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     if-ne v0, v3, :cond_1
a=0;// 
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     aget-object v2, p1, v3
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-static {v1}, La/b/p;->a(Ljava/io/File;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/umeng/update/net/t;->d:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     #v2=(Reference,Lcom/umeng/update/net/k;);
a=0;//     iget-object v2, v2, Lcom/umeng/update/net/k;->e:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/umeng/update/net/p;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "file patch error"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, La/b/b;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Boolean);
a=0;//     invoke-static {}, Lcom/umeng/update/net/p;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "file patch success"
a=0;// 
a=0;//     invoke-static {v1, v2}, La/b/b;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     :goto_1
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);v2=(Null);
a=0;//     invoke-static {}, Lcom/umeng/update/net/p;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "file patch error"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, La/b/b;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method protected final synthetic onPostExecute(Ljava/lang/Object;)V
a=0;//     .locals 9
a=0;// 
a=0;//     const/4 v8, 0x5
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     check-cast p1, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v7, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/t;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/16 v1, 0x27
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-static {v0, v1}, Lcom/umeng/update/net/x;->a(Ljava/lang/String;I)Z
a=0;// 
a=0;//     new-instance v0, Landroid/app/Notification;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/app/Notification;);
a=0;//     const v1, 0x1080082
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lcom/umeng/update/net/t;->e:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     iget-object v3, p0, Lcom/umeng/update/net/t;->e:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v3}, La/b/o;->l(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-direct {v0, v1, v2, v4, v5}, Landroid/app/Notification;-><init>(ILjava/lang/CharSequence;J)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Notification;);
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     const-string v2, "android.intent.action.VIEW"
a=0;// 
a=0;//     invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     const/high16 v2, 0x10000000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     iget-object v3, p0, Lcom/umeng/update/net/t;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-static {v2}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "application/vnd.android.package-archive"
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/umeng/update/net/t;->e:Landroid/content/Context;
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/high16 v4, 0x8000000
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v2, v3, v1, v4}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/umeng/update/net/t;->e:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     iget-object v4, p0, Lcom/umeng/update/net/t;->e:Landroid/content/Context;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v4}, La/b/a;->h(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v5, p0, Lcom/umeng/update/net/t;->e:Landroid/content/Context;
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/Context;);
a=0;//     iget-object v6, p0, Lcom/umeng/update/net/t;->e:Landroid/content/Context;
a=0;// 
a=0;//     #v6=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v6}, La/b/o;->l(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v5, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v0, v3, v4, v5, v2}, Landroid/app/Notification;->setLatestEventInfo(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V
a=0;// 
a=0;//     const/16 v2, 0x10
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     iput v2, v0, Landroid/app/Notification;->flags:I
a=0;// 
a=0;//     iget-object v2, p0, Lcom/umeng/update/net/t;->f:Landroid/app/NotificationManager;
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/NotificationManager;);
a=0;//     iget v3, p0, Lcom/umeng/update/net/t;->a:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     invoke-virtual {v2, v3, v0}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/t;->e:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/umeng/update/net/p;->a(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/t;->d:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/update/net/k;);
a=0;//     iget-boolean v0, v0, Lcom/umeng/update/net/k;->h:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/t;->f:Landroid/app/NotificationManager;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/NotificationManager;);
a=0;//     iget v2, p0, Lcom/umeng/update/net/t;->a:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/app/NotificationManager;->cancel(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/t;->e:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     new-instance v0, Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v1, "filename"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/umeng/update/net/t;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput v8, v1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     iput v7, v1, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     iget v2, p0, Lcom/umeng/update/net/t;->a:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, v1, Landroid/os/Message;->arg2:I
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/t;->c:Lcom/umeng/update/net/p;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/umeng/update/net/p;->a(Lcom/umeng/update/net/p;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v2, p0, Lcom/umeng/update/net/t;->d:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     #v2=(Reference,Lcom/umeng/update/net/k;);
a=0;//     invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/t;->c:Lcom/umeng/update/net/p;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/umeng/update/net/p;->a(Lcom/umeng/update/net/p;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v2, p0, Lcom/umeng/update/net/t;->d:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/os/Messenger;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
a=0;// 
a=0;//     :cond_1
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/t;->c:Lcom/umeng/update/net/p;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/umeng/update/net/t;->e:Landroid/content/Context;
a=0;// 
a=0;//     iget v2, p0, Lcom/umeng/update/net/t;->a:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/umeng/update/net/p;->a(Landroid/content/Context;I)V
a=0;//     :try_end_0
a=0;//     .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);v3=(Integer);v4=(Reference,Ljava/lang/String;);v5=(Reference,Ljava/lang/String;);v6=(Integer);
a=0;//     move-exception v0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/t;->c:Lcom/umeng/update/net/p;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/umeng/update/net/t;->e:Landroid/content/Context;
a=0;// 
a=0;//     iget v2, p0, Lcom/umeng/update/net/t;->a:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/umeng/update/net/p;->a(Landroid/content/Context;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/t;->f:Landroid/app/NotificationManager;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/NotificationManager;);
a=0;//     iget v1, p0, Lcom/umeng/update/net/t;->a:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->cancel(I)V
a=0;// 
a=0;//     new-instance v0, Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v1, "filename"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/umeng/update/net/t;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput v8, v1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     iput v2, v1, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     iget v2, p0, Lcom/umeng/update/net/t;->a:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, v1, Landroid/os/Message;->arg2:I
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V
a=0;// 
a=0;//     :try_start_1
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/t;->c:Lcom/umeng/update/net/p;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/umeng/update/net/p;->a(Lcom/umeng/update/net/p;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v2, p0, Lcom/umeng/update/net/t;->d:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     #v2=(Reference,Lcom/umeng/update/net/k;);
a=0;//     invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/t;->c:Lcom/umeng/update/net/p;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/umeng/update/net/p;->a(Lcom/umeng/update/net/p;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v2, p0, Lcom/umeng/update/net/t;->d:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/os/Messenger;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
a=0;// 
a=0;//     :cond_3
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/t;->c:Lcom/umeng/update/net/p;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/umeng/update/net/t;->e:Landroid/content/Context;
a=0;// 
a=0;//     iget v2, p0, Lcom/umeng/update/net/t;->a:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/umeng/update/net/p;->a(Landroid/content/Context;I)V
a=0;//     :try_end_1
a=0;//     .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_1
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/t;->c:Lcom/umeng/update/net/p;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/umeng/update/net/t;->e:Landroid/content/Context;
a=0;// 
a=0;//     iget v2, p0, Lcom/umeng/update/net/t;->a:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/umeng/update/net/p;->a(Landroid/content/Context;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected final onPreExecute()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-super {p0}, Landroid/os/AsyncTask;->onPreExecute()V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
