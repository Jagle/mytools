package com.wukongtv.wkhelper; class c { void a() { int a;
a=0;// .class final Lcom/wukongtv/wkhelper/c;
a=0;// .super Landroid/os/AsyncTask;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/wukongtv/wkhelper/InfoActivity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/wukongtv/wkhelper/InfoActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/wukongtv/wkhelper/c;->a:Lcom/wukongtv/wkhelper/InfoActivity;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/c;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected final doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/a/g;->d()Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Boolean);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     const-string v2, "adb connect 127.0.0.1"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v1, v0}, Lcom/wukongtv/wkhelper/a/m;->a(Ljava/lang/String;ZZ)Lcom/wukongtv/wkhelper/a/n;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v2, v2, Lcom/wukongtv/wkhelper/a/n;->b:Ljava/lang/String;
a=0;// 
a=0;//     const-string v3, "connected"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     const-string v2, "adb -s %s:%s shell ls"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     const-string v4, "127.0.0.1"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     aput-object v4, v3, v1
a=0;// 
a=0;//     const/16 v4, 0x15b3
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v4, v3, v0
a=0;// 
a=0;//     invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2, v1, v0}, Lcom/wukongtv/wkhelper/a/m;->a(Ljava/lang/String;ZZ)Lcom/wukongtv/wkhelper/a/n;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v2, v2, Lcom/wukongtv/wkhelper/a/n;->c:Ljava/lang/String;
a=0;// 
a=0;//     const-string v3, "error"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     const-string v2, "YES"
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v2=(Reference,Ljava/lang/String;);v4=(Conflicted);
a=0;//     const-string v3, "adb disconnect"
a=0;// 
a=0;//     invoke-static {v3, v1, v1}, Lcom/wukongtv/wkhelper/a/m;->a(Ljava/lang/String;ZZ)Lcom/wukongtv/wkhelper/a/n;
a=0;// 
a=0;//     :goto_2
a=0;//     #v3=(Conflicted);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/c;->a:Lcom/wukongtv/wkhelper/InfoActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/InfoActivity;);
a=0;//     new-instance v1, Lcom/wukongtv/wkhelper/d;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/wukongtv/wkhelper/d;);
a=0;//     invoke-direct {v1, p0, v2}, Lcom/wukongtv/wkhelper/d;-><init>(Lcom/wukongtv/wkhelper/c;Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/d;);
a=0;//     invoke-virtual {v0, v1}, Lcom/wukongtv/wkhelper/InfoActivity;->runOnUiThread(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     :goto_3
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(One);v1=(Null);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Exception;);
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/c;->a:Lcom/wukongtv/wkhelper/InfoActivity;
a=0;// 
a=0;//     const v3, 0x7f0b000f
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const-string v4, "ADB"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "error"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3, v4, v5}, Lcom/wukongtv/wkhelper/InfoActivity;->a(Lcom/wukongtv/wkhelper/InfoActivity;ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     move v2, v1
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Boolean);v3=(Reference,Ljava/lang/String;);v5=(Conflicted);
a=0;//     const-string v0, "NO"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     move-object v2, v0
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(One);v2=(Boolean);v4=(Conflicted);
a=0;//     const-string v0, "connected failed"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     move-object v2, v0
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(One);v2=(Boolean);v3=(Conflicted);
a=0;//     const-string v2, "adb port not available"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/c;->a:Lcom/wukongtv/wkhelper/InfoActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/InfoActivity;);
a=0;//     new-instance v1, Lcom/wukongtv/wkhelper/e;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/wukongtv/wkhelper/e;);
a=0;//     invoke-direct {v1, p0, v2}, Lcom/wukongtv/wkhelper/e;-><init>(Lcom/wukongtv/wkhelper/c;Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/e;);
a=0;//     invoke-virtual {v0, v1}, Lcom/wukongtv/wkhelper/InfoActivity;->runOnUiThread(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     goto :goto_3
a=0;// .end method
}}
