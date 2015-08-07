package com.umeng.update; class c { void a() { int a;
a=0;// .class public final Lcom/umeng/update/c;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static a:Lcom/umeng/update/l;
a=0;// 
a=0;// .field private static b:Lcom/umeng/update/a;
a=0;// 
a=0;// .field private static c:Lcom/umeng/update/b;
a=0;// 
a=0;// .field private static d:Landroid/content/Context;
a=0;// 
a=0;// .field private static e:Lcom/umeng/update/r;
a=0;// 
a=0;// .field private static f:Landroid/os/Handler;
a=0;// 
a=0;// .field private static g:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/umeng/update/c;->a:Lcom/umeng/update/l;
a=0;// 
a=0;//     sput-object v0, Lcom/umeng/update/c;->b:Lcom/umeng/update/a;
a=0;// 
a=0;//     sput-object v0, Lcom/umeng/update/c;->c:Lcom/umeng/update/b;
a=0;// 
a=0;//     new-instance v0, Lcom/umeng/update/r;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/umeng/update/r;);
a=0;//     invoke-direct {v0}, Lcom/umeng/update/r;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/update/r;);
a=0;//     sput-object v0, Lcom/umeng/update/c;->e:Lcom/umeng/update/r;
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-boolean v0, Lcom/umeng/update/c;->g:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-static {}, Lcom/umeng/update/m;->b()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static a(ILandroid/content/Context;Lcom/umeng/update/p;Ljava/io/File;)V
a=0;//     .locals 3
a=0;// 
a=0;//     packed-switch p0, :pswitch_data_0
a=0;// 
a=0;//     :goto_0
a=0;//     :pswitch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :pswitch_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     if-nez p3, :cond_0
a=0;// 
a=0;//     invoke-static {p1, p2}, Lcom/umeng/update/c;->a(Landroid/content/Context;Lcom/umeng/update/p;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-string v1, "android.intent.action.VIEW"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const/high16 v1, 0x10000000
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     invoke-static {p3}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/net/Uri;);
a=0;//     const-string v2, "application/vnd.android.package-archive"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p2, Lcom/umeng/update/p;->f:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1, v0}, Lcom/umeng/update/m;->a(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);p3=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x5
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(ILcom/umeng/update/p;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-static {p0, p1}, Lcom/umeng/update/c;->b(ILcom/umeng/update/p;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;)V
a=0;//     .locals 3
a=0;// 
a=0;//     invoke-static {}, Lcom/umeng/update/m;->f()V
a=0;// 
a=0;//     invoke-static {}, Lcom/umeng/update/m;->j()V
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     :try_start_0
a=0;//     const-string v0, "update"
a=0;// 
a=0;//     const-string v1, "unexpected null context in update"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, La/b/b;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/content/Context;);v1=(Uninit);v2=(Uninit);
a=0;//     new-instance v1, Lcom/umeng/update/d;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/umeng/update/d;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Looper;);
a=0;//     invoke-direct {v1, v2, v0}, Lcom/umeng/update/d;-><init>(Landroid/os/Looper;Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/umeng/update/d;);
a=0;//     sput-object v1, Lcom/umeng/update/c;->f:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/umeng/update/c;->b(Landroid/content/Context;)Z
a=0;// 
a=0;//     invoke-static {v0}, La/b/a;->c(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     invoke-static {}, Lcom/umeng/update/m;->i()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v0, v1}, Lcom/umeng/update/c;->b(ILcom/umeng/update/p;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v1, "update"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "Exception occurred in Mobclick.update(). "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v0}, La/b/b;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     #v1=(Boolean);
a=0;//     invoke-static {}, Lcom/umeng/update/m;->a()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     invoke-static {}, Lcom/umeng/update/m;->e()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v0, v1}, Lcom/umeng/update/c;->b(ILcom/umeng/update/p;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Reference,Landroid/content/Context;);v1=(Boolean);
a=0;//     sget-object v1, Lcom/umeng/update/c;->e:Lcom/umeng/update/r;
a=0;// 
a=0;//     #v1=(Reference,Lcom/umeng/update/r;);
a=0;//     iget-boolean v1, v1, Lcom/umeng/update/r;->h:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {v1, v2}, Lcom/umeng/update/c;->b(ILcom/umeng/update/p;)V
a=0;// 
a=0;//     const-string v1, "update"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "Is updating now."
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, La/b/b;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     sget-object v1, Lcom/umeng/update/c;->f:Landroid/os/Handler;
a=0;// 
a=0;//     new-instance v2, Lcom/umeng/update/e;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/umeng/update/e;);
a=0;//     invoke-direct {v2, v0}, Lcom/umeng/update/e;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/umeng/update/e;);
a=0;//     invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(Boolean);
a=0;//     sput-object v0, Lcom/umeng/update/c;->d:Landroid/content/Context;
a=0;// 
a=0;//     new-instance v1, Ljava/lang/Thread;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/Thread;);
a=0;//     new-instance v2, Lcom/umeng/update/k;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/umeng/update/k;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v2, v0}, Lcom/umeng/update/k;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/umeng/update/k;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Thread;->start()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Landroid/content/Context;Landroid/os/Message;)V
a=0;//     .locals 4
a=0;// 
a=0;//     invoke-static {}, Lcom/umeng/update/c;->g()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     sget-boolean v0, Lcom/umeng/update/c;->g:Z
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v1}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     new-instance v2, Landroid/os/Bundle;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v2}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v0, "UpdateStatus"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget v3, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v0, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
a=0;// 
a=0;//     const-string v3, "UpdateResponse"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, Lcom/umeng/update/p;
a=0;// 
a=0;//     invoke-virtual {v2, v3, v0}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V
a=0;// 
a=0;//     const-string v0, "UpdateListener"
a=0;// 
a=0;//     invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;
a=0;// 
a=0;//     const-string v0, "com.umeng.message.action.autoupdate"
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     invoke-static {p0}, Landroid/support/v4/a/d;->a(Landroid/content/Context;)Landroid/support/v4/a/d;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/a/d;->a(Landroid/content/Intent;)Z
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-boolean v0, Lcom/umeng/update/c;->g:Z
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;Lcom/umeng/update/p;)V
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     iget-boolean v0, p1, Lcom/umeng/update/p;->i:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/umeng/update/m;->g()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     sget-object v0, Lcom/umeng/update/c;->e:Lcom/umeng/update/r;
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/update/r;);
a=0;//     iget-object v2, p1, Lcom/umeng/update/p;->e:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p1, Lcom/umeng/update/p;->f:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v4, p1, Lcom/umeng/update/p;->d:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     iget-object v5, p1, Lcom/umeng/update/p;->j:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     sget-object v6, Lcom/umeng/update/c;->c:Lcom/umeng/update/b;
a=0;// 
a=0;//     #v6=(Reference,Lcom/umeng/update/b;);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual/range {v0 .. v6}, Lcom/umeng/update/r;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/umeng/update/b;)V
a=0;// 
a=0;//     sget-object v5, Lcom/umeng/update/c;->e:Lcom/umeng/update/r;
a=0;// 
a=0;//     new-instance v0, Lcom/umeng/update/net/i;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/umeng/update/net/i;);
a=0;//     iget-object v1, v5, Lcom/umeng/update/r;->e:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v2, v5, Lcom/umeng/update/r;->a:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v3, v5, Lcom/umeng/update/r;->f:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v4, v5, Lcom/umeng/update/r;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/umeng/update/net/i;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/umeng/update/net/u;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/update/net/i;);
a=0;//     iput-object v0, v5, Lcom/umeng/update/r;->g:Lcom/umeng/update/net/i;
a=0;// 
a=0;//     iget-object v0, v5, Lcom/umeng/update/r;->g:Lcom/umeng/update/net/i;
a=0;// 
a=0;//     iget-object v1, v5, Lcom/umeng/update/r;->d:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v1, v0, Lcom/umeng/update/net/i;->a:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v0, v5, Lcom/umeng/update/r;->g:Lcom/umeng/update/net/i;
a=0;// 
a=0;//     iget-object v1, v5, Lcom/umeng/update/r;->b:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v1, v0, Lcom/umeng/update/net/i;->b:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v0, v5, Lcom/umeng/update/r;->g:Lcom/umeng/update/net/i;
a=0;// 
a=0;//     invoke-virtual {v5, v0}, Lcom/umeng/update/r;->a(Lcom/umeng/update/net/i;)V
a=0;// 
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Null);v5=(Uninit);v6=(Uninit);
a=0;//     sget-object v0, Lcom/umeng/update/c;->e:Lcom/umeng/update/r;
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/update/r;);
a=0;//     iget-object v2, p1, Lcom/umeng/update/p;->d:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p1, Lcom/umeng/update/p;->f:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     sget-object v6, Lcom/umeng/update/c;->c:Lcom/umeng/update/b;
a=0;// 
a=0;//     #v6=(Reference,Lcom/umeng/update/b;);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     move-object v5, v4
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual/range {v0 .. v6}, Lcom/umeng/update/r;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/umeng/update/b;)V
a=0;// 
a=0;//     sget-object v0, Lcom/umeng/update/c;->e:Lcom/umeng/update/r;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/umeng/update/r;->b()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Landroid/content/Context;Lcom/umeng/update/p;I)V
a=0;//     .locals 12
a=0;// 
a=0;//     const/16 v11, 0x10
a=0;// 
a=0;//     #v11=(PosByte);
a=0;//     const/16 v10, 0xe
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p1, Lcom/umeng/update/p;->f:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     iget-object v2, p1, Lcom/umeng/update/p;->f:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {p0}, Lcom/umeng/update/m;->c(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/umeng/update/m;->e()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     move v2, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(One);v1=(Null);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     move v2, v1
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Boolean);
a=0;//     invoke-static {p0, p1}, Lcom/umeng/update/c;->b(Landroid/content/Context;Lcom/umeng/update/p;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     invoke-static {}, Lcom/umeng/update/m;->i()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_b
a=0;// 
a=0;//     :cond_3
a=0;//     packed-switch p2, :pswitch_data_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :pswitch_0
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v2, Lcom/umeng/update/UpdateDialogActivity;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     new-instance v2, Landroid/os/Bundle;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v2}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v4, "response"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4, p1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V
a=0;// 
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     const-string v1, "file"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v1, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     :goto_2
a=0;//     const-string v1, "force"
a=0;// 
a=0;//     invoke-static {}, Lcom/umeng/update/m;->e()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     invoke-virtual {v2, v1, v3}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;
a=0;// 
a=0;//     const/high16 v1, 0x14000000
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v1, "update"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "Fail to create update dialog box."
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v0}, La/b/b;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_4
a=0;//     :try_start_1
a=0;//     #v1=(Boolean);v3=(Reference,Ljava/io/File;);v4=(Reference,Ljava/lang/String;);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     const-string v1, "file"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v2, v1, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :pswitch_1
a=0;//     #v0=(Boolean);v1=(Boolean);v2=(Boolean);v3=(Reference,Ljava/io/File;);v4=(Uninit);
a=0;//     const-string v0, "notification"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/NotificationManager;
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     sget-object v5, Lcom/umeng/update/c;->e:Lcom/umeng/update/r;
a=0;// 
a=0;//     #v5=(Reference,Lcom/umeng/update/r;);
a=0;//     invoke-static {p0}, La/b/a;->h(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, p0, v1}, Lcom/umeng/update/p;->a(Landroid/content/Context;Z)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_8
a=0;// 
a=0;//     invoke-static {p0}, La/b/c;->a(Landroid/content/Context;)La/b/c;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,La/b/c;);
a=0;//     const-string v2, "UMDialog_InstallAPK"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, La/b/c;->d(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     const-string v8, "android.intent.action.VIEW"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v8}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     const/high16 v8, 0x10000000
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v1, v8}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     invoke-static {v3}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v8, "application/vnd.android.package-archive"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3, v8}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     :goto_3
a=0;//     #v3=(Conflicted);v9=(Conflicted);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     const/high16 v9, 0x8000000
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-static {p0, v8, v1, v9}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v8, Lcom/umeng/update/s;
a=0;// 
a=0;//     #v8=(UninitRef,Lcom/umeng/update/s;);
a=0;//     invoke-direct {v8, v5, p0}, Lcom/umeng/update/s;-><init>(Lcom/umeng/update/r;Landroid/content/Context;)V
a=0;// 
a=0;//     #v8=(Reference,Lcom/umeng/update/s;);
a=0;//     sget v5, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-lt v5, v11, :cond_5
a=0;// 
a=0;//     iget-object v5, v8, Lcom/umeng/update/s;->f:Landroid/app/Notification$Builder;
a=0;// 
a=0;//     #v5=(Reference,Landroid/app/Notification$Builder;);
a=0;//     new-instance v9, Landroid/app/Notification$BigTextStyle;
a=0;// 
a=0;//     #v9=(UninitRef,Landroid/app/Notification$BigTextStyle;);
a=0;//     invoke-direct {v9}, Landroid/app/Notification$BigTextStyle;-><init>()V
a=0;// 
a=0;//     #v9=(Reference,Landroid/app/Notification$BigTextStyle;);
a=0;//     invoke-virtual {v9, v7}, Landroid/app/Notification$BigTextStyle;->bigText(Ljava/lang/CharSequence;)Landroid/app/Notification$BigTextStyle;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v5, v7}, Landroid/app/Notification$Builder;->setStyle(Landroid/app/Notification$Style;)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     :cond_5
a=0;//     #v5=(Conflicted);v9=(Conflicted);
a=0;//     sget v5, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-lt v5, v10, :cond_6
a=0;// 
a=0;//     iget-object v5, v8, Lcom/umeng/update/s;->f:Landroid/app/Notification$Builder;
a=0;// 
a=0;//     #v5=(Reference,Landroid/app/Notification$Builder;);
a=0;//     invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     :cond_6
a=0;//     #v5=(Conflicted);
a=0;//     invoke-interface {v6}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     iput-object v5, v8, Lcom/umeng/update/s;->a:Ljava/lang/String;
a=0;// 
a=0;//     sget v5, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-lt v5, v10, :cond_7
a=0;// 
a=0;//     iget-object v5, v8, Lcom/umeng/update/s;->f:Landroid/app/Notification$Builder;
a=0;// 
a=0;//     #v5=(Reference,Landroid/app/Notification$Builder;);
a=0;//     invoke-virtual {v5, v2}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     :cond_7
a=0;//     #v5=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v8, Lcom/umeng/update/s;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v8, v3}, Lcom/umeng/update/s;->c(Ljava/lang/CharSequence;)Lcom/umeng/update/util/a;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Lcom/umeng/update/util/a;->a(Landroid/app/PendingIntent;)Lcom/umeng/update/util/a;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const v2, 0x108007d
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Lcom/umeng/update/util/a;->b(I)Lcom/umeng/update/util/a;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v1, v2}, Lcom/umeng/update/util/a;->b(Z)Lcom/umeng/update/util/a;
a=0;// 
a=0;//     sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt v1, v11, :cond_9
a=0;// 
a=0;//     iget-object v1, v8, Lcom/umeng/update/s;->f:Landroid/app/Notification$Builder;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Notification$Builder;);
a=0;//     invoke-virtual {v1}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_4
a=0;//     #v2=(Conflicted);
a=0;//     invoke-virtual {v0, v4, v1}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_8
a=0;//     #v1=(Boolean);v2=(Boolean);v5=(Reference,Lcom/umeng/update/r;);v8=(Uninit);v9=(Uninit);
a=0;//     invoke-static {p0}, La/b/c;->a(Landroid/content/Context;)La/b/c;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,La/b/c;);
a=0;//     const-string v2, "UMUpdateTitle"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, La/b/c;->d(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v3, Lcom/umeng/update/UpdateDialogActivity;
a=0;// 
a=0;//     invoke-direct {v1, p0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     new-instance v3, Landroid/os/Bundle;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v3}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v8, "response"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v8, p1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V
a=0;// 
a=0;//     const-string v8, "file"
a=0;// 
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     invoke-virtual {v3, v8, v9}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v8, "force"
a=0;// 
a=0;//     invoke-static {}, Lcom/umeng/update/m;->e()Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     invoke-virtual {v3, v8, v9}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;
a=0;// 
a=0;//     const/high16 v3, 0x14000000
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :cond_9
a=0;//     #v1=(Integer);v2=(One);v3=(Reference,Ljava/lang/String;);v5=(Conflicted);v9=(Conflicted);
a=0;//     sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     if-lt v1, v10, :cond_a
a=0;// 
a=0;//     iget-object v1, v8, Lcom/umeng/update/s;->f:Landroid/app/Notification$Builder;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Notification$Builder;);
a=0;//     invoke-virtual {v1}, Landroid/app/Notification$Builder;->getNotification()Landroid/app/Notification;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :cond_a
a=0;//     #v1=(Integer);
a=0;//     iget-object v1, v8, Lcom/umeng/update/s;->e:Landroid/app/Notification;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Notification;);
a=0;//     iget-object v2, v8, Lcom/umeng/update/s;->d:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     iget-object v3, v8, Lcom/umeng/update/s;->a:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v5, v8, Lcom/umeng/update/s;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     iget-object v6, v8, Lcom/umeng/update/s;->e:Landroid/app/Notification;
a=0;// 
a=0;//     iget-object v6, v6, Landroid/app/Notification;->contentIntent:Landroid/app/PendingIntent;
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3, v5, v6}, Landroid/app/Notification;->setLatestEventInfo(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V
a=0;// 
a=0;//     iget-object v1, v8, Lcom/umeng/update/s;->e:Landroid/app/Notification;
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :cond_b
a=0;//     #v0=(Boolean);v1=(Boolean);v2=(Boolean);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     invoke-static {p0, p1}, Lcom/umeng/update/c;->a(Landroid/content/Context;Lcom/umeng/update/p;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);v10=(Unknown);v11=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public static a(Lcom/umeng/update/b;)V
a=0;//     .locals 0
a=0;// 
a=0;//     sput-object p0, Lcom/umeng/update/c;->c:Lcom/umeng/update/b;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Lcom/umeng/update/l;)V
a=0;//     .locals 0
a=0;// 
a=0;//     sput-object p0, Lcom/umeng/update/c;->a:Lcom/umeng/update/l;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-static {p0}, Lcom/umeng/update/m;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static b(Landroid/content/Context;Lcom/umeng/update/p;)Ljava/io/File;
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p1, Lcom/umeng/update/p;->f:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, ".apk"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :try_start_0
a=0;//     const-string v0, "/apk"
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     new-array v3, v3, [Z
a=0;// 
a=0;//     #v3=(Reference,[Z);
a=0;//     invoke-static {v0, p0, v3}, Lcom/umeng/update/net/x;->a(Ljava/lang/String;Landroid/content/Context;[Z)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v0, v3, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     iget-object v2, p1, Lcom/umeng/update/p;->f:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, La/b/p;->a(Ljava/io/File;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/io/File;);v2=(Boolean);v3=(Reference,Ujava/lang/Object;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static b()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-static {}, Lcom/umeng/update/m;->d()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static b(ILcom/umeng/update/p;)V
a=0;//     .locals 2
a=0;// 
a=0;//     new-instance v0, Landroid/os/Message;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Message;);
a=0;//     invoke-direct {v0}, Landroid/os/Message;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Message;);
a=0;//     iput p0, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     sget-object v1, Lcom/umeng/update/c;->f:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static b(Landroid/content/Context;)Z
a=0;//     .locals 9
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static {}, Lcom/umeng/update/m;->l()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Boolean);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v0=(Boolean);v1=(One);v2=(Uninit);v3=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, ".BuildConfig"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, "DEBUG"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/reflect/Field;->getBoolean(Ljava/lang/Object;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     :try_start_1
a=0;//     invoke-static {p0}, Lcom/umeng/update/m;->a(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     sget-object v0, Lcom/umeng/update/c;->f:Landroid/os/Handler;
a=0;// 
a=0;//     new-instance v1, Lcom/umeng/update/f;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/umeng/update/f;);
a=0;//     invoke-direct {v1, p0}, Lcom/umeng/update/f;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/umeng/update/f;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     move v1, v4
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(One);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/16 v3, 0x1005
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     invoke-virtual {v0, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/content/pm/PackageInfo;);
a=0;//     iget-object v0, v6, Landroid/content/pm/PackageInfo;->activities:[Landroid/content/pm/ActivityInfo;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     move v2, v4
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move v0, v4
a=0;// 
a=0;//     :goto_1
a=0;//     :try_start_2
a=0;//     #v0=(Boolean);v2=(Integer);v5=(Conflicted);
a=0;//     iget-object v3, v6, Landroid/content/pm/PackageInfo;->activities:[Landroid/content/pm/ActivityInfo;
a=0;// 
a=0;//     #v3=(Reference,[Landroid/content/pm/ActivityInfo;);
a=0;//     array-length v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ge v2, v3, :cond_5
a=0;// 
a=0;//     const-string v3, "com.umeng.update.UpdateDialogActivity"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v5, v6, Landroid/content/pm/PackageInfo;->activities:[Landroid/content/pm/ActivityInfo;
a=0;// 
a=0;//     #v5=(Reference,[Landroid/content/pm/ActivityInfo;);
a=0;//     aget-object v5, v5, v2
a=0;// 
a=0;//     #v5=(Null);
a=0;//     iget-object v5, v5, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :cond_3
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Reference,[Landroid/content/pm/ActivityInfo;);v2=(Reference,Ljava/lang/String;);v3=(PosShort);v5=(Uninit);
a=0;//     move v0, v4
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Boolean);v2=(Conflicted);v3=(Integer);v5=(Conflicted);
a=0;//     if-nez v0, :cond_6
a=0;// 
a=0;//     sget-object v1, Lcom/umeng/update/c;->f:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     new-instance v2, Lcom/umeng/update/g;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/umeng/update/g;);
a=0;//     invoke-direct {v2, p0}, Lcom/umeng/update/g;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/umeng/update/g;);
a=0;//     invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
a=0;// 
a=0;//     move v1, v4
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_6
a=0;//     :try_start_3
a=0;//     #v1=(One);v2=(Conflicted);
a=0;//     iget-object v0, v6, Landroid/content/pm/PackageInfo;->services:[Landroid/content/pm/ServiceInfo;
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
a=0;// 
a=0;//     #v0=(Reference,[Landroid/content/pm/ServiceInfo;);
a=0;//     if-eqz v0, :cond_8
a=0;// 
a=0;//     move v2, v4
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move v0, v4
a=0;// 
a=0;//     :goto_2
a=0;//     :try_start_4
a=0;//     #v0=(Boolean);v2=(Integer);
a=0;//     iget-object v3, v6, Landroid/content/pm/PackageInfo;->services:[Landroid/content/pm/ServiceInfo;
a=0;// 
a=0;//     #v3=(Reference,[Landroid/content/pm/ServiceInfo;);
a=0;//     array-length v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ge v2, v3, :cond_9
a=0;// 
a=0;//     const-string v3, "com.umeng.update.net.DownloadingService"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v5, v6, Landroid/content/pm/PackageInfo;->services:[Landroid/content/pm/ServiceInfo;
a=0;// 
a=0;//     #v5=(Reference,[Landroid/content/pm/ServiceInfo;);
a=0;//     aget-object v5, v5, v2
a=0;// 
a=0;//     #v5=(Null);
a=0;//     iget-object v5, v5, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_7
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :cond_7
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_8
a=0;//     #v0=(Reference,[Landroid/content/pm/ServiceInfo;);v2=(Conflicted);v3=(Integer);v5=(Conflicted);
a=0;//     move v0, v4
a=0;// 
a=0;//     :cond_9
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_a
a=0;// 
a=0;//     sget-object v1, Lcom/umeng/update/c;->f:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     new-instance v2, Lcom/umeng/update/h;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/umeng/update/h;);
a=0;//     invoke-direct {v2, p0}, Lcom/umeng/update/h;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/umeng/update/h;);
a=0;//     invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2
a=0;// 
a=0;//     move v1, v4
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_a
a=0;//     :try_start_5
a=0;//     #v1=(One);v2=(Conflicted);
a=0;//     iget-object v0, v6, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_e
a=0;// 
a=0;//     move v5, v4
a=0;// 
a=0;//     #v5=(Null);
a=0;//     move v0, v4
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v2, v4
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move v3, v4
a=0;// 
a=0;//     :goto_3
a=0;//     #v0=(Boolean);v2=(Boolean);v3=(Boolean);v5=(Integer);v7=(Conflicted);v8=(Conflicted);
a=0;//     iget-object v7, v6, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;
a=0;// 
a=0;//     #v7=(Reference,[Ljava/lang/String;);
a=0;//     array-length v7, v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-ge v5, v7, :cond_f
a=0;// 
a=0;//     const-string v7, "android.permission.WRITE_EXTERNAL_STORAGE"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     iget-object v8, v6, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;
a=0;// 
a=0;//     #v8=(Reference,[Ljava/lang/String;);
a=0;//     aget-object v8, v8, v5
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_c
a=0;// 
a=0;//     move v3, v1
a=0;// 
a=0;//     :cond_b
a=0;//     :goto_4
a=0;//     add-int/lit8 v5, v5, 0x1
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_c
a=0;//     const-string v7, "android.permission.ACCESS_NETWORK_STATE"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     iget-object v8, v6, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;
a=0;// 
a=0;//     #v8=(Reference,[Ljava/lang/String;);
a=0;//     aget-object v8, v8, v5
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_d
a=0;// 
a=0;//     move v2, v1
a=0;// 
a=0;//     #v2=(One);
a=0;//     goto :goto_4
a=0;// 
a=0;//     :cond_d
a=0;//     #v2=(Boolean);
a=0;//     const-string v7, "android.permission.INTERNET"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     iget-object v8, v6, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;
a=0;// 
a=0;//     #v8=(Reference,[Ljava/lang/String;);
a=0;//     aget-object v8, v8, v5
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;//     :try_end_5
a=0;//     .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_b
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_4
a=0;// 
a=0;//     :cond_e
a=0;//     #v0=(Reference,[Ljava/lang/String;);v2=(Conflicted);v3=(Integer);v5=(Conflicted);v7=(Uninit);v8=(Uninit);
a=0;//     move v0, v4
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v2, v4
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move v3, v4
a=0;// 
a=0;//     :cond_f
a=0;//     #v0=(Boolean);v2=(Boolean);v3=(Boolean);v7=(Conflicted);v8=(Conflicted);
a=0;//     if-eqz v3, :cond_10
a=0;// 
a=0;//     if-eqz v2, :cond_10
a=0;// 
a=0;//     if-eqz v0, :cond_10
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_5
a=0;//     if-nez v0, :cond_11
a=0;// 
a=0;//     :try_start_6
a=0;//     sget-object v1, Lcom/umeng/update/c;->f:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     new-instance v2, Lcom/umeng/update/i;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/umeng/update/i;);
a=0;//     invoke-direct {v2, p0}, Lcom/umeng/update/i;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/umeng/update/i;);
a=0;//     invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;//     :try_end_6
a=0;//     .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2
a=0;// 
a=0;//     move v1, v4
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_10
a=0;//     #v1=(One);v2=(Boolean);
a=0;//     move v0, v4
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_5
a=0;// 
a=0;//     :cond_11
a=0;//     :try_start_7
a=0;//     #v0=(Boolean);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, ".R$string"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, "UMUpdateCheck"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const-string v2, "2.6.0.20150211"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;//     :try_end_7
a=0;//     .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_12
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_6
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     :goto_7
a=0;//     :try_start_8
a=0;//     #v2=(Conflicted);
a=0;//     sget-object v1, Lcom/umeng/update/c;->f:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     new-instance v2, Lcom/umeng/update/j;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/umeng/update/j;);
a=0;//     invoke-direct {v2, p0}, Lcom/umeng/update/j;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/umeng/update/j;);
a=0;//     invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;//     :try_end_8
a=0;//     .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_2
a=0;// 
a=0;//     :goto_8
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v6=(Conflicted);
a=0;//     move v1, v0
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(One);v3=(Boolean);v6=(Reference,Landroid/content/pm/PackageInfo;);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move v0, v4
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_7
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move v0, v4
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_8
a=0;// 
a=0;//     :catch_2
a=0;//     #v0=(Boolean);v6=(Reference,Landroid/content/pm/PackageInfo;);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_8
a=0;// 
a=0;//     :catch_3
a=0;//     #v0=(Conflicted);v1=(One);v3=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_12
a=0;//     #v0=(Boolean);v2=(Reference,Ljava/lang/String;);v3=(Boolean);v5=(Conflicted);v6=(Reference,Landroid/content/pm/PackageInfo;);v7=(Conflicted);v8=(Conflicted);
a=0;//     move v0, v4
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_6
a=0;// .end method
a=0;// 
a=0;// .method public static c()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-static {}, Lcom/umeng/update/m;->h()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic d()Landroid/content/Context;
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lcom/umeng/update/c;->d:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic e()Landroid/content/Context;
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/umeng/update/c;->d:Landroid/content/Context;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic f()Lcom/umeng/update/l;
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lcom/umeng/update/c;->a:Lcom/umeng/update/l;
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/update/l;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static g()Z
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     const-string v0, "com.umeng.message.PushAgent"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ClassNotFoundException;);
a=0;//     invoke-virtual {v0}, Ljava/lang/ClassNotFoundException;->printStackTrace()V
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
}}
