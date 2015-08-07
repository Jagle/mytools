package com.c.a.b.c; class b { void a() { int a;
a=0;// .class public final Lcom/c/a/b/c/b;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/c/a/b/c/a;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final a:I
a=0;// 
a=0;// .field private final b:Z
a=0;// 
a=0;// .field private final c:Z
a=0;// 
a=0;// .field private final d:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/c/a/b/c/b;);
a=0;//     const/16 v0, 0xc8
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     iput v0, p0, Lcom/c/a/b/c/b;->a:I
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/c/a/b/c/b;->b:Z
a=0;// 
a=0;//     iput-boolean v1, p0, Lcom/c/a/b/c/b;->c:Z
a=0;// 
a=0;//     iput-boolean v1, p0, Lcom/c/a/b/c/b;->d:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(Landroid/graphics/Bitmap;Lcom/c/a/b/e/a;Lcom/c/a/b/a/g;)V
a=0;//     .locals 6
a=0;// 
a=0;//     invoke-interface {p2, p1}, Lcom/c/a/b/e/a;->a(Landroid/graphics/Bitmap;)Z
a=0;// 
a=0;//     iget-boolean v0, p0, Lcom/c/a/b/c/b;->b:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     sget-object v0, Lcom/c/a/b/a/g;->a:Lcom/c/a/b/a/g;
a=0;// 
a=0;//     #v0=(Reference,Lcom/c/a/b/a/g;);
a=0;//     if-eq p3, v0, :cond_2
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-boolean v0, p0, Lcom/c/a/b/c/b;->c:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     sget-object v0, Lcom/c/a/b/a/g;->b:Lcom/c/a/b/a/g;
a=0;// 
a=0;//     #v0=(Reference,Lcom/c/a/b/a/g;);
a=0;//     if-eq p3, v0, :cond_2
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     iget-boolean v0, p0, Lcom/c/a/b/c/b;->d:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     sget-object v0, Lcom/c/a/b/a/g;->c:Lcom/c/a/b/a/g;
a=0;// 
a=0;//     #v0=(Reference,Lcom/c/a/b/a/g;);
a=0;//     if-ne p3, v0, :cond_3
a=0;// 
a=0;//     :cond_2
a=0;//     invoke-interface {p2}, Lcom/c/a/b/e/a;->d()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v1, p0, Lcom/c/a/b/c/b;->a:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     new-instance v2, Landroid/view/animation/AlphaAnimation;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/view/animation/AlphaAnimation;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/high16 v4, 0x3f800000
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-direct {v2, v3, v4}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/animation/AlphaAnimation;);
a=0;//     int-to-long v4, v1
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-virtual {v2, v4, v5}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V
a=0;// 
a=0;//     new-instance v1, Landroid/view/animation/DecelerateInterpolator;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/view/animation/DecelerateInterpolator;);
a=0;//     invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/animation/DecelerateInterpolator;);
a=0;//     invoke-virtual {v2, v1}, Landroid/view/animation/AlphaAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
