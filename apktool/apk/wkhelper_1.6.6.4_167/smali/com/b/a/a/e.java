package com.b.a.a; class e { void a() { int a;
a=0;// .class final Lcom/b/a/a/e;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Lorg/apache/http/HttpRequestInterceptor;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/b/a/a/b;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/b/a/a/b;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/b/a/a/e;->a:Lcom/b/a/a/b;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/b/a/a/e;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final process(Lorg/apache/http/HttpRequest;Lorg/apache/http/protocol/HttpContext;)V
a=0;//     .locals 5
a=0;// 
a=0;//     const-string v0, "http.auth.target-scope"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p2, v0}, Lorg/apache/http/protocol/HttpContext;->getAttribute(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lorg/apache/http/auth/AuthState;
a=0;// 
a=0;//     const-string v1, "http.auth.credentials-provider"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p2, v1}, Lorg/apache/http/protocol/HttpContext;->getAttribute(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Lorg/apache/http/client/CredentialsProvider;
a=0;// 
a=0;//     const-string v2, "http.target_host"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p2, v2}, Lorg/apache/http/protocol/HttpContext;->getAttribute(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Lorg/apache/http/HttpHost;
a=0;// 
a=0;//     invoke-virtual {v0}, Lorg/apache/http/auth/AuthState;->getAuthScheme()Lorg/apache/http/auth/AuthScheme;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lorg/apache/http/auth/AuthScheme;);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     new-instance v3, Lorg/apache/http/auth/AuthScope;
a=0;// 
a=0;//     #v3=(UninitRef,Lorg/apache/http/auth/AuthScope;);
a=0;//     invoke-virtual {v2}, Lorg/apache/http/HttpHost;->getHostName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2}, Lorg/apache/http/HttpHost;->getPort()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-direct {v3, v4, v2}, Lorg/apache/http/auth/AuthScope;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     #v3=(Reference,Lorg/apache/http/auth/AuthScope;);
a=0;//     invoke-interface {v1, v3}, Lorg/apache/http/client/CredentialsProvider;->getCredentials(Lorg/apache/http/auth/AuthScope;)Lorg/apache/http/auth/Credentials;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     new-instance v2, Lorg/apache/http/impl/auth/BasicScheme;
a=0;// 
a=0;//     #v2=(UninitRef,Lorg/apache/http/impl/auth/BasicScheme;);
a=0;//     invoke-direct {v2}, Lorg/apache/http/impl/auth/BasicScheme;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Lorg/apache/http/impl/auth/BasicScheme;);
a=0;//     invoke-virtual {v0, v2}, Lorg/apache/http/auth/AuthState;->setAuthScheme(Lorg/apache/http/auth/AuthScheme;)V
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lorg/apache/http/auth/AuthState;->setCredentials(Lorg/apache/http/auth/Credentials;)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
