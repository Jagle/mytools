package com.alimama.mobile.csdk.umupdate.b; class b { void a() { int a;
a=0;// .class public final Lcom/alimama/mobile/csdk/umupdate/b/b;
a=0;// .super La/b/j;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, La/b/j;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/alimama/mobile/csdk/umupdate/b/b;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(Lcom/alimama/mobile/csdk/umupdate/b/f;)Lcom/alimama/mobile/csdk/umupdate/b/g;
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v4, v0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     move v1, v4
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/alimama/mobile/csdk/umupdate/b/g;);v1=(Integer);v2=(Conflicted);v3=(Conflicted);
a=0;//     sget-object v2, Lcom/alimama/mobile/csdk/umupdate/b/a;->a:[Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     array-length v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v1, v2, :cond_2
a=0;// 
a=0;//     sget-object v0, Lcom/alimama/mobile/csdk/umupdate/b/a;->a:[Ljava/lang/String;
a=0;// 
a=0;//     aget-object v0, v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p1, Lcom/alimama/mobile/csdk/umupdate/b/f;->d:Ljava/lang/String;
a=0;// 
a=0;//     sget-object v0, Lcom/alimama/mobile/csdk/umupdate/a/s;->a:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     sget-object v0, Lcom/alimama/mobile/csdk/umupdate/a/s;->a:Ljava/util/Map;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Map;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gtz v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     sput-object v0, Lcom/alimama/mobile/csdk/umupdate/a/s;->a:Ljava/util/Map;
a=0;// 
a=0;//     const-string v2, "Accept-Encoding"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "gzip"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     sget-object v0, Lcom/alimama/mobile/csdk/umupdate/a/s;->a:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     iput-object v0, p0, La/b/j;->c:Ljava/util/Map;
a=0;// 
a=0;//     const-class v0, Lcom/alimama/mobile/csdk/umupdate/b/g;
a=0;// 
a=0;//     invoke-virtual {p0, p1, v0}, La/b/j;->a(La/b/k;Ljava/lang/Class;)La/b/l;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/alimama/mobile/csdk/umupdate/b/g;
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-object v2, v0, Lcom/alimama/mobile/csdk/umupdate/b/g;->b:Lorg/json/JSONObject;
a=0;// 
a=0;//     #v2=(Reference,Lorg/json/JSONObject;);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_3
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
