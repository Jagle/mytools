package com.wukongtv.a; class b { void a() { int a;
a=0;// .class public final Lcom/wukongtv/a/b;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public a:I
a=0;// 
a=0;// .field public b:I
a=0;// 
a=0;// .field public c:I
a=0;// 
a=0;// .field public d:I
a=0;// 
a=0;// .field public e:I
a=0;// 
a=0;// .field public f:I
a=0;// 
a=0;// .field public g:[B
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/a/b;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/io/InputStream;)Lcom/wukongtv/a/b;
a=0;//     .locals 7
a=0;// 
a=0;//     const/16 v6, 0x18
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-instance v2, Lcom/wukongtv/a/b;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/wukongtv/a/b;);
a=0;//     invoke-direct {v2}, Lcom/wukongtv/a/b;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Lcom/wukongtv/a/b;);
a=0;//     invoke-static {v6}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/nio/ByteBuffer;);
a=0;//     sget-object v3, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;
a=0;// 
a=0;//     #v3=(Reference,Ljava/nio/ByteOrder;);
a=0;//     invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-virtual {v3}, Ljava/nio/ByteBuffer;->array()[B
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,[B);
a=0;//     rsub-int/lit8 v5, v0, 0x18
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p0, v4, v0, v5}, Ljava/io/InputStream;->read([BII)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-gez v4, :cond_1
a=0;// 
a=0;//     new-instance v0, Ljava/io/IOException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/IOException;);
a=0;//     const-string v1, "Stream closed"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Null);
a=0;//     add-int/2addr v0, v4
a=0;// 
a=0;//     if-lt v0, v6, :cond_0
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/nio/ByteBuffer;->getInt()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iput v0, v2, Lcom/wukongtv/a/b;->a:I
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/nio/ByteBuffer;->getInt()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iput v0, v2, Lcom/wukongtv/a/b;->b:I
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/nio/ByteBuffer;->getInt()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iput v0, v2, Lcom/wukongtv/a/b;->c:I
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/nio/ByteBuffer;->getInt()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iput v0, v2, Lcom/wukongtv/a/b;->d:I
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/nio/ByteBuffer;->getInt()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iput v0, v2, Lcom/wukongtv/a/b;->e:I
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/nio/ByteBuffer;->getInt()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iput v0, v2, Lcom/wukongtv/a/b;->f:I
a=0;// 
a=0;//     iget v0, v2, Lcom/wukongtv/a/b;->d:I
a=0;// 
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     iget v0, v2, Lcom/wukongtv/a/b;->d:I
a=0;// 
a=0;//     new-array v0, v0, [B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     iput-object v0, v2, Lcom/wukongtv/a/b;->g:[B
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Integer);v3=(Conflicted);
a=0;//     iget-object v0, v2, Lcom/wukongtv/a/b;->g:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     iget v3, v2, Lcom/wukongtv/a/b;->d:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-int/2addr v3, v1
a=0;// 
a=0;//     invoke-virtual {p0, v0, v1, v3}, Ljava/io/InputStream;->read([BII)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gez v0, :cond_3
a=0;// 
a=0;//     new-instance v0, Ljava/io/IOException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/IOException;);
a=0;//     const-string v1, "Stream closed"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     add-int/2addr v1, v0
a=0;// 
a=0;//     iget v0, v2, Lcom/wukongtv/a/b;->d:I
a=0;// 
a=0;//     if-lt v1, v0, :cond_2
a=0;// 
a=0;//     :cond_4
a=0;//     #v3=(Conflicted);
a=0;//     return-object v2
a=0;// .end method
}}
