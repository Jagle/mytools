package com.wukongtv.wkhelper; class PowerOffHintActivity { void a() { int a;
a=0;// .class public Lcom/wukongtv/wkhelper/PowerOffHintActivity;
a=0;// .super Landroid/app/Activity;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Landroid/widget/TextView;
a=0;// 
a=0;// .field private b:Z
a=0;// 
a=0;// .field private c:Landroid/os/CountDownTimer;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/PowerOffHintActivity;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/wukongtv/wkhelper/PowerOffHintActivity;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     iget-boolean v0, p0, Lcom/wukongtv/wkhelper/PowerOffHintActivity;->b:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcom/wukongtv/wkhelper/PowerOffHintActivity;)Landroid/widget/TextView;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/PowerOffHintActivity;->a:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic c(Lcom/wukongtv/wkhelper/PowerOffHintActivity;)V
a=0;//     .locals 3
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/PowerOffHintActivity;->c:Landroid/os/CountDownTimer;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/CountDownTimer;);
a=0;//     invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V
a=0;// 
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v1, Lcom/wukongtv/wkhelper/RemoteService;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "extraaction"
a=0;// 
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/wukongtv/wkhelper/PowerOffHintActivity;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/PowerOffHintActivity;->finish()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     const v0, 0x7f030005
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/wukongtv/wkhelper/PowerOffHintActivity;->setContentView(I)V
a=0;// 
a=0;//     const v0, 0x7f0b002e
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/wukongtv/wkhelper/PowerOffHintActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/PowerOffHintActivity;->a:Landroid/widget/TextView;
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/p;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/p;);
a=0;//     invoke-direct {v0, p0}, Lcom/wukongtv/wkhelper/p;-><init>(Lcom/wukongtv/wkhelper/PowerOffHintActivity;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/p;);
a=0;//     invoke-virtual {v0}, Lcom/wukongtv/wkhelper/p;->start()Landroid/os/CountDownTimer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/PowerOffHintActivity;->c:Landroid/os/CountDownTimer;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onKeyDown(ILandroid/view/KeyEvent;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/PowerOffHintActivity;->c:Landroid/os/CountDownTimer;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/CountDownTimer;);
a=0;//     invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/PowerOffHintActivity;->finish()V
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected onPause()V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onPause()V
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/wukongtv/wkhelper/PowerOffHintActivity;->b:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
