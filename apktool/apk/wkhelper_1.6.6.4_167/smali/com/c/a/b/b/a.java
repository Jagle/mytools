package com.c.a.b.b; class a { void a() { int a;
a=0;// .class public final Lcom/c/a/b/b/a;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/c/a/b/b/d;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected final a:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Z)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/c/a/b/b/a;);
a=0;//     iput-boolean p1, p0, Lcom/c/a/b/b/a;->a:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static a(Ljava/lang/String;)Lcom/c/a/b/b/b;
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(One);
a=0;//     new-instance v2, Landroid/media/ExifInterface;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/media/ExifInterface;);
a=0;//     sget-object v3, Lcom/c/a/b/d/d;->c:Lcom/c/a/b/d/d;
a=0;// 
a=0;//     #v3=(Reference,Lcom/c/a/b/d/d;);
a=0;//     invoke-virtual {v3, p0}, Lcom/c/a/b/d/d;->c(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v3}, Landroid/media/ExifInterface;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/media/ExifInterface;);
a=0;//     const-string v3, "Orientation"
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-virtual {v2, v3, v4}, Landroid/media/ExifInterface;->getAttributeInt(Ljava/lang/String;I)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     packed-switch v2, :pswitch_data_0
a=0;// 
a=0;//     :goto_0
a=0;//     :pswitch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_1
a=0;//     :pswitch_1
a=0;//     #v0=(Boolean);v1=(PosShort);
a=0;//     new-instance v2, Lcom/c/a/b/b/b;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/c/a/b/b/b;);
a=0;//     invoke-direct {v2, v1, v0}, Lcom/c/a/b/b/b;-><init>(IZ)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/c/a/b/b/b;);
a=0;//     return-object v2
a=0;// 
a=0;//     :pswitch_2
a=0;//     #v0=(One);v1=(Null);v2=(Integer);v3=(Reference,Ljava/lang/String;);v4=(One);
a=0;//     move v0, v1
a=0;// 
a=0;//     :pswitch_3
a=0;//     #v0=(Boolean);
a=0;//     const/16 v1, 0x5a
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :pswitch_4
a=0;//     #v0=(One);v1=(Null);
a=0;//     move v0, v1
a=0;// 
a=0;//     :pswitch_5
a=0;//     #v0=(Boolean);
a=0;//     const/16 v1, 0xb4
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :pswitch_6
a=0;//     #v0=(One);v1=(Null);
a=0;//     move v0, v1
a=0;// 
a=0;//     :pswitch_7
a=0;//     #v0=(Boolean);
a=0;//     const/16 v1, 0x10e
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(One);v1=(Null);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/IOException;);
a=0;//     const-string v2, "Can\'t read EXIF tags from file [%s]"
a=0;// 
a=0;//     new-array v0, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     aput-object p0, v0, v1
a=0;// 
a=0;//     invoke-static {v2, v0}, Lcom/c/a/c/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);p0=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_4
a=0;//         :pswitch_5
a=0;//         :pswitch_7
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//         :pswitch_6
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method private static a(Ljava/io/InputStream;Lcom/c/a/b/b/e;)Ljava/io/InputStream;
a=0;//     .locals 1
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Ljava/io/InputStream;->reset()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-object p0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     invoke-static {p0}, Lcom/c/a/c/c;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     invoke-static {p1}, Lcom/c/a/b/b/a;->b(Lcom/c/a/b/b/e;)Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object p0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static b(Lcom/c/a/b/b/e;)Ljava/io/InputStream;
a=0;//     .locals 3
a=0;// 
a=0;//     iget-object v0, p0, Lcom/c/a/b/b/e;->f:Lcom/c/a/b/d/c;
a=0;// 
a=0;//     #v0=(Reference,Lcom/c/a/b/d/c;);
a=0;//     iget-object v1, p0, Lcom/c/a/b/b/e;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/c/a/b/b/e;->g:Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {v0, v1, v2}, Lcom/c/a/b/d/c;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(Lcom/c/a/b/b/e;)Landroid/graphics/Bitmap;
a=0;//     .locals 11
a=0;// 
a=0;//     invoke-static {p1}, Lcom/c/a/b/b/a;->b(Lcom/c/a/b/b/e;)Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Ljava/io/InputStream;);
a=0;//     new-instance v2, Landroid/graphics/BitmapFactory$Options;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/graphics/BitmapFactory$Options;);
a=0;//     invoke-direct {v2}, Landroid/graphics/BitmapFactory$Options;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/BitmapFactory$Options;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, v2, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v1, v0, v2}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     iget-object v3, p1, Lcom/c/a/b/b/e;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget-boolean v0, p1, Lcom/c/a/b/b/e;->h:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-object v0, v2, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "image/jpeg"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-static {v3}, Lcom/c/a/b/d/d;->a(Ljava/lang/String;)Lcom/c/a/b/d/d;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/c/a/b/d/d;);
a=0;//     sget-object v4, Lcom/c/a/b/d/d;->c:Lcom/c/a/b/d/d;
a=0;// 
a=0;//     if-ne v0, v4, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-static {v3}, Lcom/c/a/b/b/a;->a(Ljava/lang/String;)Lcom/c/a/b/b/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Reference,Lcom/c/a/b/b/b;);v4=(Conflicted);
a=0;//     new-instance v3, Lcom/c/a/b/b/c;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/c/a/b/b/c;);
a=0;//     new-instance v4, Lcom/c/a/b/a/f;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/c/a/b/a/f;);
a=0;//     iget v5, v2, Landroid/graphics/BitmapFactory$Options;->outWidth:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget v2, v2, Landroid/graphics/BitmapFactory$Options;->outHeight:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget v6, v0, Lcom/c/a/b/b/b;->a:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-direct {v4, v5, v2, v6}, Lcom/c/a/b/a/f;-><init>(III)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/c/a/b/a/f;);
a=0;//     invoke-direct {v3, v4, v0}, Lcom/c/a/b/b/c;-><init>(Lcom/c/a/b/a/f;Lcom/c/a/b/b/b;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/c/a/b/b/c;);
a=0;//     invoke-static {v1, p1}, Lcom/c/a/b/b/a;->a(Ljava/io/InputStream;Lcom/c/a/b/b/e;)Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, v3, Lcom/c/a/b/b/c;->a:Lcom/c/a/b/a/f;
a=0;// 
a=0;//     #v2=(Reference,Lcom/c/a/b/a/f;);
a=0;//     iget v0, p1, Lcom/c/a/b/b/e;->d:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v4, Lcom/c/a/b/a/e;->a:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ne v0, v4, :cond_3
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_2
a=0;//     #v4=(Conflicted);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     if-le v0, v4, :cond_0
a=0;// 
a=0;//     iget-boolean v4, p0, Lcom/c/a/b/b/a;->a:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     const-string v4, "Subsample original image (%1$s) to %2$s (scale = %3$d) [%4$s]"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const/4 v5, 0x4
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     new-array v5, v5, [Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     aput-object v2, v5, v6
a=0;// 
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     new-instance v7, Lcom/c/a/b/a/f;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/c/a/b/a/f;);
a=0;//     iget v8, v2, Lcom/c/a/b/a/f;->a:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     div-int/2addr v8, v0
a=0;// 
a=0;//     iget v2, v2, Lcom/c/a/b/a/f;->b:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     div-int/2addr v2, v0
a=0;// 
a=0;//     invoke-direct {v7, v8, v2}, Lcom/c/a/b/a/f;-><init>(II)V
a=0;// 
a=0;//     #v7=(Reference,Lcom/c/a/b/a/f;);
a=0;//     aput-object v7, v5, v6
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v6, v5, v2
a=0;// 
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     iget-object v6, p1, Lcom/c/a/b/b/e;->a:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v6, v5, v2
a=0;// 
a=0;//     invoke-static {v4, v5}, Lcom/c/a/c/e;->a(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     iget-object v2, p1, Lcom/c/a/b/b/e;->i:Landroid/graphics/BitmapFactory$Options;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/BitmapFactory$Options;);
a=0;//     iput v0, v2, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v1, v0, v2}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     invoke-static {v1}, Lcom/c/a/c/c;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     if-nez v0, :cond_6
a=0;// 
a=0;//     const-string v1, "Image can\'t be decoded [%s]"
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iget-object v4, p1, Lcom/c/a/b/b/e;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/c/a/c/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     :goto_3
a=0;//     #v3=(Integer);v4=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v3=(Reference,Ljava/lang/String;);v4=(Reference,Ujava/lang/Object;);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     #v0=(Boolean);v4=(Conflicted);
a=0;//     new-instance v0, Lcom/c/a/b/b/b;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/c/a/b/b/b;);
a=0;//     invoke-direct {v0}, Lcom/c/a/b/b/b;-><init>()V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     #v0=(Reference,Lcom/c/a/b/b/b;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v1}, Lcom/c/a/c/c;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :cond_3
a=0;//     :try_start_2
a=0;//     #v0=(Integer);v2=(Reference,Lcom/c/a/b/a/f;);v3=(Reference,Lcom/c/a/b/b/c;);v4=(Integer);v5=(Integer);v6=(Integer);v7=(Uninit);v8=(Uninit);
a=0;//     sget v4, Lcom/c/a/b/a/e;->b:I
a=0;// 
a=0;//     if-ne v0, v4, :cond_4
a=0;// 
a=0;//     invoke-static {v2}, Lcom/c/a/c/a;->a(Lcom/c/a/b/a/f;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_4
a=0;//     iget-object v4, p1, Lcom/c/a/b/b/e;->c:Lcom/c/a/b/a/f;
a=0;// 
a=0;//     #v4=(Reference,Lcom/c/a/b/a/f;);
a=0;//     sget v5, Lcom/c/a/b/a/e;->c:I
a=0;// 
a=0;//     if-ne v0, v5, :cond_5
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_4
a=0;//     #v0=(Boolean);
a=0;//     iget v5, p1, Lcom/c/a/b/b/e;->e:I
a=0;// 
a=0;//     invoke-static {v2, v4, v5, v0}, Lcom/c/a/c/a;->a(Lcom/c/a/b/a/f;Lcom/c/a/b/a/f;IZ)I
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_5
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_4
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     iget-object v1, v3, Lcom/c/a/b/b/c;->b:Lcom/c/a/b/b/b;
a=0;// 
a=0;//     iget v2, v1, Lcom/c/a/b/b/b;->a:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget-object v1, v3, Lcom/c/a/b/b/c;->b:Lcom/c/a/b/b/b;
a=0;// 
a=0;//     iget-boolean v3, v1, Lcom/c/a/b/b/b;->b:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     new-instance v5, Landroid/graphics/Matrix;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/graphics/Matrix;);
a=0;//     invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/Matrix;);
a=0;//     iget v1, p1, Lcom/c/a/b/b/e;->d:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sget v4, Lcom/c/a/b/a/e;->e:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-eq v1, v4, :cond_7
a=0;// 
a=0;//     sget v4, Lcom/c/a/b/a/e;->f:I
a=0;// 
a=0;//     if-ne v1, v4, :cond_8
a=0;// 
a=0;//     :cond_7
a=0;//     new-instance v4, Lcom/c/a/b/a/f;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/c/a/b/a/f;);
a=0;//     invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-direct {v4, v6, v7, v2}, Lcom/c/a/b/a/f;-><init>(III)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/c/a/b/a/f;);
a=0;//     iget-object v6, p1, Lcom/c/a/b/b/e;->c:Lcom/c/a/b/a/f;
a=0;// 
a=0;//     #v6=(Reference,Lcom/c/a/b/a/f;);
a=0;//     iget v7, p1, Lcom/c/a/b/b/e;->e:I
a=0;// 
a=0;//     sget v8, Lcom/c/a/b/a/e;->f:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     if-ne v1, v8, :cond_c
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     :goto_5
a=0;//     #v1=(Boolean);
a=0;//     invoke-static {v4, v6, v7, v1}, Lcom/c/a/c/a;->b(Lcom/c/a/b/a/f;Lcom/c/a/b/a/f;IZ)F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     const/high16 v6, 0x3f800000
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-static {v1, v6}, Ljava/lang/Float;->compare(FF)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     if-eqz v6, :cond_8
a=0;// 
a=0;//     invoke-virtual {v5, v1, v1}, Landroid/graphics/Matrix;->setScale(FF)V
a=0;// 
a=0;//     iget-boolean v6, p0, Lcom/c/a/b/b/a;->a:Z
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_8
a=0;// 
a=0;//     const-string v6, "Scale subsampled image (%1$s) to %2$s (scale = %3$.5f) [%4$s]"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const/4 v7, 0x4
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     new-array v7, v7, [Ljava/lang/Object;
a=0;// 
a=0;//     #v7=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     aput-object v4, v7, v8
a=0;// 
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     new-instance v9, Lcom/c/a/b/a/f;
a=0;// 
a=0;//     #v9=(UninitRef,Lcom/c/a/b/a/f;);
a=0;//     iget v10, v4, Lcom/c/a/b/a/f;->a:I
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     int-to-float v10, v10
a=0;// 
a=0;//     #v10=(Float);
a=0;//     mul-float/2addr v10, v1
a=0;// 
a=0;//     float-to-int v10, v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     iget v4, v4, Lcom/c/a/b/a/f;->b:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     mul-float/2addr v4, v1
a=0;// 
a=0;//     float-to-int v4, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-direct {v9, v10, v4}, Lcom/c/a/b/a/f;-><init>(II)V
a=0;// 
a=0;//     #v9=(Reference,Lcom/c/a/b/a/f;);
a=0;//     aput-object v9, v7, v8
a=0;// 
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Float;);
a=0;//     aput-object v1, v7, v4
a=0;// 
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iget-object v4, p1, Lcom/c/a/b/b/e;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     aput-object v4, v7, v1
a=0;// 
a=0;//     invoke-static {v6, v7}, Lcom/c/a/c/e;->a(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     :cond_8
a=0;//     #v1=(Integer);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     if-eqz v3, :cond_9
a=0;// 
a=0;//     const/high16 v1, -0x40800000
a=0;// 
a=0;//     const/high16 v3, 0x3f800000
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v5, v1, v3}, Landroid/graphics/Matrix;->postScale(FF)Z
a=0;// 
a=0;//     iget-boolean v1, p0, Lcom/c/a/b/b/a;->a:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_9
a=0;// 
a=0;//     const-string v1, "Flip image horizontally [%s]"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     iget-object v6, p1, Lcom/c/a/b/b/e;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     aput-object v6, v3, v4
a=0;// 
a=0;//     invoke-static {v1, v3}, Lcom/c/a/c/e;->a(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     :cond_9
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);
a=0;//     if-eqz v2, :cond_a
a=0;// 
a=0;//     int-to-float v1, v2
a=0;// 
a=0;//     #v1=(Float);
a=0;//     invoke-virtual {v5, v1}, Landroid/graphics/Matrix;->postRotate(F)Z
a=0;// 
a=0;//     iget-boolean v1, p0, Lcom/c/a/b/b/a;->a:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_a
a=0;// 
a=0;//     const-string v1, "Rotate image on %1$d\u00b0 [%2$s]"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v2, v3, v4
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     iget-object v4, p1, Lcom/c/a/b/b/e;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     aput-object v4, v3, v2
a=0;// 
a=0;//     invoke-static {v1, v3}, Lcom/c/a/c/e;->a(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     :cond_a
a=0;//     #v1=(Conflicted);v2=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Bitmap;);
a=0;//     if-eq v1, v0, :cond_b
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V
a=0;// 
a=0;//     :cond_b
a=0;//     move-object v0, v1
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :cond_c
a=0;//     #v1=(Integer);v2=(Integer);v3=(Boolean);v4=(Reference,Lcom/c/a/b/a/f;);v6=(Reference,Lcom/c/a/b/a/f;);v7=(Integer);v8=(Integer);v9=(Uninit);v10=(Uninit);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto/16 :goto_5
a=0;// .end method
}}
