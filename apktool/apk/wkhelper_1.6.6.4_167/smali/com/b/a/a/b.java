package com.b.a.a; class b { void a() { int a;
a=0;// .class public final Lcom/b/a/a/b;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public final a:Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;// .field public final b:Lorg/apache/http/protocol/HttpContext;
a=0;// 
a=0;// .field public c:Ljava/util/concurrent/ExecutorService;
a=0;// 
a=0;// .field final d:Ljava/util/Map;
a=0;// 
a=0;// .field private e:I
a=0;// 
a=0;// .field private f:I
a=0;// 
a=0;// .field private g:I
a=0;// 
a=0;// .field private final h:Ljava/util/Map;
a=0;// 
a=0;// .field private i:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, v0}, Lcom/b/a/a/b;-><init>(B)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/b/a/a/b;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(B)V
a=0;//     .locals 6
a=0;// 
a=0;//     invoke-static {}, Lorg/apache/http/conn/ssl/SSLSocketFactory;->getSocketFactory()Lorg/apache/http/conn/ssl/SSLSocketFactory;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/conn/ssl/SSLSocketFactory;);
a=0;//     new-instance v1, Lorg/apache/http/conn/scheme/SchemeRegistry;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/apache/http/conn/scheme/SchemeRegistry;);
a=0;//     invoke-direct {v1}, Lorg/apache/http/conn/scheme/SchemeRegistry;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lorg/apache/http/conn/scheme/SchemeRegistry;);
a=0;//     new-instance v2, Lorg/apache/http/conn/scheme/Scheme;
a=0;// 
a=0;//     #v2=(UninitRef,Lorg/apache/http/conn/scheme/Scheme;);
a=0;//     const-string v3, "http"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lorg/apache/http/conn/scheme/PlainSocketFactory;->getSocketFactory()Lorg/apache/http/conn/scheme/PlainSocketFactory;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Lorg/apache/http/conn/scheme/PlainSocketFactory;);
a=0;//     const/16 v5, 0x50
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-direct {v2, v3, v4, v5}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V
a=0;// 
a=0;//     #v2=(Reference,Lorg/apache/http/conn/scheme/Scheme;);
a=0;//     invoke-virtual {v1, v2}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;
a=0;// 
a=0;//     new-instance v2, Lorg/apache/http/conn/scheme/Scheme;
a=0;// 
a=0;//     #v2=(UninitRef,Lorg/apache/http/conn/scheme/Scheme;);
a=0;//     const-string v3, "https"
a=0;// 
a=0;//     const/16 v4, 0x1bb
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     invoke-direct {v2, v3, v0, v4}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V
a=0;// 
a=0;//     #v2=(Reference,Lorg/apache/http/conn/scheme/Scheme;);
a=0;//     invoke-virtual {v1, v2}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;
a=0;// 
a=0;//     invoke-direct {p0, v1}, Lcom/b/a/a/b;-><init>(Lorg/apache/http/conn/scheme/SchemeRegistry;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/b/a/a/b;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Lorg/apache/http/conn/scheme/SchemeRegistry;)V
a=0;//     .locals 6
a=0;// 
a=0;//     const/16 v0, 0x2710
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     const/16 v5, 0xa
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/b/a/a/b;);
a=0;//     iput v5, p0, Lcom/b/a/a/b;->e:I
a=0;// 
a=0;//     iput v0, p0, Lcom/b/a/a/b;->f:I
a=0;// 
a=0;//     iput v0, p0, Lcom/b/a/a/b;->g:I
a=0;// 
a=0;//     iput-boolean v4, p0, Lcom/b/a/a/b;->i:Z
a=0;// 
a=0;//     new-instance v0, Lorg/apache/http/params/BasicHttpParams;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/apache/http/params/BasicHttpParams;);
a=0;//     invoke-direct {v0}, Lorg/apache/http/params/BasicHttpParams;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/params/BasicHttpParams;);
a=0;//     iget v1, p0, Lcom/b/a/a/b;->f:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-long v2, v1
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-static {v0, v2, v3}, Lorg/apache/http/conn/params/ConnManagerParams;->setTimeout(Lorg/apache/http/params/HttpParams;J)V
a=0;// 
a=0;//     new-instance v1, Lorg/apache/http/conn/params/ConnPerRouteBean;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/apache/http/conn/params/ConnPerRouteBean;);
a=0;//     iget v2, p0, Lcom/b/a/a/b;->e:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-direct {v1, v2}, Lorg/apache/http/conn/params/ConnPerRouteBean;-><init>(I)V
a=0;// 
a=0;//     #v1=(Reference,Lorg/apache/http/conn/params/ConnPerRouteBean;);
a=0;//     invoke-static {v0, v1}, Lorg/apache/http/conn/params/ConnManagerParams;->setMaxConnectionsPerRoute(Lorg/apache/http/params/HttpParams;Lorg/apache/http/conn/params/ConnPerRoute;)V
a=0;// 
a=0;//     invoke-static {v0, v5}, Lorg/apache/http/conn/params/ConnManagerParams;->setMaxTotalConnections(Lorg/apache/http/params/HttpParams;I)V
a=0;// 
a=0;//     iget v1, p0, Lcom/b/a/a/b;->g:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Lorg/apache/http/params/HttpConnectionParams;->setSoTimeout(Lorg/apache/http/params/HttpParams;I)V
a=0;// 
a=0;//     iget v1, p0, Lcom/b/a/a/b;->f:I
a=0;// 
a=0;//     invoke-static {v0, v1}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V
a=0;// 
a=0;//     invoke-static {v0, v4}, Lorg/apache/http/params/HttpConnectionParams;->setTcpNoDelay(Lorg/apache/http/params/HttpParams;Z)V
a=0;// 
a=0;//     const/16 v1, 0x2000
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-static {v0, v1}, Lorg/apache/http/params/HttpConnectionParams;->setSocketBufferSize(Lorg/apache/http/params/HttpParams;I)V
a=0;// 
a=0;//     sget-object v1, Lorg/apache/http/HttpVersion;->HTTP_1_1:Lorg/apache/http/HttpVersion;
a=0;// 
a=0;//     #v1=(Reference,Lorg/apache/http/HttpVersion;);
a=0;//     invoke-static {v0, v1}, Lorg/apache/http/params/HttpProtocolParams;->setVersion(Lorg/apache/http/params/HttpParams;Lorg/apache/http/ProtocolVersion;)V
a=0;// 
a=0;//     new-instance v1, Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;);
a=0;//     invoke-direct {v1, v0, p1}, Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;-><init>(Lorg/apache/http/params/HttpParams;Lorg/apache/http/conn/scheme/SchemeRegistry;)V
a=0;// 
a=0;//     #v1=(Reference,Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;);
a=0;//     invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/concurrent/ExecutorService;);
a=0;//     iput-object v2, p0, Lcom/b/a/a/b;->c:Ljava/util/concurrent/ExecutorService;
a=0;// 
a=0;//     new-instance v2, Ljava/util/WeakHashMap;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/WeakHashMap;);
a=0;//     invoke-direct {v2}, Ljava/util/WeakHashMap;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/WeakHashMap;);
a=0;//     invoke-static {v2}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, p0, Lcom/b/a/a/b;->h:Ljava/util/Map;
a=0;// 
a=0;//     new-instance v2, Ljava/util/HashMap;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v2}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v2, p0, Lcom/b/a/a/b;->d:Ljava/util/Map;
a=0;// 
a=0;//     new-instance v2, Lorg/apache/http/protocol/SyncBasicHttpContext;
a=0;// 
a=0;//     #v2=(UninitRef,Lorg/apache/http/protocol/SyncBasicHttpContext;);
a=0;//     new-instance v3, Lorg/apache/http/protocol/BasicHttpContext;
a=0;// 
a=0;//     #v3=(UninitRef,Lorg/apache/http/protocol/BasicHttpContext;);
a=0;//     invoke-direct {v3}, Lorg/apache/http/protocol/BasicHttpContext;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Lorg/apache/http/protocol/BasicHttpContext;);
a=0;//     invoke-direct {v2, v3}, Lorg/apache/http/protocol/SyncBasicHttpContext;-><init>(Lorg/apache/http/protocol/HttpContext;)V
a=0;// 
a=0;//     #v2=(Reference,Lorg/apache/http/protocol/SyncBasicHttpContext;);
a=0;//     iput-object v2, p0, Lcom/b/a/a/b;->b:Lorg/apache/http/protocol/HttpContext;
a=0;// 
a=0;//     new-instance v2, Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     #v2=(UninitRef,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     invoke-direct {v2, v1, v0}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/conn/ClientConnectionManager;Lorg/apache/http/params/HttpParams;)V
a=0;// 
a=0;//     #v2=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     iput-object v2, p0, Lcom/b/a/a/b;->a:Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/b/a/a/b;->a:Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     new-instance v1, Lcom/b/a/a/c;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/b/a/a/c;);
a=0;//     invoke-direct {v1, p0}, Lcom/b/a/a/c;-><init>(Lcom/b/a/a/b;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/b/a/a/c;);
a=0;//     invoke-virtual {v0, v1}, Lorg/apache/http/impl/client/DefaultHttpClient;->addRequestInterceptor(Lorg/apache/http/HttpRequestInterceptor;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/b/a/a/b;->a:Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     new-instance v1, Lcom/b/a/a/d;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/b/a/a/d;);
a=0;//     invoke-direct {v1, p0}, Lcom/b/a/a/d;-><init>(Lcom/b/a/a/b;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/b/a/a/d;);
a=0;//     invoke-virtual {v0, v1}, Lorg/apache/http/impl/client/DefaultHttpClient;->addResponseInterceptor(Lorg/apache/http/HttpResponseInterceptor;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/b/a/a/b;->a:Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     new-instance v1, Lcom/b/a/a/e;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/b/a/a/e;);
a=0;//     invoke-direct {v1, p0}, Lcom/b/a/a/e;-><init>(Lcom/b/a/a/b;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/b/a/a/e;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Lorg/apache/http/impl/client/DefaultHttpClient;->addRequestInterceptor(Lorg/apache/http/HttpRequestInterceptor;I)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/b/a/a/b;->a:Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     new-instance v1, Lcom/b/a/a/ad;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/b/a/a/ad;);
a=0;//     const/4 v2, 0x5
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-direct {v1, v2}, Lcom/b/a/a/ad;-><init>(I)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/b/a/a/ad;);
a=0;//     invoke-virtual {v0, v1}, Lorg/apache/http/impl/client/DefaultHttpClient;->setHttpRequestRetryHandler(Lorg/apache/http/client/HttpRequestRetryHandler;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(ZLjava/lang/String;Lcom/b/a/a/z;)Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     if-eqz p0, :cond_3
a=0;// 
a=0;//     const-string v0, " "
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "%20"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     invoke-virtual {p2}, Lcom/b/a/a/z;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     const-string v2, "?"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "?"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     const-string v0, "&"
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, "?"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     move-object v0, p1
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static a(Lcom/b/a/a/z;Lcom/b/a/a/ac;)Lorg/apache/http/HttpEntity;
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, p1}, Lcom/b/a/a/z;->a(Lcom/b/a/a/ac;)Lorg/apache/http/HttpEntity;
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lorg/apache/http/HttpEntity;);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Uninit);v2=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {p1, v2, v0, v0, v1}, Lcom/b/a/a/ac;->b(I[Lorg/apache/http/Header;[BLjava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Uninit);
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/io/InputStream;)V
a=0;//     .locals 3
a=0;// 
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     const-string v1, "AsyncHttpClient"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "Cannot close input stream"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/io/OutputStream;)V
a=0;//     .locals 3
a=0;// 
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Ljava/io/OutputStream;->close()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     const-string v1, "AsyncHttpClient"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "Cannot close output stream"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Lorg/apache/http/HttpEntity;)V
a=0;//     .locals 7
a=0;// 
a=0;//     instance-of v0, p0, Lorg/apache/http/entity/HttpEntityWrapper;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     const-class v0, Lorg/apache/http/entity/HttpEntityWrapper;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/reflect/Field;);
a=0;//     array-length v4, v3
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v2, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Integer);v5=(Conflicted);v6=(Conflicted);
a=0;//     if-ge v2, v4, :cond_2
a=0;// 
a=0;//     aget-object v0, v3, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v0}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, "wrappedEntity"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     :goto_1
a=0;//     #v5=(Conflicted);v6=(Conflicted);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/HttpEntity;->consumeContent()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Null);v2=(Integer);v3=(Reference,[Ljava/lang/reflect/Field;);v4=(Integer);v5=(Boolean);v6=(Reference,Ljava/lang/String;);
a=0;//     add-int/lit8 v0, v2, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v2, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Boolean);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const-string v1, "AsyncHttpClient"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "wrappedEntity consume"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(Null);v2=(Integer);v3=(Reference,[Ljava/lang/reflect/Field;);v4=(Integer);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(Ljava/lang/String;Lcom/b/a/a/z;Lcom/b/a/a/ac;)Lcom/b/a/a/y;
a=0;//     .locals 4
a=0;// 
a=0;//     iget-object v0, p0, Lcom/b/a/a/b;->a:Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     iget-object v1, p0, Lcom/b/a/a/b;->b:Lorg/apache/http/protocol/HttpContext;
a=0;// 
a=0;//     #v1=(Reference,Lorg/apache/http/protocol/HttpContext;);
a=0;//     new-instance v2, Lorg/apache/http/client/methods/HttpGet;
a=0;// 
a=0;//     #v2=(UninitRef,Lorg/apache/http/client/methods/HttpGet;);
a=0;//     iget-boolean v3, p0, Lcom/b/a/a/b;->i:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     invoke-static {v3, p1, p2}, Lcom/b/a/a/b;->a(ZLjava/lang/String;Lcom/b/a/a/z;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lorg/apache/http/client/methods/HttpGet;);
a=0;//     invoke-virtual {p0, v0, v1, v2, p3}, Lcom/b/a/a/b;->a(Lorg/apache/http/impl/client/DefaultHttpClient;Lorg/apache/http/protocol/HttpContext;Lorg/apache/http/client/methods/HttpUriRequest;Lcom/b/a/a/ac;)Lcom/b/a/a/y;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final a(Lorg/apache/http/impl/client/DefaultHttpClient;Lorg/apache/http/protocol/HttpContext;Lorg/apache/http/client/methods/HttpUriRequest;Lcom/b/a/a/ac;)Lcom/b/a/a/y;
a=0;//     .locals 2
a=0;// 
a=0;//     if-nez p4, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "ResponseHandler must not be null"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     invoke-interface {p4}, Lcom/b/a/a/ac;->a()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "Synchronous ResponseHandler used in AsyncHttpClient. You should create your response handler in a looper thread or use SyncHttpClient instead."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     invoke-interface {p3}, Lorg/apache/http/client/methods/HttpUriRequest;->getAllHeaders()[Lorg/apache/http/Header;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[Lorg/apache/http/Header;);
a=0;//     invoke-interface {p4, v0}, Lcom/b/a/a/ac;->a([Lorg/apache/http/Header;)V
a=0;// 
a=0;//     invoke-interface {p3}, Lorg/apache/http/client/methods/HttpUriRequest;->getURI()Ljava/net/URI;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {p4, v0}, Lcom/b/a/a/ac;->a(Ljava/net/URI;)V
a=0;// 
a=0;//     new-instance v0, Lcom/b/a/a/g;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/b/a/a/g;);
a=0;//     invoke-direct {v0, p1, p2, p3, p4}, Lcom/b/a/a/g;-><init>(Lorg/apache/http/impl/client/AbstractHttpClient;Lorg/apache/http/protocol/HttpContext;Lorg/apache/http/client/methods/HttpUriRequest;Lcom/b/a/a/ac;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/b/a/a/g;);
a=0;//     iget-object v1, p0, Lcom/b/a/a/b;->c:Ljava/util/concurrent/ExecutorService;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/concurrent/ExecutorService;);
a=0;//     invoke-interface {v1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
a=0;// 
a=0;//     new-instance v1, Lcom/b/a/a/y;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/b/a/a/y;);
a=0;//     invoke-direct {v1, v0}, Lcom/b/a/a/y;-><init>(Lcom/b/a/a/g;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/b/a/a/y;);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public final a()V
a=0;//     .locals 3
a=0;// 
a=0;//     iget-object v0, p0, Lcom/b/a/a/b;->a:Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     invoke-virtual {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;->getParams()Lorg/apache/http/params/HttpParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "http.protocol.reject-relative-redirect"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v0, v1, v2}, Lorg/apache/http/params/HttpParams;->setBooleanParameter(Ljava/lang/String;Z)Lorg/apache/http/params/HttpParams;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/b/a/a/b;->a:Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     invoke-virtual {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;->getParams()Lorg/apache/http/params/HttpParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "http.protocol.allow-circular-redirects"
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-interface {v0, v1, v2}, Lorg/apache/http/params/HttpParams;->setBooleanParameter(Ljava/lang/String;Z)Lorg/apache/http/params/HttpParams;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/b/a/a/b;->a:Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     new-instance v1, Lcom/b/a/a/x;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/b/a/a/x;);
a=0;//     invoke-direct {v1}, Lcom/b/a/a/x;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lcom/b/a/a/x;);
a=0;//     invoke-virtual {v0, v1}, Lorg/apache/http/impl/client/DefaultHttpClient;->setRedirectHandler(Lorg/apache/http/client/RedirectHandler;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
