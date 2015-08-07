package com.wukongtv.wkhelper.CleanCache; class g { void a() { int a;
a=0;// .class final Lcom/wukongtv/wkhelper/CleanCache/g;
a=0;// .super Landroid/os/AsyncTask;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/wukongtv/wkhelper/CleanCache/g;->a:Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/CleanCache/g;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;B)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lcom/wukongtv/wkhelper/CleanCache/g;-><init>(Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/CleanCache/g;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 5
a=0;// 
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/CleanCache/g;->a:Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;);
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;->k(Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;)Lcom/wukongtv/wkhelper/CleanCache/a;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/CleanCache/a;);
a=0;//     invoke-virtual {v1}, Lcom/wukongtv/wkhelper/CleanCache/a;->a()V
a=0;// 
a=0;//     iput-wide v2, v1, Lcom/wukongtv/wkhelper/CleanCache/a;->d:J
a=0;// 
a=0;//     iput-wide v2, v1, Lcom/wukongtv/wkhelper/CleanCache/a;->g:J
a=0;// 
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/a/h;->a(Ljava/io/File;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     invoke-virtual {v1, v0, v4}, Lcom/wukongtv/wkhelper/CleanCache/a;->b(Ljava/io/File;I)J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     iput-wide v2, v1, Lcom/wukongtv/wkhelper/CleanCache/a;->d:J
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     iget-object v0, v1, Lcom/wukongtv/wkhelper/CleanCache/a;->e:Lcom/wukongtv/wkhelper/CleanCache/e;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, v1, Lcom/wukongtv/wkhelper/CleanCache/a;->e:Lcom/wukongtv/wkhelper/CleanCache/e;
a=0;// 
a=0;//     invoke-interface {v0, v4}, Lcom/wukongtv/wkhelper/CleanCache/e;->a(I)V
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/CleanCache/a;);v3=(LongHi);
a=0;//     const-string v0, "Download"
a=0;// 
a=0;//     invoke-static {v0}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/a/h;->a(Ljava/io/File;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     invoke-virtual {v1, v0, v4}, Lcom/wukongtv/wkhelper/CleanCache/a;->b(Ljava/io/File;I)J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     iput-wide v2, v1, Lcom/wukongtv/wkhelper/CleanCache/a;->d:J
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v2=(Boolean);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Reference,Ljava/io/File;);v2=(Conflicted);
a=0;//     iget-object v2, v1, Lcom/wukongtv/wkhelper/CleanCache/a;->e:Lcom/wukongtv/wkhelper/CleanCache/e;
a=0;// 
a=0;//     #v2=(Reference,Lcom/wukongtv/wkhelper/CleanCache/e;);
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     iget-object v2, v1, Lcom/wukongtv/wkhelper/CleanCache/a;->e:Lcom/wukongtv/wkhelper/CleanCache/e;
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-interface {v2, v3}, Lcom/wukongtv/wkhelper/CleanCache/e;->a(I)V
a=0;// 
a=0;//     :cond_4
a=0;//     #v3=(Conflicted);
a=0;//     invoke-virtual {v1, v0, v4}, Lcom/wukongtv/wkhelper/CleanCache/a;->a(Ljava/io/File;I)V
a=0;// 
a=0;//     iget-object v0, v1, Lcom/wukongtv/wkhelper/CleanCache/a;->e:Lcom/wukongtv/wkhelper/CleanCache/e;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, v1, Lcom/wukongtv/wkhelper/CleanCache/a;->e:Lcom/wukongtv/wkhelper/CleanCache/e;
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-interface {v0, v1}, Lcom/wukongtv/wkhelper/CleanCache/e;->a(I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method protected final onPreExecute()V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-super {p0}, Landroid/os/AsyncTask;->onPreExecute()V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/CleanCache/g;->a:Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;);
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;->m(Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;)Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/CleanCache/g;->a:Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;->g(Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;)Landroid/widget/ImageView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/CleanCache/g;->a:Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;->g(Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;)Landroid/widget/ImageView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/CleanCache/g;->a:Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;);
a=0;//     invoke-static {v1}, Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;->m(Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;)Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/CleanCache/g;->a:Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;->h(Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;)Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/CleanCache/g;->a:Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;->h(Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;)Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
