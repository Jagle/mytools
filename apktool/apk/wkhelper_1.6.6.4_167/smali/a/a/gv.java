package a.a; class gv { void a() { int a;
a=0;// .class public final La/a/gv;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public a:La/a/gq;
a=0;// 
a=0;// .field private final b:I
a=0;// 
a=0;// .field private final c:I
a=0;// 
a=0;// .field private d:La/a/gt;
a=0;// 
a=0;// .field private e:Landroid/content/Context;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,La/a/gv;);
a=0;//     const/16 v0, 0x80
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     iput v0, p0, La/a/gv;->b:I
a=0;// 
a=0;//     const/16 v0, 0x100
a=0;// 
a=0;//     iput v0, p0, La/a/gv;->c:I
a=0;// 
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     const-string v1, "Context is null, can\'t track event"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(PosShort);v1=(Uninit);
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     iput-object v0, p0, La/a/gv;->e:Landroid/content/Context;
a=0;// 
a=0;//     new-instance v0, La/a/gt;
a=0;// 
a=0;//     #v0=(UninitRef,La/a/gt;);
a=0;//     iget-object v1, p0, La/a/gv;->e:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1}, La/a/gt;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,La/a/gt;);
a=0;//     iput-object v0, p0, La/a/gv;->d:La/a/gt;
a=0;// 
a=0;//     iget-object v1, p0, La/a/gv;->d:La/a/gt;
a=0;// 
a=0;//     sget-boolean v0, Lcom/umeng/a/a;->l:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     iput-boolean v0, v1, La/a/gt;->a:Z
a=0;// 
a=0;//     iget-object v0, p0, La/a/gv;->e:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, La/a/gq;->a(Landroid/content/Context;)La/a/gq;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, La/a/gv;->a:La/a/gq;
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
}}
