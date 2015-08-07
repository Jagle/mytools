package com.wukongtv.wkhelper; class p { void a() { int a;
a=0;// .class final Lcom/wukongtv/wkhelper/p;
a=0;// .super Landroid/os/CountDownTimer;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/wukongtv/wkhelper/PowerOffHintActivity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/wukongtv/wkhelper/PowerOffHintActivity;)V
a=0;//     .locals 4
a=0;// 
a=0;//     iput-object p1, p0, Lcom/wukongtv/wkhelper/p;->a:Lcom/wukongtv/wkhelper/PowerOffHintActivity;
a=0;// 
a=0;//     const-wide/16 v0, 0x7530
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const-wide/16 v2, 0x3e8
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-direct {p0, v0, v1, v2, v3}, Landroid/os/CountDownTimer;-><init>(JJ)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/p;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final onFinish()V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/p;->a:Lcom/wukongtv/wkhelper/PowerOffHintActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/PowerOffHintActivity;);
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/PowerOffHintActivity;->a(Lcom/wukongtv/wkhelper/PowerOffHintActivity;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/p;->a:Lcom/wukongtv/wkhelper/PowerOffHintActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/PowerOffHintActivity;);
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/PowerOffHintActivity;->c(Lcom/wukongtv/wkhelper/PowerOffHintActivity;)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final onTick(J)V
a=0;//     .locals 7
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/p;->a:Lcom/wukongtv/wkhelper/PowerOffHintActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/PowerOffHintActivity;);
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/PowerOffHintActivity;->a(Lcom/wukongtv/wkhelper/PowerOffHintActivity;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/p;->a:Lcom/wukongtv/wkhelper/PowerOffHintActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/PowerOffHintActivity;);
a=0;//     const v1, 0x7f07006c
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const-wide/16 v4, 0x3e8
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     div-long v4, p1, v4
a=0;// 
a=0;//     invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Long;);
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/wukongtv/wkhelper/PowerOffHintActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/p;->a:Lcom/wukongtv/wkhelper/PowerOffHintActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/PowerOffHintActivity;);
a=0;//     invoke-static {v1}, Lcom/wukongtv/wkhelper/PowerOffHintActivity;->b(Lcom/wukongtv/wkhelper/PowerOffHintActivity;)Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v2, Landroid/widget/TextView$BufferType;->SPANNABLE:Landroid/widget/TextView$BufferType;
a=0;// 
a=0;//     invoke-virtual {v1, v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
