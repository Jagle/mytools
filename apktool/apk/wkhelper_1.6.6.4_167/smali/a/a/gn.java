package a.a; class gn { void a() { int a;
a=0;// .class public final La/a/gn;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static a:La/a/fw;
a=0;// 
a=0;// .field private static b:La/a/gl;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, La/a/gn;->a:La/a/fw;
a=0;// 
a=0;//     sput-object v0, La/a/gn;->b:La/a/gl;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized a(Landroid/content/Context;)La/a/fw;
a=0;//     .locals 6
a=0;// 
a=0;//     const-class v1, La/a/gn;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, La/a/gn;->a:La/a/fw;
a=0;// 
a=0;//     #v0=(Reference,La/a/fw;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     new-instance v0, La/a/fw;
a=0;// 
a=0;//     #v0=(UninitRef,La/a/fw;);
a=0;//     invoke-direct {v0, p0}, La/a/fw;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,La/a/fw;);
a=0;//     sput-object v0, La/a/gn;->a:La/a/fw;
a=0;// 
a=0;//     new-instance v2, La/a/gk;
a=0;// 
a=0;//     #v2=(UninitRef,La/a/gk;);
a=0;//     invoke-direct {v2, p0}, La/a/gk;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v2=(Reference,La/a/gk;);
a=0;//     invoke-virtual {v0, v2}, La/a/fw;->a(La/a/a;)V
a=0;// 
a=0;//     sget-object v0, La/a/gn;->a:La/a/fw;
a=0;// 
a=0;//     new-instance v2, La/a/gm;
a=0;// 
a=0;//     #v2=(UninitRef,La/a/gm;);
a=0;//     invoke-direct {v2, p0}, La/a/gm;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v2=(Reference,La/a/gm;);
a=0;//     invoke-virtual {v0, v2}, La/a/fw;->a(La/a/a;)V
a=0;// 
a=0;//     sget-object v0, La/a/gn;->a:La/a/fw;
a=0;// 
a=0;//     new-instance v2, La/a/cw;
a=0;// 
a=0;//     #v2=(UninitRef,La/a/cw;);
a=0;//     invoke-direct {v2, p0}, La/a/cw;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v2=(Reference,La/a/cw;);
a=0;//     invoke-virtual {v0, v2}, La/a/fw;->a(La/a/a;)V
a=0;// 
a=0;//     sget-object v0, La/a/gn;->a:La/a/fw;
a=0;// 
a=0;//     new-instance v2, La/a/go;
a=0;// 
a=0;//     #v2=(UninitRef,La/a/go;);
a=0;//     invoke-direct {v2, p0}, La/a/go;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v2=(Reference,La/a/go;);
a=0;//     invoke-virtual {v0, v2}, La/a/fw;->a(La/a/a;)V
a=0;// 
a=0;//     sget-object v2, La/a/gn;->a:La/a/fw;
a=0;// 
a=0;//     invoke-virtual {v2}, La/a/fw;->d()La/a/be;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     new-instance v3, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/ArrayList;);
a=0;//     iget-object v4, v2, La/a/fw;->b:Ljava/util/Set;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v4}, Ljava/util/Set;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     monitor-enter v2
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_1
a=0;// 
a=0;//     :try_start_1
a=0;//     iput-object v0, v2, La/a/fw;->a:La/a/be;
a=0;// 
a=0;//     iget-object v0, v2, La/a/fw;->b:Ljava/util/Set;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v4=(Reference,Ljava/util/Iterator;);v5=(Conflicted);
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     monitor-exit v2
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     :try_start_2
a=0;//     invoke-virtual {v2}, La/a/fw;->b()V
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     sget-object v0, La/a/gn;->a:La/a/fw;
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_1
a=0;// 
a=0;//     #v0=(Reference,La/a/fw;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_2
a=0;//     :try_start_3
a=0;//     #v0=(Boolean);v2=(Reference,La/a/fw;);v3=(Reference,Ljava/util/ArrayList;);v4=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, La/a/a;
a=0;// 
a=0;//     iget-object v5, v2, La/a/fw;->a:La/a/be;
a=0;// 
a=0;//     #v5=(Reference,La/a/be;);
a=0;//     invoke-virtual {v0, v5}, La/a/a;->a(La/a/be;)V
a=0;// 
a=0;//     invoke-virtual {v0}, La/a/a;->a()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_0
a=0;// 
a=0;//     invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v2
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     :try_start_4
a=0;//     throw v0
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_1
a=0;// 
a=0;//     :catchall_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :cond_3
a=0;//     :try_start_5
a=0;//     #v0=(Boolean);v2=(Reference,La/a/fw;);v3=(Reference,Ljava/util/Iterator;);v4=(Reference,Ujava/lang/Object;);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, La/a/a;
a=0;// 
a=0;//     iget-object v4, v2, La/a/fw;->b:Ljava/util/Set;
a=0;// 
a=0;//     invoke-interface {v4, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
a=0;//     :try_end_5
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_0
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized b(Landroid/content/Context;)La/a/gl;
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const-class v3, La/a/gn;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v3
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, La/a/gn;->b:La/a/gl;
a=0;// 
a=0;//     #v0=(Reference,La/a/gl;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v4, La/a/gl;
a=0;// 
a=0;//     #v4=(UninitRef,La/a/gl;);
a=0;//     invoke-direct {v4, p0}, La/a/gl;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v4=(Reference,La/a/gl;);
a=0;//     sput-object v4, La/a/gn;->b:La/a/gl;
a=0;// 
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     iget-object v1, v4, La/a/gl;->c:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v5, ".imprint"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     :try_start_1
a=0;//     iget-object v0, v4, La/a/gl;->c:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const-string v1, ".imprint"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :try_start_2
a=0;//     invoke-static {v1}, La/a/er;->b(Ljava/io/InputStream;)[B
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_2
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :try_start_3
a=0;//     #v2=(Reference,[B);
a=0;//     invoke-static {v1}, La/a/er;->c(Ljava/io/InputStream;)V
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     :goto_0
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     :try_start_4
a=0;//     new-instance v0, La/a/bk;
a=0;// 
a=0;//     #v0=(UninitRef,La/a/bk;);
a=0;//     invoke-direct {v0}, La/a/bk;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,La/a/bk;);
a=0;//     new-instance v1, La/a/ey;
a=0;// 
a=0;//     #v1=(UninitRef,La/a/ey;);
a=0;//     invoke-direct {v1}, La/a/ey;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,La/a/ey;);
a=0;//     invoke-virtual {v1, v0, v2}, La/a/ey;->a(La/a/eu;[B)V
a=0;// 
a=0;//     iput-object v0, v4, La/a/gl;->b:La/a/bk;
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     :try_start_5
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     sget-object v0, La/a/gn;->b:La/a/gl;
a=0;//     :try_end_5
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_0
a=0;// 
a=0;//     #v0=(Reference,La/a/gl;);
a=0;//     monitor-exit v3
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ujava/lang/Object;);v2=(Null);v4=(Reference,La/a/gl;);v5=(Reference,Ljava/lang/String;);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     :goto_2
a=0;//     :try_start_6
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_6
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_2
a=0;// 
a=0;//     :try_start_7
a=0;//     invoke-static {v1}, La/a/er;->c(Ljava/io/InputStream;)V
a=0;//     :try_end_7
a=0;//     .catchall {:try_start_7 .. :try_end_7} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Reference,Ljava/lang/Object;);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v3
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :catchall_1
a=0;//     #v0=(Conflicted);v1=(Reference,Ujava/lang/Object;);v2=(Null);v4=(Reference,La/a/gl;);v5=(Reference,Ljava/lang/String;);
a=0;//     move-exception v0
a=0;// 
a=0;//     :goto_3
a=0;//     :try_start_8
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);v2=(Reference,Ljava/io/FileInputStream;);
a=0;//     invoke-static {v2}, La/a/er;->c(Ljava/io/InputStream;)V
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_8
a=0;//     .catchall {:try_start_8 .. :try_end_8} :catchall_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catchall_2
a=0;//     #v1=(Reference,Ljava/io/FileInputStream;);v2=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v2, v1
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/FileInputStream;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catch_2
a=0;//     #v2=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
}}
