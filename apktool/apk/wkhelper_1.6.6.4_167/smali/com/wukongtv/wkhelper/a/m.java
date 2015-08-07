package com.wukongtv.wkhelper.a; class m { void a() { int a;
a=0;// .class public final Lcom/wukongtv/wkhelper/a/m;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static a(Ljava/lang/String;)Lcom/wukongtv/wkhelper/a/n;
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v0, v2, [Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     aput-object p0, v0, v1
a=0;// 
a=0;//     invoke-static {v0, v2, v2}, Lcom/wukongtv/wkhelper/a/m;->a([Ljava/lang/String;ZZ)Lcom/wukongtv/wkhelper/a/n;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/lang/String;ZZ)Lcom/wukongtv/wkhelper/a/n;
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     new-array v0, v0, [Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     aput-object p0, v0, v1
a=0;// 
a=0;//     invoke-static {v0, p1, p2}, Lcom/wukongtv/wkhelper/a/m;->a([Ljava/lang/String;ZZ)Lcom/wukongtv/wkhelper/a/n;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static a([Ljava/lang/String;ZZ)Lcom/wukongtv/wkhelper/a/n;
a=0;//     .locals 10
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     :try_start_0
a=0;//     #v2=(Byte);
a=0;//     invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Runtime;);
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     const-string v1, "su"
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v1}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_c
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_6
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     :try_start_1
a=0;//     #v7=(Reference,Ljava/lang/Process;);
a=0;//     new-instance v4, Ljava/io/DataOutputStream;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/DataOutputStream;);
a=0;//     invoke-virtual {v7}, Ljava/lang/Process;->getOutputStream()Ljava/io/OutputStream;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v4, v1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_d
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_7
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);v4=(Reference,Ljava/io/DataOutputStream;);
a=0;//     if-gtz v0, :cond_2
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :try_start_2
a=0;//     #v1=(Null);
a=0;//     aget-object v1, p0, v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     invoke-virtual {v4, v1}, Ljava/io/DataOutputStream;->write([B)V
a=0;// 
a=0;//     const-string v1, "\n"
a=0;// 
a=0;//     invoke-virtual {v4, v1}, Ljava/io/DataOutputStream;->writeBytes(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/io/DataOutputStream;->flush()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_e
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_8
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_2
a=0;// 
a=0;//     :cond_0
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_3
a=0;//     #v0=(Null);v1=(Uninit);v7=(Uninit);
a=0;//     const-string v1, "sh"
a=0;//     :try_end_3
a=0;//     .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_c
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_6
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     :try_start_4
a=0;//     #v0=(Integer);v7=(Reference,Ljava/lang/Process;);
a=0;//     const-string v0, "exit\n"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v0}, Ljava/io/DataOutputStream;->writeBytes(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/io/DataOutputStream;->flush()V
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/Process;->waitFor()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-eqz p2, :cond_b
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;//     :try_end_4
a=0;//     .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_e
a=0;//     .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_8
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_2
a=0;// 
a=0;//     :try_start_5
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;//     :try_end_5
a=0;//     .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_f
a=0;//     .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_9
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_2
a=0;// 
a=0;//     :try_start_6
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     new-instance v6, Ljava/io/BufferedReader;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/io/BufferedReader;);
a=0;//     new-instance v5, Ljava/io/InputStreamReader;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/io/InputStreamReader;);
a=0;//     invoke-virtual {v7}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/io/InputStream;);
a=0;//     invoke-direct {v5, v8}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/io/InputStreamReader;);
a=0;//     invoke-direct {v6, v5}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
a=0;//     :try_end_6
a=0;//     .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_10
a=0;//     .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_a
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_2
a=0;// 
a=0;//     :try_start_7
a=0;//     #v6=(Reference,Ljava/io/BufferedReader;);
a=0;//     new-instance v5, Ljava/io/BufferedReader;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/io/BufferedReader;);
a=0;//     new-instance v8, Ljava/io/InputStreamReader;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/io/InputStreamReader;);
a=0;//     invoke-virtual {v7}, Ljava/lang/Process;->getErrorStream()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/io/InputStream;);
a=0;//     invoke-direct {v8, v9}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V
a=0;// 
a=0;//     #v8=(Reference,Ljava/io/InputStreamReader;);
a=0;//     invoke-direct {v5, v8}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
a=0;//     :try_end_7
a=0;//     .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_11
a=0;//     .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_b
a=0;//     .catchall {:try_start_7 .. :try_end_7} :catchall_3
a=0;// 
a=0;//     :goto_2
a=0;//     :try_start_8
a=0;//     #v5=(Reference,Ljava/io/BufferedReader;);
a=0;//     invoke-virtual {v6}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     if-eqz v8, :cond_7
a=0;// 
a=0;//     invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;//     :try_end_8
a=0;//     .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_1
a=0;//     .catchall {:try_start_8 .. :try_end_8} :catchall_4
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v8
a=0;// 
a=0;//     :goto_3
a=0;//     #v8=(Conflicted);v9=(Conflicted);
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     :try_start_9
a=0;//     invoke-virtual {v4}, Ljava/io/DataOutputStream;->close()V
a=0;// 
a=0;//     :cond_3
a=0;//     if-eqz v6, :cond_4
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/io/BufferedReader;->close()V
a=0;// 
a=0;//     :cond_4
a=0;//     if-eqz v5, :cond_5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/io/BufferedReader;->close()V
a=0;//     :try_end_9
a=0;//     .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_3
a=0;// 
a=0;//     :cond_5
a=0;//     :goto_4
a=0;//     if-eqz v7, :cond_6
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/Process;->destroy()V
a=0;// 
a=0;//     :cond_6
a=0;//     :goto_5
a=0;//     new-instance v4, Lcom/wukongtv/wkhelper/a/n;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/wukongtv/wkhelper/a/n;);
a=0;//     if-nez v1, :cond_13
a=0;// 
a=0;//     move-object v1, v3
a=0;// 
a=0;//     :goto_6
a=0;//     if-nez v0, :cond_14
a=0;// 
a=0;//     move-object v0, v3
a=0;// 
a=0;//     :goto_7
a=0;//     invoke-direct {v4, v2, v1, v0}, Lcom/wukongtv/wkhelper/a/n;-><init>(ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/wukongtv/wkhelper/a/n;);
a=0;//     return-object v4
a=0;// 
a=0;//     :cond_7
a=0;//     :goto_8
a=0;//     :try_start_a
a=0;//     #v8=(Reference,Ljava/lang/String;);v9=(Reference,Ljava/io/InputStream;);
a=0;//     invoke-virtual {v5}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     if-eqz v8, :cond_c
a=0;// 
a=0;//     invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;//     :try_end_a
a=0;//     .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_1
a=0;//     .catchall {:try_start_a .. :try_end_a} :catchall_4
a=0;// 
a=0;//     goto :goto_8
a=0;// 
a=0;//     :catch_1
a=0;//     move-exception v8
a=0;// 
a=0;//     :goto_9
a=0;//     #v8=(Conflicted);v9=(Conflicted);
a=0;//     if-eqz v4, :cond_8
a=0;// 
a=0;//     :try_start_b
a=0;//     invoke-virtual {v4}, Ljava/io/DataOutputStream;->close()V
a=0;// 
a=0;//     :cond_8
a=0;//     if-eqz v6, :cond_9
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/io/BufferedReader;->close()V
a=0;// 
a=0;//     :cond_9
a=0;//     if-eqz v5, :cond_a
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/io/BufferedReader;->close()V
a=0;//     :try_end_b
a=0;//     .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_4
a=0;// 
a=0;//     :cond_a
a=0;//     :goto_a
a=0;//     if-eqz v7, :cond_6
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/Process;->destroy()V
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :cond_b
a=0;//     #v5=(Uninit);v6=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     move-object v0, v3
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object v1, v3
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move-object v5, v3
a=0;// 
a=0;//     #v5=(Null);
a=0;//     move-object v6, v3
a=0;// 
a=0;//     :cond_c
a=0;//     :try_start_c
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);v1=(Reference,Ljava/lang/StringBuilder;);v5=(Reference,Ljava/io/BufferedReader;);v6=(Reference,Ljava/io/BufferedReader;);v8=(Conflicted);v9=(Conflicted);
a=0;//     invoke-virtual {v4}, Ljava/io/DataOutputStream;->close()V
a=0;// 
a=0;//     if-eqz v6, :cond_d
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/io/BufferedReader;->close()V
a=0;// 
a=0;//     :cond_d
a=0;//     if-eqz v5, :cond_e
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/io/BufferedReader;->close()V
a=0;//     :try_end_c
a=0;//     .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_2
a=0;// 
a=0;//     :cond_e
a=0;//     :goto_b
a=0;//     if-eqz v7, :cond_6
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/Process;->destroy()V
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :catch_2
a=0;//     move-exception v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_b
a=0;// 
a=0;//     :catch_3
a=0;//     move-exception v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :catch_4
a=0;//     move-exception v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_a
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Null);v1=(Conflicted);v2=(Byte);v4=(Conflicted);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v4, v3
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move-object v6, v3
a=0;// 
a=0;//     #v6=(Null);
a=0;//     move-object v7, v3
a=0;// 
a=0;//     :goto_c
a=0;//     #v2=(Integer);v3=(Reference,Ljava/io/BufferedReader;);v4=(Reference,Ljava/io/DataOutputStream;);v5=(Conflicted);v6=(Reference,Ljava/io/BufferedReader;);v7=(Reference,Ljava/lang/Process;);v8=(Conflicted);v9=(Conflicted);
a=0;//     if-eqz v4, :cond_f
a=0;// 
a=0;//     :try_start_d
a=0;//     invoke-virtual {v4}, Ljava/io/DataOutputStream;->close()V
a=0;// 
a=0;//     :cond_f
a=0;//     if-eqz v6, :cond_10
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/io/BufferedReader;->close()V
a=0;// 
a=0;//     :cond_10
a=0;//     if-eqz v3, :cond_11
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/io/BufferedReader;->close()V
a=0;//     :try_end_d
a=0;//     .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_5
a=0;// 
a=0;//     :cond_11
a=0;//     :goto_d
a=0;//     if-eqz v7, :cond_12
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/Process;->destroy()V
a=0;// 
a=0;//     :cond_12
a=0;//     throw v0
a=0;// 
a=0;//     :catch_5
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_d
a=0;// 
a=0;//     :cond_13
a=0;//     #v3=(Null);v4=(UninitRef,Lcom/wukongtv/wkhelper/a/n;);v5=(Reference,Ljava/io/BufferedReader;);
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     :cond_14
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_7
a=0;// 
a=0;//     :catchall_1
a=0;//     #v0=(Null);v2=(Byte);v4=(Conflicted);v5=(Uninit);v6=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v4, v3
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move-object v6, v3
a=0;// 
a=0;//     #v6=(Null);
a=0;//     goto :goto_c
a=0;// 
a=0;//     :catchall_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Integer);v4=(Reference,Ljava/io/DataOutputStream;);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v6, v3
a=0;// 
a=0;//     #v6=(Null);
a=0;//     goto :goto_c
a=0;// 
a=0;//     :catchall_3
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);v6=(Reference,Ljava/io/BufferedReader;);v9=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_c
a=0;// 
a=0;//     :catchall_4
a=0;//     #v5=(Reference,Ljava/io/BufferedReader;);v8=(Reference,Ujava/lang/Object;);v9=(Reference,Ljava/io/InputStream;);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v3, v5
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/BufferedReader;);
a=0;//     goto :goto_c
a=0;// 
a=0;//     :catch_6
a=0;//     #v0=(Null);v1=(Conflicted);v2=(Byte);v3=(Null);v4=(Conflicted);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v4, v3
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move-object v0, v3
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object v1, v3
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move-object v5, v3
a=0;// 
a=0;//     #v5=(Null);
a=0;//     move-object v6, v3
a=0;// 
a=0;//     #v6=(Null);
a=0;//     move-object v7, v3
a=0;// 
a=0;//     #v7=(Null);
a=0;//     goto :goto_9
a=0;// 
a=0;//     :catch_7
a=0;//     #v1=(Reference,Ujava/lang/Object;);v4=(Conflicted);v5=(Uninit);v6=(Uninit);v7=(Reference,Ljava/lang/Process;);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v4, v3
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move-object v0, v3
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object v1, v3
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move-object v5, v3
a=0;// 
a=0;//     #v5=(Null);
a=0;//     move-object v6, v3
a=0;// 
a=0;//     #v6=(Null);
a=0;//     goto :goto_9
a=0;// 
a=0;//     :catch_8
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Integer);v4=(Reference,Ljava/io/DataOutputStream;);v5=(Uninit);v6=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v0, v3
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object v1, v3
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move-object v5, v3
a=0;// 
a=0;//     #v5=(Null);
a=0;//     move-object v6, v3
a=0;// 
a=0;//     #v6=(Null);
a=0;//     goto/16 :goto_9
a=0;// 
a=0;//     :catch_9
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/StringBuilder;);v5=(Uninit);v6=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v0, v3
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object v5, v3
a=0;// 
a=0;//     #v5=(Null);
a=0;//     move-object v6, v3
a=0;// 
a=0;//     #v6=(Null);
a=0;//     goto/16 :goto_9
a=0;// 
a=0;//     :catch_a
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v5, v3
a=0;// 
a=0;//     #v5=(Null);
a=0;//     move-object v6, v3
a=0;// 
a=0;//     #v6=(Null);
a=0;//     goto/16 :goto_9
a=0;// 
a=0;//     :catch_b
a=0;//     #v5=(Conflicted);v6=(Reference,Ljava/io/BufferedReader;);v9=(Conflicted);
a=0;//     move-exception v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v5, v3
a=0;// 
a=0;//     #v5=(Null);
a=0;//     goto/16 :goto_9
a=0;// 
a=0;//     :catch_c
a=0;//     #v0=(Null);v1=(Conflicted);v2=(Byte);v4=(Conflicted);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     move-object v4, v3
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move-object v0, v3
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object v1, v3
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move-object v5, v3
a=0;// 
a=0;//     #v5=(Null);
a=0;//     move-object v6, v3
a=0;// 
a=0;//     #v6=(Null);
a=0;//     move-object v7, v3
a=0;// 
a=0;//     #v7=(Null);
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :catch_d
a=0;//     #v1=(Reference,Ujava/lang/Object;);v4=(Conflicted);v5=(Uninit);v6=(Uninit);v7=(Reference,Ljava/lang/Process;);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     move-object v4, v3
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move-object v0, v3
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object v1, v3
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move-object v5, v3
a=0;// 
a=0;//     #v5=(Null);
a=0;//     move-object v6, v3
a=0;// 
a=0;//     #v6=(Null);
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :catch_e
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Integer);v4=(Reference,Ljava/io/DataOutputStream;);v5=(Uninit);v6=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     move-object v0, v3
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object v1, v3
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move-object v5, v3
a=0;// 
a=0;//     #v5=(Null);
a=0;//     move-object v6, v3
a=0;// 
a=0;//     #v6=(Null);
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :catch_f
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/StringBuilder;);v5=(Uninit);v6=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     move-object v0, v3
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object v5, v3
a=0;// 
a=0;//     #v5=(Null);
a=0;//     move-object v6, v3
a=0;// 
a=0;//     #v6=(Null);
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :catch_10
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/io/IOException;);
a=0;//     move-object v5, v3
a=0;// 
a=0;//     #v5=(Null);
a=0;//     move-object v6, v3
a=0;// 
a=0;//     #v6=(Null);
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :catch_11
a=0;//     #v5=(Conflicted);v6=(Reference,Ljava/io/BufferedReader;);v9=(Conflicted);
a=0;//     move-exception v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/io/IOException;);
a=0;//     move-object v5, v3
a=0;// 
a=0;//     #v5=(Null);
a=0;//     goto/16 :goto_3
a=0;// .end method
a=0;// 
a=0;// .method public static a()Z
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const-string v2, "echo root"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v0, v1}, Lcom/wukongtv/wkhelper/a/m;->a(Ljava/lang/String;ZZ)Lcom/wukongtv/wkhelper/a/n;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget v2, v2, Lcom/wukongtv/wkhelper/a/n;->a:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(One);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
