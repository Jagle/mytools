package com.c.a.a.a.a.a; class h { void a() { int a;
a=0;// .class public final Lcom/c/a/a/a/a/a/h;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/c/a/a/a/b;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final a:Landroid/graphics/Bitmap$CompressFormat;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected b:Lcom/c/a/a/a/a/a/a;
a=0;// 
a=0;// .field protected final c:Lcom/c/a/a/a/b/a;
a=0;// 
a=0;// .field protected d:I
a=0;// 
a=0;// .field protected e:Landroid/graphics/Bitmap$CompressFormat;
a=0;// 
a=0;// .field protected f:I
a=0;// 
a=0;// .field private g:Ljava/io/File;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap$CompressFormat;);
a=0;//     sput-object v0, Lcom/c/a/a/a/a/a/h;->a:Landroid/graphics/Bitmap$CompressFormat;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/io/File;Ljava/io/File;Lcom/c/a/a/a/b/a;JI)V
a=0;//     .locals 8
a=0;// 
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/c/a/a/a/a/a/h;);
a=0;//     const v0, 0x8000
a=0;// 
a=0;//     #v0=(Char);
a=0;//     iput v0, p0, Lcom/c/a/a/a/a/a/h;->d:I
a=0;// 
a=0;//     sget-object v0, Lcom/c/a/a/a/a/a/h;->a:Landroid/graphics/Bitmap$CompressFormat;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap$CompressFormat;);
a=0;//     iput-object v0, p0, Lcom/c/a/a/a/a/a/h;->e:Landroid/graphics/Bitmap$CompressFormat;
a=0;// 
a=0;//     const/16 v0, 0x64
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Lcom/c/a/a/a/a/a/h;->f:I
a=0;// 
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "cacheDir argument must be not null"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(PosByte);v1=(Uninit);
a=0;//     cmp-long v0, p4, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_1
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "cacheMaxSize argument must be positive number"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Byte);v1=(Uninit);
a=0;//     if-gez p6, :cond_2
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "cacheMaxFileCount argument must be positive number"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Byte);v1=(Uninit);
a=0;//     if-nez p3, :cond_3
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "fileNameGenerator argument must be not null"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Byte);v1=(Uninit);
a=0;//     cmp-long v0, p4, v2
a=0;// 
a=0;//     if-nez v0, :cond_5
a=0;// 
a=0;//     const-wide v4, 0x7fffffffffffffffL
a=0;// 
a=0;//     :goto_0
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     if-nez p6, :cond_4
a=0;// 
a=0;//     const v6, 0x7fffffff
a=0;// 
a=0;//     :goto_1
a=0;//     #v6=(Integer);
a=0;//     iput-object p2, p0, Lcom/c/a/a/a/a/a/h;->g:Ljava/io/File;
a=0;// 
a=0;//     iput-object p3, p0, Lcom/c/a/a/a/a/a/h;->c:Lcom/c/a/a/a/b/a;
a=0;// 
a=0;//     move-object v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/c/a/a/a/a/a/h;);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     invoke-direct/range {v1 .. v6}, Lcom/c/a/a/a/a/a/h;->a(Ljava/io/File;Ljava/io/File;JI)V
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_4
a=0;//     #v1=(Uninit);v2=(LongLo);v3=(LongHi);v6=(Uninit);
a=0;//     move v6, p6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_5
a=0;//     #v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     move-wide v4, p4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/io/File;Ljava/io/File;JI)V
a=0;//     .locals 7
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {p1, p3, p4, p5}, Lcom/c/a/a/a/a/a/a;->a(Ljava/io/File;JI)Lcom/c/a/a/a/a/a/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/c/a/a/a/a/a/a;);
a=0;//     iput-object v0, p0, Lcom/c/a/a/a/a/a/h;->b:Lcom/c/a/a/a/a/a/a;
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     invoke-static {v0}, Lcom/c/a/c/e;->a(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     if-eqz p2, :cond_1
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/c/a/a/a/a/a/h;);
a=0;//     move-object v2, p2
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     move-wide v4, p3
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     move v6, p5
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-direct/range {v1 .. v6}, Lcom/c/a/a/a/a/a/h;->a(Ljava/io/File;Ljava/io/File;JI)V
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/c/a/a/a/a/a/h;->b:Lcom/c/a/a/a/a/a/a;
a=0;// 
a=0;//     #v1=(Reference,Lcom/c/a/a/a/a/a/a;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method private b(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/c/a/a/a/a/a/h;->c:Lcom/c/a/a/a/b/a;
a=0;// 
a=0;//     #v0=(Reference,Lcom/c/a/a/a/b/a;);
a=0;//     invoke-interface {v0, p1}, Lcom/c/a/a/a/b/a;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(Ljava/lang/String;)Ljava/io/File;
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lcom/c/a/a/a/a/a/h;->b:Lcom/c/a/a/a/a/a/a;
a=0;// 
a=0;//     #v1=(Reference,Lcom/c/a/a/a/a/a/a;);
a=0;//     invoke-direct {p0, p1}, Lcom/c/a/a/a/a/a/h;->b(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Lcom/c/a/a/a/a/a/a;->a(Ljava/lang/String;)Lcom/c/a/a/a/a/a/g;
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/c/a/a/a/a/a/g;->close()V
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     #v3=(Uninit);
a=0;//     iget-object v1, v2, Lcom/c/a/a/a/a/a/g;->a:[Ljava/io/File;
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     aget-object v0, v1, v3
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     move-object v2, v0
a=0;// 
a=0;//     :goto_2
a=0;//     :try_start_2
a=0;//     #v2=(Reference,Lcom/c/a/a/a/a/a/g;);v3=(Conflicted);
a=0;//     invoke-static {v1}, Lcom/c/a/c/e;->a(Ljava/lang/Throwable;)V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_1
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/c/a/a/a/a/a/g;->close()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v2, v0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     :goto_3
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);v2=(Reference,Lcom/c/a/a/a/a/a/g;);v3=(Conflicted);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/c/a/a/a/a/a/g;->close()V
a=0;// 
a=0;//     :cond_2
a=0;//     throw v0
a=0;// 
a=0;//     :catchall_1
a=0;//     #v0=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Null);
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public final a(Ljava/lang/String;Landroid/graphics/Bitmap;)Z
a=0;//     .locals 4
a=0;// 
a=0;//     iget-object v0, p0, Lcom/c/a/a/a/a/a/h;->b:Lcom/c/a/a/a/a/a/a;
a=0;// 
a=0;//     #v0=(Reference,Lcom/c/a/a/a/a/a/a;);
a=0;//     invoke-direct {p0, p1}, Lcom/c/a/a/a/a/a/h;->b(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/c/a/a/a/a/a/a;->b(Ljava/lang/String;)Lcom/c/a/a/a/a/a/d;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/c/a/a/a/a/a/a;);v2=(Uninit);v3=(Uninit);
a=0;//     new-instance v2, Ljava/io/BufferedOutputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/BufferedOutputStream;);
a=0;//     invoke-virtual {v1}, Lcom/c/a/a/a/a/a/d;->a()Ljava/io/OutputStream;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v3, p0, Lcom/c/a/a/a/a/a/h;->d:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-direct {v2, v0, v3}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V
a=0;// 
a=0;//     :try_start_0
a=0;//     #v2=(Reference,Ljava/io/BufferedOutputStream;);
a=0;//     iget-object v0, p0, Lcom/c/a/a/a/a/a/h;->e:Landroid/graphics/Bitmap$CompressFormat;
a=0;// 
a=0;//     iget v3, p0, Lcom/c/a/a/a/a/a/h;->f:I
a=0;// 
a=0;//     invoke-virtual {p2, v0, v3, v2}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {v2}, Lcom/c/a/c/c;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/c/a/a/a/a/a/d;->b()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-static {v2}, Lcom/c/a/c/c;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {v1}, Lcom/c/a/a/a/a/a/d;->c()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final a(Ljava/lang/String;Ljava/io/InputStream;Lcom/c/a/c/d;)Z
a=0;//     .locals 4
a=0;// 
a=0;//     iget-object v0, p0, Lcom/c/a/a/a/a/a/h;->b:Lcom/c/a/a/a/a/a/a;
a=0;// 
a=0;//     #v0=(Reference,Lcom/c/a/a/a/a/a/a;);
a=0;//     invoke-direct {p0, p1}, Lcom/c/a/a/a/a/a/h;->b(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/c/a/a/a/a/a/a;->b(Ljava/lang/String;)Lcom/c/a/a/a/a/a/d;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/c/a/a/a/a/a/a;);v2=(Uninit);v3=(Uninit);
a=0;//     new-instance v2, Ljava/io/BufferedOutputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/BufferedOutputStream;);
a=0;//     invoke-virtual {v1}, Lcom/c/a/a/a/a/a/d;->a()Ljava/io/OutputStream;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v3, p0, Lcom/c/a/a/a/a/a/h;->d:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-direct {v2, v0, v3}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V
a=0;// 
a=0;//     :try_start_0
a=0;//     #v2=(Reference,Ljava/io/BufferedOutputStream;);
a=0;//     iget v0, p0, Lcom/c/a/a/a/a/a/h;->d:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {p2, v2, p3, v0}, Lcom/c/a/c/c;->a(Ljava/io/InputStream;Ljava/io/OutputStream;Lcom/c/a/c/d;I)Z
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {v2}, Lcom/c/a/c/c;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/c/a/a/a/a/a/d;->b()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     invoke-virtual {v1}, Lcom/c/a/a/a/a/a/d;->c()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v2}, Lcom/c/a/c/c;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/c/a/a/a/a/a/d;->c()V
a=0;// 
a=0;//     throw v0
a=0;// .end method
}}
