package android.support.v4.c; class k { void a() { int a;
a=0;// .class final Landroid/support/v4/c/k;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/util/Collection;
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
a=0;//     iput-object p1, p0, Landroid/support/v4/c/k;->a:Landroid/support/v4/c/f;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/c/k;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final add(Ljava/lang/Object;)Z
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
a=0;// .method public final clear()V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/c/k;->a:Landroid/support/v4/c/f;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/c/f;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/c/f;->c()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final contains(Ljava/lang/Object;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/c/k;->a:Landroid/support/v4/c/f;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/c/f;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v4/c/f;->b(Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ltz v0, :cond_0
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
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/c/k;->contains(Ljava/lang/Object;)Z
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
a=0;// .method public final isEmpty()Z
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/c/k;->a:Landroid/support/v4/c/f;
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
a=0;//     .locals 3
a=0;// 
a=0;//     new-instance v0, Landroid/support/v4/c/g;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/c/g;);
a=0;//     iget-object v1, p0, Landroid/support/v4/c/k;->a:Landroid/support/v4/c/f;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/c/f;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/support/v4/c/g;-><init>(Landroid/support/v4/c/f;I)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/c/g;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final remove(Ljava/lang/Object;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/c/k;->a:Landroid/support/v4/c/f;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/c/f;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v4/c/f;->b(Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ltz v0, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/c/k;->a:Landroid/support/v4/c/f;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/c/f;);
a=0;//     invoke-virtual {v1, v0}, Landroid/support/v4/c/f;->a(I)V
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final removeAll(Ljava/util/Collection;)Z
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Landroid/support/v4/c/k;->a:Landroid/support/v4/c/f;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/c/f;);
a=0;//     invoke-virtual {v1}, Landroid/support/v4/c/f;->a()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Boolean);v4=(Conflicted);
a=0;//     if-ge v0, v3, :cond_1
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v4/c/k;->a:Landroid/support/v4/c/f;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/c/f;);
a=0;//     invoke-virtual {v4, v0, v2}, Landroid/support/v4/c/f;->a(II)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-interface {p1, v4}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/c/k;->a:Landroid/support/v4/c/f;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/c/f;);
a=0;//     invoke-virtual {v1, v0}, Landroid/support/v4/c/f;->a(I)V
a=0;// 
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     add-int/lit8 v1, v3, -0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v3, v1
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Boolean);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v4=(Conflicted);
a=0;//     return v1
a=0;// .end method
a=0;// 
a=0;// .method public final retainAll(Ljava/util/Collection;)Z
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Landroid/support/v4/c/k;->a:Landroid/support/v4/c/f;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/c/f;);
a=0;//     invoke-virtual {v1}, Landroid/support/v4/c/f;->a()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Boolean);v4=(Conflicted);
a=0;//     if-ge v0, v3, :cond_1
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v4/c/k;->a:Landroid/support/v4/c/f;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/c/f;);
a=0;//     invoke-virtual {v4, v0, v2}, Landroid/support/v4/c/f;->a(II)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-interface {p1, v4}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/c/k;->a:Landroid/support/v4/c/f;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/c/f;);
a=0;//     invoke-virtual {v1, v0}, Landroid/support/v4/c/f;->a(I)V
a=0;// 
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     add-int/lit8 v1, v3, -0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v3, v1
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Boolean);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v4=(Conflicted);
a=0;//     return v1
a=0;// .end method
a=0;// 
a=0;// .method public final size()I
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/c/k;->a:Landroid/support/v4/c/f;
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
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/c/k;->a:Landroid/support/v4/c/f;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/c/f;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/c/f;->b(I)[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final toArray([Ljava/lang/Object;)[Ljava/lang/Object;
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/c/k;->a:Landroid/support/v4/c/f;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/c/f;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, p1, v1}, Landroid/support/v4/c/f;->a([Ljava/lang/Object;I)[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
