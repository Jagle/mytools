package com.wukongtv.wkupdate.lib; class j { void a() { int a;
a=0;// .class final Lcom/wukongtv/wkupdate/lib/j;
a=0;// .super Landroid/os/AsyncTask;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/wukongtv/wkupdate/lib/g;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Lcom/wukongtv/wkupdate/lib/g;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/wukongtv/wkupdate/lib/j;->a:Lcom/wukongtv/wkupdate/lib/g;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkupdate/lib/j;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Lcom/wukongtv/wkupdate/lib/g;B)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lcom/wukongtv/wkupdate/lib/j;-><init>(Lcom/wukongtv/wkupdate/lib/g;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkupdate/lib/j;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private varargs a([Lcom/wukongtv/wkupdate/lib/h;)Lcom/wukongtv/wkupdate/lib/h;
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     aget-object v0, p1, v4
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iget-object v0, v0, Lcom/wukongtv/wkupdate/lib/h;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "requesting %s"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-array v2, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     aput-object v0, v2, v4
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/wukongtv/wkupdate/lib/g;->a(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkupdate/lib/g;->a(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     const-string v0, "returned %s"
a=0;// 
a=0;//     new-array v2, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     aput-object v3, v2, v4
a=0;// 
a=0;//     invoke-static {v0, v2}, Lcom/wukongtv/wkupdate/lib/g;->a(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     :try_start_0
a=0;//     const-string v0, "ver"
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     aget-object v0, p1, v0
a=0;// 
a=0;//     iget v0, v0, Lcom/wukongtv/wkupdate/lib/h;->a:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-le v2, v0, :cond_1
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkupdate/lib/h;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkupdate/lib/h;);
a=0;//     iget-object v3, p0, Lcom/wukongtv/wkupdate/lib/j;->a:Lcom/wukongtv/wkupdate/lib/g;
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     invoke-direct {v0, v3, v4}, Lcom/wukongtv/wkupdate/lib/h;-><init>(Lcom/wukongtv/wkupdate/lib/g;B)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkupdate/lib/h;);
a=0;//     const-string v3, "addr"
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iput-object v3, v0, Lcom/wukongtv/wkupdate/lib/h;->b:Ljava/lang/String;
a=0;// 
a=0;//     iput v2, v0, Lcom/wukongtv/wkupdate/lib/h;->a:I
a=0;// 
a=0;//     const-string v2, "notes"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     const-string v2, "notes"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v0, Lcom/wukongtv/wkupdate/lib/h;->c:Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v3=(Reference,Ujava/lang/Object;);
a=0;//     move-exception v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     check-cast p1, [Lcom/wukongtv/wkupdate/lib/h;
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lcom/wukongtv/wkupdate/lib/j;->a([Lcom/wukongtv/wkupdate/lib/h;)Lcom/wukongtv/wkupdate/lib/h;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkupdate/lib/h;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected final synthetic onPostExecute(Ljava/lang/Object;)V
a=0;//     .locals 4
a=0;// 
a=0;//     check-cast p1, Lcom/wukongtv/wkupdate/lib/h;
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkupdate/lib/j;->a:Lcom/wukongtv/wkupdate/lib/g;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkupdate/lib/g;);
a=0;//     iget-object v1, p1, Lcom/wukongtv/wkupdate/lib/h;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget v2, p1, Lcom/wukongtv/wkupdate/lib/h;->a:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget-object v3, p1, Lcom/wukongtv/wkupdate/lib/h;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v2, v3}, Lcom/wukongtv/wkupdate/lib/g;->a(Lcom/wukongtv/wkupdate/lib/g;Ljava/lang/String;ILjava/lang/String;)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkupdate/lib/j;->a:Lcom/wukongtv/wkupdate/lib/g;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkupdate/lib/g;);
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkupdate/lib/g;->a(Lcom/wukongtv/wkupdate/lib/g;)Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkupdate/lib/j;->a:Lcom/wukongtv/wkupdate/lib/g;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkupdate/lib/g;->a(Lcom/wukongtv/wkupdate/lib/g;)Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkupdate/lib/j;->a:Lcom/wukongtv/wkupdate/lib/g;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkupdate/lib/g;->a(Lcom/wukongtv/wkupdate/lib/g;)Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
}}
