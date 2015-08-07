package com.c.a.c; class c { void a() { int a;
a=0;// .class public final Lcom/c/a/c/c;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static a(Ljava/io/Closeable;)V
a=0;//     .locals 1
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-interface {p0}, Ljava/io/Closeable;->close()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static a(Lcom/c/a/c/d;II)Z
a=0;//     .locals 2
a=0;// 
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     invoke-interface {p0, p1, p2}, Lcom/c/a/c/d;->a(II)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     mul-int/lit8 v0, p1, 0x64
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     div-int/2addr v0, p2
a=0;// 
a=0;//     const/16 v1, 0x4b
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/io/InputStream;Ljava/io/OutputStream;Lcom/c/a/c/d;I)Z
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p0}, Ljava/io/InputStream;->available()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gtz v0, :cond_0
a=0;// 
a=0;//     const v0, 0x7d000
a=0;// 
a=0;//     :cond_0
a=0;//     new-array v3, p3, [B
a=0;// 
a=0;//     #v3=(Reference,[B);
a=0;//     invoke-static {p2, v2, v0}, Lcom/c/a/c/c;->a(Lcom/c/a/c/d;II)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Integer);v2=(Boolean);v4=(Conflicted);v5=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Boolean);v2=(Null);v4=(Uninit);v5=(Uninit);
a=0;//     move v1, v2
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Integer);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-virtual {p0, v3, v2, p3}, Ljava/io/InputStream;->read([BII)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     if-eq v4, v5, :cond_3
a=0;// 
a=0;//     invoke-virtual {p1, v3, v2, v4}, Ljava/io/OutputStream;->write([BII)V
a=0;// 
a=0;//     add-int/2addr v1, v4
a=0;// 
a=0;//     invoke-static {p2, v1, v0}, Lcom/c/a/c/c;->a(Lcom/c/a/c/d;II)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     goto :goto_0
a=0;// .end method
}}
