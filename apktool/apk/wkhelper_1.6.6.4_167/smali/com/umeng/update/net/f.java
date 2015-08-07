package com.umeng.update.net; class f { void a() { int a;
a=0;// .class final Lcom/umeng/update/net/f;
a=0;// .super Ljava/lang/Thread;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field a:I
a=0;// 
a=0;// .field final synthetic b:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;// .field private c:Landroid/content/Context;
a=0;// 
a=0;// .field private d:Z
a=0;// 
a=0;// .field private e:Ljava/io/File;
a=0;// 
a=0;// .field private f:I
a=0;// 
a=0;// .field private g:J
a=0;// 
a=0;// .field private h:J
a=0;// 
a=0;// .field private i:I
a=0;// 
a=0;// .field private j:Lcom/umeng/update/net/e;
a=0;// 
a=0;// .field private k:Lcom/umeng/update/net/k;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/umeng/update/net/DownloadingService;Landroid/content/Context;Lcom/umeng/update/net/k;IILcom/umeng/update/net/e;)V
a=0;//     .locals 6
a=0;// 
a=0;//     const-wide/16 v4, -0x1
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object p1, p0, Lcom/umeng/update/net/f;->b:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/umeng/update/net/f;);
a=0;//     iput v0, p0, Lcom/umeng/update/net/f;->f:I
a=0;// 
a=0;//     iput-wide v4, p0, Lcom/umeng/update/net/f;->g:J
a=0;// 
a=0;//     iput-wide v4, p0, Lcom/umeng/update/net/f;->h:J
a=0;// 
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Lcom/umeng/update/net/f;->a:I
a=0;// 
a=0;//     :try_start_0
a=0;//     iput-object p2, p0, Lcom/umeng/update/net/f;->c:Landroid/content/Context;
a=0;// 
a=0;//     iput-object p3, p0, Lcom/umeng/update/net/f;->k:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     iput p5, p0, Lcom/umeng/update/net/f;->f:I
a=0;// 
a=0;//     invoke-static {}, Lcom/umeng/update/net/DownloadingService;->b()Landroid/util/SparseArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/util/SparseArray;);
a=0;//     invoke-virtual {v0, p4}, Landroid/util/SparseArray;->indexOfKey(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ltz v0, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/umeng/update/net/DownloadingService;->b()Landroid/util/SparseArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/util/SparseArray;);
a=0;//     invoke-virtual {v0, p4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/umeng/update/net/s;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/umeng/update/net/s;->f:[J
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     array-length v1, v0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-le v1, v2, :cond_0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     aget-wide v2, v0, v1
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iput-wide v2, p0, Lcom/umeng/update/net/f;->g:J
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     aget-wide v0, v0, v1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/umeng/update/net/f;->h:J
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iput-object p6, p0, Lcom/umeng/update/net/f;->j:Lcom/umeng/update/net/e;
a=0;// 
a=0;//     iput p4, p0, Lcom/umeng/update/net/f;->i:I
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     new-array v0, v0, [Z
a=0;// 
a=0;//     #v0=(Reference,[Z);
a=0;//     const-string v1, "/apk"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, p2, v0}, Lcom/umeng/update/net/x;->a(Ljava/lang/String;Landroid/content/Context;[Z)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/umeng/update/net/f;->e:Ljava/io/File;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     aget-boolean v0, v0, v1
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, p0, Lcom/umeng/update/net/f;->d:Z
a=0;// 
a=0;//     iget-boolean v0, p0, Lcom/umeng/update/net/f;->d:Z
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     const-wide/32 v0, 0x6400000
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iget-object v2, p0, Lcom/umeng/update/net/f;->e:Ljava/io/File;
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     const-wide/32 v4, 0xf731400
a=0;// 
a=0;//     invoke-static {v2, v0, v1, v4, v5}, Lcom/umeng/update/net/x;->a(Ljava/io/File;JJ)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/f;->k:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/update/net/k;);
a=0;//     iget-object v0, v0, Lcom/umeng/update/net/k;->e:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v1, p0, Lcom/umeng/update/net/f;->k:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     #v1=(Reference,Lcom/umeng/update/net/k;);
a=0;//     iget-object v1, v1, Lcom/umeng/update/net/k;->e:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ".apk.tmp"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_1
a=0;//     iget-object v1, p0, Lcom/umeng/update/net/f;->k:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     iget-object v1, v1, Lcom/umeng/update/net/k;->a:Ljava/lang/String;
a=0;// 
a=0;//     const-string v2, "delta_update"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     const-string v1, ".apk"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, ".patch"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     iget-object v2, p0, Lcom/umeng/update/net/f;->e:Ljava/io/File;
a=0;// 
a=0;//     invoke-direct {v1, v2, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     iput-object v1, p0, Lcom/umeng/update/net/f;->e:Ljava/io/File;
a=0;// 
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Null);
a=0;//     const-wide/32 v0, 0xa00000
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Reference,Ljava/lang/String;);v2=(Reference,Ljava/io/File;);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v1, p0, Lcom/umeng/update/net/f;->k:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     #v1=(Reference,Lcom/umeng/update/net/k;);
a=0;//     iget-object v1, v1, Lcom/umeng/update/net/k;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v1}, La/b/p;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ".apk.tmp"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-static {}, Lcom/umeng/update/net/DownloadingService;->a()Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v0}, La/b/b;->a(Ljava/lang/String;Ljava/lang/Exception;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/f;->j:Lcom/umeng/update/net/e;
a=0;// 
a=0;//     iget v1, p0, Lcom/umeng/update/net/f;->i:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-interface {v0, v1}, Lcom/umeng/update/net/e;->b(I)V
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/umeng/update/net/f;)Landroid/content/Context;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/f;->c:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/lang/Exception;)V
a=0;//     .locals 8
a=0;// 
a=0;//     invoke-static {}, Lcom/umeng/update/net/DownloadingService;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "can not install. "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, La/b/b;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/f;->j:Lcom/umeng/update/net/e;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/f;->j:Lcom/umeng/update/net/e;
a=0;// 
a=0;//     iget v1, p0, Lcom/umeng/update/net/f;->i:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-interface {v0, v1}, Lcom/umeng/update/net/e;->b(I)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/f;->b:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/umeng/update/net/DownloadingService;->a(Lcom/umeng/update/net/DownloadingService;)Lcom/umeng/update/net/p;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/umeng/update/net/f;->k:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     #v1=(Reference,Lcom/umeng/update/net/k;);
a=0;//     iget-wide v2, p0, Lcom/umeng/update/net/f;->g:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iget-wide v4, p0, Lcom/umeng/update/net/f;->h:J
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     iget v6, p0, Lcom/umeng/update/net/f;->f:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     int-to-long v6, v6
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     invoke-virtual/range {v0 .. v7}, Lcom/umeng/update/net/p;->a(Lcom/umeng/update/net/k;JJJ)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Z)V
a=0;//     .locals 11
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/f;->e:Ljava/io/File;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v2=(Null);
a=0;//     new-instance v1, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     iget-object v4, p0, Lcom/umeng/update/net/f;->e:Ljava/io/File;
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     invoke-direct {v1, v4, v5}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_22
a=0;//     .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1e
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_9
a=0;// 
a=0;//     :try_start_1
a=0;//     #v1=(Reference,Ljava/io/FileOutputStream;);
a=0;//     iget-boolean v2, p0, Lcom/umeng/update/net/f;->d:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_23
a=0;// 
a=0;//     iget-object v2, p0, Lcom/umeng/update/net/f;->e:Ljava/io/File;
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lcom/umeng/update/net/x;->a(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_23
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
a=0;// 
a=0;//     iget-object v2, p0, Lcom/umeng/update/net/f;->c:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     const v4, 0x8003
a=0;// 
a=0;//     #v4=(Char);
a=0;//     invoke-virtual {v2, v0, v4}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_23
a=0;//     .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1f
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_a
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :try_start_2
a=0;//     iget-object v2, p0, Lcom/umeng/update/net/f;->c:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/umeng/update/net/f;->e:Ljava/io/File;
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_24
a=0;//     .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_20
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_b
a=0;// 
a=0;//     move-object v8, v1
a=0;// 
a=0;//     :goto_0
a=0;//     :try_start_3
a=0;//     #v2=(Conflicted);v4=(Conflicted);v8=(Reference,Ljava/io/FileOutputStream;);
a=0;//     invoke-static {}, Lcom/umeng/update/net/DownloadingService;->a()Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "saveAPK: url = %1$15s\t|\tfilename = %2$15s"
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iget-object v4, p0, Lcom/umeng/update/net/f;->k:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     #v4=(Reference,Lcom/umeng/update/net/k;);
a=0;//     iget-object v4, v4, Lcom/umeng/update/net/k;->c:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v4, v1, v2
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     iget-object v4, p0, Lcom/umeng/update/net/f;->e:Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     aput-object v4, v1, v2
a=0;// 
a=0;//     invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     new-instance v0, Ljava/net/URL;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/net/URL;);
a=0;//     iget-object v1, p0, Lcom/umeng/update/net/f;->k:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     iget-object v1, v1, Lcom/umeng/update/net/k;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/URL;);
a=0;//     iget-object v1, p0, Lcom/umeng/update/net/f;->e:Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v2, "Accept-Encoding"
a=0;// 
a=0;//     const-string v4, "identity"
a=0;// 
a=0;//     invoke-virtual {v0, v2, v4}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v2, "Connection"
a=0;// 
a=0;//     const-string v4, "keep-alive"
a=0;// 
a=0;//     invoke-virtual {v0, v2, v4}, Ljava/net/HttpURLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const/16 v2, 0x1388
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     invoke-virtual {v0, v2}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V
a=0;// 
a=0;//     const/16 v2, 0x2710
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     const-wide/16 v6, 0x0
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     cmp-long v2, v4, v6
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-lez v2, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/umeng/update/net/DownloadingService;->a()Ljava/lang/String;
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v4, p0, Lcom/umeng/update/net/f;->k:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     #v4=(Reference,Lcom/umeng/update/net/k;);
a=0;//     iget-object v4, v4, Lcom/umeng/update/net/k;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v4, " getFileLength: %1$15s"
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     new-array v4, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v6
a=0;// 
a=0;//     invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Long;);
a=0;//     aput-object v6, v4, v5
a=0;// 
a=0;//     invoke-static {v2, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     const-string v2, "Range"
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "bytes="
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v6
a=0;// 
a=0;//     #v6=(LongLo);
a=0;//     invoke-virtual {v4, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v4, "-"
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v2, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-virtual {v0}, Ljava/net/HttpURLConnection;->connect()V
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
a=0;//     :try_end_3
a=0;//     .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_25
a=0;//     .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_21
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_c
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/io/InputStream;);
a=0;//     if-nez p1, :cond_2
a=0;// 
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     :try_start_4
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iget-object v1, p0, Lcom/umeng/update/net/f;->e:Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     iget-object v1, p0, Lcom/umeng/update/net/f;->e:Ljava/io/File;
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     const-wide/16 v6, 0x0
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     cmp-long v1, v4, v6
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-lez v1, :cond_1
a=0;// 
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/umeng/update/net/f;->e:Ljava/io/File;
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     add-long/2addr v2, v4
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     iput-wide v2, p0, Lcom/umeng/update/net/f;->g:J
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getContentLength()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-long v4, v1
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     add-long/2addr v2, v4
a=0;// 
a=0;//     iput-wide v2, p0, Lcom/umeng/update/net/f;->h:J
a=0;// 
a=0;//     invoke-static {}, Lcom/umeng/update/net/DownloadingService;->a()Ljava/lang/String;
a=0;// 
a=0;//     const-string v1, "getFileLength: %1$15s"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iget-wide v4, p0, Lcom/umeng/update/net/f;->g:J
a=0;// 
a=0;//     invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Long;);
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {}, Lcom/umeng/update/net/DownloadingService;->a()Ljava/lang/String;
a=0;// 
a=0;//     const-string v1, "getConnectionLength: %1$15s"
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getContentLength()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v0, v2, v3
a=0;// 
a=0;//     invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {}, Lcom/umeng/update/net/DownloadingService;->a()Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "getContentLength: %1$15s"
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iget-wide v4, p0, Lcom/umeng/update/net/f;->h:J
a=0;// 
a=0;//     #v4=(LongLo);
a=0;//     invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Long;);
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     const/16 v0, 0x1000
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     new-array v4, v0, [B
a=0;// 
a=0;//     #v4=(Reference,[B);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-static {}, Lcom/umeng/update/net/DownloadingService;->a()Ljava/lang/String;
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v3, p0, Lcom/umeng/update/net/f;->k:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     iget-object v3, v3, Lcom/umeng/update/net/k;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "saveAPK getContentLength "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-wide v6, p0, Lcom/umeng/update/net/f;->h:J
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/umeng/update/net/f;->c:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/umeng/update/net/m;->a(Landroid/content/Context;)Lcom/umeng/update/net/m;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/umeng/update/net/f;->k:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     iget-object v3, v3, Lcom/umeng/update/net/k;->a:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v5, p0, Lcom/umeng/update/net/f;->k:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     #v5=(Reference,Lcom/umeng/update/net/k;);
a=0;//     iget-object v5, v5, Lcom/umeng/update/net/k;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3, v5}, Lcom/umeng/update/net/m;->a(Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);v2=(Conflicted);v3=(Conflicted);v6=(Conflicted);v7=(Conflicted);v10=(Conflicted);
a=0;//     iget v2, p0, Lcom/umeng/update/net/f;->a:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-gez v2, :cond_22
a=0;// 
a=0;//     invoke-virtual {v9, v4}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-lez v2, :cond_22
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v8, v4, v3, v2}, Ljava/io/FileOutputStream;->write([BII)V
a=0;// 
a=0;//     iget-wide v6, p0, Lcom/umeng/update/net/f;->g:J
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     int-to-long v2, v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     add-long/2addr v2, v6
a=0;// 
a=0;//     iput-wide v2, p0, Lcom/umeng/update/net/f;->g:J
a=0;// 
a=0;//     add-int/lit8 v3, v0, 0x1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     rem-int/lit8 v0, v0, 0x32
a=0;// 
a=0;//     if-nez v0, :cond_21
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/f;->c:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, La/b/a;->d(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_5
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_2
a=0;//     #v2=(Conflicted);v3=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-virtual {v9}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/io/FileOutputStream;->close()V
a=0;// 
a=0;//     iget v1, p0, Lcom/umeng/update/net/f;->a:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     if-ne v1, v2, :cond_c
a=0;// 
a=0;//     invoke-static {}, Lcom/umeng/update/net/DownloadingService;->b()Landroid/util/SparseArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/util/SparseArray;);
a=0;//     iget v1, p0, Lcom/umeng/update/net/f;->i:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/umeng/update/net/s;
a=0;// 
a=0;//     iget-object v1, v0, Lcom/umeng/update/net/s;->f:[J
a=0;// 
a=0;//     #v1=(Reference,[J);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iget-wide v4, p0, Lcom/umeng/update/net/f;->g:J
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     aput-wide v4, v1, v2
a=0;// 
a=0;//     iget-object v1, v0, Lcom/umeng/update/net/s;->f:[J
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     iget-wide v4, p0, Lcom/umeng/update/net/f;->h:J
a=0;// 
a=0;//     aput-wide v4, v1, v2
a=0;// 
a=0;//     iget-object v0, v0, Lcom/umeng/update/net/s;->f:[J
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iget v2, p0, Lcom/umeng/update/net/f;->f:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-long v2, v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     aput-wide v2, v0, v1
a=0;//     :try_end_4
a=0;//     .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
a=0;//     .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_3
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_2
a=0;// 
a=0;//     if-eqz v9, :cond_3
a=0;// 
a=0;//     :try_start_5
a=0;//     invoke-virtual {v9}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_5
a=0;//     .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_6
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_0
a=0;// 
a=0;//     :cond_3
a=0;//     if-eqz v8, :cond_4
a=0;// 
a=0;//     :try_start_6
a=0;//     invoke-virtual {v8}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_6
a=0;//     .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5
a=0;// 
a=0;//     :cond_4
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_5
a=0;//     :try_start_7
a=0;//     #v0=(Boolean);v1=(One);v2=(LongLo);v3=(Integer);v4=(Reference,[B);v5=(Reference,Ljava/lang/String;);v6=(LongLo);v7=(LongHi);v8=(Reference,Ljava/io/FileOutputStream;);v9=(Reference,Ljava/io/InputStream;);
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/f;->c:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, La/b/a;->c(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_7
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/f;->k:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/update/net/k;);
a=0;//     iget-boolean v0, v0, Lcom/umeng/update/net/k;->i:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     invoke-static {}, Lcom/umeng/update/net/DownloadingService;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "no wifi"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, La/b/b;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     new-instance v0, Ljava/io/IOException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/IOException;);
a=0;//     const-string v1, "no wifi"
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     throw v0
a=0;//     :try_end_7
a=0;//     .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_0
a=0;//     .catch Landroid/os/RemoteException; {:try_start_7 .. :try_end_7} :catch_3
a=0;//     .catchall {:try_start_7 .. :try_end_7} :catchall_2
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     move-object v2, v8
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/FileOutputStream;);
a=0;//     move-object v3, v9
a=0;// 
a=0;//     :goto_4
a=0;//     :try_start_8
a=0;//     #v3=(Reference,Ljava/io/InputStream;);v8=(Conflicted);v9=(Conflicted);
a=0;//     invoke-static {}, Lcom/umeng/update/net/DownloadingService;->a()Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0, v1}, La/b/b;->a(Ljava/lang/String;Ljava/lang/Exception;)V
a=0;// 
a=0;//     iget v0, p0, Lcom/umeng/update/net/f;->f:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     iput v0, p0, Lcom/umeng/update/net/f;->f:I
a=0;// 
a=0;//     const/4 v4, 0x3
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     if-le v0, v4, :cond_1a
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/f;->k:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/update/net/k;);
a=0;//     iget-boolean v0, v0, Lcom/umeng/update/net/k;->g:Z
a=0;//     :try_end_8
a=0;//     .catchall {:try_start_8 .. :try_end_8} :catchall_4
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1a
a=0;// 
a=0;//     :try_start_9
a=0;//     invoke-static {}, Lcom/umeng/update/net/DownloadingService;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "Download Fail out of max repeat count"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v4}, La/b/b;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-static {}, Lcom/umeng/update/net/DownloadingService;->c()Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v4, p0, Lcom/umeng/update/net/f;->k:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/os/Messenger;
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v5, 0x5
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-static {v4, v5, v6, v7}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/os/Message;);
a=0;//     invoke-virtual {v0, v4}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
a=0;//     :try_end_9
a=0;//     .catch Landroid/os/RemoteException; {:try_start_9 .. :try_end_9} :catch_12
a=0;//     .catchall {:try_start_9 .. :try_end_9} :catchall_5
a=0;// 
a=0;//     :try_start_a
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/f;->b:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/umeng/update/net/DownloadingService;->a(Lcom/umeng/update/net/DownloadingService;)Lcom/umeng/update/net/p;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v4, p0, Lcom/umeng/update/net/f;->c:Landroid/content/Context;
a=0;// 
a=0;//     iget v5, p0, Lcom/umeng/update/net/f;->i:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v0, v4, v5}, Lcom/umeng/update/net/p;->a(Landroid/content/Context;I)V
a=0;// 
a=0;//     invoke-direct {p0, v1}, Lcom/umeng/update/net/f;->a(Ljava/lang/Exception;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/f;->b:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/umeng/update/net/DownloadingService;->d(Lcom/umeng/update/net/DownloadingService;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Lcom/umeng/update/net/g;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/umeng/update/net/g;);
a=0;//     invoke-direct {v1, p0}, Lcom/umeng/update/net/g;-><init>(Lcom/umeng/update/net/f;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/umeng/update/net/g;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;//     :try_end_a
a=0;//     .catchall {:try_start_a .. :try_end_a} :catchall_4
a=0;// 
a=0;//     :goto_5
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     if-eqz v3, :cond_6
a=0;// 
a=0;//     :try_start_b
a=0;//     invoke-virtual {v3}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_b
a=0;//     .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_14
a=0;//     .catchall {:try_start_b .. :try_end_b} :catchall_6
a=0;// 
a=0;//     :cond_6
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     :try_start_c
a=0;//     invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_c
a=0;//     .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_1
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :catch_1
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :cond_7
a=0;//     :try_start_d
a=0;//     #v0=(Boolean);v1=(One);v2=(LongLo);v3=(Integer);v4=(Reference,[B);v5=(Reference,Ljava/lang/String;);v6=(LongLo);v7=(LongHi);v8=(Reference,Ljava/io/FileOutputStream;);v9=(Reference,Ljava/io/InputStream;);
a=0;//     iget-wide v6, p0, Lcom/umeng/update/net/f;->g:J
a=0;// 
a=0;//     long-to-float v0, v6
a=0;// 
a=0;//     #v0=(Float);
a=0;//     const/high16 v2, 0x42c80000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     mul-float/2addr v0, v2
a=0;// 
a=0;//     iget-wide v6, p0, Lcom/umeng/update/net/f;->h:J
a=0;// 
a=0;//     long-to-float v2, v6
a=0;// 
a=0;//     #v2=(Float);
a=0;//     div-float/2addr v0, v2
a=0;// 
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v2, 0x64
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-le v0, v2, :cond_20
a=0;// 
a=0;//     const/16 v0, 0x63
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     move v2, v0
a=0;// 
a=0;//     :goto_6
a=0;//     #v0=(Integer);v2=(Integer);
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/f;->j:Lcom/umeng/update/net/e;
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/update/net/e;);
a=0;//     if-eqz v0, :cond_8
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/f;->j:Lcom/umeng/update/net/e;
a=0;// 
a=0;//     iget v5, p0, Lcom/umeng/update/net/f;->i:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-interface {v0, v5, v2}, Lcom/umeng/update/net/e;->a(II)V
a=0;//     :try_end_d
a=0;//     .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_0
a=0;//     .catch Landroid/os/RemoteException; {:try_start_d .. :try_end_d} :catch_3
a=0;//     .catchall {:try_start_d .. :try_end_d} :catchall_2
a=0;// 
a=0;//     :cond_8
a=0;//     :try_start_e
a=0;//     #v5=(Conflicted);
a=0;//     invoke-static {}, Lcom/umeng/update/net/DownloadingService;->c()Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v5, p0, Lcom/umeng/update/net/f;->k:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     #v5=(Reference,Lcom/umeng/update/net/k;);
a=0;//     invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_9
a=0;// 
a=0;//     invoke-static {}, Lcom/umeng/update/net/DownloadingService;->c()Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v5, p0, Lcom/umeng/update/net/f;->k:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/os/Messenger;
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v6, 0x3
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-static {v5, v6, v2, v7}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/os/Message;);
a=0;//     invoke-virtual {v0, v5}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
a=0;//     :try_end_e
a=0;//     .catch Landroid/os/DeadObjectException; {:try_start_e .. :try_end_e} :catch_2
a=0;//     .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_0
a=0;//     .catch Landroid/os/RemoteException; {:try_start_e .. :try_end_e} :catch_3
a=0;//     .catchall {:try_start_e .. :try_end_e} :catchall_2
a=0;// 
a=0;//     :cond_9
a=0;//     :goto_7
a=0;//     :try_start_f
a=0;//     #v6=(Conflicted);v7=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/f;->c:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/umeng/update/net/m;->a(Landroid/content/Context;)Lcom/umeng/update/net/m;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v5, p0, Lcom/umeng/update/net/f;->k:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     iget-object v5, v5, Lcom/umeng/update/net/k;->a:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v6, p0, Lcom/umeng/update/net/f;->k:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     #v6=(Reference,Lcom/umeng/update/net/k;);
a=0;//     iget-object v6, v6, Lcom/umeng/update/net/k;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v5, v6, v2}, Lcom/umeng/update/net/m;->a(Ljava/lang/String;Ljava/lang/String;I)V
a=0;// 
a=0;//     move v0, v3
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :catch_2
a=0;//     #v0=(Reference,Ljava/lang/Object;);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-static {}, Lcom/umeng/update/net/DownloadingService;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v5, "Service Client for downloading %1$15s is dead. Removing messenger from the service"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     new-array v6, v6, [Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     iget-object v10, p0, Lcom/umeng/update/net/f;->k:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     #v10=(Reference,Lcom/umeng/update/net/k;);
a=0;//     iget-object v10, v10, Lcom/umeng/update/net/k;->b:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v10, v6, v7
a=0;// 
a=0;//     invoke-static {v5, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v0, v5}, La/b/b;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-static {}, Lcom/umeng/update/net/DownloadingService;->c()Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v5, p0, Lcom/umeng/update/net/f;->k:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-interface {v0, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_f
a=0;//     .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_0
a=0;//     .catch Landroid/os/RemoteException; {:try_start_f .. :try_end_f} :catch_3
a=0;//     .catchall {:try_start_f .. :try_end_f} :catchall_2
a=0;// 
a=0;//     goto :goto_7
a=0;// 
a=0;//     :catch_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v10=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :goto_8
a=0;//     :try_start_10
a=0;//     #v0=(Reference,Landroid/os/RemoteException;);
a=0;//     iget-object v1, p0, Lcom/umeng/update/net/f;->b:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     #v1=(Reference,Lcom/umeng/update/net/DownloadingService;);
a=0;//     invoke-static {v1}, Lcom/umeng/update/net/DownloadingService;->a(Lcom/umeng/update/net/DownloadingService;)Lcom/umeng/update/net/p;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/umeng/update/net/f;->c:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     iget v3, p0, Lcom/umeng/update/net/f;->i:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v2, v3}, Lcom/umeng/update/net/p;->a(Landroid/content/Context;I)V
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V
a=0;//     :try_end_10
a=0;//     .catchall {:try_start_10 .. :try_end_10} :catchall_2
a=0;// 
a=0;//     if-eqz v9, :cond_a
a=0;// 
a=0;//     :try_start_11
a=0;//     invoke-virtual {v9}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_11
a=0;//     .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_17
a=0;//     .catchall {:try_start_11 .. :try_end_11} :catchall_7
a=0;// 
a=0;//     :cond_a
a=0;//     if-eqz v8, :cond_4
a=0;// 
a=0;//     :try_start_12
a=0;//     invoke-virtual {v8}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_12
a=0;//     .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_4
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :catch_4
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :catch_5
a=0;//     #v1=(PosByte);v2=(LongLo);v3=(LongHi);v4=(LongLo);v5=(LongHi);
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :catch_6
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_13
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;//     :try_end_13
a=0;//     .catchall {:try_start_13 .. :try_end_13} :catchall_0
a=0;// 
a=0;//     if-eqz v8, :cond_4
a=0;// 
a=0;//     :try_start_14
a=0;//     invoke-virtual {v8}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_14
a=0;//     .catch Ljava/io/IOException; {:try_start_14 .. :try_end_14} :catch_7
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :catch_7
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :catchall_0
a=0;//     move-exception v0
a=0;// 
a=0;//     if-eqz v8, :cond_b
a=0;// 
a=0;//     :try_start_15
a=0;//     invoke-virtual {v8}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_15
a=0;//     .catch Ljava/io/IOException; {:try_start_15 .. :try_end_15} :catch_8
a=0;// 
a=0;//     :cond_b
a=0;//     :goto_9
a=0;//     #v1=(Conflicted);
a=0;//     throw v0
a=0;// 
a=0;//     :catch_8
a=0;//     #v1=(PosByte);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_9
a=0;// 
a=0;//     :cond_c
a=0;//     :try_start_16
a=0;//     #v0=(Boolean);v1=(Integer);v2=(One);v3=(Conflicted);v4=(Reference,[B);v5=(Reference,Ljava/lang/String;);
a=0;//     iget v1, p0, Lcom/umeng/update/net/f;->a:I
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ne v1, v2, :cond_f
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/f;->b:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/update/net/DownloadingService;);
a=0;//     invoke-static {v0}, Lcom/umeng/update/net/DownloadingService;->a(Lcom/umeng/update/net/DownloadingService;)Lcom/umeng/update/net/p;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/umeng/update/net/f;->k:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     #v1=(Reference,Lcom/umeng/update/net/k;);
a=0;//     iget-wide v2, p0, Lcom/umeng/update/net/f;->g:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iget-wide v4, p0, Lcom/umeng/update/net/f;->h:J
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     iget v6, p0, Lcom/umeng/update/net/f;->f:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     int-to-long v6, v6
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     invoke-virtual/range {v0 .. v7}, Lcom/umeng/update/net/p;->a(Lcom/umeng/update/net/k;JJJ)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/f;->b:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/umeng/update/net/DownloadingService;->c(Lcom/umeng/update/net/DownloadingService;)Landroid/app/NotificationManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v1, p0, Lcom/umeng/update/net/f;->i:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->cancel(I)V
a=0;//     :try_end_16
a=0;//     .catch Ljava/io/IOException; {:try_start_16 .. :try_end_16} :catch_0
a=0;//     .catch Landroid/os/RemoteException; {:try_start_16 .. :try_end_16} :catch_3
a=0;//     .catchall {:try_start_16 .. :try_end_16} :catchall_2
a=0;// 
a=0;//     if-eqz v9, :cond_d
a=0;// 
a=0;//     :try_start_17
a=0;//     invoke-virtual {v9}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_17
a=0;//     .catch Ljava/io/IOException; {:try_start_17 .. :try_end_17} :catch_a
a=0;//     .catchall {:try_start_17 .. :try_end_17} :catchall_1
a=0;// 
a=0;//     :cond_d
a=0;//     if-eqz v8, :cond_4
a=0;// 
a=0;//     :try_start_18
a=0;//     invoke-virtual {v8}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_18
a=0;//     .catch Ljava/io/IOException; {:try_start_18 .. :try_end_18} :catch_9
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :catch_9
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :catch_a
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_19
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;//     :try_end_19
a=0;//     .catchall {:try_start_19 .. :try_end_19} :catchall_1
a=0;// 
a=0;//     if-eqz v8, :cond_4
a=0;// 
a=0;//     :try_start_1a
a=0;//     invoke-virtual {v8}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_1a
a=0;//     .catch Ljava/io/IOException; {:try_start_1a .. :try_end_1a} :catch_b
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :catch_b
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :catchall_1
a=0;//     move-exception v0
a=0;// 
a=0;//     if-eqz v8, :cond_e
a=0;// 
a=0;//     :try_start_1b
a=0;//     invoke-virtual {v8}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_1b
a=0;//     .catch Ljava/io/IOException; {:try_start_1b .. :try_end_1b} :catch_c
a=0;// 
a=0;//     :cond_e
a=0;//     :goto_a
a=0;//     #v1=(Conflicted);
a=0;//     throw v0
a=0;// 
a=0;//     :catch_c
a=0;//     #v1=(Integer);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_a
a=0;// 
a=0;//     :cond_f
a=0;//     #v0=(Boolean);v1=(Integer);v2=(PosByte);v3=(Conflicted);v4=(Reference,[B);v5=(Reference,Ljava/lang/String;);v6=(Conflicted);v7=(Conflicted);
a=0;//     if-nez v0, :cond_12
a=0;// 
a=0;//     :try_start_1c
a=0;//     invoke-static {}, Lcom/umeng/update/net/DownloadingService;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Download Fail repeat count="
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v2, p0, Lcom/umeng/update/net/f;->f:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, La/b/b;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-static {}, Lcom/umeng/update/net/DownloadingService;->c()Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/umeng/update/net/f;->k:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/os/Messenger;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v2, 0x5
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static {v1, v2, v3, v4}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Message;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/f;->b:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/umeng/update/net/DownloadingService;->a(Lcom/umeng/update/net/DownloadingService;)Lcom/umeng/update/net/p;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/umeng/update/net/f;->c:Landroid/content/Context;
a=0;// 
a=0;//     iget v2, p0, Lcom/umeng/update/net/f;->i:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/umeng/update/net/p;->a(Landroid/content/Context;I)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/f;->j:Lcom/umeng/update/net/e;
a=0;// 
a=0;//     if-eqz v0, :cond_10
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/f;->j:Lcom/umeng/update/net/e;
a=0;// 
a=0;//     iget v1, p0, Lcom/umeng/update/net/f;->i:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-interface {v0, v1}, Lcom/umeng/update/net/e;->b(I)V
a=0;//     :try_end_1c
a=0;//     .catch Ljava/io/IOException; {:try_start_1c .. :try_end_1c} :catch_0
a=0;//     .catch Landroid/os/RemoteException; {:try_start_1c .. :try_end_1c} :catch_3
a=0;//     .catchall {:try_start_1c .. :try_end_1c} :catchall_2
a=0;// 
a=0;//     :cond_10
a=0;//     :goto_b
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v9, :cond_11
a=0;// 
a=0;//     :try_start_1d
a=0;//     invoke-virtual {v9}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_1d
a=0;//     .catch Ljava/io/IOException; {:try_start_1d .. :try_end_1d} :catch_f
a=0;//     .catchall {:try_start_1d .. :try_end_1d} :catchall_3
a=0;// 
a=0;//     :cond_11
a=0;//     if-eqz v8, :cond_4
a=0;// 
a=0;//     :try_start_1e
a=0;//     invoke-virtual {v8}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_1e
a=0;//     .catch Ljava/io/IOException; {:try_start_1e .. :try_end_1e} :catch_d
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :catch_d
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :cond_12
a=0;//     :try_start_1f
a=0;//     #v0=(Boolean);v1=(Integer);v2=(PosByte);
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/f;->k:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/update/net/k;);
a=0;//     iget-object v0, v0, Lcom/umeng/update/net/k;->f:[Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v0, :cond_13
a=0;// 
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v1, "dsize"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-wide v2, p0, Lcom/umeng/update/net/f;->h:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     invoke-static {}, La/b/p;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     aget-object v1, v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const-string v2, "dtime"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v1, "ptimes"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget v2, p0, Lcom/umeng/update/net/f;->f:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/umeng/update/net/f;->b:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/umeng/update/net/DownloadingService;->a(Lcom/umeng/update/net/DownloadingService;)Lcom/umeng/update/net/p;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     iget-object v3, p0, Lcom/umeng/update/net/f;->k:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     #v3=(Reference,Lcom/umeng/update/net/k;);
a=0;//     iget-object v3, v3, Lcom/umeng/update/net/k;->f:[Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v0, v2, v3}, Lcom/umeng/update/net/p;->a(Ljava/util/Map;Z[Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_13
a=0;//     #v1=(Conflicted);v2=(PosByte);v3=(Conflicted);
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     iget-object v1, p0, Lcom/umeng/update/net/f;->e:Ljava/io/File;
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->getParent()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/umeng/update/net/f;->e:Ljava/io/File;
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ".tmp"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, ""
a=0;// 
a=0;//     invoke-virtual {v2, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     iget-object v1, p0, Lcom/umeng/update/net/f;->e:Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/io/File;->renameTo(Ljava/io/File;)Z
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {}, Lcom/umeng/update/net/DownloadingService;->a()Ljava/lang/String;
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "itemMd5 "
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v3, p0, Lcom/umeng/update/net/f;->k:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     iget-object v3, v3, Lcom/umeng/update/net/k;->d:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-static {}, Lcom/umeng/update/net/DownloadingService;->a()Ljava/lang/String;
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "fileMd5 "
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v0}, La/b/p;->a(Ljava/io/File;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/umeng/update/net/f;->k:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     iget-object v2, v2, Lcom/umeng/update/net/k;->d:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v2, :cond_15
a=0;// 
a=0;//     iget-object v2, p0, Lcom/umeng/update/net/f;->k:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     iget-object v2, v2, Lcom/umeng/update/net/k;->d:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, La/b/p;->a(Ljava/io/File;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_15
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/f;->k:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/update/net/k;);
a=0;//     iget-object v0, v0, Lcom/umeng/update/net/k;->a:Ljava/lang/String;
a=0;// 
a=0;//     const-string v2, "delta_update"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_18
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/f;->b:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/update/net/DownloadingService;);
a=0;//     invoke-static {v0}, Lcom/umeng/update/net/DownloadingService;->c(Lcom/umeng/update/net/DownloadingService;)Landroid/app/NotificationManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v2, p0, Lcom/umeng/update/net/f;->i:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v2}, Landroid/app/NotificationManager;->cancel(I)V
a=0;// 
a=0;//     new-instance v0, Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v2, "filename"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const/4 v3, 0x5
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     iput v3, v2, Landroid/os/Message;->what:I
a=0;// 
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     iput v3, v2, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     iget v3, p0, Lcom/umeng/update/net/f;->i:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, v2, Landroid/os/Message;->arg2:I
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V
a=0;//     :try_end_1f
a=0;//     .catch Ljava/io/IOException; {:try_start_1f .. :try_end_1f} :catch_0
a=0;//     .catch Landroid/os/RemoteException; {:try_start_1f .. :try_end_1f} :catch_3
a=0;//     .catchall {:try_start_1f .. :try_end_1f} :catchall_2
a=0;// 
a=0;//     :try_start_20
a=0;//     invoke-static {}, Lcom/umeng/update/net/DownloadingService;->c()Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v3, p0, Lcom/umeng/update/net/f;->k:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     #v3=(Reference,Lcom/umeng/update/net/k;);
a=0;//     invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_14
a=0;// 
a=0;//     invoke-static {}, Lcom/umeng/update/net/DownloadingService;->c()Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v3, p0, Lcom/umeng/update/net/f;->k:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/os/Messenger;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
a=0;// 
a=0;//     :cond_14
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/f;->b:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/umeng/update/net/DownloadingService;->a(Lcom/umeng/update/net/DownloadingService;)Lcom/umeng/update/net/p;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v2, p0, Lcom/umeng/update/net/f;->c:Landroid/content/Context;
a=0;// 
a=0;//     iget v3, p0, Lcom/umeng/update/net/f;->i:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v0, v2, v3}, Lcom/umeng/update/net/p;->a(Landroid/content/Context;I)V
a=0;//     :try_end_20
a=0;//     .catch Landroid/os/RemoteException; {:try_start_20 .. :try_end_20} :catch_e
a=0;//     .catch Ljava/io/IOException; {:try_start_20 .. :try_end_20} :catch_0
a=0;//     .catchall {:try_start_20 .. :try_end_20} :catchall_2
a=0;// 
a=0;//     :cond_15
a=0;//     :goto_c
a=0;//     :try_start_21
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/f;->j:Lcom/umeng/update/net/e;
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/update/net/e;);
a=0;//     if-eqz v0, :cond_10
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/f;->j:Lcom/umeng/update/net/e;
a=0;// 
a=0;//     iget v2, p0, Lcom/umeng/update/net/f;->i:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-interface {v0, v2, v1}, Lcom/umeng/update/net/e;->a(ILjava/lang/String;)V
a=0;//     :try_end_21
a=0;//     .catch Ljava/io/IOException; {:try_start_21 .. :try_end_21} :catch_0
a=0;//     .catch Landroid/os/RemoteException; {:try_start_21 .. :try_end_21} :catch_3
a=0;//     .catchall {:try_start_21 .. :try_end_21} :catchall_2
a=0;// 
a=0;//     goto/16 :goto_b
a=0;// 
a=0;//     :catchall_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :goto_d
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v9, :cond_16
a=0;// 
a=0;//     :try_start_22
a=0;//     invoke-virtual {v9}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_22
a=0;//     .catch Ljava/io/IOException; {:try_start_22 .. :try_end_22} :catch_1b
a=0;//     .catchall {:try_start_22 .. :try_end_22} :catchall_8
a=0;// 
a=0;//     :cond_16
a=0;//     if-eqz v8, :cond_17
a=0;// 
a=0;//     :try_start_23
a=0;//     invoke-virtual {v8}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_23
a=0;//     .catch Ljava/io/IOException; {:try_start_23 .. :try_end_23} :catch_1a
a=0;// 
a=0;//     :cond_17
a=0;//     :goto_e
a=0;//     throw v0
a=0;// 
a=0;//     :catch_e
a=0;//     #v1=(Reference,Ljava/lang/String;);v2=(Reference,Ujava/lang/Object;);v4=(Reference,Ljava/lang/String;);v5=(Reference,Ljava/lang/String;);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_24
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/f;->b:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/umeng/update/net/DownloadingService;->a(Lcom/umeng/update/net/DownloadingService;)Lcom/umeng/update/net/p;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v2, p0, Lcom/umeng/update/net/f;->c:Landroid/content/Context;
a=0;// 
a=0;//     iget v3, p0, Lcom/umeng/update/net/f;->i:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v0, v2, v3}, Lcom/umeng/update/net/p;->a(Landroid/content/Context;I)V
a=0;// 
a=0;//     goto :goto_c
a=0;// 
a=0;//     :cond_18
a=0;//     #v0=(Boolean);v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/umeng/update/net/DownloadingService;->c()Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     iget-object v2, p0, Lcom/umeng/update/net/f;->k:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/os/Messenger;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x5
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-static {v2, v3, v4, v5}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Message;);
a=0;//     invoke-virtual {v0, v2}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/f;->k:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     iget-boolean v0, v0, Lcom/umeng/update/net/k;->h:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_15
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/f;->b:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/update/net/DownloadingService;);
a=0;//     invoke-static {v0}, Lcom/umeng/update/net/DownloadingService;->a(Lcom/umeng/update/net/DownloadingService;)Lcom/umeng/update/net/p;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v2, p0, Lcom/umeng/update/net/f;->c:Landroid/content/Context;
a=0;// 
a=0;//     iget v3, p0, Lcom/umeng/update/net/f;->i:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v0, v2, v3}, Lcom/umeng/update/net/p;->a(Landroid/content/Context;I)V
a=0;// 
a=0;//     new-instance v0, Landroid/app/Notification;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/app/Notification;);
a=0;//     const v2, 0x1080082
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget-object v3, p0, Lcom/umeng/update/net/f;->c:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     iget-object v4, p0, Lcom/umeng/update/net/f;->c:Landroid/content/Context;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v4}, La/b/o;->i(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-direct {v0, v2, v3, v4, v5}, Landroid/app/Notification;-><init>(ILjava/lang/CharSequence;J)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Notification;);
a=0;//     iget-object v2, p0, Lcom/umeng/update/net/f;->c:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     new-instance v4, Landroid/content/Intent;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v4}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Intent;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-static {v2, v3, v4, v5}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/umeng/update/net/f;->c:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     iget-object v4, p0, Lcom/umeng/update/net/f;->c:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v4}, La/b/a;->h(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v6, p0, Lcom/umeng/update/net/f;->k:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     #v6=(Reference,Lcom/umeng/update/net/k;);
a=0;//     iget-object v6, v6, Lcom/umeng/update/net/k;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget-object v6, p0, Lcom/umeng/update/net/f;->c:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v7, p0, Lcom/umeng/update/net/f;->c:Landroid/content/Context;
a=0;// 
a=0;//     #v7=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v7}, La/b/o;->i(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v0, v3, v4, v5, v2}, Landroid/app/Notification;->setLatestEventInfo(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V
a=0;// 
a=0;//     iget v2, v0, Landroid/app/Notification;->flags:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     or-int/lit8 v2, v2, 0x10
a=0;// 
a=0;//     iput v2, v0, Landroid/app/Notification;->flags:I
a=0;// 
a=0;//     iget-object v2, p0, Lcom/umeng/update/net/f;->b:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     #v2=(Reference,Lcom/umeng/update/net/DownloadingService;);
a=0;//     invoke-static {v2}, Lcom/umeng/update/net/DownloadingService;->c(Lcom/umeng/update/net/DownloadingService;)Landroid/app/NotificationManager;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget v3, p0, Lcom/umeng/update/net/f;->i:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3, v0}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
a=0;//     :try_end_24
a=0;//     .catch Ljava/io/IOException; {:try_start_24 .. :try_end_24} :catch_0
a=0;//     .catch Landroid/os/RemoteException; {:try_start_24 .. :try_end_24} :catch_3
a=0;//     .catchall {:try_start_24 .. :try_end_24} :catchall_2
a=0;// 
a=0;//     goto/16 :goto_c
a=0;// 
a=0;//     :catch_f
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_25
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;//     :try_end_25
a=0;//     .catchall {:try_start_25 .. :try_end_25} :catchall_3
a=0;// 
a=0;//     if-eqz v8, :cond_4
a=0;// 
a=0;//     :try_start_26
a=0;//     invoke-virtual {v8}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_26
a=0;//     .catch Ljava/io/IOException; {:try_start_26 .. :try_end_26} :catch_10
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :catch_10
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :catchall_3
a=0;//     move-exception v0
a=0;// 
a=0;//     if-eqz v8, :cond_19
a=0;// 
a=0;//     :try_start_27
a=0;//     invoke-virtual {v8}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_27
a=0;//     .catch Ljava/io/IOException; {:try_start_27 .. :try_end_27} :catch_11
a=0;// 
a=0;//     :cond_19
a=0;//     :goto_f
a=0;//     throw v0
a=0;// 
a=0;//     :catch_11
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_f
a=0;// 
a=0;//     :catch_12
a=0;//     #v0=(Conflicted);v2=(Reference,Ljava/io/FileOutputStream;);v3=(Reference,Ljava/io/InputStream;);v4=(Conflicted);v5=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_28
a=0;//     #v0=(Reference,Landroid/os/RemoteException;);
a=0;//     invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V
a=0;//     :try_end_28
a=0;//     .catchall {:try_start_28 .. :try_end_28} :catchall_5
a=0;// 
a=0;//     :try_start_29
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/f;->b:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/umeng/update/net/DownloadingService;->a(Lcom/umeng/update/net/DownloadingService;)Lcom/umeng/update/net/p;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v4, p0, Lcom/umeng/update/net/f;->c:Landroid/content/Context;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     iget v5, p0, Lcom/umeng/update/net/f;->i:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v0, v4, v5}, Lcom/umeng/update/net/p;->a(Landroid/content/Context;I)V
a=0;// 
a=0;//     invoke-direct {p0, v1}, Lcom/umeng/update/net/f;->a(Ljava/lang/Exception;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/f;->b:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/umeng/update/net/DownloadingService;->d(Lcom/umeng/update/net/DownloadingService;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Lcom/umeng/update/net/g;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/umeng/update/net/g;);
a=0;//     invoke-direct {v1, p0}, Lcom/umeng/update/net/g;-><init>(Lcom/umeng/update/net/f;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/umeng/update/net/g;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     :catchall_4
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v8, v2
a=0;// 
a=0;//     #v8=(Reference,Ljava/io/FileOutputStream;);
a=0;//     move-object v9, v3
a=0;// 
a=0;//     #v9=(Reference,Ljava/io/InputStream;);
a=0;//     goto/16 :goto_d
a=0;// 
a=0;//     :catchall_5
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/io/IOException;);v8=(Conflicted);v9=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     iget-object v4, p0, Lcom/umeng/update/net/f;->b:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     #v4=(Reference,Lcom/umeng/update/net/DownloadingService;);
a=0;//     invoke-static {v4}, Lcom/umeng/update/net/DownloadingService;->a(Lcom/umeng/update/net/DownloadingService;)Lcom/umeng/update/net/p;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v5, p0, Lcom/umeng/update/net/f;->c:Landroid/content/Context;
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/Context;);
a=0;//     iget v6, p0, Lcom/umeng/update/net/f;->i:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v4, v5, v6}, Lcom/umeng/update/net/p;->a(Landroid/content/Context;I)V
a=0;// 
a=0;//     invoke-direct {p0, v1}, Lcom/umeng/update/net/f;->a(Ljava/lang/Exception;)V
a=0;// 
a=0;//     iget-object v1, p0, Lcom/umeng/update/net/f;->b:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/umeng/update/net/DownloadingService;->d(Lcom/umeng/update/net/DownloadingService;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v4, Lcom/umeng/update/net/g;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/umeng/update/net/g;);
a=0;//     invoke-direct {v4, p0}, Lcom/umeng/update/net/g;-><init>(Lcom/umeng/update/net/f;)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/umeng/update/net/g;);
a=0;//     invoke-virtual {v1, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :cond_1a
a=0;//     #v0=(Integer);v4=(PosByte);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-static {}, Lcom/umeng/update/net/DownloadingService;->a()Ljava/lang/String;
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "wait for repeating Test network repeat count="
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v1, p0, Lcom/umeng/update/net/f;->f:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;//     :try_end_29
a=0;//     .catchall {:try_start_29 .. :try_end_29} :catchall_4
a=0;// 
a=0;//     :try_start_2a
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/f;->k:Lcom/umeng/update/net/k;
a=0;// 
a=0;//     iget-boolean v0, v0, Lcom/umeng/update/net/k;->g:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1c
a=0;// 
a=0;//     const-wide/16 v0, 0x1f40
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
a=0;// 
a=0;//     iget-wide v0, p0, Lcom/umeng/update/net/f;->h:J
a=0;// 
a=0;//     const-wide/16 v4, 0x1
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     cmp-long v0, v0, v4
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_1b
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, v0}, Lcom/umeng/update/net/f;->a(Z)V
a=0;//     :try_end_2a
a=0;//     .catch Ljava/lang/InterruptedException; {:try_start_2a .. :try_end_2a} :catch_13
a=0;//     .catchall {:try_start_2a .. :try_end_2a} :catchall_4
a=0;// 
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     :catch_13
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_2b
a=0;//     #v0=(Reference,Ljava/lang/InterruptedException;);
a=0;//     invoke-direct {p0, v0}, Lcom/umeng/update/net/f;->a(Ljava/lang/Exception;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/f;->b:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/umeng/update/net/DownloadingService;->a(Lcom/umeng/update/net/DownloadingService;)Lcom/umeng/update/net/p;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/umeng/update/net/f;->c:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     iget v4, p0, Lcom/umeng/update/net/f;->i:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v0, v1, v4}, Lcom/umeng/update/net/p;->a(Landroid/content/Context;I)V
a=0;//     :try_end_2b
a=0;//     .catchall {:try_start_2b .. :try_end_2b} :catchall_4
a=0;// 
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     :cond_1b
a=0;//     #v0=(Byte);v1=(LongHi);v4=(LongLo);v5=(LongHi);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :try_start_2c
a=0;//     #v0=(One);
a=0;//     invoke-direct {p0, v0}, Lcom/umeng/update/net/f;->a(Z)V
a=0;// 
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     :cond_1c
a=0;//     #v0=(Boolean);v1=(Integer);v4=(PosByte);v5=(Conflicted);
a=0;//     invoke-static {}, Lcom/umeng/update/net/DownloadingService;->b()Landroid/util/SparseArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/util/SparseArray;);
a=0;//     iget v1, p0, Lcom/umeng/update/net/f;->i:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/umeng/update/net/s;
a=0;// 
a=0;//     iget-object v1, v0, Lcom/umeng/update/net/s;->f:[J
a=0;// 
a=0;//     #v1=(Reference,[J);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     iget-wide v6, p0, Lcom/umeng/update/net/f;->g:J
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     aput-wide v6, v1, v4
a=0;// 
a=0;//     iget-object v1, v0, Lcom/umeng/update/net/s;->f:[J
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     iget-wide v6, p0, Lcom/umeng/update/net/f;->h:J
a=0;// 
a=0;//     aput-wide v6, v1, v4
a=0;// 
a=0;//     iget-object v0, v0, Lcom/umeng/update/net/s;->f:[J
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iget v4, p0, Lcom/umeng/update/net/f;->f:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-long v4, v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     aput-wide v4, v0, v1
a=0;// 
a=0;//     iget v0, p0, Lcom/umeng/update/net/f;->i:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const-string v1, "continue"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcom/umeng/update/net/w;->a(ILjava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v4, p0, Lcom/umeng/update/net/f;->c:Landroid/content/Context;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     const-class v5, Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v1, v4, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     const-string v4, "com.umeng.broadcast.download.msg"
a=0;// 
a=0;//     invoke-virtual {v1, v4, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/f;->b:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/umeng/update/net/DownloadingService;->a(Lcom/umeng/update/net/DownloadingService;)Lcom/umeng/update/net/p;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v4, p0, Lcom/umeng/update/net/f;->b:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     invoke-virtual {v0, v4, v1}, Lcom/umeng/update/net/p;->a(Lcom/umeng/update/net/DownloadingService;Landroid/content/Intent;)Z
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/f;->b:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/umeng/update/net/f;->c:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/umeng/update/net/f;->c:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v4}, La/b/o;->c(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/umeng/update/net/DownloadingService;->a(Lcom/umeng/update/net/DownloadingService;Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-static {}, Lcom/umeng/update/net/DownloadingService;->a()Ljava/lang/String;
a=0;//     :try_end_2c
a=0;//     .catch Ljava/lang/InterruptedException; {:try_start_2c .. :try_end_2c} :catch_13
a=0;//     .catchall {:try_start_2c .. :try_end_2c} :catchall_4
a=0;// 
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     :catch_14
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_2d
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;//     :try_end_2d
a=0;//     .catchall {:try_start_2d .. :try_end_2d} :catchall_6
a=0;// 
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     :try_start_2e
a=0;//     invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_2e
a=0;//     .catch Ljava/io/IOException; {:try_start_2e .. :try_end_2e} :catch_15
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :catch_15
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :catchall_6
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v2, :cond_1d
a=0;// 
a=0;//     :try_start_2f
a=0;//     invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_2f
a=0;//     .catch Ljava/io/IOException; {:try_start_2f .. :try_end_2f} :catch_16
a=0;// 
a=0;//     :cond_1d
a=0;//     :goto_10
a=0;//     throw v0
a=0;// 
a=0;//     :catch_16
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_10
a=0;// 
a=0;//     :catch_17
a=0;//     #v3=(Integer);v8=(Reference,Ljava/io/FileOutputStream;);v9=(Reference,Ljava/io/InputStream;);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_30
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;//     :try_end_30
a=0;//     .catchall {:try_start_30 .. :try_end_30} :catchall_7
a=0;// 
a=0;//     if-eqz v8, :cond_4
a=0;// 
a=0;//     :try_start_31
a=0;//     invoke-virtual {v8}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_31
a=0;//     .catch Ljava/io/IOException; {:try_start_31 .. :try_end_31} :catch_18
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :catch_18
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :catchall_7
a=0;//     move-exception v0
a=0;// 
a=0;//     if-eqz v8, :cond_1e
a=0;// 
a=0;//     :try_start_32
a=0;//     invoke-virtual {v8}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_32
a=0;//     .catch Ljava/io/IOException; {:try_start_32 .. :try_end_32} :catch_19
a=0;// 
a=0;//     :cond_1e
a=0;//     :goto_11
a=0;//     throw v0
a=0;// 
a=0;//     :catch_19
a=0;//     move-exception v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_11
a=0;// 
a=0;//     :catch_1a
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_e
a=0;// 
a=0;//     :catch_1b
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     :try_start_33
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;//     :try_end_33
a=0;//     .catchall {:try_start_33 .. :try_end_33} :catchall_8
a=0;// 
a=0;//     if-eqz v8, :cond_17
a=0;// 
a=0;//     :try_start_34
a=0;//     invoke-virtual {v8}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_34
a=0;//     .catch Ljava/io/IOException; {:try_start_34 .. :try_end_34} :catch_1c
a=0;// 
a=0;//     goto/16 :goto_e
a=0;// 
a=0;//     :catch_1c
a=0;//     move-exception v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_e
a=0;// 
a=0;//     :catchall_8
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     if-eqz v8, :cond_1f
a=0;// 
a=0;//     :try_start_35
a=0;//     invoke-virtual {v8}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_35
a=0;//     .catch Ljava/io/IOException; {:try_start_35 .. :try_end_35} :catch_1d
a=0;// 
a=0;//     :cond_1f
a=0;//     :goto_12
a=0;//     throw v0
a=0;// 
a=0;//     :catch_1d
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_12
a=0;// 
a=0;//     :catchall_9
a=0;//     #v1=(Conflicted);v2=(Null);v3=(Null);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v8, v2
a=0;// 
a=0;//     #v8=(Null);
a=0;//     move-object v9, v3
a=0;// 
a=0;//     #v9=(Null);
a=0;//     goto/16 :goto_d
a=0;// 
a=0;//     :catchall_a
a=0;//     #v1=(Reference,Ljava/io/FileOutputStream;);v2=(Conflicted);v5=(One);v8=(Uninit);v9=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v8, v1
a=0;// 
a=0;//     #v8=(Reference,Ljava/io/FileOutputStream;);
a=0;//     move-object v9, v3
a=0;// 
a=0;//     #v9=(Null);
a=0;//     goto/16 :goto_d
a=0;// 
a=0;//     :catchall_b
a=0;//     #v2=(Reference,Landroid/content/Context;);v4=(Char);v8=(Uninit);v9=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v8, v1
a=0;// 
a=0;//     #v8=(Reference,Ljava/io/FileOutputStream;);
a=0;//     move-object v9, v3
a=0;// 
a=0;//     #v9=(Null);
a=0;//     goto/16 :goto_d
a=0;// 
a=0;//     :catchall_c
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v9=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v9, v3
a=0;// 
a=0;//     #v9=(Null);
a=0;//     goto/16 :goto_d
a=0;// 
a=0;//     :catch_1e
a=0;//     #v2=(Null);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v8, v2
a=0;// 
a=0;//     #v8=(Null);
a=0;//     move-object v9, v3
a=0;// 
a=0;//     #v9=(Null);
a=0;//     goto/16 :goto_8
a=0;// 
a=0;//     :catch_1f
a=0;//     #v1=(Reference,Ljava/io/FileOutputStream;);v2=(Conflicted);v5=(One);v8=(Uninit);v9=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v8, v1
a=0;// 
a=0;//     #v8=(Reference,Ljava/io/FileOutputStream;);
a=0;//     move-object v9, v3
a=0;// 
a=0;//     #v9=(Null);
a=0;//     goto/16 :goto_8
a=0;// 
a=0;//     :catch_20
a=0;//     #v2=(Reference,Landroid/content/Context;);v4=(Char);v8=(Uninit);v9=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v8, v1
a=0;// 
a=0;//     #v8=(Reference,Ljava/io/FileOutputStream;);
a=0;//     move-object v9, v3
a=0;// 
a=0;//     #v9=(Null);
a=0;//     goto/16 :goto_8
a=0;// 
a=0;//     :catch_21
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v9=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/RemoteException;);
a=0;//     move-object v9, v3
a=0;// 
a=0;//     #v9=(Null);
a=0;//     goto/16 :goto_8
a=0;// 
a=0;//     :catch_22
a=0;//     #v2=(Null);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     :catch_23
a=0;//     #v2=(Conflicted);v5=(One);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v2, v1
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/FileOutputStream;);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     :catch_24
a=0;//     #v4=(Char);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v2, v1
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     :catch_25
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Reference,Ljava/io/FileOutputStream;);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     move-object v2, v8
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/FileOutputStream;);
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     :cond_20
a=0;//     #v0=(Integer);v1=(One);v2=(PosByte);v3=(Integer);v4=(Reference,[B);v5=(Reference,Ljava/lang/String;);v6=(LongLo);v7=(LongHi);v9=(Reference,Ljava/io/InputStream;);v10=(Conflicted);
a=0;//     move v2, v0
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     goto/16 :goto_6
a=0;// 
a=0;//     :cond_21
a=0;//     #v2=(LongLo);
a=0;//     move v0, v3
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_22
a=0;//     #v2=(Integer);v3=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :cond_23
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Reference,Ljava/io/FileOutputStream;);v2=(Boolean);v3=(Null);v5=(One);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);
a=0;//     move-object v8, v1
a=0;// 
a=0;//     #v8=(Reference,Ljava/io/FileOutputStream;);
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final run()V
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/umeng/update/net/f;->f:I
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/umeng/update/net/f;->j:Lcom/umeng/update/net/e;
a=0;// 
a=0;//     #v1=(Reference,Lcom/umeng/update/net/e;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/umeng/update/net/f;->j:Lcom/umeng/update/net/e;
a=0;// 
a=0;//     iget v2, p0, Lcom/umeng/update/net/f;->i:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-interface {v1, v2}, Lcom/umeng/update/net/e;->a(I)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     iget-wide v2, p0, Lcom/umeng/update/net/f;->g:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     const-wide/16 v4, 0x0
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     cmp-long v1, v2, v4
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-lez v1, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     invoke-direct {p0, v0}, Lcom/umeng/update/net/f;->a(Z)V
a=0;// 
a=0;//     invoke-static {}, Lcom/umeng/update/net/DownloadingService;->c()Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v0}, Ljava/util/Map;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gtz v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/update/net/f;->b:Lcom/umeng/update/net/DownloadingService;
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/update/net/DownloadingService;);
a=0;//     invoke-virtual {v0}, Lcom/umeng/update/net/DownloadingService;->stopSelf()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
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
}}
