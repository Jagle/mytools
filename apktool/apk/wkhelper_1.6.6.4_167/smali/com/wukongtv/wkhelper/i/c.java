package com.wukongtv.wkhelper.i; class c { void a() { int a;
a=0;// .class public final Lcom/wukongtv/wkhelper/i/c;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field a:Lcom/wukongtv/wkhelper/i/e;
a=0;// 
a=0;// .field b:I
a=0;// 
a=0;// .field c:Landroid/os/Handler;
a=0;// 
a=0;// .field d:Ljava/lang/Runnable;
a=0;// 
a=0;// .field private e:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/os/Handler;)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/i/c;);
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/i/d;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/i/d;);
a=0;//     invoke-direct {v0, p0}, Lcom/wukongtv/wkhelper/i/d;-><init>(Lcom/wukongtv/wkhelper/i/c;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/i/d;);
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/i/c;->d:Ljava/lang/Runnable;
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/wukongtv/wkhelper/i/c;->c:Landroid/os/Handler;
a=0;// 
a=0;//     :goto_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/wukongtv/wkhelper/i/c;->e:Z
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/i/d;);
a=0;//     new-instance v0, Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Handler;);
a=0;//     invoke-direct {v0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/i/c;->c:Landroid/os/Handler;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a()V
a=0;//     .locals 4
a=0;// 
a=0;//     const/16 v2, 0x64
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     iget v0, p0, Lcom/wukongtv/wkhelper/i/c;->b:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v0, v2, :cond_0
a=0;// 
a=0;//     const-string v0, "HandlerTimer"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "repeat interval too small, setting it to 100ms"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     iput v2, p0, Lcom/wukongtv/wkhelper/i/c;->b:I
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-boolean v0, p0, Lcom/wukongtv/wkhelper/i/c;->e:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/i/c;->c:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/i/c;->d:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Runnable;);
a=0;//     iget v2, p0, Lcom/wukongtv/wkhelper/i/c;->b:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-long v2, v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/wukongtv/wkhelper/i/c;->e:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
