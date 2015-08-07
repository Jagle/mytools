package com.wukongtv.wkhelper.ime; class ComposingView { void a() { int a;
a=0;// .class public Lcom/wukongtv/wkhelper/ime/ComposingView;
a=0;// .super Landroid/view/View;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field a:I
a=0;// 
a=0;// .field b:Lcom/wukongtv/wkhelper/ime/k;
a=0;// 
a=0;// .field c:I
a=0;// 
a=0;// .field d:I
a=0;// 
a=0;// .field e:I
a=0;// 
a=0;// .field f:I
a=0;// 
a=0;// .field private g:Landroid/graphics/Paint;
a=0;// 
a=0;// .field private h:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;// .field private i:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;// .field private j:Landroid/graphics/Paint$FontMetricsInt;
a=0;// 
a=0;// .field private k:I
a=0;// 
a=0;// .field private l:I
a=0;// 
a=0;// .field private m:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/ime/ComposingView;);
a=0;//     iput v1, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->c:I
a=0;// 
a=0;//     iput v1, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->d:I
a=0;// 
a=0;//     const/16 v0, 0xa
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->e:I
a=0;// 
a=0;//     iput v1, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->f:I
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     const v1, 0x7f020018
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     iput-object v1, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->h:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     const v1, 0x7f020017
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     iput-object v1, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->i:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     const/high16 v1, 0x7f090000
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     iput v1, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->k:I
a=0;// 
a=0;//     const v1, 0x7f090016
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     iput v1, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->l:I
a=0;// 
a=0;//     const v1, 0x7f090007
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     iput v1, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->m:I
a=0;// 
a=0;//     const v1, 0x7f060003
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     new-instance v1, Landroid/graphics/Paint;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/graphics/Paint;);
a=0;//     invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Paint;);
a=0;//     iput-object v1, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->g:Landroid/graphics/Paint;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->g:Landroid/graphics/Paint;
a=0;// 
a=0;//     iget v2, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->k:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->g:Landroid/graphics/Paint;
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->g:Landroid/graphics/Paint;
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setTextSize(F)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->g:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Paint;);
a=0;//     invoke-virtual {v0}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->j:Landroid/graphics/Paint$FontMetricsInt;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/graphics/Canvas;F)V
a=0;//     .locals 6
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->i:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     float-to-int v1, p2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->e:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     float-to-int v3, p2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget-object v4, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->i:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/2addr v3, v4
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/ime/ComposingView;->getHeight()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     iget v5, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->f:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     sub-int/2addr v4, v5
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->i:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getComposingStatus$272785d4()I
a=0;//     .locals 1
a=0;// 
a=0;//     iget v0, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->a:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected onDraw(Landroid/graphics/Canvas;)V
a=0;//     .locals 14
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     sget v0, Lcom/wukongtv/wkhelper/ime/f;->c:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->a:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     sget v0, Lcom/wukongtv/wkhelper/ime/f;->a:I
a=0;// 
a=0;//     iget v1, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->a:I
a=0;// 
a=0;//     if-ne v0, v1, :cond_8
a=0;// 
a=0;//     :cond_0
a=0;//     iget v0, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->c:I
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x5
a=0;// 
a=0;//     int-to-float v4, v0
a=0;// 
a=0;//     #v4=(Float);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->j:Landroid/graphics/Paint$FontMetricsInt;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Paint$FontMetricsInt;);
a=0;//     iget v0, v0, Landroid/graphics/Paint$FontMetricsInt;->top:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     neg-int v0, v0
a=0;// 
a=0;//     iget v1, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->e:I
a=0;// 
a=0;//     add-int/2addr v0, v1
a=0;// 
a=0;//     int-to-float v5, v0
a=0;// 
a=0;//     #v5=(Float);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->g:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Paint;);
a=0;//     iget v1, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->k:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
a=0;// 
a=0;//     iget-object v3, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->b:Lcom/wukongtv/wkhelper/ime/k;
a=0;// 
a=0;//     #v3=(Reference,Lcom/wukongtv/wkhelper/ime/k;);
a=0;//     iget v0, v3, Lcom/wukongtv/wkhelper/ime/k;->k:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     iget v6, v3, Lcom/wukongtv/wkhelper/ime/k;->h:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-ge v0, v6, :cond_2
a=0;// 
a=0;//     iget v6, v3, Lcom/wukongtv/wkhelper/ime/k;->k:I
a=0;// 
a=0;//     iget-object v7, v3, Lcom/wukongtv/wkhelper/ime/k;->j:[I
a=0;// 
a=0;//     #v7=(Reference,[I);
a=0;//     add-int/lit8 v8, v0, 0x2
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     aget v7, v7, v8
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-lt v6, v7, :cond_1
a=0;// 
a=0;//     iget-object v6, v3, Lcom/wukongtv/wkhelper/ime/k;->j:[I
a=0;// 
a=0;//     #v6=(Reference,[I);
a=0;//     add-int/lit8 v7, v0, 0x2
a=0;// 
a=0;//     aget v6, v6, v7
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     iget-object v7, v3, Lcom/wukongtv/wkhelper/ime/k;->j:[I
a=0;// 
a=0;//     #v7=(Reference,[I);
a=0;//     add-int/lit8 v8, v0, 0x1
a=0;// 
a=0;//     aget v7, v7, v8
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     sub-int/2addr v6, v7
a=0;// 
a=0;//     sub-int/2addr v1, v6
a=0;// 
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     :cond_1
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v7=(Conflicted);v8=(Conflicted);
a=0;//     iget v0, v3, Lcom/wukongtv/wkhelper/ime/k;->h:I
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     move v13, v1
a=0;// 
a=0;//     :goto_1
a=0;//     #v13=(Integer);
a=0;//     iget-object v1, v3, Lcom/wukongtv/wkhelper/ime/k;->j:[I
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     array-length v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     if-ge v0, v1, :cond_3
a=0;// 
a=0;//     iget v1, v3, Lcom/wukongtv/wkhelper/ime/k;->k:I
a=0;// 
a=0;//     iget-object v6, v3, Lcom/wukongtv/wkhelper/ime/k;->j:[I
a=0;// 
a=0;//     #v6=(Reference,[I);
a=0;//     aget v6, v6, v0
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-le v1, v6, :cond_3
a=0;// 
a=0;//     add-int/lit8 v1, v13, 0x1
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     move v13, v1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->b:Lcom/wukongtv/wkhelper/ime/k;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/ime/k;);
a=0;//     iget-object v1, v0, Lcom/wukongtv/wkhelper/ime/k;->e:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->b:Lcom/wukongtv/wkhelper/ime/k;
a=0;// 
a=0;//     iget v9, v0, Lcom/wukongtv/wkhelper/ime/k;->f:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     if-le v13, v9, :cond_b
a=0;// 
a=0;//     move v3, v9
a=0;// 
a=0;//     :goto_2
a=0;//     #v3=(Integer);
a=0;//     iget-object v6, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->g:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v6=(Reference,Landroid/graphics/Paint;);
a=0;//     move-object v0, p1
a=0;// 
a=0;//     invoke-virtual/range {v0 .. v6}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;IIFFLandroid/graphics/Paint;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->g:Landroid/graphics/Paint;
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2, v3}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     add-float v10, v4, v0
a=0;// 
a=0;//     #v10=(Float);
a=0;//     if-gt v13, v9, :cond_5
a=0;// 
a=0;//     sget v0, Lcom/wukongtv/wkhelper/ime/f;->c:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v2, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->a:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v0, v2, :cond_4
a=0;// 
a=0;//     invoke-direct {p0, p1, v10}, Lcom/wukongtv/wkhelper/ime/ComposingView;->a(Landroid/graphics/Canvas;F)V
a=0;// 
a=0;//     :cond_4
a=0;//     iget-object v12, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->g:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v12=(Reference,Landroid/graphics/Paint;);
a=0;//     move-object v6, p1
a=0;// 
a=0;//     move-object v7, v1
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     move v8, v3
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     move v11, v5
a=0;// 
a=0;//     #v11=(Float);
a=0;//     invoke-virtual/range {v6 .. v12}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;IIFFLandroid/graphics/Paint;)V
a=0;// 
a=0;//     :cond_5
a=0;//     #v7=(Conflicted);v8=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->g:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Paint;);
a=0;//     invoke-virtual {v0, v1, v3, v9}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     add-float v4, v10, v0
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-le v0, v9, :cond_7
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->g:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Paint;);
a=0;//     iget v2, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->m:I
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V
a=0;// 
a=0;//     if-le v13, v9, :cond_a
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-le v13, v0, :cond_9
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     :goto_3
a=0;//     iget-object v6, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->g:Landroid/graphics/Paint;
a=0;// 
a=0;//     move-object v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Canvas;);
a=0;//     move v2, v9
a=0;// 
a=0;//     invoke-virtual/range {v0 .. v6}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;IIFFLandroid/graphics/Paint;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->g:Landroid/graphics/Paint;
a=0;// 
a=0;//     invoke-virtual {v0, v1, v9, v3}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     add-float/2addr v4, v0
a=0;// 
a=0;//     sget v0, Lcom/wukongtv/wkhelper/ime/f;->c:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v2, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->a:I
a=0;// 
a=0;//     if-ne v0, v2, :cond_6
a=0;// 
a=0;//     invoke-direct {p0, p1, v4}, Lcom/wukongtv/wkhelper/ime/ComposingView;->a(Landroid/graphics/Canvas;F)V
a=0;// 
a=0;//     :cond_6
a=0;//     move v2, v3
a=0;// 
a=0;//     :goto_4
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     iget-object v6, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->g:Landroid/graphics/Paint;
a=0;// 
a=0;//     move-object v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Canvas;);
a=0;//     invoke-virtual/range {v0 .. v6}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;IIFFLandroid/graphics/Paint;)V
a=0;// 
a=0;//     :cond_7
a=0;//     :goto_5
a=0;//     #v0=(Conflicted);v9=(Conflicted);v10=(Conflicted);v13=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_8
a=0;//     #v0=(Integer);v1=(Integer);v2=(Null);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);
a=0;//     iget v0, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->c:I
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x5
a=0;// 
a=0;//     int-to-float v4, v0
a=0;// 
a=0;//     #v4=(Float);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->j:Landroid/graphics/Paint$FontMetricsInt;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Paint$FontMetricsInt;);
a=0;//     iget v0, v0, Landroid/graphics/Paint$FontMetricsInt;->top:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     neg-int v0, v0
a=0;// 
a=0;//     iget v1, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->e:I
a=0;// 
a=0;//     add-int/2addr v0, v1
a=0;// 
a=0;//     int-to-float v5, v0
a=0;// 
a=0;//     #v5=(Float);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->g:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Paint;);
a=0;//     iget v1, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->l:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->h:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     iget v1, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->c:I
a=0;// 
a=0;//     iget v3, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->e:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/ime/ComposingView;->getWidth()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     iget v7, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->d:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     sub-int/2addr v6, v7
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/ime/ComposingView;->getHeight()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     iget v8, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->f:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     sub-int/2addr v7, v8
a=0;// 
a=0;//     invoke-virtual {v0, v1, v3, v6, v7}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->h:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->b:Lcom/wukongtv/wkhelper/ime/k;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/wukongtv/wkhelper/ime/k;->a:Ljava/lang/StringBuffer;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     iget-object v6, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->g:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v6=(Reference,Landroid/graphics/Paint;);
a=0;//     move-object v0, p1
a=0;// 
a=0;//     invoke-virtual/range {v0 .. v6}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;IIFFLandroid/graphics/Paint;)V
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :cond_9
a=0;//     #v0=(Integer);v2=(Integer);v7=(Conflicted);v8=(Conflicted);v9=(Integer);v10=(Float);v11=(Conflicted);v12=(Conflicted);v13=(Integer);
a=0;//     move v3, v13
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_a
a=0;//     #v0=(Reference,Landroid/graphics/Paint;);
a=0;//     move v2, v9
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :cond_b
a=0;//     #v2=(Null);v3=(Reference,Lcom/wukongtv/wkhelper/ime/k;);v6=(Integer);v10=(Uninit);v11=(Uninit);v12=(Uninit);
a=0;//     move v3, v13
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     goto/16 :goto_2
a=0;// .end method
a=0;// 
a=0;// .method protected onMeasure(II)V
a=0;//     .locals 6
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->j:Landroid/graphics/Paint$FontMetricsInt;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Paint$FontMetricsInt;);
a=0;//     iget v0, v0, Landroid/graphics/Paint$FontMetricsInt;->bottom:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->j:Landroid/graphics/Paint$FontMetricsInt;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Paint$FontMetricsInt;);
a=0;//     iget v1, v1, Landroid/graphics/Paint$FontMetricsInt;->top:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-int/2addr v0, v1
a=0;// 
a=0;//     iget v1, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->e:I
a=0;// 
a=0;//     add-int/2addr v0, v1
a=0;// 
a=0;//     iget v1, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->f:I
a=0;// 
a=0;//     add-int/2addr v1, v0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->b:Lcom/wukongtv/wkhelper/ime/k;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/ime/k;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Float);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     const/high16 v2, 0x3f000000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-float/2addr v0, v2
a=0;// 
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/wukongtv/wkhelper/ime/ComposingView;->setMeasuredDimension(II)V
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/ime/k;);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     iget v0, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->c:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v2, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->d:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/2addr v0, v2
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0xa
a=0;// 
a=0;//     int-to-float v2, v0
a=0;// 
a=0;//     #v2=(Float);
a=0;//     sget v0, Lcom/wukongtv/wkhelper/ime/f;->b:I
a=0;// 
a=0;//     iget v3, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->a:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v0, v3, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->b:Lcom/wukongtv/wkhelper/ime/k;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/ime/k;);
a=0;//     iget-object v0, v0, Lcom/wukongtv/wkhelper/ime/k;->a:Ljava/lang/StringBuffer;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_1
a=0;//     iget-object v3, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->g:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Paint;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v3, v0, v4, v5}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     add-float/2addr v0, v2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);v3=(Integer);v4=(Uninit);v5=(Uninit);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/ComposingView;->b:Lcom/wukongtv/wkhelper/ime/k;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/ime/k;);
a=0;//     iget-object v0, v0, Lcom/wukongtv/wkhelper/ime/k;->e:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
