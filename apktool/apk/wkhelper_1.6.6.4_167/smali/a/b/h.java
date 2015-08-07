package a.b; class h { void a() { int a;
a=0;// .class public La/b/h;
a=0;// .super La/b/l;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public a:La/b/i;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lorg/json/JSONObject;)V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-direct {p0, p1}, La/b/l;-><init>(Lorg/json/JSONObject;)V
a=0;// 
a=0;//     #p0=(Reference,La/b/h;);
a=0;//     const-string v0, "ok"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "status"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const-string v0, "ok"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "success"
a=0;// 
a=0;//     invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     sget-object v0, La/b/i;->a:La/b/i;
a=0;// 
a=0;//     #v0=(Reference,La/b/i;);
a=0;//     iput-object v0, p0, La/b/h;->a:La/b/i;
a=0;// 
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     sget-object v0, La/b/i;->b:La/b/i;
a=0;// 
a=0;//     #v0=(Reference,La/b/i;);
a=0;//     iput-object v0, p0, La/b/h;->a:La/b/i;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
