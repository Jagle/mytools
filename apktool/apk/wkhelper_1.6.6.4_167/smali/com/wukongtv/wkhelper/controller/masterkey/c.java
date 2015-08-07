package com.wukongtv.wkhelper.controller.masterkey; class c { void a() { int a;
a=0;// .class public Lcom/wukongtv/wkhelper/controller/masterkey/c;
a=0;// .super Lcom/wukongtv/wkhelper/controller/a;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field b:Z
a=0;// 
a=0;// .field c:Landroid/os/Messenger;
a=0;// 
a=0;// .field d:Z
a=0;// 
a=0;// .field e:Landroid/content/Context;
a=0;// 
a=0;// .field private f:Landroid/os/Bundle;
a=0;// 
a=0;// .field private g:I
a=0;// 
a=0;// .field private h:Landroid/content/SharedPreferences;
a=0;// 
a=0;// .field private i:Landroid/content/ServiceConnection;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Lcom/wukongtv/wkhelper/controller/a;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/controller/masterkey/c;);
a=0;//     iput-boolean v1, p0, Lcom/wukongtv/wkhelper/controller/masterkey/c;->b:Z
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/controller/masterkey/c;->c:Landroid/os/Messenger;
a=0;// 
a=0;//     new-instance v0, Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/controller/masterkey/c;->f:Landroid/os/Bundle;
a=0;// 
a=0;//     iput v1, p0, Lcom/wukongtv/wkhelper/controller/masterkey/c;->g:I
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/controller/masterkey/d;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/controller/masterkey/d;);
a=0;//     invoke-direct {v0, p0}, Lcom/wukongtv/wkhelper/controller/masterkey/d;-><init>(Lcom/wukongtv/wkhelper/controller/masterkey/c;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/controller/masterkey/d;);
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/controller/masterkey/c;->i:Landroid/content/ServiceConnection;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(III)V
a=0;//     .locals 2
a=0;// 
a=0;//     iget-boolean v0, p0, Lcom/wukongtv/wkhelper/controller/masterkey/c;->d:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v0, p1, p2, p3}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Message;);
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/controller/masterkey/c;->f:Landroid/os/Bundle;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Bundle;);
a=0;//     iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/controller/masterkey/c;->c:Landroid/os/Messenger;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
a=0;//     :try_end_0
a=0;//     .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final a()Z
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public final a(Landroid/content/Context;)Z
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object p1, p0, Lcom/wukongtv/wkhelper/controller/masterkey/c;->e:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/controller/masterkey/c;->e:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     const-string v3, "masterkeystartcount"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, p0, Lcom/wukongtv/wkhelper/controller/masterkey/c;->h:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/controller/masterkey/c;->h:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     const-string v3, "startCountKey"
a=0;// 
a=0;//     invoke-interface {v2, v3, v0}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, p0, Lcom/wukongtv/wkhelper/controller/masterkey/c;->g:I
a=0;// 
a=0;//     iget v2, p0, Lcom/wukongtv/wkhelper/controller/masterkey/c;->g:I
a=0;// 
a=0;//     const/16 v3, 0xa
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-lt v2, v3, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);v3=(PosByte);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     new-instance v2, Landroid/content/Intent;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v2}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     const-string v3, "com.android.providers.settings"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "com.android.providers.settings.RemoteService"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     invoke-static {p1, v2}, Lcom/wukongtv/wkhelper/a/g;->a(Landroid/content/Context;Landroid/content/Intent;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     iput-boolean v1, p0, Lcom/wukongtv/wkhelper/controller/masterkey/c;->b:Z
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Null);
a=0;//     sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "MiBOX_iCNTV"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "MiBOX"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_3
a=0;// 
a=0;//     sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "i71"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     :cond_3
a=0;//     sget-object v3, Lcom/wukongtv/wkhelper/controller/masterkey/InstallMKPluginActivity;->a:[Ljava/lang/String;
a=0;// 
a=0;//     array-length v4, v3
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v2, v0
a=0;// 
a=0;//     :goto_1
a=0;//     #v2=(Integer);v5=(Conflicted);v6=(Conflicted);
a=0;//     if-ge v2, v4, :cond_0
a=0;// 
a=0;//     aget-object v5, v3, v2
a=0;// 
a=0;//     #v5=(Null);
a=0;//     sget-object v6, Landroid/os/Build;->MODEL:Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_4
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Null);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public final b(Landroid/content/Context;)Lcom/wukongtv/wkhelper/controller/a;
a=0;//     .locals 3
a=0;// 
a=0;//     invoke-static {}, Landroid/os/Process;->myUid()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/controller/masterkey/c;->f:Landroid/os/Bundle;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v2, "uid"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
a=0;// 
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public final b()V
a=0;//     .locals 2
a=0;// 
a=0;//     iget-boolean v0, p0, Lcom/wukongtv/wkhelper/controller/masterkey/c;->d:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/controller/masterkey/c;->e:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/controller/masterkey/c;->i:Landroid/content/ServiceConnection;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/ServiceConnection;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/wukongtv/wkhelper/controller/masterkey/c;->d:Z
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final b(III)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-virtual {p0, p1, p2, p3}, Lcom/wukongtv/wkhelper/controller/masterkey/c;->a(III)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final c()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     const-string v0, "MasterKeyControlModule"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final c(III)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-virtual {p0, p1, p2, p3}, Lcom/wukongtv/wkhelper/controller/masterkey/c;->a(III)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final c(Landroid/content/Context;)V
a=0;//     .locals 4
a=0;// 
a=0;//     iput-object p1, p0, Lcom/wukongtv/wkhelper/controller/masterkey/c;->e:Landroid/content/Context;
a=0;// 
a=0;//     iget-boolean v0, p0, Lcom/wukongtv/wkhelper/controller/masterkey/c;->b:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v0}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "com.android.providers.settings"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "com.android.providers.settings.RemoteService"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/controller/masterkey/c;->e:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/controller/masterkey/c;->e:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/controller/masterkey/c;->i:Landroid/content/ServiceConnection;
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-virtual {v1, v0, v2, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v1, Lcom/wukongtv/wkhelper/controller/masterkey/InstallMKPluginActivity;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const/high16 v1, 0x10000000
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/controller/masterkey/c;->h:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "startCountKey"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget v2, p0, Lcom/wukongtv/wkhelper/controller/masterkey/c;->g:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     iput v2, p0, Lcom/wukongtv/wkhelper/controller/masterkey/c;->g:I
a=0;// 
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
