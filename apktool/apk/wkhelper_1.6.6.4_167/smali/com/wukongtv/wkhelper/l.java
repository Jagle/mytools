package com.wukongtv.wkhelper; class l { void a() { int a;
a=0;// .class final Lcom/wukongtv/wkhelper/l;
a=0;// .super Lcom/b/a/a/ag;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic c:Lcom/wukongtv/wkhelper/MainActivity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/wukongtv/wkhelper/MainActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/wukongtv/wkhelper/l;->c:Lcom/wukongtv/wkhelper/MainActivity;
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/b/a/a/ag;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/l;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(Ljava/lang/String;)V
a=0;//     .locals 7
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/l;->c:Lcom/wukongtv/wkhelper/MainActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/MainActivity;);
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/MainActivity;->a(Lcom/wukongtv/wkhelper/MainActivity;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     new-instance v0, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v1, "data"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "name"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, "unknown"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v2, 0x5
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-gt v0, v2, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/l;->c:Lcom/wukongtv/wkhelper/MainActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/MainActivity;);
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/MainActivity;->o(Lcom/wukongtv/wkhelper/MainActivity;)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, "lastDevices"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/l;->c:Lcom/wukongtv/wkhelper/MainActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/MainActivity;->l(Lcom/wukongtv/wkhelper/MainActivity;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/l;->c:Lcom/wukongtv/wkhelper/MainActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/MainActivity;->l(Lcom/wukongtv/wkhelper/MainActivity;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/l;->c:Lcom/wukongtv/wkhelper/MainActivity;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/wukongtv/wkhelper/MainActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/high16 v2, 0x7f080000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     array-length v3, v2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     if-ge v0, v3, :cond_2
a=0;// 
a=0;//     aget-object v4, v2, v0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     iget-object v5, p0, Lcom/wukongtv/wkhelper/l;->c:Lcom/wukongtv/wkhelper/MainActivity;
a=0;// 
a=0;//     #v5=(Reference,Lcom/wukongtv/wkhelper/MainActivity;);
a=0;//     invoke-static {v5}, Lcom/wukongtv/wkhelper/MainActivity;->l(Lcom/wukongtv/wkhelper/MainActivity;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/l;->c:Lcom/wukongtv/wkhelper/MainActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/MainActivity;);
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/MainActivity;->p(Lcom/wukongtv/wkhelper/MainActivity;)Landroid/widget/ArrayAdapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/ArrayAdapter;->notifyDataSetChanged()V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/l;->c:Lcom/wukongtv/wkhelper/MainActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/MainActivity;->m(Lcom/wukongtv/wkhelper/MainActivity;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/l;->c:Lcom/wukongtv/wkhelper/MainActivity;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/wukongtv/wkhelper/MainActivity;->a(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONException;);
a=0;//     invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final b(Ljava/lang/Throwable;)V
a=0;//     .locals 0
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
