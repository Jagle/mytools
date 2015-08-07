package com.wukongtv.a; class d { void a() { int a;
a=0;// .class public final Lcom/wukongtv/a/d;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static a:Ljava/util/HashMap;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     sput-object v0, Lcom/wukongtv/a/d;->a:Ljava/util/HashMap;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a()Lcom/wukongtv/a/c;
a=0;//     .locals 1
a=0;// 
a=0;//     const-string v0, "127.0.0.1"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/wukongtv/a/d;->b(Ljava/lang/String;)Lcom/wukongtv/a/c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     const-string v0, "127.0.0.1"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v0}, Lcom/wukongtv/a/d;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 10
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     sget-object v0, Lcom/wukongtv/a/d;->a:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/wukongtv/a/c;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-static {p1}, Lcom/wukongtv/a/d;->b(Ljava/lang/String;)Lcom/wukongtv/a/c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     iget-boolean v2, v0, Lcom/wukongtv/a/c;->c:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Reference,Lcom/wukongtv/a/c;);v2=(Conflicted);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     iput-boolean v2, v0, Lcom/wukongtv/a/c;->c:Z
a=0;// 
a=0;//     :try_start_0
a=0;//     const-string v2, "install"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     const/16 v2, 0x4e20
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     invoke-virtual {v0, v2}, Lcom/wukongtv/a/c;->setSoTimeout(I)V
a=0;// 
a=0;//     :goto_1
a=0;//     invoke-virtual {v0}, Lcom/wukongtv/a/c;->getOutputStream()Ljava/io/OutputStream;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/OutputStream;);
a=0;//     invoke-virtual {v0}, Lcom/wukongtv/a/c;->getInputStream()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/InputStream;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "shell:"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget v5, v0, Lcom/wukongtv/a/c;->b:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-nez v5, :cond_2
a=0;// 
a=0;//     sget v5, Lcom/wukongtv/a/c;->a:I
a=0;// 
a=0;//     add-int/lit8 v5, v5, 0x1
a=0;// 
a=0;//     sput v5, Lcom/wukongtv/a/c;->a:I
a=0;// 
a=0;//     iput v5, v0, Lcom/wukongtv/a/c;->b:I
a=0;// 
a=0;//     :cond_2
a=0;//     iget v5, v0, Lcom/wukongtv/a/c;->b:I
a=0;// 
a=0;//     invoke-static {v5, v4}, Lcom/wukongtv/a/a;->a(ILjava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Ljava/io/OutputStream;->write([B)V
a=0;// 
a=0;//     invoke-static {v3}, Lcom/wukongtv/a/b;->a(Ljava/io/InputStream;)Lcom/wukongtv/a/b;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget v6, v4, Lcom/wukongtv/a/b;->a:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     const v7, 0x59414b4f
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-eq v6, v7, :cond_4
a=0;// 
a=0;//     invoke-static {p1}, Lcom/wukongtv/a/d;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Reference,Lcom/wukongtv/a/c;);v2=(Boolean);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     const/16 v2, 0x1388
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     invoke-virtual {v0, v2}, Lcom/wukongtv/a/c;->setSoTimeout(I)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     sget-object v2, Ljava/lang/System;->err:Ljava/io/PrintStream;
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/PrintStream;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "shellcommand "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-static {p1}, Lcom/wukongtv/a/d;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Lcom/wukongtv/a/c;);v5=(Integer);v6=(Integer);v7=(Integer);v8=(Uninit);v9=(Uninit);
a=0;//     iget v4, v4, Lcom/wukongtv/a/b;->b:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     :goto_2
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     invoke-static {v3}, Lcom/wukongtv/a/b;->a(Ljava/io/InputStream;)Lcom/wukongtv/a/b;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Lcom/wukongtv/a/b;);
a=0;//     iget v8, v7, Lcom/wukongtv/a/b;->a:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     const v9, 0x45545257
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     if-ne v8, v9, :cond_5
a=0;// 
a=0;//     new-instance v8, Ljava/lang/String;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/String;);
a=0;//     iget-object v7, v7, Lcom/wukongtv/a/b;->g:[B
a=0;// 
a=0;//     invoke-direct {v8, v7}, Ljava/lang/String;-><init>([B)V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-static {v5, v4}, Lcom/wukongtv/a/a;->b(II)[B
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v2, v7}, Ljava/io/OutputStream;->write([B)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_5
a=0;//     #v8=(Integer);
a=0;//     iget v3, v7, Lcom/wukongtv/a/b;->a:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const v7, 0x45534c43
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-ne v3, v7, :cond_6
a=0;// 
a=0;//     invoke-static {v5, v4}, Lcom/wukongtv/a/a;->a(II)[B
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,[B);
a=0;//     invoke-virtual {v2, v3}, Ljava/io/OutputStream;->write([B)V
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iput-boolean v2, v0, Lcom/wukongtv/a/c;->c:Z
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_6
a=0;//     #v2=(Reference,Ljava/io/OutputStream;);v3=(Integer);
a=0;//     invoke-static {p1}, Lcom/wukongtv/a/d;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static b(Ljava/lang/String;)Lcom/wukongtv/a/c;
a=0;//     .locals 8
a=0;// 
a=0;//     const v7, 0x48545541
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const v6, 0x4e584e43
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     sget-object v0, Lcom/wukongtv/a/d;->a:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/wukongtv/a/c;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     new-instance v0, Lcom/wukongtv/a/c;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/a/c;);
a=0;//     invoke-direct {v0}, Lcom/wukongtv/a/c;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/a/c;);
a=0;//     new-instance v2, Ljava/net/InetSocketAddress;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/net/InetSocketAddress;);
a=0;//     const/16 v3, 0x15b3
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     invoke-direct {v2, p0, v3}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/net/InetSocketAddress;);
a=0;//     const/16 v3, 0xbb8
a=0;// 
a=0;//     invoke-virtual {v0, v2, v3}, Lcom/wukongtv/a/c;->connect(Ljava/net/SocketAddress;I)V
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/wukongtv/a/c;->isConnected()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Reference,Lcom/wukongtv/a/c;);
a=0;//     const/16 v2, 0xbb8
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     invoke-virtual {v0, v2}, Lcom/wukongtv/a/c;->setSoTimeout(I)V
a=0;// 
a=0;//     invoke-static {}, Lcom/wukongtv/a/a;->a()[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     invoke-virtual {v0}, Lcom/wukongtv/a/c;->getOutputStream()Ljava/io/OutputStream;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/OutputStream;);
a=0;//     invoke-virtual {v0}, Lcom/wukongtv/a/c;->getInputStream()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/InputStream;);
a=0;//     invoke-virtual {v3, v2}, Ljava/io/OutputStream;->write([B)V
a=0;// 
a=0;//     invoke-static {v4}, Lcom/wukongtv/a/b;->a(Ljava/io/InputStream;)Lcom/wukongtv/a/b;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget v5, v2, Lcom/wukongtv/a/b;->a:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-ne v5, v6, :cond_2
a=0;// 
a=0;//     sget-object v2, Lcom/wukongtv/a/d;->a:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v2, p0, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     sget-object v2, Ljava/lang/System;->err:Ljava/io/PrintStream;
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/PrintStream;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "connect "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Lcom/wukongtv/a/c;);v5=(Integer);
a=0;//     iget v5, v2, Lcom/wukongtv/a/b;->a:I
a=0;// 
a=0;//     if-ne v5, v7, :cond_4
a=0;// 
a=0;//     iget-object v2, v2, Lcom/wukongtv/a/b;->g:[B
a=0;// 
a=0;//     invoke-static {v2}, Lcom/wukongtv/a/f;->a([B)[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-static {v5, v2}, Lcom/wukongtv/a/a;->a(I[B)[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v3, v2}, Ljava/io/OutputStream;->write([B)V
a=0;// 
a=0;//     invoke-static {v4}, Lcom/wukongtv/a/b;->a(Ljava/io/InputStream;)Lcom/wukongtv/a/b;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget v5, v2, Lcom/wukongtv/a/b;->a:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-ne v5, v6, :cond_3
a=0;// 
a=0;//     sget-object v2, Lcom/wukongtv/a/d;->a:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v2, p0, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     iget v2, v2, Lcom/wukongtv/a/b;->a:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v2, v7, :cond_4
a=0;// 
a=0;//     const/16 v2, 0x7530
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     invoke-virtual {v0, v2}, Lcom/wukongtv/a/c;->setSoTimeout(I)V
a=0;// 
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-static {}, Lcom/wukongtv/a/f;->a()[B
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,[B);
a=0;//     invoke-static {v2, v5}, Lcom/wukongtv/a/a;->a(I[B)[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     invoke-virtual {v3, v2}, Ljava/io/OutputStream;->write([B)V
a=0;// 
a=0;//     invoke-static {v4}, Lcom/wukongtv/a/b;->a(Ljava/io/InputStream;)Lcom/wukongtv/a/b;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget v2, v2, Lcom/wukongtv/a/b;->a:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v2, v6, :cond_4
a=0;// 
a=0;//     sget-object v2, Lcom/wukongtv/a/d;->a:Ljava/util/HashMap;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v2, p0, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v2=(Conflicted);v5=(Conflicted);
a=0;//     invoke-static {p0}, Lcom/wukongtv/a/d;->c(Ljava/lang/String;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static b()V
a=0;//     .locals 1
a=0;// 
a=0;//     const-string v0, "127.0.0.1"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/wukongtv/a/d;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static c(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     sget-object v0, Lcom/wukongtv/a/d;->a:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/wukongtv/a/c;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     sget-object v1, Lcom/wukongtv/a/d;->a:Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v1, p0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-boolean v1, v0, Lcom/wukongtv/a/c;->c:Z
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {v0}, Lcom/wukongtv/a/c;->close()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     #v1=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
