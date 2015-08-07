package com.wukongtv.wkhelper.controller.systemprocess; class c { void a() { int a;
a=0;// .class final Lcom/wukongtv/wkhelper/controller/systemprocess/c;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/wukongtv/wkhelper/controller/systemprocess/InstallPluginActivity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/wukongtv/wkhelper/controller/systemprocess/InstallPluginActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/wukongtv/wkhelper/controller/systemprocess/c;->a:Lcom/wukongtv/wkhelper/controller/systemprocess/InstallPluginActivity;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/controller/systemprocess/c;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final onClick(Landroid/view/View;)V
a=0;//     .locals 3
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/controller/systemprocess/c;->a:Lcom/wukongtv/wkhelper/controller/systemprocess/InstallPluginActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/controller/systemprocess/InstallPluginActivity;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Boolean;);
a=0;//     iput-object v1, v0, Lcom/wukongtv/wkhelper/controller/systemprocess/InstallPluginActivity;->a:Ljava/lang/Boolean;
a=0;// 
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-string v1, "android.intent.action.VIEW"
a=0;// 
a=0;//     invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/controller/systemprocess/c;->a:Lcom/wukongtv/wkhelper/controller/systemprocess/InstallPluginActivity;
a=0;// 
a=0;//     #v2=(Reference,Lcom/wukongtv/wkhelper/controller/systemprocess/InstallPluginActivity;);
a=0;//     iget-object v2, v2, Lcom/wukongtv/wkhelper/controller/systemprocess/InstallPluginActivity;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-static {v1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "application/vnd.android.package-archive"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/controller/systemprocess/c;->a:Lcom/wukongtv/wkhelper/controller/systemprocess/InstallPluginActivity;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcom/wukongtv/wkhelper/controller/systemprocess/InstallPluginActivity;->startActivity(Landroid/content/Intent;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
