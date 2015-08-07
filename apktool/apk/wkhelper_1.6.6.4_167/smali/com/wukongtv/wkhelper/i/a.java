package com.wukongtv.wkhelper.i; class a { void a() { int a;
a=0;// .class public final Lcom/wukongtv/wkhelper/i/a;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/wukongtv/wkhelper/i/e;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public a:Lcom/wukongtv/wkhelper/i/c;
a=0;// 
a=0;// .field public b:Ljava/lang/String;
a=0;// 
a=0;// .field public c:Lcom/wukongtv/wkhelper/i/b;
a=0;// 
a=0;// .field private d:Landroid/content/Context;
a=0;// 
a=0;// .field private e:Lcom/wukongtv/wkhelper/a/e;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;)V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/i/a;);
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/i/c;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/i/c;);
a=0;//     invoke-direct {v0, p2}, Lcom/wukongtv/wkhelper/i/c;-><init>(Landroid/os/Handler;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/i/c;);
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/i/a;->a:Lcom/wukongtv/wkhelper/i/c;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/i/a;->a:Lcom/wukongtv/wkhelper/i/c;
a=0;// 
a=0;//     const/16 v1, 0x7d0
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     iput v1, v0, Lcom/wukongtv/wkhelper/i/c;->b:I
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/i/a;->a:Lcom/wukongtv/wkhelper/i/c;
a=0;// 
a=0;//     iput-object p0, v0, Lcom/wukongtv/wkhelper/i/c;->a:Lcom/wukongtv/wkhelper/i/e;
a=0;// 
a=0;//     iput-object p1, p0, Lcom/wukongtv/wkhelper/i/a;->d:Landroid/content/Context;
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/a/e;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/a/e;);
a=0;//     invoke-direct {v0}, Lcom/wukongtv/wkhelper/a/e;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/a/e;);
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/i/a;->e:Lcom/wukongtv/wkhelper/a/e;
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/i/a;->b:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a()V
a=0;//     .locals 4
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/i/a;->d:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const-string v1, "activity"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/ActivityManager;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     :try_start_0
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v2}, Landroid/app/ActivityManager;->getRunningTasks(I)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/ActivityManager$RunningTaskInfo;
a=0;// 
a=0;//     iget-object v0, v0, Landroid/app/ActivityManager$RunningTaskInfo;->topActivity:Landroid/content/ComponentName;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Reference,Ujava/lang/Object;);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Reference,Ljava/lang/Object;);v1=(Null);v2=(Boolean);v3=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/content/ComponentName;);
a=0;//     invoke-virtual {v0}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/i/a;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iput-object v1, p0, Lcom/wukongtv/wkhelper/i/a;->b:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/i/a;->e:Lcom/wukongtv/wkhelper/a/e;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/a/e;);
a=0;//     invoke-virtual {v0, v1}, Lcom/wukongtv/wkhelper/a/e;->a(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/wukongtv/wkhelper/b/j;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/i/a;->d:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/wukongtv/wkhelper/a/j;->a(Landroid/content/Context;Ljava/lang/String;)Lcom/wukongtv/wkhelper/b/j;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/b/j;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/b/j;);
a=0;//     invoke-direct {v0}, Lcom/wukongtv/wkhelper/b/j;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/b/j;);
a=0;//     invoke-virtual {v0, v1}, Lcom/wukongtv/wkhelper/b/j;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_2
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "send info :"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Lcom/wukongtv/wkhelper/b/j;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/i/a;->d:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v2, v1}, Lcom/wukongtv/wkhelper/a/k;->a(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/h/a;->a()Lcom/wukongtv/wkhelper/h/a;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcom/wukongtv/wkhelper/h/a;->a(Lcom/wukongtv/wkhelper/b/j;)V
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/i/a;->c:Lcom/wukongtv/wkhelper/i/b;
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/i/a;->c:Lcom/wukongtv/wkhelper/i/b;
a=0;// 
a=0;//     invoke-interface {v1, v0}, Lcom/wukongtv/wkhelper/i/b;->a(Lcom/wukongtv/wkhelper/b/j;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
