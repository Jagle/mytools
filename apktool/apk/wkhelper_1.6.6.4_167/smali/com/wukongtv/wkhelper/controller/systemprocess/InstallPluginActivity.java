package com.wukongtv.wkhelper.controller.systemprocess; class InstallPluginActivity { void a() { int a;
a=0;// .class public Lcom/wukongtv/wkhelper/controller/systemprocess/InstallPluginActivity;
a=0;// .super Landroid/app/Activity;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public a:Ljava/lang/Boolean;
a=0;// 
a=0;// .field b:Ljava/lang/String;
a=0;// 
a=0;// .field c:Ljava/lang/String;
a=0;// 
a=0;// .field d:Landroid/widget/TextView;
a=0;// 
a=0;// .field e:Landroid/widget/Button;
a=0;// 
a=0;// .field f:Landroid/widget/Button;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/controller/systemprocess/InstallPluginActivity;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Boolean;);
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/controller/systemprocess/InstallPluginActivity;->a:Ljava/lang/Boolean;
a=0;// 
a=0;//     return-void
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
a=0;//     invoke-virtual {p0, v0}, Lcom/wukongtv/wkhelper/controller/systemprocess/InstallPluginActivity;->setContentView(I)V
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/controller/systemprocess/InstallPluginActivity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "packagename"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/wukongtv/wkhelper/controller/systemprocess/InstallPluginActivity;->b:Ljava/lang/String;
a=0;// 
a=0;//     const-string v1, "targetapkpath"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/controller/systemprocess/InstallPluginActivity;->c:Ljava/lang/String;
a=0;// 
a=0;//     const v0, 0x7f0b001f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/wukongtv/wkhelper/controller/systemprocess/InstallPluginActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/controller/systemprocess/InstallPluginActivity;->e:Landroid/widget/Button;
a=0;// 
a=0;//     const v0, 0x7f0b0020
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/wukongtv/wkhelper/controller/systemprocess/InstallPluginActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/controller/systemprocess/InstallPluginActivity;->f:Landroid/widget/Button;
a=0;// 
a=0;//     const v0, 0x7f0b001b
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/wukongtv/wkhelper/controller/systemprocess/InstallPluginActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/controller/systemprocess/InstallPluginActivity;->d:Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/controller/systemprocess/InstallPluginActivity;->e:Landroid/widget/Button;
a=0;// 
a=0;//     new-instance v1, Lcom/wukongtv/wkhelper/controller/systemprocess/c;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/wukongtv/wkhelper/controller/systemprocess/c;);
a=0;//     invoke-direct {v1, p0}, Lcom/wukongtv/wkhelper/controller/systemprocess/c;-><init>(Lcom/wukongtv/wkhelper/controller/systemprocess/InstallPluginActivity;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/controller/systemprocess/c;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/controller/systemprocess/InstallPluginActivity;->f:Landroid/widget/Button;
a=0;// 
a=0;//     new-instance v1, Lcom/wukongtv/wkhelper/controller/systemprocess/d;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/wukongtv/wkhelper/controller/systemprocess/d;);
a=0;//     invoke-direct {v1, p0}, Lcom/wukongtv/wkhelper/controller/systemprocess/d;-><init>(Lcom/wukongtv/wkhelper/controller/systemprocess/InstallPluginActivity;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/controller/systemprocess/d;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onResume()V
a=0;//     .locals 3
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/controller/systemprocess/InstallPluginActivity;->a:Ljava/lang/Boolean;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Boolean;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/controller/systemprocess/InstallPluginActivity;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v0}, Lcom/wukongtv/wkhelper/a/g;->a(Landroid/content/Context;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
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
a=0;//     invoke-virtual {p0, v0}, Lcom/wukongtv/wkhelper/controller/systemprocess/InstallPluginActivity;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/controller/systemprocess/InstallPluginActivity;->finish()V
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onResume()V
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/controller/systemprocess/InstallPluginActivity;->f:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/controller/systemprocess/InstallPluginActivity;->e:Landroid/widget/Button;
a=0;// 
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/controller/systemprocess/InstallPluginActivity;->d:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/controller/systemprocess/InstallPluginActivity;->getResources()Landroid/content/res/Resources;
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
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/controller/systemprocess/InstallPluginActivity;->e:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/controller/systemprocess/InstallPluginActivity;->getResources()Landroid/content/res/Resources;
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
