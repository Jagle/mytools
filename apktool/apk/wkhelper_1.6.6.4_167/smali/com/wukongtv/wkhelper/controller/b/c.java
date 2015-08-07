package com.wukongtv.wkhelper.controller.b; class c { void a() { int a;
a=0;// .class public Lcom/wukongtv/wkhelper/controller/b/c;
a=0;// .super Lcom/wukongtv/wkhelper/controller/a;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field b:Lnet/pocketmagic/android/eventinjector/Events;
a=0;// 
a=0;// .field c:Lcom/wukongtv/wkhelper/controller/b/b;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/wukongtv/wkhelper/controller/a;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/controller/b/c;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(III)V
a=0;//     .locals 1
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/controller/b/d;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/controller/b/d;);
a=0;//     invoke-direct {v0, p0, p2}, Lcom/wukongtv/wkhelper/controller/b/d;-><init>(Lcom/wukongtv/wkhelper/controller/b/c;I)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/controller/b/d;);
a=0;//     invoke-static {v0}, Landroid/os/AsyncTask;->execute(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final a()Z
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public final a(Landroid/content/Context;)Z
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     new-instance v2, Lnet/pocketmagic/android/eventinjector/Events;
a=0;// 
a=0;//     #v2=(UninitRef,Lnet/pocketmagic/android/eventinjector/Events;);
a=0;//     invoke-direct {v2}, Lnet/pocketmagic/android/eventinjector/Events;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Lnet/pocketmagic/android/eventinjector/Events;);
a=0;//     iput-object v2, p0, Lcom/wukongtv/wkhelper/controller/b/c;->b:Lnet/pocketmagic/android/eventinjector/Events;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/controller/b/c;->b:Lnet/pocketmagic/android/eventinjector/Events;
a=0;// 
a=0;//     invoke-virtual {v2}, Lnet/pocketmagic/android/eventinjector/Events;->a()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_3
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/controller/b/c;->b:Lnet/pocketmagic/android/eventinjector/Events;
a=0;// 
a=0;//     #v0=(Reference,Lnet/pocketmagic/android/eventinjector/Events;);
a=0;//     iget-object v0, v0, Lnet/pocketmagic/android/eventinjector/Events;->b:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/controller/b/b;->a(Ljava/util/List;)Lcom/wukongtv/wkhelper/controller/b/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/controller/b/c;->c:Lcom/wukongtv/wkhelper/controller/b/b;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/controller/b/c;->c:Lcom/wukongtv/wkhelper/controller/b/b;
a=0;// 
a=0;//     iget-boolean v1, v0, Lcom/wukongtv/wkhelper/controller/b/b;->c:Z
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     iget-object v1, v0, Lcom/wukongtv/wkhelper/controller/b/b;->a:Lnet/pocketmagic/android/eventinjector/a;
a=0;// 
a=0;//     #v1=(Reference,Lnet/pocketmagic/android/eventinjector/a;);
a=0;//     iget-object v0, v0, Lcom/wukongtv/wkhelper/controller/b/b;->a:Lnet/pocketmagic/android/eventinjector/a;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/controller/b/a;->a(Lnet/pocketmagic/android/eventinjector/a;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v1, Lnet/pocketmagic/android/eventinjector/a;->h:Ljava/util/Map;
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/controller/b/c;->c:Lcom/wukongtv/wkhelper/controller/b/b;
a=0;// 
a=0;//     iget-boolean v0, v0, Lcom/wukongtv/wkhelper/controller/b/b;->c:Z
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Null);v1=(One);
a=0;//     const-string v2, "chmod 666 /dev/input/*"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Lcom/wukongtv/a/d;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     const-string v2, " su -c chmod 666 /dev/input/*"
a=0;// 
a=0;//     invoke-static {v2}, Lcom/wukongtv/a/d;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {}, Lcom/wukongtv/a/d;->b()V
a=0;// 
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/controller/b/c;->b:Lnet/pocketmagic/android/eventinjector/Events;
a=0;// 
a=0;//     invoke-virtual {v2}, Lnet/pocketmagic/android/eventinjector/Events;->a()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-gtz v2, :cond_0
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final b(Landroid/content/Context;)Lcom/wukongtv/wkhelper/controller/a;
a=0;//     .locals 0
a=0;// 
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public final b()V
a=0;//     .locals 3
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/controller/b/c;->b:Lnet/pocketmagic/android/eventinjector/Events;
a=0;// 
a=0;//     #v0=(Reference,Lnet/pocketmagic/android/eventinjector/Events;);
a=0;//     iget-object v0, v0, Lnet/pocketmagic/android/eventinjector/Events;->b:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/util/Iterator;);v2=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lnet/pocketmagic/android/eventinjector/a;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iput-boolean v2, v0, Lnet/pocketmagic/android/eventinjector/a;->d:Z
a=0;// 
a=0;//     iget v0, v0, Lnet/pocketmagic/android/eventinjector/a;->a:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Lnet/pocketmagic/android/eventinjector/Events;->a(I)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final b(III)V
a=0;//     .locals 1
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/controller/b/e;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/controller/b/e;);
a=0;//     invoke-direct {v0, p0, p1, p2, p3}, Lcom/wukongtv/wkhelper/controller/b/e;-><init>(Lcom/wukongtv/wkhelper/controller/b/c;III)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/controller/b/e;);
a=0;//     invoke-static {v0}, Landroid/os/AsyncTask;->execute(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final c()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     const-string v0, "RootControlModule"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final c(III)V
a=0;//     .locals 1
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/controller/b/f;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/controller/b/f;);
a=0;//     invoke-direct {v0, p0, p3, p2}, Lcom/wukongtv/wkhelper/controller/b/f;-><init>(Lcom/wukongtv/wkhelper/controller/b/c;II)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/controller/b/f;);
a=0;//     invoke-static {v0}, Landroid/os/AsyncTask;->execute(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final c(Landroid/content/Context;)V
a=0;//     .locals 0
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
