package com.wukongtv.wkhelper.childlock; class a { void a() { int a;
a=0;// .class public final Lcom/wukongtv/wkhelper/childlock/a;
a=0;// .super Landroid/os/Handler;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Landroid/content/Context;
a=0;// 
a=0;// .field private b:Landroid/view/View;
a=0;// 
a=0;// .field private c:Landroid/view/WindowManager;
a=0;// 
a=0;// .field private d:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/childlock/a;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/wukongtv/wkhelper/childlock/a;->d:Z
a=0;// 
a=0;//     iput-object p1, p0, Lcom/wukongtv/wkhelper/childlock/a;->a:Landroid/content/Context;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a()V
a=0;//     .locals 2
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/childlock/a;->c:Landroid/view/WindowManager;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/WindowManager;);
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/childlock/a;->b:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-interface {v0, v1}, Landroid/view/WindowManager;->removeView(Landroid/view/View;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final handleMessage(Landroid/os/Message;)V
a=0;//     .locals 5
a=0;// 
a=0;//     const v4, 0x544354
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v3, -0x2
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V
a=0;// 
a=0;//     iget v0, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :pswitch_0
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Byte);
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/childlock/a;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const-class v2, Lcom/wukongtv/wkhelper/childlock/ChildLockActivity;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const/high16 v1, 0x10000000
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     const-string v1, "timer"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget v2, p1, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/childlock/a;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/wukongtv/wkhelper/childlock/a;->d:Z
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/wukongtv/wkhelper/childlock/a;->a()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);
a=0;//     iget-boolean v0, p0, Lcom/wukongtv/wkhelper/childlock/a;->d:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/childlock/a;->b:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/childlock/a;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const v1, 0x7f030007
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/childlock/a;->b:Landroid/view/View;
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/childlock/a;->a:Landroid/content/Context;
a=0;// 
a=0;//     const-string v1, "window"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/view/WindowManager;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/childlock/a;->c:Landroid/view/WindowManager;
a=0;// 
a=0;//     new-instance v0, Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/WindowManager$LayoutParams;);
a=0;//     invoke-direct {v0}, Landroid/view/WindowManager$LayoutParams;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/WindowManager$LayoutParams;);
a=0;//     iput v3, v0, Landroid/view/WindowManager$LayoutParams;->height:I
a=0;// 
a=0;//     iput v3, v0, Landroid/view/WindowManager$LayoutParams;->width:I
a=0;// 
a=0;//     const/16 v1, 0x98
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     iput v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I
a=0;// 
a=0;//     const/4 v1, -0x3
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     iput v1, v0, Landroid/view/WindowManager$LayoutParams;->format:I
a=0;// 
a=0;//     const/16 v1, 0x7d5
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     iput v1, v0, Landroid/view/WindowManager$LayoutParams;->type:I
a=0;// 
a=0;//     const v1, 0x800055
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/childlock/a;->c:Landroid/view/WindowManager;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/WindowManager;);
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/childlock/a;->b:Landroid/view/View;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     invoke-interface {v1, v2, v0}, Landroid/view/WindowManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/wukongtv/wkhelper/childlock/a;->d:Z
a=0;// 
a=0;//     invoke-virtual {p0, v4}, Lcom/wukongtv/wkhelper/childlock/a;->removeMessages(I)V
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Message;);
a=0;//     iput v4, v1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     iget v0, p1, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, v1, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     iget v0, p1, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     if-ne v0, v3, :cond_2
a=0;// 
a=0;//     const v0, 0xdbba0
a=0;// 
a=0;//     :goto_2
a=0;//     int-to-long v2, v0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {p0, v1, v2, v3}, Lcom/wukongtv/wkhelper/childlock/a;->sendMessageDelayed(Landroid/os/Message;J)Z
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);v3=(Byte);
a=0;//     mul-int/lit16 v0, v0, 0x3e8
a=0;// 
a=0;//     mul-int/lit8 v0, v0, 0x3c
a=0;// 
a=0;//     mul-int/lit8 v0, v0, 0x1e
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :pswitch_2
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     invoke-direct {p0}, Lcom/wukongtv/wkhelper/childlock/a;->a()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Reference,Landroid/view/WindowManager$LayoutParams;);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x544354
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// .end method
}}
