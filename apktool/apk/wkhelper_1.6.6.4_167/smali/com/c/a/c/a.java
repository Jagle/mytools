package com.c.a.c; class a { void a() { int a;
a=0;// .class public final Lcom/c/a/c/a;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static a:Lcom/c/a/b/a/f;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     new-array v0, v0, [I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     const/16 v1, 0xd33
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-static {v1, v0, v2}, Landroid/opengl/GLES10;->glGetIntegerv(I[II)V
a=0;// 
a=0;//     aget v0, v0, v2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x800
a=0;// 
a=0;//     invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     new-instance v1, Lcom/c/a/b/a/f;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/c/a/b/a/f;);
a=0;//     invoke-direct {v1, v0, v0}, Lcom/c/a/b/a/f;-><init>(II)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/c/a/b/a/f;);
a=0;//     sput-object v1, Lcom/c/a/c/a;->a:Lcom/c/a/b/a/f;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Lcom/c/a/b/a/f;)I
a=0;//     .locals 6
a=0;// 
a=0;//     iget v0, p0, Lcom/c/a/b/a/f;->a:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Lcom/c/a/b/a/f;->b:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sget-object v2, Lcom/c/a/c/a;->a:Lcom/c/a/b/a/f;
a=0;// 
a=0;//     #v2=(Reference,Lcom/c/a/b/a/f;);
a=0;//     iget v2, v2, Lcom/c/a/b/a/f;->a:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sget-object v3, Lcom/c/a/c/a;->a:Lcom/c/a/b/a/f;
a=0;// 
a=0;//     #v3=(Reference,Lcom/c/a/b/a/f;);
a=0;//     iget v3, v3, Lcom/c/a/b/a/f;->b:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     div-float/2addr v0, v2
a=0;// 
a=0;//     float-to-double v4, v0
a=0;// 
a=0;//     #v4=(DoubleLo);v5=(DoubleHi);
a=0;//     invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     double-to-int v0, v4
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     int-to-float v2, v3
a=0;// 
a=0;//     div-float/2addr v1, v2
a=0;// 
a=0;//     float-to-double v2, v1
a=0;// 
a=0;//     #v2=(DoubleLo);v3=(DoubleHi);
a=0;//     invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     double-to-int v1, v2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Lcom/c/a/b/a/f;Lcom/c/a/b/a/f;IZ)I
a=0;//     .locals 9
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iget v2, p0, Lcom/c/a/b/a/f;->a:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget v3, p0, Lcom/c/a/b/a/f;->b:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget v4, p1, Lcom/c/a/b/a/f;->a:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget v5, p1, Lcom/c/a/b/a/f;->b:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     sget-object v0, Lcom/c/a/c/b;->a:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     add-int/lit8 v6, p2, -0x1
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     aget v0, v0, v6
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v7=(Conflicted);v8=(Conflicted);
a=0;//     if-gtz v0, :cond_7
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Integer);
a=0;//     sget-object v0, Lcom/c/a/c/a;->a:Lcom/c/a/b/a/f;
a=0;// 
a=0;//     #v0=(Reference,Lcom/c/a/b/a/f;);
a=0;//     iget v0, v0, Lcom/c/a/b/a/f;->a:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget-object v4, Lcom/c/a/c/a;->a:Lcom/c/a/b/a/f;
a=0;// 
a=0;//     #v4=(Reference,Lcom/c/a/b/a/f;);
a=0;//     iget v4, v4, Lcom/c/a/b/a/f;->b:I
a=0;// 
a=0;//     :goto_2
a=0;//     #v4=(Integer);
a=0;//     div-int v5, v2, v1
a=0;// 
a=0;//     if-gt v5, v0, :cond_1
a=0;// 
a=0;//     div-int v5, v3, v1
a=0;// 
a=0;//     if-le v5, v4, :cond_6
a=0;// 
a=0;//     :cond_1
a=0;//     if-eqz p3, :cond_5
a=0;// 
a=0;//     mul-int/lit8 v1, v1, 0x2
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :pswitch_0
a=0;//     #v1=(One);v7=(Uninit);v8=(Uninit);
a=0;//     if-eqz p3, :cond_3
a=0;// 
a=0;//     div-int/lit8 v6, v2, 0x2
a=0;// 
a=0;//     div-int/lit8 v7, v3, 0x2
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_3
a=0;//     #v8=(Conflicted);
a=0;//     div-int v8, v6, v0
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     if-gt v8, v4, :cond_2
a=0;// 
a=0;//     div-int v8, v7, v0
a=0;// 
a=0;//     if-le v8, v5, :cond_0
a=0;// 
a=0;//     :cond_2
a=0;//     mul-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_3
a=0;//     #v7=(Uninit);v8=(Uninit);
a=0;//     div-int v0, v2, v4
a=0;// 
a=0;//     div-int v4, v3, v5
a=0;// 
a=0;//     invoke-static {v0, v4}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_1
a=0;//     if-eqz p3, :cond_4
a=0;// 
a=0;//     div-int/lit8 v6, v2, 0x2
a=0;// 
a=0;//     div-int/lit8 v7, v3, 0x2
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_4
a=0;//     #v8=(Conflicted);
a=0;//     div-int v8, v6, v0
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     if-le v8, v4, :cond_0
a=0;// 
a=0;//     div-int v8, v7, v0
a=0;// 
a=0;//     if-le v8, v5, :cond_0
a=0;// 
a=0;//     mul-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :cond_4
a=0;//     #v7=(Uninit);v8=(Uninit);
a=0;//     div-int v0, v2, v4
a=0;// 
a=0;//     div-int v4, v3, v5
a=0;// 
a=0;//     invoke-static {v0, v4}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     #v1=(Integer);v7=(Conflicted);v8=(Conflicted);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_6
a=0;//     return v1
a=0;// 
a=0;//     :cond_7
a=0;//     #v1=(One);
a=0;//     move v1, v0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public static a(Lcom/c/a/b/e/a;Lcom/c/a/b/a/f;)Lcom/c/a/b/a/f;
a=0;//     .locals 3
a=0;// 
a=0;//     invoke-interface {p0}, Lcom/c/a/b/e/a;->a()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gtz v0, :cond_0
a=0;// 
a=0;//     iget v0, p1, Lcom/c/a/b/a/f;->a:I
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-interface {p0}, Lcom/c/a/b/e/a;->b()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-gtz v1, :cond_1
a=0;// 
a=0;//     iget v1, p1, Lcom/c/a/b/a/f;->b:I
a=0;// 
a=0;//     :cond_1
a=0;//     new-instance v2, Lcom/c/a/b/a/f;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/c/a/b/a/f;);
a=0;//     invoke-direct {v2, v0, v1}, Lcom/c/a/b/a/f;-><init>(II)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/c/a/b/a/f;);
a=0;//     return-object v2
a=0;// .end method
a=0;// 
a=0;// .method public static b(Lcom/c/a/b/a/f;Lcom/c/a/b/a/f;IZ)F
a=0;//     .locals 7
a=0;// 
a=0;//     iget v3, p0, Lcom/c/a/b/a/f;->a:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget v4, p0, Lcom/c/a/b/a/f;->b:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget v0, p1, Lcom/c/a/b/a/f;->a:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p1, Lcom/c/a/b/a/f;->b:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v2, v3
a=0;// 
a=0;//     #v2=(Float);
a=0;//     int-to-float v5, v0
a=0;// 
a=0;//     #v5=(Float);
a=0;//     div-float/2addr v2, v5
a=0;// 
a=0;//     int-to-float v5, v4
a=0;// 
a=0;//     int-to-float v6, v1
a=0;// 
a=0;//     #v6=(Float);
a=0;//     div-float/2addr v5, v6
a=0;// 
a=0;//     sget v6, Lcom/c/a/b/a/i;->a:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-ne p2, v6, :cond_0
a=0;// 
a=0;//     cmpl-float v6, v2, v5
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-gez v6, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v6=(Integer);
a=0;//     sget v6, Lcom/c/a/b/a/i;->b:I
a=0;// 
a=0;//     if-ne p2, v6, :cond_5
a=0;// 
a=0;//     cmpg-float v6, v2, v5
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-gez v6, :cond_5
a=0;// 
a=0;//     :cond_1
a=0;//     int-to-float v1, v4
a=0;// 
a=0;//     #v1=(Float);
a=0;//     div-float/2addr v1, v2
a=0;// 
a=0;//     float-to-int v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v2, v1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v6=(Integer);
a=0;//     const/high16 v0, 0x3f800000
a=0;// 
a=0;//     if-nez p3, :cond_2
a=0;// 
a=0;//     if-ge v1, v3, :cond_2
a=0;// 
a=0;//     if-lt v2, v4, :cond_3
a=0;// 
a=0;//     :cond_2
a=0;//     if-eqz p3, :cond_4
a=0;// 
a=0;//     if-eq v1, v3, :cond_4
a=0;// 
a=0;//     if-eq v2, v4, :cond_4
a=0;// 
a=0;//     :cond_3
a=0;//     int-to-float v0, v1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     int-to-float v1, v3
a=0;// 
a=0;//     #v1=(Float);
a=0;//     div-float/2addr v0, v1
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_5
a=0;//     #v2=(Float);
a=0;//     int-to-float v0, v3
a=0;// 
a=0;//     #v0=(Float);
a=0;//     div-float/2addr v0, v5
a=0;// 
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v2, v1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
