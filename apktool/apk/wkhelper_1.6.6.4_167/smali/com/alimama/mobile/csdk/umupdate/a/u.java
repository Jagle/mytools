package com.alimama.mobile.csdk.umupdate.a; class u { void a() { int a;
a=0;// .class public final Lcom/alimama/mobile/csdk/umupdate/a/u;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/umeng/update/net/u;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/alimama/mobile/csdk/umupdate/a/t;
a=0;// 
a=0;// .field private b:Ljava/lang/String;
a=0;// 
a=0;// .field private c:Lcom/umeng/update/net/m;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/alimama/mobile/csdk/umupdate/a/t;)V
a=0;//     .locals 1
a=0;// 
a=0;//     iput-object p1, p0, Lcom/alimama/mobile/csdk/umupdate/a/u;->a:Lcom/alimama/mobile/csdk/umupdate/a/t;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/alimama/mobile/csdk/umupdate/a/u;);
a=0;//     invoke-static {p1}, Lcom/alimama/mobile/csdk/umupdate/a/t;->a(Lcom/alimama/mobile/csdk/umupdate/a/t;)Lcom/alimama/mobile/csdk/umupdate/models/Promoter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/alimama/mobile/csdk/umupdate/models/Promoter;);
a=0;//     iget-object v0, v0, Lcom/alimama/mobile/csdk/umupdate/models/Promoter;->q:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/u;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {p1}, Lcom/alimama/mobile/csdk/umupdate/a/t;->b(Lcom/alimama/mobile/csdk/umupdate/a/t;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/umeng/update/net/m;->a(Landroid/content/Context;)Lcom/umeng/update/net/m;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/u;->c:Lcom/umeng/update/net/m;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a()V
a=0;//     .locals 8
a=0;// 
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-static {}, Lcom/alimama/mobile/csdk/umupdate/a/t;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     const-string v2, "XpDownloadListener.onStart"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     aput-object v2, v1, v7
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/alimama/mobile/csdk/umupdate/a/p;->a(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     sget-boolean v0, Lcom/alimama/mobile/csdk/umupdate/a/o;->g:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/u;->a:Lcom/alimama/mobile/csdk/umupdate/a/t;
a=0;// 
a=0;//     #v0=(Reference,Lcom/alimama/mobile/csdk/umupdate/a/t;);
a=0;//     invoke-static {v0}, Lcom/alimama/mobile/csdk/umupdate/a/t;->b(Lcom/alimama/mobile/csdk/umupdate/a/t;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Lcom/alimama/mobile/b;->a()Lcom/alimama/mobile/b;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v2, v2, Lcom/alimama/mobile/b;->c:Lcom/alimama/mobile/csdk/umupdate/a/q;
a=0;// 
a=0;//     iget-object v3, v2, Lcom/alimama/mobile/csdk/umupdate/a/q;->b:Landroid/content/res/Resources;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/res/Resources;);
a=0;//     const-string v4, "tb_munion_tip_download_prefix"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "string"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     iget-object v6, v2, Lcom/alimama/mobile/csdk/umupdate/a/q;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4, v5, v6}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget-object v2, v2, Lcom/alimama/mobile/csdk/umupdate/a/q;->b:Landroid/content/res/Resources;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/alimama/mobile/csdk/umupdate/a/u;->a:Lcom/alimama/mobile/csdk/umupdate/a/t;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/alimama/mobile/csdk/umupdate/a/t;->a(Lcom/alimama/mobile/csdk/umupdate/a/t;)Lcom/alimama/mobile/csdk/umupdate/models/Promoter;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v2, v2, Lcom/alimama/mobile/csdk/umupdate/models/Promoter;->l:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/u;->a:Lcom/alimama/mobile/csdk/umupdate/a/t;
a=0;// 
a=0;//     #v0=(Reference,Lcom/alimama/mobile/csdk/umupdate/a/t;);
a=0;//     invoke-static {v0}, Lcom/alimama/mobile/csdk/umupdate/a/t;->c(Lcom/alimama/mobile/csdk/umupdate/a/t;)Lcom/alimama/mobile/csdk/umupdate/b/d;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     new-instance v0, Lcom/alimama/mobile/csdk/umupdate/b/c;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/alimama/mobile/csdk/umupdate/b/c;);
a=0;//     invoke-direct {v0}, Lcom/alimama/mobile/csdk/umupdate/b/c;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/alimama/mobile/csdk/umupdate/b/c;);
a=0;//     iget-object v1, p0, Lcom/alimama/mobile/csdk/umupdate/a/u;->a:Lcom/alimama/mobile/csdk/umupdate/a/t;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/alimama/mobile/csdk/umupdate/a/t;->c(Lcom/alimama/mobile/csdk/umupdate/a/t;)Lcom/alimama/mobile/csdk/umupdate/b/d;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/alimama/mobile/csdk/umupdate/b/c;->a(La/b/g;La/b/e;)V
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/u;->c:Lcom/umeng/update/net/m;
a=0;// 
a=0;//     const-string v1, "xp"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/alimama/mobile/csdk/umupdate/a/u;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/umeng/update/net/m;->a(Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final a(I)V
a=0;//     .locals 4
a=0;// 
a=0;//     invoke-static {}, Lcom/alimama/mobile/csdk/umupdate/a/t;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const-string v3, "XpDownloadListener.onProgressUpdate"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/alimama/mobile/csdk/umupdate/a/p;->a(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final a(ILjava/lang/String;)V
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     invoke-static {}, Lcom/alimama/mobile/csdk/umupdate/a/t;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-array v1, v5, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "XpDownloadListener.onEndresult = "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " file = "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     aput-object v2, v1, v6
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/alimama/mobile/csdk/umupdate/a/p;->a(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     if-ne p1, v5, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/alimama/mobile/csdk/umupdate/a/u;->c:Lcom/umeng/update/net/m;
a=0;// 
a=0;//     const-string v1, "xp"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/alimama/mobile/csdk/umupdate/a/u;->b:Ljava/lang/String;
a=0;// 
a=0;//     const-string v3, "cp=? and url=?"
a=0;// 
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     new-array v4, v4, [Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/String;);
a=0;//     aput-object v1, v4, v6
a=0;// 
a=0;//     aput-object v2, v4, v5
a=0;// 
a=0;//     iget-object v0, v0, Lcom/umeng/update/net/m;->b:Lcom/umeng/update/net/n;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/umeng/update/net/n;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v5, "umeng_download_task_list"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v5, v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "delete("
a=0;// 
a=0;//     invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ", "
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ")"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final b(I)V
a=0;//     .locals 0
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
