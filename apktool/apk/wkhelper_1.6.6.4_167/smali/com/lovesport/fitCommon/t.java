package com.lovesport.fitCommon; class t { void a() { int a;
a=0;// .class final Lcom/lovesport/fitCommon/t;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/widget/SeekBar$OnSeekBarChangeListener;
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
a=0;//     iput-object p1, p0, Lcom/lovesport/fitCommon/t;->a:Lcom/lovesport/fitCommon/p;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/lovesport/fitCommon/t;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final onProgressChanged(Landroid/widget/SeekBar;IZ)V
a=0;//     .locals 4
a=0;// 
a=0;//     if-nez p3, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     const-string v0, "mandy"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "onProgressChanged"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/t;->a:Lcom/lovesport/fitCommon/p;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/lovesport/fitCommon/p;->h(Lcom/lovesport/fitCommon/p;)Lcom/lovesport/fitCommon/u;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Lcom/lovesport/fitCommon/u;->getDuration()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     int-to-long v2, p2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     mul-long/2addr v0, v2
a=0;// 
a=0;//     const-wide/16 v2, 0x3e8
a=0;// 
a=0;//     div-long/2addr v0, v2
a=0;// 
a=0;//     iget-object v2, p0, Lcom/lovesport/fitCommon/t;->a:Lcom/lovesport/fitCommon/p;
a=0;// 
a=0;//     #v2=(Reference,Lcom/lovesport/fitCommon/p;);
a=0;//     invoke-static {v2}, Lcom/lovesport/fitCommon/p;->h(Lcom/lovesport/fitCommon/p;)Lcom/lovesport/fitCommon/u;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     long-to-int v3, v0
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-interface {v2, v3}, Lcom/lovesport/fitCommon/u;->a(I)V
a=0;// 
a=0;//     iget-object v2, p0, Lcom/lovesport/fitCommon/t;->a:Lcom/lovesport/fitCommon/p;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/lovesport/fitCommon/p;->j(Lcom/lovesport/fitCommon/p;)Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     iget-object v2, p0, Lcom/lovesport/fitCommon/t;->a:Lcom/lovesport/fitCommon/p;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/lovesport/fitCommon/p;->j(Lcom/lovesport/fitCommon/p;)Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/lovesport/fitCommon/t;->a:Lcom/lovesport/fitCommon/p;
a=0;// 
a=0;//     #v3=(Reference,Lcom/lovesport/fitCommon/p;);
a=0;//     long-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v3, v0}, Lcom/lovesport/fitCommon/p;->a(Lcom/lovesport/fitCommon/p;I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final onStartTrackingTouch(Landroid/widget/SeekBar;)V
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/t;->a:Lcom/lovesport/fitCommon/p;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lovesport/fitCommon/p;);
a=0;//     const v1, 0x36ee80
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Lcom/lovesport/fitCommon/p;->a(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/t;->a:Lcom/lovesport/fitCommon/p;
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-static {v0, v1}, Lcom/lovesport/fitCommon/p;->a(Lcom/lovesport/fitCommon/p;Z)Z
a=0;// 
a=0;//     const-string v0, "mandy"
a=0;// 
a=0;//     const-string v1, "onStartTrackingTouch"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/t;->a:Lcom/lovesport/fitCommon/p;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/lovesport/fitCommon/p;->i(Lcom/lovesport/fitCommon/p;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final onStopTrackingTouch(Landroid/widget/SeekBar;)V
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/t;->a:Lcom/lovesport/fitCommon/p;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lovesport/fitCommon/p;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v0, v1}, Lcom/lovesport/fitCommon/p;->a(Lcom/lovesport/fitCommon/p;Z)Z
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/t;->a:Lcom/lovesport/fitCommon/p;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/lovesport/fitCommon/p;->f(Lcom/lovesport/fitCommon/p;)I
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/t;->a:Lcom/lovesport/fitCommon/p;
a=0;// 
a=0;//     const/16 v1, 0xbb8
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-virtual {v0, v1}, Lcom/lovesport/fitCommon/p;->a(I)V
a=0;// 
a=0;//     const-string v0, "mandy"
a=0;// 
a=0;//     const-string v1, "onStopTrackingTouch"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lovesport/fitCommon/t;->a:Lcom/lovesport/fitCommon/p;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/lovesport/fitCommon/p;->i(Lcom/lovesport/fitCommon/p;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
