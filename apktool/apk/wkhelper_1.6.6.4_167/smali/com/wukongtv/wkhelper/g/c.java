package com.wukongtv.wkhelper.g; class c { void a() { int a;
a=0;// .class final Lcom/wukongtv/wkhelper/g/c;
a=0;// .super Lcom/b/a/a/ag;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic c:Lcom/wukongtv/wkhelper/g/a;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/wukongtv/wkhelper/g/a;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/wukongtv/wkhelper/g/c;->c:Lcom/wukongtv/wkhelper/g/a;
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/b/a/a/ag;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/g/c;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(II)V
a=0;//     .locals 0
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final a(Ljava/lang/String;)V
a=0;//     .locals 5
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/g/c;->c:Lcom/wukongtv/wkhelper/g/a;
a=0;// 
a=0;//     #v2=(Reference,Lcom/wukongtv/wkhelper/g/a;);
a=0;//     invoke-static {v2}, Lcom/wukongtv/wkhelper/g/a;->a(Lcom/wukongtv/wkhelper/g/a;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "mySharedPreferences"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v2, v3, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "statmanagerlastsenttime"
a=0;// 
a=0;//     invoke-interface {v2, v3, v0, v1}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences$Editor;);
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final b(Ljava/lang/Throwable;)V
a=0;//     .locals 0
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
