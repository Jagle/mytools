package com.wukongtv.wkhelper.CleanCache; class d { void a() { int a;
a=0;// .class final Lcom/wukongtv/wkhelper/CleanCache/d;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/wukongtv/wkhelper/CleanCache/e;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/wukongtv/wkhelper/CleanCache/d;->a:Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/CleanCache/d;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(I)V
a=0;//     .locals 4
a=0;// 
a=0;//     invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Message;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput v1, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     iput p1, v0, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/CleanCache/d;->a:Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;);
a=0;//     invoke-static {v1}, Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;->n(Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;)Lcom/wukongtv/wkhelper/CleanCache/f;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-wide/16 v2, 0x7d0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v1, v0, v2, v3}, Lcom/wukongtv/wkhelper/CleanCache/f;->sendMessageDelayed(Landroid/os/Message;J)Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final a(Ljava/io/File;J)V
a=0;//     .locals 4
a=0;// 
a=0;//     new-instance v0, Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v1, "filesize"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p2, p3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V
a=0;// 
a=0;//     const-string v1, "file"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V
a=0;// 
a=0;//     invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     iput v2, v1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     iput-object p1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/CleanCache/d;->a:Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;->n(Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;)Lcom/wukongtv/wkhelper/CleanCache/f;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/wukongtv/wkhelper/CleanCache/f;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final a(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Message;);
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/CleanCache/d;->a:Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;);
a=0;//     invoke-static {v1}, Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;->n(Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;)Lcom/wukongtv/wkhelper/CleanCache/f;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcom/wukongtv/wkhelper/CleanCache/f;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final b(Ljava/io/File;J)V
a=0;//     .locals 4
a=0;// 
a=0;//     new-instance v0, Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v1, "filesize"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p2, p3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V
a=0;// 
a=0;//     const-string v1, "file"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V
a=0;// 
a=0;//     invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     iput v2, v1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     iput-object p1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/CleanCache/d;->a:Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;->n(Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;)Lcom/wukongtv/wkhelper/CleanCache/f;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/wukongtv/wkhelper/CleanCache/f;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
