package com.wukongtv.wkhelper.CleanCache; class c { void a() { int a;
a=0;// .class final Lcom/wukongtv/wkhelper/CleanCache/c;
a=0;// .super Ljava/lang/Thread;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/wukongtv/wkhelper/CleanCache/a;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/wukongtv/wkhelper/CleanCache/a;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/wukongtv/wkhelper/CleanCache/c;->a:Lcom/wukongtv/wkhelper/CleanCache/a;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/CleanCache/c;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final run()V
a=0;//     .locals 4
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/CleanCache/c;->a:Lcom/wukongtv/wkhelper/CleanCache/a;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/CleanCache/a;);
a=0;//     iget-object v0, v0, Lcom/wukongtv/wkhelper/CleanCache/a;->b:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/util/Iterator;);v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/io/File;->isFile()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/CleanCache/a;->a(Ljava/lang/String;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {v0, v2}, Lcom/wukongtv/wkhelper/CleanCache/a;->a(Ljava/lang/String;I)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/CleanCache/c;->a:Lcom/wukongtv/wkhelper/CleanCache/a;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/CleanCache/a;);
a=0;//     iget-object v0, v0, Lcom/wukongtv/wkhelper/CleanCache/a;->a:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_1
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/CleanCache/a;->a(Ljava/lang/String;)Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/CleanCache/c;->a:Lcom/wukongtv/wkhelper/CleanCache/a;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/CleanCache/a;);
a=0;//     invoke-virtual {v0}, Lcom/wukongtv/wkhelper/CleanCache/a;->a()V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/CleanCache/c;->a:Lcom/wukongtv/wkhelper/CleanCache/a;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/wukongtv/wkhelper/CleanCache/a;->e:Lcom/wukongtv/wkhelper/CleanCache/e;
a=0;// 
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/CleanCache/c;->a:Lcom/wukongtv/wkhelper/CleanCache/a;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/wukongtv/wkhelper/CleanCache/a;->e:Lcom/wukongtv/wkhelper/CleanCache/e;
a=0;// 
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-interface {v0, v1}, Lcom/wukongtv/wkhelper/CleanCache/e;->a(I)V
a=0;// 
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
