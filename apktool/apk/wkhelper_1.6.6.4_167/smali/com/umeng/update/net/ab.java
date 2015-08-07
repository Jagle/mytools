package com.umeng.update.net; class ab { void a() { int a;
a=0;// .class final Lcom/umeng/update/net/ab;
a=0;// .super Landroid/os/AsyncTask;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Landroid/content/Context;
a=0;// 
a=0;// .field private b:Ljava/lang/String;
a=0;// 
a=0;// .field private c:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private d:I
a=0;// 
a=0;// .field private e:Z
a=0;// 
a=0;// .field private f:Lcom/umeng/update/net/z;
a=0;// 
a=0;// .field private g:Landroid/view/animation/Animation;
a=0;// 
a=0;// .field private h:Z
a=0;// 
a=0;// .field private i:Ljava/io/File;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/widget/ImageView;Ljava/lang/String;I)V
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/umeng/update/net/ab;);
a=0;//     iput-object v0, p0, Lcom/umeng/update/net/ab;->i:Ljava/io/File;
a=0;// 
a=0;//     iput-object p1, p0, Lcom/umeng/update/net/ab;->a:Landroid/content/Context;
a=0;// 
a=0;//     iput-object p3, p0, Lcom/umeng/update/net/ab;->b:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/umeng/update/net/ab;->f:Lcom/umeng/update/net/z;
a=0;// 
a=0;//     iput p4, p0, Lcom/umeng/update/net/ab;->d:I
a=0;// 
a=0;//     iput-boolean v1, p0, Lcom/umeng/update/net/ab;->e:Z
a=0;// 
a=0;//     iput-object v0, p0, Lcom/umeng/update/net/ab;->g:Landroid/view/animation/Animation;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/umeng/update/net/ab;->c:Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-boolean v1, p0, Lcom/umeng/update/net/ab;->h:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private varargs a()Landroid/graphics/drawable/Drawable;
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     sget-boolean v0, Lcom/umeng/update/net/x;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const-wide/16 v2, 0xbb8
a=0;// 
a=0;//     :try_start_0
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/ab;->i:Ljava/io/File;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/ab;->i:Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/ab;->i:Ljava/io/File;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/umeng/update/net/x;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     iget-object v1, p0, Lcom/umeng/update/net/ab;->i:Ljava/io/File;
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     :cond_1
a=0;//     invoke-static {}, Lcom/umeng/update/net/x;->b()Ljava/lang/String;
a=0;// 
a=0;//     :goto_1
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Boolean);v1=(Null);v2=(LongLo);v3=(LongHi);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/InterruptedException;);
a=0;//     invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/ab;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     iget-object v2, p0, Lcom/umeng/update/net/ab;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v2}, Lcom/umeng/update/net/x;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/ab;->a:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/umeng/update/net/ab;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0, v2}, Lcom/umeng/update/net/x;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/umeng/update/net/x;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_2
a=0;//     #v2=(Conflicted);
a=0;//     invoke-static {}, Lcom/umeng/update/net/x;->b()Ljava/lang/String;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-static {}, Lcom/umeng/update/net/x;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3, v0}, La/b/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Reference,Ljava/io/File;);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/umeng/update/net/ab;->a()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected final synthetic onPostExecute(Ljava/lang/Object;)V
a=0;//     .locals 7
a=0;// 
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/ab;->c:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     iget-boolean v2, p0, Lcom/umeng/update/net/ab;->e:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     iget-object v3, p0, Lcom/umeng/update/net/ab;->f:Lcom/umeng/update/net/z;
a=0;// 
a=0;//     #v3=(Reference,Lcom/umeng/update/net/z;);
a=0;//     iget-object v4, p0, Lcom/umeng/update/net/ab;->g:Landroid/view/animation/Animation;
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/animation/Animation;);
a=0;//     iget-boolean v5, p0, Lcom/umeng/update/net/ab;->h:Z
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     iget-object v6, p0, Lcom/umeng/update/net/ab;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v0 .. v6}, Lcom/umeng/update/net/x;->a(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;ZLcom/umeng/update/net/z;Landroid/view/animation/Animation;ZLjava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected final onPreExecute()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-super {p0}, Landroid/os/AsyncTask;->onPreExecute()V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
