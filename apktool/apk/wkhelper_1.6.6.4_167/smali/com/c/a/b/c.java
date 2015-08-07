package com.c.a.b; class c { void a() { int a;
a=0;// .class final Lcom/c/a/b/c;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final a:Landroid/graphics/Bitmap;
a=0;// 
a=0;// .field private final b:Ljava/lang/String;
a=0;// 
a=0;// .field private final c:Lcom/c/a/b/e/a;
a=0;// 
a=0;// .field private final d:Ljava/lang/String;
a=0;// 
a=0;// .field private final e:Lcom/c/a/b/c/a;
a=0;// 
a=0;// .field private final f:Lcom/c/a/b/f/a;
a=0;// 
a=0;// .field private final g:Lcom/c/a/b/l;
a=0;// 
a=0;// .field private final h:Lcom/c/a/b/a/g;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/graphics/Bitmap;Lcom/c/a/b/n;Lcom/c/a/b/l;Lcom/c/a/b/a/g;)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/c/a/b/c;);
a=0;//     iput-object p1, p0, Lcom/c/a/b/c;->a:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     iget-object v0, p2, Lcom/c/a/b/n;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/c/a/b/c;->b:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v0, p2, Lcom/c/a/b/n;->c:Lcom/c/a/b/e/a;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/c/a/b/c;->c:Lcom/c/a/b/e/a;
a=0;// 
a=0;//     iget-object v0, p2, Lcom/c/a/b/n;->b:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/c/a/b/c;->d:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v0, p2, Lcom/c/a/b/n;->e:Lcom/c/a/b/d;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/c/a/b/d;->q:Lcom/c/a/b/c/a;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/c/a/b/c;->e:Lcom/c/a/b/c/a;
a=0;// 
a=0;//     iget-object v0, p2, Lcom/c/a/b/n;->f:Lcom/c/a/b/f/a;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/c/a/b/c;->f:Lcom/c/a/b/f/a;
a=0;// 
a=0;//     iput-object p3, p0, Lcom/c/a/b/c;->g:Lcom/c/a/b/l;
a=0;// 
a=0;//     iput-object p4, p0, Lcom/c/a/b/c;->h:Lcom/c/a/b/a/g;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final run()V
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iget-object v0, p0, Lcom/c/a/b/c;->c:Lcom/c/a/b/e/a;
a=0;// 
a=0;//     #v0=(Reference,Lcom/c/a/b/e/a;);
a=0;//     invoke-interface {v0}, Lcom/c/a/b/e/a;->e()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const-string v0, "ImageAware was collected by GC. Task is cancelled. [%s]"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     iget-object v3, p0, Lcom/c/a/b/c;->d:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/c/a/c/e;->a(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/c/a/b/c;->c:Lcom/c/a/b/e/a;
a=0;// 
a=0;//     invoke-interface {v0}, Lcom/c/a/b/e/a;->d()Landroid/view/View;
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Reference,Lcom/c/a/b/e/a;);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(One);v2=(Null);v3=(Uninit);v4=(Uninit);
a=0;//     iget-object v0, p0, Lcom/c/a/b/c;->g:Lcom/c/a/b/l;
a=0;// 
a=0;//     #v0=(Reference,Lcom/c/a/b/l;);
a=0;//     iget-object v3, p0, Lcom/c/a/b/c;->c:Lcom/c/a/b/e/a;
a=0;// 
a=0;//     #v3=(Reference,Lcom/c/a/b/e/a;);
a=0;//     invoke-virtual {v0, v3}, Lcom/c/a/b/l;->a(Lcom/c/a/b/e/a;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v3, p0, Lcom/c/a/b/c;->d:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_1
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     const-string v0, "ImageAware is reused for another image. Task is cancelled. [%s]"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     iget-object v3, p0, Lcom/c/a/b/c;->d:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/c/a/c/e;->a(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/c/a/b/c;->c:Lcom/c/a/b/e/a;
a=0;// 
a=0;//     invoke-interface {v0}, Lcom/c/a/b/e/a;->d()Landroid/view/View;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(One);
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, "Display image in ImageAware (loaded from %1$s) [%2$s]"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     iget-object v4, p0, Lcom/c/a/b/c;->h:Lcom/c/a/b/a/g;
a=0;// 
a=0;//     #v4=(Reference,Lcom/c/a/b/a/g;);
a=0;//     aput-object v4, v3, v2
a=0;// 
a=0;//     iget-object v2, p0, Lcom/c/a/b/c;->d:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     aput-object v2, v3, v1
a=0;// 
a=0;//     invoke-static {v0, v3}, Lcom/c/a/c/e;->a(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/c/a/b/c;->e:Lcom/c/a/b/c/a;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/c/a/b/c;->a:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Bitmap;);
a=0;//     iget-object v2, p0, Lcom/c/a/b/c;->c:Lcom/c/a/b/e/a;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/c/a/b/c;->h:Lcom/c/a/b/a/g;
a=0;// 
a=0;//     invoke-interface {v0, v1, v2, v3}, Lcom/c/a/b/c/a;->a(Landroid/graphics/Bitmap;Lcom/c/a/b/e/a;Lcom/c/a/b/a/g;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/c/a/b/c;->g:Lcom/c/a/b/l;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/c/a/b/c;->c:Lcom/c/a/b/e/a;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/c/a/b/l;->b(Lcom/c/a/b/e/a;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/c/a/b/c;->f:Lcom/c/a/b/f/a;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/c/a/b/c;->c:Lcom/c/a/b/e/a;
a=0;// 
a=0;//     invoke-interface {v1}, Lcom/c/a/b/e/a;->d()Landroid/view/View;
a=0;// 
a=0;//     invoke-interface {v0}, Lcom/c/a/b/f/a;->c()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
