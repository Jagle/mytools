package a.a; class et { void a() { int a;
a=0;// .class public final La/a/et;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field a:I
a=0;// 
a=0;// .field private b:[S
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,La/a/et;);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, La/a/et;->a:I
a=0;// 
a=0;//     const/16 v0, 0xf
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [S
a=0;// 
a=0;//     #v0=(Reference,[S);
a=0;//     iput-object v0, p0, La/a/et;->b:[S
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a()S
a=0;//     .locals 3
a=0;// 
a=0;//     iget-object v0, p0, La/a/et;->b:[S
a=0;// 
a=0;//     #v0=(Reference,[S);
a=0;//     iget v1, p0, La/a/et;->a:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v2, v1, -0x1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, p0, La/a/et;->a:I
a=0;// 
a=0;//     aget-short v0, v0, v1
a=0;// 
a=0;//     #v0=(Short);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public final a(S)V
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iget-object v0, p0, La/a/et;->b:[S
a=0;// 
a=0;//     #v0=(Reference,[S);
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, La/a/et;->a:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, La/a/et;->b:[S
a=0;// 
a=0;//     #v0=(Reference,[S);
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     mul-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     new-array v0, v0, [S
a=0;// 
a=0;//     #v0=(Reference,[S);
a=0;//     iget-object v1, p0, La/a/et;->b:[S
a=0;// 
a=0;//     #v1=(Reference,[S);
a=0;//     iget-object v2, p0, La/a/et;->b:[S
a=0;// 
a=0;//     #v2=(Reference,[S);
a=0;//     array-length v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v1, v3, v0, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     iput-object v0, p0, La/a/et;->b:[S
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v0, p0, La/a/et;->b:[S
a=0;// 
a=0;//     #v0=(Reference,[S);
a=0;//     iget v1, p0, La/a/et;->a:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     iput v1, p0, La/a/et;->a:I
a=0;// 
a=0;//     aput-short p1, v0, v1
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final toString()Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v0, "<ShortStack vector:["
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Conflicted);
a=0;//     iget-object v2, p0, La/a/et;->b:[S
a=0;// 
a=0;//     #v2=(Reference,[S);
a=0;//     array-length v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lt v0, v2, :cond_0
a=0;// 
a=0;//     const-string v0, "]>"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const-string v2, " "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);
a=0;//     iget v2, p0, La/a/et;->a:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v0, v2, :cond_2
a=0;// 
a=0;//     const-string v2, ">>"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);
a=0;//     iget-object v2, p0, La/a/et;->b:[S
a=0;// 
a=0;//     #v2=(Reference,[S);
a=0;//     aget-short v2, v2, v0
a=0;// 
a=0;//     #v2=(Short);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     iget v2, p0, La/a/et;->a:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v0, v2, :cond_3
a=0;// 
a=0;//     const-string v2, "<<"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_3
a=0;//     #v2=(Conflicted);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
