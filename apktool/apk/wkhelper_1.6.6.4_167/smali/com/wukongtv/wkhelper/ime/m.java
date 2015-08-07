package com.wukongtv.wkhelper.ime; class m { void a() { int a;
a=0;// .class final Lcom/wukongtv/wkhelper/ime/m;
a=0;// .super Lcom/wukongtv/wkhelper/o;
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private b:[I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/wukongtv/wkhelper/ime/PinyinIME;)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lcom/wukongtv/wkhelper/o;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/ime/m;);
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/ime/m;->b:[I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final run()V
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/m;->a:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/wukongtv/wkhelper/ime/PinyinIME;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/ime/PinyinIME;->b(Lcom/wukongtv/wkhelper/ime/PinyinIME;)Lcom/wukongtv/wkhelper/ime/CandidatesContainer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/ime/m;->b:[I
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     invoke-virtual {v0, v1}, Lcom/wukongtv/wkhelper/ime/CandidatesContainer;->getLocationInWindow([I)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
