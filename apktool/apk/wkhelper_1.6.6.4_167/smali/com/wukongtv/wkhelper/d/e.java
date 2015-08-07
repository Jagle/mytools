package com.wukongtv.wkhelper.d; class e { void a() { int a;
a=0;// .class final Lcom/wukongtv/wkhelper/d/e;
a=0;// .super Lcom/b/a/a/n;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field f:Lcom/wukongtv/wkhelper/d/g;
a=0;// 
a=0;// .field final synthetic g:Lcom/wukongtv/wkhelper/d/a;
a=0;// 
a=0;// .field private h:J
a=0;// 
a=0;// .field private i:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/wukongtv/wkhelper/d/a;Lcom/wukongtv/wkhelper/d/g;)V
a=0;//     .locals 2
a=0;// 
a=0;//     iput-object p1, p0, Lcom/wukongtv/wkhelper/d/e;->g:Lcom/wukongtv/wkhelper/d/a;
a=0;// 
a=0;//     iget-object v0, p2, Lcom/wukongtv/wkhelper/d/g;->a:Ljava/io/File;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-direct {p0, v0}, Lcom/b/a/a/n;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/d/e;);
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/wukongtv/wkhelper/d/e;->h:J
a=0;// 
a=0;//     const/16 v0, 0x3e8
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     iput v0, p0, Lcom/wukongtv/wkhelper/d/e;->i:I
a=0;// 
a=0;//     iput-object p2, p0, Lcom/wukongtv/wkhelper/d/e;->f:Lcom/wukongtv/wkhelper/d/g;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(II)V
a=0;//     .locals 6
a=0;// 
a=0;//     mul-int/lit8 v0, p1, 0x64
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     div-int/2addr v0, p2
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/d/e;->g:Lcom/wukongtv/wkhelper/d/a;
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/d/a;);
a=0;//     invoke-static {v1}, Lcom/wukongtv/wkhelper/d/a;->g(Lcom/wukongtv/wkhelper/d/a;)Landroid/widget/ProgressBar;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/ProgressBar;->setProgress(I)V
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/d/e;->g:Lcom/wukongtv/wkhelper/d/a;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/d/e;->f:Lcom/wukongtv/wkhelper/d/g;
a=0;// 
a=0;//     #v2=(Reference,Lcom/wukongtv/wkhelper/d/g;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-static {v1, v2, v3}, Lcom/wukongtv/wkhelper/d/a;->a(Lcom/wukongtv/wkhelper/d/a;Lcom/wukongtv/wkhelper/d/g;I)V
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iget-wide v4, p0, Lcom/wukongtv/wkhelper/d/e;->h:J
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     sub-long/2addr v2, v4
a=0;// 
a=0;//     iget v1, p0, Lcom/wukongtv/wkhelper/d/e;->i:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-long v4, v1
a=0;// 
a=0;//     cmp-long v1, v2, v4
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/h/a;->a()Lcom/wukongtv/wkhelper/h/a;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/h/a;);
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/d/e;->f:Lcom/wukongtv/wkhelper/d/g;
a=0;// 
a=0;//     #v2=(Reference,Lcom/wukongtv/wkhelper/d/g;);
a=0;//     iget-object v2, v2, Lcom/wukongtv/wkhelper/d/g;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v0, v2}, Lcom/wukongtv/wkhelper/h/a;->a(ILjava/lang/String;)V
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/wukongtv/wkhelper/d/e;->h:J
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final c()V
a=0;//     .locals 3
a=0;// 
a=0;//     invoke-super {p0}, Lcom/b/a/a/n;->c()V
a=0;// 
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/h/a;->a()Lcom/wukongtv/wkhelper/h/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/h/a;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/d/e;->f:Lcom/wukongtv/wkhelper/d/g;
a=0;// 
a=0;//     #v2=(Reference,Lcom/wukongtv/wkhelper/d/g;);
a=0;//     iget-object v2, v2, Lcom/wukongtv/wkhelper/d/g;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/wukongtv/wkhelper/h/a;->a(ILjava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final g()V
a=0;//     .locals 3
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/d/e;->g:Lcom/wukongtv/wkhelper/d/a;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/d/a;);
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/d/a;->e(Lcom/wukongtv/wkhelper/d/a;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/d/e;->g:Lcom/wukongtv/wkhelper/d/a;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/d/e;->f:Lcom/wukongtv/wkhelper/d/g;
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/d/g;);
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-static {v0, v1, v2}, Lcom/wukongtv/wkhelper/d/a;->a(Lcom/wukongtv/wkhelper/d/a;Lcom/wukongtv/wkhelper/d/g;I)V
a=0;// 
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/h/a;->a()Lcom/wukongtv/wkhelper/h/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/d/e;->f:Lcom/wukongtv/wkhelper/d/g;
a=0;// 
a=0;//     #v2=(Reference,Lcom/wukongtv/wkhelper/d/g;);
a=0;//     iget-object v2, v2, Lcom/wukongtv/wkhelper/d/g;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/wukongtv/wkhelper/h/a;->a(ILjava/lang/String;)V
a=0;// 
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/g/a;->a()Lcom/wukongtv/wkhelper/g/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/d/e;->f:Lcom/wukongtv/wkhelper/d/g;
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/d/g;);
a=0;//     iget-object v1, v1, Lcom/wukongtv/wkhelper/d/g;->c:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/wukongtv/wkhelper/g/a;->a(Ljava/lang/String;I)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final h()V
a=0;//     .locals 4
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/d/i;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/d/i;);
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/d/e;->g:Lcom/wukongtv/wkhelper/d/a;
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/d/a;);
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/d/e;->f:Lcom/wukongtv/wkhelper/d/g;
a=0;// 
a=0;//     #v2=(Reference,Lcom/wukongtv/wkhelper/d/g;);
a=0;//     invoke-direct {v0, v1, v2}, Lcom/wukongtv/wkhelper/d/i;-><init>(Lcom/wukongtv/wkhelper/d/a;Lcom/wukongtv/wkhelper/d/g;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/d/i;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Ljava/lang/Void;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Void;);
a=0;//     invoke-virtual {v0, v1}, Lcom/wukongtv/wkhelper/d/i;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
a=0;// 
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/h/a;->a()Lcom/wukongtv/wkhelper/h/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/16 v1, 0x64
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/d/e;->f:Lcom/wukongtv/wkhelper/d/g;
a=0;// 
a=0;//     iget-object v2, v2, Lcom/wukongtv/wkhelper/d/g;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/wukongtv/wkhelper/h/a;->a(ILjava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/d/e;->g:Lcom/wukongtv/wkhelper/d/a;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/d/a;->c(Lcom/wukongtv/wkhelper/d/a;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Lcom/wukongtv/wkhelper/d/j;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/wukongtv/wkhelper/d/j;);
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/d/e;->g:Lcom/wukongtv/wkhelper/d/a;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/wukongtv/wkhelper/d/a;->d(Lcom/wukongtv/wkhelper/d/a;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/wukongtv/wkhelper/d/e;->f:Lcom/wukongtv/wkhelper/d/g;
a=0;// 
a=0;//     #v3=(Reference,Lcom/wukongtv/wkhelper/d/g;);
a=0;//     iget-object v3, v3, Lcom/wukongtv/wkhelper/d/g;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v1, v2, v3}, Lcom/wukongtv/wkhelper/d/j;-><init>(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/d/j;);
a=0;//     const-wide/32 v2, 0xea60
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
