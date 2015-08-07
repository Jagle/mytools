package com.wukongtv.wkhelper.controller.masterkey; class InstallMKPluginActivity { void a() { int a;
a=0;// .class public Lcom/wukongtv/wkhelper/controller/masterkey/InstallMKPluginActivity;
a=0;// .super Landroid/app/Activity;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final a:[Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field b:Landroid/widget/TextView;
a=0;// 
a=0;// .field c:Landroid/widget/Button;
a=0;// 
a=0;// .field d:Landroid/widget/Button;
a=0;// 
a=0;// .field private e:Ljava/lang/Boolean;
a=0;// 
a=0;// .field private final f:Ljava/lang/String;
a=0;// 
a=0;// .field private final g:Ljava/lang/String;
a=0;// 
a=0;// .field private final h:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const-string v2, "MiBOX_iCNTV"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const-string v2, "MiBOX1S"
a=0;// 
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     const-string v2, "i71"
a=0;// 
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     sput-object v0, Lcom/wukongtv/wkhelper/controller/masterkey/InstallMKPluginActivity;->a:[Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/controller/masterkey/InstallMKPluginActivity;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Boolean;);
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/controller/masterkey/InstallMKPluginActivity;->e:Ljava/lang/Boolean;
a=0;// 
a=0;//     const-string v0, "DOWN1_PLUGIN_MIBOX1"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/a/c;->b(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/controller/masterkey/InstallMKPluginActivity;->f:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "DOWN1_PLUGIN_MIBOX1S"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/a/c;->b(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/controller/masterkey/InstallMKPluginActivity;->g:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "DOWN1_PLUGIN_I71"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/a/c;->b(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/controller/masterkey/InstallMKPluginActivity;->h:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/wukongtv/wkhelper/controller/masterkey/InstallMKPluginActivity;Ljava/lang/Boolean;)Ljava/lang/Boolean;
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/wukongtv/wkhelper/controller/masterkey/InstallMKPluginActivity;->e:Ljava/lang/Boolean;
a=0;// 
a=0;//     return-object p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/wukongtv/wkhelper/controller/masterkey/InstallMKPluginActivity;)V
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     sget-object v2, Lcom/wukongtv/wkhelper/controller/masterkey/InstallMKPluginActivity;->a:[Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     array-length v3, v2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v4=(Conflicted);v5=(Conflicted);
a=0;//     if-ge v0, v3, :cond_0
a=0;// 
a=0;//     aget-object v4, v2, v0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     sget-object v5, Landroid/os/Build;->MODEL:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_4
a=0;// 
a=0;//     invoke-static {p0}, Lcom/wukongtv/wkhelper/d/a;->a(Landroid/content/Context;)Lcom/wukongtv/wkhelper/d/a;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sget-object v3, Lcom/wukongtv/wkhelper/controller/masterkey/InstallMKPluginActivity;->a:[Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/String;);
a=0;//     aget-object v1, v3, v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/controller/masterkey/InstallMKPluginActivity;->f:Ljava/lang/String;
a=0;// 
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);
a=0;//     new-instance v1, Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/os/Handler;);
a=0;//     invoke-direct {v1}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     const-string v3, "\u9065\u63a7\u63d2\u4ef6"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v0, v1, v3}, Lcom/wukongtv/wkhelper/d/a;->a(Ljava/lang/String;Landroid/os/Handler;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Boolean);v2=(Reference,Lcom/wukongtv/wkhelper/d/a;);v3=(Reference,[Ljava/lang/String;);v4=(Boolean);v5=(Reference,Ljava/lang/String;);
a=0;//     sget-object v1, Lcom/wukongtv/wkhelper/controller/masterkey/InstallMKPluginActivity;->a:[Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     aget-object v1, v1, v3
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/controller/masterkey/InstallMKPluginActivity;->g:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     sget-object v1, Lcom/wukongtv/wkhelper/controller/masterkey/InstallMKPluginActivity;->a:[Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     aget-object v1, v1, v3
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/controller/masterkey/InstallMKPluginActivity;->h:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Integer);v3=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     const v0, 0x7f030002
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/wukongtv/wkhelper/controller/masterkey/InstallMKPluginActivity;->setContentView(I)V
a=0;// 
a=0;//     const v0, 0x7f0b001f
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/wukongtv/wkhelper/controller/masterkey/InstallMKPluginActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/controller/masterkey/InstallMKPluginActivity;->c:Landroid/widget/Button;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/controller/masterkey/InstallMKPluginActivity;->c:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/Button;->requestFocus()Z
a=0;// 
a=0;//     const v0, 0x7f0b0020
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/wukongtv/wkhelper/controller/masterkey/InstallMKPluginActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/controller/masterkey/InstallMKPluginActivity;->d:Landroid/widget/Button;
a=0;// 
a=0;//     const v0, 0x7f0b001b
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/wukongtv/wkhelper/controller/masterkey/InstallMKPluginActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/controller/masterkey/InstallMKPluginActivity;->b:Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/controller/masterkey/InstallMKPluginActivity;->c:Landroid/widget/Button;
a=0;// 
a=0;//     new-instance v1, Lcom/wukongtv/wkhelper/controller/masterkey/a;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/wukongtv/wkhelper/controller/masterkey/a;);
a=0;//     invoke-direct {v1, p0}, Lcom/wukongtv/wkhelper/controller/masterkey/a;-><init>(Lcom/wukongtv/wkhelper/controller/masterkey/InstallMKPluginActivity;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/controller/masterkey/a;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/controller/masterkey/InstallMKPluginActivity;->d:Landroid/widget/Button;
a=0;// 
a=0;//     new-instance v1, Lcom/wukongtv/wkhelper/controller/masterkey/b;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/wukongtv/wkhelper/controller/masterkey/b;);
a=0;//     invoke-direct {v1, p0}, Lcom/wukongtv/wkhelper/controller/masterkey/b;-><init>(Lcom/wukongtv/wkhelper/controller/masterkey/InstallMKPluginActivity;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/controller/masterkey/b;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onDestroy()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onDestroy()V
a=0;// 
a=0;//     invoke-static {p0}, Lcom/wukongtv/wkhelper/d/a;->a(Landroid/content/Context;)Lcom/wukongtv/wkhelper/d/a;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onResume()V
a=0;//     .locals 3
a=0;// 
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onResume()V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/controller/masterkey/InstallMKPluginActivity;->e:Ljava/lang/Boolean;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Boolean;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v0
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
a=0;//     invoke-static {p0, v0}, Lcom/wukongtv/wkhelper/a/g;->a(Landroid/content/Context;Landroid/content/Intent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v1, Lcom/wukongtv/wkhelper/RemoteService;
a=0;// 
a=0;//     invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {p0, v0}, Lcom/wukongtv/wkhelper/controller/masterkey/InstallMKPluginActivity;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/controller/masterkey/InstallMKPluginActivity;->finish()V
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Reference,Ljava/lang/String;);v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/controller/masterkey/InstallMKPluginActivity;->d:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/controller/masterkey/InstallMKPluginActivity;->c:Landroid/widget/Button;
a=0;// 
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/controller/masterkey/InstallMKPluginActivity;->b:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/controller/masterkey/InstallMKPluginActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/res/Resources;);
a=0;//     const v2, 0x7f07004d
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/controller/masterkey/InstallMKPluginActivity;->c:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/controller/masterkey/InstallMKPluginActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const v2, 0x7f070062
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
