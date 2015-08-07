package com.wukongtv.wkhelper; class u { void a() { int a;
a=0;// .class final Lcom/wukongtv/wkhelper/u;
a=0;// .super Landroid/os/AsyncTask;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/wukongtv/wkhelper/t;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/wukongtv/wkhelper/t;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/wukongtv/wkhelper/u;->a:Lcom/wukongtv/wkhelper/t;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/u;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v2=(Null);
a=0;//     new-instance v0, Ljava/net/InetSocketAddress;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/net/InetSocketAddress;);
a=0;//     const-string v1, "127.0.0.1"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/16 v3, 0x1f9a
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     invoke-direct {v0, v1, v3}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/InetSocketAddress;);
a=0;//     new-instance v1, Ljava/net/Socket;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/net/Socket;);
a=0;//     invoke-direct {v1}, Ljava/net/Socket;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/net/Socket;);
a=0;//     const/16 v3, 0x3e8
a=0;// 
a=0;//     invoke-virtual {v1, v0, v3}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v3, "start adbd"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/io/OutputStream;->write([B)V
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/net/Socket;->close()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     :try_start_1
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     new-instance v0, Landroid/net/LocalSocket;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/net/LocalSocket;);
a=0;//     invoke-direct {v0}, Landroid/net/LocalSocket;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/net/LocalSocket;);
a=0;//     new-instance v1, Landroid/net/LocalSocketAddress;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/net/LocalSocketAddress;);
a=0;//     const-string v3, "configserver"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     sget-object v4, Landroid/net/LocalSocketAddress$Namespace;->RESERVED:Landroid/net/LocalSocketAddress$Namespace;
a=0;// 
a=0;//     #v4=(Reference,Landroid/net/LocalSocketAddress$Namespace;);
a=0;//     invoke-direct {v1, v3, v4}, Landroid/net/LocalSocketAddress;-><init>(Ljava/lang/String;Landroid/net/LocalSocketAddress$Namespace;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/net/LocalSocketAddress;);
a=0;//     invoke-virtual {v0, v1}, Landroid/net/LocalSocket;->connect(Landroid/net/LocalSocketAddress;)V
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/net/LocalSocket;->getOutputStream()Ljava/io/OutputStream;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :try_start_2
a=0;//     new-instance v1, Ljava/io/DataOutputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/DataOutputStream;);
a=0;//     invoke-direct {v1, v3}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_5
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_1
a=0;// 
a=0;//     :try_start_3
a=0;//     #v1=(Reference,Ljava/io/DataOutputStream;);
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/a/i;->b()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->write([B)V
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/DataOutputStream;->flush()V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_6
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_2
a=0;// 
a=0;//     :try_start_4
a=0;//     invoke-virtual {v1}, Ljava/io/DataOutputStream;->close()V
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v2=(Reference,Ljava/io/OutputStream;);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/a/i;->a()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Boolean;);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Null);v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_1
a=0;//     #v1=(Reference,Ljava/io/DataOutputStream;);v3=(Reference,Ljava/io/OutputStream;);v4=(Reference,Landroid/net/LocalSocketAddress$Namespace;);
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     :goto_2
a=0;//     :try_start_5
a=0;//     #v1=(Reference,Ljava/io/DataOutputStream;);v2=(Reference,Ljava/io/OutputStream;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_5
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_3
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     :try_start_6
a=0;//     invoke-virtual {v1}, Ljava/io/DataOutputStream;->close()V
a=0;// 
a=0;//     :cond_1
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
a=0;//     :try_end_6
a=0;//     .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_3
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v3, v2
a=0;// 
a=0;//     :goto_3
a=0;//     #v2=(Reference,Ljava/io/DataOutputStream;);v3=(Reference,Ljava/io/OutputStream;);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     :try_start_7
a=0;//     invoke-virtual {v2}, Ljava/io/DataOutputStream;->close()V
a=0;// 
a=0;//     :cond_2
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
a=0;//     :try_end_7
a=0;//     .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_4
a=0;// 
a=0;//     :cond_3
a=0;//     :goto_4
a=0;//     throw v0
a=0;// 
a=0;//     :catch_4
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :catchall_1
a=0;//     #v1=(Conflicted);v2=(Null);v4=(Reference,Landroid/net/LocalSocketAddress$Namespace;);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catchall_2
a=0;//     #v1=(Reference,Ljava/io/DataOutputStream;);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v2, v1
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/DataOutputStream;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catchall_3
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v3, v2
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/OutputStream;);
a=0;//     move-object v2, v1
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catch_5
a=0;//     #v1=(Conflicted);v2=(Null);v4=(Reference,Landroid/net/LocalSocketAddress$Namespace;);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/OutputStream;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_6
a=0;//     #v1=(Reference,Ljava/io/DataOutputStream;);v2=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v2, v3
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/OutputStream;);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method protected final synthetic onPostExecute(Ljava/lang/Object;)V
a=0;//     .locals 1
a=0;// 
a=0;//     check-cast p1, Ljava/lang/Boolean;
a=0;// 
a=0;//     invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/u;->a:Lcom/wukongtv/wkhelper/t;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/t;);
a=0;//     iget-object v0, v0, Lcom/wukongtv/wkhelper/t;->a:Lcom/wukongtv/wkhelper/RemoteService;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/RemoteService;->a(Lcom/wukongtv/wkhelper/RemoteService;)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
