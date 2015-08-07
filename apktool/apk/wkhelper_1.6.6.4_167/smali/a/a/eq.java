package a.a; class eq { void a() { int a;
a=0;// .class public final La/a/eq;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static a:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static a([B)[B
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     array-length v1, p0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-gtz v1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,[B);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Integer);v2=(Uninit);v3=(Uninit);
a=0;//     new-instance v2, Ljava/util/zip/Deflater;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/zip/Deflater;);
a=0;//     invoke-direct {v2}, Ljava/util/zip/Deflater;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/zip/Deflater;);
a=0;//     invoke-virtual {v2, p0}, Ljava/util/zip/Deflater;->setInput([B)V
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/util/zip/Deflater;->finish()V
a=0;// 
a=0;//     const/16 v1, 0x2000
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     new-array v3, v1, [B
a=0;// 
a=0;//     #v3=(Reference,[B);
a=0;//     sput v4, La/a/eq;->a:I
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v1, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_1
a=0;// 
a=0;//     :goto_1
a=0;//     :try_start_1
a=0;//     #v0=(Integer);v1=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-virtual {v2}, Ljava/util/zip/Deflater;->finished()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/util/zip/Deflater;->end()V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     :try_start_2
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {v2, v3}, Ljava/util/zip/Deflater;->deflate([B)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v4, La/a/eq;->a:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/2addr v4, v0
a=0;// 
a=0;//     sput v4, La/a/eq;->a:I
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v1, v3, v4, v0}, Ljava/io/ByteArrayOutputStream;->write([BII)V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catchall_0
a=0;//     #v4=(Integer);
a=0;//     move-exception v0
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);v5=(Conflicted);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;// 
a=0;//     :cond_3
a=0;//     throw v0
a=0;// 
a=0;//     :catchall_1
a=0;//     #v0=(Null);v1=(Conflicted);v4=(Null);v5=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v5, v1
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move-object v0, v5
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_2
a=0;// .end method
}}
