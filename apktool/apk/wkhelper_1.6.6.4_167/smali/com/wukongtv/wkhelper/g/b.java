package com.wukongtv.wkhelper.g; class b { void a() { int a;
a=0;// .class final Lcom/wukongtv/wkhelper/g/b;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/wukongtv/wkhelper/g/a;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/wukongtv/wkhelper/g/a;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/wukongtv/wkhelper/g/b;->a:Lcom/wukongtv/wkhelper/g/a;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/g/b;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final run()V
a=0;//     .locals 8
a=0;// 
a=0;//     const-wide/16 v6, 0x0
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/g/b;->a:Lcom/wukongtv/wkhelper/g/a;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/g/a;);
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/g/a;->a(Lcom/wukongtv/wkhelper/g/a;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "mySharedPreferences"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "statmanagerlastsenttime"
a=0;// 
a=0;//     invoke-interface {v0, v1, v6, v7}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     cmp-long v1, v2, v6
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     const-string v1, "installaction"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     new-instance v1, Lcom/b/a/a/z;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/b/a/a/z;);
a=0;//     invoke-direct {v1}, Lcom/b/a/a/z;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lcom/b/a/a/z;);
a=0;//     const-string v2, "f"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "1"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, v3}, Lcom/b/a/a/z;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const-string v0, "a"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "update"
a=0;// 
a=0;//     invoke-virtual {v1, v0, v2}, Lcom/b/a/a/z;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     :goto_0
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/g/b;->a:Lcom/wukongtv/wkhelper/g/a;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/g/a;->b(Lcom/wukongtv/wkhelper/g/a;)Lcom/wukongtv/wkhelper/g/d;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/wukongtv/wkhelper/g/d;->a(Lcom/b/a/a/z;)Lcom/b/a/a/z;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "sending first stat\n"
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Lcom/b/a/a/z;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/c/z;->a()Lcom/wukongtv/wkhelper/c/z;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "http://dd2.wukongtv.com/tvclient/init"
a=0;// 
a=0;//     iget-object v3, p0, Lcom/wukongtv/wkhelper/g/b;->a:Lcom/wukongtv/wkhelper/g/a;
a=0;// 
a=0;//     iget-object v3, v3, Lcom/wukongtv/wkhelper/g/a;->c:Lcom/b/a/a/ag;
a=0;// 
a=0;//     invoke-virtual {v1, v2, v0, v3}, Lcom/wukongtv/wkhelper/c/z;->a(Ljava/lang/String;Lcom/b/a/a/z;Lcom/b/a/a/ac;)V
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/g/b;->a:Lcom/wukongtv/wkhelper/g/a;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/g/a;);
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/g/a;->c(Lcom/wukongtv/wkhelper/g/a;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-wide/32 v2, 0x927c0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v0, p0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Reference,Lcom/b/a/a/z;);v2=(Reference,Ljava/lang/String;);v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "a"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "new"
a=0;// 
a=0;//     invoke-virtual {v1, v0, v2}, Lcom/b/a/a/z;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Byte);v2=(LongLo);v3=(LongHi);
a=0;//     invoke-static {v2, v3}, Lcom/wukongtv/wkhelper/g/a;->b(J)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Lcom/b/a/a/z;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/b/a/a/z;);
a=0;//     invoke-direct {v0}, Lcom/b/a/a/z;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/b/a/a/z;);
a=0;//     const-string v1, "f"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "0"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/b/a/a/z;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/g/b;->a:Lcom/wukongtv/wkhelper/g/a;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/wukongtv/wkhelper/g/a;->b(Lcom/wukongtv/wkhelper/g/a;)Lcom/wukongtv/wkhelper/g/d;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcom/wukongtv/wkhelper/g/d;->a(Lcom/b/a/a/z;)Lcom/b/a/a/z;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "sending stat\n"
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Lcom/b/a/a/z;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/c/z;->a()Lcom/wukongtv/wkhelper/c/z;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "http://dd2.wukongtv.com/tvclient/init"
a=0;// 
a=0;//     iget-object v3, p0, Lcom/wukongtv/wkhelper/g/b;->a:Lcom/wukongtv/wkhelper/g/a;
a=0;// 
a=0;//     #v3=(Reference,Lcom/wukongtv/wkhelper/g/a;);
a=0;//     iget-object v3, v3, Lcom/wukongtv/wkhelper/g/a;->c:Lcom/b/a/a/ag;
a=0;// 
a=0;//     invoke-virtual {v1, v2, v0, v3}, Lcom/wukongtv/wkhelper/c/z;->a(Ljava/lang/String;Lcom/b/a/a/z;Lcom/b/a/a/ac;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
