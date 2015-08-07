package com.wukongtv.wkhelper.ime; class d { void a() { int a;
a=0;// .class final Lcom/wukongtv/wkhelper/ime/d;
a=0;// .super Landroid/view/View;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field a:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;// .field b:Ljava/lang/String;
a=0;// 
a=0;// .field c:Landroid/graphics/Paint;
a=0;// 
a=0;// .field d:Landroid/graphics/Paint$FontMetricsInt;
a=0;// 
a=0;// .field e:F
a=0;// 
a=0;// .field f:I
a=0;// 
a=0;// .field g:I
a=0;// 
a=0;// .field h:I
a=0;// 
a=0;// .field i:I
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected final onDraw(Landroid/graphics/Canvas;)V
a=0;//     .locals 10
a=0;// 
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     const/high16 v7, 0x40000000
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/ime/d;->getWidth()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/ime/d;->getHeight()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/d;->a:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/d;->a:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sub-int v0, v3, v0
a=0;// 
a=0;//     div-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/ime/d;->a:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-int v1, v3, v1
a=0;// 
a=0;//     sub-int/2addr v1, v0
a=0;// 
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/ime/d;->a:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sub-int v2, v4, v2
a=0;// 
a=0;//     div-int/lit8 v2, v2, 0x2
a=0;// 
a=0;//     iget-object v5, p0, Lcom/wukongtv/wkhelper/ime/d;->a:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     sub-int v5, v4, v5
a=0;// 
a=0;//     sub-int/2addr v5, v2
a=0;// 
a=0;//     iget-object v6, p0, Lcom/wukongtv/wkhelper/ime/d;->a:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v6=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     sub-int v1, v3, v1
a=0;// 
a=0;//     sub-int v3, v4, v5
a=0;// 
a=0;//     invoke-virtual {v6, v0, v2, v1, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/d;->a:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Integer);v5=(Uninit);v6=(Uninit);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/d;->b:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/d;->c:Landroid/graphics/Paint;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/ime/d;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iget v1, p0, Lcom/wukongtv/wkhelper/ime/d;->f:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     int-to-float v2, v3
a=0;// 
a=0;//     #v2=(Float);
a=0;//     sub-float v0, v2, v0
a=0;// 
a=0;//     iget v2, p0, Lcom/wukongtv/wkhelper/ime/d;->f:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     sub-float/2addr v0, v2
a=0;// 
a=0;//     iget v2, p0, Lcom/wukongtv/wkhelper/ime/d;->g:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     sub-float/2addr v0, v2
a=0;// 
a=0;//     div-float/2addr v0, v7
a=0;// 
a=0;//     add-float/2addr v1, v0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/d;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget v2, p0, Lcom/wukongtv/wkhelper/ime/d;->f:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     cmpg-float v2, v1, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-gez v2, :cond_2
a=0;// 
a=0;//     iget v0, p0, Lcom/wukongtv/wkhelper/ime/d;->f:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v2, v0
a=0;// 
a=0;//     #v2=(Float);
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/ime/d;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget v0, p0, Lcom/wukongtv/wkhelper/ime/d;->f:I
a=0;// 
a=0;//     sub-int v0, v3, v0
a=0;// 
a=0;//     iget v3, p0, Lcom/wukongtv/wkhelper/ime/d;->g:I
a=0;// 
a=0;//     sub-int/2addr v0, v3
a=0;// 
a=0;//     int-to-float v3, v0
a=0;// 
a=0;//     #v3=(Float);
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-gt v0, v9, :cond_3
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Reference,Ljava/lang/String;);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move v1, v2
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Float);
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/ime/d;->d:Landroid/graphics/Paint$FontMetricsInt;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Paint$FontMetricsInt;);
a=0;//     iget v2, v2, Landroid/graphics/Paint$FontMetricsInt;->bottom:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget-object v3, p0, Lcom/wukongtv/wkhelper/ime/d;->d:Landroid/graphics/Paint$FontMetricsInt;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Paint$FontMetricsInt;);
a=0;//     iget v3, v3, Landroid/graphics/Paint$FontMetricsInt;->top:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-int/2addr v2, v3
a=0;// 
a=0;//     sub-int v2, v4, v2
a=0;// 
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     div-float/2addr v2, v7
a=0;// 
a=0;//     iget-object v3, p0, Lcom/wukongtv/wkhelper/ime/d;->d:Landroid/graphics/Paint$FontMetricsInt;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Paint$FontMetricsInt;);
a=0;//     iget v3, v3, Landroid/graphics/Paint$FontMetricsInt;->top:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     sub-float/2addr v2, v3
a=0;// 
a=0;//     iget-object v3, p0, Lcom/wukongtv/wkhelper/ime/d;->c:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Paint;);
a=0;//     invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Integer);v1=(Reference,Ljava/lang/String;);v3=(Float);
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     iget-object v5, p0, Lcom/wukongtv/wkhelper/ime/d;->c:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/Paint;);
a=0;//     invoke-virtual {v5, v1, v8, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     iget v6, p0, Lcom/wukongtv/wkhelper/ime/d;->e:F
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     add-float/2addr v5, v6
a=0;// 
a=0;//     cmpg-float v5, v5, v3
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     if-lez v5, :cond_4
a=0;// 
a=0;//     if-lt v9, v0, :cond_3
a=0;// 
a=0;//     :cond_4
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v8, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "..."
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method protected final onMeasure(II)V
a=0;//     .locals 9
a=0;// 
a=0;//     const/high16 v8, -0x80000000
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/high16 v0, 0x40000000
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v4, v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0, v3, v1}, Lcom/wukongtv/wkhelper/ime/d;->setMeasuredDimension(II)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     iget v0, p0, Lcom/wukongtv/wkhelper/ime/d;->f:I
a=0;// 
a=0;//     iget v2, p0, Lcom/wukongtv/wkhelper/ime/d;->g:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/2addr v2, v0
a=0;// 
a=0;//     iget v0, p0, Lcom/wukongtv/wkhelper/ime/d;->h:I
a=0;// 
a=0;//     iget v6, p0, Lcom/wukongtv/wkhelper/ime/d;->i:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     add-int/2addr v0, v6
a=0;// 
a=0;//     iget-object v6, p0, Lcom/wukongtv/wkhelper/ime/d;->a:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v6=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v6, :cond_6
a=0;// 
a=0;//     iget-object v6, p0, Lcom/wukongtv/wkhelper/ime/d;->a:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     invoke-virtual {v6}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     add-int/2addr v2, v6
a=0;// 
a=0;//     iget-object v6, p0, Lcom/wukongtv/wkhelper/ime/d;->a:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v6=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v6}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     add-int/2addr v0, v6
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v6=(Conflicted);v7=(Conflicted);
a=0;//     if-gt v3, v2, :cond_2
a=0;// 
a=0;//     if-ne v4, v8, :cond_3
a=0;// 
a=0;//     :cond_2
a=0;//     move v2, v3
a=0;// 
a=0;//     :cond_3
a=0;//     if-gt v1, v0, :cond_4
a=0;// 
a=0;//     if-ne v5, v8, :cond_5
a=0;// 
a=0;//     :cond_4
a=0;//     move v0, v1
a=0;// 
a=0;//     :cond_5
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/ime/h;->a()Lcom/wukongtv/wkhelper/ime/h;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/ime/h;);
a=0;//     iget v1, v1, Lcom/wukongtv/wkhelper/ime/h;->a:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v3, p0, Lcom/wukongtv/wkhelper/ime/d;->f:I
a=0;// 
a=0;//     sub-int/2addr v1, v3
a=0;// 
a=0;//     iget v3, p0, Lcom/wukongtv/wkhelper/ime/d;->g:I
a=0;// 
a=0;//     sub-int/2addr v1, v3
a=0;// 
a=0;//     if-le v2, v1, :cond_7
a=0;// 
a=0;//     :goto_2
a=0;//     invoke-virtual {p0, v1, v0}, Lcom/wukongtv/wkhelper/ime/d;->setMeasuredDimension(II)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_6
a=0;//     #v6=(Reference,Landroid/graphics/drawable/Drawable;);v7=(Uninit);
a=0;//     iget-object v6, p0, Lcom/wukongtv/wkhelper/ime/d;->b:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v6, :cond_1
a=0;// 
a=0;//     iget-object v6, p0, Lcom/wukongtv/wkhelper/ime/d;->c:Landroid/graphics/Paint;
a=0;// 
a=0;//     iget-object v7, p0, Lcom/wukongtv/wkhelper/ime/d;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Float);
a=0;//     float-to-int v6, v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     add-int/2addr v2, v6
a=0;// 
a=0;//     iget-object v6, p0, Lcom/wukongtv/wkhelper/ime/d;->d:Landroid/graphics/Paint$FontMetricsInt;
a=0;// 
a=0;//     #v6=(Reference,Landroid/graphics/Paint$FontMetricsInt;);
a=0;//     iget v6, v6, Landroid/graphics/Paint$FontMetricsInt;->bottom:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     iget-object v7, p0, Lcom/wukongtv/wkhelper/ime/d;->d:Landroid/graphics/Paint$FontMetricsInt;
a=0;// 
a=0;//     iget v7, v7, Landroid/graphics/Paint$FontMetricsInt;->top:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     sub-int/2addr v6, v7
a=0;// 
a=0;//     add-int/2addr v0, v6
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_7
a=0;//     #v6=(Conflicted);v7=(Conflicted);
a=0;//     move v1, v2
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
}}
