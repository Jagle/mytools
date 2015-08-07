package com.umeng.update; class k { void a() { int a;
a=0;// .class final Lcom/umeng/update/k;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field a:Landroid/content/Context;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/umeng/update/k;);
a=0;//     iput-object p1, p0, Lcom/umeng/update/k;->a:Landroid/content/Context;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final run()V
a=0;//     .locals 8
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     new-instance v3, Lcom/umeng/update/q;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/umeng/update/q;);
a=0;//     iget-object v1, p0, Lcom/umeng/update/k;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v3, v1}, Lcom/umeng/update/q;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/umeng/update/q;);
a=0;//     const-string v1, "is .so file ready: %b"
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     new-array v4, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-static {}, Lcom/umeng/update/util/DeltaUpdate;->a()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Boolean;);
a=0;//     aput-object v6, v4, v5
a=0;// 
a=0;//     invoke-static {v1, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     new-instance v4, Lcom/umeng/update/t;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/umeng/update/t;);
a=0;//     iget-object v1, v3, Lcom/umeng/update/q;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {v4, v1}, Lcom/umeng/update/t;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/umeng/update/t;);
a=0;//     move v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move-object v0, v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/umeng/update/p;);v1=(Integer);v5=(Integer);
a=0;//     iget-object v5, v3, Lcom/umeng/update/q;->b:[Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/String;);
a=0;//     array-length v5, v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-ge v1, v5, :cond_0
a=0;// 
a=0;//     iget-object v0, v3, Lcom/umeng/update/q;->b:[Ljava/lang/String;
a=0;// 
a=0;//     aget-object v0, v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v4, v0}, Lcom/umeng/update/t;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     const-class v0, Lcom/umeng/update/p;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v3, v4, v0}, Lcom/umeng/update/q;->a(La/b/k;Ljava/lang/Class;)La/b/l;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/umeng/update/p;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v0, v1}, Lcom/umeng/update/c;->a(ILcom/umeng/update/p;)V
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Reference,Ujava/lang/Object;);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Reference,Lcom/umeng/update/p;);v1=(Integer);v2=(Null);v3=(Reference,Lcom/umeng/update/q;);v4=(Reference,Lcom/umeng/update/t;);v5=(Integer);v6=(Reference,Ljava/lang/Boolean;);
a=0;//     iget-boolean v1, v0, Lcom/umeng/update/p;->a:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-static {v1, v0}, Lcom/umeng/update/c;->a(ILcom/umeng/update/p;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-static {v7, v2}, Lcom/umeng/update/c;->a(ILcom/umeng/update/p;)V
a=0;// 
a=0;//     const-string v1, "update"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "request update error"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v0}, La/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Boolean);v2=(Null);v3=(Reference,Lcom/umeng/update/q;);v4=(Reference,Lcom/umeng/update/t;);v5=(Integer);v6=(Reference,Ljava/lang/Boolean;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v1=(Null);
a=0;//     invoke-static {v1, v0}, Lcom/umeng/update/c;->a(ILcom/umeng/update/p;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Error;);
a=0;//     const-string v1, "update"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "request update error"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Error;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v1, v0}, La/b/b;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
