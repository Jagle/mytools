package com.wukongtv.wkhelper.c; class e { void a() { int a;
a=0;// .class public final Lcom/wukongtv/wkhelper/c/e;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public a:Ljava/lang/String;
a=0;// 
a=0;// .field public b:Ljava/lang/String;
a=0;// 
a=0;// .field public c:Ljava/lang/String;
a=0;// 
a=0;// .field public d:Ljava/lang/String;
a=0;// 
a=0;// .field public e:I
a=0;// 
a=0;// .field public f:Z
a=0;// 
a=0;// .field public g:J
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/c/e;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/wukongtv/wkhelper/c/e;->f:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a([Lcom/wukongtv/wkhelper/c/e;)Ljava/lang/String;
a=0;//     .locals 10
a=0;// 
a=0;//     new-instance v1, Lorg/json/JSONArray;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/json/JSONArray;);
a=0;//     invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lorg/json/JSONArray;);
a=0;//     array-length v2, p0
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     if-ge v0, v2, :cond_2
a=0;// 
a=0;//     aget-object v3, p0, v0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v3=(Null);
a=0;//     new-instance v4, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v4=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v5, "pkg"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     iget-object v6, v3, Lcom/wukongtv/wkhelper/c/e;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v5, "dir"
a=0;// 
a=0;//     iget-object v6, v3, Lcom/wukongtv/wkhelper/c/e;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v5, "label"
a=0;// 
a=0;//     iget-object v6, v3, Lcom/wukongtv/wkhelper/c/e;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v5, "version"
a=0;// 
a=0;//     iget-object v6, v3, Lcom/wukongtv/wkhelper/c/e;->d:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v5, "version_code"
a=0;// 
a=0;//     iget v6, v3, Lcom/wukongtv/wkhelper/c/e;->e:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;// 
a=0;//     iget-boolean v5, v3, Lcom/wukongtv/wkhelper/c/e;->f:Z
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     const-string v5, "inactive"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
a=0;// 
a=0;//     :cond_0
a=0;//     #v5=(Conflicted);v6=(Integer);
a=0;//     iget-wide v6, v3, Lcom/wukongtv/wkhelper/c/e;->g:J
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     const-wide/16 v8, 0x0
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     cmp-long v5, v6, v8
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     const-string v5, "size"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     iget-wide v6, v3, Lcom/wukongtv/wkhelper/c/e;->g:J
a=0;// 
a=0;//     invoke-virtual {v4, v5, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
a=0;// 
a=0;//     :cond_1
a=0;//     #v5=(Conflicted);
a=0;//     invoke-virtual {v1, v4}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_1
a=0;//     #v3=(Reference,Lorg/json/JSONException;);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);
a=0;//     invoke-virtual {v1}, Lorg/json/JSONArray;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Integer);v3=(Null);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Lorg/json/JSONException;);
a=0;//     goto :goto_1
a=0;// .end method
}}
