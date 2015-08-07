package com.wukongtv.wkhelper.h; class f { void a() { int a;
a=0;// .class public final Lcom/wukongtv/wkhelper/h/f;
a=0;// .super Ljava/lang/Thread;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field a:Ljava/net/DatagramSocket;
a=0;// 
a=0;// .field b:Landroid/os/Handler;
a=0;// 
a=0;// .field c:[B
a=0;// 
a=0;// .field public d:Ljava/lang/String;
a=0;// 
a=0;// .field e:Z
a=0;// 
a=0;// .field private f:Landroid/content/Context;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/os/Handler;Ljava/net/DatagramSocket;Landroid/content/Context;)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/h/f;);
a=0;//     const/16 v0, 0x400
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     new-array v0, v0, [B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/h/f;->c:[B
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/wukongtv/wkhelper/h/f;->e:Z
a=0;// 
a=0;//     iput-object p1, p0, Lcom/wukongtv/wkhelper/h/f;->b:Landroid/os/Handler;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/wukongtv/wkhelper/h/f;->a:Ljava/net/DatagramSocket;
a=0;// 
a=0;//     iput-object p3, p0, Lcom/wukongtv/wkhelper/h/f;->f:Landroid/content/Context;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;)I
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget v0, v1, Landroid/content/pm/PackageInfo;->versionCode:I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Conflicted);v3=(Conflicted);
a=0;//     const/high16 v1, 0x5290000
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     or-int/2addr v0, v1
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final run()V
a=0;//     .locals 10
a=0;// 
a=0;//     const/16 v9, 0x826
a=0;// 
a=0;//     #v9=(PosShort);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Null);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     iget-boolean v0, p0, Lcom/wukongtv/wkhelper/h/f;->e:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     new-instance v0, Ljava/net/DatagramPacket;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/net/DatagramPacket;);
a=0;//     iget-object v3, p0, Lcom/wukongtv/wkhelper/h/f;->c:[B
a=0;// 
a=0;//     #v3=(Reference,[B);
a=0;//     iget-object v4, p0, Lcom/wukongtv/wkhelper/h/f;->c:[B
a=0;// 
a=0;//     #v4=(Reference,[B);
a=0;//     array-length v4, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-direct {v0, v3, v4}, Ljava/net/DatagramPacket;-><init>([BI)V
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Ljava/net/DatagramPacket;);
a=0;//     iget-object v3, p0, Lcom/wukongtv/wkhelper/h/f;->a:Ljava/net/DatagramSocket;
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/net/DatagramSocket;->receive(Ljava/net/DatagramPacket;)V
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/net/DatagramPacket;->getData()[B
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/net/DatagramPacket;->getAddress()Ljava/net/InetAddress;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/net/InetAddress;);
a=0;//     invoke-virtual {v0}, Ljava/net/DatagramPacket;->getPort()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v4, v0, v3}, Lcom/wukongtv/wkhelper/b/m;->a(Ljava/net/InetAddress;I[B)Lcom/wukongtv/wkhelper/b/m;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     new-array v0, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v3}, Lcom/wukongtv/wkhelper/b/m;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     aput-object v5, v0, v4
a=0;// 
a=0;//     iget v0, v3, Lcom/wukongtv/wkhelper/b/m;->c:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v4, 0x819
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     if-eq v0, v4, :cond_1
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v4=(Conflicted);v5=(Conflicted);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget v0, v3, Lcom/wukongtv/wkhelper/b/m;->c:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eq v0, v9, :cond_5
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Message;);
a=0;//     const/16 v4, 0x800
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     iput v4, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     iput-object v3, v0, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/wukongtv/wkhelper/h/f;->b:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);v4=(PosShort);v5=(Reference,Ljava/lang/String;);
a=0;//     const/16 v0, 0x820
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     iput v0, v3, Lcom/wukongtv/wkhelper/b/m;->c:I
a=0;// 
a=0;//     iget v0, v3, Lcom/wukongtv/wkhelper/b/m;->d:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/c/a;->a()Lcom/wukongtv/wkhelper/c/a;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Lcom/wukongtv/wkhelper/c/a;);
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/wukongtv/wkhelper/c/a;->c()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iput v4, v3, Lcom/wukongtv/wkhelper/b/m;->d:I
a=0;// 
a=0;//     iget-object v4, p0, Lcom/wukongtv/wkhelper/h/f;->f:Landroid/content/Context;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v4}, Lcom/wukongtv/wkhelper/h/f;->a(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iput v4, v3, Lcom/wukongtv/wkhelper/b/m;->e:I
a=0;// 
a=0;//     const/16 v4, 0x26
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     if-lt v0, v4, :cond_3
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/b/l;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/b/l;);
a=0;//     invoke-direct {v0}, Lcom/wukongtv/wkhelper/b/l;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/b/l;);
a=0;//     iget-object v4, p0, Lcom/wukongtv/wkhelper/h/f;->d:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v4}, Lcom/wukongtv/wkhelper/b/l;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     sget-object v4, Landroid/os/Build;->HOST:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Lcom/wukongtv/wkhelper/b/l;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     sget-object v4, Landroid/os/Build;->MODEL:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Lcom/wukongtv/wkhelper/b/l;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     sget-object v4, Landroid/os/Build;->PRODUCT:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Lcom/wukongtv/wkhelper/b/l;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/wukongtv/wkhelper/b/l;->toString()Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/wukongtv/wkhelper/b/l;->a()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Lcom/wukongtv/wkhelper/b/m;->a([B)V
a=0;// 
a=0;//     :goto_3
a=0;//     #v4=(Conflicted);
a=0;//     invoke-virtual {v3}, Lcom/wukongtv/wkhelper/b/m;->b()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v4, Ljava/net/DatagramPacket;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/net/DatagramPacket;);
a=0;//     array-length v5, v0
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget-object v6, v3, Lcom/wukongtv/wkhelper/b/m;->a:Ljava/net/InetAddress;
a=0;// 
a=0;//     #v6=(Reference,Ljava/net/InetAddress;);
a=0;//     iget v7, v3, Lcom/wukongtv/wkhelper/b/m;->b:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-direct {v4, v0, v5, v6, v7}, Ljava/net/DatagramPacket;-><init>([BILjava/net/InetAddress;I)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/net/DatagramPacket;);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/h/f;->a:Ljava/net/DatagramSocket;
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/net/DatagramSocket;->send(Ljava/net/DatagramPacket;)V
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Integer);v4=(PosByte);v5=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/h/f;->d:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v3, v0}, Lcom/wukongtv/wkhelper/b/m;->a([B)V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/h/f;->d:Ljava/lang/String;
a=0;// 
a=0;//     const-string v4, "UTF-8"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Lcom/wukongtv/wkhelper/b/m;->a([B)V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Integer);v4=(Conflicted);v5=(Conflicted);
a=0;//     const/16 v0, 0x827
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     iput v0, v3, Lcom/wukongtv/wkhelper/b/m;->c:I
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/h/f;->d:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-nez v0, :cond_6
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v3, v0}, Lcom/wukongtv/wkhelper/b/m;->a([B)V
a=0;// 
a=0;//     :goto_4
a=0;//     #v0=(Reference,[B);
a=0;//     invoke-virtual {v3}, Lcom/wukongtv/wkhelper/b/m;->b()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v4, Ljava/net/DatagramPacket;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/net/DatagramPacket;);
a=0;//     array-length v5, v0
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget-object v6, v3, Lcom/wukongtv/wkhelper/b/m;->a:Ljava/net/InetAddress;
a=0;// 
a=0;//     #v6=(Reference,Ljava/net/InetAddress;);
a=0;//     iget v7, v3, Lcom/wukongtv/wkhelper/b/m;->b:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-direct {v4, v0, v5, v6, v7}, Ljava/net/DatagramPacket;-><init>([BILjava/net/InetAddress;I)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/net/DatagramPacket;);
a=0;//     new-instance v0, Ljava/net/InetSocketAddress;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/net/InetSocketAddress;);
a=0;//     iget-object v5, v3, Lcom/wukongtv/wkhelper/b/m;->a:Ljava/net/InetAddress;
a=0;// 
a=0;//     #v5=(Reference,Ljava/net/InetAddress;);
a=0;//     iget v6, v3, Lcom/wukongtv/wkhelper/b/m;->b:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-direct {v0, v5, v6}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/InetSocketAddress;);
a=0;//     iget-object v5, p0, Lcom/wukongtv/wkhelper/h/f;->b:Landroid/os/Handler;
a=0;// 
a=0;//     const/16 v6, 0x826
a=0;// 
a=0;//     #v6=(PosShort);
a=0;//     iget v7, v3, Lcom/wukongtv/wkhelper/b/m;->d:I
a=0;// 
a=0;//     iget v8, v3, Lcom/wukongtv/wkhelper/b/m;->e:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v5, v6, v7, v8, v0}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v5, p0, Lcom/wukongtv/wkhelper/h/f;->b:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v5, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/h/f;->a:Ljava/net/DatagramSocket;
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/net/DatagramSocket;->send(Ljava/net/DatagramPacket;)V
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Reference,Ljava/lang/String;);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/h/f;->d:Ljava/lang/String;
a=0;// 
a=0;//     const-string v4, "UTF-8"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Lcom/wukongtv/wkhelper/b/m;->a([B)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :cond_7
a=0;//     #v0=(Boolean);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
