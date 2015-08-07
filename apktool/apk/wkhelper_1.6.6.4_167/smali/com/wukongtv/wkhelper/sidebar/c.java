package com.wukongtv.wkhelper.sidebar; class c { void a() { int a;
a=0;// .class public final Lcom/wukongtv/wkhelper/sidebar/c;
a=0;// .super Lcom/b/a/a/o;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic c:Lcom/wukongtv/wkhelper/sidebar/b;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/wukongtv/wkhelper/sidebar/b;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/wukongtv/wkhelper/sidebar/c;->c:Lcom/wukongtv/wkhelper/sidebar/b;
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/b/a/a/o;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/sidebar/c;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(I[Lorg/apache/http/Header;Lorg/json/JSONObject;)V
a=0;//     .locals 4
a=0;// 
a=0;//     invoke-super {p0, p1, p2, p3}, Lcom/b/a/a/o;->a(I[Lorg/apache/http/Header;Lorg/json/JSONObject;)V
a=0;// 
a=0;//     if-eqz p3, :cond_1
a=0;// 
a=0;//     :try_start_0
a=0;//     const-string v0, "status"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     const-string v0, "data"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/sidebar/c;->c:Lcom/wukongtv/wkhelper/sidebar/b;
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/sidebar/b;);
a=0;//     new-instance v2, Lcom/wukongtv/wkhelper/sidebar/e;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/wukongtv/wkhelper/sidebar/e;);
a=0;//     invoke-direct {v2, v0}, Lcom/wukongtv/wkhelper/sidebar/e;-><init>(Lorg/json/JSONObject;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/wukongtv/wkhelper/sidebar/e;);
a=0;//     invoke-static {v1, v2}, Lcom/wukongtv/wkhelper/sidebar/b;->a(Lcom/wukongtv/wkhelper/sidebar/b;Lcom/wukongtv/wkhelper/sidebar/e;)Lcom/wukongtv/wkhelper/sidebar/e;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/sidebar/c;->c:Lcom/wukongtv/wkhelper/sidebar/b;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/sidebar/b;->a(Lcom/wukongtv/wkhelper/sidebar/b;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/sidebar/c;->c:Lcom/wukongtv/wkhelper/sidebar/b;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/sidebar/b;->a(Lcom/wukongtv/wkhelper/sidebar/b;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "mySharedPreferences"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "last_pull_remote_time"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/sidebar/c;->c:Lcom/wukongtv/wkhelper/sidebar/b;
a=0;// 
a=0;//     #v2=(Reference,Lcom/wukongtv/wkhelper/sidebar/b;);
a=0;//     invoke-static {v2}, Lcom/wukongtv/wkhelper/sidebar/b;->b(Lcom/wukongtv/wkhelper/sidebar/b;)Lcom/wukongtv/wkhelper/sidebar/e;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-wide v2, v2, Lcom/wukongtv/wkhelper/sidebar/e;->c:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     const-string v1, "image1_url"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/sidebar/c;->c:Lcom/wukongtv/wkhelper/sidebar/b;
a=0;// 
a=0;//     #v2=(Reference,Lcom/wukongtv/wkhelper/sidebar/b;);
a=0;//     invoke-static {v2}, Lcom/wukongtv/wkhelper/sidebar/b;->b(Lcom/wukongtv/wkhelper/sidebar/b;)Lcom/wukongtv/wkhelper/sidebar/e;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v2, v2, Lcom/wukongtv/wkhelper/sidebar/e;->e:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     const-string v1, "image2_url"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/sidebar/c;->c:Lcom/wukongtv/wkhelper/sidebar/b;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/wukongtv/wkhelper/sidebar/b;->b(Lcom/wukongtv/wkhelper/sidebar/b;)Lcom/wukongtv/wkhelper/sidebar/e;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v2, v2, Lcom/wukongtv/wkhelper/sidebar/e;->f:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     const-string v1, "image3_url"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/sidebar/c;->c:Lcom/wukongtv/wkhelper/sidebar/b;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/wukongtv/wkhelper/sidebar/b;->b(Lcom/wukongtv/wkhelper/sidebar/b;)Lcom/wukongtv/wkhelper/sidebar/e;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v2, v2, Lcom/wukongtv/wkhelper/sidebar/e;->g:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     const-string v1, "image4_url"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/sidebar/c;->c:Lcom/wukongtv/wkhelper/sidebar/b;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/wukongtv/wkhelper/sidebar/b;->b(Lcom/wukongtv/wkhelper/sidebar/b;)Lcom/wukongtv/wkhelper/sidebar/e;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v2, v2, Lcom/wukongtv/wkhelper/sidebar/e;->h:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     const-string v1, "day_x"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/sidebar/c;->c:Lcom/wukongtv/wkhelper/sidebar/b;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/wukongtv/wkhelper/sidebar/b;->b(Lcom/wukongtv/wkhelper/sidebar/b;)Lcom/wukongtv/wkhelper/sidebar/e;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget v2, v2, Lcom/wukongtv/wkhelper/sidebar/e;->i:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     const-string v1, "day_y"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/sidebar/c;->c:Lcom/wukongtv/wkhelper/sidebar/b;
a=0;// 
a=0;//     #v2=(Reference,Lcom/wukongtv/wkhelper/sidebar/b;);
a=0;//     invoke-static {v2}, Lcom/wukongtv/wkhelper/sidebar/b;->b(Lcom/wukongtv/wkhelper/sidebar/b;)Lcom/wukongtv/wkhelper/sidebar/e;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget v2, v2, Lcom/wukongtv/wkhelper/sidebar/e;->j:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/sidebar/c;->c:Lcom/wukongtv/wkhelper/sidebar/b;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/sidebar/b;->c(Lcom/wukongtv/wkhelper/sidebar/b;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
}}
