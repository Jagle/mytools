package com.c.a.a.a.a.a; class j { void a() { int a;
a=0;// .class final Lcom/c/a/a/a/a/a/j;
a=0;// .super Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/c/a/a/a/a/a/i;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/c/a/a/a/a/a/i;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/c/a/a/a/a/a/j;->a:Lcom/c/a/a/a/a/a/i;
a=0;// 
a=0;//     invoke-direct {p0, p2}, Ljava/io/ByteArrayOutputStream;-><init>(I)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/c/a/a/a/a/a/j;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final toString()Ljava/lang/String;
a=0;//     .locals 5
a=0;// 
a=0;//     iget v0, p0, Lcom/c/a/a/a/a/a/j;->count:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/c/a/a/a/a/a/j;->buf:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     iget v1, p0, Lcom/c/a/a/a/a/a/j;->count:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     aget-byte v0, v0, v1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     const/16 v1, 0xd
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     iget v0, p0, Lcom/c/a/a/a/a/a/j;->count:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     :goto_0
a=0;//     :try_start_0
a=0;//     #v1=(Conflicted);
a=0;//     new-instance v1, Ljava/lang/String;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/c/a/a/a/a/a/j;->buf:[B
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iget-object v4, p0, Lcom/c/a/a/a/a/a/j;->a:Lcom/c/a/a/a/a/a/i;
a=0;// 
a=0;//     #v4=(Reference,Lcom/c/a/a/a/a/a/i;);
a=0;//     iget-object v4, v4, Lcom/c/a/a/a/a/a/i;->a:Ljava/nio/charset/Charset;
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v1, v2, v3, v0, v4}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     return-object v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     iget v0, p0, Lcom/c/a/a/a/a/a/j;->count:I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/UnsupportedEncodingException;);
a=0;//     new-instance v1, Ljava/lang/AssertionError;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/AssertionError;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/AssertionError;);
a=0;//     throw v1
a=0;// .end method
}}
