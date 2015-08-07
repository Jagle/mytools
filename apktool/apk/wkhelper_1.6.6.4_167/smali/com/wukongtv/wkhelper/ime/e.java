package com.wukongtv.wkhelper.ime; class e { void a() { int a;
a=0;// .class final Lcom/wukongtv/wkhelper/ime/e;
a=0;// .super Lcom/wukongtv/wkhelper/o;
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field b:Z
a=0;// 
a=0;// .field c:I
a=0;// 
a=0;// .field d:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/wukongtv/wkhelper/ime/CandidateView;)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lcom/wukongtv/wkhelper/o;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/ime/e;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/wukongtv/wkhelper/ime/e;->b:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a()Z
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iget-boolean v1, p0, Lcom/wukongtv/wkhelper/ime/e;->b:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iput-boolean v0, p0, Lcom/wukongtv/wkhelper/ime/e;->b:Z
a=0;// 
a=0;//     invoke-virtual {p0, p0}, Lcom/wukongtv/wkhelper/ime/e;->removeCallbacks(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public final run()V
a=0;//     .locals 4
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/e;->a:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/wukongtv/wkhelper/ime/CandidateView;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget v1, p0, Lcom/wukongtv/wkhelper/ime/e;->c:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ltz v1, :cond_0
a=0;// 
a=0;//     iget v1, p0, Lcom/wukongtv/wkhelper/ime/e;->d:I
a=0;// 
a=0;//     if-ltz v1, :cond_0
a=0;// 
a=0;//     iget v1, p0, Lcom/wukongtv/wkhelper/ime/e;->c:I
a=0;// 
a=0;//     iget v2, p0, Lcom/wukongtv/wkhelper/ime/e;->d:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Lcom/wukongtv/wkhelper/ime/CandidateView;->a(IIZ)V
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/wukongtv/wkhelper/ime/CandidateView;->invalidate()V
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/wukongtv/wkhelper/ime/e;->b:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
