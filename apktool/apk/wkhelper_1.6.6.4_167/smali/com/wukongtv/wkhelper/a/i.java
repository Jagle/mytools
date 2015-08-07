package com.wukongtv.wkhelper.a; class i { void a() { int a;
a=0;// .class public final Lcom/wukongtv/wkhelper/a/i;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static a()Z
a=0;//     .locals 3
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v0, Ljava/net/InetSocketAddress;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/net/InetSocketAddress;);
a=0;//     const-string v1, "127.0.0.1"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/16 v2, 0x15b3
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     invoke-direct {v0, v1, v2}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/InetSocketAddress;);
a=0;//     new-instance v1, Ljava/net/Socket;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/net/Socket;);
a=0;//     invoke-direct {v1}, Ljava/net/Socket;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/net/Socket;);
a=0;//     const/16 v2, 0xbb8
a=0;// 
a=0;//     invoke-virtual {v1, v0, v2}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/net/Socket;->isConnected()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/net/Socket;->close()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static b()[B
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v5, 0x4
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     new-array v1, v5, [B
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     fill-array-data v1, :array_0
a=0;// 
a=0;//     const-string v0, "system start adbd "
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     array-length v0, v2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x4
a=0;// 
a=0;//     new-array v3, v0, [B
a=0;// 
a=0;//     #v3=(Reference,[B);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v4=(Conflicted);
a=0;//     array-length v4, v3
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ge v0, v4, :cond_1
a=0;// 
a=0;//     if-ge v0, v5, :cond_0
a=0;// 
a=0;//     aget-byte v4, v1, v0
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     aput-byte v4, v3, v0
a=0;// 
a=0;//     :goto_1
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v4=(Integer);
a=0;//     add-int/lit8 v4, v0, -0x4
a=0;// 
a=0;//     aget-byte v4, v2, v4
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     aput-byte v4, v3, v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_1
a=0;//     #v4=(Integer);
a=0;//     return-object v3
a=0;// 
a=0;//     :array_0
a=0;//     .array-data 1
a=0;//         0x12t
a=0;//         0x0t
a=0;//         0x0t
a=0;//         0x0t
a=0;//     .end array-data
a=0;// .end method
}}
