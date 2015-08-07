package com.b.a.a; class f { void a() { int a;
a=0;// .class final Lcom/b/a/a/f;
a=0;// .super Lorg/apache/http/entity/HttpEntityWrapper;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field a:Ljava/io/InputStream;
a=0;// 
a=0;// .field b:Ljava/io/PushbackInputStream;
a=0;// 
a=0;// .field c:Ljava/util/zip/GZIPInputStream;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lorg/apache/http/HttpEntity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lorg/apache/http/entity/HttpEntityWrapper;-><init>(Lorg/apache/http/HttpEntity;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/b/a/a/f;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final consumeContent()V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/b/a/a/f;->a:Ljava/io/InputStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/InputStream;);
a=0;//     invoke-static {v0}, Lcom/b/a/a/b;->a(Ljava/io/InputStream;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/b/a/a/f;->b:Ljava/io/PushbackInputStream;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/b/a/a/b;->a(Ljava/io/InputStream;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/b/a/a/f;->c:Ljava/util/zip/GZIPInputStream;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/b/a/a/b;->a(Ljava/io/InputStream;)V
a=0;// 
a=0;//     invoke-super {p0}, Lorg/apache/http/entity/HttpEntityWrapper;->consumeContent()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final getContent()Ljava/io/InputStream;
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v6, 0x2
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     iget-object v2, p0, Lcom/b/a/a/f;->wrappedEntity:Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     #v2=(Reference,Lorg/apache/http/HttpEntity;);
a=0;//     invoke-interface {v2}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, p0, Lcom/b/a/a/f;->a:Ljava/io/InputStream;
a=0;// 
a=0;//     new-instance v2, Ljava/io/PushbackInputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/PushbackInputStream;);
a=0;//     iget-object v3, p0, Lcom/b/a/a/f;->a:Ljava/io/InputStream;
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/InputStream;);
a=0;//     invoke-direct {v2, v3, v6}, Ljava/io/PushbackInputStream;-><init>(Ljava/io/InputStream;I)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/PushbackInputStream;);
a=0;//     iput-object v2, p0, Lcom/b/a/a/f;->b:Ljava/io/PushbackInputStream;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/b/a/a/f;->b:Ljava/io/PushbackInputStream;
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     new-array v3, v6, [B
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/io/PushbackInputStream;->read([B)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v2, v3}, Ljava/io/PushbackInputStream;->unread([B)V
a=0;// 
a=0;//     aget-byte v2, v3, v1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     and-int/lit16 v2, v2, 0xff
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     aget-byte v3, v3, v0
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     shl-int/lit8 v3, v3, 0x8
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const v5, 0xff00
a=0;// 
a=0;//     #v5=(Char);
a=0;//     and-int/2addr v3, v5
a=0;// 
a=0;//     or-int/2addr v2, v3
a=0;// 
a=0;//     if-ne v4, v6, :cond_0
a=0;// 
a=0;//     const v3, 0x8b1f
a=0;// 
a=0;//     #v3=(Char);
a=0;//     if-ne v3, v2, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     new-instance v0, Ljava/util/zip/GZIPInputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/zip/GZIPInputStream;);
a=0;//     iget-object v1, p0, Lcom/b/a/a/f;->b:Ljava/io/PushbackInputStream;
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/PushbackInputStream;);
a=0;//     invoke-direct {v0, v1}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/zip/GZIPInputStream;);
a=0;//     iput-object v0, p0, Lcom/b/a/a/f;->c:Ljava/util/zip/GZIPInputStream;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/b/a/a/f;->c:Ljava/util/zip/GZIPInputStream;
a=0;// 
a=0;//     :goto_1
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(One);v1=(Null);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Lcom/b/a/a/f;->b:Ljava/io/PushbackInputStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/PushbackInputStream;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public final getContentLength()J
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/b/a/a/f;->wrappedEntity:Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/HttpEntity;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lorg/apache/http/HttpEntity;);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/b/a/a/f;->wrappedEntity:Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/HttpEntity;->getContentLength()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     goto :goto_0
a=0;// .end method
}}
