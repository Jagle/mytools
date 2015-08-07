package com.umeng.update.net; class j { void a() { int a;
a=0;// .class final Lcom/umeng/update/net/j;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/content/ServiceConnection;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/umeng/update/net/i;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/umeng/update/net/i;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/umeng/update/net/j;->a:Lcom/umeng/update/net/i;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/umeng/update/net/j;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
a=0;//     .locals 5
a=0;// 
a=0;//     invoke-static {}, Lcom/umeng/update/net/i;->b()Ljava/lang/String;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/j;->a:Lcom/umeng/update/net/i;
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/update/net/i;);
a=0;//     new-instance v1, Landroid/os/Messenger;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/os/Messenger;);
a=0;//     invoke-direct {v1, p2}, Landroid/os/Messenger;-><init>(Landroid/os/IBinder;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Messenger;);
a=0;//     invoke-static {v0, v1}, Lcom/umeng/update/net/i;->a(Lcom/umeng/update/net/i;Landroid/os/Messenger;)Landroid/os/Messenger;
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(PosByte);
a=0;//     invoke-static {v0, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Message;);
a=0;//     new-instance v1, Lcom/umeng/update/net/k;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/umeng/update/net/k;);
a=0;//     iget-object v2, p0, Lcom/umeng/update/net/j;->a:Lcom/umeng/update/net/i;
a=0;// 
a=0;//     #v2=(Reference,Lcom/umeng/update/net/i;);
a=0;//     invoke-static {v2}, Lcom/umeng/update/net/i;->d(Lcom/umeng/update/net/i;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/umeng/update/net/j;->a:Lcom/umeng/update/net/i;
a=0;// 
a=0;//     #v3=(Reference,Lcom/umeng/update/net/i;);
a=0;//     invoke-static {v3}, Lcom/umeng/update/net/i;->e(Lcom/umeng/update/net/i;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p0, Lcom/umeng/update/net/j;->a:Lcom/umeng/update/net/i;
a=0;// 
a=0;//     #v4=(Reference,Lcom/umeng/update/net/i;);
a=0;//     invoke-static {v4}, Lcom/umeng/update/net/i;->f(Lcom/umeng/update/net/i;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v1, v2, v3, v4}, Lcom/umeng/update/net/k;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/umeng/update/net/k;);
a=0;//     iget-object v2, p0, Lcom/umeng/update/net/j;->a:Lcom/umeng/update/net/i;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/umeng/update/net/i;->g(Lcom/umeng/update/net/i;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v1, Lcom/umeng/update/net/k;->d:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/umeng/update/net/j;->a:Lcom/umeng/update/net/i;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/umeng/update/net/i;->h(Lcom/umeng/update/net/i;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v1, Lcom/umeng/update/net/k;->e:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/umeng/update/net/j;->a:Lcom/umeng/update/net/i;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/umeng/update/net/i;->i(Lcom/umeng/update/net/i;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v1, Lcom/umeng/update/net/k;->f:[Ljava/lang/String;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/umeng/update/net/j;->a:Lcom/umeng/update/net/i;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/umeng/update/net/i;->j(Lcom/umeng/update/net/i;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     iput-boolean v2, v1, Lcom/umeng/update/net/k;->g:Z
a=0;// 
a=0;//     iget-object v2, p0, Lcom/umeng/update/net/j;->a:Lcom/umeng/update/net/i;
a=0;// 
a=0;//     #v2=(Reference,Lcom/umeng/update/net/i;);
a=0;//     invoke-static {v2}, Lcom/umeng/update/net/i;->k(Lcom/umeng/update/net/i;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     iput-boolean v2, v1, Lcom/umeng/update/net/k;->h:Z
a=0;// 
a=0;//     iget-object v2, p0, Lcom/umeng/update/net/j;->a:Lcom/umeng/update/net/i;
a=0;// 
a=0;//     #v2=(Reference,Lcom/umeng/update/net/i;);
a=0;//     invoke-static {v2}, Lcom/umeng/update/net/i;->l(Lcom/umeng/update/net/i;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     iput-boolean v2, v1, Lcom/umeng/update/net/k;->i:Z
a=0;// 
a=0;//     new-instance v2, Landroid/os/Bundle;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v2}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v3, "mComponentName"
a=0;// 
a=0;//     iget-object v4, v1, Lcom/umeng/update/net/k;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v3, "mTitle"
a=0;// 
a=0;//     iget-object v4, v1, Lcom/umeng/update/net/k;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v3, "mUrl"
a=0;// 
a=0;//     iget-object v4, v1, Lcom/umeng/update/net/k;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v3, "mMd5"
a=0;// 
a=0;//     iget-object v4, v1, Lcom/umeng/update/net/k;->d:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v3, "mTargetMd5"
a=0;// 
a=0;//     iget-object v4, v1, Lcom/umeng/update/net/k;->e:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v3, "reporturls"
a=0;// 
a=0;//     iget-object v4, v1, Lcom/umeng/update/net/k;->f:[Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3, v4}, Landroid/os/Bundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v3, "rich_notification"
a=0;// 
a=0;//     iget-boolean v4, v1, Lcom/umeng/update/net/k;->g:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     invoke-virtual {v2, v3, v4}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
a=0;// 
a=0;//     const-string v3, "mSilent"
a=0;// 
a=0;//     iget-boolean v4, v1, Lcom/umeng/update/net/k;->h:Z
a=0;// 
a=0;//     invoke-virtual {v2, v3, v4}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
a=0;// 
a=0;//     const-string v3, "mWifiOnly"
a=0;// 
a=0;//     iget-boolean v1, v1, Lcom/umeng/update/net/k;->i:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {v2, v3, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V
a=0;// 
a=0;//     iget-object v1, p0, Lcom/umeng/update/net/j;->a:Lcom/umeng/update/net/i;
a=0;// 
a=0;//     #v1=(Reference,Lcom/umeng/update/net/i;);
a=0;//     iget-object v1, v1, Lcom/umeng/update/net/i;->g:Landroid/os/Messenger;
a=0;// 
a=0;//     iput-object v1, v0, Landroid/os/Message;->replyTo:Landroid/os/Messenger;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/umeng/update/net/j;->a:Lcom/umeng/update/net/i;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/umeng/update/net/i;->m(Lcom/umeng/update/net/i;)Landroid/os/Messenger;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
a=0;//     :try_end_0
a=0;//     .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final onServiceDisconnected(Landroid/content/ComponentName;)V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-static {}, Lcom/umeng/update/net/i;->b()Ljava/lang/String;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/j;->a:Lcom/umeng/update/net/i;
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/update/net/i;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v0, v1}, Lcom/umeng/update/net/i;->a(Lcom/umeng/update/net/i;Landroid/os/Messenger;)Landroid/os/Messenger;
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
