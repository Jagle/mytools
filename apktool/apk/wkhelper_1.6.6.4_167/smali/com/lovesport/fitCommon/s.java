package com.lovesport.fitCommon; class s { void a() { int a;
a=0;// .class final Lcom/lovesport/fitCommon/s;
a=0;// .super Landroid/os/Handler;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/lovesport/fitCommon/p;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/lovesport/fitCommon/p;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/lovesport/fitCommon/s;->a:Lcom/lovesport/fitCommon/p;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/lovesport/fitCommon/s;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final handleMessage(Landroid/os/Message;)V
a=0;//     .locals 4
a=0;// 
a=0;//     iget v0, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/s;->a:Lcom/lovesport/fitCommon/p;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lovesport/fitCommon/p;);
a=0;//     invoke-virtual {v0}, Lcom/lovesport/fitCommon/p;->a()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/s;->a:Lcom/lovesport/fitCommon/p;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lovesport/fitCommon/p;);
a=0;//     invoke-static {v0}, Lcom/lovesport/fitCommon/p;->f(Lcom/lovesport/fitCommon/p;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/lovesport/fitCommon/s;->a:Lcom/lovesport/fitCommon/p;
a=0;// 
a=0;//     #v1=(Reference,Lcom/lovesport/fitCommon/p;);
a=0;//     invoke-static {v1}, Lcom/lovesport/fitCommon/p;->g(Lcom/lovesport/fitCommon/p;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/lovesport/fitCommon/s;->a:Lcom/lovesport/fitCommon/p;
a=0;// 
a=0;//     #v1=(Reference,Lcom/lovesport/fitCommon/p;);
a=0;//     invoke-static {v1}, Lcom/lovesport/fitCommon/p;->b(Lcom/lovesport/fitCommon/p;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/lovesport/fitCommon/s;->a:Lcom/lovesport/fitCommon/p;
a=0;// 
a=0;//     #v1=(Reference,Lcom/lovesport/fitCommon/p;);
a=0;//     invoke-static {v1}, Lcom/lovesport/fitCommon/p;->h(Lcom/lovesport/fitCommon/p;)Lcom/lovesport/fitCommon/u;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Lcom/lovesport/fitCommon/u;->c()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {p0, v1}, Lcom/lovesport/fitCommon/s;->obtainMessage(I)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Message;);
a=0;//     rem-int/lit16 v0, v0, 0x3e8
a=0;// 
a=0;//     rsub-int v0, v0, 0x3e8
a=0;// 
a=0;//     int-to-long v2, v0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {p0, v1, v2, v3}, Lcom/lovesport/fitCommon/s;->sendMessageDelayed(Landroid/os/Message;J)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
}}
