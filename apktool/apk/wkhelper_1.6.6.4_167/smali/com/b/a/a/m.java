package com.b.a.a; class m { void a() { int a;
a=0;// .class public final Lcom/b/a/a/m;
a=0;// .super Ljava/io/FilterOutputStream;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static e:[B
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final a:Lcom/b/a/a/k;
a=0;// 
a=0;// .field private final b:I
a=0;// 
a=0;// .field private c:[B
a=0;// 
a=0;// .field private d:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     new-array v0, v0, [B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     sput-object v0, Lcom/b/a/a/m;->e:[B
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/io/OutputStream;)V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0}, Lcom/b/a/a/m;-><init>(Ljava/io/OutputStream;B)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/b/a/a/m;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Ljava/io/OutputStream;B)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0, p1}, Ljava/io/FilterOutputStream;-><init>(Ljava/io/OutputStream;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/b/a/a/m;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/b/a/a/m;->c:[B
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     iput v0, p0, Lcom/b/a/a/m;->d:I
a=0;// 
a=0;//     const/16 v0, 0x12
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Lcom/b/a/a/m;->b:I
a=0;// 
a=0;//     new-instance v0, Lcom/b/a/a/l;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/b/a/a/l;);
a=0;//     invoke-direct {v0}, Lcom/b/a/a/l;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/b/a/a/l;);
a=0;//     iput-object v0, p0, Lcom/b/a/a/m;->a:Lcom/b/a/a/k;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a()V
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iget v0, p0, Lcom/b/a/a/m;->d:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/b/a/a/m;->c:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     iget v1, p0, Lcom/b/a/a/m;->d:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {p0, v0, v2, v1, v2}, Lcom/b/a/a/m;->a([BIIZ)V
a=0;// 
a=0;//     iput v2, p0, Lcom/b/a/a/m;->d:I
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a([BIIZ)V
a=0;//     .locals 4
a=0;// 
a=0;//     iget-object v1, p0, Lcom/b/a/a/m;->a:Lcom/b/a/a/k;
a=0;// 
a=0;//     #v1=(Reference,Lcom/b/a/a/k;);
a=0;//     iget-object v0, p0, Lcom/b/a/a/m;->a:Lcom/b/a/a/k;
a=0;// 
a=0;//     #v0=(Reference,Lcom/b/a/a/k;);
a=0;//     iget-object v0, v0, Lcom/b/a/a/k;->a:[B
a=0;// 
a=0;//     iget-object v2, p0, Lcom/b/a/a/m;->a:Lcom/b/a/a/k;
a=0;// 
a=0;//     #v2=(Reference,Lcom/b/a/a/k;);
a=0;//     invoke-virtual {v2, p3}, Lcom/b/a/a/k;->a(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     array-length v3, v0
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ge v3, v2, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     new-array v0, v2, [B
a=0;// 
a=0;//     :cond_1
a=0;//     iput-object v0, v1, Lcom/b/a/a/k;->a:[B
a=0;// 
a=0;//     iget-object v0, p0, Lcom/b/a/a/m;->a:Lcom/b/a/a/k;
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2, p3, p4}, Lcom/b/a/a/k;->a([BIIZ)Z
a=0;// 
a=0;//     iget-object v0, p0, Lcom/b/a/a/m;->out:Ljava/io/OutputStream;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/b/a/a/m;->a:Lcom/b/a/a/k;
a=0;// 
a=0;//     iget-object v1, v1, Lcom/b/a/a/k;->a:[B
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iget-object v3, p0, Lcom/b/a/a/m;->a:Lcom/b/a/a/k;
a=0;// 
a=0;//     #v3=(Reference,Lcom/b/a/a/k;);
a=0;//     iget v3, v3, Lcom/b/a/a/k;->b:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Ljava/io/OutputStream;->write([BII)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final close()V
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Lcom/b/a/a/m;->a()V
a=0;// 
a=0;//     sget-object v0, Lcom/b/a/a/m;->e:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-direct {p0, v0, v2, v3, v4}, Lcom/b/a/a/m;->a([BIIZ)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     :try_start_1
a=0;//     #v1=(Reference,Ljava/io/IOException;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget v0, p0, Lcom/b/a/a/m;->b:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit8 v0, v0, 0x10
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/b/a/a/m;->out:Ljava/io/OutputStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/OutputStream;);
a=0;//     invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_2
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/b/a/a/m;->out:Ljava/io/OutputStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/OutputStream;);
a=0;//     invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final write(I)V
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iget-object v0, p0, Lcom/b/a/a/m;->c:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/16 v0, 0x400
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     new-array v0, v0, [B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     iput-object v0, p0, Lcom/b/a/a/m;->c:[B
a=0;// 
a=0;//     :cond_0
a=0;//     iget v0, p0, Lcom/b/a/a/m;->d:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/b/a/a/m;->c:[B
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     array-length v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt v0, v1, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/b/a/a/m;->c:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     iget v1, p0, Lcom/b/a/a/m;->d:I
a=0;// 
a=0;//     invoke-direct {p0, v0, v2, v1, v2}, Lcom/b/a/a/m;->a([BIIZ)V
a=0;// 
a=0;//     iput v2, p0, Lcom/b/a/a/m;->d:I
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/b/a/a/m;->c:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     iget v1, p0, Lcom/b/a/a/m;->d:I
a=0;// 
a=0;//     add-int/lit8 v2, v1, 0x1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, p0, Lcom/b/a/a/m;->d:I
a=0;// 
a=0;//     int-to-byte v2, p1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     aput-byte v2, v0, v1
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final write([BII)V
a=0;//     .locals 1
a=0;// 
a=0;//     if-gtz p3, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     invoke-direct {p0}, Lcom/b/a/a/m;->a()V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, p2, p3, v0}, Lcom/b/a/a/m;->a([BIIZ)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
