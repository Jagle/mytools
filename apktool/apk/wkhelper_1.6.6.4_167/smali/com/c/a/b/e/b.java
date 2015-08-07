package com.c.a.b.e; class b { void a() { int a;
a=0;// .class public final Lcom/c/a/b/e/b;
a=0;// .super Lcom/c/a/b/e/d;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/widget/ImageView;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lcom/c/a/b/e/d;-><init>(Landroid/view/View;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/c/a/b/e/b;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static a(Ljava/lang/Object;Ljava/lang/String;)I
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     const-class v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/reflect/Field;->setAccessible(Z)V
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     const v2, 0x7fffffff
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v0, v2, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-static {v0}, Lcom/c/a/c/e;->a(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a()I
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-super {p0}, Lcom/c/a/b/e/d;->a()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-gtz v1, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/c/a/b/e/b;->a:Ljava/lang/ref/Reference;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/Reference;);
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const-string v1, "mMaxWidth"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcom/c/a/b/e/b;->a(Ljava/lang/Object;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Integer);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected final a(Landroid/graphics/Bitmap;Landroid/view/View;)V
a=0;//     .locals 0
a=0;// 
a=0;//     check-cast p2, Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {p2, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected final a(Landroid/graphics/drawable/Drawable;Landroid/view/View;)V
a=0;//     .locals 1
a=0;// 
a=0;//     check-cast p2, Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {p2, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     instance-of v0, p1, Landroid/graphics/drawable/AnimationDrawable;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     check-cast p1, Landroid/graphics/drawable/AnimationDrawable;
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/graphics/drawable/AnimationDrawable;->start()V
a=0;// 
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final b()I
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-super {p0}, Lcom/c/a/b/e/d;->b()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-gtz v1, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/c/a/b/e/b;->a:Ljava/lang/ref/Reference;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/Reference;);
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const-string v1, "mMaxHeight"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcom/c/a/b/e/b;->a(Ljava/lang/Object;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Integer);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final c()I
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/c/a/b/e/b;->a:Ljava/lang/ref/Reference;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/Reference;);
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/c/a/b/a/i;->a(Landroid/widget/ImageView;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     invoke-super {p0}, Lcom/c/a/b/e/d;->c()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final bridge synthetic d()Landroid/view/View;
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-super {p0}, Lcom/c/a/b/e/d;->d()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
