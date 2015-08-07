package com.b.a.a; class q { void a() { int a;
a=0;// .class final Lcom/b/a/a/q;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Ljava/lang/Object;
a=0;// 
a=0;// .field final synthetic b:Lcom/b/a/a/p;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/b/a/a/p;Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/b/a/a/q;->b:Lcom/b/a/a/p;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/b/a/a/q;->a:Ljava/lang/Object;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/b/a/a/q;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final run()V
a=0;//     .locals 4
a=0;// 
a=0;//     iget-object v0, p0, Lcom/b/a/a/q;->a:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     instance-of v0, v0, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/b/a/a/q;->b:Lcom/b/a/a/p;
a=0;// 
a=0;//     #v0=(Reference,Lcom/b/a/a/p;);
a=0;//     iget-object v1, v0, Lcom/b/a/a/p;->d:Lcom/b/a/a/o;
a=0;// 
a=0;//     #v1=(Reference,Lcom/b/a/a/o;);
a=0;//     iget-object v0, p0, Lcom/b/a/a/q;->b:Lcom/b/a/a/p;
a=0;// 
a=0;//     iget v2, v0, Lcom/b/a/a/p;->b:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget-object v0, p0, Lcom/b/a/a/q;->b:Lcom/b/a/a/p;
a=0;// 
a=0;//     iget-object v3, v0, Lcom/b/a/a/p;->c:[Lorg/apache/http/Header;
a=0;// 
a=0;//     #v3=(Reference,[Lorg/apache/http/Header;);
a=0;//     iget-object v0, p0, Lcom/b/a/a/q;->a:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, Lorg/json/JSONObject;
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3, v0}, Lcom/b/a/a/o;->a(I[Lorg/apache/http/Header;Lorg/json/JSONObject;)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v0, p0, Lcom/b/a/a/q;->a:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     instance-of v0, v0, Lorg/json/JSONArray;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const-string v0, "JsonHttpResponseHandler"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "onSuccess(int, Header[], JSONArray) was not overriden, but callback was received"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/b/a/a/q;->a:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     instance-of v0, v0, Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/b/a/a/q;->b:Lcom/b/a/a/p;
a=0;// 
a=0;//     #v0=(Reference,Lcom/b/a/a/p;);
a=0;//     iget-object v0, v0, Lcom/b/a/a/p;->d:Lcom/b/a/a/o;
a=0;// 
a=0;//     new-instance v1, Lorg/json/JSONException;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/json/JSONException;);
a=0;//     const-string v2, "Response cannot be parsed as JSON data"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Lorg/json/JSONException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lorg/json/JSONException;);
a=0;//     invoke-virtual {v0, v1}, Lcom/b/a/a/o;->b(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     new-instance v0, Lorg/json/JSONException;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/json/JSONException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Unexpected response type "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lcom/b/a/a/q;->a:Ljava/lang/Object;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Lorg/json/JSONException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONException;);
a=0;//     invoke-static {v0}, Lcom/b/a/a/o;->a(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
