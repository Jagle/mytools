package com.c.a.b.a; class d { void a() { int a;
a=0;// .class public final Lcom/c/a/b/a/d;
a=0;// .super Ljava/io/FilterInputStream;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Ljava/io/InputStream;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/c/a/b/a/d;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final skip(J)J
a=0;//     .locals 9
a=0;// 
a=0;//     const-wide/16 v4, 0x0
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     move-wide v2, v4
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(LongLo);v3=(LongHi);v6=(Conflicted);v7=(Conflicted);
a=0;//     cmp-long v0, v2, p1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/c/a/b/a/d;->in:Ljava/io/InputStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/InputStream;);
a=0;//     sub-long v6, p1, v2
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     invoke-virtual {v0, v6, v7}, Ljava/io/InputStream;->skip(J)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     cmp-long v6, v0, v4
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-nez v6, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/c/a/b/a/d;->read()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ltz v0, :cond_1
a=0;// 
a=0;//     const-wide/16 v0, 0x1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(LongLo);
a=0;//     add-long/2addr v0, v2
a=0;// 
a=0;//     move-wide v2, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-wide v2
a=0;// .end method
}}
