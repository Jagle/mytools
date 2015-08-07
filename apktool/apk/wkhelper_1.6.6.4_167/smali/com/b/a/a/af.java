package com.b.a.a; class af { void a() { int a;
a=0;// .class final Lcom/b/a/a/af;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public a:Ljava/io/File;
a=0;// 
a=0;// .field public b:[B
a=0;// 
a=0;// .field final synthetic c:Lcom/b/a/a/ae;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/b/a/a/ae;Ljava/lang/String;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     iput-object p1, p0, Lcom/b/a/a/af;->c:Lcom/b/a/a/ae;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/b/a/a/af;);
a=0;//     invoke-static {p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p3}, Ljava/io/File;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p5
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-direct {p0, p2, p5, p4}, Lcom/b/a/a/af;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     iput-object v0, p0, Lcom/b/a/a/af;->b:[B
a=0;// 
a=0;//     iput-object p3, p0, Lcom/b/a/a/af;->a:Ljava/io/File;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)[B
a=0;//     .locals 4
a=0;// 
a=0;//     new-instance v1, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     iget-object v0, p0, Lcom/b/a/a/af;->c:Lcom/b/a/a/ae;
a=0;// 
a=0;//     #v0=(Reference,Lcom/b/a/a/ae;);
a=0;//     invoke-static {v0}, Lcom/b/a/a/ae;->a(Lcom/b/a/a/ae;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/io/ByteArrayOutputStream;->write([B)V
a=0;// 
a=0;//     invoke-static {p1, p2}, Lcom/b/a/a/ae;->b(Ljava/lang/String;Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/io/ByteArrayOutputStream;->write([B)V
a=0;// 
a=0;//     invoke-static {p3}, Lcom/b/a/a/ae;->c(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/io/ByteArrayOutputStream;->write([B)V
a=0;// 
a=0;//     invoke-static {}, Lcom/b/a/a/ae;->a()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/io/ByteArrayOutputStream;->write([B)V
a=0;// 
a=0;//     invoke-static {}, Lcom/b/a/a/ae;->b()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/io/ByteArrayOutputStream;->write([B)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Uninit);v3=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     const-string v2, "SimpleMultipartEntity"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "createHeader ByteArrayOutputStream exception"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
