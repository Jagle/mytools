package com.b.a.a; class ad { void a() { int a;
a=0;// .class public final Lcom/b/a/a/ad;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Lorg/apache/http/client/HttpRequestRetryHandler;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final a:Ljava/util/HashSet;
a=0;// 
a=0;// .field private static final b:Ljava/util/HashSet;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final c:I
a=0;// 
a=0;// .field private final d:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     new-instance v0, Ljava/util/HashSet;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashSet;);
a=0;//     invoke-direct {v0}, Ljava/util/HashSet;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashSet;);
a=0;//     sput-object v0, Lcom/b/a/a/ad;->a:Ljava/util/HashSet;
a=0;// 
a=0;//     new-instance v0, Ljava/util/HashSet;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashSet;);
a=0;//     invoke-direct {v0}, Ljava/util/HashSet;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashSet;);
a=0;//     sput-object v0, Lcom/b/a/a/ad;->b:Ljava/util/HashSet;
a=0;// 
a=0;//     sget-object v0, Lcom/b/a/a/ad;->a:Ljava/util/HashSet;
a=0;// 
a=0;//     const-class v1, Lorg/apache/http/NoHttpResponseException;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     sget-object v0, Lcom/b/a/a/ad;->a:Ljava/util/HashSet;
a=0;// 
a=0;//     const-class v1, Ljava/net/UnknownHostException;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     sget-object v0, Lcom/b/a/a/ad;->a:Ljava/util/HashSet;
a=0;// 
a=0;//     const-class v1, Ljava/net/SocketException;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     sget-object v0, Lcom/b/a/a/ad;->b:Ljava/util/HashSet;
a=0;// 
a=0;//     const-class v1, Ljava/io/InterruptedIOException;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     sget-object v0, Lcom/b/a/a/ad;->b:Ljava/util/HashSet;
a=0;// 
a=0;//     const-class v1, Ljavax/net/ssl/SSLException;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(I)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/b/a/a/ad;);
a=0;//     iput p1, p0, Lcom/b/a/a/ad;->c:I
a=0;// 
a=0;//     const/16 v0, 0x5dc
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     iput v0, p0, Lcom/b/a/a/ad;->d:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static a(Ljava/util/HashSet;Ljava/lang/Throwable;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/util/Iterator;);
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
a=0;//     check-cast v0, Ljava/lang/Class;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final retryRequest(Ljava/io/IOException;ILorg/apache/http/protocol/HttpContext;)Z
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const-string v0, "http.request_sent"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p3, v0}, Lorg/apache/http/protocol/HttpContext;->getAttribute(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Boolean;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     iget v3, p0, Lcom/b/a/a/ad;->c:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-le p2, v3, :cond_2
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     const-string v0, "http.request"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p3, v0}, Lorg/apache/http/protocol/HttpContext;->getAttribute(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lorg/apache/http/client/methods/HttpUriRequest;
a=0;// 
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v2=(Boolean);v3=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(One);v2=(Null);v3=(Uninit);
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v3=(Integer);
a=0;//     sget-object v3, Lcom/b/a/a/ad;->a:Ljava/util/HashSet;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/HashSet;);
a=0;//     invoke-static {v3, p1}, Lcom/b/a/a/ad;->a(Ljava/util/HashSet;Ljava/lang/Throwable;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     sget-object v3, Lcom/b/a/a/ad;->b:Ljava/util/HashSet;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/HashSet;);
a=0;//     invoke-static {v3, p1}, Lcom/b/a/a/ad;->a(Ljava/util/HashSet;Ljava/lang/Throwable;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(One);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v1=(Boolean);v3=(Integer);
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     iget v0, p0, Lcom/b/a/a/ad;->d:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-long v2, v0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-static {v2, v3}, Landroid/os/SystemClock;->sleep(J)V
a=0;// 
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move v2, v1
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_5
a=0;//     #v2=(Null);v3=(Integer);
a=0;//     invoke-virtual {p1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_3
a=0;// .end method
}}
