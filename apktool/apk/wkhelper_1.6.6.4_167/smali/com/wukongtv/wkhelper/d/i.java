package com.wukongtv.wkhelper.d; class i { void a() { int a;
a=0;// .class final Lcom/wukongtv/wkhelper/d/i;
a=0;// .super Landroid/os/AsyncTask;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/wukongtv/wkhelper/d/a;
a=0;// 
a=0;// .field private b:Lcom/wukongtv/wkhelper/d/g;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/wukongtv/wkhelper/d/a;Lcom/wukongtv/wkhelper/d/g;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/wukongtv/wkhelper/d/i;->a:Lcom/wukongtv/wkhelper/d/a;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/d/i;);
a=0;//     iput-object p2, p0, Lcom/wukongtv/wkhelper/d/i;->b:Lcom/wukongtv/wkhelper/d/g;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private varargs a()Ljava/lang/Boolean;
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     new-array v0, v3, [Ljava/lang/Integer;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Integer;);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v1, v0, v4
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/wukongtv/wkhelper/d/i;->publishProgress([Ljava/lang/Object;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/d/i;->b:Lcom/wukongtv/wkhelper/d/g;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/d/a;->a(Lcom/wukongtv/wkhelper/d/g;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/d/i;->a:Lcom/wukongtv/wkhelper/d/a;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/d/a;);
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/d/a;->e(Lcom/wukongtv/wkhelper/d/a;)V
a=0;// 
a=0;//     new-array v0, v3, [Ljava/lang/Integer;
a=0;// 
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v1, v0, v4
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/wukongtv/wkhelper/d/i;->publishProgress([Ljava/lang/Object;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/d/i;->b:Lcom/wukongtv/wkhelper/d/g;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/wukongtv/wkhelper/d/g;->a:Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v2=(Uninit);
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-string v1, "android.intent.action.VIEW"
a=0;// 
a=0;//     invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/d/i;->b:Lcom/wukongtv/wkhelper/d/g;
a=0;// 
a=0;//     iget-object v1, v1, Lcom/wukongtv/wkhelper/d/g;->a:Ljava/io/File;
a=0;// 
a=0;//     invoke-static {v1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "application/vnd.android.package-archive"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     const/high16 v1, 0x10000000
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/d/i;->a:Lcom/wukongtv/wkhelper/d/a;
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/d/a;);
a=0;//     invoke-static {v1}, Lcom/wukongtv/wkhelper/d/a;->d(Lcom/wukongtv/wkhelper/d/a;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/d/i;->a:Lcom/wukongtv/wkhelper/d/a;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/d/a;->e(Lcom/wukongtv/wkhelper/d/a;)V
a=0;// 
a=0;//     new-array v0, v3, [Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v1, v0, v4
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/wukongtv/wkhelper/d/i;->publishProgress([Ljava/lang/Object;)V
a=0;// 
a=0;//     invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/wukongtv/wkhelper/d/i;->a()Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Boolean;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected final bridge synthetic onPostExecute(Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected final synthetic onProgressUpdate([Ljava/lang/Object;)V
a=0;//     .locals 3
a=0;// 
a=0;//     check-cast p1, [Ljava/lang/Integer;
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     aget-object v0, p1, v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/d/i;->a:Lcom/wukongtv/wkhelper/d/a;
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/d/a;);
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/d/i;->b:Lcom/wukongtv/wkhelper/d/g;
a=0;// 
a=0;//     #v2=(Reference,Lcom/wukongtv/wkhelper/d/g;);
a=0;//     invoke-static {v1, v2, v0}, Lcom/wukongtv/wkhelper/d/a;->a(Lcom/wukongtv/wkhelper/d/a;Lcom/wukongtv/wkhelper/d/g;I)V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
