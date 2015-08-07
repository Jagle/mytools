package com.wukongtv.wkupdate.lib; class f { void a() { int a;
a=0;// .class final Lcom/wukongtv/wkupdate/lib/f;
a=0;// .super Landroid/os/AsyncTask;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/wukongtv/wkupdate/lib/UpdateService;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Lcom/wukongtv/wkupdate/lib/UpdateService;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/wukongtv/wkupdate/lib/f;->a:Lcom/wukongtv/wkupdate/lib/UpdateService;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkupdate/lib/f;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Lcom/wukongtv/wkupdate/lib/UpdateService;B)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lcom/wukongtv/wkupdate/lib/f;-><init>(Lcom/wukongtv/wkupdate/lib/UpdateService;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkupdate/lib/f;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private varargs a([Ljava/lang/String;)Ljava/io/File;
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkupdate/lib/f;->a:Lcom/wukongtv/wkupdate/lib/UpdateService;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkupdate/lib/UpdateService;);
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkupdate/lib/UpdateService;->a(Lcom/wukongtv/wkupdate/lib/UpdateService;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkupdate/lib/f;->a:Lcom/wukongtv/wkupdate/lib/UpdateService;
a=0;// 
a=0;//     #v2=(Reference,Lcom/wukongtv/wkupdate/lib/UpdateService;);
a=0;//     invoke-static {v2}, Lcom/wukongtv/wkupdate/lib/UpdateService;->b(Lcom/wukongtv/wkupdate/lib/UpdateService;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     :cond_0
a=0;//     const-string v0, "enqueue download request"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-array v2, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     invoke-static {v0, v2}, Lcom/wukongtv/wkupdate/lib/g;->a(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkupdate/lib/f;->a:Lcom/wukongtv/wkupdate/lib/UpdateService;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkupdate/lib/UpdateService;->a(Lcom/wukongtv/wkupdate/lib/UpdateService;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkupdate/lib/f;->a:Lcom/wukongtv/wkupdate/lib/UpdateService;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkupdate/lib/UpdateService;->b(Lcom/wukongtv/wkupdate/lib/UpdateService;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkupdate/lib/f;->a:Lcom/wukongtv/wkupdate/lib/UpdateService;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2, v4}, Ljava/io/File;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v3, v2}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v4=(Conflicted);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     aget-object v2, p1, v2
a=0;// 
a=0;//     invoke-static {v2, v0}, Lcom/wukongtv/wkupdate/lib/e;->a(Ljava/lang/String;Ljava/io/FileOutputStream;)Z
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
a=0;// 
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Reference,Ljava/io/File;);v4=(Boolean);
a=0;//     new-instance v0, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     new-instance v4, Ljava/io/File;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v4, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     invoke-direct {v0, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/FileOutputStream;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     check-cast p1, [Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lcom/wukongtv/wkupdate/lib/f;->a([Ljava/lang/String;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected final synthetic onPostExecute(Ljava/lang/Object;)V
a=0;//     .locals 1
a=0;// 
a=0;//     check-cast p1, Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkupdate/lib/f;->a:Lcom/wukongtv/wkupdate/lib/UpdateService;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkupdate/lib/UpdateService;);
a=0;//     invoke-static {v0, p1}, Lcom/wukongtv/wkupdate/lib/UpdateService;->a(Lcom/wukongtv/wkupdate/lib/UpdateService;Ljava/io/File;)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
