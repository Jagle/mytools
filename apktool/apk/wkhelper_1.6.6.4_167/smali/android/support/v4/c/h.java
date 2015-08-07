package android.support.v4.c; class h { void a() { int a;
a=0;// .class final Landroid/support/v4/c/h;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/util/Set;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Landroid/support/v4/c/f;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/support/v4/c/f;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Landroid/support/v4/c/h;->a:Landroid/support/v4/c/f;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/c/h;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final synthetic add(Ljava/lang/Object;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     new-instance v0, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public final addAll(Ljava/util/Collection;)Z
a=0;//     .locals 5
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/c/h;->a:Landroid/support/v4/c/f;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/c/f;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/c/f;->a()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Reference,Ljava/util/Iterator;);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/util/Map$Entry;
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/c/h;->a:Landroid/support/v4/c/f;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/c/f;);
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v3, v4, v0}, Landroid/support/v4/c/f;->a(Ljava/lang/Object;Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/c/h;->a:Landroid/support/v4/c/f;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/c/f;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/c/f;->a()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eq v1, v0, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public final clear()V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/c/h;->a:Landroid/support/v4/c/f;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/c/f;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/c/f;->c()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final contains(Ljava/lang/Object;)Z
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     instance-of v1, p1, Ljava/util/Map$Entry;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Boolean);v2=(Uninit);
a=0;//     check-cast p1, Ljava/util/Map$Entry;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/c/h;->a:Landroid/support/v4/c/f;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/c/f;);
a=0;//     invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v1, v2}, Landroid/support/v4/c/f;->a(Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ltz v1, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/c/h;->a:Landroid/support/v4/c/f;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/c/f;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/support/v4/c/f;->a(II)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Landroid/support/v4/c/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final containsAll(Ljava/util/Collection;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/util/Iterator;);v1=(Conflicted);
a=0;//     invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/c/h;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Reference,Ljava/util/Iterator;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final equals(Ljava/lang/Object;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-static {p0, p1}, Landroid/support/v4/c/f;->a(Ljava/util/Set;Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public final hashCode()I
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget-object v0, p0, Landroid/support/v4/c/h;->a:Landroid/support/v4/c/f;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/c/f;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/c/f;->a()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     move v3, v0
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v4, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v4=(Integer);v5=(Conflicted);
a=0;//     if-ltz v3, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/c/h;->a:Landroid/support/v4/c/f;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/c/f;);
a=0;//     invoke-virtual {v0, v3, v1}, Landroid/support/v4/c/f;->a(II)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v4/c/h;->a:Landroid/support/v4/c/f;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/c/f;);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     invoke-virtual {v2, v3, v5}, Landroid/support/v4/c/f;->a(II)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     move v2, v1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(Integer);
a=0;//     if-nez v5, :cond_1
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Integer);
a=0;//     xor-int/2addr v0, v2
a=0;// 
a=0;//     add-int v2, v4, v0
a=0;// 
a=0;//     add-int/lit8 v0, v3, -0x1
a=0;// 
a=0;//     move v3, v0
a=0;// 
a=0;//     move v4, v2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/lang/Object;);v2=(Reference,Landroid/support/v4/c/f;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v2, v0
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {v5}, Ljava/lang/Object;->hashCode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);v5=(Conflicted);
a=0;//     return v4
a=0;// .end method
a=0;// 
a=0;// .method public final isEmpty()Z
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/c/h;->a:Landroid/support/v4/c/f;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/c/f;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/c/f;->a()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final iterator()Ljava/util/Iterator;
a=0;//     .locals 2
a=0;// 
a=0;//     new-instance v0, Landroid/support/v4/c/j;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/c/j;);
a=0;//     iget-object v1, p0, Landroid/support/v4/c/h;->a:Landroid/support/v4/c/f;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/c/f;);
a=0;//     invoke-direct {v0, v1}, Landroid/support/v4/c/j;-><init>(Landroid/support/v4/c/f;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/c/j;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final remove(Ljava/lang/Object;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     new-instance v0, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public final removeAll(Ljava/util/Collection;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     new-instance v0, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public final retainAll(Ljava/util/Collection;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     new-instance v0, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public final size()I
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/c/h;->a:Landroid/support/v4/c/f;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/c/f;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/c/f;->a()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public final toArray()[Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     new-instance v0, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public final toArray([Ljava/lang/Object;)[Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     new-instance v0, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v0
a=0;// .end method
}}
