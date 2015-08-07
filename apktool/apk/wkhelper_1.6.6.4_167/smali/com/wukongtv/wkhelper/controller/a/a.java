package com.wukongtv.wkhelper.controller.a; class a { void a() { int a;
a=0;// .class public final Lcom/wukongtv/wkhelper/controller/a/a;
a=0;// .super Landroid/view/View;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public a:F
a=0;// 
a=0;// .field public b:F
a=0;// 
a=0;// .field c:Landroid/graphics/Bitmap;
a=0;// 
a=0;// .field public d:F
a=0;// 
a=0;// .field public e:F
a=0;// 
a=0;// .field public f:J
a=0;// 
a=0;// .field public g:F
a=0;// 
a=0;// .field public h:F
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/controller/a/a;);
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/controller/a/a;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     const v1, 0x7f020008
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/controller/a/a;->c:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final getmX()F
a=0;//     .locals 1
a=0;// 
a=0;//     iget v0, p0, Lcom/wukongtv/wkhelper/controller/a/a;->b:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public final getmY()F
a=0;//     .locals 1
a=0;// 
a=0;//     iget v0, p0, Lcom/wukongtv/wkhelper/controller/a/a;->a:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected final onDraw(Landroid/graphics/Canvas;)V
a=0;//     .locals 10
a=0;// 
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const-wide v8, 0x3ee4f8b588e368f1L
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/controller/a/a;->getDrawingTime()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iget-wide v0, p0, Lcom/wukongtv/wkhelper/controller/a/a;->f:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     sub-long v0, v2, v0
a=0;// 
a=0;//     long-to-float v4, v0
a=0;// 
a=0;//     #v4=(Float);
a=0;//     iget v5, p0, Lcom/wukongtv/wkhelper/controller/a/a;->g:F
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     mul-float/2addr v4, v5
a=0;// 
a=0;//     long-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iget v1, p0, Lcom/wukongtv/wkhelper/controller/a/a;->h:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     mul-float/2addr v1, v0
a=0;// 
a=0;//     #v1=(Float);
a=0;//     iget v0, p0, Lcom/wukongtv/wkhelper/controller/a/a;->b:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-float/2addr v0, v4
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iget v4, p0, Lcom/wukongtv/wkhelper/controller/a/a;->a:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-float/2addr v1, v4
a=0;// 
a=0;//     iget v4, p0, Lcom/wukongtv/wkhelper/controller/a/a;->d:F
a=0;// 
a=0;//     sub-float/2addr v4, v0
a=0;// 
a=0;//     #v4=(Float);
a=0;//     iget v5, p0, Lcom/wukongtv/wkhelper/controller/a/a;->d:F
a=0;// 
a=0;//     iget v6, p0, Lcom/wukongtv/wkhelper/controller/a/a;->b:F
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     sub-float/2addr v5, v6
a=0;// 
a=0;//     #v5=(Float);
a=0;//     mul-float/2addr v4, v5
a=0;// 
a=0;//     cmpg-float v4, v4, v7
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-gez v4, :cond_0
a=0;// 
a=0;//     iget v0, p0, Lcom/wukongtv/wkhelper/controller/a/a;->d:F
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     iget v4, p0, Lcom/wukongtv/wkhelper/controller/a/a;->e:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-float/2addr v4, v1
a=0;// 
a=0;//     #v4=(Float);
a=0;//     iget v5, p0, Lcom/wukongtv/wkhelper/controller/a/a;->e:F
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget v6, p0, Lcom/wukongtv/wkhelper/controller/a/a;->a:F
a=0;// 
a=0;//     sub-float/2addr v5, v6
a=0;// 
a=0;//     #v5=(Float);
a=0;//     mul-float/2addr v4, v5
a=0;// 
a=0;//     cmpg-float v4, v4, v7
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-gez v4, :cond_1
a=0;// 
a=0;//     iget v1, p0, Lcom/wukongtv/wkhelper/controller/a/a;->e:F
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Integer);
a=0;//     iget-object v4, p0, Lcom/wukongtv/wkhelper/controller/a/a;->c:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/Bitmap;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {p1, v4, v0, v1, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
a=0;// 
a=0;//     iput v0, p0, Lcom/wukongtv/wkhelper/controller/a/a;->b:F
a=0;// 
a=0;//     iput v1, p0, Lcom/wukongtv/wkhelper/controller/a/a;->a:F
a=0;// 
a=0;//     iget v0, p0, Lcom/wukongtv/wkhelper/controller/a/a;->b:F
a=0;// 
a=0;//     iget v1, p0, Lcom/wukongtv/wkhelper/controller/a/a;->d:F
a=0;// 
a=0;//     sub-float/2addr v0, v1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-static {v0}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     float-to-double v0, v0
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     cmpl-double v0, v0, v8
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gtz v0, :cond_2
a=0;// 
a=0;//     iget v0, p0, Lcom/wukongtv/wkhelper/controller/a/a;->a:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Lcom/wukongtv/wkhelper/controller/a/a;->e:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-float/2addr v0, v1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-static {v0}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     float-to-double v0, v0
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     cmpl-double v0, v0, v8
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_3
a=0;// 
a=0;//     :cond_2
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/controller/a/a;->invalidate()V
a=0;// 
a=0;//     :cond_3
a=0;//     iput-wide v2, p0, Lcom/wukongtv/wkhelper/controller/a/a;->f:J
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
