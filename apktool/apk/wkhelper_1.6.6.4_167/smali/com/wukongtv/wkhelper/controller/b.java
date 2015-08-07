package com.wukongtv.wkhelper.controller; class b { void a() { int a;
a=0;// .class public final Lcom/wukongtv/wkhelper/controller/b;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/wukongtv/wkhelper/h/d;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static b:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public a:Lcom/wukongtv/wkhelper/controller/a;
a=0;// 
a=0;// .field private c:Lcom/wukongtv/wkhelper/controller/c;
a=0;// 
a=0;// .field private d:Landroid/content/Context;
a=0;// 
a=0;// .field private e:I
a=0;// 
a=0;// .field private f:I
a=0;// 
a=0;// .field private g:Z
a=0;// 
a=0;// .field private h:Landroid/os/Handler;
a=0;// 
a=0;// .field private i:Lcom/wukongtv/wkhelper/controller/f;
a=0;// 
a=0;// .field private j:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sput-object v0, Lcom/wukongtv/wkhelper/controller/b;->b:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 4
a=0;//     .annotation build Landroid/annotation/SuppressLint;
a=0;//         value = {
a=0;//             "NewApi"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/controller/b;);
a=0;//     iput-boolean v3, p0, Lcom/wukongtv/wkhelper/controller/b;->g:Z
a=0;// 
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/controller/b;->h:Landroid/os/Handler;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/controller/b;->i:Lcom/wukongtv/wkhelper/controller/f;
a=0;// 
a=0;//     iput v3, p0, Lcom/wukongtv/wkhelper/controller/b;->j:I
a=0;// 
a=0;//     iput-object p1, p0, Lcom/wukongtv/wkhelper/controller/b;->d:Landroid/content/Context;
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/controller/c;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/controller/c;);
a=0;//     invoke-direct {v0, p0}, Lcom/wukongtv/wkhelper/controller/c;-><init>(Lcom/wukongtv/wkhelper/controller/b;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/controller/c;);
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/controller/b;->c:Lcom/wukongtv/wkhelper/controller/c;
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/controller/e;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/controller/e;);
a=0;//     invoke-direct {v0, p0, v3}, Lcom/wukongtv/wkhelper/controller/e;-><init>(Lcom/wukongtv/wkhelper/controller/b;B)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/controller/e;);
a=0;//     sget-object v1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/concurrent/Executor;);
a=0;//     new-array v2, v3, [Ljava/lang/Void;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Void;);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/wukongtv/wkhelper/controller/e;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;
a=0;// 
a=0;//     new-instance v1, Landroid/graphics/Point;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/graphics/Point;);
a=0;//     invoke-direct {v1}, Landroid/graphics/Point;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Point;);
a=0;//     const-string v0, "window"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/view/WindowManager;
a=0;// 
a=0;//     new-instance v2, Landroid/os/Handler;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/os/Handler;);
a=0;//     invoke-direct {v2}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Handler;);
a=0;//     iput-object v2, p0, Lcom/wukongtv/wkhelper/controller/b;->h:Landroid/os/Handler;
a=0;// 
a=0;//     new-instance v2, Lcom/wukongtv/wkhelper/controller/f;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/wukongtv/wkhelper/controller/f;);
a=0;//     invoke-direct {v2, p0, v3}, Lcom/wukongtv/wkhelper/controller/f;-><init>(Lcom/wukongtv/wkhelper/controller/b;B)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/wukongtv/wkhelper/controller/f;);
a=0;//     iput-object v2, p0, Lcom/wukongtv/wkhelper/controller/b;->i:Lcom/wukongtv/wkhelper/controller/f;
a=0;// 
a=0;//     sget v2, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/16 v3, 0xd
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-lt v2, v3, :cond_0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V
a=0;// 
a=0;//     iget v0, v1, Landroid/graphics/Point;->x:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/wukongtv/wkhelper/controller/b;->e:I
a=0;// 
a=0;//     iget v0, v1, Landroid/graphics/Point;->y:I
a=0;// 
a=0;//     iput v0, p0, Lcom/wukongtv/wkhelper/controller/b;->f:I
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/view/WindowManager;);v1=(Reference,Landroid/graphics/Point;);
a=0;//     invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/Display;->getWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Lcom/wukongtv/wkhelper/controller/b;->e:I
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/Display;->getHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/wukongtv/wkhelper/controller/b;->f:I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/wukongtv/wkhelper/controller/b;)Lcom/wukongtv/wkhelper/controller/a;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/controller/b;->a:Lcom/wukongtv/wkhelper/controller/a;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/controller/a;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/wukongtv/wkhelper/controller/b;Lcom/wukongtv/wkhelper/controller/a;)Lcom/wukongtv/wkhelper/controller/a;
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/wukongtv/wkhelper/controller/b;->a:Lcom/wukongtv/wkhelper/controller/a;
a=0;// 
a=0;//     return-object p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 0
a=0;// 
a=0;//     sput-object p0, Lcom/wukongtv/wkhelper/controller/b;->b:Ljava/lang/String;
a=0;// 
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/wukongtv/wkhelper/controller/b;Z)Z
a=0;//     .locals 0
a=0;// 
a=0;//     iput-boolean p1, p0, Lcom/wukongtv/wkhelper/controller/b;->g:Z
a=0;// 
a=0;//     return p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcom/wukongtv/wkhelper/controller/b;)Landroid/content/Context;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/controller/b;->d:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static c()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lcom/wukongtv/wkhelper/controller/b;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic d()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lcom/wukongtv/wkhelper/controller/b;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-object p1, p0, Lcom/wukongtv/wkhelper/controller/b;->d:Landroid/content/Context;
a=0;// 
a=0;//     iget-boolean v0, p0, Lcom/wukongtv/wkhelper/controller/b;->g:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/controller/e;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/controller/e;);
a=0;//     invoke-direct {v0, p0, v1}, Lcom/wukongtv/wkhelper/controller/e;-><init>(Lcom/wukongtv/wkhelper/controller/b;B)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/controller/e;);
a=0;//     new-array v1, v1, [Ljava/lang/Void;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Void;);
a=0;//     invoke-virtual {v0, v1}, Lcom/wukongtv/wkhelper/controller/e;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final a(Lcom/wukongtv/wkhelper/b/m;)V
a=0;//     .locals 9
a=0;// 
a=0;//     const/4 v7, -0x1
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     const/4 v6, 0x2
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/controller/b;->a()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Null);v2=(One);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(PosByte);v7=(Byte);
a=0;//     iget v0, p1, Lcom/wukongtv/wkhelper/b/m;->c:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v3, 0x821
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     if-ne v0, v3, :cond_2
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     iget v0, p1, Lcom/wukongtv/wkhelper/b/m;->e:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/controller/b;->a:Lcom/wukongtv/wkhelper/controller/a;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/controller/a;);
a=0;//     iget v1, p1, Lcom/wukongtv/wkhelper/b/m;->c:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, p1, Lcom/wukongtv/wkhelper/b/m;->d:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget v3, p1, Lcom/wukongtv/wkhelper/b/m;->e:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Lcom/wukongtv/wkhelper/controller/a;->a(III)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(Null);v2=(One);v3=(PosShort);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/controller/b;->a:Lcom/wukongtv/wkhelper/controller/a;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/controller/a;);
a=0;//     iget v1, p1, Lcom/wukongtv/wkhelper/b/m;->c:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, p1, Lcom/wukongtv/wkhelper/b/m;->d:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget v3, p1, Lcom/wukongtv/wkhelper/b/m;->e:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Lcom/wukongtv/wkhelper/controller/a;->c(III)V
a=0;// 
a=0;//     iget v0, p0, Lcom/wukongtv/wkhelper/controller/b;->j:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p1, Lcom/wukongtv/wkhelper/b/m;->d:I
a=0;// 
a=0;//     if-eq v0, v1, :cond_4
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/controller/b;->a:Lcom/wukongtv/wkhelper/controller/a;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/controller/a;);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/controller/b;->a:Lcom/wukongtv/wkhelper/controller/a;
a=0;// 
a=0;//     const/16 v1, 0x821
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     iget v2, p0, Lcom/wukongtv/wkhelper/controller/b;->j:I
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2, v6}, Lcom/wukongtv/wkhelper/controller/a;->c(III)V
a=0;// 
a=0;//     iget v0, p1, Lcom/wukongtv/wkhelper/b/m;->d:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/wukongtv/wkhelper/controller/b;->j:I
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v1=(Integer);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/controller/b;->i:Lcom/wukongtv/wkhelper/controller/f;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/controller/f;);
a=0;//     iget v1, p1, Lcom/wukongtv/wkhelper/b/m;->d:I
a=0;// 
a=0;//     iput v1, v0, Lcom/wukongtv/wkhelper/controller/f;->a:I
a=0;// 
a=0;//     iput v6, v0, Lcom/wukongtv/wkhelper/controller/f;->b:I
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/controller/b;->h:Landroid/os/Handler;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/controller/b;->i:Lcom/wukongtv/wkhelper/controller/f;
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/controller/f;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/controller/b;->h:Landroid/os/Handler;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/controller/b;->i:Lcom/wukongtv/wkhelper/controller/f;
a=0;// 
a=0;//     const-wide/16 v2, 0x1f4
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Boolean);v1=(Null);v2=(One);v3=(PosShort);
a=0;//     iget v0, p1, Lcom/wukongtv/wkhelper/b/m;->c:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v3, 0x828
a=0;// 
a=0;//     if-ne v0, v3, :cond_6
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_d
a=0;// 
a=0;//     iget v0, p1, Lcom/wukongtv/wkhelper/b/m;->d:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iget v3, p1, Lcom/wukongtv/wkhelper/b/m;->e:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     iget-object v4, p1, Lcom/wukongtv/wkhelper/b/m;->g:[B
a=0;// 
a=0;//     #v4=(Reference,[B);
a=0;//     const/4 v5, 0x3
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     aget-byte v5, v4, v5
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     and-int/lit16 v5, v5, 0xff
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     aget-byte v6, v4, v6
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     and-int/lit16 v6, v6, 0xff
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     shl-int/lit8 v6, v6, 0x8
a=0;// 
a=0;//     add-int/2addr v5, v6
a=0;// 
a=0;//     aget-byte v6, v4, v2
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     and-int/lit16 v6, v6, 0xff
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     shl-int/lit8 v6, v6, 0x10
a=0;// 
a=0;//     add-int/2addr v5, v6
a=0;// 
a=0;//     aget-byte v1, v4, v1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     and-int/lit16 v1, v1, 0xff
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     shl-int/lit8 v1, v1, 0x18
a=0;// 
a=0;//     add-int/2addr v1, v5
a=0;// 
a=0;//     iget-object v4, p0, Lcom/wukongtv/wkhelper/controller/b;->a:Lcom/wukongtv/wkhelper/controller/a;
a=0;// 
a=0;//     instance-of v4, v4, Lcom/wukongtv/wkhelper/controller/b/c;
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_7
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/controller/b;->a:Lcom/wukongtv/wkhelper/controller/a;
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/controller/a;);
a=0;//     iget v2, p1, Lcom/wukongtv/wkhelper/b/m;->c:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget v4, p0, Lcom/wukongtv/wkhelper/controller/b;->e:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     mul-float/2addr v0, v4
a=0;// 
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v4, p0, Lcom/wukongtv/wkhelper/controller/b;->f:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     mul-float/2addr v3, v4
a=0;// 
a=0;//     float-to-int v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v2, v0, v3}, Lcom/wukongtv/wkhelper/controller/a;->b(III)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_6
a=0;//     #v1=(Null);v2=(One);v3=(PosShort);v4=(Uninit);v5=(Uninit);v6=(PosByte);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_7
a=0;//     #v0=(Float);v1=(Integer);v3=(Float);v4=(Boolean);v5=(Integer);v6=(Integer);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     iget-object v4, p0, Lcom/wukongtv/wkhelper/controller/b;->c:Lcom/wukongtv/wkhelper/controller/c;
a=0;// 
a=0;//     #v4=(Reference,Lcom/wukongtv/wkhelper/controller/c;);
a=0;//     iget-boolean v5, v4, Lcom/wukongtv/wkhelper/controller/c;->e:Z
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_8
a=0;// 
a=0;//     iget-object v5, v4, Lcom/wukongtv/wkhelper/controller/c;->b:Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/WindowManager$LayoutParams;);
a=0;//     iput v7, v5, Landroid/view/WindowManager$LayoutParams;->height:I
a=0;// 
a=0;//     iget-object v5, v4, Lcom/wukongtv/wkhelper/controller/c;->b:Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     iput v7, v5, Landroid/view/WindowManager$LayoutParams;->width:I
a=0;// 
a=0;//     iget-object v5, v4, Lcom/wukongtv/wkhelper/controller/c;->b:Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     const/16 v6, 0x118
a=0;// 
a=0;//     #v6=(PosShort);
a=0;//     iput v6, v5, Landroid/view/WindowManager$LayoutParams;->flags:I
a=0;// 
a=0;//     iget-object v5, v4, Lcom/wukongtv/wkhelper/controller/c;->b:Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     const/4 v6, -0x3
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     iput v6, v5, Landroid/view/WindowManager$LayoutParams;->format:I
a=0;// 
a=0;//     iget-object v5, v4, Lcom/wukongtv/wkhelper/controller/c;->b:Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     const/16 v6, 0x7d6
a=0;// 
a=0;//     #v6=(PosShort);
a=0;//     iput v6, v5, Landroid/view/WindowManager$LayoutParams;->type:I
a=0;// 
a=0;//     iget-object v5, v4, Lcom/wukongtv/wkhelper/controller/c;->a:Landroid/view/WindowManager;
a=0;// 
a=0;//     if-eqz v5, :cond_8
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v5, v4, Lcom/wukongtv/wkhelper/controller/c;->a:Landroid/view/WindowManager;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/wukongtv/wkhelper/controller/c;->a()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/view/View;);
a=0;//     iget-object v7, v4, Lcom/wukongtv/wkhelper/controller/c;->b:Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     #v7=(Reference,Landroid/view/WindowManager$LayoutParams;);
a=0;//     invoke-interface {v5, v6, v7}, Landroid/view/WindowManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_3
a=0;//     #v6=(Conflicted);v7=(Conflicted);
a=0;//     iput-boolean v2, v4, Lcom/wukongtv/wkhelper/controller/c;->e:Z
a=0;// 
a=0;//     :cond_8
a=0;//     #v5=(Conflicted);
a=0;//     iget-object v2, v4, Lcom/wukongtv/wkhelper/controller/c;->d:Landroid/os/Handler;
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Handler;);
a=0;//     iget-object v5, v4, Lcom/wukongtv/wkhelper/controller/c;->f:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Runnable;);
a=0;//     invoke-virtual {v2, v5}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     iget-object v2, v4, Lcom/wukongtv/wkhelper/controller/c;->d:Landroid/os/Handler;
a=0;// 
a=0;//     iget-object v5, v4, Lcom/wukongtv/wkhelper/controller/c;->f:Ljava/lang/Runnable;
a=0;// 
a=0;//     const-wide/16 v6, 0xbb8
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     invoke-virtual {v2, v5, v6, v7}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
a=0;// 
a=0;//     iget-object v2, v4, Lcom/wukongtv/wkhelper/controller/c;->c:Lcom/wukongtv/wkhelper/controller/a/a;
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     iget-object v2, v4, Lcom/wukongtv/wkhelper/controller/c;->c:Lcom/wukongtv/wkhelper/controller/a/a;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/wukongtv/wkhelper/controller/a/a;->getWidth()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v2}, Lcom/wukongtv/wkhelper/controller/a/a;->getHeight()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget v6, v2, Lcom/wukongtv/wkhelper/controller/a/a;->d:F
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     int-to-float v7, v4
a=0;// 
a=0;//     #v7=(Float);
a=0;//     mul-float/2addr v0, v7
a=0;// 
a=0;//     add-float/2addr v0, v6
a=0;// 
a=0;//     iput v0, v2, Lcom/wukongtv/wkhelper/controller/a/a;->d:F
a=0;// 
a=0;//     iget v0, v2, Lcom/wukongtv/wkhelper/controller/a/a;->e:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v6, v5
a=0;// 
a=0;//     #v6=(Float);
a=0;//     mul-float/2addr v3, v6
a=0;// 
a=0;//     add-float/2addr v0, v3
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iput v0, v2, Lcom/wukongtv/wkhelper/controller/a/a;->e:F
a=0;// 
a=0;//     iget v0, v2, Lcom/wukongtv/wkhelper/controller/a/a;->d:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v3, v4
a=0;// 
a=0;//     cmpl-float v0, v0, v3
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_9
a=0;// 
a=0;//     int-to-float v0, v4
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iput v0, v2, Lcom/wukongtv/wkhelper/controller/a/a;->d:F
a=0;// 
a=0;//     :cond_9
a=0;//     iget v0, v2, Lcom/wukongtv/wkhelper/controller/a/a;->d:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     cmpg-float v0, v0, v8
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_a
a=0;// 
a=0;//     iput v8, v2, Lcom/wukongtv/wkhelper/controller/a/a;->d:F
a=0;// 
a=0;//     :cond_a
a=0;//     iget v0, v2, Lcom/wukongtv/wkhelper/controller/a/a;->e:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v3, v5
a=0;// 
a=0;//     cmpl-float v0, v0, v3
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_b
a=0;// 
a=0;//     int-to-float v0, v5
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iput v0, v2, Lcom/wukongtv/wkhelper/controller/a/a;->e:F
a=0;// 
a=0;//     :cond_b
a=0;//     iget v0, v2, Lcom/wukongtv/wkhelper/controller/a/a;->e:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     cmpg-float v0, v0, v8
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_c
a=0;// 
a=0;//     iput v8, v2, Lcom/wukongtv/wkhelper/controller/a/a;->e:F
a=0;// 
a=0;//     :cond_c
a=0;//     iget v0, v2, Lcom/wukongtv/wkhelper/controller/a/a;->d:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v3, v2, Lcom/wukongtv/wkhelper/controller/a/a;->b:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-float/2addr v0, v3
a=0;// 
a=0;//     #v0=(Float);
a=0;//     int-to-float v3, v1
a=0;// 
a=0;//     #v3=(Float);
a=0;//     div-float/2addr v0, v3
a=0;// 
a=0;//     iput v0, v2, Lcom/wukongtv/wkhelper/controller/a/a;->g:F
a=0;// 
a=0;//     iget v0, v2, Lcom/wukongtv/wkhelper/controller/a/a;->e:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v3, v2, Lcom/wukongtv/wkhelper/controller/a/a;->a:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-float/2addr v0, v3
a=0;// 
a=0;//     #v0=(Float);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     div-float/2addr v0, v1
a=0;// 
a=0;//     iput v0, v2, Lcom/wukongtv/wkhelper/controller/a/a;->h:F
a=0;// 
a=0;//     invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, v2, Lcom/wukongtv/wkhelper/controller/a/a;->f:J
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/wukongtv/wkhelper/controller/a/a;->invalidate()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_d
a=0;//     #v0=(Boolean);v1=(Null);v2=(One);v3=(PosShort);v4=(Uninit);v5=(Uninit);v6=(PosByte);v7=(Byte);
a=0;//     const/16 v0, 0x829
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     iget v2, p1, Lcom/wukongtv/wkhelper/b/m;->c:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v0, v2, :cond_0
a=0;// 
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/controller/b;->a:Lcom/wukongtv/wkhelper/controller/a;
a=0;// 
a=0;//     #v2=(Reference,Lcom/wukongtv/wkhelper/controller/a;);
a=0;//     iget v3, p1, Lcom/wukongtv/wkhelper/b/m;->c:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/controller/b;->c:Lcom/wukongtv/wkhelper/controller/c;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/controller/c;);
a=0;//     iget-object v4, v0, Lcom/wukongtv/wkhelper/controller/c;->c:Lcom/wukongtv/wkhelper/controller/a/a;
a=0;// 
a=0;//     #v4=(Reference,Lcom/wukongtv/wkhelper/controller/a/a;);
a=0;//     if-eqz v4, :cond_f
a=0;// 
a=0;//     iget-object v0, v0, Lcom/wukongtv/wkhelper/controller/c;->c:Lcom/wukongtv/wkhelper/controller/a/a;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/wukongtv/wkhelper/controller/a/a;->getmX()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     :goto_4
a=0;//     #v0=(Integer);
a=0;//     iget-object v4, p0, Lcom/wukongtv/wkhelper/controller/b;->c:Lcom/wukongtv/wkhelper/controller/c;
a=0;// 
a=0;//     iget-object v5, v4, Lcom/wukongtv/wkhelper/controller/c;->c:Lcom/wukongtv/wkhelper/controller/a/a;
a=0;// 
a=0;//     #v5=(Reference,Lcom/wukongtv/wkhelper/controller/a/a;);
a=0;//     if-eqz v5, :cond_e
a=0;// 
a=0;//     iget-object v1, v4, Lcom/wukongtv/wkhelper/controller/c;->c:Lcom/wukongtv/wkhelper/controller/a/a;
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/controller/a/a;);
a=0;//     invoke-virtual {v1}, Lcom/wukongtv/wkhelper/controller/a/a;->getmY()F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     float-to-int v1, v1
a=0;// 
a=0;//     :cond_e
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v2, v3, v0, v1}, Lcom/wukongtv/wkhelper/controller/a;->b(III)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_f
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/controller/c;);v1=(Null);v5=(Uninit);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_4
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Float);v1=(Integer);v2=(One);v3=(Float);v5=(Reference,Landroid/view/WindowManager;);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v5
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// .end method
a=0;// 
a=0;// .method public final a()Z
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/controller/b;->a:Lcom/wukongtv/wkhelper/controller/a;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/controller/a;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/controller/b;->a:Lcom/wukongtv/wkhelper/controller/a;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/wukongtv/wkhelper/controller/a;->a()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final b()V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/controller/b;->a:Lcom/wukongtv/wkhelper/controller/a;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/controller/a;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/controller/b;->a:Lcom/wukongtv/wkhelper/controller/a;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/wukongtv/wkhelper/controller/a;->b()V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/wukongtv/wkhelper/controller/b;->g:Z
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/controller/b;->a:Lcom/wukongtv/wkhelper/controller/a;
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/controller/a;);
a=0;//     return-void
a=0;// .end method
}}
