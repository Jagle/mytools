package com.b.a.a; class v { void a() { int a;
a=0;// .class public final Lcom/b/a/a/v;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Lorg/apache/http/HttpEntity;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final a:Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;// .field private static final c:Ljava/lang/StringBuilder;
a=0;// 
a=0;// .field private static final d:[B
a=0;// 
a=0;// .field private static final e:[B
a=0;// 
a=0;// .field private static final f:[B
a=0;// 
a=0;// .field private static final g:[B
a=0;// 
a=0;// .field private static final h:[B
a=0;// 
a=0;// .field private static final i:[B
a=0;// 
a=0;// .field private static final j:[B
a=0;// 
a=0;// .field private static final k:Lorg/apache/http/Header;
a=0;// 
a=0;// .field private static final l:Lorg/apache/http/Header;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final b:[B
a=0;// 
a=0;// .field private final m:Ljava/util/Map;
a=0;// 
a=0;// .field private final n:Lorg/apache/http/Header;
a=0;// 
a=0;// .field private final o:Lcom/b/a/a/ac;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 3
a=0;// 
a=0;//     new-instance v0, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     const-string v1, "Unsupported operation in this implementation."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     sput-object v0, Lcom/b/a/a/v;->a:Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const/16 v1, 0x80
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sput-object v0, Lcom/b/a/a/v;->c:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v0, "true"
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/b/a/a/v;->d:[B
a=0;// 
a=0;//     const-string v0, "false"
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/b/a/a/v;->e:[B
a=0;// 
a=0;//     const-string v0, "null"
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/b/a/a/v;->f:[B
a=0;// 
a=0;//     const-string v0, "name"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/b/a/a/v;->a(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/b/a/a/v;->g:[B
a=0;// 
a=0;//     const-string v0, "type"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/b/a/a/v;->a(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/b/a/a/v;->h:[B
a=0;// 
a=0;//     const-string v0, "contents"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/b/a/a/v;->a(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/b/a/a/v;->i:[B
a=0;// 
a=0;//     const-string v0, "_elapsed"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/b/a/a/v;->a(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/b/a/a/v;->j:[B
a=0;// 
a=0;//     new-instance v0, Lorg/apache/http/message/BasicHeader;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/apache/http/message/BasicHeader;);
a=0;//     const-string v1, "Content-Type"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "application/json"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicHeader;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/message/BasicHeader;);
a=0;//     sput-object v0, Lcom/b/a/a/v;->k:Lorg/apache/http/Header;
a=0;// 
a=0;//     new-instance v0, Lorg/apache/http/message/BasicHeader;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/apache/http/message/BasicHeader;);
a=0;//     const-string v1, "Content-Encoding"
a=0;// 
a=0;//     const-string v2, "gzip"
a=0;// 
a=0;//     invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicHeader;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/message/BasicHeader;);
a=0;//     sput-object v0, Lcom/b/a/a/v;->l:Lorg/apache/http/Header;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Lcom/b/a/a/ac;Z)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/b/a/a/v;);
a=0;//     const/16 v0, 0x1000
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     new-array v0, v0, [B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     iput-object v0, p0, Lcom/b/a/a/v;->b:[B
a=0;// 
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v0, p0, Lcom/b/a/a/v;->m:Ljava/util/Map;
a=0;// 
a=0;//     iput-object p1, p0, Lcom/b/a/a/v;->o:Lcom/b/a/a/ac;
a=0;// 
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     sget-object v0, Lcom/b/a/a/v;->l:Lorg/apache/http/Header;
a=0;// 
a=0;//     :goto_0
a=0;//     iput-object v0, p0, Lcom/b/a/a/v;->n:Lorg/apache/http/Header;
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
a=0;// .method private a(Ljava/io/OutputStream;Lcom/b/a/a/aa;)V
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget-object v0, p2, Lcom/b/a/a/aa;->a:Ljava/io/File;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v2, p2, Lcom/b/a/a/aa;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1, v0, v2}, Lcom/b/a/a/v;->a(Ljava/io/OutputStream;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p2, Lcom/b/a/a/aa;->a:Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     long-to-int v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     new-instance v3, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     iget-object v0, p2, Lcom/b/a/a/aa;->a:Ljava/io/File;
a=0;// 
a=0;//     invoke-direct {v3, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/FileInputStream;);
a=0;//     new-instance v4, Lcom/b/a/a/m;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/b/a/a/m;);
a=0;//     invoke-direct {v4, p1}, Lcom/b/a/a/m;-><init>(Ljava/io/OutputStream;)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/b/a/a/m;);
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v5=(Conflicted);v6=(Conflicted);
a=0;//     iget-object v5, p0, Lcom/b/a/a/v;->b:[B
a=0;// 
a=0;//     #v5=(Reference,[B);
a=0;//     invoke-virtual {v3, v5}, Ljava/io/FileInputStream;->read([B)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/4 v6, -0x1
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-eq v5, v6, :cond_0
a=0;// 
a=0;//     iget-object v6, p0, Lcom/b/a/a/v;->b:[B
a=0;// 
a=0;//     #v6=(Reference,[B);
a=0;//     invoke-virtual {v4, v6, v1, v5}, Lcom/b/a/a/m;->write([BII)V
a=0;// 
a=0;//     add-int/2addr v0, v5
a=0;// 
a=0;//     iget-object v5, p0, Lcom/b/a/a/v;->o:Lcom/b/a/a/ac;
a=0;// 
a=0;//     #v5=(Reference,Lcom/b/a/a/ac;);
a=0;//     invoke-interface {v5, v0, v2}, Lcom/b/a/a/ac;->b(II)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v5=(Integer);v6=(Byte);
a=0;//     invoke-static {v4}, Lcom/b/a/a/b;->a(Ljava/io/OutputStream;)V
a=0;// 
a=0;//     const/16 v0, 0x22
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     invoke-static {v3}, Lcom/b/a/a/b;->a(Ljava/io/InputStream;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/io/OutputStream;Lcom/b/a/a/ab;)V
a=0;//     .locals 4
a=0;// 
a=0;//     iget-object v0, p2, Lcom/b/a/a/ab;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p2, Lcom/b/a/a/ab;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1, v0, v1}, Lcom/b/a/a/v;->a(Ljava/io/OutputStream;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     new-instance v0, Lcom/b/a/a/m;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/b/a/a/m;);
a=0;//     invoke-direct {v0, p1}, Lcom/b/a/a/m;-><init>(Ljava/io/OutputStream;)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/b/a/a/m;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v1, p2, Lcom/b/a/a/ab;->a:Ljava/io/InputStream;
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/InputStream;);
a=0;//     iget-object v2, p0, Lcom/b/a/a/v;->b:[B
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     invoke-virtual {v1, v2}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-eq v1, v2, :cond_0
a=0;// 
a=0;//     iget-object v2, p0, Lcom/b/a/a/v;->b:[B
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v0, v2, v3, v1}, Lcom/b/a/a/m;->write([BII)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Byte);v3=(Conflicted);
a=0;//     invoke-static {v0}, Lcom/b/a/a/b;->a(Ljava/io/OutputStream;)V
a=0;// 
a=0;//     const/16 v0, 0x22
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     iget-boolean v0, p2, Lcom/b/a/a/ab;->d:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p2, Lcom/b/a/a/ab;->a:Ljava/io/InputStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/InputStream;);
a=0;//     invoke-static {v0}, Lcom/b/a/a/b;->a(Ljava/io/InputStream;)V
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static a(Ljava/io/OutputStream;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 3
a=0;// 
a=0;//     const/16 v2, 0x2c
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const/16 v1, 0x3a
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     sget-object v0, Lcom/b/a/a/v;->g:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write([B)V
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     invoke-static {p1}, Lcom/b/a/a/v;->a(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write([B)V
a=0;// 
a=0;//     invoke-virtual {p0, v2}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     sget-object v0, Lcom/b/a/a/v;->h:[B
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write([B)V
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     invoke-static {p2}, Lcom/b/a/a/v;->a(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write([B)V
a=0;// 
a=0;//     invoke-virtual {p0, v2}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     sget-object v0, Lcom/b/a/a/v;->i:[B
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write([B)V
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     const/16 v0, 0x22
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static a(Ljava/lang/String;)[B
a=0;//     .locals 9
a=0;// 
a=0;//     const/16 v8, 0x22
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     sget-object v0, Lcom/b/a/a/v;->f:[B
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,[B);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     sget-object v0, Lcom/b/a/a/v;->c:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     add-int/lit8 v2, v0, 0x1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v2, v3, :cond_6
a=0;// 
a=0;//     invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Char);
a=0;//     sparse-switch v0, :sswitch_data_0
a=0;// 
a=0;//     if-ltz v0, :cond_1
a=0;// 
a=0;//     const/16 v4, 0x1f
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     if-le v0, v4, :cond_3
a=0;// 
a=0;//     :cond_1
a=0;//     #v4=(Conflicted);
a=0;//     const/16 v4, 0x7f
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     if-lt v0, v4, :cond_2
a=0;// 
a=0;//     const/16 v4, 0x9f
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     if-le v0, v4, :cond_3
a=0;// 
a=0;//     :cond_2
a=0;//     const/16 v4, 0x2000
a=0;// 
a=0;//     if-lt v0, v4, :cond_5
a=0;// 
a=0;//     const/16 v4, 0x20ff
a=0;// 
a=0;//     if-gt v0, v4, :cond_5
a=0;// 
a=0;//     :cond_3
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     sget-object v0, Lcom/b/a/a/v;->c:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "\\u"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     rsub-int/lit8 v5, v0, 0x4
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_2
a=0;//     if-ge v0, v5, :cond_4
a=0;// 
a=0;//     sget-object v6, Lcom/b/a/a/v;->c:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/16 v7, 0x30
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :sswitch_0
a=0;//     #v0=(Char);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     sget-object v0, Lcom/b/a/a/v;->c:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "\\\""
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :sswitch_1
a=0;//     #v0=(Char);v4=(Conflicted);
a=0;//     sget-object v0, Lcom/b/a/a/v;->c:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "\\\\"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :sswitch_2
a=0;//     #v0=(Char);v4=(Conflicted);
a=0;//     sget-object v0, Lcom/b/a/a/v;->c:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "\\b"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :sswitch_3
a=0;//     #v0=(Char);v4=(Conflicted);
a=0;//     sget-object v0, Lcom/b/a/a/v;->c:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "\\f"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :sswitch_4
a=0;//     #v0=(Char);v4=(Conflicted);
a=0;//     sget-object v0, Lcom/b/a/a/v;->c:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "\\n"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :sswitch_5
a=0;//     #v0=(Char);v4=(Conflicted);
a=0;//     sget-object v0, Lcom/b/a/a/v;->c:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "\\r"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :sswitch_6
a=0;//     #v0=(Char);v4=(Conflicted);
a=0;//     sget-object v0, Lcom/b/a/a/v;->c:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "\\t"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_4
a=0;//     #v5=(Integer);
a=0;//     sget-object v0, Lcom/b/a/a/v;->c:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/Locale;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Char);v4=(PosShort);v5=(Conflicted);
a=0;//     sget-object v4, Lcom/b/a/a/v;->c:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_6
a=0;//     #v4=(Conflicted);
a=0;//     sget-object v0, Lcom/b/a/a/v;->c:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/b/a/a/v;->c:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v2, Lcom/b/a/a/v;->c:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->setLength(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v2=(Integer);
a=0;//     move-exception v0
a=0;// 
a=0;//     sget-object v2, Lcom/b/a/a/v;->c:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->setLength(I)V
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);p0=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x8 -> :sswitch_2
a=0;//         0x9 -> :sswitch_6
a=0;//         0xa -> :sswitch_4
a=0;//         0xc -> :sswitch_3
a=0;//         0xd -> :sswitch_5
a=0;//         0x22 -> :sswitch_0
a=0;//         0x5c -> :sswitch_1
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(Ljava/lang/String;Ljava/lang/Object;)V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/b/a/a/v;->m:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final consumeContent()V
a=0;//     .locals 0
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final getContent()Ljava/io/InputStream;
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lcom/b/a/a/v;->a:Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public final getContentEncoding()Lorg/apache/http/Header;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/b/a/a/v;->n:Lorg/apache/http/Header;
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/Header;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final getContentLength()J
a=0;//     .locals 2
a=0;// 
a=0;//     const-wide/16 v0, -0x1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public final getContentType()Lorg/apache/http/Header;
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lcom/b/a/a/v;->k:Lorg/apache/http/Header;
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/Header;);
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
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
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
a=0;//     .locals 10
a=0;// 
a=0;//     const/16 v9, 0x7b
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     const/16 v8, 0x3a
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "Output stream cannot be null."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iget-object v0, p0, Lcom/b/a/a/v;->n:Lorg/apache/http/Header;
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/Header;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     new-instance v0, Ljava/util/zip/GZIPOutputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/zip/GZIPOutputStream;);
a=0;//     const/16 v1, 0x1000
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-direct {v0, p1, v1}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;I)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/zip/GZIPOutputStream;);
a=0;//     move-object p1, v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     invoke-virtual {p1, v9}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/b/a/a/v;->m:Ljava/util/Map;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v4=(Reference,Ljava/util/Iterator;);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_f
a=0;// 
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/b/a/a/v;->m:Ljava/util/Map;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     invoke-static {v0}, Lcom/b/a/a/v;->a(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V
a=0;// 
a=0;//     invoke-virtual {p1, v8}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     instance-of v0, v1, Lcom/b/a/a/aa;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     instance-of v5, v1, Lcom/b/a/a/ab;
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_5
a=0;// 
a=0;//     :cond_3
a=0;//     #v5=(Conflicted);
a=0;//     invoke-virtual {p1, v9}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/b/a/a/aa;
a=0;// 
a=0;//     invoke-direct {p0, p1, v0}, Lcom/b/a/a/v;->a(Ljava/io/OutputStream;Lcom/b/a/a/aa;)V
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);
a=0;//     const/16 v0, 0x7d
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     const/16 v0, 0x2c
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Boolean);v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/b/a/a/ab;
a=0;// 
a=0;//     invoke-direct {p0, p1, v1}, Lcom/b/a/a/v;->a(Ljava/io/OutputStream;Lcom/b/a/a/ab;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_5
a=0;//     #v5=(Boolean);
a=0;//     instance-of v0, v1, Lcom/b/a/a/w;
a=0;// 
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     check-cast v1, Lcom/b/a/a/w;
a=0;// 
a=0;//     invoke-interface {v1}, Lcom/b/a/a/w;->a()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Boolean);
a=0;//     instance-of v0, v1, Lorg/json/JSONObject;
a=0;// 
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     check-cast v1, Lorg/json/JSONObject;
a=0;// 
a=0;//     invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_7
a=0;//     #v0=(Boolean);
a=0;//     instance-of v0, v1, Lorg/json/JSONArray;
a=0;// 
a=0;//     if-eqz v0, :cond_8
a=0;// 
a=0;//     check-cast v1, Lorg/json/JSONArray;
a=0;// 
a=0;//     invoke-virtual {v1}, Lorg/json/JSONArray;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_8
a=0;//     #v0=(Boolean);
a=0;//     instance-of v0, v1, Ljava/lang/Boolean;
a=0;// 
a=0;//     if-eqz v0, :cond_a
a=0;// 
a=0;//     check-cast v1, Ljava/lang/Boolean;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_9
a=0;// 
a=0;//     sget-object v0, Lcom/b/a/a/v;->d:[B
a=0;// 
a=0;//     :goto_3
a=0;//     #v0=(Reference,[B);
a=0;//     invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_9
a=0;//     #v0=(Boolean);
a=0;//     sget-object v0, Lcom/b/a/a/v;->e:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_a
a=0;//     #v0=(Boolean);
a=0;//     instance-of v0, v1, Ljava/lang/Long;
a=0;// 
a=0;//     if-eqz v0, :cond_b
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     check-cast v1, Ljava/lang/Number;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Number;->longValue()J
a=0;// 
a=0;//     move-result-wide v6
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
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
a=0;//     invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_b
a=0;//     #v0=(Boolean);v6=(Conflicted);v7=(Conflicted);
a=0;//     instance-of v0, v1, Ljava/lang/Double;
a=0;// 
a=0;//     if-eqz v0, :cond_c
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     check-cast v1, Ljava/lang/Number;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D
a=0;// 
a=0;//     move-result-wide v6
a=0;// 
a=0;//     #v6=(DoubleLo);v7=(DoubleHi);
a=0;//     invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
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
a=0;//     invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :cond_c
a=0;//     #v0=(Boolean);v6=(Conflicted);v7=(Conflicted);
a=0;//     instance-of v0, v1, Ljava/lang/Float;
a=0;// 
a=0;//     if-eqz v0, :cond_d
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     check-cast v1, Ljava/lang/Number;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
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
a=0;//     invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :cond_d
a=0;//     #v0=(Boolean);v1=(Reference,Ljava/lang/Object;);
a=0;//     instance-of v0, v1, Ljava/lang/Integer;
a=0;// 
a=0;//     if-eqz v0, :cond_e
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     check-cast v1, Ljava/lang/Number;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Number;->intValue()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
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
a=0;//     invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :cond_e
a=0;//     #v0=(Boolean);v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/b/a/a/v;->a(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :cond_f
a=0;//     #v0=(Boolean);v1=(Conflicted);v5=(Conflicted);
a=0;//     sget-object v0, Lcom/b/a/a/v;->j:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V
a=0;// 
a=0;//     invoke-virtual {p1, v8}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     sub-long/2addr v0, v2
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "}"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
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
a=0;//     invoke-virtual {p1, v2}, Ljava/io/OutputStream;->write([B)V
a=0;// 
a=0;//     const-string v2, "JsonStreamerEntity"
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "Uploaded JSON in "
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-wide/16 v4, 0x3e8
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     div-long/2addr v0, v4
a=0;// 
a=0;//     long-to-double v0, v0
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, " seconds"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v2, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V
a=0;// 
a=0;//     invoke-static {p1}, Lcom/b/a/a/b;->a(Ljava/io/OutputStream;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
