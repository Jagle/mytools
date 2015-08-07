package com.c.a.a.a.a; class a { void a() { int a;
a=0;// .class public abstract Lcom/c/a/a/a/a/a;
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
a=0;// .field protected final b:Ljava/io/File;
a=0;// 
a=0;// .field protected final c:Ljava/io/File;
a=0;// 
a=0;// .field protected final d:Lcom/c/a/a/a/b/a;
a=0;// 
a=0;// .field protected e:I
a=0;// 
a=0;// .field protected f:Landroid/graphics/Bitmap$CompressFormat;
a=0;// 
a=0;// .field protected g:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap$CompressFormat;);
a=0;//     sput-object v0, Lcom/c/a/a/a/a/a;->a:Landroid/graphics/Bitmap$CompressFormat;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/io/File;)V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0}, Lcom/c/a/a/a/a/a;-><init>(Ljava/io/File;B)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/c/a/a/a/a/a;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Ljava/io/File;B)V
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     new-instance v1, Lcom/c/a/a/a/b/b;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/c/a/a/a/b/b;);
a=0;//     invoke-direct {v1}, Lcom/c/a/a/a/b/b;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lcom/c/a/a/a/b/b;);
a=0;//     invoke-direct {p0, p1, v0, v1}, Lcom/c/a/a/a/a/a;-><init>(Ljava/io/File;Ljava/io/File;Lcom/c/a/a/a/b/a;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/c/a/a/a/a/a;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/io/File;Ljava/io/File;Lcom/c/a/a/a/b/a;)V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/c/a/a/a/a/a;);
a=0;//     const v0, 0x8000
a=0;// 
a=0;//     #v0=(Char);
a=0;//     iput v0, p0, Lcom/c/a/a/a/a/a;->e:I
a=0;// 
a=0;//     sget-object v0, Lcom/c/a/a/a/a/a;->a:Landroid/graphics/Bitmap$CompressFormat;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap$CompressFormat;);
a=0;//     iput-object v0, p0, Lcom/c/a/a/a/a/a;->f:Landroid/graphics/Bitmap$CompressFormat;
a=0;// 
a=0;//     const/16 v0, 0x64
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Lcom/c/a/a/a/a/a;->g:I
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
a=0;//     if-nez p3, :cond_1
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
a=0;//     :cond_1
a=0;//     #v0=(PosByte);v1=(Uninit);
a=0;//     iput-object p1, p0, Lcom/c/a/a/a/a/a;->b:Ljava/io/File;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/c/a/a/a/a/a;->c:Ljava/io/File;
a=0;// 
a=0;//     iput-object p3, p0, Lcom/c/a/a/a/a/a;->d:Lcom/c/a/a/a/b/a;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private b(Ljava/lang/String;)Ljava/io/File;
a=0;//     .locals 3
a=0;// 
a=0;//     iget-object v0, p0, Lcom/c/a/a/a/a/a;->d:Lcom/c/a/a/a/b/a;
a=0;// 
a=0;//     #v0=(Reference,Lcom/c/a/a/a/b/a;);
a=0;//     invoke-interface {v0, p1}, Lcom/c/a/a/a/b/a;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/c/a/a/a/a/a;->b:Ljava/io/File;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/c/a/a/a/a/a;->b:Ljava/io/File;
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/c/a/a/a/a/a;->b:Ljava/io/File;
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/c/a/a/a/a/a;->c:Ljava/io/File;
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/c/a/a/a/a/a;->c:Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     iget-object v2, p0, Lcom/c/a/a/a/a/a;->c:Ljava/io/File;
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/c/a/a/a/a/a;->c:Ljava/io/File;
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v2, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     return-object v2
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(Ljava/lang/String;)Ljava/io/File;
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lcom/c/a/a/a/a/a;->b(Ljava/lang/String;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final a(Ljava/lang/String;Landroid/graphics/Bitmap;)Z
a=0;//     .locals 5
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lcom/c/a/a/a/a/a;->b(Ljava/lang/String;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v3, ".tmp"
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     new-instance v3, Ljava/io/BufferedOutputStream;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/BufferedOutputStream;);
a=0;//     new-instance v0, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v0, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/FileOutputStream;);
a=0;//     iget v4, p0, Lcom/c/a/a/a/a/a;->e:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-direct {v3, v0, v4}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V
a=0;// 
a=0;//     :try_start_0
a=0;//     #v3=(Reference,Ljava/io/BufferedOutputStream;);
a=0;//     iget-object v0, p0, Lcom/c/a/a/a/a/a;->f:Landroid/graphics/Bitmap$CompressFormat;
a=0;// 
a=0;//     iget v4, p0, Lcom/c/a/a/a/a/a;->g:I
a=0;// 
a=0;//     invoke-virtual {p2, v0, v4, v3}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {v3}, Lcom/c/a/c/c;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     :cond_1
a=0;//     invoke-virtual {p2}, Landroid/graphics/Bitmap;->recycle()V
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);v1=(Reference,Ljava/io/File;);
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-static {v3}, Lcom/c/a/c/c;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public final a(Ljava/lang/String;Ljava/io/InputStream;Lcom/c/a/c/d;)Z
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-direct {p0, p1}, Lcom/c/a/a/a/a/a;->b(Ljava/lang/String;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     new-instance v4, Ljava/io/File;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ".tmp"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     :try_start_0
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     new-instance v5, Ljava/io/BufferedOutputStream;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/io/BufferedOutputStream;);
a=0;//     new-instance v0, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v0, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/FileOutputStream;);
a=0;//     iget v1, p0, Lcom/c/a/a/a/a/a;->e:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {v5, v0, v1}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_1
a=0;// 
a=0;//     :try_start_1
a=0;//     #v5=(Reference,Ljava/io/BufferedOutputStream;);
a=0;//     iget v0, p0, Lcom/c/a/a/a/a/a;->e:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {p2, v5, p3, v0}, Lcom/c/a/c/c;->a(Ljava/io/InputStream;Ljava/io/OutputStream;Lcom/c/a/c/d;I)Z
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     :try_start_2
a=0;//     #v1=(Boolean);
a=0;//     invoke-static {v5}, Lcom/c/a/c/c;->a(Ljava/io/Closeable;)V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_2
a=0;// 
a=0;//     invoke-static {p2}, Lcom/c/a/c/c;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {v4, v3}, Ljava/io/File;->renameTo(Ljava/io/File;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     :cond_1
a=0;//     return v1
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Integer);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_3
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v5}, Lcom/c/a/c/c;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     throw v0
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_1
a=0;// 
a=0;//     :catchall_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move v1, v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     invoke-static {p2}, Lcom/c/a/c/c;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     invoke-virtual {v4, v3}, Ljava/io/File;->renameTo(Ljava/io/File;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     :cond_3
a=0;//     throw v0
a=0;// 
a=0;//     :catchall_2
a=0;//     #v0=(Integer);v3=(Reference,Ljava/io/File;);v5=(Reference,Ljava/io/BufferedOutputStream;);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
}}
