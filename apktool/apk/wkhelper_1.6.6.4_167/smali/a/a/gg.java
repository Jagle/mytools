package a.a; class gg { void a() { int a;
a=0;// .class public final La/a/gg;
a=0;// .super La/a/gi;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected a:Ljava/io/InputStream;
a=0;// 
a=0;// .field protected b:Ljava/io/OutputStream;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method protected constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, La/a/gi;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,La/a/gg;);
a=0;//     iput-object v0, p0, La/a/gg;->a:Ljava/io/InputStream;
a=0;// 
a=0;//     iput-object v0, p0, La/a/gg;->b:Ljava/io/OutputStream;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/io/OutputStream;)V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, La/a/gi;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,La/a/gg;);
a=0;//     iput-object v0, p0, La/a/gg;->a:Ljava/io/InputStream;
a=0;// 
a=0;//     iput-object v0, p0, La/a/gg;->b:Ljava/io/OutputStream;
a=0;// 
a=0;//     iput-object p1, p0, La/a/gg;->b:Ljava/io/OutputStream;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a([BII)I
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, La/a/gg;->a:Ljava/io/InputStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/InputStream;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, La/a/gj;
a=0;// 
a=0;//     #v0=(UninitRef,La/a/gj;);
a=0;//     const-string v1, "Cannot read from null inputStream"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, La/a/gj;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,La/a/gj;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v1=(Uninit);
a=0;//     iget-object v0, p0, La/a/gg;->a:Ljava/io/InputStream;
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gez v0, :cond_1
a=0;// 
a=0;//     new-instance v0, La/a/gj;
a=0;// 
a=0;//     #v0=(UninitRef,La/a/gj;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {v0, v1}, La/a/gj;-><init>(B)V
a=0;// 
a=0;//     #v0=(Reference,La/a/gj;);
a=0;//     throw v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v1=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     new-instance v1, La/a/gj;
a=0;// 
a=0;//     #v1=(UninitRef,La/a/gj;);
a=0;//     invoke-direct {v1, v0}, La/a/gj;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,La/a/gj;);
a=0;//     throw v1
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public final b([BII)V
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, La/a/gg;->b:Ljava/io/OutputStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/OutputStream;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, La/a/gj;
a=0;// 
a=0;//     #v0=(UninitRef,La/a/gj;);
a=0;//     const-string v1, "Cannot write to null outputStream"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, La/a/gj;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,La/a/gj;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v1=(Uninit);
a=0;//     iget-object v0, p0, La/a/gg;->b:Ljava/io/OutputStream;
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     new-instance v1, La/a/gj;
a=0;// 
a=0;//     #v1=(UninitRef,La/a/gj;);
a=0;//     invoke-direct {v1, v0}, La/a/gj;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,La/a/gj;);
a=0;//     throw v1
a=0;// .end method
}}
