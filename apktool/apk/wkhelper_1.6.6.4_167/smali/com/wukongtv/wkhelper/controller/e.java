package com.wukongtv.wkhelper.controller; class e { void a() { int a;
a=0;// .class final Lcom/wukongtv/wkhelper/controller/e;
a=0;// .super Landroid/os/AsyncTask;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/wukongtv/wkhelper/controller/b;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Lcom/wukongtv/wkhelper/controller/b;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/wukongtv/wkhelper/controller/e;->a:Lcom/wukongtv/wkhelper/controller/b;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/controller/e;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Lcom/wukongtv/wkhelper/controller/b;B)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lcom/wukongtv/wkhelper/controller/e;-><init>(Lcom/wukongtv/wkhelper/controller/b;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/controller/e;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private varargs a()Lcom/wukongtv/wkhelper/controller/a;
a=0;//     .locals 5
a=0;// 
a=0;//     sget-object v2, Lcom/wukongtv/wkhelper/controller/a;->a:[Ljava/lang/Class;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Class;);
a=0;//     array-length v3, v2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);v4=(Conflicted);
a=0;//     if-ge v1, v3, :cond_1
a=0;// 
a=0;//     aget-object v0, v2, v1
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/wukongtv/wkhelper/controller/a;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/wukongtv/wkhelper/controller/e;->a:Lcom/wukongtv/wkhelper/controller/b;
a=0;// 
a=0;//     #v4=(Reference,Lcom/wukongtv/wkhelper/controller/b;);
a=0;//     invoke-static {v4}, Lcom/wukongtv/wkhelper/controller/b;->b(Lcom/wukongtv/wkhelper/controller/b;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Lcom/wukongtv/wkhelper/controller/a;->a(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     iget-object v4, p0, Lcom/wukongtv/wkhelper/controller/e;->a:Lcom/wukongtv/wkhelper/controller/b;
a=0;// 
a=0;//     #v4=(Reference,Lcom/wukongtv/wkhelper/controller/b;);
a=0;//     invoke-static {v4}, Lcom/wukongtv/wkhelper/controller/b;->b(Lcom/wukongtv/wkhelper/controller/b;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Lcom/wukongtv/wkhelper/controller/a;->b(Landroid/content/Context;)Lcom/wukongtv/wkhelper/controller/a;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_1
a=0;//     #v4=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/InstantiationException;->printStackTrace()V
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_2
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/IllegalAccessException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/wukongtv/wkhelper/controller/e;->a()Lcom/wukongtv/wkhelper/controller/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/controller/a;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected final synthetic onPostExecute(Ljava/lang/Object;)V
a=0;//     .locals 3
a=0;// 
a=0;//     check-cast p1, Lcom/wukongtv/wkhelper/controller/a;
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/controller/e;->a:Lcom/wukongtv/wkhelper/controller/b;
a=0;// 
a=0;//     invoke-static {v0, p1}, Lcom/wukongtv/wkhelper/controller/b;->a(Lcom/wukongtv/wkhelper/controller/b;Lcom/wukongtv/wkhelper/controller/a;)Lcom/wukongtv/wkhelper/controller/a;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/controller/e;->a:Lcom/wukongtv/wkhelper/controller/b;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/controller/b;->a(Lcom/wukongtv/wkhelper/controller/b;)Lcom/wukongtv/wkhelper/controller/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/controller/e;->a:Lcom/wukongtv/wkhelper/controller/b;
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/controller/b;);
a=0;//     invoke-static {v1}, Lcom/wukongtv/wkhelper/controller/b;->b(Lcom/wukongtv/wkhelper/controller/b;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/wukongtv/wkhelper/controller/a;->c(Landroid/content/Context;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/controller/e;->a:Lcom/wukongtv/wkhelper/controller/b;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/controller/b;->a(Lcom/wukongtv/wkhelper/controller/b;)Lcom/wukongtv/wkhelper/controller/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/wukongtv/wkhelper/controller/a;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/controller/b;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/controller/e;->a:Lcom/wukongtv/wkhelper/controller/b;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/controller/b;->b(Lcom/wukongtv/wkhelper/controller/b;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "TV_CONTROL_MODULE"
a=0;// 
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/controller/b;->d()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v2}, Lcom/umeng/a/f;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/controller/e;->a:Lcom/wukongtv/wkhelper/controller/b;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/controller/b;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v0, v1}, Lcom/wukongtv/wkhelper/controller/b;->a(Lcom/wukongtv/wkhelper/controller/b;Z)Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected final onPreExecute()V
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/controller/e;->a:Lcom/wukongtv/wkhelper/controller/b;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/controller/b;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-static {v0, v1}, Lcom/wukongtv/wkhelper/controller/b;->a(Lcom/wukongtv/wkhelper/controller/b;Z)Z
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
