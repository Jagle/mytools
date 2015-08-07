package com.wukongtv.wkhelper.widget; class WKImageSwitcher { void a() { int a;
a=0;// .class public Lcom/wukongtv/wkhelper/widget/WKImageSwitcher;
a=0;// .super Landroid/widget/ImageSwitcher;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public a:Lcom/c/a/b/d;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0, p1}, Landroid/widget/ImageSwitcher;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/widget/WKImageSwitcher;);
a=0;//     invoke-direct {p0}, Lcom/wukongtv/wkhelper/widget/WKImageSwitcher;->b()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0, p1, p2}, Landroid/widget/ImageSwitcher;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/widget/WKImageSwitcher;);
a=0;//     invoke-direct {p0}, Lcom/wukongtv/wkhelper/widget/WKImageSwitcher;->b()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private b()V
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-instance v0, Lcom/c/a/b/e;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/c/a/b/e;);
a=0;//     invoke-direct {v0}, Lcom/c/a/b/e;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/c/a/b/e;);
a=0;//     iput-boolean v2, v0, Lcom/c/a/b/e;->h:Z
a=0;// 
a=0;//     iput-boolean v2, v0, Lcom/c/a/b/e;->m:Z
a=0;// 
a=0;//     sget-object v1, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Bitmap$Config;);
a=0;//     invoke-virtual {v0, v1}, Lcom/c/a/b/e;->a(Landroid/graphics/Bitmap$Config;)Lcom/c/a/b/e;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget v1, Lcom/c/a/b/a/e;->e:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Lcom/c/a/b/e;->j:I
a=0;// 
a=0;//     new-instance v1, Lcom/c/a/b/c/b;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/c/a/b/c/b;);
a=0;//     invoke-direct {v1}, Lcom/c/a/b/c/b;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lcom/c/a/b/c/b;);
a=0;//     iput-object v1, v0, Lcom/c/a/b/e;->q:Lcom/c/a/b/c/a;
a=0;// 
a=0;//     iput-boolean v2, v0, Lcom/c/a/b/e;->g:Z
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/c/a/b/e;->a()Lcom/c/a/b/d;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/widget/WKImageSwitcher;->a:Lcom/c/a/b/d;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a()V
a=0;//     .locals 3
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/widget/WKImageSwitcher;->getCurrentView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/c/a/b/f;->a()Lcom/c/a/b/f;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/c/a/b/f;);
a=0;//     iget-object v1, v1, Lcom/c/a/b/f;->b:Lcom/c/a/b/l;
a=0;// 
a=0;//     new-instance v2, Lcom/c/a/b/e/b;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/c/a/b/e/b;);
a=0;//     invoke-direct {v2, v0}, Lcom/c/a/b/e/b;-><init>(Landroid/widget/ImageView;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/c/a/b/e/b;);
a=0;//     invoke-virtual {v1, v2}, Lcom/c/a/b/l;->b(Lcom/c/a/b/e/a;)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setImageBitmap(Landroid/graphics/Bitmap;)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/widget/WKImageSwitcher;->getNextView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/widget/WKImageSwitcher;->showNext()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setImageLoaderUri(Ljava/lang/String;)V
a=0;//     .locals 4
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/widget/WKImageSwitcher;->a()V
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/widget/WKImageSwitcher;->getNextView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-static {}, Lcom/c/a/b/f;->a()Lcom/c/a/b/f;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/c/a/b/f;);
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/widget/WKImageSwitcher;->a:Lcom/c/a/b/d;
a=0;// 
a=0;//     #v2=(Reference,Lcom/c/a/b/d;);
a=0;//     new-instance v3, Lcom/c/a/b/e/b;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/c/a/b/e/b;);
a=0;//     invoke-direct {v3, v0}, Lcom/c/a/b/e/b;-><init>(Landroid/widget/ImageView;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/c/a/b/e/b;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v1, p1, v3, v2, v0}, Lcom/c/a/b/f;->a(Ljava/lang/String;Lcom/c/a/b/e/a;Lcom/c/a/b/d;Lcom/c/a/b/f/a;)V
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/widget/WKImageSwitcher;->showNext()V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
