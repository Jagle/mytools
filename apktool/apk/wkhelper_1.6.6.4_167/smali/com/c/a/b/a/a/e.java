package com.c.a.b.a.a; class e { void a() { int a;
a=0;// .class abstract Lcom/c/a/b/a/a/e;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/util/Iterator;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field a:Lcom/c/a/b/a/a/g;
a=0;// 
a=0;// .field b:Ljava/lang/Object;
a=0;// 
a=0;// .field final synthetic c:Lcom/c/a/b/a/a/d;
a=0;// 
a=0;// .field private d:Lcom/c/a/b/a/a/g;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/c/a/b/a/a/d;)V
a=0;//     .locals 2
a=0;// 
a=0;//     iput-object p1, p0, Lcom/c/a/b/a/a/e;->c:Lcom/c/a/b/a/a/d;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/c/a/b/a/a/e;);
a=0;//     iget-object v1, p1, Lcom/c/a/b/a/a/d;->c:Ljava/util/concurrent/locks/ReentrantLock;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/concurrent/locks/ReentrantLock;);
a=0;//     invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Lcom/c/a/b/a/a/e;->a()Lcom/c/a/b/a/a/g;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/c/a/b/a/a/g;);
a=0;//     iput-object v0, p0, Lcom/c/a/b/a/a/e;->a:Lcom/c/a/b/a/a/g;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/c/a/b/a/a/e;->a:Lcom/c/a/b/a/a/g;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     iput-object v0, p0, Lcom/c/a/b/a/a/e;->b:Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     iget-object v0, p0, Lcom/c/a/b/a/a/e;->a:Lcom/c/a/b/a/a/g;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/c/a/b/a/a/g;->a:Ljava/lang/Object;
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method private b()V
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lcom/c/a/b/a/a/e;->c:Lcom/c/a/b/a/a/d;
a=0;// 
a=0;//     #v1=(Reference,Lcom/c/a/b/a/a/d;);
a=0;//     iget-object v3, v1, Lcom/c/a/b/a/a/d;->c:Ljava/util/concurrent/locks/ReentrantLock;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/concurrent/locks/ReentrantLock;);
a=0;//     invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/c/a/b/a/a/e;->a:Lcom/c/a/b/a/a/g;
a=0;// 
a=0;//     move-object v2, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Reference,Lcom/c/a/b/a/a/g;);v4=(Conflicted);
a=0;//     invoke-virtual {p0, v2}, Lcom/c/a/b/a/a/e;->a(Lcom/c/a/b/a/a/g;)Lcom/c/a/b/a/a/g;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     iput-object v1, p0, Lcom/c/a/b/a/a/e;->a:Lcom/c/a/b/a/a/g;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/c/a/b/a/a/e;->a:Lcom/c/a/b/a/a/g;
a=0;// 
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     iput-object v0, p0, Lcom/c/a/b/a/a/e;->b:Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     #v0=(Null);
a=0;//     iget-object v4, v1, Lcom/c/a/b/a/a/g;->a:Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     if-ne v1, v2, :cond_2
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/c/a/b/a/a/e;->a()Lcom/c/a/b/a/a/g;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     move-object v2, v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v4=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/c/a/b/a/a/e;->a:Lcom/c/a/b/a/a/g;
a=0;// 
a=0;//     #v0=(Reference,Lcom/c/a/b/a/a/g;);
a=0;//     iget-object v0, v0, Lcom/c/a/b/a/a/g;->a:Ljava/lang/Object;
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catchall_0
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method abstract a()Lcom/c/a/b/a/a/g;
a=0;// .end method
a=0;// 
a=0;// .method abstract a(Lcom/c/a/b/a/a/g;)Lcom/c/a/b/a/a/g;
a=0;// .end method
a=0;// 
a=0;// .method public hasNext()Z
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/c/a/b/a/a/e;->a:Lcom/c/a/b/a/a/g;
a=0;// 
a=0;//     #v0=(Reference,Lcom/c/a/b/a/a/g;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/c/a/b/a/a/g;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public next()Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/c/a/b/a/a/e;->a:Lcom/c/a/b/a/a/g;
a=0;// 
a=0;//     #v0=(Reference,Lcom/c/a/b/a/a/g;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/util/NoSuchElementException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/NoSuchElementException;);
a=0;//     invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/NoSuchElementException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/c/a/b/a/a/e;->a:Lcom/c/a/b/a/a/g;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/c/a/b/a/a/e;->d:Lcom/c/a/b/a/a/g;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/c/a/b/a/a/e;->b:Ljava/lang/Object;
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/c/a/b/a/a/e;->b()V
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public remove()V
a=0;//     .locals 3
a=0;// 
a=0;//     iget-object v0, p0, Lcom/c/a/b/a/a/e;->d:Lcom/c/a/b/a/a/g;
a=0;// 
a=0;//     #v0=(Reference,Lcom/c/a/b/a/a/g;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-object v1, p0, Lcom/c/a/b/a/a/e;->d:Lcom/c/a/b/a/a/g;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/c/a/b/a/a/e;->c:Lcom/c/a/b/a/a/d;
a=0;// 
a=0;//     #v1=(Reference,Lcom/c/a/b/a/a/d;);
a=0;//     iget-object v1, v1, Lcom/c/a/b/a/a/d;->c:Ljava/util/concurrent/locks/ReentrantLock;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v2, v0, Lcom/c/a/b/a/a/g;->a:Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/c/a/b/a/a/e;->c:Lcom/c/a/b/a/a/d;
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Lcom/c/a/b/a/a/d;->a(Lcom/c/a/b/a/a/g;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     :cond_1
a=0;//     invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :catchall_0
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
a=0;// 
a=0;//     throw v0
a=0;// .end method
}}
