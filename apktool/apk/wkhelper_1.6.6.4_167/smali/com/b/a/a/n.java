package com.b.a.a; class n { void a() { int a;
a=0;// .class public abstract Lcom/b/a/a/n;
a=0;// .super Lcom/b/a/a/h;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static final synthetic e:Z
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected final c:Ljava/io/File;
a=0;// 
a=0;// .field protected final d:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     const-class v0, Lcom/b/a/a/n;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     sput-boolean v0, Lcom/b/a/a/n;->e:Z
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/io/File;)V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0}, Lcom/b/a/a/n;-><init>(Ljava/io/File;B)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/b/a/a/n;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Ljava/io/File;B)V
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Lcom/b/a/a/h;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/b/a/a/n;);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     const-string v2, "File passed into FileAsyncHttpResponseHandler constructor must not be null"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v2}, Lcom/b/a/a/a;->a(ZLjava/lang/String;)V
a=0;// 
a=0;//     iput-object p1, p0, Lcom/b/a/a/n;->c:Ljava/io/File;
a=0;// 
a=0;//     iput-boolean v1, p0, Lcom/b/a/a/n;->d:Z
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v2=(Uninit);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private i()Ljava/io/File;
a=0;//     .locals 1
a=0;// 
a=0;//     sget-boolean v0, Lcom/b/a/a/n;->e:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/b/a/a/n;->c:Ljava/io/File;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/AssertionError;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/AssertionError;);
a=0;//     invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/AssertionError;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/b/a/a/n;->c:Ljava/io/File;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(I[Lorg/apache/http/Header;[B)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/b/a/a/n;->i()Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/b/a/a/n;->h()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final a(I[Lorg/apache/http/Header;[BLjava/lang/Throwable;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/b/a/a/n;->i()Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/b/a/a/n;->g()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected final a(Lorg/apache/http/HttpEntity;)[B
a=0;//     .locals 8
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     invoke-interface {p1}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/InputStream;);
a=0;//     invoke-interface {p1}, Lorg/apache/http/HttpEntity;->getContentLength()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     new-instance v4, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {p0}, Lcom/b/a/a/n;->i()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/io/File;);
a=0;//     iget-boolean v6, p0, Lcom/b/a/a/n;->d:Z
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     invoke-direct {v4, v5, v6}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/FileOutputStream;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     const/16 v5, 0x1000
a=0;// 
a=0;//     :try_start_0
a=0;//     #v5=(PosShort);
a=0;//     new-array v5, v5, [B
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v5=(Reference,[B);v6=(Integer);v7=(Conflicted);
a=0;//     invoke-virtual {v1, v5}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     const/4 v7, -0x1
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     if-eq v6, v7, :cond_0
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v7}, Ljava/lang/Thread;->isInterrupted()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_0
a=0;// 
a=0;//     add-int/2addr v0, v6
a=0;// 
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v4, v5, v7, v6}, Ljava/io/FileOutputStream;->write([BII)V
a=0;// 
a=0;//     long-to-int v6, v2
a=0;// 
a=0;//     invoke-virtual {p0, v0, v6}, Lcom/b/a/a/n;->b(II)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v5=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v1}, Lcom/b/a/a/b;->a(Ljava/io/InputStream;)V
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/io/FileOutputStream;->flush()V
a=0;// 
a=0;//     invoke-static {v4}, Lcom/b/a/a/b;->a(Ljava/io/OutputStream;)V
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);v5=(Reference,[B);v7=(Byte);
a=0;//     invoke-static {v1}, Lcom/b/a/a/b;->a(Ljava/io/InputStream;)V
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/io/FileOutputStream;->flush()V
a=0;// 
a=0;//     invoke-static {v4}, Lcom/b/a/a/b;->a(Ljava/io/OutputStream;)V
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public abstract g()V
a=0;// .end method
a=0;// 
a=0;// .method public abstract h()V
a=0;// .end method
}}
