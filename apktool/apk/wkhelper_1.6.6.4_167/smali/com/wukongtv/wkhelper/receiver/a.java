package com.wukongtv.wkhelper.receiver; class a { void a() { int a;
a=0;// .class final Lcom/wukongtv/wkhelper/receiver/a;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Landroid/content/Context;
a=0;// 
a=0;// .field final synthetic b:Landroid/app/AlertDialog;
a=0;// 
a=0;// .field final synthetic c:Lcom/wukongtv/wkhelper/receiver/ImeReceiver;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/wukongtv/wkhelper/receiver/ImeReceiver;Landroid/content/Context;Landroid/app/AlertDialog;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/wukongtv/wkhelper/receiver/a;->c:Lcom/wukongtv/wkhelper/receiver/ImeReceiver;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/wukongtv/wkhelper/receiver/a;->a:Landroid/content/Context;
a=0;// 
a=0;//     iput-object p3, p0, Lcom/wukongtv/wkhelper/receiver/a;->b:Landroid/app/AlertDialog;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/receiver/a;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final onClick(Landroid/view/View;)V
a=0;//     .locals 3
a=0;// 
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/receiver/a;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const-class v2, Lcom/wukongtv/wkhelper/RemoteService;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "extraaction"
a=0;// 
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/receiver/a;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/receiver/a;->b:Landroid/app/AlertDialog;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
