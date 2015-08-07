package com.lovesport.lc; class a { void a() { int a;
a=0;// .class public final Lcom/lovesport/lc/a;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static a:F
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput v0, Lcom/lovesport/lc/a;->a:F
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(F)F
a=0;//     .locals 1
a=0;// 
a=0;//     sget v0, Lcom/lovesport/lc/a;->a:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     mul-float/2addr v0, p0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static a(I)I
a=0;//     .locals 2
a=0;// 
a=0;//     int-to-float v0, p0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     sget v1, Lcom/lovesport/lc/a;->a:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     mul-float/2addr v0, v1
a=0;// 
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;)V
a=0;//     .locals 3
a=0;// 
a=0;//     const-string v0, "window"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/view/WindowManager;
a=0;// 
a=0;//     new-instance v1, Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/util/DisplayMetrics;);
a=0;//     invoke-direct {v1}, Landroid/util/DisplayMetrics;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/util/DisplayMetrics;);
a=0;//     invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V
a=0;// 
a=0;//     iget v0, v1, Landroid/util/DisplayMetrics;->widthPixels:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     const/high16 v2, 0x44a00000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     div-float/2addr v0, v2
a=0;// 
a=0;//     sput v0, Lcom/lovesport/lc/a;->a:F
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/util/DisplayMetrics;->toString()Ljava/lang/String;
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "sScaleFactor :"
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget v1, Lcom/lovesport/lc/a;->a:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/view/View;)V
a=0;//     .locals 6
a=0;//     .annotation build Landroid/annotation/SuppressLint;
a=0;//         value = {
a=0;//             "NewApi"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     sget v1, Lcom/lovesport/lc/a;->a:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     mul-float/2addr v0, v1
a=0;// 
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     sget v2, Lcom/lovesport/lc/a;->a:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     mul-float/2addr v1, v2
a=0;// 
a=0;//     float-to-int v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     sget v3, Lcom/lovesport/lc/a;->a:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     mul-float/2addr v2, v3
a=0;// 
a=0;//     float-to-int v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     sget v4, Lcom/lovesport/lc/a;->a:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     mul-float/2addr v3, v4
a=0;// 
a=0;//     float-to-int v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sget v4, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     const/16 v5, 0x11
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     if-lt v4, v5, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/view/View;->getPaddingEnd()I
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-virtual {p0, v0, v2, v1, v3}, Landroid/view/View;->setPadding(IIII)V
a=0;// 
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     const/16 v1, 0x10
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_1
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/view/View;->getMinimumHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/view/View;->getMinimumWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     sget v2, Lcom/lovesport/lc/a;->a:F
a=0;// 
a=0;//     mul-float/2addr v0, v2
a=0;// 
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Landroid/view/View;->setMinimumHeight(I)V
a=0;// 
a=0;//     int-to-float v0, v1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     sget v1, Lcom/lovesport/lc/a;->a:F
a=0;// 
a=0;//     mul-float/2addr v0, v1
a=0;// 
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Landroid/view/View;->setMinimumWidth(I)V
a=0;// 
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/view/ViewGroup$MarginLayoutParams;)V
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget v2, p0, Landroid/view/ViewGroup$LayoutParams;->width:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-gez v2, :cond_2
a=0;// 
a=0;//     move v2, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     iget v2, p0, Landroid/view/ViewGroup$LayoutParams;->width:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     sget v3, Lcom/lovesport/lc/a;->a:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     mul-float/2addr v2, v3
a=0;// 
a=0;//     float-to-int v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, p0, Landroid/view/ViewGroup$LayoutParams;->width:I
a=0;// 
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     iget v2, p0, Landroid/view/ViewGroup$LayoutParams;->height:I
a=0;// 
a=0;//     if-gez v2, :cond_3
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     iget v0, p0, Landroid/view/ViewGroup$LayoutParams;->height:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     sget v1, Lcom/lovesport/lc/a;->a:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     mul-float/2addr v0, v1
a=0;// 
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/view/ViewGroup$LayoutParams;->height:I
a=0;// 
a=0;//     :cond_1
a=0;//     iget v0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     sget v1, Lcom/lovesport/lc/a;->a:F
a=0;// 
a=0;//     mul-float/2addr v0, v1
a=0;// 
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I
a=0;// 
a=0;//     iget v0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     sget v1, Lcom/lovesport/lc/a;->a:F
a=0;// 
a=0;//     mul-float/2addr v0, v1
a=0;// 
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I
a=0;// 
a=0;//     iget v0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     sget v1, Lcom/lovesport/lc/a;->a:F
a=0;// 
a=0;//     mul-float/2addr v0, v1
a=0;// 
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I
a=0;// 
a=0;//     iget v0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     sget v1, Lcom/lovesport/lc/a;->a:F
a=0;// 
a=0;//     mul-float/2addr v0, v1
a=0;// 
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(One);v1=(Null);v3=(Uninit);
a=0;//     move v2, v1
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v2=(Integer);v3=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
}}
