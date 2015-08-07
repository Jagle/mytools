package com.umeng.update.net; class l { void a() { int a;
a=0;// .class final Lcom/umeng/update/net/l;
a=0;// .super Landroid/os/Handler;
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
a=0;//     iput-object p1, p0, Lcom/umeng/update/net/l;->a:Lcom/umeng/update/net/i;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/umeng/update/net/l;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final handleMessage(Landroid/os/Message;)V
a=0;//     .locals 4
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/umeng/update/net/i;->b()Ljava/lang/String;
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "DownloadAgent.handleMessage("
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v1, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "): "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     iget v0, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     :pswitch_0
a=0;//     invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);v1=(Reference,Ljava/lang/String;);v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/l;->a:Lcom/umeng/update/net/i;
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/update/net/i;);
a=0;//     invoke-static {v0}, Lcom/umeng/update/net/i;->a(Lcom/umeng/update/net/i;)Lcom/umeng/update/net/u;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/l;->a:Lcom/umeng/update/net/i;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/umeng/update/net/i;->a(Lcom/umeng/update/net/i;)Lcom/umeng/update/net/u;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Lcom/umeng/update/net/u;->a()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     invoke-static {}, Lcom/umeng/update/net/i;->b()Ljava/lang/String;
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "DownloadAgent.handleMessage("
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v2, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "): "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_2
a=0;//     :try_start_1
a=0;//     #v0=(Integer);v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/l;->a:Lcom/umeng/update/net/i;
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/update/net/i;);
a=0;//     invoke-static {v0}, Lcom/umeng/update/net/i;->a(Lcom/umeng/update/net/i;)Lcom/umeng/update/net/u;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/l;->a:Lcom/umeng/update/net/i;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/umeng/update/net/i;->a(Lcom/umeng/update/net/i;)Lcom/umeng/update/net/u;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v1, p1, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-interface {v0, v1}, Lcom/umeng/update/net/u;->a(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_3
a=0;//     #v0=(Integer);v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/l;->a:Lcom/umeng/update/net/i;
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/update/net/i;);
a=0;//     invoke-static {v0}, Lcom/umeng/update/net/i;->c(Lcom/umeng/update/net/i;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/umeng/update/net/l;->a:Lcom/umeng/update/net/i;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/umeng/update/net/i;->b(Lcom/umeng/update/net/i;)Landroid/content/ServiceConnection;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/l;->a:Lcom/umeng/update/net/i;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/umeng/update/net/i;->a(Lcom/umeng/update/net/i;)Lcom/umeng/update/net/u;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget v0, p1, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-eq v0, v1, :cond_1
a=0;// 
a=0;//     iget v0, p1, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-eq v0, v1, :cond_1
a=0;// 
a=0;//     iget v0, p1, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     if-ne v0, v1, :cond_2
a=0;// 
a=0;//     :cond_1
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/l;->a:Lcom/umeng/update/net/i;
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/update/net/i;);
a=0;//     invoke-static {v0}, Lcom/umeng/update/net/i;->a(Lcom/umeng/update/net/i;)Lcom/umeng/update/net/u;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v1, p1, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, p1, Landroid/os/Message;->arg2:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v3, "filename"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {v0, v1, v2}, Lcom/umeng/update/net/u;->a(ILjava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(PosByte);v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/l;->a:Lcom/umeng/update/net/i;
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/update/net/i;);
a=0;//     invoke-static {v0}, Lcom/umeng/update/net/i;->a(Lcom/umeng/update/net/i;)Lcom/umeng/update/net/u;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v0, v1, v2}, Lcom/umeng/update/net/u;->a(ILjava/lang/String;)V
a=0;// 
a=0;//     invoke-static {}, Lcom/umeng/update/net/i;->b()Ljava/lang/String;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :pswitch_4
a=0;//     #v0=(Integer);v1=(Reference,Ljava/lang/String;);v2=(Uninit);
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/l;->a:Lcom/umeng/update/net/i;
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/update/net/i;);
a=0;//     invoke-static {v0}, Lcom/umeng/update/net/i;->a(Lcom/umeng/update/net/i;)Lcom/umeng/update/net/u;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v1, p1, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-interface {v0, v1}, Lcom/umeng/update/net/u;->b(I)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_1
a=0;//         :pswitch_4
a=0;//         :pswitch_2
a=0;//         :pswitch_0
a=0;//         :pswitch_3
a=0;//     .end packed-switch
a=0;// .end method
}}
