package com.wukongtv.wkhelper.c; class p { void a() { int a;
a=0;// .class public final Lcom/wukongtv/wkhelper/c/p;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/wukongtv/wkhelper/c/q;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final a:Lcom/wukongtv/wkhelper/c/v;
a=0;// 
a=0;// .field final b:Ljava/io/OutputStream;
a=0;// 
a=0;// .field c:Ljava/io/InputStream;
a=0;// 
a=0;// .field d:I
a=0;// 
a=0;// .field e:I
a=0;// 
a=0;// .field f:Ljava/lang/String;
a=0;// 
a=0;// .field g:Lcom/wukongtv/wkhelper/c/r;
a=0;// 
a=0;// .field h:Ljava/util/Map;
a=0;// 
a=0;// .field i:Ljava/util/Map;
a=0;// 
a=0;// .field j:Lcom/wukongtv/wkhelper/c/l;
a=0;// 
a=0;// .field final synthetic k:Lcom/wukongtv/wkhelper/c/g;
a=0;// 
a=0;// .field private l:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/wukongtv/wkhelper/c/g;Lcom/wukongtv/wkhelper/c/v;Ljava/io/InputStream;Ljava/io/OutputStream;Ljava/net/InetAddress;)V
a=0;//     .locals 3
a=0;// 
a=0;//     iput-object p1, p0, Lcom/wukongtv/wkhelper/c/p;->k:Lcom/wukongtv/wkhelper/c/g;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/c/p;);
a=0;//     iput-object p2, p0, Lcom/wukongtv/wkhelper/c/p;->a:Lcom/wukongtv/wkhelper/c/v;
a=0;// 
a=0;//     iput-object p3, p0, Lcom/wukongtv/wkhelper/c/p;->c:Ljava/io/InputStream;
a=0;// 
a=0;//     iput-object p4, p0, Lcom/wukongtv/wkhelper/c/p;->b:Ljava/io/OutputStream;
a=0;// 
a=0;//     invoke-virtual {p5}, Ljava/net/InetAddress;->isLoopbackAddress()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p5}, Ljava/net/InetAddress;->isAnyLocalAddress()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     const-string v0, "127.0.0.1"
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v1}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v1, p0, Lcom/wukongtv/wkhelper/c/p;->i:Ljava/util/Map;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/c/p;->i:Ljava/util/Map;
a=0;// 
a=0;//     const-string v2, "remote-addr"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/c/p;->i:Ljava/util/Map;
a=0;// 
a=0;//     const-string v2, "http-client-ip"
a=0;// 
a=0;//     invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     invoke-virtual {p5}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static a([BI)I
a=0;//     .locals 5
a=0;// 
a=0;//     const/16 v4, 0xd
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const/16 v3, 0xa
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Integer);v2=(Conflicted);
a=0;//     add-int/lit8 v2, v1, 0x3
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v2, p1, :cond_0
a=0;// 
a=0;//     aget-byte v2, p0, v1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-ne v2, v4, :cond_1
a=0;// 
a=0;//     add-int/lit8 v2, v1, 0x1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     aget-byte v2, p0, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-ne v2, v3, :cond_1
a=0;// 
a=0;//     add-int/lit8 v2, v1, 0x2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     aget-byte v2, p0, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-ne v2, v4, :cond_1
a=0;// 
a=0;//     add-int/lit8 v2, v1, 0x3
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     aget-byte v2, p0, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-ne v2, v3, :cond_1
a=0;// 
a=0;//     add-int/lit8 v0, v1, 0x4
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);v2=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);v2=(Byte);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/lang/String;Ljava/util/Map;)V
a=0;//     .locals 4
a=0;// 
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/c/p;->l:Ljava/lang/String;
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     iput-object p1, p0, Lcom/wukongtv/wkhelper/c/p;->l:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v0, Ljava/util/StringTokenizer;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/StringTokenizer;);
a=0;//     const-string v1, "&"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, p1, v1}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/util/StringTokenizer;);v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-virtual {v0}, Ljava/util/StringTokenizer;->hasMoreTokens()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/16 v2, 0x3d
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->indexOf(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ltz v2, :cond_2
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3}, Lcom/wukongtv/wkhelper/c/g;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/wukongtv/wkhelper/c/g;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {p2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);
a=0;//     invoke-static {v1}, Lcom/wukongtv/wkhelper/c/g;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p2, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a()V
a=0;//     .locals 10
a=0;// 
a=0;//     const-wide/16 v4, 0x0
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     const/16 v0, 0x2800
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/nio/ByteBuffer;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/c/p;->i:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     const-string v2, "content-length"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/c/p;->i:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     const-string v2, "content-length"
a=0;// 
a=0;//     invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-long v2, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     const/16 v0, 0x200
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     new-array v0, v0, [B
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v0=(Reference,[B);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     iget v7, p0, Lcom/wukongtv/wkhelper/c/p;->e:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-ltz v7, :cond_3
a=0;// 
a=0;//     cmp-long v7, v2, v4
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     if-lez v7, :cond_3
a=0;// 
a=0;//     iget-object v7, p0, Lcom/wukongtv/wkhelper/c/p;->c:Ljava/io/InputStream;
a=0;// 
a=0;//     #v7=(Reference,Ljava/io/InputStream;);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     const/16 v9, 0x200
a=0;// 
a=0;//     #v9=(PosShort);
a=0;//     invoke-virtual {v7, v0, v8, v9}, Ljava/io/InputStream;->read([BII)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     iput v7, p0, Lcom/wukongtv/wkhelper/c/p;->e:I
a=0;// 
a=0;//     iget v7, p0, Lcom/wukongtv/wkhelper/c/p;->e:I
a=0;// 
a=0;//     int-to-long v8, v7
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     sub-long/2addr v2, v8
a=0;// 
a=0;//     iget v7, p0, Lcom/wukongtv/wkhelper/c/p;->e:I
a=0;// 
a=0;//     if-lez v7, :cond_0
a=0;// 
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     iget v8, p0, Lcom/wukongtv/wkhelper/c/p;->e:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v6, v0, v7, v8}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);v1=(Reference,Ljava/io/BufferedReader;);v4=(Conflicted);
a=0;//     invoke-static {v1}, Lcom/wukongtv/wkhelper/c/g;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     #v0=(Boolean);v1=(Null);v2=(Reference,Ljava/lang/String;);v3=(Uninit);v4=(LongLo);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     iget v0, p0, Lcom/wukongtv/wkhelper/c/p;->d:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v2, p0, Lcom/wukongtv/wkhelper/c/p;->e:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v0, v2, :cond_2
a=0;// 
a=0;//     iget v0, p0, Lcom/wukongtv/wkhelper/c/p;->e:I
a=0;// 
a=0;//     iget v2, p0, Lcom/wukongtv/wkhelper/c/p;->d:I
a=0;// 
a=0;//     sub-int/2addr v0, v2
a=0;// 
a=0;//     int-to-long v2, v0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v2=(Integer);v3=(Uninit);
a=0;//     move-wide v2, v4
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Reference,[B);v7=(Integer);v8=(Conflicted);v9=(Conflicted);
a=0;//     new-instance v0, Ljava/io/ByteArrayInputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/ByteArrayInputStream;);
a=0;//     invoke-virtual {v6}, Ljava/nio/ByteBuffer;->array()[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     invoke-direct {v0, v2}, Ljava/io/ByteArrayInputStream;-><init>([B)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/ByteArrayInputStream;);
a=0;//     new-instance v2, Ljava/io/BufferedReader;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/BufferedReader;);
a=0;//     new-instance v3, Ljava/io/InputStreamReader;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/InputStreamReader;);
a=0;//     invoke-direct {v3, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/InputStreamReader;);
a=0;//     invoke-direct {v2, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     :try_start_2
a=0;//     #v2=(Reference,Ljava/io/BufferedReader;);
a=0;//     sget-object v0, Lcom/wukongtv/wkhelper/c/r;->c:Lcom/wukongtv/wkhelper/c/r;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/c/p;->g:Lcom/wukongtv/wkhelper/c/r;
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/c/r;);
a=0;//     invoke-virtual {v0, v1}, Lcom/wukongtv/wkhelper/c/r;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/c/p;->i:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     const-string v3, "content-type"
a=0;// 
a=0;//     invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     new-instance v3, Ljava/util/StringTokenizer;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/StringTokenizer;);
a=0;//     const-string v4, ",; "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v0, v4}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/StringTokenizer;);
a=0;//     invoke-virtual {v3}, Ljava/util/StringTokenizer;->hasMoreTokens()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_3
a=0;//     #v0=(Reference,Ljava/lang/String;);v4=(Conflicted);
a=0;//     const-string v1, "multipart/form-data"
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_5
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     const/16 v0, 0x200
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     new-array v3, v0, [C
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/io/BufferedReader;->read([C)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_4
a=0;//     #v0=(Integer);
a=0;//     if-ltz v0, :cond_4
a=0;// 
a=0;//     const-string v4, "\r\n"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_4
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static {v3, v4, v0}, Ljava/lang/String;->valueOf([CII)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/io/BufferedReader;->read([C)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_4
a=0;// 
a=0;//     :cond_4
a=0;//     #v4=(Conflicted);
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/c/p;->h:Ljava/util/Map;
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Lcom/wukongtv/wkhelper/c/p;->a(Ljava/lang/String;Ljava/util/Map;)V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_1
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);
a=0;//     invoke-static {v2}, Lcom/wukongtv/wkhelper/c/g;->a(Ljava/io/Closeable;)V
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :catchall_1
a=0;//     #v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);v3=(Reference,Ujava/lang/Object;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// .method final a(Ljava/io/BufferedReader;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V
a=0;//     .locals 5
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {p1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     new-instance v2, Ljava/util/StringTokenizer;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/StringTokenizer;);
a=0;//     invoke-direct {v2, v0}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/StringTokenizer;);
a=0;//     invoke-virtual {v2}, Ljava/util/StringTokenizer;->hasMoreTokens()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/c/u;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/c/u;);
a=0;//     sget-object v1, Lcom/wukongtv/wkhelper/c/t;->h:Lcom/wukongtv/wkhelper/c/t;
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/c/t;);
a=0;//     const-string v2, "BAD REQUEST: Syntax error. Usage: GET /example/file.html"
a=0;// 
a=0;//     invoke-direct {v0, v1, v2}, Lcom/wukongtv/wkhelper/c/u;-><init>(Lcom/wukongtv/wkhelper/c/t;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/c/u;);
a=0;//     throw v0
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     new-instance v1, Lcom/wukongtv/wkhelper/c/u;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/wukongtv/wkhelper/c/u;);
a=0;//     sget-object v2, Lcom/wukongtv/wkhelper/c/t;->n:Lcom/wukongtv/wkhelper/c/t;
a=0;// 
a=0;//     #v2=(Reference,Lcom/wukongtv/wkhelper/c/t;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "SERVER INTERNAL ERROR: IOException: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v1, v2, v3, v0}, Lcom/wukongtv/wkhelper/c/u;-><init>(Lcom/wukongtv/wkhelper/c/t;Ljava/lang/String;Ljava/lang/Exception;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/c/u;);
a=0;//     throw v1
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     #v0=(Boolean);v1=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     const-string v0, "method"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/util/StringTokenizer;->hasMoreTokens()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/c/u;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/c/u;);
a=0;//     sget-object v1, Lcom/wukongtv/wkhelper/c/t;->h:Lcom/wukongtv/wkhelper/c/t;
a=0;// 
a=0;//     const-string v2, "BAD REQUEST: Missing URI. Usage: GET /example/file.html"
a=0;// 
a=0;//     invoke-direct {v0, v1, v2}, Lcom/wukongtv/wkhelper/c/u;-><init>(Lcom/wukongtv/wkhelper/c/t;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/c/u;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {v2}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/16 v1, 0x3f
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ltz v1, :cond_4
a=0;// 
a=0;//     add-int/lit8 v3, v1, 0x1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v3, p3}, Lcom/wukongtv/wkhelper/c/p;->a(Ljava/lang/String;Ljava/util/Map;)V
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v0, v3, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/c/g;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Reference,Ljava/lang/String;);v3=(Conflicted);
a=0;//     invoke-virtual {v2}, Ljava/util/StringTokenizer;->hasMoreTokens()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Reference,Ljava/lang/String;);v2=(Conflicted);v4=(Conflicted);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_5
a=0;// 
a=0;//     const/16 v2, 0x3a
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ltz v2, :cond_3
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v0, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/Locale;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {p4, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     :cond_3
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-virtual {p1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_4
a=0;//     #v1=(Integer);v2=(Reference,Ljava/util/StringTokenizer;);v3=(Uninit);v4=(Uninit);
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/c/g;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     const-string v0, "uri"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final b()Ljava/util/Map;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/c/p;->h:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final c()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/c/p;->l:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final d()Ljava/util/Map;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/c/p;->i:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final e()Lcom/wukongtv/wkhelper/c/r;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/c/p;->g:Lcom/wukongtv/wkhelper/c/r;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/c/r;);
a=0;//     return-object v0
a=0;// .end method
}}
