package com.c.a.b.e; class d { void a() { int a;
a=0;// .class public abstract Lcom/c/a/b/e/d;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/c/a/b/e/a;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected a:Ljava/lang/ref/Reference;
a=0;// 
a=0;// .field protected b:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/view/View;)V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0}, Lcom/c/a/b/e/d;-><init>(Landroid/view/View;B)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/c/a/b/e/d;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Landroid/view/View;B)V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/c/a/b/e/d;);
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "view must not be null"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     new-instance v0, Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     iput-object v0, p0, Lcom/c/a/b/e/d;->a:Ljava/lang/ref/Reference;
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/c/a/b/e/d;->b:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a()I
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget-object v0, p0, Lcom/c/a/b/e/d;->a:Ljava/lang/ref/Reference;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/Reference;);
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     iget-boolean v3, p0, Lcom/c/a/b/e/d;->b:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     iget v3, v2, Landroid/view/ViewGroup$LayoutParams;->width:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, -0x2
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-eq v3, v4, :cond_2
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v4=(Conflicted);
a=0;//     if-gtz v0, :cond_0
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     iget v0, v2, Landroid/view/ViewGroup$LayoutParams;->width:I
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/view/View;);v1=(Null);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Reference,Landroid/view/View;);v2=(Reference,Landroid/view/ViewGroup$LayoutParams;);v3=(Integer);v4=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected abstract a(Landroid/graphics/Bitmap;Landroid/view/View;)V
a=0;// .end method
a=0;// 
a=0;// .method protected abstract a(Landroid/graphics/drawable/Drawable;Landroid/view/View;)V
a=0;// .end method
a=0;// 
a=0;// .method public final a(Landroid/graphics/Bitmap;)Z
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Looper;);
a=0;//     invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Looper;);
a=0;//     if-ne v0, v2, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/c/a/b/e/d;->a:Ljava/lang/ref/Reference;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {p0, p1, v0}, Lcom/c/a/b/e/d;->a(Landroid/graphics/Bitmap;Landroid/view/View;)V
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/os/Looper;);
a=0;//     const-string v0, "Can\'t set a bitmap into view. You should call ImageLoader on UI thread for it."
a=0;// 
a=0;//     new-array v2, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     invoke-static {v0, v2}, Lcom/c/a/c/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     :cond_1
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final a(Landroid/graphics/drawable/Drawable;)Z
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Looper;);
a=0;//     invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Looper;);
a=0;//     if-ne v0, v2, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/c/a/b/e/d;->a:Ljava/lang/ref/Reference;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {p0, p1, v0}, Lcom/c/a/b/e/d;->a(Landroid/graphics/drawable/Drawable;Landroid/view/View;)V
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/os/Looper;);
a=0;//     const-string v0, "Can\'t set a drawable into view. You should call ImageLoader on UI thread for it."
a=0;// 
a=0;//     new-array v2, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     invoke-static {v0, v2}, Lcom/c/a/c/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     :cond_1
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public b()I
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget-object v0, p0, Lcom/c/a/b/e/d;->a:Ljava/lang/ref/Reference;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/Reference;);
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     iget-boolean v3, p0, Lcom/c/a/b/e/d;->b:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     iget v3, v2, Landroid/view/ViewGroup$LayoutParams;->height:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, -0x2
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-eq v3, v4, :cond_2
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getHeight()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v4=(Conflicted);
a=0;//     if-gtz v0, :cond_0
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     iget v0, v2, Landroid/view/ViewGroup$LayoutParams;->height:I
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/view/View;);v1=(Null);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Reference,Landroid/view/View;);v2=(Reference,Landroid/view/ViewGroup$LayoutParams;);v3=(Integer);v4=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public c()I
a=0;//     .locals 1
a=0;// 
a=0;//     sget v0, Lcom/c/a/b/a/i;->b:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public d()Landroid/view/View;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/c/a/b/e/d;->a:Ljava/lang/ref/Reference;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/Reference;);
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final e()Z
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/c/a/b/e/d;->a:Ljava/lang/ref/Reference;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/Reference;);
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final f()I
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/c/a/b/e/d;->a:Ljava/lang/ref/Reference;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/Reference;);
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-super {p0}, Ljava/lang/Object;->hashCode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
}}
