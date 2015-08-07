package com.b.a.a; class ae { void a() { int a;
a=0;// .class final Lcom/b/a/a/ae;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Lorg/apache/http/HttpEntity;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static final a:[B
a=0;// 
a=0;// .field static final b:[B
a=0;// 
a=0;// .field private static final g:[C
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final c:[B
a=0;// 
a=0;// .field d:Z
a=0;// 
a=0;// .field final e:Ljava/util/List;
a=0;// 
a=0;// .field final f:Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;// .field private final h:Ljava/lang/String;
a=0;// 
a=0;// .field private final i:[B
a=0;// 
a=0;// .field private final j:Lcom/b/a/a/ac;
a=0;// 
a=0;// .field private k:I
a=0;// 
a=0;// .field private l:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     const-string v0, "\r\n"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/b/a/a/ae;->a:[B
a=0;// 
a=0;//     const-string v0, "Content-Transfer-Encoding: binary\r\n"
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/b/a/a/ae;->b:[B
a=0;// 
a=0;//     const-string v0, "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/b/a/a/ae;->g:[C
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Lcom/b/a/a/ac;)V
a=0;//     .locals 5
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/b/a/a/ae;);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/b/a/a/ae;->e:Ljava/util/List;
a=0;// 
a=0;//     new-instance v0, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     iput-object v0, p0, Lcom/b/a/a/ae;->f:Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     new-instance v2, Ljava/util/Random;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/Random;);
a=0;//     invoke-direct {v2}, Ljava/util/Random;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Random;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     const/16 v3, 0x1e
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-ge v0, v3, :cond_0
a=0;// 
a=0;//     sget-object v3, Lcom/b/a/a/ae;->g:[C
a=0;// 
a=0;//     #v3=(Reference,[C);
a=0;//     sget-object v4, Lcom/b/a/a/ae;->g:[C
a=0;// 
a=0;//     #v4=(Reference,[C);
a=0;//     array-length v4, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v2, v4}, Ljava/util/Random;->nextInt(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     aget-char v3, v3, v4
a=0;// 
a=0;//     #v3=(Char);
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v3=(PosByte);v4=(Conflicted);
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/b/a/a/ae;->h:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "--"
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v1, p0, Lcom/b/a/a/ae;->h:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "\r\n"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/b/a/a/ae;->c:[B
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "--"
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v1, p0, Lcom/b/a/a/ae;->h:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "--\r\n"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/b/a/a/ae;->i:[B
a=0;// 
a=0;//     iput-object p1, p0, Lcom/b/a/a/ae;->j:Lcom/b/a/a/ac;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static a(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 0
a=0;// 
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     const-string p0, "application/octet-stream"
a=0;// 
a=0;//     :cond_0
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method private a(I)V
a=0;//     .locals 3
a=0;// 
a=0;//     iget v0, p0, Lcom/b/a/a/ae;->k:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/2addr v0, p1
a=0;// 
a=0;//     iput v0, p0, Lcom/b/a/a/ae;->k:I
a=0;// 
a=0;//     iget-object v0, p0, Lcom/b/a/a/ae;->j:Lcom/b/a/a/ac;
a=0;// 
a=0;//     #v0=(Reference,Lcom/b/a/a/ac;);
a=0;//     iget v1, p0, Lcom/b/a/a/ae;->k:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, p0, Lcom/b/a/a/ae;->l:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-interface {v0, v1, v2}, Lcom/b/a/a/ac;->b(II)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a()[B
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lcom/b/a/a/ae;->b:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/b/a/a/ae;)[B
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/b/a/a/ae;->c:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static a(Ljava/lang/String;Ljava/lang/String;)[B
a=0;//     .locals 2
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "Content-Disposition: form-data; name=\""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "\"; filename=\""
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "\"\r\n"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b()[B
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lcom/b/a/a/ae;->a:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static b(Ljava/lang/String;)[B
a=0;//     .locals 2
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "Content-Type: "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p0}, Lcom/b/a/a/ae;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "\r\n"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Ljava/lang/String;Ljava/lang/String;)[B
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-static {p0, p1}, Lcom/b/a/a/ae;->a(Ljava/lang/String;Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic c(Ljava/lang/String;)[B
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-static {p0}, Lcom/b/a/a/ae;->b(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 4
a=0;// 
a=0;//     if-nez p3, :cond_0
a=0;// 
a=0;//     const-string p3, "UTF-8"
a=0;// 
a=0;//     :cond_0
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "text/plain; charset="
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/b/a/a/ae;->f:Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/b/a/a/ae;->c:[B
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     invoke-virtual {v1, v2}, Ljava/io/ByteArrayOutputStream;->write([B)V
a=0;// 
a=0;//     iget-object v1, p0, Lcom/b/a/a/ae;->f:Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Content-Disposition: form-data; name=\""
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "\"\r\n"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/io/ByteArrayOutputStream;->write([B)V
a=0;// 
a=0;//     iget-object v1, p0, Lcom/b/a/a/ae;->f:Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/b/a/a/ae;->b(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/io/ByteArrayOutputStream;->write([B)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/b/a/a/ae;->f:Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     sget-object v1, Lcom/b/a/a/ae;->a:[B
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write([B)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/b/a/a/ae;->f:Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     invoke-virtual {p2}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write([B)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/b/a/a/ae;->f:Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     sget-object v1, Lcom/b/a/a/ae;->a:[B
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write([B)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     const-string v1, "SimpleMultipartEntity"
a=0;// 
a=0;//     const-string v2, "addPart ByteArrayOutputStream exception"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final consumeContent()V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/b/a/a/ae;->isStreaming()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     const-string v1, "Streaming entity does not implement #consumeContent()"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final getContent()Ljava/io/InputStream;
a=0;//     .locals 2
a=0;// 
a=0;//     new-instance v0, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     const-string v1, "getContent() is not supported. Use writeTo() instead."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public final getContentEncoding()Lorg/apache/http/Header;
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final getContentLength()J
a=0;//     .locals 10
a=0;// 
a=0;//     iget-object v0, p0, Lcom/b/a/a/ae;->f:Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iget-object v2, p0, Lcom/b/a/a/ae;->e:Ljava/util/List;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/Iterator;);
a=0;//     move-wide v2, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(LongLo);v3=(LongHi);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/b/a/a/af;
a=0;// 
a=0;//     iget-object v1, v0, Lcom/b/a/a/af;->a:Ljava/io/File;
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v6
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     sget-object v1, Lcom/b/a/a/ae;->a:[B
a=0;// 
a=0;//     array-length v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-long v8, v1
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     add-long/2addr v6, v8
a=0;// 
a=0;//     iget-object v0, v0, Lcom/b/a/a/af;->b:[B
a=0;// 
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     add-long/2addr v0, v6
a=0;// 
a=0;//     const-wide/16 v6, 0x0
a=0;// 
a=0;//     cmp-long v5, v0, v6
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     if-gez v5, :cond_0
a=0;// 
a=0;//     const-wide/16 v0, -0x1
a=0;// 
a=0;//     :goto_1
a=0;//     #v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     return-wide v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v5=(Byte);v6=(LongLo);v7=(LongHi);v8=(LongLo);v9=(LongHi);
a=0;//     add-long/2addr v0, v2
a=0;// 
a=0;//     move-wide v2, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/b/a/a/ae;->i:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     add-long/2addr v0, v2
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public final getContentType()Lorg/apache/http/Header;
a=0;//     .locals 4
a=0;// 
a=0;//     new-instance v0, Lorg/apache/http/message/BasicHeader;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/apache/http/message/BasicHeader;);
a=0;//     const-string v1, "Content-Type"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "multipart/form-data; boundary="
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v3, p0, Lcom/b/a/a/ae;->h:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicHeader;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/message/BasicHeader;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final isChunked()Z
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public final isRepeatable()Z
a=0;//     .locals 1
a=0;// 
a=0;//     iget-boolean v0, p0, Lcom/b/a/a/ae;->d:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public final isStreaming()Z
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public final writeTo(Ljava/io/OutputStream;)V
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     iput v6, p0, Lcom/b/a/a/ae;->k:I
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/b/a/a/ae;->getContentLength()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     long-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/b/a/a/ae;->l:I
a=0;// 
a=0;//     iget-object v0, p0, Lcom/b/a/a/ae;->f:Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-virtual {v0, p1}, Ljava/io/ByteArrayOutputStream;->writeTo(Ljava/io/OutputStream;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/b/a/a/ae;->f:Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0, v0}, Lcom/b/a/a/ae;->a(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/b/a/a/ae;->e:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/util/Iterator;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/b/a/a/af;
a=0;// 
a=0;//     iget-object v2, v0, Lcom/b/a/a/af;->b:[B
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     invoke-virtual {p1, v2}, Ljava/io/OutputStream;->write([B)V
a=0;// 
a=0;//     iget-object v2, v0, Lcom/b/a/a/af;->c:Lcom/b/a/a/ae;
a=0;// 
a=0;//     iget-object v3, v0, Lcom/b/a/a/af;->b:[B
a=0;// 
a=0;//     #v3=(Reference,[B);
a=0;//     array-length v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-direct {v2, v3}, Lcom/b/a/a/ae;->a(I)V
a=0;// 
a=0;//     new-instance v2, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     iget-object v3, v0, Lcom/b/a/a/af;->a:Ljava/io/File;
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     invoke-direct {v2, v3}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/FileInputStream;);
a=0;//     const/16 v3, 0x1000
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     new-array v3, v3, [B
a=0;// 
a=0;//     :goto_1
a=0;//     #v3=(Reference,[B);
a=0;//     invoke-virtual {v2, v3}, Ljava/io/FileInputStream;->read([B)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     if-eq v4, v5, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1, v3, v6, v4}, Ljava/io/OutputStream;->write([BII)V
a=0;// 
a=0;//     iget-object v5, v0, Lcom/b/a/a/af;->c:Lcom/b/a/a/ae;
a=0;// 
a=0;//     #v5=(Reference,Lcom/b/a/a/ae;);
a=0;//     invoke-direct {v5, v4}, Lcom/b/a/a/ae;->a(I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v5=(Byte);
a=0;//     sget-object v3, Lcom/b/a/a/ae;->a:[B
a=0;// 
a=0;//     invoke-virtual {p1, v3}, Ljava/io/OutputStream;->write([B)V
a=0;// 
a=0;//     iget-object v0, v0, Lcom/b/a/a/af;->c:Lcom/b/a/a/ae;
a=0;// 
a=0;//     sget-object v3, Lcom/b/a/a/ae;->a:[B
a=0;// 
a=0;//     array-length v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-direct {v0, v3}, Lcom/b/a/a/ae;->a(I)V
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V
a=0;// 
a=0;//     invoke-static {v2}, Lcom/b/a/a/b;->a(Ljava/io/InputStream;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/b/a/a/ae;->i:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/b/a/a/ae;->i:[B
a=0;// 
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0, v0}, Lcom/b/a/a/ae;->a(I)V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
