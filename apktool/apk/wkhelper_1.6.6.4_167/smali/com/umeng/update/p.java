package com.umeng.update; class p { void a() { int a;
a=0;// .class public Lcom/umeng/update/p;
a=0;// .super La/b/l;
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/io/Serializable;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public a:Z
a=0;// 
a=0;// .field public b:Ljava/lang/String;
a=0;// 
a=0;// .field public c:Ljava/lang/String;
a=0;// 
a=0;// .field public d:Ljava/lang/String;
a=0;// 
a=0;// .field public e:Ljava/lang/String;
a=0;// 
a=0;// .field public f:Ljava/lang/String;
a=0;// 
a=0;// .field public g:Ljava/lang/String;
a=0;// 
a=0;// .field public h:Ljava/lang/String;
a=0;// 
a=0;// .field public i:Z
a=0;// 
a=0;// .field public j:Ljava/lang/String;
a=0;// 
a=0;// .field public k:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lorg/json/JSONObject;)V
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1}, La/b/l;-><init>(Lorg/json/JSONObject;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/umeng/update/p;);
a=0;//     iput-boolean v0, p0, Lcom/umeng/update/p;->a:Z
a=0;// 
a=0;//     iput-object v1, p0, Lcom/umeng/update/p;->b:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/umeng/update/p;->c:Ljava/lang/String;
a=0;// 
a=0;//     iput-boolean v0, p0, Lcom/umeng/update/p;->i:Z
a=0;// 
a=0;//     :try_start_0
a=0;//     const-string v0, "Yes"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "update"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, p0, Lcom/umeng/update/p;->a:Z
a=0;// 
a=0;//     iget-boolean v0, p0, Lcom/umeng/update/p;->a:Z
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const-string v0, "update_log"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/umeng/update/p;->b:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "version"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/umeng/update/p;->c:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "path"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/umeng/update/p;->d:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "target_size"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/umeng/update/p;->h:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "new_md5"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/umeng/update/p;->f:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "delta"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, p0, Lcom/umeng/update/p;->i:Z
a=0;// 
a=0;//     const-string v0, "display_ads"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, p0, Lcom/umeng/update/p;->k:Z
a=0;// 
a=0;//     iget-boolean v0, p0, Lcom/umeng/update/p;->i:Z
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const-string v0, "patch_md5"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/umeng/update/p;->j:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "size"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/umeng/update/p;->g:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "origin"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/umeng/update/p;->e:Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/String;);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(Landroid/content/Context;Z)Ljava/lang/String;
a=0;//     .locals 11
a=0;// 
a=0;//     const/4 v10, 0x4
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     const/4 v9, 0x3
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     const/4 v8, 0x2
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-static {p1}, La/b/c;->a(Landroid/content/Context;)La/b/c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,La/b/c;);
a=0;//     const-string v1, "UMNewVersion"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, La/b/c;->d(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {p1}, La/b/c;->a(Landroid/content/Context;)La/b/c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,La/b/c;);
a=0;//     const-string v2, "UMTargetSize"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, La/b/c;->d(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {p1}, La/b/c;->a(Landroid/content/Context;)La/b/c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,La/b/c;);
a=0;//     const-string v3, "UMUpdateSize"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, La/b/c;->d(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1}, La/b/c;->a(Landroid/content/Context;)La/b/c;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "UMUpdateContent"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, La/b/c;->d(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1}, La/b/c;->a(Landroid/content/Context;)La/b/c;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "UMDialog_InstallAPK"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, La/b/c;->d(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     const-string v0, "%s %s\n%s\n\n%s\n%s\n"
a=0;// 
a=0;//     const/4 v2, 0x5
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     aput-object v1, v2, v6
a=0;// 
a=0;//     iget-object v1, p0, Lcom/umeng/update/p;->c:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v1, v2, v7
a=0;// 
a=0;//     aput-object v4, v2, v8
a=0;// 
a=0;//     aput-object v3, v2, v9
a=0;// 
a=0;//     iget-object v1, p0, Lcom/umeng/update/p;->b:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v1, v2, v10
a=0;// 
a=0;//     invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     iget-boolean v4, p0, Lcom/umeng/update/p;->i:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     const-string v4, "\n%s %s"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     new-array v5, v8, [Ljava/lang/Object;
a=0;// 
a=0;//     aput-object v0, v5, v6
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/p;->g:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, La/b/p;->c(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     aput-object v0, v5, v7
a=0;// 
a=0;//     invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_1
a=0;//     #v4=(Conflicted);
a=0;//     const-string v4, "%s %s\n%s %s%s\n\n%s\n%s\n"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const/4 v5, 0x7
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     new-array v5, v5, [Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     aput-object v1, v5, v6
a=0;// 
a=0;//     iget-object v1, p0, Lcom/umeng/update/p;->c:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v1, v5, v7
a=0;// 
a=0;//     aput-object v2, v5, v8
a=0;// 
a=0;//     iget-object v1, p0, Lcom/umeng/update/p;->h:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v1}, La/b/p;->c(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     aput-object v1, v5, v9
a=0;// 
a=0;//     aput-object v0, v5, v10
a=0;// 
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     aput-object v3, v5, v0
a=0;// 
a=0;//     const/4 v0, 0x6
a=0;// 
a=0;//     iget-object v1, p0, Lcom/umeng/update/p;->b:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v1, v5, v0
a=0;// 
a=0;//     invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v4=(Boolean);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
