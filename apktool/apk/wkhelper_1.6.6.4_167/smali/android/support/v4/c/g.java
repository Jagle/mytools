package android.support.v4.c; class g { void a() { int a;
a=0;// .class final Landroid/support/v4/c/g;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/util/Iterator;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final a:I
a=0;// 
a=0;// .field b:I
a=0;// 
a=0;// .field c:I
a=0;// 
a=0;// .field d:Z
a=0;// 
a=0;// .field final synthetic e:Landroid/support/v4/c/f;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/support/v4/c/f;I)V
a=0;//     .locals 1
a=0;// 
a=0;//     iput-object p1, p0, Landroid/support/v4/c/g;->e:Landroid/support/v4/c/f;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/c/g;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/c/g;->d:Z
a=0;// 
a=0;//     iput p2, p0, Landroid/support/v4/c/g;->a:I
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/support/v4/c/f;->a()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v4/c/g;->b:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final hasNext()Z
a=0;//     .locals 2
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/c/g;->c:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Landroid/support/v4/c/g;->b:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v0, v1, :cond_0
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
a=0;// .method public final next()Ljava/lang/Object;
a=0;//     .locals 3
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/c/g;->e:Landroid/support/v4/c/f;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/c/f;);
a=0;//     iget v1, p0, Landroid/support/v4/c/g;->c:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, p0, Landroid/support/v4/c/g;->a:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/support/v4/c/f;->a(II)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v1, p0, Landroid/support/v4/c/g;->c:I
a=0;// 
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     iput v1, p0, Landroid/support/v4/c/g;->c:I
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput-boolean v1, p0, Landroid/support/v4/c/g;->d:Z
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final remove()V
a=0;//     .locals 2
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/c/g;->d:Z
a=0;// 
a=0;//     #v0=(Boolean);
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
a=0;//     #v0=(Boolean);
a=0;//     iget v0, p0, Landroid/support/v4/c/g;->c:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/c/g;->c:I
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/c/g;->b:I
a=0;// 
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/c/g;->b:I
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/c/g;->d:Z
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/c/g;->e:Landroid/support/v4/c/f;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/c/f;);
a=0;//     iget v1, p0, Landroid/support/v4/c/g;->c:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/c/f;->a(I)V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
