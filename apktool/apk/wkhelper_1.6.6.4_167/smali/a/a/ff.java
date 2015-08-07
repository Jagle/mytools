package a.a; class ff { void a() { int a;
a=0;// .class final La/a/ff;
a=0;// .super La/a/gf;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, La/a/gf;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,La/a/ff;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(B)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, La/a/ff;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,La/a/ff;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final synthetic a(La/a/fu;La/a/eu;)V
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     check-cast p2, La/a/fc;
a=0;// 
a=0;//     iput-object v0, p2, La/a/fc;->c:La/a/fa;
a=0;// 
a=0;//     iput-object v0, p2, La/a/fc;->b:Ljava/lang/Object;
a=0;// 
a=0;//     invoke-virtual {p1}, La/a/fu;->l()S
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Short);
a=0;//     invoke-virtual {p2, p1, v0}, La/a/fc;->a(La/a/fu;S)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     iput-object v1, p2, La/a/fc;->b:Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v1, p2, La/a/fc;->b:Ljava/lang/Object;
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p2, v0}, La/a/fc;->a(S)La/a/fa;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,La/a/fa;);
a=0;//     iput-object v0, p2, La/a/fc;->c:La/a/fa;
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final synthetic b(La/a/fu;La/a/eu;)V
a=0;//     .locals 2
a=0;// 
a=0;//     check-cast p2, La/a/fc;
a=0;// 
a=0;//     invoke-virtual {p2}, La/a/fc;->b()La/a/fa;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,La/a/fa;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p2}, La/a/fc;->c()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     new-instance v0, La/a/fv;
a=0;// 
a=0;//     #v0=(UninitRef,La/a/fv;);
a=0;//     const-string v1, "Cannot write a TUnion with no set value!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, La/a/fv;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,La/a/fv;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Uninit);
a=0;//     iget-object v0, p2, La/a/fc;->c:La/a/fa;
a=0;// 
a=0;//     invoke-interface {v0}, La/a/fa;->a()S
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Short);
a=0;//     invoke-virtual {p1, v0}, La/a/fu;->a(S)V
a=0;// 
a=0;//     invoke-virtual {p2, p1}, La/a/fc;->d(La/a/fu;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
