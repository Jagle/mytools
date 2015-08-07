package com.c.a.a.a.a.a; class i { void a() { int a;
a=0;// .class final Lcom/c/a/a/a/a/a/i;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/io/Closeable;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final a:Ljava/nio/charset/Charset;
a=0;// 
a=0;// .field private final b:Ljava/io/InputStream;
a=0;// 
a=0;// .field private c:[B
a=0;// 
a=0;// .field private d:I
a=0;// 
a=0;// .field private e:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, p2, v0}, Lcom/c/a/a/a/a/a/i;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;B)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/c/a/a/a/a/a/i;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;B)V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/c/a/a/a/a/a/i;);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     if-nez p2, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     new-instance v0, Ljava/lang/NullPointerException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/NullPointerException;);
a=0;//     invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/NullPointerException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Uninit);
a=0;//     sget-object v0, Lcom/c/a/a/a/a/a/k;->a:Ljava/nio/charset/Charset;
a=0;// 
a=0;//     #v0=(Reference,Ljava/nio/charset/Charset;);
a=0;//     invoke-virtual {p2, v0}, Ljava/nio/charset/Charset;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "Unsupported encoding"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iput-object p1, p0, Lcom/c/a/a/a/a/a/i;->b:Ljava/io/InputStream;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/c/a/a/a/a/a/i;->a:Ljava/nio/charset/Charset;
a=0;// 
a=0;//     const/16 v0, 0x2000
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     new-array v0, v0, [B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     iput-object v0, p0, Lcom/c/a/a/a/a/a/i;->c:[B
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private b()V
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iget-object v0, p0, Lcom/c/a/a/a/a/a/i;->b:Ljava/io/InputStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/InputStream;);
a=0;//     iget-object v1, p0, Lcom/c/a/a/a/a/a/i;->c:[B
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     iget-object v2, p0, Lcom/c/a/a/a/a/a/i;->c:[B
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     array-length v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v3, v2}, Ljava/io/InputStream;->read([BII)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/io/EOFException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/EOFException;);
a=0;//     invoke-direct {v0}, Ljava/io/EOFException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/EOFException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     iput v3, p0, Lcom/c/a/a/a/a/a/i;->d:I
a=0;// 
a=0;//     iput v0, p0, Lcom/c/a/a/a/a/a/i;->e:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a()Ljava/lang/String;
a=0;//     .locals 7
a=0;// 
a=0;//     const/16 v6, 0xa
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     iget-object v3, p0, Lcom/c/a/a/a/a/a/i;->b:Ljava/io/InputStream;
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/InputStream;);
a=0;//     monitor-enter v3
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/c/a/a/a/a/a/i;->c:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/io/IOException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/IOException;);
a=0;//     const-string v1, "LineReader is closed"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     throw v0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v3
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v1=(Uninit);v2=(Uninit);v4=(Uninit);v5=(Uninit);v6=(PosByte);
a=0;//     iget v0, p0, Lcom/c/a/a/a/a/a/i;->d:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Lcom/c/a/a/a/a/a/i;->e:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt v0, v1, :cond_1
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/c/a/a/a/a/a/i;->b()V
a=0;// 
a=0;//     :cond_1
a=0;//     iget v2, p0, Lcom/c/a/a/a/a/a/i;->d:I
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Integer);
a=0;//     iget v0, p0, Lcom/c/a/a/a/a/a/i;->e:I
a=0;// 
a=0;//     if-eq v2, v0, :cond_4
a=0;// 
a=0;//     iget-object v0, p0, Lcom/c/a/a/a/a/a/i;->c:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     aget-byte v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-ne v0, v6, :cond_3
a=0;// 
a=0;//     iget v0, p0, Lcom/c/a/a/a/a/a/i;->d:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eq v2, v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/c/a/a/a/a/a/i;->c:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     add-int/lit8 v1, v2, -0x1
a=0;// 
a=0;//     aget-byte v0, v0, v1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     const/16 v1, 0xd
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_2
a=0;// 
a=0;//     add-int/lit8 v0, v2, -0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Integer);
a=0;//     new-instance v0, Ljava/lang/String;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/String;);
a=0;//     iget-object v4, p0, Lcom/c/a/a/a/a/a/i;->c:[B
a=0;// 
a=0;//     #v4=(Reference,[B);
a=0;//     iget v5, p0, Lcom/c/a/a/a/a/a/i;->d:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget v6, p0, Lcom/c/a/a/a/a/a/i;->d:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     sub-int/2addr v1, v6
a=0;// 
a=0;//     iget-object v6, p0, Lcom/c/a/a/a/a/a/i;->a:Ljava/nio/charset/Charset;
a=0;// 
a=0;//     #v6=(Reference,Ljava/nio/charset/Charset;);
a=0;//     invoke-virtual {v6}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {v0, v4, v5, v1, v6}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     add-int/lit8 v1, v2, 0x1
a=0;// 
a=0;//     iput v1, p0, Lcom/c/a/a/a/a/a/i;->d:I
a=0;// 
a=0;//     monitor-exit v3
a=0;// 
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v6=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(Integer);v2=(Integer);v4=(Uninit);v5=(Uninit);v6=(PosByte);
a=0;//     move v1, v2
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Byte);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Integer);
a=0;//     new-instance v1, Lcom/c/a/a/a/a/a/j;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/c/a/a/a/a/a/j;);
a=0;//     iget v0, p0, Lcom/c/a/a/a/a/a/i;->e:I
a=0;// 
a=0;//     iget v2, p0, Lcom/c/a/a/a/a/a/i;->d:I
a=0;// 
a=0;//     sub-int/2addr v0, v2
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x50
a=0;// 
a=0;//     invoke-direct {v1, p0, v0}, Lcom/c/a/a/a/a/a/j;-><init>(Lcom/c/a/a/a/a/a/i;I)V
a=0;// 
a=0;//     :cond_5
a=0;//     #v1=(Reference,Lcom/c/a/a/a/a/a/j;);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/c/a/a/a/a/a/i;->c:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     iget v2, p0, Lcom/c/a/a/a/a/a/i;->d:I
a=0;// 
a=0;//     iget v4, p0, Lcom/c/a/a/a/a/a/i;->e:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget v5, p0, Lcom/c/a/a/a/a/a/i;->d:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     sub-int/2addr v4, v5
a=0;// 
a=0;//     invoke-virtual {v1, v0, v2, v4}, Ljava/io/ByteArrayOutputStream;->write([BII)V
a=0;// 
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Lcom/c/a/a/a/a/a/i;->e:I
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/c/a/a/a/a/a/i;->b()V
a=0;// 
a=0;//     iget v0, p0, Lcom/c/a/a/a/a/a/i;->d:I
a=0;// 
a=0;//     :goto_3
a=0;//     #v0=(Integer);
a=0;//     iget v2, p0, Lcom/c/a/a/a/a/a/i;->e:I
a=0;// 
a=0;//     if-eq v0, v2, :cond_5
a=0;// 
a=0;//     iget-object v2, p0, Lcom/c/a/a/a/a/a/i;->c:[B
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     aget-byte v2, v2, v0
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-ne v2, v6, :cond_7
a=0;// 
a=0;//     iget v2, p0, Lcom/c/a/a/a/a/a/i;->d:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-eq v0, v2, :cond_6
a=0;// 
a=0;//     iget-object v2, p0, Lcom/c/a/a/a/a/a/i;->c:[B
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     iget v4, p0, Lcom/c/a/a/a/a/a/i;->d:I
a=0;// 
a=0;//     iget v5, p0, Lcom/c/a/a/a/a/a/i;->d:I
a=0;// 
a=0;//     sub-int v5, v0, v5
a=0;// 
a=0;//     invoke-virtual {v1, v2, v4, v5}, Ljava/io/ByteArrayOutputStream;->write([BII)V
a=0;// 
a=0;//     :cond_6
a=0;//     #v2=(Conflicted);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     iput v0, p0, Lcom/c/a/a/a/a/a/i;->d:I
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     monitor-exit v3
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_7
a=0;//     #v0=(Integer);v2=(Byte);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// .method public final close()V
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v1, p0, Lcom/c/a/a/a/a/a/i;->b:Ljava/io/InputStream;
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/InputStream;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/c/a/a/a/a/a/i;->c:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/c/a/a/a/a/a/i;->c:[B
a=0;// 
a=0;//     iget-object v0, p0, Lcom/c/a/a/a/a/a/i;->b:Ljava/io/InputStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/InputStream;);
a=0;//     invoke-virtual {v0}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     :cond_0
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
}}
