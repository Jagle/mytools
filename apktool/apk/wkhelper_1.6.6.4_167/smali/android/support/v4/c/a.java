package android.support.v4.c; class a { void a() { int a;
a=0;// .class public Landroid/support/v4/c/a;
a=0;// .super Landroid/support/v4/c/l;
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/util/Map;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field a:Landroid/support/v4/c/f;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/support/v4/c/l;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/c/a;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a()Landroid/support/v4/c/f;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/c/a;->a:Landroid/support/v4/c/f;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/c/f;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Landroid/support/v4/c/b;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/c/b;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v4/c/b;-><init>(Landroid/support/v4/c/a;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/c/b;);
a=0;//     iput-object v0, p0, Landroid/support/v4/c/a;->a:Landroid/support/v4/c/f;
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Landroid/support/v4/c/a;->a:Landroid/support/v4/c/f;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public entrySet()Ljava/util/Set;
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/support/v4/c/a;->a()Landroid/support/v4/c/f;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/c/f;);
a=0;//     iget-object v1, v0, Landroid/support/v4/c/f;->b:Landroid/support/v4/c/h;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/c/h;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     new-instance v1, Landroid/support/v4/c/h;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v4/c/h;);
a=0;//     invoke-direct {v1, v0}, Landroid/support/v4/c/h;-><init>(Landroid/support/v4/c/f;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/c/h;);
a=0;//     iput-object v1, v0, Landroid/support/v4/c/f;->b:Landroid/support/v4/c/h;
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v0, v0, Landroid/support/v4/c/f;->b:Landroid/support/v4/c/h;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public keySet()Ljava/util/Set;
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/support/v4/c/a;->a()Landroid/support/v4/c/f;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/c/f;);
a=0;//     iget-object v1, v0, Landroid/support/v4/c/f;->c:Landroid/support/v4/c/i;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/c/i;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     new-instance v1, Landroid/support/v4/c/i;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v4/c/i;);
a=0;//     invoke-direct {v1, v0}, Landroid/support/v4/c/i;-><init>(Landroid/support/v4/c/f;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/c/i;);
a=0;//     iput-object v1, v0, Landroid/support/v4/c/f;->c:Landroid/support/v4/c/i;
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v0, v0, Landroid/support/v4/c/f;->c:Landroid/support/v4/c/i;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public putAll(Ljava/util/Map;)V
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     iget v0, p0, Landroid/support/v4/c/a;->h:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-interface {p1}, Ljava/util/Map;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/2addr v0, v1
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/c/l;->f:[I
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     array-length v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v1, v0, :cond_1
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/c/l;->f:[I
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     iget-object v2, p0, Landroid/support/v4/c/l;->g:[Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-super {p0, v0}, Landroid/support/v4/c/l;->a(I)V
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/c/l;->h:I
a=0;// 
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/c/l;->f:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     iget v3, p0, Landroid/support/v4/c/l;->h:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v1, v4, v0, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/c/l;->g:[Ljava/lang/Object;
a=0;// 
a=0;//     iget v3, p0, Landroid/support/v4/c/l;->h:I
a=0;// 
a=0;//     shl-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     invoke-static {v2, v4, v0, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     iget v0, p0, Landroid/support/v4/c/l;->h:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v1, v2, v0}, Landroid/support/v4/c/l;->a([I[Ljava/lang/Object;I)V
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/util/Map$Entry;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v2, v0}, Landroid/support/v4/c/a;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public values()Ljava/util/Collection;
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/support/v4/c/a;->a()Landroid/support/v4/c/f;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/c/f;);
a=0;//     iget-object v1, v0, Landroid/support/v4/c/f;->d:Landroid/support/v4/c/k;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/c/k;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     new-instance v1, Landroid/support/v4/c/k;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v4/c/k;);
a=0;//     invoke-direct {v1, v0}, Landroid/support/v4/c/k;-><init>(Landroid/support/v4/c/f;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/c/k;);
a=0;//     iput-object v1, v0, Landroid/support/v4/c/f;->d:Landroid/support/v4/c/k;
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v0, v0, Landroid/support/v4/c/f;->d:Landroid/support/v4/c/k;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
