package com.a.a.a; class b { void a() { int a;
a=0;// .class public final Lcom/a/a/a/b;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field a:I
a=0;// 
a=0;// .field public b:Lcom/a/a/a/d;
a=0;// 
a=0;// .field public c:Landroid/view/View;
a=0;// 
a=0;// .field d:Landroid/view/WindowManager;
a=0;// 
a=0;// .field e:Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;// .field private f:I
a=0;// 
a=0;// .field private g:Landroid/content/Context;
a=0;// 
a=0;// .field private h:I
a=0;// 
a=0;// .field private i:I
a=0;// 
a=0;// .field private j:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Landroid/content/Context;Landroid/view/View;)V
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/a/a/a/b;);
a=0;//     sget v0, Lcom/a/a/a/c;->a:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/a/a/a/b;->f:I
a=0;// 
a=0;//     const/16 v0, 0x51
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Lcom/a/a/a/b;->h:I
a=0;// 
a=0;//     const/16 v0, 0x7d0
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     iput v0, p0, Lcom/a/a/a/b;->a:I
a=0;// 
a=0;//     iput v1, p0, Lcom/a/a/a/b;->i:I
a=0;// 
a=0;//     iput v1, p0, Lcom/a/a/a/b;->j:I
a=0;// 
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "SuperToast - You cannot use a null context."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(PosShort);v1=(Null);
a=0;//     iput-object p1, p0, Lcom/a/a/a/b;->g:Landroid/content/Context;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/a/a/a/b;->c:Landroid/view/View;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/a/a/a/b;->g:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const-string v1, "window"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/view/WindowManager;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/a/a/a/b;->d:Landroid/view/WindowManager;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;Landroid/view/View;II)Lcom/a/a/a/b;
a=0;//     .locals 4
a=0;// 
a=0;//     const/16 v3, 0x1194
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     new-instance v0, Lcom/a/a/a/b;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/a/a/a/b;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/a/a/a/b;-><init>(Landroid/content/Context;Landroid/view/View;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/a/a/a/b;);
a=0;//     if-le p2, v3, :cond_0
a=0;// 
a=0;//     const-string v1, "SuperToast"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "SuperToast - You should NEVER specify a duration greater than four and a half seconds for a SuperToast."
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     iput v3, v0, Lcom/a/a/a/b;->a:I
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     iput p3, v0, Lcom/a/a/a/b;->f:I
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     iput p2, v0, Lcom/a/a/a/b;->a:I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a()V
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v1, -0x2
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     new-instance v0, Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/WindowManager$LayoutParams;);
a=0;//     invoke-direct {v0}, Landroid/view/WindowManager$LayoutParams;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/WindowManager$LayoutParams;);
a=0;//     iput-object v0, p0, Lcom/a/a/a/b;->e:Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/a/a/a/b;->e:Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     iput v1, v0, Landroid/view/WindowManager$LayoutParams;->height:I
a=0;// 
a=0;//     iget-object v0, p0, Lcom/a/a/a/b;->e:Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     iput v1, v0, Landroid/view/WindowManager$LayoutParams;->width:I
a=0;// 
a=0;//     iget-object v0, p0, Lcom/a/a/a/b;->e:Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     const/16 v1, 0x98
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     iput v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I
a=0;// 
a=0;//     iget-object v0, p0, Lcom/a/a/a/b;->e:Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     const/4 v1, -0x3
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     iput v1, v0, Landroid/view/WindowManager$LayoutParams;->format:I
a=0;// 
a=0;//     iget-object v1, p0, Lcom/a/a/a/b;->e:Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/WindowManager$LayoutParams;);
a=0;//     iget v0, p0, Lcom/a/a/a/b;->f:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v2, Lcom/a/a/a/c;->b:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v0, v2, :cond_0
a=0;// 
a=0;//     const v0, 0x1030003
a=0;// 
a=0;//     :goto_0
a=0;//     iput v0, v1, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I
a=0;// 
a=0;//     iget-object v0, p0, Lcom/a/a/a/b;->e:Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/WindowManager$LayoutParams;);
a=0;//     const/16 v1, 0x7d5
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     iput v1, v0, Landroid/view/WindowManager$LayoutParams;->type:I
a=0;// 
a=0;//     iget-object v0, p0, Lcom/a/a/a/b;->e:Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     iget v1, p0, Lcom/a/a/a/b;->h:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I
a=0;// 
a=0;//     iget-object v0, p0, Lcom/a/a/a/b;->e:Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     iget v1, p0, Lcom/a/a/a/b;->i:I
a=0;// 
a=0;//     iput v1, v0, Landroid/view/WindowManager$LayoutParams;->x:I
a=0;// 
a=0;//     iget-object v0, p0, Lcom/a/a/a/b;->e:Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     iget v1, p0, Lcom/a/a/a/b;->j:I
a=0;// 
a=0;//     iput v1, v0, Landroid/view/WindowManager$LayoutParams;->y:I
a=0;// 
a=0;//     invoke-static {}, Lcom/a/a/a/a;->a()Lcom/a/a/a/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/a/a/a/a;->a:Ljava/util/Queue;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Queue;);
a=0;//     invoke-interface {v1, p0}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/a/a/a/a;->b()V
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     iget v0, p0, Lcom/a/a/a/b;->f:I
a=0;// 
a=0;//     sget v2, Lcom/a/a/a/c;->c:I
a=0;// 
a=0;//     if-ne v0, v2, :cond_1
a=0;// 
a=0;//     const v0, 0x1030002
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     iget v0, p0, Lcom/a/a/a/b;->f:I
a=0;// 
a=0;//     sget v2, Lcom/a/a/a/c;->d:I
a=0;// 
a=0;//     if-ne v0, v2, :cond_2
a=0;// 
a=0;//     const v0, 0x1030056
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     const v0, 0x1030004
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final b()Lcom/a/a/a/b;
a=0;//     .locals 2
a=0;// 
a=0;//     const/16 v1, 0xa
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     const/16 v0, 0x55
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Lcom/a/a/a/b;->h:I
a=0;// 
a=0;//     iput v1, p0, Lcom/a/a/a/b;->i:I
a=0;// 
a=0;//     iput v1, p0, Lcom/a/a/a/b;->j:I
a=0;// 
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public final c()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-static {}, Lcom/a/a/a/a;->a()Lcom/a/a/a/a;
a=0;// 
a=0;//     invoke-static {p0}, Lcom/a/a/a/a;->a(Lcom/a/a/a/b;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final d()Z
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/a/a/a/b;->c:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/a/a/a/b;->c:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->isShown()Z
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
}}
