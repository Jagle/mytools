package a.a; class gb { void a() { int a;
a=0;// .class public final La/a/gb;
a=0;// .super La/a/fp;
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(Ljava/util/BitSet;I)V
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     int-to-double v2, p2
a=0;// 
a=0;//     #v2=(DoubleLo);v3=(DoubleHi);
a=0;//     const-wide/high16 v4, 0x4020000000000000L
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     div-double/2addr v2, v4
a=0;// 
a=0;//     invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     double-to-int v0, v2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     new-array v2, v0, [B
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-virtual {p1}, Ljava/util/BitSet;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lt v0, v3, :cond_0
a=0;// 
a=0;//     array-length v0, v2
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Integer);
a=0;//     if-lt v1, v0, :cond_2
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p1, v0}, Ljava/util/BitSet;->get(I)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     array-length v3, v2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     div-int/lit8 v4, v0, 0x8
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-int/2addr v3, v4
a=0;// 
a=0;//     add-int/lit8 v3, v3, -0x1
a=0;// 
a=0;//     aget-byte v4, v2, v3
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     rem-int/lit8 v6, v0, 0x8
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     shl-int/2addr v5, v6
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     or-int/2addr v4, v5
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-byte v4, v4
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     aput-byte v4, v2, v3
a=0;// 
a=0;//     :cond_1
a=0;//     #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Integer);
a=0;//     aget-byte v3, v2, v1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     invoke-virtual {p0, v3}, La/a/gb;->a(B)V
a=0;// 
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public final b(I)Ljava/util/BitSet;
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     int-to-double v2, p1
a=0;// 
a=0;//     #v2=(DoubleLo);v3=(DoubleHi);
a=0;//     const-wide/high16 v4, 0x4020000000000000L
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     div-double/2addr v2, v4
a=0;// 
a=0;//     invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     double-to-int v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     new-array v3, v2, [B
a=0;// 
a=0;//     #v3=(Reference,[B);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Integer);v4=(Conflicted);
a=0;//     if-lt v1, v2, :cond_0
a=0;// 
a=0;//     new-instance v1, Ljava/util/BitSet;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/BitSet;);
a=0;//     invoke-direct {v1}, Ljava/util/BitSet;-><init>()V
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);v1=(Reference,Ljava/util/BitSet;);v5=(Conflicted);
a=0;//     array-length v2, v3
a=0;// 
a=0;//     mul-int/lit8 v2, v2, 0x8
a=0;// 
a=0;//     if-lt v0, v2, :cond_1
a=0;// 
a=0;//     return-object v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Null);v1=(Integer);v5=(LongHi);
a=0;//     invoke-virtual {p0}, La/a/gb;->k()B
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     aput-byte v4, v3, v1
a=0;// 
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Reference,Ljava/util/BitSet;);v4=(Conflicted);v5=(Conflicted);
a=0;//     array-length v2, v3
a=0;// 
a=0;//     div-int/lit8 v4, v0, 0x8
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-int/2addr v2, v4
a=0;// 
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     aget-byte v2, v3, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     rem-int/lit8 v5, v0, 0x8
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     shl-int/2addr v4, v5
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     and-int/2addr v2, v4
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_2
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/util/BitSet;->set(I)V
a=0;// 
a=0;//     :cond_2
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public final s()Ljava/lang/Class;
a=0;//     .locals 1
a=0;// 
a=0;//     const-class v0, La/a/gf;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     return-object v0
a=0;// .end method
}}
